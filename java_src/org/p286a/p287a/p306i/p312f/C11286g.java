package org.p286a.p287a.p306i.p312f;

import android.util.Log;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpProcessor;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.p293c.AbstractC11038b;
import org.p286a.p287a.p290c.p293c.AbstractC11042f;
import org.p286a.p287a.p290c.p293c.C11050n;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p290c.p296f.C11080i;
import org.p286a.p287a.p306i.p308b.C11183e;
import org.p286a.p287a.p319n.C11344c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.f.g */
/* loaded from: classes2.dex */
public class C11286g implements AbstractC11281b {

    /* renamed from: a */
    private static final String f36261a = "HttpClient";

    /* renamed from: b */
    private final AbstractC11281b f36262b;

    /* renamed from: c */
    private final HttpProcessor f36263c;

    public C11286g(AbstractC11281b abstractC11281b, HttpProcessor httpProcessor) {
        C11354a.m1321a(abstractC11281b, "HTTP client request executor");
        C11354a.m1321a(httpProcessor, "HTTP protocol processor");
        this.f36262b = abstractC11281b;
        this.f36263c = httpProcessor;
    }

    @Override // org.p286a.p287a.p306i.p312f.AbstractC11281b
    /* renamed from: a */
    public AbstractC11038b mo1511a(HttpRoute httpRoute, C11050n c11050n, C11060a c11060a, AbstractC11042f abstractC11042f) {
        URI uri;
        String userInfo;
        C11354a.m1321a(httpRoute, "HTTP route");
        C11354a.m1321a(c11050n, "HTTP request");
        C11354a.m1321a(c11060a, "HTTP context");
        HttpUriRequest m2223a = c11050n.m2223a();
        if (m2223a instanceof HttpUriRequest) {
            uri = m2223a.getURI();
        } else {
            String uri2 = m2223a.getRequestLine().getUri();
            try {
                uri = URI.create(uri2);
            } catch (IllegalArgumentException e) {
                if (Log.isLoggable(f36261a, 3)) {
                    Log.d(f36261a, "Unable to parse '" + uri2 + "' as a valid URI; request URI and Host header may be inconsistent", e);
                }
                uri = null;
            }
        }
        c11050n.m2222a(uri);
        m1520a(c11050n, httpRoute);
        HttpHost httpHost = (HttpHost) c11050n.getParams().getParameter("http.virtual-host");
        if (httpHost != null && httpHost.getPort() == -1) {
            int port = httpRoute.getTargetHost().getPort();
            if (port != -1) {
                httpHost = new HttpHost(httpHost.getHostName(), port, httpHost.getSchemeName());
            }
            if (Log.isLoggable(f36261a, 3)) {
                Log.d(f36261a, "Using virtual host" + httpHost);
            }
        }
        if (httpHost == null) {
            httpHost = (uri == null || !uri.isAbsolute() || uri.getHost() == null) ? null : new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
        }
        HttpHost targetHost = httpHost == null ? httpRoute.getTargetHost() : httpHost;
        if (uri != null && (userInfo = uri.getUserInfo()) != null) {
            CredentialsProvider m2166i = c11060a.m2166i();
            if (m2166i == null) {
                m2166i = new C11183e();
                c11060a.m2177a(m2166i);
            }
            m2166i.setCredentials(new AuthScope(targetHost.getHostName(), targetHost.getPort()), new UsernamePasswordCredentials(userInfo));
        }
        c11060a.setAttribute(C11344c.f36428q, targetHost);
        c11060a.setAttribute(C11060a.f35608a, httpRoute);
        c11060a.setAttribute(C11344c.f36426o, c11050n);
        this.f36263c.process(c11050n, c11060a);
        AbstractC11038b mo1511a = this.f36262b.mo1511a(httpRoute, c11050n, c11060a, abstractC11042f);
        try {
            c11060a.setAttribute(C11344c.f36427p, mo1511a);
            this.f36263c.process(mo1511a, c11060a);
            return mo1511a;
        } catch (HttpException e2) {
            mo1511a.close();
            throw e2;
        } catch (IOException e3) {
            mo1511a.close();
            throw e3;
        } catch (RuntimeException e4) {
            mo1511a.close();
            throw e4;
        }
    }

    /* renamed from: a */
    void m1520a(C11050n c11050n, HttpRoute httpRoute) {
        try {
            URI uri = c11050n.getURI();
            if (uri == null) {
                return;
            }
            c11050n.m2222a((httpRoute.getProxyHost() == null || httpRoute.isTunnelled()) ? uri.isAbsolute() ? C11080i.m2098a(uri, (HttpHost) null, true) : C11080i.m2103a(uri) : !uri.isAbsolute() ? C11080i.m2098a(uri, httpRoute.getTargetHost(), true) : C11080i.m2103a(uri));
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid URI: " + c11050n.getRequestLine().getUri(), e);
        }
    }
}
