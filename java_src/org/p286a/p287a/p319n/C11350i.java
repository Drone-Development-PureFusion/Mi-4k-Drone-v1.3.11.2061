package org.p286a.p287a.p319n;

import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpDateGenerator;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11010d
/* renamed from: org.a.a.n.i */
/* loaded from: classes2.dex */
public class C11350i implements HttpRequestInterceptor {

    /* renamed from: a */
    private static final HttpDateGenerator f36436a = new HttpDateGenerator();

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        C11354a.m1321a(httpRequest, "HTTP request");
        if (!(httpRequest instanceof HttpEntityEnclosingRequest) || httpRequest.containsHeader("Date")) {
            return;
        }
        httpRequest.setHeader("Date", f36436a.getCurrentDate());
    }
}
