package org.p286a.p287a.p290c.p295e;

import java.net.URI;
import java.util.List;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.protocol.HttpContext;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p289b.AbstractC11014c;
import org.p286a.p287a.p289b.C11015d;
import org.p286a.p287a.p290c.AbstractC11019a;
import org.p286a.p287a.p290c.p291a.C11022c;
import org.p286a.p287a.p298e.AbstractC11089b;
import org.p286a.p287a.p304g.AbstractC11138b;
import org.p286a.p287a.p319n.C11342a;
import org.p286a.p287a.p319n.C11344c;
@AbstractC11009c
/* renamed from: org.a.a.c.e.a */
/* loaded from: classes2.dex */
public class C11060a extends C11344c {

    /* renamed from: a */
    public static final String f35608a = "http.route";

    /* renamed from: b */
    public static final String f35609b = "http.protocol.redirect-locations";

    /* renamed from: c */
    public static final String f35610c = "http.cookiespec-registry";

    /* renamed from: d */
    public static final String f35611d = "http.cookie-spec";

    /* renamed from: e */
    public static final String f35612e = "http.cookie-origin";

    /* renamed from: f */
    public static final String f35613f = "http.cookie-store";

    /* renamed from: g */
    public static final String f35614g = "http.auth.credentials-provider";

    /* renamed from: h */
    public static final String f35615h = "http.auth.auth-cache";

    /* renamed from: i */
    public static final String f35616i = "http.auth.target-scope";

    /* renamed from: j */
    public static final String f35617j = "http.auth.proxy-scope";

    /* renamed from: k */
    public static final String f35618k = "http.user-token";

    /* renamed from: l */
    public static final String f35619l = "http.authscheme-registry";

    /* renamed from: m */
    public static final String f35620m = "http.request-config";

    public C11060a() {
    }

    public C11060a(HttpContext httpContext) {
        super(httpContext);
    }

    /* renamed from: a */
    public static C11060a m2184a() {
        return new C11060a(new C11342a());
    }

    /* renamed from: a */
    public static C11060a m2176a(HttpContext httpContext) {
        return httpContext instanceof C11060a ? (C11060a) httpContext : new C11060a(httpContext);
    }

    /* renamed from: b */
    private <T> AbstractC11089b<T> m2174b(String str, Class<T> cls) {
        return (AbstractC11089b) a(str, AbstractC11089b.class);
    }

    /* renamed from: a */
    public <T> T m2183a(Class<T> cls) {
        return (T) a(f35618k, cls);
    }

    /* renamed from: a */
    public void m2182a(Object obj) {
        setAttribute(f35618k, obj);
    }

    /* renamed from: a */
    public void m2181a(C11022c c11022c) {
        setAttribute(f35620m, c11022c);
    }

    /* renamed from: a */
    public void m2180a(AbstractC11019a abstractC11019a) {
        setAttribute(f35615h, abstractC11019a);
    }

    /* renamed from: a */
    public void m2179a(AbstractC11089b<AbstractC11138b> abstractC11089b) {
        setAttribute(f35610c, abstractC11089b);
    }

    /* renamed from: a */
    public void m2178a(CookieStore cookieStore) {
        setAttribute(f35613f, cookieStore);
    }

    /* renamed from: a */
    public void m2177a(CredentialsProvider credentialsProvider) {
        setAttribute(f35614g, credentialsProvider);
    }

    /* renamed from: b */
    public RouteInfo m2175b() {
        return (RouteInfo) a(f35608a, HttpRoute.class);
    }

    /* renamed from: b */
    public void m2173b(AbstractC11089b<AbstractC11014c> abstractC11089b) {
        setAttribute(f35619l, abstractC11089b);
    }

    /* renamed from: c */
    public List<URI> m2172c() {
        return (List) a("http.protocol.redirect-locations", List.class);
    }

    /* renamed from: d */
    public CookieStore m2171d() {
        return (CookieStore) a(f35613f, CookieStore.class);
    }

    /* renamed from: e */
    public CookieSpec m2170e() {
        return (CookieSpec) a(f35611d, CookieSpec.class);
    }

    /* renamed from: f */
    public CookieOrigin m2169f() {
        return (CookieOrigin) a(f35612e, CookieOrigin.class);
    }

    /* renamed from: g */
    public AbstractC11089b<AbstractC11138b> m2168g() {
        return m2174b(f35610c, AbstractC11138b.class);
    }

    /* renamed from: h */
    public AbstractC11089b<AbstractC11014c> m2167h() {
        return m2174b(f35619l, AbstractC11014c.class);
    }

    /* renamed from: i */
    public CredentialsProvider m2166i() {
        return (CredentialsProvider) a(f35614g, CredentialsProvider.class);
    }

    /* renamed from: j */
    public AbstractC11019a m2165j() {
        return (AbstractC11019a) a(f35615h, AbstractC11019a.class);
    }

    /* renamed from: k */
    public C11015d m2164k() {
        return (C11015d) a(f35616i, C11015d.class);
    }

    /* renamed from: l */
    public C11015d m2163l() {
        return (C11015d) a(f35617j, C11015d.class);
    }

    /* renamed from: m */
    public Object m2162m() {
        return getAttribute(f35618k);
    }

    /* renamed from: n */
    public C11022c m2161n() {
        C11022c c11022c = (C11022c) a(f35620m, C11022c.class);
        return c11022c != null ? c11022c : C11022c.f35527a;
    }
}
