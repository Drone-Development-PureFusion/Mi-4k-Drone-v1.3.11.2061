package org.p286a.p287a.p306i.p309c;

import android.util.Log;
import com.facebook.common.util.UriUtil;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p298e.AbstractC11089b;
import org.p286a.p287a.p298e.C11087a;
import org.p286a.p287a.p298e.C11092d;
import org.p286a.p287a.p298e.C11093e;
import org.p286a.p287a.p298e.C11094f;
import org.p286a.p287a.p299f.AbstractC11097a;
import org.p286a.p287a.p299f.AbstractC11106b;
import org.p286a.p287a.p299f.AbstractC11128d;
import org.p286a.p287a.p299f.AbstractC11130e;
import org.p286a.p287a.p299f.AbstractC11133h;
import org.p286a.p287a.p299f.AbstractC11134i;
import org.p286a.p287a.p299f.p301b.AbstractC11107a;
import org.p286a.p287a.p299f.p301b.C11109c;
import org.p286a.p287a.p299f.p302c.C11118g;
import org.p286a.p287a.p318m.AbstractC11334b;
import org.p286a.p287a.p318m.AbstractC11336d;
import org.p286a.p287a.p318m.C11340h;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11355b;
@AbstractC11010d
/* renamed from: org.a.a.i.c.r */
/* loaded from: classes2.dex */
public class C11228r implements Closeable, AbstractC11128d, AbstractC11336d<HttpRoute> {

    /* renamed from: a */
    private static final String f36147a = "HttpClient";

    /* renamed from: b */
    private final C11230a f36148b;

    /* renamed from: c */
    private final C11212b f36149c;

    /* renamed from: d */
    private final C11222l f36150d;

    /* renamed from: e */
    private final AtomicBoolean f36151e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.a.a.i.c.r$a */
    /* loaded from: classes2.dex */
    public static class C11230a {

        /* renamed from: a */
        private final Map<HttpHost, C11094f> f36154a = new ConcurrentHashMap();

        /* renamed from: b */
        private final Map<HttpHost, C11087a> f36155b = new ConcurrentHashMap();

        /* renamed from: c */
        private volatile C11094f f36156c;

        /* renamed from: d */
        private volatile C11087a f36157d;

        C11230a() {
        }

        /* renamed from: a */
        public C11094f m1593a() {
            return this.f36156c;
        }

        /* renamed from: a */
        public C11094f m1590a(HttpHost httpHost) {
            return this.f36154a.get(httpHost);
        }

        /* renamed from: a */
        public void m1592a(C11087a c11087a) {
            this.f36157d = c11087a;
        }

        /* renamed from: a */
        public void m1591a(C11094f c11094f) {
            this.f36156c = c11094f;
        }

        /* renamed from: a */
        public void m1589a(HttpHost httpHost, C11087a c11087a) {
            this.f36155b.put(httpHost, c11087a);
        }

        /* renamed from: a */
        public void m1588a(HttpHost httpHost, C11094f c11094f) {
            this.f36154a.put(httpHost, c11094f);
        }

        /* renamed from: b */
        public C11087a m1587b() {
            return this.f36157d;
        }

        /* renamed from: b */
        public C11087a m1586b(HttpHost httpHost) {
            return this.f36155b.get(httpHost);
        }
    }

    /* renamed from: org.a.a.i.c.r$b */
    /* loaded from: classes2.dex */
    static class C11231b implements AbstractC11334b<HttpRoute, AbstractC11133h> {

        /* renamed from: a */
        private final C11230a f36158a;

        /* renamed from: b */
        private final AbstractC11130e<HttpRoute, AbstractC11133h> f36159b;

        C11231b(C11230a c11230a, AbstractC11130e<HttpRoute, AbstractC11133h> abstractC11130e) {
            this.f36158a = c11230a == null ? new C11230a() : c11230a;
            this.f36159b = abstractC11130e == null ? C11227q.f36143a : abstractC11130e;
        }

        @Override // org.p286a.p287a.p318m.AbstractC11334b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public AbstractC11133h mo1407a(HttpRoute httpRoute) {
            C11087a c11087a = null;
            if (httpRoute.getProxyHost() != null) {
                c11087a = this.f36158a.m1586b(httpRoute.getProxyHost());
            }
            if (c11087a == null) {
                c11087a = this.f36158a.m1586b(httpRoute.getTargetHost());
            }
            if (c11087a == null) {
                c11087a = this.f36158a.m1587b();
            }
            if (c11087a == null) {
                c11087a = C11087a.f35734a;
            }
            return this.f36159b.mo1620a(httpRoute, c11087a);
        }
    }

    public C11228r() {
        this(m1595h());
    }

    public C11228r(long j, TimeUnit timeUnit) {
        this(m1595h(), null, null, null, j, timeUnit);
    }

    public C11228r(C11092d<AbstractC11107a> c11092d) {
        this(c11092d, null, null);
    }

    public C11228r(C11092d<AbstractC11107a> c11092d, AbstractC11106b abstractC11106b) {
        this(c11092d, null, abstractC11106b);
    }

    public C11228r(C11092d<AbstractC11107a> c11092d, AbstractC11130e<HttpRoute, AbstractC11133h> abstractC11130e) {
        this(c11092d, abstractC11130e, null);
    }

    public C11228r(C11092d<AbstractC11107a> c11092d, AbstractC11130e<HttpRoute, AbstractC11133h> abstractC11130e, AbstractC11106b abstractC11106b) {
        this(c11092d, abstractC11130e, null, abstractC11106b, -1L, TimeUnit.MILLISECONDS);
    }

    public C11228r(C11092d<AbstractC11107a> c11092d, AbstractC11130e<HttpRoute, AbstractC11133h> abstractC11130e, AbstractC11134i abstractC11134i, AbstractC11106b abstractC11106b, long j, TimeUnit timeUnit) {
        this.f36148b = new C11230a();
        this.f36149c = new C11212b(new C11231b(this.f36148b, abstractC11130e), 2, 20, j, timeUnit);
        this.f36150d = new C11222l(c11092d, abstractC11134i, abstractC11106b);
        this.f36151e = new AtomicBoolean(false);
    }

    public C11228r(AbstractC11130e<HttpRoute, AbstractC11133h> abstractC11130e) {
        this(m1595h(), abstractC11130e, null);
    }

    C11228r(C11212b c11212b, AbstractC11089b<AbstractC11107a> abstractC11089b, AbstractC11134i abstractC11134i, AbstractC11106b abstractC11106b) {
        this.f36148b = new C11230a();
        this.f36149c = c11212b;
        this.f36150d = new C11222l(abstractC11089b, abstractC11134i, abstractC11106b);
        this.f36151e = new AtomicBoolean(false);
    }

    /* renamed from: a */
    private String m1613a(C11213c c11213c) {
        StringBuilder sb = new StringBuilder();
        sb.append("[id: ").append(c11213c.g()).append("]");
        sb.append("[route: ").append(c11213c.h()).append("]");
        Object l = c11213c.l();
        if (l != null) {
            sb.append("[state: ").append(l).append("]");
        }
        return sb.toString();
    }

    /* renamed from: b */
    private String m1599b(HttpRoute httpRoute, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("[route: ").append(httpRoute).append("]");
        if (obj != null) {
            sb.append("[state: ").append(obj).append("]");
        }
        return sb.toString();
    }

    /* renamed from: c */
    private String m1598c(HttpRoute httpRoute) {
        StringBuilder sb = new StringBuilder();
        C11340h e = this.f36149c.e();
        C11340h a = this.f36149c.a((C11212b) httpRoute);
        sb.append("[total kept alive: ").append(e.m1377c()).append("; ");
        sb.append("route allocated: ").append(a.m1379a() + a.m1377c());
        sb.append(" of ").append(a.m1376d()).append("; ");
        sb.append("total allocated: ").append(e.m1379a() + e.m1377c());
        sb.append(" of ").append(e.m1376d()).append("]");
        return sb.toString();
    }

    /* renamed from: h */
    private static C11092d<AbstractC11107a> m1595h() {
        return C11093e.m2042a().m2041a(UriUtil.HTTP_SCHEME, C11109c.m2018a()).m2041a(UriUtil.HTTPS_SCHEME, C11118g.m1993a()).m2040b();
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public int mo1400b(HttpRoute httpRoute) {
        return this.f36149c.b((C11212b) httpRoute);
    }

    /* renamed from: a */
    public C11094f m1609a(HttpHost httpHost) {
        return this.f36148b.m1590a(httpHost);
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: a */
    public AbstractC11097a mo1604a(HttpRoute httpRoute, Object obj) {
        C11354a.m1321a(httpRoute, "HTTP route");
        if (Log.isLoggable(f36147a, 3)) {
            Log.d(f36147a, "Connection request: " + m1599b(httpRoute, obj) + m1598c(httpRoute));
        }
        final Future<C11213c> a = this.f36149c.a(httpRoute, obj, null);
        return new AbstractC11097a() { // from class: org.a.a.i.c.r.1
            @Override // org.p286a.p287a.p299f.AbstractC11097a
            /* renamed from: a */
            public HttpClientConnection mo1594a(long j, TimeUnit timeUnit) {
                return C11228r.this.m1616a(a, j, timeUnit);
            }

            @Override // org.p286a.p287a.p297d.AbstractC11084b
            /* renamed from: a */
            public boolean mo1532a() {
                return a.cancel(true);
            }
        };
    }

    /* renamed from: a */
    protected HttpClientConnection m1616a(Future<C11213c> future, long j, TimeUnit timeUnit) {
        try {
            C11213c c11213c = future.get(j, timeUnit);
            if (c11213c == null || future.isCancelled()) {
                throw new InterruptedException();
            }
            C11355b.m1312a(c11213c.i() != null, "Pool entry with no connection");
            if (Log.isLoggable(f36147a, 3)) {
                Log.d(f36147a, "Connection leased: " + m1613a(c11213c) + m1598c(c11213c.h()));
            }
            return C11214d.m1643a(c11213c);
        } catch (TimeoutException e) {
            throw new ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
        }
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: a */
    public void mo1618a() {
        if (Log.isLoggable(f36147a, 3)) {
            Log.d(f36147a, "Closing expired connections");
        }
        this.f36149c.f();
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: a */
    public void mo1404a(int i) {
        this.f36149c.a(i);
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: a */
    public void mo1617a(long j, TimeUnit timeUnit) {
        if (Log.isLoggable(f36147a, 3)) {
            Log.d(f36147a, "Closing connections idle longer than " + j + " " + timeUnit);
        }
        this.f36149c.a(j, timeUnit);
    }

    /* renamed from: a */
    public void m1615a(C11087a c11087a) {
        this.f36148b.m1592a(c11087a);
    }

    /* renamed from: a */
    public void m1614a(C11094f c11094f) {
        this.f36148b.m1591a(c11094f);
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: a */
    public void mo1612a(HttpClientConnection httpClientConnection, Object obj, long j, TimeUnit timeUnit) {
        boolean z = true;
        C11354a.m1321a(httpClientConnection, "Managed connection");
        synchronized (httpClientConnection) {
            C11213c m1641b = C11214d.m1641b(httpClientConnection);
            if (m1641b == null) {
                return;
            }
            AbstractC11133h i = m1641b.i();
            if (i.isOpen()) {
                m1641b.a(obj);
                if (timeUnit == null) {
                    timeUnit = TimeUnit.MILLISECONDS;
                }
                m1641b.a(j, timeUnit);
                if (Log.isLoggable(f36147a, 3)) {
                    Log.d(f36147a, "Connection " + m1613a(m1641b) + " can be kept alive " + (j > 0 ? "for " + (j / 1000.0d) + " seconds" : "indefinitely"));
                }
            }
            C11212b c11212b = this.f36149c;
            if (!i.isOpen() || !m1641b.m1647b()) {
                z = false;
            }
            c11212b.a((C11212b) m1641b, z);
            if (Log.isLoggable(f36147a, 3)) {
                Log.d(f36147a, "Connection released: " + m1613a(m1641b) + m1598c(m1641b.h()));
            }
        }
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: a */
    public void mo1611a(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i, HttpContext httpContext) {
        AbstractC11133h i2;
        C11354a.m1321a(httpClientConnection, "Managed Connection");
        C11354a.m1321a(httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            i2 = C11214d.m1642a(httpClientConnection).i();
        }
        HttpHost proxyHost = httpRoute.getProxyHost() != null ? httpRoute.getProxyHost() : httpRoute.getTargetHost();
        InetSocketAddress inetSocketAddress = httpRoute.getLocalAddress() != null ? new InetSocketAddress(httpRoute.getLocalAddress(), 0) : null;
        C11094f m1590a = this.f36148b.m1590a(proxyHost);
        if (m1590a == null) {
            m1590a = this.f36148b.m1593a();
        }
        if (m1590a == null) {
            m1590a = C11094f.f35754a;
        }
        this.f36150d.m1628a(i2, proxyHost, inetSocketAddress, i, m1590a, httpContext);
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: a */
    public void mo1610a(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
        AbstractC11133h i;
        C11354a.m1321a(httpClientConnection, "Managed Connection");
        C11354a.m1321a(httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            i = C11214d.m1642a(httpClientConnection).i();
        }
        this.f36150d.m1627a(i, httpRoute.getTargetHost(), httpContext);
    }

    /* renamed from: a */
    public void m1608a(HttpHost httpHost, C11087a c11087a) {
        this.f36148b.m1589a(httpHost, c11087a);
    }

    /* renamed from: a */
    public void m1607a(HttpHost httpHost, C11094f c11094f) {
        this.f36148b.m1588a(httpHost, c11094f);
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo1402a(HttpRoute httpRoute, int i) {
        this.f36149c.a((C11212b) httpRoute, i);
    }

    /* renamed from: b */
    public C11087a m1601b(HttpHost httpHost) {
        return this.f36148b.m1586b(httpHost);
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public C11340h mo1403a(HttpRoute httpRoute) {
        return this.f36149c.a((C11212b) httpRoute);
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: b */
    public void mo1603b() {
        if (this.f36151e.compareAndSet(false, true)) {
            if (Log.isLoggable(f36147a, 3)) {
                Log.d(f36147a, "Connection manager is shutting down");
            }
            try {
                this.f36149c.b();
            } catch (IOException e) {
                Log.d(f36147a, "I/O exception shutting down connection manager", e);
            }
            if (!Log.isLoggable(f36147a, 3)) {
                return;
            }
            Log.d(f36147a, "Connection manager shut down");
        }
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: b */
    public void mo1401b(int i) {
        this.f36149c.b(i);
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: b */
    public void mo1602b(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
        C11354a.m1321a(httpClientConnection, "Managed Connection");
        C11354a.m1321a(httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            C11214d.m1642a(httpClientConnection).m1648a();
        }
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: c */
    public int mo1399c() {
        return this.f36149c.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo1603b();
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: d */
    public int mo1398d() {
        return this.f36149c.d();
    }

    @Override // org.p286a.p287a.p318m.AbstractC11336d
    /* renamed from: e */
    public C11340h mo1397e() {
        return this.f36149c.e();
    }

    /* renamed from: f */
    public C11094f m1597f() {
        return this.f36148b.m1593a();
    }

    protected void finalize() {
        try {
            mo1603b();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public C11087a m1596g() {
        return this.f36148b.m1587b();
    }
}
