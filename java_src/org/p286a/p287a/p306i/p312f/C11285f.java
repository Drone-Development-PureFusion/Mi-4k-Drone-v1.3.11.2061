package org.p286a.p287a.p306i.p312f;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.p291a.C11022c;
import org.p286a.p287a.p290c.p293c.AbstractC11038b;
import org.p286a.p287a.p290c.p293c.AbstractC11042f;
import org.p286a.p287a.p290c.p293c.C11050n;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p290c.p295e.C11064e;
import org.p286a.p287a.p290c.p296f.C11080i;
import org.p286a.p287a.p299f.AbstractC11097a;
import org.p286a.p287a.p299f.AbstractC11128d;
import org.p286a.p287a.p306i.p309c.C11215e;
import org.p286a.p287a.p319n.C11344c;
import org.p286a.p287a.p319n.C11347f;
import org.p286a.p287a.p319n.C11349h;
import org.p286a.p287a.p319n.C11351j;
import org.p286a.p287a.p319n.C11352k;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11360g;
@AbstractC11008b
/* renamed from: org.a.a.i.f.f */
/* loaded from: classes2.dex */
public class C11285f implements AbstractC11281b {

    /* renamed from: a */
    private final HttpRequestExecutor f36256a;

    /* renamed from: b */
    private final AbstractC11128d f36257b;

    /* renamed from: c */
    private final ConnectionReuseStrategy f36258c;

    /* renamed from: d */
    private final ConnectionKeepAliveStrategy f36259d;

    /* renamed from: e */
    private final HttpProcessor f36260e = new C11347f(new C11349h(), new C11351j(), new C11064e(), new C11352k(C11360g.m1293a("Apache-HttpClient", "org.apache.http.client", getClass())));

    public C11285f(HttpRequestExecutor httpRequestExecutor, AbstractC11128d abstractC11128d, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        C11354a.m1321a(httpRequestExecutor, "HTTP request executor");
        C11354a.m1321a(abstractC11128d, "Client connection manager");
        C11354a.m1321a(connectionReuseStrategy, "Connection reuse strategy");
        C11354a.m1321a(connectionKeepAliveStrategy, "Connection keep alive strategy");
        this.f36256a = httpRequestExecutor;
        this.f36257b = abstractC11128d;
        this.f36258c = connectionReuseStrategy;
        this.f36259d = connectionKeepAliveStrategy;
    }

    /* renamed from: a */
    static void m1521a(C11050n c11050n, HttpRoute httpRoute) {
        try {
            URI uri = c11050n.getURI();
            if (uri == null) {
                return;
            }
            c11050n.m2222a(uri.isAbsolute() ? C11080i.m2098a(uri, (HttpHost) null, true) : C11080i.m2103a(uri));
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid URI: " + c11050n.getRequestLine().getUri(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1 A[Catch: e -> 0x005a, HttpException -> 0x012c, IOException -> 0x0137, RuntimeException -> 0x013c, TryCatch #3 {IOException -> 0x0137, e -> 0x005a, HttpException -> 0x012c, RuntimeException -> 0x013c, blocks: (B:47:0x0049, B:49:0x004f, B:50:0x0059, B:51:0x0088, B:17:0x008b, B:19:0x0091, B:21:0x0099, B:23:0x00a1, B:25:0x00a7, B:26:0x00aa, B:28:0x00b2, B:30:0x00be, B:32:0x00d1, B:33:0x00d5, B:35:0x0101, B:36:0x010f, B:38:0x0115, B:40:0x0131, B:42:0x011b, B:44:0x0128), top: B:46:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101 A[Catch: e -> 0x005a, HttpException -> 0x012c, IOException -> 0x0137, RuntimeException -> 0x013c, TryCatch #3 {IOException -> 0x0137, e -> 0x005a, HttpException -> 0x012c, RuntimeException -> 0x013c, blocks: (B:47:0x0049, B:49:0x004f, B:50:0x0059, B:51:0x0088, B:17:0x008b, B:19:0x0091, B:21:0x0099, B:23:0x00a1, B:25:0x00a7, B:26:0x00aa, B:28:0x00b2, B:30:0x00be, B:32:0x00d1, B:33:0x00d5, B:35:0x0101, B:36:0x010f, B:38:0x0115, B:40:0x0131, B:42:0x011b, B:44:0x0128), top: B:46:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128 A[Catch: e -> 0x005a, HttpException -> 0x012c, IOException -> 0x0137, RuntimeException -> 0x013c, TRY_LEAVE, TryCatch #3 {IOException -> 0x0137, e -> 0x005a, HttpException -> 0x012c, RuntimeException -> 0x013c, blocks: (B:47:0x0049, B:49:0x004f, B:50:0x0059, B:51:0x0088, B:17:0x008b, B:19:0x0091, B:21:0x0099, B:23:0x00a1, B:25:0x00a7, B:26:0x00aa, B:28:0x00b2, B:30:0x00be, B:32:0x00d1, B:33:0x00d5, B:35:0x0101, B:36:0x010f, B:38:0x0115, B:40:0x0131, B:42:0x011b, B:44:0x0128), top: B:46:0x0049 }] */
    @Override // org.p286a.p287a.p306i.p312f.AbstractC11281b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC11038b mo1511a(HttpRoute httpRoute, C11050n c11050n, C11060a c11060a, AbstractC11042f abstractC11042f) {
        Object obj;
        HttpResponse execute;
        HttpEntity entity;
        C11354a.m1321a(httpRoute, "HTTP route");
        C11354a.m1321a(c11050n, "HTTP request");
        C11354a.m1321a(c11060a, "HTTP context");
        m1521a(c11050n, httpRoute);
        AbstractC11097a mo1604a = this.f36257b.mo1604a(httpRoute, (Object) null);
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
            C11282c c11282c = new C11282c(this.f36257b, mo1594a);
            if (abstractC11042f != null) {
                try {
                    if (abstractC11042f.isAborted()) {
                        c11282c.close();
                        throw new C11288i("Request aborted");
                    }
                    abstractC11042f.mo2231a(c11282c);
                } catch (IOException e) {
                    c11282c.abortConnection();
                    throw e;
                } catch (C11215e e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Connection has been shut down");
                    interruptedIOException.initCause(e2);
                    throw interruptedIOException;
                } catch (HttpException e3) {
                    c11282c.abortConnection();
                    throw e3;
                } catch (RuntimeException e4) {
                    c11282c.abortConnection();
                    throw e4;
                }
            }
            if (!mo1594a.isOpen()) {
                int m2281n = m2161n.m2281n();
                AbstractC11128d abstractC11128d = this.f36257b;
                if (m2281n <= 0) {
                    m2281n = 0;
                }
                abstractC11128d.mo1611a(mo1594a, httpRoute, m2281n, c11060a);
                this.f36257b.mo1602b(mo1594a, httpRoute, c11060a);
            }
            int m2280o = m2161n.m2280o();
            if (m2280o >= 0) {
                mo1594a.setSocketTimeout(m2280o);
            }
            HttpUriRequest m2223a = c11050n.m2223a();
            if (m2223a instanceof HttpUriRequest) {
                URI uri = m2223a.getURI();
                if (uri.isAbsolute()) {
                    obj = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
                    if (obj == null) {
                        obj = httpRoute.getTargetHost();
                    }
                    c11060a.setAttribute(C11344c.f36428q, obj);
                    c11060a.setAttribute(C11344c.f36426o, c11050n);
                    c11060a.setAttribute(C11344c.f36425n, mo1594a);
                    c11060a.setAttribute(C11060a.f35608a, httpRoute);
                    this.f36260e.process(c11050n, c11060a);
                    execute = this.f36256a.execute(c11050n, mo1594a, c11060a);
                    this.f36260e.process(execute, c11060a);
                    if (!this.f36258c.keepAlive(execute, c11060a)) {
                        c11282c.m1531a(this.f36259d.getKeepAliveDuration(execute, c11060a), TimeUnit.MILLISECONDS);
                        c11282c.m1528c();
                    } else {
                        c11282c.m1527d();
                    }
                    entity = execute.getEntity();
                    if (entity == null && entity.isStreaming()) {
                        return new C11283d(execute, c11282c);
                    }
                    c11282c.releaseConnection();
                    return new C11283d(execute, null);
                }
            }
            obj = null;
            if (obj == null) {
            }
            c11060a.setAttribute(C11344c.f36428q, obj);
            c11060a.setAttribute(C11344c.f36426o, c11050n);
            c11060a.setAttribute(C11344c.f36425n, mo1594a);
            c11060a.setAttribute(C11060a.f35608a, httpRoute);
            this.f36260e.process(c11050n, c11060a);
            execute = this.f36256a.execute(c11050n, mo1594a, c11060a);
            this.f36260e.process(execute, c11060a);
            if (!this.f36258c.keepAlive(execute, c11060a)) {
            }
            entity = execute.getEntity();
            if (entity == null) {
            }
            c11282c.releaseConnection();
            return new C11283d(execute, null);
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            throw new C11288i("Request aborted", e5);
        } catch (ExecutionException e6) {
            e = e6;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            throw new C11288i("Request execution failed", e);
        }
    }
}
