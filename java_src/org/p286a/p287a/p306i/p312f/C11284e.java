package org.p286a.p287a.p306i.p312f;

import android.util.Log;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.NonRepeatableRequestException;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRouteDirector;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p289b.C11015d;
import org.p286a.p287a.p289b.EnumC11013b;
import org.p286a.p287a.p290c.AbstractC11024b;
import org.p286a.p287a.p290c.p291a.C11022c;
import org.p286a.p287a.p290c.p293c.AbstractC11038b;
import org.p286a.p287a.p290c.p293c.AbstractC11042f;
import org.p286a.p287a.p290c.p293c.C11050n;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p290c.p295e.C11064e;
import org.p286a.p287a.p299f.AbstractC11097a;
import org.p286a.p287a.p299f.AbstractC11128d;
import org.p286a.p287a.p305h.C11141c;
import org.p286a.p287a.p306i.p307a.C11155f;
import org.p286a.p287a.p306i.p309c.C11215e;
import org.p286a.p287a.p319n.C11344c;
import org.p286a.p287a.p319n.C11347f;
import org.p286a.p287a.p319n.C11351j;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11357d;
@AbstractC11008b
/* renamed from: org.a.a.i.f.e */
/* loaded from: classes2.dex */
public class C11284e implements AbstractC11281b {

    /* renamed from: a */
    private static final String f36245a = "HttpClient";

    /* renamed from: b */
    private final HttpRequestExecutor f36246b;

    /* renamed from: c */
    private final AbstractC11128d f36247c;

    /* renamed from: d */
    private final ConnectionReuseStrategy f36248d;

    /* renamed from: e */
    private final ConnectionKeepAliveStrategy f36249e;

    /* renamed from: g */
    private final AbstractC11024b f36251g;

    /* renamed from: h */
    private final AbstractC11024b f36252h;

    /* renamed from: j */
    private final UserTokenHandler f36254j;

    /* renamed from: i */
    private final C11155f f36253i = new C11155f();

    /* renamed from: f */
    private final HttpProcessor f36250f = new C11347f(new C11351j(), new C11064e());

    /* renamed from: k */
    private final HttpRouteDirector f36255k = new BasicRouteDirector();

    public C11284e(HttpRequestExecutor httpRequestExecutor, AbstractC11128d abstractC11128d, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, AbstractC11024b abstractC11024b, AbstractC11024b abstractC11024b2, UserTokenHandler userTokenHandler) {
        C11354a.m1321a(httpRequestExecutor, "HTTP request executor");
        C11354a.m1321a(abstractC11128d, "Client connection manager");
        C11354a.m1321a(connectionReuseStrategy, "Connection reuse strategy");
        C11354a.m1321a(connectionKeepAliveStrategy, "Connection keep alive strategy");
        C11354a.m1321a(abstractC11024b, "Target authentication strategy");
        C11354a.m1321a(abstractC11024b2, "Proxy authentication strategy");
        C11354a.m1321a(userTokenHandler, "User token handler");
        this.f36246b = httpRequestExecutor;
        this.f36247c = abstractC11128d;
        this.f36248d = connectionReuseStrategy;
        this.f36249e = connectionKeepAliveStrategy;
        this.f36251g = abstractC11024b;
        this.f36252h = abstractC11024b2;
        this.f36254j = userTokenHandler;
    }

    /* renamed from: a */
    private boolean m1525a(C11015d c11015d, C11015d c11015d2, HttpRoute httpRoute, HttpResponse httpResponse, C11060a c11060a) {
        if (c11060a.m2161n().m2285j()) {
            HttpHost t = c11060a.t();
            if (t == null) {
                t = httpRoute.getTargetHost();
            }
            HttpHost httpHost = t.getPort() < 0 ? new HttpHost(t.getHostName(), httpRoute.getTargetHost().getPort(), t.getSchemeName()) : t;
            boolean m1909a = this.f36253i.m1909a(httpHost, httpResponse, this.f36251g, c11015d, c11060a);
            HttpHost proxyHost = httpRoute.getProxyHost();
            if (proxyHost == null) {
                proxyHost = httpRoute.getTargetHost();
            }
            boolean m1909a2 = this.f36253i.m1909a(proxyHost, httpResponse, this.f36252h, c11015d2, c11060a);
            if (m1909a) {
                return this.f36253i.m1905b(httpHost, httpResponse, this.f36251g, c11015d, c11060a);
            }
            if (m1909a2) {
                return this.f36253i.m1905b(proxyHost, httpResponse, this.f36252h, c11015d2, c11060a);
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m1523a(HttpRoute httpRoute, int i, C11060a c11060a) {
        throw new HttpException("Proxy chains are not supported.");
    }

    /* renamed from: b */
    private boolean m1522b(C11015d c11015d, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, C11060a c11060a) {
        C11022c m2161n = c11060a.m2161n();
        int m2281n = m2161n.m2281n();
        HttpHost targetHost = httpRoute.getTargetHost();
        HttpHost proxyHost = httpRoute.getProxyHost();
        HttpResponse httpResponse = null;
        HttpRequest basicHttpRequest = new BasicHttpRequest("CONNECT", targetHost.toHostString(), httpRequest.getProtocolVersion());
        this.f36246b.preProcess(basicHttpRequest, this.f36250f, c11060a);
        while (httpResponse == null) {
            if (!httpClientConnection.isOpen()) {
                this.f36247c.mo1611a(httpClientConnection, httpRoute, m2281n > 0 ? m2281n : 0, c11060a);
            }
            basicHttpRequest.removeHeaders(C11086e.f35692N);
            this.f36253i.m1908a(basicHttpRequest, c11015d, c11060a);
            httpResponse = this.f36246b.execute(basicHttpRequest, httpClientConnection, c11060a);
            if (httpResponse.getStatusLine().getStatusCode() < 200) {
                throw new HttpException("Unexpected response to CONNECT request: " + httpResponse.getStatusLine());
            }
            if (m2161n.m2285j() && this.f36253i.m1909a(proxyHost, httpResponse, this.f36252h, c11015d, c11060a) && this.f36253i.m1905b(proxyHost, httpResponse, this.f36252h, c11015d, c11060a)) {
                if (this.f36248d.keepAlive(httpResponse, c11060a)) {
                    if (Log.isLoggable(f36245a, 3)) {
                        Log.d(f36245a, "Connection kept alive");
                    }
                    C11357d.m1303b(httpResponse.getEntity());
                } else {
                    httpClientConnection.close();
                }
                httpResponse = null;
            }
        }
        if (httpResponse.getStatusLine().getStatusCode() > 299) {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                httpResponse.setEntity(new C11141c(entity));
            }
            httpClientConnection.close();
            throw new C11293n("CONNECT refused by proxy: " + httpResponse.getStatusLine(), httpResponse);
        }
        return false;
    }

    @Override // org.p286a.p287a.p306i.p312f.AbstractC11281b
    /* renamed from: a */
    public AbstractC11038b mo1511a(HttpRoute httpRoute, C11050n c11050n, C11060a c11060a, AbstractC11042f abstractC11042f) {
        C11015d c11015d;
        HttpResponse execute;
        Object obj;
        C11354a.m1321a(httpRoute, "HTTP route");
        C11354a.m1321a(c11050n, "HTTP request");
        C11354a.m1321a(c11060a, "HTTP context");
        C11015d m2164k = c11060a.m2164k();
        if (m2164k == null) {
            C11015d c11015d2 = new C11015d();
            c11060a.setAttribute(C11060a.f35616i, c11015d2);
            c11015d = c11015d2;
        } else {
            c11015d = m2164k;
        }
        C11015d m2163l = c11060a.m2163l();
        if (m2163l == null) {
            m2163l = new C11015d();
            c11060a.setAttribute(C11060a.f35617j, m2163l);
        }
        if (c11050n instanceof HttpEntityEnclosingRequest) {
            C11289j.m1517a((HttpEntityEnclosingRequest) c11050n);
        }
        Object m2162m = c11060a.m2162m();
        AbstractC11097a mo1604a = this.f36247c.mo1604a(httpRoute, m2162m);
        if (abstractC11042f != null) {
            if (abstractC11042f.isAborted()) {
                mo1604a.a();
                throw new C11288i("Request aborted");
            }
            abstractC11042f.mo2231a(mo1604a);
        }
        C11022c m2161n = c11060a.m2161n();
        try {
            int m2282m = m2161n.m2282m();
            HttpClientConnection mo1594a = mo1604a.mo1594a(m2282m > 0 ? m2282m : 0L, TimeUnit.MILLISECONDS);
            c11060a.setAttribute(C11344c.f36425n, mo1594a);
            if (m2161n.m2291d() && mo1594a.isOpen()) {
                if (Log.isLoggable(f36245a, 3)) {
                    Log.d(f36245a, "Stale connection check");
                }
                if (mo1594a.isStale()) {
                    if (Log.isLoggable(f36245a, 3)) {
                        Log.d(f36245a, "Stale connection detected");
                    }
                    mo1594a.close();
                }
            }
            C11282c c11282c = new C11282c(this.f36247c, mo1594a);
            if (abstractC11042f != null) {
                try {
                    abstractC11042f.mo2231a(c11282c);
                } catch (C11215e e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Connection has been shut down");
                    interruptedIOException.initCause(e);
                    throw interruptedIOException;
                } catch (HttpException e2) {
                    c11282c.abortConnection();
                    throw e2;
                } catch (IOException e3) {
                    c11282c.abortConnection();
                    throw e3;
                } catch (RuntimeException e4) {
                    c11282c.abortConnection();
                    throw e4;
                }
            }
            int i = 1;
            while (true) {
                if (i > 1 && !C11289j.m1516a((HttpRequest) c11050n)) {
                    throw new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity.");
                }
                if (abstractC11042f != null && abstractC11042f.isAborted()) {
                    throw new C11288i("Request aborted");
                }
                if (!mo1594a.isOpen()) {
                    if (Log.isLoggable(f36245a, 3)) {
                        Log.d(f36245a, "Opening connection " + httpRoute);
                    }
                    try {
                        m1524a(m2163l, mo1594a, httpRoute, (HttpRequest) c11050n, c11060a);
                    } catch (C11293n e5) {
                        if (Log.isLoggable(f36245a, 3)) {
                            Log.d(f36245a, e5.getMessage());
                        }
                        execute = e5.m1510a();
                        if (m2162m == null) {
                            obj = this.f36254j.getUserToken(c11060a);
                            c11060a.setAttribute(C11060a.f35618k, obj);
                        } else {
                            obj = m2162m;
                        }
                        if (obj != null) {
                            c11282c.m1530a(obj);
                        }
                        HttpEntity entity = execute.getEntity();
                        if (entity != null && entity.isStreaming()) {
                            return new C11283d(execute, c11282c);
                        }
                        c11282c.releaseConnection();
                        return new C11283d(execute, null);
                    }
                }
                int m2280o = m2161n.m2280o();
                if (m2280o >= 0) {
                    mo1594a.setSocketTimeout(m2280o);
                }
                if (abstractC11042f != null && abstractC11042f.isAborted()) {
                    throw new C11288i("Request aborted");
                }
                if (Log.isLoggable(f36245a, 3)) {
                    Log.d(f36245a, "Executing request " + c11050n.getRequestLine());
                }
                if (!c11050n.containsHeader("Authorization")) {
                    if (Log.isLoggable(f36245a, 3)) {
                        Log.d(f36245a, "Target auth state: " + c11015d.m2303b());
                    }
                    this.f36253i.m1908a(c11050n, c11015d, c11060a);
                }
                if (!c11050n.containsHeader(C11086e.f35692N) && !httpRoute.isTunnelled()) {
                    if (Log.isLoggable(f36245a, 3)) {
                        Log.d(f36245a, "Proxy auth state: " + m2163l.m2303b());
                    }
                    this.f36253i.m1908a(c11050n, m2163l, c11060a);
                }
                execute = this.f36246b.execute(c11050n, mo1594a, c11060a);
                if (this.f36248d.keepAlive(execute, c11060a)) {
                    long keepAliveDuration = this.f36249e.getKeepAliveDuration(execute, c11060a);
                    if (Log.isLoggable(f36245a, 3)) {
                        Log.d(f36245a, "Connection can be kept alive " + (keepAliveDuration > 0 ? "for " + keepAliveDuration + " " + TimeUnit.MILLISECONDS : "indefinitely"));
                    }
                    c11282c.m1531a(keepAliveDuration, TimeUnit.MILLISECONDS);
                    c11282c.m1528c();
                } else {
                    c11282c.m1527d();
                }
                if (!m1525a(c11015d, m2163l, httpRoute, execute, c11060a)) {
                    break;
                }
                HttpEntity entity2 = execute.getEntity();
                if (c11282c.m1529b()) {
                    C11357d.m1303b(entity2);
                } else {
                    mo1594a.close();
                    if (m2163l.m2303b() == EnumC11013b.SUCCESS && m2163l.m2302c() != null && m2163l.m2302c().isConnectionBased()) {
                        if (Log.isLoggable(f36245a, 3)) {
                            Log.d(f36245a, "Resetting proxy auth state");
                        }
                        m2163l.m2310a();
                    }
                    if (c11015d.m2303b() == EnumC11013b.SUCCESS && c11015d.m2302c() != null && c11015d.m2302c().isConnectionBased()) {
                        if (Log.isLoggable(f36245a, 3)) {
                            Log.d(f36245a, "Resetting target auth state");
                        }
                        c11015d.m2310a();
                    }
                }
                HttpRequest m2223a = c11050n.m2223a();
                if (!m2223a.containsHeader("Authorization")) {
                    c11050n.removeHeaders("Authorization");
                }
                if (!m2223a.containsHeader(C11086e.f35692N)) {
                    c11050n.removeHeaders(C11086e.f35692N);
                }
                i++;
            }
        } catch (InterruptedException e6) {
            Thread.currentThread().interrupt();
            throw new C11288i("Request aborted", e6);
        } catch (ExecutionException e7) {
            e = e7;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            throw new C11288i("Request execution failed", e);
        }
    }

    /* renamed from: a */
    void m1524a(C11015d c11015d, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, C11060a c11060a) {
        int nextStep;
        int m2281n = c11060a.m2161n().m2281n();
        RouteTracker routeTracker = new RouteTracker(httpRoute);
        do {
            HttpRoute route = routeTracker.toRoute();
            nextStep = this.f36255k.nextStep(httpRoute, route);
            switch (nextStep) {
                case -1:
                    throw new HttpException("Unable to establish route: planned = " + httpRoute + "; current = " + route);
                case 0:
                    this.f36247c.mo1602b(httpClientConnection, httpRoute, c11060a);
                    continue;
                case 1:
                    this.f36247c.mo1611a(httpClientConnection, httpRoute, m2281n > 0 ? m2281n : 0, c11060a);
                    routeTracker.connectTarget(httpRoute.isSecure());
                    continue;
                case 2:
                    this.f36247c.mo1611a(httpClientConnection, httpRoute, m2281n > 0 ? m2281n : 0, c11060a);
                    routeTracker.connectProxy(httpRoute.getProxyHost(), false);
                    continue;
                case 3:
                    boolean m1522b = m1522b(c11015d, httpClientConnection, httpRoute, httpRequest, c11060a);
                    if (Log.isLoggable(f36245a, 3)) {
                        Log.d(f36245a, "Tunnel to target created.");
                    }
                    routeTracker.tunnelTarget(m1522b);
                    continue;
                case 4:
                    int hopCount = route.getHopCount() - 1;
                    boolean m1523a = m1523a(httpRoute, hopCount, c11060a);
                    if (Log.isLoggable(f36245a, 3)) {
                        Log.d(f36245a, "Tunnel to proxy created.");
                    }
                    routeTracker.tunnelProxy(httpRoute.getHopTarget(hopCount), m1523a);
                    continue;
                case 5:
                    this.f36247c.mo1610a(httpClientConnection, httpRoute, c11060a);
                    routeTracker.layerProtocol(httpRoute.isSecure());
                    continue;
                default:
                    throw new IllegalStateException("Unknown step indicator " + nextStep + " from RouteDirector.");
            }
        } while (nextStep > 0);
    }
}
