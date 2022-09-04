package org.p286a.p287a.p290c.p295e;

import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.SetCookie2;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.p291a.C11021b;
import org.p286a.p287a.p298e.AbstractC11089b;
import org.p286a.p287a.p304g.AbstractC11138b;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11359f;
@AbstractC11008b
/* renamed from: org.a.a.c.e.c */
/* loaded from: classes2.dex */
public class C11062c implements HttpRequestInterceptor {

    /* renamed from: a */
    private static final String f35621a = "HttpClient";

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        URI uri;
        Header versionHeader;
        boolean z = false;
        C11354a.m1321a(httpRequest, "HTTP request");
        C11354a.m1321a(httpContext, "HTTP context");
        if (httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            return;
        }
        C11060a m2176a = C11060a.m2176a(httpContext);
        CookieStore m2171d = m2176a.m2171d();
        if (m2171d == null) {
            if (!Log.isLoggable(f35621a, 3)) {
                return;
            }
            Log.d(f35621a, "Cookie store not specified in HTTP context");
            return;
        }
        AbstractC11089b<AbstractC11138b> m2168g = m2176a.m2168g();
        if (m2168g == null) {
            if (!Log.isLoggable(f35621a, 3)) {
                return;
            }
            Log.d(f35621a, "CookieSpec registry not specified in HTTP context");
            return;
        }
        HttpHost t = m2176a.t();
        if (t == null) {
            if (!Log.isLoggable(f35621a, 3)) {
                return;
            }
            Log.d(f35621a, "Target host not set in the context");
            return;
        }
        RouteInfo m2175b = m2176a.m2175b();
        if (m2175b == null) {
            if (!Log.isLoggable(f35621a, 3)) {
                return;
            }
            Log.d(f35621a, "Connection route not set in the context");
            return;
        }
        String m2290e = m2176a.m2161n().m2290e();
        String str = m2290e == null ? C11021b.f35525d : m2290e;
        if (Log.isLoggable(f35621a, 3)) {
            Log.d(f35621a, "CookieSpec selected: " + str);
        }
        if (httpRequest instanceof HttpUriRequest) {
            uri = ((HttpUriRequest) httpRequest).getURI();
        } else {
            try {
                uri = new URI(httpRequest.getRequestLine().getUri());
            } catch (URISyntaxException e) {
                uri = null;
            }
        }
        String path = uri != null ? uri.getPath() : null;
        String hostName = t.getHostName();
        int port = t.getPort();
        if (port < 0) {
            port = m2175b.getTargetHost().getPort();
        }
        if (port < 0) {
            port = 0;
        }
        if (C11359f.m1297a(path)) {
            path = "/";
        }
        CookieOrigin cookieOrigin = new CookieOrigin(hostName, port, path, m2175b.isSecure());
        AbstractC11138b mo2043a = m2168g.mo2043a(str);
        if (mo2043a == null) {
            throw new HttpException("Unsupported cookie policy: " + str);
        }
        CookieSpec mo1538a = mo2043a.mo1538a(m2176a);
        ArrayList<Cookie> arrayList = new ArrayList(m2171d.getCookies());
        ArrayList<Cookie> arrayList2 = new ArrayList();
        Date date = new Date();
        for (Cookie cookie : arrayList) {
            if (!cookie.isExpired(date)) {
                if (mo1538a.match(cookie, cookieOrigin)) {
                    if (Log.isLoggable(f35621a, 3)) {
                        Log.d(f35621a, "Cookie " + cookie + " match " + cookieOrigin);
                    }
                    arrayList2.add(cookie);
                }
            } else if (Log.isLoggable(f35621a, 3)) {
                Log.d(f35621a, "Cookie " + cookie + " expired");
            }
        }
        if (!arrayList2.isEmpty()) {
            for (Header header : mo1538a.formatCookies(arrayList2)) {
                httpRequest.addHeader(header);
            }
        }
        int version = mo1538a.getVersion();
        if (version > 0) {
            for (Cookie cookie2 : arrayList2) {
                if (version != cookie2.getVersion() || !(cookie2 instanceof SetCookie2)) {
                    z = true;
                }
            }
            if (z && (versionHeader = mo1538a.getVersionHeader()) != null) {
                httpRequest.addHeader(versionHeader);
            }
        }
        httpContext.setAttribute(C11060a.f35611d, mo1538a);
        httpContext.setAttribute(C11060a.f35612e, cookieOrigin);
    }
}
