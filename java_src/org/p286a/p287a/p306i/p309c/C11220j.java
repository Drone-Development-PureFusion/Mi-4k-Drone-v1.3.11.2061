package org.p286a.p287a.p306i.p309c;

import com.facebook.common.util.UriUtil;
import java.net.InetAddress;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p290c.p291a.C11022c;
import org.p286a.p287a.p290c.p295e.C11060a;
import org.p286a.p287a.p299f.AbstractC11134i;
import org.p286a.p287a.p299f.C11135j;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.i.c.j */
/* loaded from: classes2.dex */
public class C11220j implements HttpRoutePlanner {

    /* renamed from: a */
    private final AbstractC11134i f36127a;

    public C11220j(AbstractC11134i abstractC11134i) {
        this.f36127a = abstractC11134i == null ? C11221k.f36128a : abstractC11134i;
    }

    /* renamed from: a */
    protected HttpHost mo1581a(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return null;
    }

    public HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        C11354a.m1321a(httpRequest, "Request");
        if (httpHost == null) {
            throw new ProtocolException("Target host is not specified");
        }
        C11022c m2161n = C11060a.m2176a(httpContext).m2161n();
        InetAddress m2292c = m2161n.m2292c();
        HttpHost m2293b = m2161n.m2293b();
        if (m2293b == null) {
            m2293b = mo1581a(httpHost, httpRequest, httpContext);
        }
        if (httpHost.getPort() <= 0) {
            try {
                httpHost = new HttpHost(httpHost.getHostName(), this.f36127a.mo1630a(httpHost), httpHost.getSchemeName());
            } catch (C11135j e) {
                throw new HttpException(e.getMessage());
            }
        }
        boolean equalsIgnoreCase = httpHost.getSchemeName().equalsIgnoreCase(UriUtil.HTTPS_SCHEME);
        return m2293b == null ? new HttpRoute(httpHost, m2292c, equalsIgnoreCase) : new HttpRoute(httpHost, m2292c, m2293b, equalsIgnoreCase);
    }
}
