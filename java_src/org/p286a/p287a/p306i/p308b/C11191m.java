package org.p286a.p287a.p306i.p308b;

import android.util.Log;
import com.google.firebase.p251a.C9654a;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.AbstractC11059e;
import org.p286a.p287a.p290c.p291a.C11022c;
import org.p286a.p287a.p290c.p293c.C11043g;
import org.p286a.p287a.p290c.p293c.C11044h;
import org.p286a.p287a.p290c.p293c.C11054p;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p290c.p296f.C11079h;
import org.p286a.p287a.p290c.p296f.C11080i;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11355b;
import org.p286a.p287a.p320o.C11359f;
@AbstractC11008b
/* renamed from: org.a.a.i.b.m */
/* loaded from: classes.dex */
public class C11191m implements AbstractC11059e {
    @Deprecated

    /* renamed from: a */
    public static final String f36000a = "http.protocol.redirect-locations";

    /* renamed from: c */
    private static final String f36002c = "HttpClient";

    /* renamed from: b */
    public static final C11191m f36001b = new C11191m();

    /* renamed from: d */
    private static final String[] f36003d = {"GET", C11044h.f35585a};

    /* renamed from: a */
    protected URI m1757a(String str) {
        try {
            C11079h c11079h = new C11079h(new URI(str).normalize());
            String m2114h = c11079h.m2114h();
            if (m2114h != null) {
                c11079h.m2125c(m2114h.toLowerCase(Locale.ENGLISH));
            }
            if (C11359f.m1297a(c11079h.m2110j())) {
                c11079h.m2121d("/");
            }
            return c11079h.m2138a();
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid redirect URI: " + str, e);
        }
    }

    @Override // org.p286a.p287a.p290c.AbstractC11059e
    /* renamed from: a */
    public boolean mo1756a(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        C11354a.m1321a(httpRequest, "HTTP request");
        C11354a.m1321a(httpResponse, "HTTP response");
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String method = httpRequest.getRequestLine().getMethod();
        Header firstHeader = httpResponse.getFirstHeader(C9654a.C9656b.f30231p);
        switch (statusCode) {
            case 301:
            case 307:
                return mo1663b(method);
            case 302:
                return mo1663b(method) && firstHeader != null;
            case 303:
                return true;
            case 304:
            case 305:
            case 306:
            default:
                return false;
        }
    }

    @Override // org.p286a.p287a.p290c.AbstractC11059e
    /* renamed from: b */
    public HttpUriRequest mo1755b(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        URI m1754c = m1754c(httpRequest, httpResponse, httpContext);
        String method = httpRequest.getRequestLine().getMethod();
        if (method.equalsIgnoreCase(C11044h.f35585a)) {
            return new C11044h(m1754c);
        }
        if (!method.equalsIgnoreCase("GET") && httpResponse.getStatusLine().getStatusCode() == 307) {
            return C11054p.m2212a(httpRequest).m2216a(m1754c).m2186n();
        }
        return new C11043g(m1754c);
    }

    /* renamed from: b */
    protected boolean mo1663b(String str) {
        for (String str2 : f36003d) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public URI m1754c(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        URI uri;
        C11354a.m1321a(httpRequest, "HTTP request");
        C11354a.m1321a(httpResponse, "HTTP response");
        C11354a.m1321a(httpContext, "HTTP context");
        C11060a m2176a = C11060a.m2176a(httpContext);
        Header firstHeader = httpResponse.getFirstHeader(C9654a.C9656b.f30231p);
        if (firstHeader == null) {
            throw new ProtocolException("Received redirect response " + httpResponse.getStatusLine() + " but no location header");
        }
        String value = firstHeader.getValue();
        if (Log.isLoggable(f36002c, 3)) {
            Log.d(f36002c, "Redirect requested to location '" + value + "'");
        }
        C11022c m2161n = m2176a.m2161n();
        URI m1757a = m1757a(value);
        try {
            if (m1757a.isAbsolute()) {
                uri = m1757a;
            } else if (!m2161n.m2288g()) {
                throw new ProtocolException("Relative redirect location '" + m1757a + "' not allowed");
            } else {
                HttpHost t = m2176a.t();
                C11355b.m1313a(t, "Target host");
                uri = C11080i.m2101a(C11080i.m2098a(new URI(httpRequest.getRequestLine().getUri()), t, false), m1757a);
            }
            C11175ad c11175ad = (C11175ad) m2176a.getAttribute("http.protocol.redirect-locations");
            if (c11175ad == null) {
                c11175ad = new C11175ad();
                httpContext.setAttribute("http.protocol.redirect-locations", c11175ad);
            }
            if (!m2161n.m2287h() && c11175ad.m1792a(uri)) {
                throw new CircularRedirectException("Circular redirect to '" + uri + "'");
            }
            c11175ad.m1790b(uri);
            return uri;
        } catch (URISyntaxException e) {
            throw new ProtocolException(e.getMessage(), e);
        }
    }
}
