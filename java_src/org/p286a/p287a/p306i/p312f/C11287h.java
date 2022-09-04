package org.p286a.p287a.p306i.p312f;

import android.util.Log;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthScheme;
import org.apache.http.client.RedirectException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p289b.C11015d;
import org.p286a.p287a.p290c.AbstractC11059e;
import org.p286a.p287a.p290c.p291a.C11022c;
import org.p286a.p287a.p290c.p293c.AbstractC11038b;
import org.p286a.p287a.p290c.p293c.AbstractC11042f;
import org.p286a.p287a.p290c.p293c.C11050n;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p290c.p296f.C11080i;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11357d;
@AbstractC11010d
/* renamed from: org.a.a.i.f.h */
/* loaded from: classes2.dex */
public class C11287h implements AbstractC11281b {

    /* renamed from: a */
    private static final String f36264a = "HttpClient";

    /* renamed from: b */
    private final AbstractC11281b f36265b;

    /* renamed from: c */
    private final AbstractC11059e f36266c;

    /* renamed from: d */
    private final HttpRoutePlanner f36267d;

    public C11287h(AbstractC11281b abstractC11281b, HttpRoutePlanner httpRoutePlanner, AbstractC11059e abstractC11059e) {
        C11354a.m1321a(abstractC11281b, "HTTP client request executor");
        C11354a.m1321a(httpRoutePlanner, "HTTP route planner");
        C11354a.m1321a(abstractC11059e, "HTTP redirect strategy");
        this.f36265b = abstractC11281b;
        this.f36267d = httpRoutePlanner;
        this.f36266c = abstractC11059e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0167, code lost:
        return r6;
     */
    @Override // org.p286a.p287a.p306i.p312f.AbstractC11281b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC11038b mo1511a(HttpRoute httpRoute, C11050n c11050n, C11060a c11060a, AbstractC11042f abstractC11042f) {
        AuthScheme m2302c;
        C11354a.m1321a(httpRoute, "HTTP route");
        C11354a.m1321a(c11050n, "HTTP request");
        C11354a.m1321a(c11060a, "HTTP context");
        List<URI> m2172c = c11060a.m2172c();
        if (m2172c != null) {
            m2172c.clear();
        }
        C11022c m2161n = c11060a.m2161n();
        int m2286i = m2161n.m2286i() > 0 ? m2161n.m2286i() : 50;
        int i = 0;
        HttpEntityEnclosingRequest httpEntityEnclosingRequest = c11050n;
        while (true) {
            AbstractC11038b mo1511a = this.f36265b.mo1511a(httpRoute, httpEntityEnclosingRequest, c11060a, abstractC11042f);
            try {
                if (!m2161n.m2289f() || !this.f36266c.mo1756a(httpEntityEnclosingRequest, mo1511a, c11060a)) {
                    break;
                } else if (i >= m2286i) {
                    throw new RedirectException("Maximum redirects (" + m2286i + ") exceeded");
                } else {
                    int i2 = i + 1;
                    HttpUriRequest mo1755b = this.f36266c.mo1755b(httpEntityEnclosingRequest, mo1511a, c11060a);
                    if (!mo1755b.headerIterator().hasNext()) {
                        mo1755b.setHeaders(c11050n.m2223a().getAllHeaders());
                    }
                    httpEntityEnclosingRequest = C11050n.m2221a((HttpRequest) mo1755b);
                    if (httpEntityEnclosingRequest instanceof HttpEntityEnclosingRequest) {
                        C11289j.m1517a(httpEntityEnclosingRequest);
                    }
                    URI uri = httpEntityEnclosingRequest.getURI();
                    HttpHost m2097b = C11080i.m2097b(uri);
                    if (m2097b == null) {
                        throw new ProtocolException("Redirect URI does not specify a valid host name: " + uri);
                    }
                    if (!httpRoute.getTargetHost().equals(m2097b)) {
                        C11015d m2164k = c11060a.m2164k();
                        if (m2164k != null) {
                            if (Log.isLoggable(f36264a, 3)) {
                                Log.d(f36264a, "Resetting target auth state");
                            }
                            m2164k.m2310a();
                        }
                        C11015d m2163l = c11060a.m2163l();
                        if (m2163l != null && (m2302c = m2163l.m2302c()) != null && m2302c.isConnectionBased()) {
                            if (Log.isLoggable(f36264a, 3)) {
                                Log.d(f36264a, "Resetting proxy auth state");
                            }
                            m2163l.m2310a();
                        }
                    }
                    httpRoute = this.f36267d.determineRoute(m2097b, httpEntityEnclosingRequest, c11060a);
                    if (Log.isLoggable(f36264a, 3)) {
                        Log.d(f36264a, "Redirecting to '" + uri + "' via " + httpRoute);
                    }
                    C11357d.m1303b(mo1511a.getEntity());
                    i = i2;
                }
            } catch (RuntimeException e) {
                throw e;
            } catch (HttpException e2) {
                try {
                    C11357d.m1303b(mo1511a.getEntity());
                } catch (IOException e3) {
                    if (Log.isLoggable(f36264a, 3)) {
                        Log.d(f36264a, "I/O error while releasing connection", e3);
                    }
                } finally {
                    mo1511a.close();
                }
                throw e2;
            } catch (IOException e4) {
                throw e4;
            }
        }
    }
}
