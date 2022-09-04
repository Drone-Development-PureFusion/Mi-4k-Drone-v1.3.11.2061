package com.google.android.gms.internal;

import com.google.android.gms.internal.C7271ju;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.ia */
/* loaded from: classes2.dex */
public class C7142ia implements Iterable<Map.Entry<C7160ij, AbstractC7344lh>> {

    /* renamed from: a */
    static final /* synthetic */ boolean f24037a;

    /* renamed from: b */
    private static final C7142ia f24038b;

    /* renamed from: c */
    private final C7271ju<AbstractC7344lh> f24039c;

    static {
        f24037a = !C7142ia.class.desiredAssertionStatus();
        f24038b = new C7142ia(new C7271ju(null));
    }

    private C7142ia(C7271ju<AbstractC7344lh> c7271ju) {
        this.f24039c = c7271ju;
    }

    /* renamed from: a */
    public static C7142ia m15436a() {
        return f24038b;
    }

    /* renamed from: a */
    public static C7142ia m15429a(Map<String, Object> map) {
        C7271ju m15000a = C7271ju.m15000a();
        Iterator<Map.Entry<String, Object>> it2 = map.entrySet().iterator();
        while (true) {
            C7271ju c7271ju = m15000a;
            if (it2.hasNext()) {
                Map.Entry<String, Object> next = it2.next();
                m15000a = c7271ju.m14997a(new C7160ij(next.getKey()), new C7271ju(C7347li.m14735a(next.getValue())));
            } else {
                return new C7142ia(c7271ju);
            }
        }
    }

    /* renamed from: a */
    private AbstractC7344lh m15433a(C7160ij c7160ij, C7271ju<AbstractC7344lh> c7271ju, AbstractC7344lh abstractC7344lh) {
        AbstractC7344lh m15433a;
        AbstractC7344lh abstractC7344lh2;
        if (c7271ju.m14990b() != null) {
            return abstractC7344lh.mo14749a(c7160ij, c7271ju.m14990b());
        }
        AbstractC7344lh abstractC7344lh3 = null;
        Iterator<Map.Entry<C7319kv, C7271ju<AbstractC7344lh>>> it2 = c7271ju.m14987c().iterator();
        AbstractC7344lh abstractC7344lh4 = abstractC7344lh;
        while (it2.hasNext()) {
            Map.Entry<C7319kv, C7271ju<AbstractC7344lh>> next = it2.next();
            C7271ju<AbstractC7344lh> value = next.getValue();
            C7319kv key = next.getKey();
            if (!key.m14822f()) {
                m15433a = m15433a(c7160ij.m15368a(key), value, abstractC7344lh4);
                abstractC7344lh2 = abstractC7344lh3;
            } else if (!f24037a && value.m14990b() == null) {
                throw new AssertionError("Priority writes must always be leaf nodes");
            } else {
                abstractC7344lh2 = value.m14990b();
                m15433a = abstractC7344lh4;
            }
            abstractC7344lh3 = abstractC7344lh2;
            abstractC7344lh4 = m15433a;
        }
        return (abstractC7344lh4.mo14750a(c7160ij).mo14739b() || abstractC7344lh3 == null) ? abstractC7344lh4 : abstractC7344lh4.mo14749a(c7160ij.m15368a(C7319kv.m14825c()), abstractC7344lh3);
    }

    /* renamed from: b */
    public static C7142ia m15425b(Map<C7160ij, AbstractC7344lh> map) {
        C7271ju m15000a = C7271ju.m15000a();
        Iterator<Map.Entry<C7160ij, AbstractC7344lh>> it2 = map.entrySet().iterator();
        while (true) {
            C7271ju c7271ju = m15000a;
            if (it2.hasNext()) {
                Map.Entry<C7160ij, AbstractC7344lh> next = it2.next();
                m15000a = c7271ju.m14997a(next.getKey(), new C7271ju(next.getValue()));
            } else {
                return new C7142ia(c7271ju);
            }
        }
    }

    /* renamed from: a */
    public C7142ia m15435a(C7160ij c7160ij) {
        return c7160ij.m15356h() ? f24038b : new C7142ia(this.f24039c.m14997a(c7160ij, C7271ju.m15000a()));
    }

    /* renamed from: a */
    public C7142ia m15434a(final C7160ij c7160ij, C7142ia c7142ia) {
        return (C7142ia) c7142ia.f24039c.m14991a((C7271ju<AbstractC7344lh>) this, new C7271ju.AbstractC7274a<AbstractC7344lh, C7142ia>() { // from class: com.google.android.gms.internal.ia.1
            @Override // com.google.android.gms.internal.C7271ju.AbstractC7274a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public C7142ia mo14978a(C7160ij c7160ij2, AbstractC7344lh abstractC7344lh, C7142ia c7142ia2) {
                return c7142ia2.m15432a(c7160ij.m15370a(c7160ij2), abstractC7344lh);
            }
        });
    }

    /* renamed from: a */
    public C7142ia m15432a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
        if (c7160ij.m15356h()) {
            return new C7142ia(new C7271ju(abstractC7344lh));
        }
        C7160ij m14999a = this.f24039c.m14999a(c7160ij);
        if (m14999a == null) {
            return new C7142ia(this.f24039c.m14997a(c7160ij, new C7271ju<>(abstractC7344lh)));
        }
        C7160ij m15369a = C7160ij.m15369a(m14999a, c7160ij);
        AbstractC7344lh m14981e = this.f24039c.m14981e(m14999a);
        C7319kv m15357g = m15369a.m15357g();
        if (m15357g != null && m15357g.m14822f() && m14981e.mo14750a(m15369a.m15359f()).mo14739b()) {
            return this;
        }
        return new C7142ia(this.f24039c.m14995a(m14999a, (C7160ij) m14981e.mo14749a(m15369a, abstractC7344lh)));
    }

    /* renamed from: a */
    public C7142ia m15431a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
        return m15432a(new C7160ij(c7319kv), abstractC7344lh);
    }

    /* renamed from: a */
    public AbstractC7344lh m15430a(AbstractC7344lh abstractC7344lh) {
        return m15433a(C7160ij.m15371a(), this.f24039c, abstractC7344lh);
    }

    /* renamed from: a */
    public Map<String, Object> m15428a(final boolean z) {
        final HashMap hashMap = new HashMap();
        this.f24039c.m14994a(new C7271ju.AbstractC7274a<AbstractC7344lh, Void>() { // from class: com.google.android.gms.internal.ia.2
            @Override // com.google.android.gms.internal.C7271ju.AbstractC7274a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public Void mo14978a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh, Void r6) {
                hashMap.put(c7160ij.m15367b(), abstractC7344lh.mo14747a(z));
                return null;
            }
        });
        return hashMap;
    }

    /* renamed from: b */
    public AbstractC7344lh m15427b() {
        return this.f24039c.m14990b();
    }

    /* renamed from: b */
    public boolean m15426b(C7160ij c7160ij) {
        return m15423c(c7160ij) != null;
    }

    /* renamed from: c */
    public AbstractC7344lh m15423c(C7160ij c7160ij) {
        C7160ij m14999a = this.f24039c.m14999a(c7160ij);
        if (m14999a != null) {
            return this.f24039c.m14981e(m14999a).mo14750a(C7160ij.m15369a(m14999a, c7160ij));
        }
        return null;
    }

    /* renamed from: c */
    public List<C7343lg> m15424c() {
        ArrayList arrayList = new ArrayList();
        if (this.f24039c.m14990b() != null) {
            for (C7343lg c7343lg : this.f24039c.m14990b()) {
                arrayList.add(new C7343lg(c7343lg.m14752c(), c7343lg.m14751d()));
            }
        } else {
            Iterator<Map.Entry<C7319kv, C7271ju<AbstractC7344lh>>> it2 = this.f24039c.m14987c().iterator();
            while (it2.hasNext()) {
                Map.Entry<C7319kv, C7271ju<AbstractC7344lh>> next = it2.next();
                C7271ju<AbstractC7344lh> value = next.getValue();
                if (value.m14990b() != null) {
                    arrayList.add(new C7343lg(next.getKey(), value.m14990b()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public C7142ia m15421d(C7160ij c7160ij) {
        if (c7160ij.m15356h()) {
            return this;
        }
        AbstractC7344lh m15423c = m15423c(c7160ij);
        return m15423c != null ? new C7142ia(new C7271ju(m15423c)) : new C7142ia(this.f24039c.m14986c(c7160ij));
    }

    /* renamed from: d */
    public Map<C7319kv, C7142ia> m15422d() {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<C7319kv, C7271ju<AbstractC7344lh>>> it2 = this.f24039c.m14987c().iterator();
        while (it2.hasNext()) {
            Map.Entry<C7319kv, C7271ju<AbstractC7344lh>> next = it2.next();
            hashMap.put(next.getKey(), new C7142ia(next.getValue()));
        }
        return hashMap;
    }

    /* renamed from: e */
    public boolean m15420e() {
        return this.f24039c.m14984d();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            return ((C7142ia) obj).m15428a(true).equals(m15428a(true));
        }
        return false;
    }

    public int hashCode() {
        return m15428a(true).hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<C7160ij, AbstractC7344lh>> iterator() {
        return this.f24039c.iterator();
    }

    public String toString() {
        String valueOf = String.valueOf(m15428a(true).toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 15).append("CompoundWrite{").append(valueOf).append("}").toString();
    }
}
