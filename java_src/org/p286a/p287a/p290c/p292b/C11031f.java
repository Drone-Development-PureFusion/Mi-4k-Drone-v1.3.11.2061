package org.p286a.p287a.p290c.p292b;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
/* renamed from: org.a.a.c.b.f */
/* loaded from: classes2.dex */
public class C11031f extends AbstractC11025a {
    public C11031f(HttpEntity httpEntity) {
        super(httpEntity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.p286a.p287a.p290c.p292b.AbstractC11025a
    /* renamed from: a */
    public InputStream mo2235a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }

    @Override // org.p286a.p287a.p290c.p292b.AbstractC11025a, org.p286a.p287a.p305h.C11145g
    public /* bridge */ /* synthetic */ InputStream getContent() {
        return super.getContent();
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public Header getContentEncoding() {
        return null;
    }

    @Override // org.p286a.p287a.p305h.C11145g
    public long getContentLength() {
        return -1L;
    }

    @Override // org.p286a.p287a.p290c.p292b.AbstractC11025a, org.p286a.p287a.p305h.C11145g
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) {
        super.writeTo(outputStream);
    }
}
