package org.p286a.p287a.p290c.p295e;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.c.e.g */
/* loaded from: classes2.dex */
public class C11066g implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        C11354a.m1321a(httpRequest, "HTTP request");
        if (httpRequest.containsHeader(C11086e.f35730w) || !(httpRequest instanceof HttpEntityEnclosingRequest)) {
            return;
        }
        ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
        HttpEntity entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
        if (entity == null || entity.getContentLength() == 0 || protocolVersion.lessEquals(HttpVersion.HTTP_1_0) || !C11060a.m2176a(httpContext).m2161n().m2295a()) {
            return;
        }
        httpRequest.addHeader(C11086e.f35730w, "100-continue");
    }
}
