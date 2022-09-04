package org.p286a.p287a.p305h;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11357d;
@AbstractC11009c
/* renamed from: org.a.a.h.c */
/* loaded from: classes2.dex */
public class C11141c extends C11145g {

    /* renamed from: b */
    private final byte[] f35824b;

    public C11141c(HttpEntity httpEntity) {
        super(httpEntity);
        if (!httpEntity.isRepeatable() || httpEntity.getContentLength() < 0) {
            this.f35824b = C11357d.m1302c(httpEntity);
        } else {
            this.f35824b = null;
        }
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public InputStream getContent() {
        return this.f35824b != null ? new ByteArrayInputStream(this.f35824b) : super.getContent();
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public long getContentLength() {
        return this.f35824b != null ? this.f35824b.length : super.getContentLength();
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public boolean isChunked() {
        return this.f35824b == null && super.isChunked();
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public boolean isRepeatable() {
        return true;
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public boolean isStreaming() {
        return this.f35824b == null && super.isStreaming();
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public void writeTo(OutputStream outputStream) {
        C11354a.m1321a(outputStream, "Output stream");
        if (this.f35824b != null) {
            outputStream.write(this.f35824b);
        } else {
            super.writeTo(outputStream);
        }
    }
}
