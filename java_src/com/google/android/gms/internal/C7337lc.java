package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.lc */
/* loaded from: classes2.dex */
public class C7337lc implements Iterable<C7343lg> {

    /* renamed from: a */
    private static final C7074hb<C7343lg> f24516a = new C7074hb<>(Collections.emptyList(), null);

    /* renamed from: b */
    private final AbstractC7344lh f24517b;

    /* renamed from: c */
    private C7074hb<C7343lg> f24518c;

    /* renamed from: d */
    private final AbstractC7336lb f24519d;

    private C7337lc(AbstractC7344lh abstractC7344lh, AbstractC7336lb abstractC7336lb) {
        this.f24519d = abstractC7336lb;
        this.f24517b = abstractC7344lh;
        this.f24518c = null;
    }

    private C7337lc(AbstractC7344lh abstractC7344lh, AbstractC7336lb abstractC7336lb, C7074hb<C7343lg> c7074hb) {
        this.f24519d = abstractC7336lb;
        this.f24517b = abstractC7344lh;
        this.f24518c = c7074hb;
    }

    /* renamed from: a */
    public static C7337lc m14769a(AbstractC7344lh abstractC7344lh) {
        return new C7337lc(abstractC7344lh, C7349lk.m14731d());
    }

    /* renamed from: a */
    public static C7337lc m14768a(AbstractC7344lh abstractC7344lh, AbstractC7336lb abstractC7336lb) {
        return new C7337lc(abstractC7344lh, abstractC7336lb);
    }

    /* renamed from: e */
    private void m14763e() {
        if (this.f24518c == null) {
            if (this.f24519d.equals(C7338ld.m14761d())) {
                this.f24518c = f24516a;
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C7343lg c7343lg : this.f24517b) {
                z = z || this.f24519d.mo14701a(c7343lg.m14751d());
                arrayList.add(new C7343lg(c7343lg.m14752c(), c7343lg.m14751d()));
            }
            if (z) {
                this.f24518c = new C7074hb<>(arrayList, this.f24519d);
            } else {
                this.f24518c = f24516a;
            }
        }
    }

    /* renamed from: a */
    public C7319kv m14771a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh, AbstractC7336lb abstractC7336lb) {
        if (this.f24519d.equals(C7338ld.m14761d()) || this.f24519d.equals(abstractC7336lb)) {
            m14763e();
            if (this.f24518c == f24516a) {
                return this.f24517b.mo14746b(c7319kv);
            }
            C7343lg m15651c = this.f24518c.m15651c(new C7343lg(c7319kv, abstractC7344lh));
            if (m15651c == null) {
                return null;
            }
            return m15651c.m14752c();
        }
        throw new IllegalArgumentException("Index not available in IndexedNode!");
    }

    /* renamed from: a */
    public C7337lc m14772a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
        AbstractC7344lh mo14748a = this.f24517b.mo14748a(c7319kv, abstractC7344lh);
        if (this.f24518c != f24516a || this.f24519d.mo14701a(abstractC7344lh)) {
            if (this.f24518c == null || this.f24518c == f24516a) {
                return new C7337lc(mo14748a, this.f24519d, null);
            }
            C7074hb<C7343lg> m15655a = this.f24518c.m15655a(new C7343lg(c7319kv, this.f24517b.mo14738c(c7319kv)));
            if (!abstractC7344lh.mo14739b()) {
                m15655a = m15655a.m15653b(new C7343lg(c7319kv, abstractC7344lh));
            }
            return new C7337lc(mo14748a, this.f24519d, m15655a);
        }
        return new C7337lc(mo14748a, this.f24519d, f24516a);
    }

    /* renamed from: a */
    public AbstractC7344lh m14773a() {
        return this.f24517b;
    }

    /* renamed from: a */
    public boolean m14770a(AbstractC7336lb abstractC7336lb) {
        return this.f24519d.equals(abstractC7336lb);
    }

    /* renamed from: b */
    public C7337lc m14766b(AbstractC7344lh abstractC7344lh) {
        return new C7337lc(this.f24517b.mo14705b(abstractC7344lh), this.f24519d, this.f24518c);
    }

    /* renamed from: b */
    public Iterator<C7343lg> m14767b() {
        m14763e();
        return this.f24518c == f24516a ? this.f24517b.mo14742i() : this.f24518c.m15652c();
    }

    /* renamed from: c */
    public C7343lg m14765c() {
        if (!(this.f24517b instanceof C7322kw)) {
            return null;
        }
        m14763e();
        if (this.f24518c != f24516a) {
            return this.f24518c.m15656a();
        }
        C7319kv m14815g = ((C7322kw) this.f24517b).m14815g();
        return new C7343lg(m14815g, this.f24517b.mo14738c(m14815g));
    }

    /* renamed from: d */
    public C7343lg m14764d() {
        if (!(this.f24517b instanceof C7322kw)) {
            return null;
        }
        m14763e();
        if (this.f24518c != f24516a) {
            return this.f24518c.m15654b();
        }
        C7319kv m14814h = ((C7322kw) this.f24517b).m14814h();
        return new C7343lg(m14814h, this.f24517b.mo14738c(m14814h));
    }

    @Override // java.lang.Iterable
    public Iterator<C7343lg> iterator() {
        m14763e();
        return this.f24518c == f24516a ? this.f24517b.iterator() : this.f24518c.iterator();
    }
}
