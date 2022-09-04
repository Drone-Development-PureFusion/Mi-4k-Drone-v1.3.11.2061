package org.p286a.p287a.p290c.p295e;

import java.util.Collection;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.c.e.f */
/* loaded from: classes2.dex */
public class C11065f implements HttpRequestInterceptor {

    /* renamed from: a */
    private final Collection<? extends Header> f35625a;

    public C11065f() {
        this(null);
    }

    public C11065f(Collection<? extends Header> collection) {
        this.f35625a = collection;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        C11354a.m1321a(httpRequest, "HTTP request");
        if (httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            return;
        }
        Collection<? extends Header> collection = (Collection) httpRequest.getParams().getParameter("http.default-headers");
        if (collection == null) {
            collection = this.f35625a;
        }
        if (collection == null) {
            return;
        }
        for (Header header : collection) {
            httpRequest.addHeader(header);
        }
    }
}
