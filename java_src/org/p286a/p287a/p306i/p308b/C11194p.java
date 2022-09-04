package org.p286a.p287a.p306i.p308b;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.impl.client.RequestWrapper;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p305h.C11145g;
@AbstractC11009c
@Deprecated
/* renamed from: org.a.a.i.b.p */
/* loaded from: classes.dex */
public class C11194p extends RequestWrapper implements HttpEntityEnclosingRequest {

    /* renamed from: a */
    private HttpEntity f36007a;

    /* renamed from: b */
    private boolean f36008b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.a.a.i.b.p$a */
    /* loaded from: classes2.dex */
    public class C11195a extends C11145g {
        C11195a(HttpEntity httpEntity) {
            super(httpEntity);
        }

        @Override // org.p286a.p287a.p305h.C11145g
        public void consumeContent() {
            C11194p.this.f36008b = true;
            super.consumeContent();
        }

        @Override // org.p286a.p287a.p305h.C11145g
        public InputStream getContent() {
            C11194p.this.f36008b = true;
            return super.getContent();
        }

        @Override // org.p286a.p287a.p305h.C11145g
        public void writeTo(OutputStream outputStream) {
            C11194p.this.f36008b = true;
            super.writeTo(outputStream);
        }
    }

    public C11194p(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        super(httpEntityEnclosingRequest);
        setEntity(httpEntityEnclosingRequest.getEntity());
    }

    public boolean expectContinue() {
        Header firstHeader = getFirstHeader(C11086e.f35730w);
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
    }

    public HttpEntity getEntity() {
        return this.f36007a;
    }

    public boolean isRepeatable() {
        return this.f36007a == null || this.f36007a.isRepeatable() || !this.f36008b;
    }

    public void setEntity(HttpEntity httpEntity) {
        this.f36007a = httpEntity != null ? new C11195a(httpEntity) : null;
        this.f36008b = false;
    }
}
