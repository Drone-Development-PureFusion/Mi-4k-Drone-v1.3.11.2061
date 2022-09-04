package p005b.p006a.p007a.p029b.p042h.p044b;

import javax.net.ssl.TrustManagerFactory;
/* renamed from: b.a.a.b.h.b.o */
/* loaded from: classes.dex */
public class C0528o {

    /* renamed from: a */
    private String f828a;

    /* renamed from: b */
    private String f829b;

    /* renamed from: a */
    public TrustManagerFactory m38962a() {
        return m38958c() != null ? TrustManagerFactory.getInstance(m38960b(), m38958c()) : TrustManagerFactory.getInstance(m38960b());
    }

    /* renamed from: a */
    public void m38961a(String str) {
        this.f828a = str;
    }

    /* renamed from: b */
    public String m38960b() {
        return this.f828a == null ? TrustManagerFactory.getDefaultAlgorithm() : this.f828a;
    }

    /* renamed from: b */
    public void m38959b(String str) {
        this.f829b = str;
    }

    /* renamed from: c */
    public String m38958c() {
        return this.f829b;
    }
}
