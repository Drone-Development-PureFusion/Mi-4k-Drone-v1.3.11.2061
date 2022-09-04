package org.p286a.p287a.p306i.p308b;

import java.net.Socket;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.p286a.p287a.C11086e;
import org.p286a.p287a.p289b.C11015d;
import org.p286a.p287a.p290c.p291a.C11020a;
import org.p286a.p287a.p290c.p291a.C11022c;
import org.p286a.p287a.p290c.p294d.C11058a;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p290c.p295e.C11064e;
import org.p286a.p287a.p298e.C11087a;
import org.p286a.p287a.p299f.AbstractC11130e;
import org.p286a.p287a.p299f.AbstractC11133h;
import org.p286a.p287a.p305h.C11141c;
import org.p286a.p287a.p306i.C11294g;
import org.p286a.p287a.p306i.p307a.C11151b;
import org.p286a.p287a.p306i.p307a.C11153d;
import org.p286a.p287a.p306i.p307a.C11155f;
import org.p286a.p287a.p306i.p307a.C11166i;
import org.p286a.p287a.p306i.p309c.C11227q;
import org.p286a.p287a.p306i.p312f.C11293n;
import org.p286a.p287a.p317l.C11327a;
import org.p286a.p287a.p319n.C11342a;
import org.p286a.p287a.p319n.C11344c;
import org.p286a.p287a.p319n.C11347f;
import org.p286a.p287a.p319n.C11351j;
import org.p286a.p287a.p319n.C11352k;
import org.p286a.p287a.p320o.C11354a;
import org.p286a.p287a.p320o.C11357d;
/* renamed from: org.a.a.i.b.ac */
/* loaded from: classes.dex */
public class C11174ac {

    /* renamed from: a */
    private final AbstractC11130e<HttpRoute, AbstractC11133h> f35969a;

    /* renamed from: b */
    private final C11087a f35970b;

    /* renamed from: c */
    private final C11022c f35971c;

    /* renamed from: d */
    private final HttpProcessor f35972d;

    /* renamed from: e */
    private final HttpRequestExecutor f35973e;

    /* renamed from: f */
    private final C11173ab f35974f;

    /* renamed from: g */
    private final C11155f f35975g;

    /* renamed from: h */
    private final C11015d f35976h;

    /* renamed from: i */
    private final AuthSchemeRegistry f35977i;

    /* renamed from: j */
    private final ConnectionReuseStrategy f35978j;

    public C11174ac() {
        this(null, null, null);
    }

    public C11174ac(C11022c c11022c) {
        this(null, null, c11022c);
    }

    public C11174ac(AbstractC11130e<HttpRoute, AbstractC11133h> abstractC11130e, C11087a c11087a, C11022c c11022c) {
        this.f35969a = abstractC11130e == null ? C11227q.f36143a : abstractC11130e;
        this.f35970b = c11087a == null ? C11087a.f35734a : c11087a;
        this.f35971c = c11022c == null ? C11022c.f35527a : c11022c;
        this.f35972d = new C11347f(new C11351j(), new C11064e(), new C11352k());
        this.f35973e = new HttpRequestExecutor();
        this.f35974f = new C11173ab();
        this.f35975g = new C11155f();
        this.f35976h = new C11015d();
        this.f35977i = new AuthSchemeRegistry();
        this.f35977i.register(C11020a.f35517a, new C11151b());
        this.f35977i.register(C11020a.f35518b, new C11153d());
        this.f35977i.register(C11020a.f35519c, new C11166i());
        this.f35978j = new C11294g();
    }

    @Deprecated
    public C11174ac(HttpParams httpParams) {
        this(null, C11327a.m1426c(httpParams), C11058a.m2185a(httpParams));
    }

    /* renamed from: a */
    public Socket m1796a(HttpHost httpHost, HttpHost httpHost2, Credentials credentials) {
        HttpResponse execute;
        C11354a.m1321a(httpHost, "Proxy host");
        C11354a.m1321a(httpHost2, "Target host");
        C11354a.m1321a(credentials, "Credentials");
        HttpHost httpHost3 = httpHost2.getPort() <= 0 ? new HttpHost(httpHost2.getHostName(), 80, httpHost2.getSchemeName()) : httpHost2;
        HttpRoute httpRoute = new HttpRoute(httpHost3, this.f35971c.m2292c(), httpHost, false, RouteInfo.TunnelType.TUNNELLED, RouteInfo.LayerType.PLAIN);
        AbstractC11133h mo1620a = this.f35969a.mo1620a(httpRoute, this.f35970b);
        C11342a c11342a = new C11342a();
        HttpRequest basicHttpRequest = new BasicHttpRequest("CONNECT", httpHost3.toHostString(), HttpVersion.HTTP_1_1);
        C11183e c11183e = new C11183e();
        c11183e.setCredentials(new AuthScope(httpHost.getHostName(), httpHost.getPort()), credentials);
        c11342a.setAttribute(C11344c.f36428q, httpHost2);
        c11342a.setAttribute(C11344c.f36425n, mo1620a);
        c11342a.setAttribute(C11344c.f36426o, basicHttpRequest);
        c11342a.setAttribute(C11060a.f35608a, httpRoute);
        c11342a.setAttribute(C11060a.f35617j, this.f35976h);
        c11342a.setAttribute(C11060a.f35614g, c11183e);
        c11342a.setAttribute(C11060a.f35619l, this.f35977i);
        c11342a.setAttribute(C11060a.f35620m, this.f35971c);
        this.f35973e.preProcess(basicHttpRequest, this.f35972d, c11342a);
        while (true) {
            if (!mo1620a.isOpen()) {
                mo1620a.mo1644a(new Socket(httpHost.getHostName(), httpHost.getPort()));
            }
            this.f35975g.m1908a(basicHttpRequest, this.f35976h, c11342a);
            execute = this.f35973e.execute(basicHttpRequest, mo1620a, c11342a);
            if (execute.getStatusLine().getStatusCode() < 200) {
                throw new HttpException("Unexpected response to CONNECT request: " + execute.getStatusLine());
            }
            if (!this.f35975g.m1909a(httpHost, execute, this.f35974f, this.f35976h, c11342a) || !this.f35975g.m1905b(httpHost, execute, this.f35974f, this.f35976h, c11342a)) {
                break;
            }
            if (this.f35978j.keepAlive(execute, c11342a)) {
                C11357d.m1303b(execute.getEntity());
            } else {
                mo1620a.close();
            }
            basicHttpRequest.removeHeaders(C11086e.f35692N);
        }
        if (execute.getStatusLine().getStatusCode() > 299) {
            HttpEntity entity = execute.getEntity();
            if (entity != null) {
                execute.setEntity(new C11141c(entity));
            }
            mo1620a.close();
            throw new C11293n("CONNECT refused by proxy: " + execute.getStatusLine(), execute);
        }
        return mo1620a.mo1632b();
    }

    @Deprecated
    /* renamed from: a */
    public HttpParams m1797a() {
        return new BasicHttpParams();
    }

    @Deprecated
    /* renamed from: b */
    public AuthSchemeRegistry m1795b() {
        return this.f35977i;
    }
}
