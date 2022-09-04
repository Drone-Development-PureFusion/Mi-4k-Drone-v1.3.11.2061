package org.p286a.p287a.p306i.p308b;

import android.net.SSLCertificateSocketFactory;
import com.facebook.common.util.UriUtil;
import java.io.Closeable;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p289b.AbstractC11014c;
import org.p286a.p287a.p290c.AbstractC11024b;
import org.p286a.p287a.p290c.AbstractC11034c;
import org.p286a.p287a.p290c.AbstractC11057d;
import org.p286a.p287a.p290c.AbstractC11059e;
import org.p286a.p287a.p290c.AbstractC11069f;
import org.p286a.p287a.p290c.p291a.C11020a;
import org.p286a.p287a.p290c.p291a.C11021b;
import org.p286a.p287a.p290c.p291a.C11022c;
import org.p286a.p287a.p290c.p295e.C11061b;
import org.p286a.p287a.p290c.p295e.C11062c;
import org.p286a.p287a.p290c.p295e.C11063d;
import org.p286a.p287a.p290c.p295e.C11064e;
import org.p286a.p287a.p290c.p295e.C11065f;
import org.p286a.p287a.p290c.p295e.C11066g;
import org.p286a.p287a.p290c.p295e.C11067h;
import org.p286a.p287a.p290c.p295e.C11068i;
import org.p286a.p287a.p298e.AbstractC11089b;
import org.p286a.p287a.p298e.C11087a;
import org.p286a.p287a.p298e.C11093e;
import org.p286a.p287a.p298e.C11094f;
import org.p286a.p287a.p299f.AbstractC11128d;
import org.p286a.p287a.p299f.AbstractC11134i;
import org.p286a.p287a.p299f.p301b.AbstractC11108b;
import org.p286a.p287a.p299f.p301b.C11109c;
import org.p286a.p287a.p299f.p302c.C11118g;
import org.p286a.p287a.p304g.AbstractC11138b;
import org.p286a.p287a.p306i.C11294g;
import org.p286a.p287a.p306i.C11319k;
import org.p286a.p287a.p306i.p307a.C11151b;
import org.p286a.p287a.p306i.p307a.C11153d;
import org.p286a.p287a.p306i.p307a.C11166i;
import org.p286a.p287a.p306i.p309c.C11219i;
import org.p286a.p287a.p306i.p309c.C11220j;
import org.p286a.p287a.p306i.p309c.C11221k;
import org.p286a.p287a.p306i.p309c.C11228r;
import org.p286a.p287a.p306i.p309c.C11233t;
import org.p286a.p287a.p306i.p310d.C11244ag;
import org.p286a.p287a.p306i.p310d.C11256k;
import org.p286a.p287a.p306i.p310d.C11258m;
import org.p286a.p287a.p306i.p310d.C11266r;
import org.p286a.p287a.p306i.p310d.C11269u;
import org.p286a.p287a.p306i.p310d.C11274z;
import org.p286a.p287a.p306i.p312f.AbstractC11281b;
import org.p286a.p287a.p306i.p312f.C11280a;
import org.p286a.p287a.p306i.p312f.C11284e;
import org.p286a.p287a.p306i.p312f.C11286g;
import org.p286a.p287a.p306i.p312f.C11287h;
import org.p286a.p287a.p306i.p312f.C11291l;
import org.p286a.p287a.p306i.p312f.C11292m;
import org.p286a.p287a.p319n.C11345d;
import org.p286a.p287a.p319n.C11349h;
import org.p286a.p287a.p319n.C11351j;
import org.p286a.p287a.p319n.C11352k;
import org.p286a.p287a.p320o.C11359f;
import org.p286a.p287a.p320o.C11360g;
@AbstractC11009c
/* renamed from: org.a.a.i.b.s */
/* loaded from: classes2.dex */
public class C11199s {

    /* renamed from: a */
    static final String f36022a;

    /* renamed from: A */
    private CredentialsProvider f36023A;

    /* renamed from: B */
    private String f36024B;

    /* renamed from: C */
    private HttpHost f36025C;

    /* renamed from: D */
    private Collection<? extends Header> f36026D;

    /* renamed from: E */
    private C11094f f36027E;

    /* renamed from: F */
    private C11087a f36028F;

    /* renamed from: G */
    private C11022c f36029G;

    /* renamed from: H */
    private boolean f36030H;

    /* renamed from: I */
    private boolean f36031I;

    /* renamed from: J */
    private boolean f36032J;

    /* renamed from: K */
    private boolean f36033K;

    /* renamed from: L */
    private boolean f36034L;

    /* renamed from: M */
    private boolean f36035M;

    /* renamed from: N */
    private boolean f36036N;

    /* renamed from: O */
    private int f36037O = 0;

    /* renamed from: P */
    private int f36038P = 0;

    /* renamed from: Q */
    private List<Closeable> f36039Q;

    /* renamed from: b */
    private HttpRequestExecutor f36040b;

    /* renamed from: c */
    private X509HostnameVerifier f36041c;

    /* renamed from: d */
    private AbstractC11108b f36042d;

    /* renamed from: e */
    private SSLContext f36043e;

    /* renamed from: f */
    private AbstractC11128d f36044f;

    /* renamed from: g */
    private AbstractC11134i f36045g;

    /* renamed from: h */
    private ConnectionReuseStrategy f36046h;

    /* renamed from: i */
    private ConnectionKeepAliveStrategy f36047i;

    /* renamed from: j */
    private AbstractC11024b f36048j;

    /* renamed from: k */
    private AbstractC11024b f36049k;

    /* renamed from: l */
    private UserTokenHandler f36050l;

    /* renamed from: m */
    private HttpProcessor f36051m;

    /* renamed from: n */
    private LinkedList<HttpRequestInterceptor> f36052n;

    /* renamed from: o */
    private LinkedList<HttpRequestInterceptor> f36053o;

    /* renamed from: p */
    private LinkedList<HttpResponseInterceptor> f36054p;

    /* renamed from: q */
    private LinkedList<HttpResponseInterceptor> f36055q;

    /* renamed from: r */
    private HttpRequestRetryHandler f36056r;

    /* renamed from: s */
    private HttpRoutePlanner f36057s;

    /* renamed from: t */
    private AbstractC11059e f36058t;

    /* renamed from: u */
    private AbstractC11057d f36059u;

    /* renamed from: v */
    private AbstractC11034c f36060v;

    /* renamed from: w */
    private AbstractC11069f f36061w;

    /* renamed from: x */
    private AbstractC11089b<AbstractC11014c> f36062x;

    /* renamed from: y */
    private AbstractC11089b<AbstractC11138b> f36063y;

    /* renamed from: z */
    private CookieStore f36064z;

    static {
        C11360g m1294a = C11360g.m1294a("org.apache.http.client", C11199s.class.getClassLoader());
        f36022a = "Apache-HttpClient/" + (m1294a != null ? m1294a.m1289c() : C11360g.f36438a) + " (java 1.5)";
    }

    protected C11199s() {
    }

    /* renamed from: a */
    public static C11199s m1727a() {
        return new C11199s();
    }

    /* renamed from: b */
    private static String[] m1693b(String str) {
        if (C11359f.m1296b(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    /* renamed from: a */
    public final C11199s m1726a(int i) {
        this.f36037O = i;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1724a(String str) {
        this.f36024B = str;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1723a(Collection<? extends Header> collection) {
        this.f36026D = collection;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1722a(SSLContext sSLContext) {
        this.f36043e = sSLContext;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1721a(C11022c c11022c) {
        this.f36029G = c11022c;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1720a(AbstractC11024b abstractC11024b) {
        this.f36048j = abstractC11024b;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1719a(AbstractC11034c abstractC11034c) {
        this.f36060v = abstractC11034c;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1718a(AbstractC11057d abstractC11057d) {
        this.f36059u = abstractC11057d;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1717a(AbstractC11059e abstractC11059e) {
        this.f36058t = abstractC11059e;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1716a(AbstractC11069f abstractC11069f) {
        this.f36061w = abstractC11069f;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1715a(C11087a c11087a) {
        this.f36028F = c11087a;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1714a(AbstractC11089b<AbstractC11014c> abstractC11089b) {
        this.f36062x = abstractC11089b;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1713a(C11094f c11094f) {
        this.f36027E = c11094f;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1712a(AbstractC11108b abstractC11108b) {
        this.f36042d = abstractC11108b;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1711a(AbstractC11128d abstractC11128d) {
        this.f36044f = abstractC11128d;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1710a(AbstractC11134i abstractC11134i) {
        this.f36045g = abstractC11134i;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1708a(ConnectionReuseStrategy connectionReuseStrategy) {
        this.f36046h = connectionReuseStrategy;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1707a(HttpHost httpHost) {
        this.f36025C = httpHost;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1706a(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor != null) {
            if (this.f36052n == null) {
                this.f36052n = new LinkedList<>();
            }
            this.f36052n.addFirst(httpRequestInterceptor);
        }
        return this;
    }

    /* renamed from: a */
    public final C11199s m1705a(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor != null) {
            if (this.f36054p == null) {
                this.f36054p = new LinkedList<>();
            }
            this.f36054p.addFirst(httpResponseInterceptor);
        }
        return this;
    }

    /* renamed from: a */
    public final C11199s m1704a(CookieStore cookieStore) {
        this.f36064z = cookieStore;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1703a(CredentialsProvider credentialsProvider) {
        this.f36023A = credentialsProvider;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1702a(HttpRequestRetryHandler httpRequestRetryHandler) {
        this.f36056r = httpRequestRetryHandler;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1701a(UserTokenHandler userTokenHandler) {
        this.f36050l = userTokenHandler;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1700a(ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        this.f36047i = connectionKeepAliveStrategy;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1699a(HttpRoutePlanner httpRoutePlanner) {
        this.f36057s = httpRoutePlanner;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1698a(X509HostnameVerifier x509HostnameVerifier) {
        this.f36041c = x509HostnameVerifier;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1697a(HttpProcessor httpProcessor) {
        this.f36051m = httpProcessor;
        return this;
    }

    /* renamed from: a */
    public final C11199s m1696a(HttpRequestExecutor httpRequestExecutor) {
        this.f36040b = httpRequestExecutor;
        return this;
    }

    /* renamed from: a */
    protected AbstractC11281b m1709a(AbstractC11281b abstractC11281b) {
        return abstractC11281b;
    }

    /* renamed from: a */
    protected void m1725a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        if (this.f36039Q == null) {
            this.f36039Q = new ArrayList();
        }
        this.f36039Q.add(closeable);
    }

    /* renamed from: b */
    public final C11199s m1695b() {
        this.f36036N = true;
        return this;
    }

    /* renamed from: b */
    public final C11199s m1694b(int i) {
        this.f36038P = i;
        return this;
    }

    /* renamed from: b */
    public final C11199s m1692b(AbstractC11024b abstractC11024b) {
        this.f36049k = abstractC11024b;
        return this;
    }

    /* renamed from: b */
    public final C11199s m1691b(AbstractC11089b<AbstractC11138b> abstractC11089b) {
        this.f36063y = abstractC11089b;
        return this;
    }

    /* renamed from: b */
    public final C11199s m1689b(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor != null) {
            if (this.f36053o == null) {
                this.f36053o = new LinkedList<>();
            }
            this.f36053o.addLast(httpRequestInterceptor);
        }
        return this;
    }

    /* renamed from: b */
    public final C11199s m1688b(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor != null) {
            if (this.f36055q == null) {
                this.f36055q = new LinkedList<>();
            }
            this.f36055q.addLast(httpResponseInterceptor);
        }
        return this;
    }

    /* renamed from: b */
    protected AbstractC11281b m1690b(AbstractC11281b abstractC11281b) {
        return abstractC11281b;
    }

    /* renamed from: c */
    public final C11199s m1687c() {
        this.f36034L = true;
        return this;
    }

    /* renamed from: d */
    public final C11199s m1686d() {
        this.f36033K = true;
        return this;
    }

    /* renamed from: e */
    public final C11199s m1685e() {
        this.f36035M = true;
        return this;
    }

    /* renamed from: f */
    public final C11199s m1684f() {
        this.f36032J = true;
        return this;
    }

    /* renamed from: g */
    public final C11199s m1683g() {
        this.f36031I = true;
        return this;
    }

    /* renamed from: h */
    public final C11199s m1682h() {
        this.f36030H = true;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b3  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC11186h m1681i() {
        C11291l c11291l;
        String str;
        ArrayList arrayList = null;
        HttpRequestExecutor httpRequestExecutor = this.f36040b;
        if (httpRequestExecutor == null) {
            httpRequestExecutor = new HttpRequestExecutor();
        }
        AbstractC11128d abstractC11128d = this.f36044f;
        C11228r c11228r = abstractC11128d;
        if (abstractC11128d == null) {
            Object obj = this.f36042d;
            if (obj == null) {
                String[] m1693b = this.f36030H ? m1693b(System.getProperty("https.protocols")) : null;
                String[] m1693b2 = this.f36030H ? m1693b(System.getProperty("https.cipherSuites")) : null;
                X509HostnameVerifier x509HostnameVerifier = this.f36041c;
                X509HostnameVerifier x509HostnameVerifier2 = x509HostnameVerifier == null ? C11118g.f35786e : x509HostnameVerifier;
                obj = this.f36043e != null ? new C11118g(this.f36043e, m1693b, m1693b2, x509HostnameVerifier2) : this.f36030H ? new C11118g((SSLSocketFactory) SSLCertificateSocketFactory.getDefault(0), m1693b, m1693b2, x509HostnameVerifier2) : new C11118g((SSLSocketFactory) SSLCertificateSocketFactory.getDefault(0), x509HostnameVerifier2);
            }
            C11228r c11228r2 = new C11228r(C11093e.m2042a().m2041a(UriUtil.HTTP_SCHEME, C11109c.m2018a()).m2041a(UriUtil.HTTPS_SCHEME, obj).m2040b());
            if (this.f36027E != null) {
                c11228r2.m1614a(this.f36027E);
            }
            if (this.f36028F != null) {
                c11228r2.m1615a(this.f36028F);
            }
            if (this.f36030H && "true".equalsIgnoreCase(System.getProperty("http.keepAlive", "true"))) {
                int parseInt = Integer.parseInt(System.getProperty("http.maxConnections", "5"));
                c11228r2.mo1401b(parseInt);
                c11228r2.mo1404a(parseInt * 2);
            }
            if (this.f36037O > 0) {
                c11228r2.mo1404a(this.f36037O);
            }
            c11228r = c11228r2;
            if (this.f36038P > 0) {
                c11228r2.mo1401b(this.f36038P);
                c11228r = c11228r2;
            }
        }
        ConnectionReuseStrategy connectionReuseStrategy = this.f36046h;
        if (connectionReuseStrategy == null) {
            if (this.f36030H) {
                connectionReuseStrategy = "true".equalsIgnoreCase(System.getProperty("http.keepAlive", "true")) ? C11294g.f36278a : C11319k.f36365a;
            } else {
                connectionReuseStrategy = C11294g.f36278a;
            }
        }
        ConnectionKeepAliveStrategy connectionKeepAliveStrategy = this.f36047i;
        if (connectionKeepAliveStrategy == null) {
            connectionKeepAliveStrategy = C11189k.f35995a;
        }
        AbstractC11024b abstractC11024b = this.f36048j;
        if (abstractC11024b == null) {
            abstractC11024b = C11179ah.f35984a;
        }
        AbstractC11024b abstractC11024b2 = this.f36049k;
        if (abstractC11024b2 == null) {
            abstractC11024b2 = C11173ab.f35968a;
        }
        UserTokenHandler userTokenHandler = this.f36050l;
        if (userTokenHandler == null) {
            userTokenHandler = !this.f36036N ? C11193o.f36006a : C11208z.f36093a;
        }
        AbstractC11281b m1709a = m1709a(new C11284e(httpRequestExecutor, c11228r, connectionReuseStrategy, connectionKeepAliveStrategy, abstractC11024b, abstractC11024b2, userTokenHandler));
        HttpProcessor httpProcessor = this.f36051m;
        if (httpProcessor == null) {
            String str2 = this.f36024B;
            if (str2 == null) {
                if (this.f36030H) {
                    str2 = System.getProperty("http.agent");
                }
                if (str2 == null) {
                    str = f36022a;
                    C11345d m1341a = C11345d.m1341a();
                    if (this.f36052n != null) {
                        Iterator<HttpRequestInterceptor> it2 = this.f36052n.iterator();
                        while (it2.hasNext()) {
                            m1341a.m1340a(it2.next());
                        }
                    }
                    if (this.f36054p != null) {
                        Iterator<HttpResponseInterceptor> it3 = this.f36054p.iterator();
                        while (it3.hasNext()) {
                            m1341a.m1339a(it3.next());
                        }
                    }
                    m1341a.m1328c(new C11065f(this.f36026D), new C11349h(), new C11351j(), new C11064e(), new C11352k(str), new C11066g());
                    if (!this.f36034L) {
                        m1341a.m1330c(new C11062c());
                    }
                    if (!this.f36033K) {
                        m1341a.m1330c(new C11061b());
                    }
                    if (!this.f36035M) {
                        m1341a.m1330c(new C11063d());
                    }
                    if (!this.f36034L) {
                        m1341a.m1329c(new C11068i());
                    }
                    if (!this.f36033K) {
                        m1341a.m1329c(new C11067h());
                    }
                    if (this.f36053o != null) {
                        Iterator<HttpRequestInterceptor> it4 = this.f36053o.iterator();
                        while (it4.hasNext()) {
                            m1341a.m1335b(it4.next());
                        }
                    }
                    if (this.f36055q != null) {
                        Iterator<HttpResponseInterceptor> it5 = this.f36055q.iterator();
                        while (it5.hasNext()) {
                            m1341a.m1334b(it5.next());
                        }
                    }
                    httpProcessor = m1341a.m1336b();
                }
            }
            str = str2;
            C11345d m1341a2 = C11345d.m1341a();
            if (this.f36052n != null) {
            }
            if (this.f36054p != null) {
            }
            m1341a2.m1328c(new C11065f(this.f36026D), new C11349h(), new C11351j(), new C11064e(), new C11352k(str), new C11066g());
            if (!this.f36034L) {
            }
            if (!this.f36033K) {
            }
            if (!this.f36035M) {
            }
            if (!this.f36034L) {
            }
            if (!this.f36033K) {
            }
            if (this.f36053o != null) {
            }
            if (this.f36055q != null) {
            }
            httpProcessor = m1341a2.m1336b();
        }
        AbstractC11281b m1690b = m1690b(new C11286g(m1709a, httpProcessor));
        if (!this.f36032J) {
            HttpRequestRetryHandler httpRequestRetryHandler = this.f36056r;
            if (httpRequestRetryHandler == null) {
                httpRequestRetryHandler = C11190l.f35996a;
            }
            c11291l = new C11291l(m1690b, httpRequestRetryHandler);
        } else {
            c11291l = m1690b;
        }
        HttpRoutePlanner httpRoutePlanner = this.f36057s;
        if (httpRoutePlanner == null) {
            AbstractC11134i abstractC11134i = this.f36045g;
            if (abstractC11134i == null) {
                abstractC11134i = C11221k.f36128a;
            }
            httpRoutePlanner = this.f36025C != null ? new C11219i(this.f36025C, abstractC11134i) : this.f36030H ? new C11233t(abstractC11134i, ProxySelector.getDefault()) : new C11220j(abstractC11134i);
        }
        C11287h c11287h = c11291l;
        if (!this.f36031I) {
            AbstractC11059e abstractC11059e = this.f36058t;
            if (abstractC11059e == null) {
                abstractC11059e = C11191m.f36001b;
            }
            c11287h = new C11287h(c11291l, httpRoutePlanner, abstractC11059e);
        }
        AbstractC11069f abstractC11069f = this.f36061w;
        C11292m c11292m = c11287h;
        if (abstractC11069f != null) {
            c11292m = new C11292m(c11287h, abstractC11069f);
        }
        AbstractC11034c abstractC11034c = this.f36060v;
        AbstractC11057d abstractC11057d = this.f36059u;
        AbstractC11281b c11280a = (abstractC11034c == null || abstractC11057d == null) ? c11292m : new C11280a(c11292m, abstractC11057d, abstractC11034c);
        AbstractC11089b abstractC11089b = this.f36062x;
        if (abstractC11089b == null) {
            abstractC11089b = C11093e.m2042a().m2041a(C11020a.f35517a, new C11151b()).m2041a(C11020a.f35518b, new C11153d()).m2041a(C11020a.f35519c, new C11166i()).m2040b();
        }
        AbstractC11089b abstractC11089b2 = this.f36063y;
        if (abstractC11089b2 == null) {
            abstractC11089b2 = C11093e.m2042a().m2041a(C11021b.f35525d, new C11256k()).m2041a(C11021b.f35524c, new C11244ag()).m2041a(C11021b.f35522a, new C11258m()).m2041a(C11021b.f35523b, new C11269u()).m2041a(C11021b.f35526e, new C11266r()).m2041a("rfc2109", new C11274z()).m2041a("rfc2965", new C11244ag()).m2040b();
        }
        CookieStore cookieStore = this.f36064z;
        if (cookieStore == null) {
            cookieStore = new C11182d();
        }
        CredentialsProvider credentialsProvider = this.f36023A;
        if (credentialsProvider == null) {
            credentialsProvider = this.f36030H ? new C11178ag() : new C11183e();
        }
        C11022c c11022c = this.f36029G != null ? this.f36029G : C11022c.f35527a;
        if (this.f36039Q != null) {
            arrayList = new ArrayList(this.f36039Q);
        }
        return new C11203w(c11280a, c11228r, httpRoutePlanner, abstractC11089b2, abstractC11089b, cookieStore, credentialsProvider, c11022c, arrayList);
    }
}
