package org.p286a.p287a.p306i.p312f;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.p286a.p287a.p288a.AbstractC11009c;
import p005b.p006a.p007a.p029b.C0494h;
@AbstractC11009c
/* renamed from: org.a.a.i.f.j */
/* loaded from: classes.dex */
class C11289j implements HttpEntity {

    /* renamed from: a */
    private final HttpEntity f36268a;

    /* renamed from: b */
    private boolean f36269b = false;

    C11289j(HttpEntity httpEntity) {
        this.f36268a = httpEntity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1517a(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        HttpEntity entity = httpEntityEnclosingRequest.getEntity();
        if (entity == null || entity.isRepeatable() || m1518a(entity)) {
            return;
        }
        httpEntityEnclosingRequest.setEntity(new C11289j(entity));
    }

    /* renamed from: a */
    static boolean m1518a(HttpEntity httpEntity) {
        return httpEntity instanceof C11289j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m1516a(HttpRequest httpRequest) {
        HttpEntity entity;
        if (!(httpRequest instanceof HttpEntityEnclosingRequest) || (entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity()) == null) {
            return true;
        }
        if (m1518a(entity) && !((C11289j) entity).m1515b()) {
            return true;
        }
        return entity.isRepeatable();
    }

    /* renamed from: a */
    public HttpEntity m1519a() {
        return this.f36268a;
    }

    /* renamed from: b */
    public boolean m1515b() {
        return this.f36269b;
    }

    @Deprecated
    public void consumeContent() {
        this.f36269b = true;
        this.f36268a.consumeContent();
    }

    public InputStream getContent() {
        return this.f36268a.getContent();
    }

    public Header getContentEncoding() {
        return this.f36268a.getContentEncoding();
    }

    public long getContentLength() {
        return this.f36268a.getContentLength();
    }

    public Header getContentType() {
        return this.f36268a.getContentType();
    }

    public boolean isChunked() {
        return this.f36268a.isChunked();
    }

    public boolean isRepeatable() {
        return this.f36268a.isRepeatable();
    }

    public boolean isStreaming() {
        return this.f36268a.isStreaming();
    }

    public String toString() {
        return "RequestEntityProxy{" + this.f36268a + C0494h.f735w;
    }

    public void writeTo(OutputStream outputStream) {
        this.f36269b = true;
        this.f36268a.writeTo(outputStream);
    }
}
