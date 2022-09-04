package org.p286a.p287a.p306i.p308b;

import java.util.concurrent.TimeUnit;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestExecutor;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p290c.p291a.C11022c;
import org.p286a.p287a.p290c.p293c.AbstractC11038b;
import org.p286a.p287a.p290c.p293c.AbstractC11039c;
import org.p286a.p287a.p290c.p293c.AbstractC11042f;
import org.p286a.p287a.p290c.p293c.C11050n;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p299f.AbstractC11128d;
import org.p286a.p287a.p306i.C11294g;
import org.p286a.p287a.p306i.p312f.C11285f;
import org.p286a.p287a.p319n.C11342a;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11010d
/* renamed from: org.a.a.i.b.y */
/* loaded from: classes2.dex */
class C11206y extends AbstractC11186h {

    /* renamed from: a */
    private final AbstractC11128d f36089a;

    /* renamed from: b */
    private final C11285f f36090b;

    /* renamed from: c */
    private final HttpParams f36091c = new BasicHttpParams();

    public C11206y(AbstractC11128d abstractC11128d) {
        this.f36089a = (AbstractC11128d) C11354a.m1321a(abstractC11128d, "HTTP connection manager");
        this.f36090b = new C11285f(new HttpRequestExecutor(), abstractC11128d, C11294g.f36278a, C11189k.f35995a);
    }

    @Override // org.p286a.p287a.p306i.p308b.AbstractC11186h
    /* renamed from: a */
    protected AbstractC11038b mo1661a(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        C11354a.m1321a(httpHost, "Target host");
        C11354a.m1321a(httpRequest, "HTTP request");
        AbstractC11042f abstractC11042f = httpRequest instanceof AbstractC11042f ? (AbstractC11042f) httpRequest : null;
        try {
            C11050n m2221a = C11050n.m2221a(httpRequest);
            if (httpContext == null) {
                httpContext = new C11342a();
            }
            C11060a m2176a = C11060a.m2176a(httpContext);
            HttpRoute httpRoute = new HttpRoute(httpHost);
            C11022c mo2229A_ = httpRequest instanceof AbstractC11039c ? ((AbstractC11039c) httpRequest).mo2229A_() : null;
            if (mo2229A_ != null) {
                m2176a.m2181a(mo2229A_);
            }
            return this.f36090b.mo1511a(httpRoute, m2221a, m2176a, abstractC11042f);
        } catch (HttpException e) {
            throw new ClientProtocolException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36089a.mo1603b();
    }

    public ClientConnectionManager getConnectionManager() {
        return new ClientConnectionManager() { // from class: org.a.a.i.b.y.1
            public void closeExpiredConnections() {
                C11206y.this.f36089a.mo1618a();
            }

            public void closeIdleConnections(long j, TimeUnit timeUnit) {
                C11206y.this.f36089a.mo1617a(j, timeUnit);
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
                C11206y.this.f36089a.mo1603b();
            }
        };
    }

    public HttpParams getParams() {
        return this.f36091c;
    }
}
