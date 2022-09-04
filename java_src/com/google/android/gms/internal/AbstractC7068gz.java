package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7078he;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.gz */
/* loaded from: classes2.dex */
public abstract class AbstractC7068gz<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: com.google.android.gms.internal.gz$a */
    /* loaded from: classes2.dex */
    public static class C7069a {

        /* renamed from: a */
        private static final AbstractC7071a f23853a = new AbstractC7071a() { // from class: com.google.android.gms.internal.gz.a.1
            @Override // com.google.android.gms.internal.AbstractC7068gz.C7069a.AbstractC7071a
            /* renamed from: a */
            public Object mo15658a(Object obj) {
                return obj;
            }
        };

        /* renamed from: com.google.android.gms.internal.gz$a$a */
        /* loaded from: classes2.dex */
        public interface AbstractC7071a<C, D> {
            /* renamed from: a */
            D mo15658a(C c);
        }

        /* renamed from: a */
        public static <A> AbstractC7071a<A, A> m15662a() {
            return f23853a;
        }

        /* renamed from: a */
        public static <K, V> AbstractC7068gz<K, V> m15661a(Comparator<K> comparator) {
            return new C7066gy(comparator);
        }

        /* renamed from: a */
        public static <A, B, C> AbstractC7068gz<A, C> m15660a(List<A> list, Map<B, C> map, AbstractC7071a<A, B> abstractC7071a, Comparator<A> comparator) {
            return list.size() < 25 ? C7066gy.m15671a(list, map, abstractC7071a, comparator) : C7083hh.m15620a(list, map, abstractC7071a, comparator);
        }

        /* renamed from: a */
        public static <A, B> AbstractC7068gz<A, B> m15659a(Map<A, B> map, Comparator<A> comparator) {
            return map.size() < 25 ? C7066gy.m15670a((Map) map, (Comparator) comparator) : C7083hh.m15619a((Map) map, (Comparator) comparator);
        }
    }

    /* renamed from: a */
    public abstract AbstractC7068gz<K, V> mo15621a(K k, V v);

    /* renamed from: a */
    public abstract K mo15624a();

    /* renamed from: a */
    public abstract void mo15623a(AbstractC7078he.AbstractC7080b<K, V> abstractC7080b);

    /* renamed from: a */
    public abstract boolean mo15622a(K k);

    /* renamed from: b */
    public abstract K mo15618b();

    /* renamed from: b */
    public abstract V mo15617b(K k);

    /* renamed from: c */
    public abstract int mo15616c();

    /* renamed from: c */
    public abstract AbstractC7068gz<K, V> mo15615c(K k);

    /* renamed from: d */
    public abstract K mo15613d(K k);

    /* renamed from: d */
    public abstract boolean mo15614d();

    /* renamed from: e */
    public abstract Iterator<Map.Entry<K, V>> mo15612e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7068gz)) {
            return false;
        }
        AbstractC7068gz abstractC7068gz = (AbstractC7068gz) obj;
        if (mo15610f().equals(abstractC7068gz.mo15610f()) && mo15616c() == abstractC7068gz.mo15616c()) {
            Iterator<Map.Entry<K, V>> it2 = iterator();
            Iterator<Map.Entry<K, V>> it3 = abstractC7068gz.iterator();
            while (it2.hasNext()) {
                if (!it2.next().equals(it3.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public abstract Comparator<K> mo15610f();

    public int hashCode() {
        int hashCode = mo15610f().hashCode();
        Iterator<Map.Entry<K, V>> it2 = iterator();
        while (true) {
            int i = hashCode;
            if (it2.hasNext()) {
                hashCode = it2.next().hashCode() + (i * 31);
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public abstract Iterator<Map.Entry<K, V>> iterator();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator<Map.Entry<K, V>> it2 = iterator();
        boolean z = true;
        while (it2.hasNext()) {
            Map.Entry<K, V> next = it2.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(next.getKey());
            sb.append("=>");
            sb.append(next.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }
}
