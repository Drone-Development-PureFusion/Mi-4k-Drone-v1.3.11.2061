package org.p286a.p287a.p290c.p295e;

import android.util.Log;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.c.e.e */
/* loaded from: classes2.dex */
public class C11064e implements HttpRequestInterceptor {

    /* renamed from: a */
    private static final String f35623a = "HttpClient";

    /* renamed from: b */
    private static final String f35624b = "Proxy-Connection";

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        C11354a.m1321a(httpRequest, "HTTP request");
        if (httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            httpRequest.setHeader(f35624b, "Keep-Alive");
            return;
        }
        RouteInfo m2175b = C11060a.m2176a(httpContext).m2175b();
        if (m2175b == null) {
            if (!Log.isLoggable(f35623a, 3)) {
                return;
            }
            Log.d(f35623a, "Connection route not set in the context");
            return;
        }
        if ((m2175b.getHopCount() == 1 || m2175b.isTunnelled()) && !httpRequest.containsHeader(C11086e.f35717j)) {
            httpRequest.addHeader(C11086e.f35717j, "Keep-Alive");
        }
        if (m2175b.getHopCount() != 2 || m2175b.isTunnelled() || httpRequest.containsHeader(f35624b)) {
            return;
        }
        httpRequest.addHeader(f35624b, "Keep-Alive");
    }
}
