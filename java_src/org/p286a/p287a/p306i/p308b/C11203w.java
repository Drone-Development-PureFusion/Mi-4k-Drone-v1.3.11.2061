package org.p286a.p287a.p306i.p308b;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p289b.AbstractC11014c;
import org.p286a.p287a.p289b.C11015d;
import org.p286a.p287a.p290c.p291a.C11022c;
import org.p286a.p287a.p290c.p293c.AbstractC11038b;
import org.p286a.p287a.p290c.p293c.AbstractC11039c;
import org.p286a.p287a.p290c.p293c.AbstractC11042f;
import org.p286a.p287a.p290c.p293c.C11050n;
import org.p286a.p287a.p290c.p294d.C11058a;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p298e.AbstractC11089b;
import org.p286a.p287a.p299f.AbstractC11128d;
import org.p286a.p287a.p304g.AbstractC11138b;
import org.p286a.p287a.p306i.p312f.AbstractC11281b;
import org.p286a.p287a.p319n.C11342a;
import org.p286a.p287a.p320o.C11354a;
/* JADX INFO: Access modifiers changed from: package-private */
@AbstractC11010d
/* renamed from: org.a.a.i.b.w */
/* loaded from: classes2.dex */
public class C11203w extends AbstractC11186h {

    /* renamed from: a */
    private static final String f36077a = "HttpClient";

    /* renamed from: b */
    private final AbstractC11281b f36078b;

    /* renamed from: c */
    private final AbstractC11128d f36079c;

    /* renamed from: d */
    private final HttpRoutePlanner f36080d;

    /* renamed from: e */
    private final AbstractC11089b<AbstractC11138b> f36081e;

    /* renamed from: f */
    private final AbstractC11089b<AbstractC11014c> f36082f;

    /* renamed from: g */
    private final CookieStore f36083g;

    /* renamed from: h */
    private final CredentialsProvider f36084h;

    /* renamed from: i */
    private final C11022c f36085i;

    /* renamed from: j */
    private final List<Closeable> f36086j;

    public C11203w(AbstractC11281b abstractC11281b, AbstractC11128d abstractC11128d, HttpRoutePlanner httpRoutePlanner, AbstractC11089b<AbstractC11138b> abstractC11089b, AbstractC11089b<AbstractC11014c> abstractC11089b2, CookieStore cookieStore, CredentialsProvider credentialsProvider, C11022c c11022c, List<Closeable> list) {
        C11354a.m1321a(abstractC11281b, "HTTP client exec chain");
        C11354a.m1321a(abstractC11128d, "HTTP connection manager");
        C11354a.m1321a(httpRoutePlanner, "HTTP route planner");
        this.f36078b = abstractC11281b;
        this.f36079c = abstractC11128d;
        this.f36080d = httpRoutePlanner;
        this.f36081e = abstractC11089b;
        this.f36082f = abstractC11089b2;
        this.f36083g = cookieStore;
        this.f36084h = credentialsProvider;
        this.f36085i = c11022c;
        this.f36086j = list;
    }

    /* renamed from: a */
    private void m1666a(C11060a c11060a) {
        if (c11060a.getAttribute(C11060a.f35616i) == null) {
            c11060a.setAttribute(C11060a.f35616i, new C11015d());
        }
        if (c11060a.getAttribute(C11060a.f35617j) == null) {
            c11060a.setAttribute(C11060a.f35617j, new C11015d());
        }
        if (c11060a.getAttribute(C11060a.f35619l) == null) {
            c11060a.setAttribute(C11060a.f35619l, this.f36082f);
        }
        if (c11060a.getAttribute(C11060a.f35610c) == null) {
            c11060a.setAttribute(C11060a.f35610c, this.f36081e);
        }
        if (c11060a.getAttribute(C11060a.f35613f) == null) {
            c11060a.setAttribute(C11060a.f35613f, this.f36083g);
        }
        if (c11060a.getAttribute(C11060a.f35614g) == null) {
            c11060a.setAttribute(C11060a.f35614g, this.f36084h);
        }
        if (c11060a.getAttribute(C11060a.f35620m) == null) {
            c11060a.setAttribute(C11060a.f35620m, this.f36085i);
        }
    }

    /* renamed from: c */
    private HttpRoute m1664c(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.f36080d.determineRoute(httpHost == null ? (HttpHost) httpRequest.getParams().getParameter("http.default-host") : httpHost, httpRequest, httpContext);
    }

    @Override // org.p286a.p287a.p306i.p308b.AbstractC11186h
    /* renamed from: a */
    protected AbstractC11038b mo1661a(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        C11354a.m1321a(httpRequest, "HTTP request");
        AbstractC11042f abstractC11042f = httpRequest instanceof AbstractC11042f ? (AbstractC11042f) httpRequest : null;
        try {
            HttpRequest m2221a = C11050n.m2221a(httpRequest);
            if (httpContext == null) {
                httpContext = new C11342a();
            }
            C11060a m2176a = C11060a.m2176a(httpContext);
            C11022c mo2229A_ = httpRequest instanceof AbstractC11039c ? ((AbstractC11039c) httpRequest).mo2229A_() : null;
            if (mo2229A_ == null) {
                mo2229A_ = C11058a.m2185a(httpRequest.getParams());
            }
            if (mo2229A_ != null) {
                m2176a.m2181a(mo2229A_);
            }
            m1666a(m2176a);
            return this.f36078b.mo1511a(m1664c(httpHost, m2221a, m2176a), m2221a, m2176a, abstractC11042f);
        } catch (HttpException e) {
            throw new ClientProtocolException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36079c.mo1603b();
        if (this.f36086j != null) {
            for (Closeable closeable : this.f36086j) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    Log.e(f36077a, e.getMessage(), e);
                }
            }
        }
    }

    public ClientConnectionManager getConnectionManager() {
        return new ClientConnectionManager() { // from class: org.a.a.i.b.w.1
            public void closeExpiredConnections() {
                C11203w.this.f36079c.mo1618a();
            }

            public void closeIdleConnections(long j, TimeUnit timeUnit) {
                C11203w.this.f36079c.mo1617a(j, timeUnit);
            }

            public SchemeRegistry getSchemeRegistry() {
                throw new UnsupportedOperationException();
            }

            public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
                throw new UnsupportedOperationException();
            }

            public ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
                throw new UnsupportedOperationException();
            }

            public void shutdown() {
                C11203w.this.f36079c.mo1603b();
            }
        };
    }

    public HttpParams getParams() {
        throw new UnsupportedOperationException();
    }
}
