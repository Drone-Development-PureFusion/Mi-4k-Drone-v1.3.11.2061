package org.p286a.p287a.p290c.p293c;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p290c.p296f.C11070a;
@AbstractC11009c
/* renamed from: org.a.a.c.c.e */
/* loaded from: classes2.dex */
public abstract class AbstractC11041e extends AbstractC11049m implements HttpEntityEnclosingRequest {

    /* renamed from: a */
    private HttpEntity f35583a;

    @Override // org.p286a.p287a.p290c.p293c.AbstractC11035a
    public Object clone() {
        AbstractC11041e abstractC11041e = (AbstractC11041e) super.clone();
        if (this.f35583a != null) {
            abstractC11041e.f35583a = (HttpEntity) C11070a.m2157a(this.f35583a);
        }
        return abstractC11041e;
    }

    public boolean expectContinue() {
        Header firstHeader = getFirstHeader(C11086e.f35730w);
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
    }

    public HttpEntity getEntity() {
        return this.f35583a;
    }

    public void setEntity(HttpEntity httpEntity) {
        this.f35583a = httpEntity;
    }
}
