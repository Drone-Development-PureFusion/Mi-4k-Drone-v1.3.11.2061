package org.p286a.p287a.p305h;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.h.g */
/* loaded from: classes.dex */
public class C11145g implements HttpEntity {

    /* renamed from: a */
    protected HttpEntity f35847a;

    public C11145g(HttpEntity httpEntity) {
        this.f35847a = (HttpEntity) C11354a.m1321a(httpEntity, "Wrapped entity");
    }

    @Deprecated
    public void consumeContent() {
        this.f35847a.consumeContent();
    }

    public InputStream getContent() {
        return this.f35847a.getContent();
    }

    public Header getContentEncoding() {
        return this.f35847a.getContentEncoding();
    }

    public long getContentLength() {
        return this.f35847a.getContentLength();
    }

    public Header getContentType() {
        return this.f35847a.getContentType();
    }

    public boolean isChunked() {
        return this.f35847a.isChunked();
    }

    public boolean isRepeatable() {
        return this.f35847a.isRepeatable();
    }

    public boolean isStreaming() {
        return this.f35847a.isStreaming();
    }

    public void writeTo(OutputStream outputStream) {
        this.f35847a.writeTo(outputStream);
    }
}
