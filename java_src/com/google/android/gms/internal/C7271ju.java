package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7068gz;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.ju */
/* loaded from: classes2.dex */
public class C7271ju<T> implements Iterable<Map.Entry<C7160ij, T>> {

    /* renamed from: c */
    private static final AbstractC7068gz f24370c = AbstractC7068gz.C7069a.m15661a(C7089hi.m15602a(C7319kv.class));

    /* renamed from: d */
    private static final C7271ju f24371d = new C7271ju(null, f24370c);

    /* renamed from: a */
    private final T f24372a;

    /* renamed from: b */
    private final AbstractC7068gz<C7319kv, C7271ju<T>> f24373b;

    /* renamed from: com.google.android.gms.internal.ju$a */
    /* loaded from: classes2.dex */
    public interface AbstractC7274a<T, R> {
        /* renamed from: a */
        R mo14978a(C7160ij c7160ij, T t, R r);
    }

    public C7271ju(T t) {
        this(t, f24370c);
    }

    public C7271ju(T t, AbstractC7068gz<C7319kv, C7271ju<T>> abstractC7068gz) {
        this.f24372a = t;
        this.f24373b = abstractC7068gz;
    }

    /* renamed from: a */
    public static <V> C7271ju<V> m15000a() {
        return f24371d;
    }

    /* renamed from: a */
    private <R> R m14998a(C7160ij c7160ij, AbstractC7274a<? super T, R> abstractC7274a, R r) {
        Iterator<Map.Entry<C7319kv, C7271ju<T>>> it2 = this.f24373b.iterator();
        while (it2.hasNext()) {
            Map.Entry<C7319kv, C7271ju<T>> next = it2.next();
            r = (R) next.getValue().m14998a(c7160ij.m15368a(next.getKey()), abstractC7274a, r);
        }
        return this.f24372a != null ? abstractC7274a.mo14978a(c7160ij, this.f24372a, r) : r;
    }

    /* renamed from: a */
    public C7160ij m14999a(C7160ij c7160ij) {
        return m14996a(c7160ij, (AbstractC7275jv) AbstractC7275jv.f24378e);
    }

    /* renamed from: a */
    public C7160ij m14996a(C7160ij c7160ij, AbstractC7275jv<? super T> abstractC7275jv) {
        C7319kv m15363d;
        C7271ju<T> mo15617b;
        C7160ij m14996a;
        if (this.f24372a == null || !abstractC7275jv.mo14977a((T) this.f24372a)) {
            if (!c7160ij.m15356h() && (mo15617b = this.f24373b.mo15617b((m15363d = c7160ij.m15363d()))) != null && (m14996a = mo15617b.m14996a(c7160ij.m15361e(), (AbstractC7275jv) abstractC7275jv)) != null) {
                return new C7160ij(m15363d).m15370a(m14996a);
            }
            return null;
        }
        return C7160ij.m15371a();
    }

    /* renamed from: a */
    public C7271ju<T> m14997a(C7160ij c7160ij, C7271ju<T> c7271ju) {
        if (c7160ij.m15356h()) {
            return c7271ju;
        }
        C7319kv m15363d = c7160ij.m15363d();
        C7271ju<T> mo15617b = this.f24373b.mo15617b(m15363d);
        if (mo15617b == null) {
            mo15617b = m15000a();
        }
        C7271ju<T> m14997a = mo15617b.m14997a(c7160ij.m15361e(), (C7271ju) c7271ju);
        return new C7271ju<>(this.f24372a, m14997a.m14984d() ? this.f24373b.mo15615c(m15363d) : this.f24373b.mo15621a(m15363d, m14997a));
    }

    /* renamed from: a */
    public C7271ju<T> m14995a(C7160ij c7160ij, T t) {
        if (c7160ij.m15356h()) {
            return new C7271ju<>(t, this.f24373b);
        }
        C7319kv m15363d = c7160ij.m15363d();
        C7271ju<T> mo15617b = this.f24373b.mo15617b(m15363d);
        if (mo15617b == null) {
            mo15617b = m15000a();
        }
        return new C7271ju<>(this.f24372a, this.f24373b.mo15621a(m15363d, mo15617b.m14995a(c7160ij.m15361e(), (C7160ij) t)));
    }

    /* renamed from: a */
    public C7271ju<T> m14992a(C7319kv c7319kv) {
        C7271ju<T> mo15617b = this.f24373b.mo15617b(c7319kv);
        return mo15617b != null ? mo15617b : m15000a();
    }

    /* renamed from: a */
    public <R> R m14991a(R r, AbstractC7274a<? super T, R> abstractC7274a) {
        return (R) m14998a(C7160ij.m15371a(), abstractC7274a, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m14994a(AbstractC7274a<T, Void> abstractC7274a) {
        m14998a(C7160ij.m15371a(), abstractC7274a, null);
    }

    /* renamed from: a */
    public boolean m14993a(AbstractC7275jv<? super T> abstractC7275jv) {
        if (this.f24372a == null || !abstractC7275jv.mo14977a((T) this.f24372a)) {
            Iterator<Map.Entry<C7319kv, C7271ju<T>>> it2 = this.f24373b.iterator();
            while (it2.hasNext()) {
                if (it2.next().getValue().m14993a(abstractC7275jv)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public T m14990b() {
        return this.f24372a;
    }

    /* renamed from: b */
    public T m14989b(C7160ij c7160ij) {
        return m14985c(c7160ij, AbstractC7275jv.f24378e);
    }

    /* renamed from: b */
    public T m14988b(C7160ij c7160ij, AbstractC7275jv<? super T> abstractC7275jv) {
        if (this.f24372a == null || !abstractC7275jv.mo14977a((T) this.f24372a)) {
            Iterator<C7319kv> it2 = c7160ij.iterator();
            while (it2.hasNext()) {
                C7271ju<T> mo15617b = this.f24373b.mo15617b(it2.next());
                if (mo15617b == null) {
                    return null;
                }
                if (mo15617b.f24372a != null && abstractC7275jv.mo14977a((T) mo15617b.f24372a)) {
                    return mo15617b.f24372a;
                }
                this = mo15617b;
            }
            return null;
        }
        return this.f24372a;
    }

    /* renamed from: c */
    public AbstractC7068gz<C7319kv, C7271ju<T>> m14987c() {
        return this.f24373b;
    }

    /* renamed from: c */
    public C7271ju<T> m14986c(C7160ij c7160ij) {
        if (c7160ij.m15356h()) {
            return this;
        }
        C7271ju<T> mo15617b = this.f24373b.mo15617b(c7160ij.m15363d());
        return mo15617b != null ? mo15617b.m14986c(c7160ij.m15361e()) : m15000a();
    }

    /* renamed from: c */
    public T m14985c(C7160ij c7160ij, AbstractC7275jv<? super T> abstractC7275jv) {
        T t = (this.f24372a == null || !abstractC7275jv.mo14977a((T) this.f24372a)) ? null : this.f24372a;
        Iterator<C7319kv> it2 = c7160ij.iterator();
        T t2 = t;
        while (it2.hasNext()) {
            C7271ju<T> mo15617b = this.f24373b.mo15617b(it2.next());
            if (mo15617b == null) {
                break;
            }
            if (mo15617b.f24372a != null && abstractC7275jv.mo14977a((T) mo15617b.f24372a)) {
                t2 = mo15617b.f24372a;
            }
            this = mo15617b;
        }
        return t2;
    }

    /* renamed from: d */
    public C7271ju<T> m14983d(C7160ij c7160ij) {
        if (c7160ij.m15356h()) {
            return this.f24373b.mo15614d() ? m15000a() : new C7271ju<>(null, this.f24373b);
        }
        C7319kv m15363d = c7160ij.m15363d();
        C7271ju<T> mo15617b = this.f24373b.mo15617b(m15363d);
        if (mo15617b == null) {
            return this;
        }
        C7271ju<T> m14983d = mo15617b.m14983d(c7160ij.m15361e());
        AbstractC7068gz<C7319kv, C7271ju<T>> mo15615c = m14983d.m14984d() ? this.f24373b.mo15615c(m15363d) : this.f24373b.mo15621a(m15363d, m14983d);
        return (this.f24372a != null || !mo15615c.mo15614d()) ? new C7271ju<>(this.f24372a, mo15615c) : m15000a();
    }

    /* renamed from: d */
    public boolean m14984d() {
        return this.f24372a == null && this.f24373b.mo15614d();
    }

    /* renamed from: e */
    public T m14981e(C7160ij c7160ij) {
        if (c7160ij.m15356h()) {
            return this.f24372a;
        }
        C7271ju<T> mo15617b = this.f24373b.mo15617b(c7160ij.m15363d());
        if (mo15617b == null) {
            return null;
        }
        return mo15617b.m14981e(c7160ij.m15361e());
    }

    /* renamed from: e */
    public Collection<T> m14982e() {
        final ArrayList arrayList = new ArrayList();
        m14994a(new AbstractC7274a<T, Void>() { // from class: com.google.android.gms.internal.ju.1
            @Override // com.google.android.gms.internal.C7271ju.AbstractC7274a
            /* renamed from: a */
            public /* bridge */ /* synthetic */ Void mo14978a(C7160ij c7160ij, Object obj, Void r4) {
                return m14980a(c7160ij, (C7160ij) obj, r4);
            }

            /* renamed from: a  reason: avoid collision after fix types in other method */
            public Void m14980a(C7160ij c7160ij, T t, Void r4) {
                arrayList.add(t);
                return null;
            }
        });
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7271ju c7271ju = (C7271ju) obj;
        if (this.f24373b == null ? c7271ju.f24373b != null : !this.f24373b.equals(c7271ju.f24373b)) {
            return false;
        }
        if (this.f24372a != null) {
            if (this.f24372a.equals(c7271ju.f24372a)) {
                return true;
            }
        } else if (c7271ju.f24372a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.f24372a != null ? this.f24372a.hashCode() : 0) * 31;
        if (this.f24373b != null) {
            i = this.f24373b.hashCode();
        }
        return hashCode + i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<C7160ij, T>> iterator() {
        final ArrayList arrayList = new ArrayList();
        m14994a(new AbstractC7274a<T, Void>() { // from class: com.google.android.gms.internal.ju.2
            @Override // com.google.android.gms.internal.C7271ju.AbstractC7274a
            /* renamed from: a */
            public /* bridge */ /* synthetic */ Void mo14978a(C7160ij c7160ij, Object obj, Void r4) {
                return m14979a(c7160ij, (C7160ij) obj, r4);
            }

            /* renamed from: a  reason: avoid collision after fix types in other method */
            public Void m14979a(C7160ij c7160ij, T t, Void r5) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry(c7160ij, t));
                return null;
            }
        });
        return arrayList.iterator();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImmutableTree { value=");
        sb.append(m14990b());
        sb.append(", children={");
        Iterator<Map.Entry<C7319kv, C7271ju<T>>> it2 = this.f24373b.iterator();
        while (it2.hasNext()) {
            Map.Entry<C7319kv, C7271ju<T>> next = it2.next();
            sb.append(next.getKey().m14823e());
            sb.append("=");
            sb.append(next.getValue());
        }
        sb.append("} }");
        return sb.toString();
    }
}
