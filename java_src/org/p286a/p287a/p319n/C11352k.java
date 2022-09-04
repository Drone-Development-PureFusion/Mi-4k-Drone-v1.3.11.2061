package org.p286a.p287a.p319n;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.n.k */
/* loaded from: classes2.dex */
public class C11352k implements HttpRequestInterceptor {

    /* renamed from: a */
    private final String f36437a;

    public C11352k() {
        this(null);
    }

    public C11352k(String str) {
        this.f36437a = str;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        C11354a.m1321a(httpRequest, "HTTP request");
        if (!httpRequest.containsHeader(C11086e.f35703Y)) {
            String str = null;
            HttpParams params = httpRequest.getParams();
            if (params != null) {
                str = (String) params.getParameter("http.useragent");
            }
            if (str == null) {
                str = this.f36437a;
            }
            if (str == null) {
                return;
            }
            httpRequest.addHeader(C11086e.f35703Y, str);
        }
    }
}
