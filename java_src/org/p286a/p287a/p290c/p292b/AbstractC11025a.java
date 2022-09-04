package org.p286a.p287a.p290c.p292b;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.p286a.p287a.p305h.C11145g;
import org.p286a.p287a.p320o.C11354a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.a.a.c.b.a */
/* loaded from: classes2.dex */
public abstract class AbstractC11025a extends C11145g {

    /* renamed from: b */
    private static final int f35558b = 2048;

    /* renamed from: c */
    private InputStream f35559c;

    public AbstractC11025a(HttpEntity httpEntity) {
        super(httpEntity);
    }

    /* renamed from: a */
    private InputStream m2261a() {
        return new C11032g(this.f35847a.getContent(), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract InputStream mo2235a(InputStream inputStream);

    @Override // org.p286a.p287a.p305h.C11145g
    public InputStream getContent() {
        if (this.f35847a.isStreaming()) {
            if (this.f35559c == null) {
                this.f35559c = m2261a();
            }
            return this.f35559c;
        }
        return m2261a();
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public void writeTo(OutputStream outputStream) {
        C11354a.m1321a(outputStream, "Output stream");
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[2048];
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
