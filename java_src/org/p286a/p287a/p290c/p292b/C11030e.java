package org.p286a.p287a.p290c.p292b;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;
import org.p286a.p287a.p305h.C11145g;
import org.p286a.p287a.p320o.C11354a;
/* renamed from: org.a.a.c.b.e */
/* loaded from: classes2.dex */
public class C11030e extends C11145g {

    /* renamed from: b */
    private static final String f35572b = "gzip";

    public C11030e(HttpEntity httpEntity) {
        super(httpEntity);
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public InputStream getContent() {
        throw new UnsupportedOperationException();
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public Header getContentEncoding() {
        return new BasicHeader("Content-Encoding", "gzip");
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public long getContentLength() {
        return -1L;
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public boolean isChunked() {
        return true;
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public void writeTo(OutputStream outputStream) {
        C11354a.m1321a(outputStream, "Output stream");
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        this.f35847a.writeTo(gZIPOutputStream);
        gZIPOutputStream.close();
    }
}
