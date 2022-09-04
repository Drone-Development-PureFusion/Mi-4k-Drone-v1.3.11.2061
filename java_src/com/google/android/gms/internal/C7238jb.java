package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.jb */
/* loaded from: classes2.dex */
public class C7238jb {

    /* renamed from: a */
    static final /* synthetic */ boolean f24301a;

    /* renamed from: e */
    private static final AbstractC7275jv<C7234iy> f24302e;

    /* renamed from: b */
    private C7142ia f24303b = C7142ia.m15436a();

    /* renamed from: c */
    private List<C7234iy> f24304c = new ArrayList();

    /* renamed from: d */
    private Long f24305d = -1L;

    static {
        f24301a = !C7238jb.class.desiredAssertionStatus();
        f24302e = new AbstractC7275jv<C7234iy>() { // from class: com.google.android.gms.internal.jb.2
            @Override // com.google.android.gms.internal.AbstractC7275jv
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public boolean mo14977a(C7234iy c7234iy) {
                return c7234iy.m15149f();
            }
        };
    }

    /* renamed from: a */
    private static C7142ia m15122a(List<C7234iy> list, AbstractC7275jv<C7234iy> abstractC7275jv, C7160ij c7160ij) {
        C7142ia m15436a = C7142ia.m15436a();
        Iterator<C7234iy> it2 = list.iterator();
        while (true) {
            C7142ia c7142ia = m15436a;
            if (it2.hasNext()) {
                C7234iy next = it2.next();
                if (abstractC7275jv.mo14977a(next)) {
                    C7160ij m15153b = next.m15153b();
                    if (next.m15150e()) {
                        if (c7160ij.m15366b(m15153b)) {
                            c7142ia = c7142ia.m15432a(C7160ij.m15369a(c7160ij, m15153b), next.m15152c());
                        } else if (m15153b.m15366b(c7160ij)) {
                            c7142ia = c7142ia.m15432a(C7160ij.m15371a(), next.m15152c().mo14750a(C7160ij.m15369a(m15153b, c7160ij)));
                        }
                    } else if (c7160ij.m15366b(m15153b)) {
                        c7142ia = c7142ia.m15434a(C7160ij.m15369a(c7160ij, m15153b), next.m15151d());
                    } else if (m15153b.m15366b(c7160ij)) {
                        C7160ij m15369a = C7160ij.m15369a(m15153b, c7160ij);
                        if (m15369a.m15356h()) {
                            c7142ia = c7142ia.m15434a(C7160ij.m15371a(), next.m15151d());
                        } else {
                            AbstractC7344lh m15423c = next.m15151d().m15423c(m15369a);
                            if (m15423c != null) {
                                c7142ia = c7142ia.m15432a(C7160ij.m15371a(), m15423c);
                            }
                        }
                    }
                }
                m15436a = c7142ia;
            } else {
                return c7142ia;
            }
        }
    }

    /* renamed from: a */
    private boolean m15123a(C7234iy c7234iy, C7160ij c7160ij) {
        if (c7234iy.m15150e()) {
            return c7234iy.m15153b().m15366b(c7160ij);
        }
        Iterator<Map.Entry<C7160ij, AbstractC7344lh>> it2 = c7234iy.m15151d().iterator();
        while (it2.hasNext()) {
            if (c7234iy.m15153b().m15370a(it2.next().getKey()).m15366b(c7160ij)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m15121b() {
        this.f24303b = m15122a(this.f24304c, f24302e, C7160ij.m15371a());
        if (this.f24304c.size() > 0) {
            this.f24305d = Long.valueOf(this.f24304c.get(this.f24304c.size() - 1).m15154a());
        } else {
            this.f24305d = -1L;
        }
    }

    /* renamed from: a */
    public C7234iy m15132a(long j) {
        for (C7234iy c7234iy : this.f24304c) {
            if (c7234iy.m15154a() == j) {
                return c7234iy;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C7241jc m15131a(C7160ij c7160ij) {
        return new C7241jc(c7160ij, this);
    }

    /* renamed from: a */
    public C7343lg m15126a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh, C7343lg c7343lg, boolean z, AbstractC7336lb abstractC7336lb) {
        C7343lg c7343lg2 = null;
        C7142ia m15421d = this.f24303b.m15421d(c7160ij);
        AbstractC7344lh m15423c = m15421d.m15423c(C7160ij.m15371a());
        if (m15423c == null) {
            if (abstractC7344lh != null) {
                m15423c = m15421d.m15430a(abstractC7344lh);
            }
            return c7343lg2;
        }
        for (C7343lg c7343lg3 : m15423c) {
            if (abstractC7336lb.m14776a(c7343lg3, c7343lg, z) <= 0 || (c7343lg2 != null && abstractC7336lb.m14776a(c7343lg3, c7343lg2, z) >= 0)) {
                c7343lg3 = c7343lg2;
            }
            c7343lg2 = c7343lg3;
        }
        return c7343lg2;
    }

    /* renamed from: a */
    public AbstractC7344lh m15129a(C7160ij c7160ij, C7160ij c7160ij2, AbstractC7344lh abstractC7344lh, AbstractC7344lh abstractC7344lh2) {
        if (!f24301a && abstractC7344lh == null && abstractC7344lh2 == null) {
            throw new AssertionError("Either existingEventSnap or existingServerSnap must exist");
        }
        C7160ij m15370a = c7160ij.m15370a(c7160ij2);
        if (this.f24303b.m15426b(m15370a)) {
            return null;
        }
        C7142ia m15421d = this.f24303b.m15421d(m15370a);
        return m15421d.m15420e() ? abstractC7344lh2.mo14750a(c7160ij2) : m15421d.m15430a(abstractC7344lh2.mo14750a(c7160ij2));
    }

    /* renamed from: a */
    public AbstractC7344lh m15128a(C7160ij c7160ij, C7319kv c7319kv, C7282jy c7282jy) {
        C7160ij m15368a = c7160ij.m15368a(c7319kv);
        AbstractC7344lh m15423c = this.f24303b.m15423c(m15368a);
        if (m15423c != null) {
            return m15423c;
        }
        if (!c7282jy.m14957a(c7319kv)) {
            return null;
        }
        return this.f24303b.m15421d(m15368a).m15430a(c7282jy.m14955c().mo14738c(c7319kv));
    }

    /* renamed from: a */
    public AbstractC7344lh m15127a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
        AbstractC7344lh abstractC7344lh2;
        AbstractC7344lh m14778j = C7335la.m14778j();
        AbstractC7344lh m15423c = this.f24303b.m15423c(c7160ij);
        if (m15423c == null) {
            C7142ia m15421d = this.f24303b.m15421d(c7160ij);
            Iterator<C7343lg> it2 = abstractC7344lh.iterator();
            while (true) {
                abstractC7344lh2 = m14778j;
                if (!it2.hasNext()) {
                    break;
                }
                C7343lg next = it2.next();
                m14778j = abstractC7344lh2.mo14748a(next.m14752c(), m15421d.m15421d(new C7160ij(next.m14752c())).m15430a(next.m14751d()));
            }
            for (C7343lg c7343lg : m15421d.m15424c()) {
                abstractC7344lh2 = abstractC7344lh2.mo14748a(c7343lg.m14752c(), c7343lg.m14751d());
            }
            return abstractC7344lh2;
        } else if (m15423c.mo14743e()) {
            return m14778j;
        } else {
            Iterator<C7343lg> it3 = m15423c.iterator();
            while (true) {
                AbstractC7344lh abstractC7344lh3 = m14778j;
                if (!it3.hasNext()) {
                    return abstractC7344lh3;
                }
                C7343lg next2 = it3.next();
                m14778j = abstractC7344lh3.mo14748a(next2.m14752c(), next2.m14751d());
            }
        }
    }

    /* renamed from: a */
    public AbstractC7344lh m15124a(final C7160ij c7160ij, AbstractC7344lh abstractC7344lh, final List<Long> list, final boolean z) {
        if (list.isEmpty() && !z) {
            AbstractC7344lh m15423c = this.f24303b.m15423c(c7160ij);
            if (m15423c != null) {
                return m15423c;
            }
            C7142ia m15421d = this.f24303b.m15421d(c7160ij);
            if (m15421d.m15420e()) {
                return abstractC7344lh;
            }
            if (abstractC7344lh == null && !m15421d.m15426b(C7160ij.m15371a())) {
                return null;
            }
            if (abstractC7344lh == null) {
                abstractC7344lh = C7335la.m14778j();
            }
            return m15421d.m15430a(abstractC7344lh);
        }
        C7142ia m15421d2 = this.f24303b.m15421d(c7160ij);
        if (!z && m15421d2.m15420e()) {
            return abstractC7344lh;
        }
        if (!z && abstractC7344lh == null && !m15421d2.m15426b(C7160ij.m15371a())) {
            return null;
        }
        C7142ia m15122a = m15122a(this.f24304c, new AbstractC7275jv<C7234iy>() { // from class: com.google.android.gms.internal.jb.1
            @Override // com.google.android.gms.internal.AbstractC7275jv
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public boolean mo14977a(C7234iy c7234iy) {
                return (c7234iy.m15149f() || z) && !list.contains(Long.valueOf(c7234iy.m15154a())) && (c7234iy.m15153b().m15366b(c7160ij) || c7160ij.m15366b(c7234iy.m15153b()));
            }
        }, c7160ij);
        if (abstractC7344lh == null) {
            abstractC7344lh = C7335la.m14778j();
        }
        return m15122a.m15430a(abstractC7344lh);
    }

    /* renamed from: a */
    public List<C7234iy> m15133a() {
        ArrayList arrayList = new ArrayList(this.f24304c);
        this.f24303b = C7142ia.m15436a();
        this.f24304c = new ArrayList();
        return arrayList;
    }

    /* renamed from: a */
    public void m15130a(C7160ij c7160ij, C7142ia c7142ia, Long l) {
        if (f24301a || l.longValue() > this.f24305d.longValue()) {
            this.f24304c.add(new C7234iy(l.longValue(), c7160ij, c7142ia));
            this.f24303b = this.f24303b.m15434a(c7160ij, c7142ia);
            this.f24305d = l;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void m15125a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh, Long l, boolean z) {
        if (f24301a || l.longValue() > this.f24305d.longValue()) {
            this.f24304c.add(new C7234iy(l.longValue(), c7160ij, abstractC7344lh, z));
            if (z) {
                this.f24303b = this.f24303b.m15432a(c7160ij, abstractC7344lh);
            }
            this.f24305d = l;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public AbstractC7344lh m15119b(C7160ij c7160ij) {
        return this.f24303b.m15423c(c7160ij);
    }

    /* renamed from: b */
    public boolean m15120b(long j) {
        boolean z;
        boolean z2;
        C7234iy c7234iy = null;
        Iterator<C7234iy> it2 = this.f24304c.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C7234iy next = it2.next();
            if (next.m15154a() == j) {
                c7234iy = next;
                break;
            }
            i++;
        }
        if (f24301a || c7234iy != null) {
            this.f24304c.remove(c7234iy);
            boolean m15149f = c7234iy.m15149f();
            int size = this.f24304c.size() - 1;
            boolean z3 = false;
            while (m15149f && size >= 0) {
                C7234iy c7234iy2 = this.f24304c.get(size);
                if (c7234iy2.m15149f()) {
                    if (size >= i && m15123a(c7234iy2, c7234iy.m15153b())) {
                        z = z3;
                        z2 = false;
                    } else if (c7234iy.m15153b().m15366b(c7234iy2.m15153b())) {
                        z = true;
                        z2 = m15149f;
                    }
                    size--;
                    m15149f = z2;
                    z3 = z;
                }
                z = z3;
                z2 = m15149f;
                size--;
                m15149f = z2;
                z3 = z;
            }
            if (!m15149f) {
                return false;
            }
            if (z3) {
                m15121b();
                return true;
            } else if (c7234iy.m15150e()) {
                this.f24303b = this.f24303b.m15435a(c7234iy.m15153b());
                return true;
            } else {
                Iterator<Map.Entry<C7160ij, AbstractC7344lh>> it3 = c7234iy.m15151d().iterator();
                while (it3.hasNext()) {
                    this.f24303b = this.f24303b.m15435a(c7234iy.m15153b().m15370a(it3.next().getKey()));
                }
                return true;
            }
        }
        throw new AssertionError("removeWrite called with nonexistent writeId");
    }
}
