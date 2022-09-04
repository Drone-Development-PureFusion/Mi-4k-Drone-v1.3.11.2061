package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7309ko;
/* renamed from: com.google.android.gms.internal.kl */
/* loaded from: classes2.dex */
public class C7306kl implements AbstractC7309ko {

    /* renamed from: a */
    static final /* synthetic */ boolean f24454a;

    /* renamed from: b */
    private final AbstractC7336lb f24455b;

    static {
        f24454a = !C7306kl.class.desiredAssertionStatus();
    }

    public C7306kl(AbstractC7336lb abstractC7336lb) {
        this.f24455b = abstractC7336lb;
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: a */
    public AbstractC7309ko mo14861a() {
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: a */
    public C7337lc mo14859a(C7337lc c7337lc, C7319kv c7319kv, AbstractC7344lh abstractC7344lh, C7160ij c7160ij, AbstractC7309ko.AbstractC7310a abstractC7310a, C7305kk c7305kk) {
        if (f24454a || c7337lc.m14770a(this.f24455b)) {
            AbstractC7344lh m14773a = c7337lc.m14773a();
            AbstractC7344lh mo14738c = m14773a.mo14738c(c7319kv);
            if (mo14738c.mo14750a(c7160ij).equals(abstractC7344lh.mo14750a(c7160ij)) && mo14738c.mo14739b() == abstractC7344lh.mo14739b()) {
                return c7337lc;
            }
            if (c7305kk != null) {
                if (abstractC7344lh.mo14739b()) {
                    if (m14773a.mo14741a(c7319kv)) {
                        c7305kk.m14865a(C7285ka.m14943b(c7319kv, mo14738c));
                    } else if (!f24454a && !m14773a.mo14743e()) {
                        throw new AssertionError("A child remove without an old child only makes sense on a leaf node");
                    }
                } else if (mo14738c.mo14739b()) {
                    c7305kk.m14865a(C7285ka.m14948a(c7319kv, abstractC7344lh));
                } else {
                    c7305kk.m14865a(C7285ka.m14947a(c7319kv, abstractC7344lh, mo14738c));
                }
            }
            return (!m14773a.mo14743e() || !abstractC7344lh.mo14739b()) ? c7337lc.m14772a(c7319kv, abstractC7344lh) : c7337lc;
        }
        throw new AssertionError("The index must match the filter");
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: a */
    public C7337lc mo14858a(C7337lc c7337lc, C7337lc c7337lc2, C7305kk c7305kk) {
        if (f24454a || c7337lc2.m14770a(this.f24455b)) {
            if (c7305kk != null) {
                for (C7343lg c7343lg : c7337lc.m14773a()) {
                    if (!c7337lc2.m14773a().mo14741a(c7343lg.m14752c())) {
                        c7305kk.m14865a(C7285ka.m14943b(c7343lg.m14752c(), c7343lg.m14751d()));
                    }
                }
                if (!c7337lc2.m14773a().mo14743e()) {
                    for (C7343lg c7343lg2 : c7337lc2.m14773a()) {
                        if (c7337lc.m14773a().mo14741a(c7343lg2.m14752c())) {
                            AbstractC7344lh mo14738c = c7337lc.m14773a().mo14738c(c7343lg2.m14752c());
                            if (!mo14738c.equals(c7343lg2.m14751d())) {
                                c7305kk.m14865a(C7285ka.m14947a(c7343lg2.m14752c(), c7343lg2.m14751d(), mo14738c));
                            }
                        } else {
                            c7305kk.m14865a(C7285ka.m14948a(c7343lg2.m14752c(), c7343lg2.m14751d()));
                        }
                    }
                }
            }
            return c7337lc2;
        }
        throw new AssertionError("Can't use IndexedNode that doesn't have filter's index");
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: a */
    public C7337lc mo14857a(C7337lc c7337lc, AbstractC7344lh abstractC7344lh) {
        return c7337lc.m14773a().mo14739b() ? c7337lc : c7337lc.m14766b(abstractC7344lh);
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: b */
    public AbstractC7336lb mo14855b() {
        return this.f24455b;
    }

    @Override // com.google.android.gms.internal.AbstractC7309ko
    /* renamed from: c */
    public boolean mo14853c() {
        return false;
    }
}
