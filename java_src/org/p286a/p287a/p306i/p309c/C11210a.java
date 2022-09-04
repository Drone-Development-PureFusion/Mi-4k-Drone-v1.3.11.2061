package org.p286a.p287a.p306i.p309c;

import android.util.Log;
import com.facebook.common.util.UriUtil;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.LangUtils;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11007a;
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
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11355b;
@AbstractC11010d
/* renamed from: org.a.a.i.c.a */
/* loaded from: classes2.dex */
public class C11210a implements Closeable, AbstractC11128d {

    /* renamed from: a */
    private static final String f36096a = "HttpClient";

    /* renamed from: b */
    private final C11222l f36097b;

    /* renamed from: c */
    private final AbstractC11130e<HttpRoute, AbstractC11133h> f36098c;
    @AbstractC11007a(m2313a = "this")

    /* renamed from: d */
    private AbstractC11133h f36099d;
    @AbstractC11007a(m2313a = "this")

    /* renamed from: e */
    private HttpRoute f36100e;
    @AbstractC11007a(m2313a = "this")

    /* renamed from: f */
    private Object f36101f;
    @AbstractC11007a(m2313a = "this")

    /* renamed from: g */
    private long f36102g;
    @AbstractC11007a(m2313a = "this")

    /* renamed from: h */
    private long f36103h;
    @AbstractC11007a(m2313a = "this")

    /* renamed from: i */
    private boolean f36104i;
    @AbstractC11007a(m2313a = "this")

    /* renamed from: j */
    private C11094f f36105j;
    @AbstractC11007a(m2313a = "this")

    /* renamed from: k */
    private C11087a f36106k;

    /* renamed from: l */
    private final AtomicBoolean f36107l;

    public C11210a() {
        this(m1653g(), null, null, null);
    }

    public C11210a(AbstractC11089b<AbstractC11107a> abstractC11089b) {
        this(abstractC11089b, null, null, null);
    }

    public C11210a(AbstractC11089b<AbstractC11107a> abstractC11089b, AbstractC11130e<HttpRoute, AbstractC11133h> abstractC11130e) {
        this(abstractC11089b, abstractC11130e, null, null);
    }

    public C11210a(AbstractC11089b<AbstractC11107a> abstractC11089b, AbstractC11130e<HttpRoute, AbstractC11133h> abstractC11130e, AbstractC11134i abstractC11134i, AbstractC11106b abstractC11106b) {
        this.f36097b = new C11222l(abstractC11089b, abstractC11134i, abstractC11106b);
        this.f36098c = abstractC11130e == null ? C11227q.f36143a : abstractC11130e;
        this.f36103h = Long.MAX_VALUE;
        this.f36105j = C11094f.f35754a;
        this.f36106k = C11087a.f35734a;
        this.f36107l = new AtomicBoolean(false);
    }

    /* renamed from: g */
    private static C11092d<AbstractC11107a> m1653g() {
        return C11093e.m2042a().m2041a(UriUtil.HTTP_SCHEME, C11109c.m2018a()).m2041a(UriUtil.HTTPS_SCHEME, C11118g.m1993a()).m2040b();
    }

    /* renamed from: h */
    private void m1652h() {
        if (this.f36099d != null) {
            if (Log.isLoggable(f36096a, 3)) {
                Log.d(f36096a, "Closing connection");
            }
            try {
                this.f36099d.close();
            } catch (IOException e) {
                if (Log.isLoggable(f36096a, 3)) {
                    Log.d(f36096a, "I/O exception closing connection", e);
                }
            }
            this.f36099d = null;
        }
    }

    /* renamed from: i */
    private void m1651i() {
        if (this.f36099d != null) {
            if (Log.isLoggable(f36096a, 3)) {
                Log.d(f36096a, "Shutting down connection");
            }
            try {
                this.f36099d.shutdown();
            } catch (IOException e) {
                if (Log.isLoggable(f36096a, 3)) {
                    Log.d(f36096a, "I/O exception shutting down connection", e);
                }
            }
            this.f36099d = null;
        }
    }

    /* renamed from: j */
    private void m1650j() {
        if (this.f36099d == null || System.currentTimeMillis() < this.f36103h) {
            return;
        }
        if (Log.isLoggable(f36096a, 3)) {
            Log.d(f36096a, "Connection expired @ " + new Date(this.f36103h));
        }
        m1652h();
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: a */
    public final AbstractC11097a mo1604a(final HttpRoute httpRoute, final Object obj) {
        C11354a.m1321a(httpRoute, "Route");
        return new AbstractC11097a() { // from class: org.a.a.i.c.a.1
            @Override // org.p286a.p287a.p299f.AbstractC11097a
            /* renamed from: a */
            public HttpClientConnection mo1594a(long j, TimeUnit timeUnit) {
                return C11210a.this.m1658b(httpRoute, obj);
            }

            @Override // org.p286a.p287a.p297d.AbstractC11084b
            /* renamed from: a */
            public boolean mo1532a() {
                return false;
            }
        };
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: a */
    public synchronized void mo1618a() {
        if (!this.f36107l.get() && !this.f36104i) {
            m1650j();
        }
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: a */
    public synchronized void mo1617a(long j, TimeUnit timeUnit) {
        long j2 = 0;
        synchronized (this) {
            C11354a.m1321a(timeUnit, "Time unit");
            if (!this.f36107l.get() && !this.f36104i) {
                long millis = timeUnit.toMillis(j);
                if (millis >= 0) {
                    j2 = millis;
                }
                if (this.f36102g <= System.currentTimeMillis() - j2) {
                    m1652h();
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void m1660a(C11087a c11087a) {
        if (c11087a == null) {
            c11087a = C11087a.f35734a;
        }
        this.f36106k = c11087a;
    }

    /* renamed from: a */
    public synchronized void m1659a(C11094f c11094f) {
        if (c11094f == null) {
            c11094f = C11094f.f35754a;
        }
        this.f36105j = c11094f;
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: a */
    public synchronized void mo1612a(HttpClientConnection httpClientConnection, Object obj, long j, TimeUnit timeUnit) {
        boolean z = false;
        synchronized (this) {
            C11354a.m1321a(httpClientConnection, C11086e.f35717j);
            if (httpClientConnection == this.f36099d) {
                z = true;
            }
            C11355b.m1312a(z, "Connection not obtained from this manager");
            if (Log.isLoggable(f36096a, 3)) {
                Log.d(f36096a, "Releasing connection " + httpClientConnection);
            }
            if (!this.f36107l.get()) {
                this.f36102g = System.currentTimeMillis();
                if (!this.f36099d.isOpen()) {
                    this.f36099d = null;
                    this.f36100e = null;
                    this.f36099d = null;
                    this.f36103h = Long.MAX_VALUE;
                } else {
                    this.f36101f = obj;
                    if (Log.isLoggable(f36096a, 3)) {
                        Log.d(f36096a, "Connection can be kept alive " + (j > 0 ? "for " + j + " " + timeUnit : "indefinitely"));
                    }
                    if (j > 0) {
                        this.f36103h = this.f36102g + timeUnit.toMillis(j);
                    } else {
                        this.f36103h = Long.MAX_VALUE;
                    }
                }
                this.f36104i = false;
            }
        }
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: a */
    public void mo1611a(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i, HttpContext httpContext) {
        C11354a.m1321a(httpClientConnection, C11086e.f35717j);
        C11354a.m1321a(httpRoute, "HTTP route");
        C11355b.m1312a(httpClientConnection == this.f36099d, "Connection not obtained from this manager");
        this.f36097b.m1628a(this.f36099d, httpRoute.getProxyHost() != null ? httpRoute.getProxyHost() : httpRoute.getTargetHost(), httpRoute.getLocalAddress() != null ? new InetSocketAddress(httpRoute.getLocalAddress(), 0) : null, i, this.f36105j, httpContext);
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: a */
    public void mo1610a(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
        C11354a.m1321a(httpClientConnection, C11086e.f35717j);
        C11354a.m1321a(httpRoute, "HTTP route");
        C11355b.m1312a(httpClientConnection == this.f36099d, "Connection not obtained from this manager");
        this.f36097b.m1627a(this.f36099d, httpRoute.getTargetHost(), httpContext);
    }

    /* renamed from: b */
    synchronized HttpClientConnection m1658b(HttpRoute httpRoute, Object obj) {
        AbstractC11133h abstractC11133h;
        boolean z = true;
        synchronized (this) {
            C11355b.m1312a(!this.f36107l.get(), "Connection manager has been shut down");
            if (Log.isLoggable(f36096a, 3)) {
                Log.d(f36096a, "Get connection for route " + httpRoute);
            }
            if (this.f36104i) {
                z = false;
            }
            C11355b.m1312a(z, "Connection is still allocated");
            if (!LangUtils.equals(this.f36100e, httpRoute) || !LangUtils.equals(this.f36101f, obj)) {
                m1652h();
            }
            this.f36100e = httpRoute;
            this.f36101f = obj;
            m1650j();
            if (this.f36099d == null) {
                this.f36099d = this.f36098c.mo1620a(httpRoute, this.f36106k);
            }
            this.f36104i = true;
            abstractC11133h = this.f36099d;
        }
        return abstractC11133h;
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: b */
    public synchronized void mo1603b() {
        if (this.f36107l.compareAndSet(false, true)) {
            m1651i();
        }
    }

    @Override // org.p286a.p287a.p299f.AbstractC11128d
    /* renamed from: b */
    public void mo1602b(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
    }

    /* renamed from: c */
    HttpRoute m1657c() {
        return this.f36100e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo1603b();
    }

    /* renamed from: d */
    Object m1656d() {
        return this.f36101f;
    }

    /* renamed from: e */
    public synchronized C11094f m1655e() {
        return this.f36105j;
    }

    /* renamed from: f */
    public synchronized C11087a m1654f() {
        return this.f36106k;
    }

    protected void finalize() {
        try {
            mo1603b();
        } finally {
            super.finalize();
        }
    }
}
