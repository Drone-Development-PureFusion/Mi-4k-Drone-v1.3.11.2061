package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7309ko;
import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.kp */
/* loaded from: classes2.dex */
public class C7311kp implements AbstractC7309ko {

    /* renamed from: a */
    private final C7306kl f24466a;

    /* renamed from: b */
    private final AbstractC7336lb f24467b;

    /* renamed from: c */
    private final C7343lg f24468c;

    /* renamed from: d */
    private final C7343lg f24469d;

    public C7311kp(C7293kf c7293kf) {
        this.f24466a = new C7306kl(c7293kf.m14909j());
        this.f24467b = c7293kf.m14909j();
        this.f24468c = m14860a(c7293kf);
        this.f24469d = m14854b(c7293kf);
    }

    /* renamed from: a */
    private static C7343lg m14860a(C7293kf c7293kf) {
        if (c7293kf.m14925a()) {
            return c7293kf.m14909j().mo14703a(c7293kf.m14916c(), c7293kf.m14919b());
        }
        return c7293kf.m14909j().m14777a();
    }

    /* renamed from: b */
    private static C7343lg m14854b(C7293kf c7293kf) {
        if (c7293kf.m14915d()) {
            return c7293kf.m14909j().mo14703a(c7293kf.m14913f(), c7293kf.m14914e());
        }
        return c7293kf.m14909j().mo14700b();
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: a */
    public AbstractC7309ko mo14861a() {
        return this.f24466a;
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: a */
    public C7337lc mo14859a(C7337lc c7337lc, C7319kv c7319kv, AbstractC7344lh abstractC7344lh, C7160ij c7160ij, AbstractC7309ko.AbstractC7310a abstractC7310a, C7305kk c7305kk) {
        return this.f24466a.mo14859a(c7337lc, c7319kv, !m14856a(new C7343lg(c7319kv, abstractC7344lh)) ? C7335la.m14778j() : abstractC7344lh, c7160ij, abstractC7310a, c7305kk);
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: a */
    public C7337lc mo14858a(C7337lc c7337lc, C7337lc c7337lc2, C7305kk c7305kk) {
        C7337lc c7337lc3;
        if (!c7337lc2.m14773a().mo14743e()) {
            C7337lc m14766b = c7337lc2.m14766b(C7350ll.m14730a());
            Iterator<C7343lg> it2 = c7337lc2.iterator();
            while (true) {
                c7337lc3 = m14766b;
                if (!it2.hasNext()) {
                    break;
                }
                C7343lg next = it2.next();
                m14766b = !m14856a(next) ? c7337lc3.m14772a(next.m14752c(), C7335la.m14778j()) : c7337lc3;
            }
        } else {
            c7337lc3 = C7337lc.m14768a(C7335la.m14778j(), this.f24467b);
        }
        return this.f24466a.mo14858a(c7337lc, c7337lc3, c7305kk);
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: a */
    public C7337lc mo14857a(C7337lc c7337lc, AbstractC7344lh abstractC7344lh) {
        return c7337lc;
    }

    /* renamed from: a */
    public boolean m14856a(C7343lg c7343lg) {
        return this.f24467b.compare(m14852d(), c7343lg) <= 0 && this.f24467b.compare(c7343lg, m14851e()) <= 0;
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: b */
    public AbstractC7336lb mo14855b() {
        return this.f24467b;
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: c */
    public boolean mo14853c() {
        return true;
    }

    /* renamed from: d */
    public C7343lg m14852d() {
        return this.f24468c;
    }

    /* renamed from: e */
    public C7343lg m14851e() {
        return this.f24469d;
    }
}
