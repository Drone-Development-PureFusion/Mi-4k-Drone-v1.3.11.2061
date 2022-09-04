package org.p286a.p287a.p290c.p291a;

import java.net.InetAddress;
import java.util.Collection;
import org.apache.http.HttpHost;
/* renamed from: org.a.a.c.a.c */
/* loaded from: classes2.dex */
public class C11022c implements Cloneable {

    /* renamed from: a */
    public static final C11022c f35527a = new C11023a().m2277a();

    /* renamed from: b */
    private final boolean f35528b;

    /* renamed from: c */
    private final HttpHost f35529c;

    /* renamed from: d */
    private final InetAddress f35530d;

    /* renamed from: e */
    private final boolean f35531e;

    /* renamed from: f */
    private final String f35532f;

    /* renamed from: g */
    private final boolean f35533g;

    /* renamed from: h */
    private final boolean f35534h;

    /* renamed from: i */
    private final boolean f35535i;

    /* renamed from: j */
    private final int f35536j;

    /* renamed from: k */
    private final boolean f35537k;

    /* renamed from: l */
    private final Collection<String> f35538l;

    /* renamed from: m */
    private final Collection<String> f35539m;

    /* renamed from: n */
    private final int f35540n;

    /* renamed from: o */
    private final int f35541o;

    /* renamed from: p */
    private final int f35542p;

    /* renamed from: org.a.a.c.a.c$a */
    /* loaded from: classes2.dex */
    public static class C11023a {

        /* renamed from: a */
        private boolean f35543a;

        /* renamed from: b */
        private HttpHost f35544b;

        /* renamed from: c */
        private InetAddress f35545c;

        /* renamed from: e */
        private String f35547e;

        /* renamed from: h */
        private boolean f35550h;

        /* renamed from: k */
        private Collection<String> f35553k;

        /* renamed from: l */
        private Collection<String> f35554l;

        /* renamed from: d */
        private boolean f35546d = true;

        /* renamed from: f */
        private boolean f35548f = true;

        /* renamed from: i */
        private int f35551i = 50;

        /* renamed from: g */
        private boolean f35549g = true;

        /* renamed from: j */
        private boolean f35552j = true;

        /* renamed from: m */
        private int f35555m = -1;

        /* renamed from: n */
        private int f35556n = -1;

        /* renamed from: o */
        private int f35557o = -1;

        C11023a() {
        }

        /* renamed from: a */
        public C11023a m2276a(int i) {
            this.f35551i = i;
            return this;
        }

        /* renamed from: a */
        public C11023a m2275a(String str) {
            this.f35547e = str;
            return this;
        }

        /* renamed from: a */
        public C11023a m2274a(InetAddress inetAddress) {
            this.f35545c = inetAddress;
            return this;
        }

        /* renamed from: a */
        public C11023a m2273a(Collection<String> collection) {
            this.f35553k = collection;
            return this;
        }

        /* renamed from: a */
        public C11023a m2272a(HttpHost httpHost) {
            this.f35544b = httpHost;
            return this;
        }

        /* renamed from: a */
        public C11023a m2271a(boolean z) {
            this.f35543a = z;
            return this;
        }

        /* renamed from: a */
        public C11022c m2277a() {
            return new C11022c(this.f35543a, this.f35544b, this.f35545c, this.f35546d, this.f35547e, this.f35548f, this.f35549g, this.f35550h, this.f35551i, this.f35552j, this.f35553k, this.f35554l, this.f35555m, this.f35556n, this.f35557o);
        }

        /* renamed from: b */
        public C11023a m2270b(int i) {
            this.f35555m = i;
            return this;
        }

        /* renamed from: b */
        public C11023a m2269b(Collection<String> collection) {
            this.f35554l = collection;
            return this;
        }

        /* renamed from: b */
        public C11023a m2268b(boolean z) {
            this.f35546d = z;
            return this;
        }

        /* renamed from: c */
        public C11023a m2267c(int i) {
            this.f35556n = i;
            return this;
        }

        /* renamed from: c */
        public C11023a m2266c(boolean z) {
            this.f35548f = z;
            return this;
        }

        /* renamed from: d */
        public C11023a m2265d(int i) {
            this.f35557o = i;
            return this;
        }

        /* renamed from: d */
        public C11023a m2264d(boolean z) {
            this.f35549g = z;
            return this;
        }

        /* renamed from: e */
        public C11023a m2263e(boolean z) {
            this.f35550h = z;
            return this;
        }

        /* renamed from: f */
        public C11023a m2262f(boolean z) {
            this.f35552j = z;
            return this;
        }
    }

    C11022c(boolean z, HttpHost httpHost, InetAddress inetAddress, boolean z2, String str, boolean z3, boolean z4, boolean z5, int i, boolean z6, Collection<String> collection, Collection<String> collection2, int i2, int i3, int i4) {
        this.f35528b = z;
        this.f35529c = httpHost;
        this.f35530d = inetAddress;
        this.f35531e = z2;
        this.f35532f = str;
        this.f35533g = z3;
        this.f35534h = z4;
        this.f35535i = z5;
        this.f35536j = i;
        this.f35537k = z6;
        this.f35538l = collection;
        this.f35539m = collection2;
        this.f35540n = i2;
        this.f35541o = i3;
        this.f35542p = i4;
    }

    /* renamed from: a */
    public static C11023a m2294a(C11022c c11022c) {
        return new C11023a().m2271a(c11022c.m2295a()).m2272a(c11022c.m2293b()).m2274a(c11022c.m2292c()).m2268b(c11022c.m2291d()).m2275a(c11022c.m2290e()).m2266c(c11022c.m2289f()).m2264d(c11022c.m2288g()).m2263e(c11022c.m2287h()).m2276a(c11022c.m2286i()).m2262f(c11022c.m2285j()).m2273a(c11022c.m2284k()).m2269b(c11022c.m2283l()).m2270b(c11022c.m2282m()).m2267c(c11022c.m2281n()).m2265d(c11022c.m2280o());
    }

    /* renamed from: q */
    public static C11023a m2278q() {
        return new C11023a();
    }

    /* renamed from: a */
    public boolean m2295a() {
        return this.f35528b;
    }

    /* renamed from: b */
    public HttpHost m2293b() {
        return this.f35529c;
    }

    /* renamed from: c */
    public InetAddress m2292c() {
        return this.f35530d;
    }

    /* renamed from: d */
    public boolean m2291d() {
        return this.f35531e;
    }

    /* renamed from: e */
    public String m2290e() {
        return this.f35532f;
    }

    /* renamed from: f */
    public boolean m2289f() {
        return this.f35533g;
    }

    /* renamed from: g */
    public boolean m2288g() {
        return this.f35534h;
    }

    /* renamed from: h */
    public boolean m2287h() {
        return this.f35535i;
    }

    /* renamed from: i */
    public int m2286i() {
        return this.f35536j;
    }

    /* renamed from: j */
    public boolean m2285j() {
        return this.f35537k;
    }

    /* renamed from: k */
    public Collection<String> m2284k() {
        return this.f35538l;
    }

    /* renamed from: l */
    public Collection<String> m2283l() {
        return this.f35539m;
    }

    /* renamed from: m */
    public int m2282m() {
        return this.f35540n;
    }

    /* renamed from: n */
    public int m2281n() {
        return this.f35541o;
    }

    /* renamed from: o */
    public int m2280o() {
        return this.f35542p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public C11022c clone() {
        return (C11022c) super.clone();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", expectContinueEnabled=").append(this.f35528b);
        sb.append(", proxy=").append(this.f35529c);
        sb.append(", localAddress=").append(this.f35530d);
        sb.append(", staleConnectionCheckEnabled=").append(this.f35531e);
        sb.append(", cookieSpec=").append(this.f35532f);
        sb.append(", redirectsEnabled=").append(this.f35533g);
        sb.append(", relativeRedirectsAllowed=").append(this.f35534h);
        sb.append(", maxRedirects=").append(this.f35536j);
        sb.append(", circularRedirectsAllowed=").append(this.f35535i);
        sb.append(", authenticationEnabled=").append(this.f35537k);
        sb.append(", targetPreferredAuthSchemes=").append(this.f35538l);
        sb.append(", proxyPreferredAuthSchemes=").append(this.f35539m);
        sb.append(", connectionRequestTimeout=").append(this.f35540n);
        sb.append(", connectTimeout=").append(this.f35541o);
        sb.append(", socketTimeout=").append(this.f35542p);
        sb.append("]");
        return sb.toString();
    }
}
