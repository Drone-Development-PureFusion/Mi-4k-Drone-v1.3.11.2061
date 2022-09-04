package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7309ko;
import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.kn */
/* loaded from: classes2.dex */
public class C7308kn implements AbstractC7309ko {

    /* renamed from: a */
    static final /* synthetic */ boolean f24461a;

    /* renamed from: b */
    private final C7311kp f24462b;

    /* renamed from: c */
    private final AbstractC7336lb f24463c;

    /* renamed from: d */
    private final int f24464d;

    /* renamed from: e */
    private final boolean f24465e;

    static {
        f24461a = !C7308kn.class.desiredAssertionStatus();
    }

    public C7308kn(C7293kf c7293kf) {
        this.f24462b = new C7311kp(c7293kf);
        this.f24463c = c7293kf.m14909j();
        this.f24464d = c7293kf.m14910i();
        this.f24465e = !c7293kf.m14908k();
    }

    /* renamed from: a */
    private C7337lc m14864a(C7337lc c7337lc, C7319kv c7319kv, AbstractC7344lh abstractC7344lh, AbstractC7309ko.AbstractC7310a abstractC7310a, C7305kk c7305kk) {
        if (f24461a || c7337lc.m14773a().mo14745c() == this.f24464d) {
            C7343lg c7343lg = new C7343lg(c7319kv, abstractC7344lh);
            C7343lg m14765c = this.f24465e ? c7337lc.m14765c() : c7337lc.m14764d();
            boolean m14856a = this.f24462b.m14856a(c7343lg);
            if (!c7337lc.m14773a().mo14741a(c7319kv)) {
                if (abstractC7344lh.mo14739b() || !m14856a || this.f24463c.m14776a(m14765c, c7343lg, this.f24465e) < 0) {
                    return c7337lc;
                }
                if (c7305kk != null) {
                    c7305kk.m14865a(C7285ka.m14943b(m14765c.m14752c(), m14765c.m14751d()));
                    c7305kk.m14865a(C7285ka.m14948a(c7319kv, abstractC7344lh));
                }
                return c7337lc.m14772a(c7319kv, abstractC7344lh).m14772a(m14765c.m14752c(), C7335la.m14778j());
            }
            AbstractC7344lh mo14738c = c7337lc.m14773a().mo14738c(c7319kv);
            C7343lg mo14862a = abstractC7310a.mo14862a(this.f24463c, m14765c, this.f24465e);
            while (mo14862a != null && (mo14862a.m14752c().equals(c7319kv) || c7337lc.m14773a().mo14741a(mo14862a.m14752c()))) {
                mo14862a = abstractC7310a.mo14862a(this.f24463c, mo14862a, this.f24465e);
            }
            if (m14856a && !abstractC7344lh.mo14739b() && (mo14862a == null ? 1 : this.f24463c.m14776a(mo14862a, c7343lg, this.f24465e)) >= 0) {
                if (c7305kk != null) {
                    c7305kk.m14865a(C7285ka.m14947a(c7319kv, abstractC7344lh, mo14738c));
                }
                return c7337lc.m14772a(c7319kv, abstractC7344lh);
            }
            if (c7305kk != null) {
                c7305kk.m14865a(C7285ka.m14943b(c7319kv, mo14738c));
            }
            C7337lc m14772a = c7337lc.m14772a(c7319kv, C7335la.m14778j());
            if (!(mo14862a != null && this.f24462b.m14856a(mo14862a))) {
                return m14772a;
            }
            if (c7305kk != null) {
                c7305kk.m14865a(C7285ka.m14948a(mo14862a.m14752c(), mo14862a.m14751d()));
            }
            return m14772a.m14772a(mo14862a.m14752c(), mo14862a.m14751d());
        }
        throw new AssertionError();
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: a */
    public AbstractC7309ko mo14861a() {
        return this.f24462b.mo14861a();
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: a */
    public C7337lc mo14859a(C7337lc c7337lc, C7319kv c7319kv, AbstractC7344lh abstractC7344lh, C7160ij c7160ij, AbstractC7309ko.AbstractC7310a abstractC7310a, C7305kk c7305kk) {
        AbstractC7344lh m14778j = !this.f24462b.m14856a(new C7343lg(c7319kv, abstractC7344lh)) ? C7335la.m14778j() : abstractC7344lh;
        return c7337lc.m14773a().mo14738c(c7319kv).equals(m14778j) ? c7337lc : c7337lc.m14773a().mo14745c() < this.f24464d ? this.f24462b.mo14861a().mo14859a(c7337lc, c7319kv, m14778j, c7160ij, abstractC7310a, c7305kk) : m14864a(c7337lc, c7319kv, m14778j, abstractC7310a, c7305kk);
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: a */
    public C7337lc mo14858a(C7337lc c7337lc, C7337lc c7337lc2, C7305kk c7305kk) {
        C7337lc m14768a;
        C7343lg m14851e;
        C7343lg c7343lg;
        int i;
        Iterator<C7343lg> it2;
        int i2;
        if (c7337lc2.m14773a().mo14743e() || c7337lc2.m14773a().mo14739b()) {
            m14768a = C7337lc.m14768a(C7335la.m14778j(), this.f24463c);
        } else {
            C7337lc m14766b = c7337lc2.m14766b(C7350ll.m14730a());
            if (this.f24465e) {
                Iterator<C7343lg> m14767b = c7337lc2.m14767b();
                c7343lg = this.f24462b.m14851e();
                m14851e = this.f24462b.m14852d();
                it2 = m14767b;
                i = -1;
            } else {
                Iterator<C7343lg> it3 = c7337lc2.iterator();
                C7343lg m14852d = this.f24462b.m14852d();
                m14851e = this.f24462b.m14851e();
                c7343lg = m14852d;
                i = 1;
                it2 = it3;
            }
            int i3 = 0;
            m14768a = m14766b;
            boolean z = false;
            while (it2.hasNext()) {
                C7343lg next = it2.next();
                if (!z && this.f24463c.compare(c7343lg, next) * i <= 0) {
                    z = true;
                }
                if (z && i3 < this.f24464d && this.f24463c.compare(next, m14851e) * i <= 0) {
                    i2 = i3 + 1;
                } else {
                    m14768a = m14768a.m14772a(next.m14752c(), C7335la.m14778j());
                    i2 = i3;
                }
                m14768a = m14768a;
                i3 = i2;
            }
        }
        return this.f24462b.mo14861a().mo14858a(c7337lc, m14768a, c7305kk);
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: a */
    public C7337lc mo14857a(C7337lc c7337lc, AbstractC7344lh abstractC7344lh) {
        return c7337lc;
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: b */
    public AbstractC7336lb mo14855b() {
        return this.f24463c;
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: c */
    public boolean mo14853c() {
        return true;
    }
}
