package org.p286a.p287a.p305h;

import java.io.InputStream;
import java.io.OutputStream;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11355b;
@AbstractC11009c
/* renamed from: org.a.a.h.b */
/* loaded from: classes2.dex */
public class C11140b extends AbstractC11139a {

    /* renamed from: e */
    private InputStream f35822e;

    /* renamed from: f */
    private long f35823f = -1;

    /* renamed from: a */
    public void m1949a(long j) {
        this.f35823f = j;
    }

    /* renamed from: a */
    public void m1948a(InputStream inputStream) {
        this.f35822e = inputStream;
    }

    public InputStream getContent() {
        C11355b.m1312a(this.f35822e != null, "Content has not been provided");
        return this.f35822e;
    }

    public long getContentLength() {
        return this.f35823f;
    }

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return this.f35822e != null;
    }

    public void writeTo(OutputStream outputStream) {
        C11354a.m1321a(outputStream, "Output stream");
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } finally {
            content.close();
        }
    }
}
