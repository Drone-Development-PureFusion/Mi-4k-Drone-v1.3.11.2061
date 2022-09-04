package p005b.p006a.p007a.p029b.p042h.p044b;

import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import p005b.p006a.p007a.p029b.p055o.AbstractC0661e;
/* renamed from: b.a.a.b.h.b.k */
/* loaded from: classes.dex */
public class C0524k {

    /* renamed from: a */
    private static final String f809a = "javax.net.ssl.keyStore";

    /* renamed from: b */
    private static final String f810b = "javax.net.ssl.trustStore";

    /* renamed from: c */
    private C0517d f811c;

    /* renamed from: d */
    private C0517d f812d;

    /* renamed from: e */
    private C0527n f813e;

    /* renamed from: f */
    private C0516c f814f;

    /* renamed from: g */
    private C0528o f815g;

    /* renamed from: h */
    private String f816h;

    /* renamed from: i */
    private String f817i;

    /* renamed from: b */
    private KeyManager[] m38997b(AbstractC0661e abstractC0661e) {
        if (m38999b() == null) {
            return null;
        }
        KeyStore m39025a = m38999b().m39025a();
        abstractC0661e.mo38543d("key store of type '" + m39025a.getType() + "' provider '" + m39025a.getProvider() + "': " + m38999b().m39023b());
        KeyManagerFactory m39030a = m38989e().m39030a();
        abstractC0661e.mo38543d("key manager algorithm '" + m39030a.getAlgorithm() + "' provider '" + m39030a.getProvider() + "'");
        m39030a.init(m39025a, m38999b().m39017e().toCharArray());
        return m39030a.getKeyManagers();
    }

    /* renamed from: c */
    private C0517d m38993c(String str) {
        if (System.getProperty(str) == null) {
            return null;
        }
        C0517d c0517d = new C0517d();
        c0517d.m39024a(m38990d(str));
        c0517d.m39020c(System.getProperty(str + "Provider"));
        c0517d.m39018d(System.getProperty(str + "Password"));
        c0517d.m39022b(System.getProperty(str + "Type"));
        return c0517d;
    }

    /* renamed from: c */
    private TrustManager[] m38994c(AbstractC0661e abstractC0661e) {
        if (m38995c() == null) {
            return null;
        }
        KeyStore m39025a = m38995c().m39025a();
        abstractC0661e.mo38543d("trust store of type '" + m39025a.getType() + "' provider '" + m39025a.getProvider() + "': " + m38995c().m39023b());
        TrustManagerFactory m38962a = m38988f().m38962a();
        abstractC0661e.mo38543d("trust manager algorithm '" + m38962a.getAlgorithm() + "' provider '" + m38962a.getProvider() + "'");
        m38962a.init(m39025a);
        return m38962a.getTrustManagers();
    }

    /* renamed from: d */
    private String m38990d(String str) {
        String property = System.getProperty(str);
        return (property == null || property.startsWith("file:")) ? property : "file:" + property;
    }

    /* renamed from: d */
    private SecureRandom m38991d(AbstractC0661e abstractC0661e) {
        SecureRandom m38967a = m38992d().m38967a();
        abstractC0661e.mo38543d("secure random algorithm '" + m38967a.getAlgorithm() + "' provider '" + m38967a.getProvider() + "'");
        return m38967a;
    }

    /* renamed from: a */
    public SSLContext m39001a(AbstractC0661e abstractC0661e) {
        SSLContext sSLContext = m38986h() != null ? SSLContext.getInstance(m38987g(), m38986h()) : SSLContext.getInstance(m38987g());
        abstractC0661e.mo38543d("SSL protocol '" + sSLContext.getProtocol() + "' provider '" + sSLContext.getProvider() + "'");
        sSLContext.init(m38997b(abstractC0661e), m38994c(abstractC0661e), m38991d(abstractC0661e));
        return sSLContext;
    }

    /* renamed from: a */
    public void m39005a(C0516c c0516c) {
        this.f814f = c0516c;
    }

    /* renamed from: a */
    public void m39004a(C0517d c0517d) {
        this.f811c = c0517d;
    }

    /* renamed from: a */
    public void m39003a(C0527n c0527n) {
        this.f813e = c0527n;
    }

    /* renamed from: a */
    public void m39002a(C0528o c0528o) {
        this.f815g = c0528o;
    }

    /* renamed from: a */
    public void m39000a(String str) {
        this.f816h = str;
    }

    /* renamed from: b */
    public C0517d m38999b() {
        if (this.f811c == null) {
            this.f811c = m38993c(f809a);
        }
        return this.f811c;
    }

    /* renamed from: b */
    public void m38998b(C0517d c0517d) {
        this.f812d = c0517d;
    }

    /* renamed from: b */
    public void m38996b(String str) {
        this.f817i = str;
    }

    /* renamed from: c */
    public C0517d m38995c() {
        if (this.f812d == null) {
            this.f812d = m38993c(f810b);
        }
        return this.f812d;
    }

    /* renamed from: d */
    public C0527n m38992d() {
        return this.f813e == null ? new C0527n() : this.f813e;
    }

    /* renamed from: e */
    public C0516c m38989e() {
        return this.f814f == null ? new C0516c() : this.f814f;
    }

    /* renamed from: f */
    public C0528o m38988f() {
        return this.f815g == null ? new C0528o() : this.f815g;
    }

    /* renamed from: g */
    public String m38987g() {
        return this.f816h == null ? "SSL" : this.f816h;
    }

    /* renamed from: h */
    public String m38986h() {
        return this.f817i;
    }
}
