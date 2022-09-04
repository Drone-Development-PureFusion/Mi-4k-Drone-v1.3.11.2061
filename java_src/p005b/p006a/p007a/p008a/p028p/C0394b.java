package p005b.p006a.p007a.p008a.p028p;

import p005b.p006a.p007a.p008a.C0274c;
import p005b.p006a.p007a.p008a.C0286f;
import p005b.p006a.p007a.p008a.p024l.AbstractC0355a;
import p005b.p006a.p007a.p008a.p024l.C0356b;
import p005b.p006a.p007a.p029b.p058r.C0720s;
import p005b.p006a.p007a.p029b.p058r.C0724u;
/* renamed from: b.a.a.a.p.b */
/* loaded from: classes.dex */
public class C0394b {

    /* renamed from: a */
    static C0394b f467a = new C0394b();

    /* renamed from: b */
    AbstractC0355a f468b;

    /* renamed from: c */
    Object f469c;

    /* renamed from: a */
    static AbstractC0355a m39433a(C0286f c0286f, String str) {
        return (AbstractC0355a) C0720s.m38393b(str).getConstructor(C0286f.class).newInstance(c0286f);
    }

    /* renamed from: a */
    public static C0394b m39435a() {
        return f467a;
    }

    /* renamed from: a */
    public void m39434a(C0286f c0286f, Object obj) {
        if (this.f469c == null) {
            this.f469c = obj;
        } else if (this.f469c != obj) {
            throw new IllegalAccessException("Only certain classes can access this method.");
        }
        String m38374c = C0724u.m38374c(C0274c.f163a);
        if (m38374c == null) {
            this.f468b = new C0356b(c0286f);
        } else if (m38374c.equals("JNDI")) {
            throw new RuntimeException("JNDI not supported");
        } else {
            this.f468b = m39433a(c0286f, m38374c);
        }
    }

    /* renamed from: b */
    public AbstractC0355a m39432b() {
        return this.f468b;
    }
}
