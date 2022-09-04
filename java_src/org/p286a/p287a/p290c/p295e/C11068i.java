package org.p286a.p287a.p290c.p295e;

import android.util.Log;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.c.e.i */
/* loaded from: classes2.dex */
public class C11068i implements HttpResponseInterceptor {

    /* renamed from: a */
    private static final String f35627a = "HttpClient";

    /* renamed from: a */
    private static String m2158a(Cookie cookie) {
        StringBuilder sb = new StringBuilder();
        sb.append(cookie.getName());
        sb.append("=\"");
        String value = cookie.getValue();
        if (value.length() > 100) {
            value = value.substring(0, 100) + "...";
        }
        sb.append(value);
        sb.append("\"");
        sb.append(", version:");
        sb.append(Integer.toString(cookie.getVersion()));
        sb.append(", domain:");
        sb.append(cookie.getDomain());
        sb.append(", path:");
        sb.append(cookie.getPath());
        sb.append(", expiry:");
        sb.append(cookie.getExpiryDate());
        return sb.toString();
    }

    /* renamed from: a */
    private void m2159a(HeaderIterator headerIterator, CookieSpec cookieSpec, CookieOrigin cookieOrigin, CookieStore cookieStore) {
        while (headerIterator.hasNext()) {
            Header nextHeader = headerIterator.nextHeader();
            try {
                for (Cookie cookie : cookieSpec.parse(nextHeader, cookieOrigin)) {
                    try {
                        cookieSpec.validate(cookie, cookieOrigin);
                        cookieStore.addCookie(cookie);
                        if (Log.isLoggable(f35627a, 3)) {
                            Log.d(f35627a, "Cookie accepted [" + m2158a(cookie) + "]");
                        }
                    } catch (MalformedCookieException e) {
                        if (Log.isLoggable(f35627a, 5)) {
                            Log.w(f35627a, "Cookie rejected [" + m2158a(cookie) + "] " + e.getMessage());
                        }
                    }
                }
            } catch (MalformedCookieException e2) {
                if (Log.isLoggable(f35627a, 5)) {
                    Log.w(f35627a, "Invalid cookie header: \"" + nextHeader + "\". " + e2.getMessage());
                }
            }
        }
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        C11354a.m1321a(httpResponse, "HTTP request");
        C11354a.m1321a(httpContext, "HTTP context");
        C11060a m2176a = C11060a.m2176a(httpContext);
        CookieSpec m2170e = m2176a.m2170e();
        if (m2170e == null) {
            if (!Log.isLoggable(f35627a, 3)) {
                return;
            }
            Log.d(f35627a, "Cookie spec not specified in HTTP context");
            return;
        }
        CookieStore m2171d = m2176a.m2171d();
        if (m2171d == null) {
            if (!Log.isLoggable(f35627a, 3)) {
                return;
            }
            Log.d(f35627a, "Cookie store not specified in HTTP context");
            return;
        }
        CookieOrigin m2169f = m2176a.m2169f();
        if (m2169f == null) {
            if (!Log.isLoggable(f35627a, 3)) {
                return;
            }
            Log.d(f35627a, "Cookie origin not specified in HTTP context");
            return;
        }
        m2159a(httpResponse.headerIterator("Set-Cookie"), m2170e, m2169f, m2171d);
        if (m2170e.getVersion() <= 0) {
            return;
        }
        m2159a(httpResponse.headerIterator("Set-Cookie2"), m2170e, m2169f, m2171d);
    }
}
