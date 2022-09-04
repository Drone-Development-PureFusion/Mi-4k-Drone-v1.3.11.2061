package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7068gz;
import com.google.android.gms.internal.AbstractC7078he;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.gy */
/* loaded from: classes2.dex */
public class C7066gy<K, V> extends AbstractC7068gz<K, V> {

    /* renamed from: a */
    private final K[] f23846a;

    /* renamed from: b */
    private final V[] f23847b;

    /* renamed from: c */
    private final Comparator<K> f23848c;

    public C7066gy(Comparator<K> comparator) {
        this.f23846a = (K[]) new Object[0];
        this.f23847b = (V[]) new Object[0];
        this.f23848c = comparator;
    }

    private C7066gy(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.f23846a = kArr;
        this.f23847b = vArr;
        this.f23848c = comparator;
    }

    /* renamed from: a */
    public static <A, B, C> C7066gy<A, C> m15671a(List<A> list, Map<B, C> map, AbstractC7068gz.C7069a.AbstractC7071a<A, B> abstractC7071a, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i = 0;
        for (A a : list) {
            objArr[i] = a;
            objArr2[i] = map.get(abstractC7071a.mo15658a(a));
            i++;
        }
        return new C7066gy<>(comparator, objArr, objArr2);
    }

    /* renamed from: a */
    public static <K, V> C7066gy<K, V> m15670a(Map<K, V> map, Comparator<K> comparator) {
        return m15671a(new ArrayList(map.keySet()), map, AbstractC7068gz.C7069a.m15662a(), comparator);
    }

    /* renamed from: a */
    private Iterator<Map.Entry<K, V>> m15673a(final int i, final boolean z) {
        return new Iterator<Map.Entry<K, V>>() { // from class: com.google.android.gms.internal.gy.1

            /* renamed from: a */
            int f23849a;

            {
                this.f23849a = i;
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry<K, V> next() {
                Object obj = C7066gy.this.f23846a[this.f23849a];
                Object obj2 = C7066gy.this.f23847b[this.f23849a];
                this.f23849a = z ? this.f23849a - 1 : this.f23849a + 1;
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return z ? this.f23849a >= 0 : this.f23849a < C7066gy.this.f23846a.length;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            }
        };
    }

    /* renamed from: a */
    private static <T> T[] m15669a(T[] tArr, int i) {
        int length = tArr.length - 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        System.arraycopy(tArr, i + 1, tArr2, i, length - i);
        return tArr2;
    }

    /* renamed from: a */
    private static <T> T[] m15668a(T[] tArr, int i, T t) {
        int length = tArr.length + 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, i);
        tArr2[i] = t;
        System.arraycopy(tArr, i, tArr2, i + 1, (length - i) - 1);
        return tArr2;
    }

    /* renamed from: b */
    private static <T> T[] m15666b(T[] tArr, int i, T t) {
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[i] = t;
        return tArr2;
    }

    /* renamed from: e */
    private int m15665e(K k) {
        int i = 0;
        while (i < this.f23846a.length && this.f23848c.compare(this.f23846a[i], k) < 0) {
            i++;
        }
        return i;
    }

    /* renamed from: f */
    private int m15664f(K k) {
        int i = 0;
        K[] kArr = this.f23846a;
        int length = kArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (this.f23848c.compare(k, kArr[i2]) == 0) {
                return i;
            }
            i2++;
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: a */
    public AbstractC7068gz<K, V> mo15621a(K k, V v) {
        int m15664f = m15664f(k);
        if (m15664f != -1) {
            if (this.f23846a[m15664f] == k && this.f23847b[m15664f] == v) {
                return this;
            }
            return new C7066gy(this.f23848c, m15666b(this.f23846a, m15664f, k), m15666b(this.f23847b, m15664f, v));
        } else if (this.f23846a.length <= 25) {
            int m15665e = m15665e(k);
            return new C7066gy(this.f23848c, m15668a(this.f23846a, m15665e, k), m15668a(this.f23847b, m15665e, v));
        } else {
            HashMap hashMap = new HashMap(this.f23846a.length + 1);
            for (int i = 0; i < this.f23846a.length; i++) {
                hashMap.put(this.f23846a[i], this.f23847b[i]);
            }
            hashMap.put(k, v);
            return C7083hh.m15619a((Map) hashMap, (Comparator) this.f23848c);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: a */
    public K mo15624a() {
        if (this.f23846a.length > 0) {
            return this.f23846a[0];
        }
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: a */
    public void mo15623a(AbstractC7078he.AbstractC7080b<K, V> abstractC7080b) {
        for (int i = 0; i < this.f23846a.length; i++) {
            abstractC7080b.mo14811a(this.f23846a[i], this.f23847b[i]);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: a */
    public boolean mo15622a(K k) {
        return m15664f(k) != -1;
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: b */
    public K mo15618b() {
        if (this.f23846a.length > 0) {
            return this.f23846a[this.f23846a.length - 1];
        }
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: b */
    public V mo15617b(K k) {
        int m15664f = m15664f(k);
        if (m15664f != -1) {
            return this.f23847b[m15664f];
        }
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: c */
    public int mo15616c() {
        return this.f23846a.length;
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: c */
    public AbstractC7068gz<K, V> mo15615c(K k) {
        int m15664f = m15664f(k);
        if (m15664f == -1) {
            return this;
        }
        return new C7066gy(this.f23848c, m15669a(this.f23846a, m15664f), m15669a(this.f23847b, m15664f));
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: d */
    public K mo15613d(K k) {
        int m15664f = m15664f(k);
        if (m15664f == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (m15664f <= 0) {
            return null;
        }
        return this.f23846a[m15664f - 1];
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: d */
    public boolean mo15614d() {
        return this.f23846a.length == 0;
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: e */
    public Iterator<Map.Entry<K, V>> mo15612e() {
        return m15673a(this.f23846a.length - 1, true);
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: f */
    public Comparator<K> mo15610f() {
        return this.f23848c;
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return m15673a(0, false);
    }
}
