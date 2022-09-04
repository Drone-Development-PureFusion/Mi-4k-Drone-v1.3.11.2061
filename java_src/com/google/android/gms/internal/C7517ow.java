package com.google.android.gms.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* renamed from: com.google.android.gms.internal.ow */
/* loaded from: classes2.dex */
public final class C7517ow<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: f */
    static final /* synthetic */ boolean f25013f;

    /* renamed from: g */
    private static final Comparator<Comparable> f25014g;

    /* renamed from: a */
    Comparator<? super K> f25015a;

    /* renamed from: b */
    C7524d<K, V> f25016b;

    /* renamed from: c */
    int f25017c;

    /* renamed from: d */
    int f25018d;

    /* renamed from: e */
    final C7524d<K, V> f25019e;

    /* renamed from: h */
    private C7519a f25020h;

    /* renamed from: i */
    private C7521b f25021i;

    /* renamed from: com.google.android.gms.internal.ow$a */
    /* loaded from: classes2.dex */
    class C7519a extends AbstractSet<Map.Entry<K, V>> {
        C7519a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C7517ow.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C7517ow.this.m14284a((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new AbstractC7523c<Map.Entry<K, V>>() { // from class: com.google.android.gms.internal.ow.a.1
                {
                    C7517ow c7517ow = C7517ow.this;
                }

                @Override // java.util.Iterator
                /* renamed from: a */
                public Map.Entry<K, V> next() {
                    return b();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C7524d<K, V> m14284a;
            if ((obj instanceof Map.Entry) && (m14284a = C7517ow.this.m14284a((Map.Entry) obj)) != null) {
                C7517ow.this.m14288a((C7524d) m14284a, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C7517ow.this.f25017c;
        }
    }

    /* renamed from: com.google.android.gms.internal.ow$b */
    /* loaded from: classes2.dex */
    final class C7521b extends AbstractSet<K> {
        C7521b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C7517ow.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C7517ow.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new AbstractC7523c<K>() { // from class: com.google.android.gms.internal.ow.b.1
                {
                    C7517ow c7517ow = C7517ow.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return b().f25035f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C7517ow.this.m14281b(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C7517ow.this.f25017c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ow$c */
    /* loaded from: classes2.dex */
    public abstract class AbstractC7523c<T> implements Iterator<T> {

        /* renamed from: b */
        C7524d<K, V> f25026b;

        /* renamed from: c */
        C7524d<K, V> f25027c;

        /* renamed from: d */
        int f25028d;

        private AbstractC7523c() {
            this.f25026b = C7517ow.this.f25019e.f25033d;
            this.f25027c = null;
            this.f25028d = C7517ow.this.f25018d;
        }

        /* renamed from: b */
        final C7524d<K, V> m14278b() {
            C7524d<K, V> c7524d = this.f25026b;
            if (c7524d == C7517ow.this.f25019e) {
                throw new NoSuchElementException();
            }
            if (C7517ow.this.f25018d != this.f25028d) {
                throw new ConcurrentModificationException();
            }
            this.f25026b = c7524d.f25033d;
            this.f25027c = c7524d;
            return c7524d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f25026b != C7517ow.this.f25019e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f25027c == null) {
                throw new IllegalStateException();
            }
            C7517ow.this.m14288a((C7524d) this.f25027c, true);
            this.f25027c = null;
            this.f25028d = C7517ow.this.f25018d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ow$d */
    /* loaded from: classes2.dex */
    public static final class C7524d<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        C7524d<K, V> f25030a;

        /* renamed from: b */
        C7524d<K, V> f25031b;

        /* renamed from: c */
        C7524d<K, V> f25032c;

        /* renamed from: d */
        C7524d<K, V> f25033d;

        /* renamed from: e */
        C7524d<K, V> f25034e;

        /* renamed from: f */
        final K f25035f;

        /* renamed from: g */
        V f25036g;

        /* renamed from: h */
        int f25037h;

        C7524d() {
            this.f25035f = null;
            this.f25034e = this;
            this.f25033d = this;
        }

        C7524d(C7524d<K, V> c7524d, K k, C7524d<K, V> c7524d2, C7524d<K, V> c7524d3) {
            this.f25030a = c7524d;
            this.f25035f = k;
            this.f25037h = 1;
            this.f25033d = c7524d2;
            this.f25034e = c7524d3;
            c7524d3.f25033d = this;
            c7524d2.f25034e = this;
        }

        /* renamed from: a */
        public C7524d<K, V> m14277a() {
            for (C7524d<K, V> c7524d = this.f25031b; c7524d != null; c7524d = c7524d.f25031b) {
                this = c7524d;
            }
            return this;
        }

        /* renamed from: b */
        public C7524d<K, V> m14276b() {
            for (C7524d<K, V> c7524d = this.f25032c; c7524d != null; c7524d = c7524d.f25032c) {
                this = c7524d;
            }
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (this.f25035f == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!this.f25035f.equals(entry.getKey())) {
                    return false;
                }
                if (this.f25036g == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!this.f25036g.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f25035f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f25036g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i = 0;
            int hashCode = this.f25035f == null ? 0 : this.f25035f.hashCode();
            if (this.f25036g != null) {
                i = this.f25036g.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f25036g;
            this.f25036g = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f25035f);
            String valueOf2 = String.valueOf(this.f25036g);
            return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
        }
    }

    static {
        f25013f = !C7517ow.class.desiredAssertionStatus();
        f25014g = new Comparator<Comparable>() { // from class: com.google.android.gms.internal.ow.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(Comparable comparable, Comparable comparable2) {
                return comparable.compareTo(comparable2);
            }
        };
    }

    public C7517ow() {
        this(f25014g);
    }

    public C7517ow(Comparator<? super K> comparator) {
        this.f25017c = 0;
        this.f25018d = 0;
        this.f25019e = new C7524d<>();
        this.f25015a = comparator == null ? f25014g : comparator;
    }

    /* renamed from: a */
    private void m14290a(C7524d<K, V> c7524d) {
        int i = 0;
        C7524d<K, V> c7524d2 = c7524d.f25031b;
        C7524d<K, V> c7524d3 = c7524d.f25032c;
        C7524d<K, V> c7524d4 = c7524d3.f25031b;
        C7524d<K, V> c7524d5 = c7524d3.f25032c;
        c7524d.f25032c = c7524d4;
        if (c7524d4 != null) {
            c7524d4.f25030a = c7524d;
        }
        m14289a((C7524d) c7524d, (C7524d) c7524d3);
        c7524d3.f25031b = c7524d;
        c7524d.f25030a = c7524d3;
        c7524d.f25037h = Math.max(c7524d2 != null ? c7524d2.f25037h : 0, c7524d4 != null ? c7524d4.f25037h : 0) + 1;
        int i2 = c7524d.f25037h;
        if (c7524d5 != null) {
            i = c7524d5.f25037h;
        }
        c7524d3.f25037h = Math.max(i2, i) + 1;
    }

    /* renamed from: a */
    private void m14289a(C7524d<K, V> c7524d, C7524d<K, V> c7524d2) {
        C7524d<K, V> c7524d3 = c7524d.f25030a;
        c7524d.f25030a = null;
        if (c7524d2 != null) {
            c7524d2.f25030a = c7524d3;
        }
        if (c7524d3 == null) {
            this.f25016b = c7524d2;
        } else if (c7524d3.f25031b == c7524d) {
            c7524d3.f25031b = c7524d2;
        } else if (!f25013f && c7524d3.f25032c != c7524d) {
            throw new AssertionError();
        } else {
            c7524d3.f25032c = c7524d2;
        }
    }

    /* renamed from: a */
    private boolean m14286a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    private void m14283b(C7524d<K, V> c7524d) {
        int i = 0;
        C7524d<K, V> c7524d2 = c7524d.f25031b;
        C7524d<K, V> c7524d3 = c7524d.f25032c;
        C7524d<K, V> c7524d4 = c7524d2.f25031b;
        C7524d<K, V> c7524d5 = c7524d2.f25032c;
        c7524d.f25031b = c7524d5;
        if (c7524d5 != null) {
            c7524d5.f25030a = c7524d;
        }
        m14289a((C7524d) c7524d, (C7524d) c7524d2);
        c7524d2.f25032c = c7524d;
        c7524d.f25030a = c7524d2;
        c7524d.f25037h = Math.max(c7524d3 != null ? c7524d3.f25037h : 0, c7524d5 != null ? c7524d5.f25037h : 0) + 1;
        int i2 = c7524d.f25037h;
        if (c7524d4 != null) {
            i = c7524d4.f25037h;
        }
        c7524d2.f25037h = Math.max(i2, i) + 1;
    }

    /* renamed from: b */
    private void m14282b(C7524d<K, V> c7524d, boolean z) {
        while (c7524d != null) {
            C7524d<K, V> c7524d2 = c7524d.f25031b;
            C7524d<K, V> c7524d3 = c7524d.f25032c;
            int i = c7524d2 != null ? c7524d2.f25037h : 0;
            int i2 = c7524d3 != null ? c7524d3.f25037h : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C7524d<K, V> c7524d4 = c7524d3.f25031b;
                C7524d<K, V> c7524d5 = c7524d3.f25032c;
                int i4 = (c7524d4 != null ? c7524d4.f25037h : 0) - (c7524d5 != null ? c7524d5.f25037h : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m14290a((C7524d) c7524d);
                } else if (!f25013f && i4 != 1) {
                    throw new AssertionError();
                } else {
                    m14283b((C7524d) c7524d3);
                    m14290a((C7524d) c7524d);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C7524d<K, V> c7524d6 = c7524d2.f25031b;
                C7524d<K, V> c7524d7 = c7524d2.f25032c;
                int i5 = (c7524d6 != null ? c7524d6.f25037h : 0) - (c7524d7 != null ? c7524d7.f25037h : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m14283b((C7524d) c7524d);
                } else if (!f25013f && i5 != -1) {
                    throw new AssertionError();
                } else {
                    m14290a((C7524d) c7524d2);
                    m14283b((C7524d) c7524d);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c7524d.f25037h = i + 1;
                if (z) {
                    return;
                }
            } else if (!f25013f && i3 != -1 && i3 != 1) {
                throw new AssertionError();
            } else {
                c7524d.f25037h = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c7524d = c7524d.f25030a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    C7524d<K, V> m14287a(Object obj) {
        if (obj != 0) {
            try {
                return m14285a((C7517ow<K, V>) obj, false);
            } catch (ClassCastException e) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    C7524d<K, V> m14285a(K k, boolean z) {
        C7524d<K, V> c7524d;
        int i;
        C7524d<K, V> c7524d2;
        Comparator<? super K> comparator = this.f25015a;
        C7524d<K, V> c7524d3 = this.f25016b;
        if (c7524d3 != null) {
            Comparable comparable = comparator == f25014g ? (Comparable) k : null;
            while (true) {
                int compareTo = comparable != null ? comparable.compareTo(c7524d3.f25035f) : comparator.compare(k, (K) c7524d3.f25035f);
                if (compareTo == 0) {
                    return c7524d3;
                }
                C7524d<K, V> c7524d4 = compareTo < 0 ? c7524d3.f25031b : c7524d3.f25032c;
                if (c7524d4 == null) {
                    int i2 = compareTo;
                    c7524d = c7524d3;
                    i = i2;
                    break;
                }
                c7524d3 = c7524d4;
            }
        } else {
            c7524d = c7524d3;
            i = 0;
        }
        if (z) {
            C7524d<K, V> c7524d5 = this.f25019e;
            if (c7524d != null) {
                c7524d2 = new C7524d<>(c7524d, k, c7524d5, c7524d5.f25034e);
                if (i < 0) {
                    c7524d.f25031b = c7524d2;
                } else {
                    c7524d.f25032c = c7524d2;
                }
                m14282b(c7524d, true);
            } else if (comparator == f25014g && !(k instanceof Comparable)) {
                throw new ClassCastException(String.valueOf(k.getClass().getName()).concat(" is not Comparable"));
            } else {
                c7524d2 = new C7524d<>(c7524d, k, c7524d5, c7524d5.f25034e);
                this.f25016b = c7524d2;
            }
            this.f25017c++;
            this.f25018d++;
            return c7524d2;
        }
        return null;
    }

    /* renamed from: a */
    C7524d<K, V> m14284a(Map.Entry<?, ?> entry) {
        C7524d<K, V> m14287a = m14287a(entry.getKey());
        if (m14287a != null && m14286a(m14287a.f25036g, entry.getValue())) {
            return m14287a;
        }
        return null;
    }

    /* renamed from: a */
    void m14288a(C7524d<K, V> c7524d, boolean z) {
        int i;
        int i2 = 0;
        if (z) {
            c7524d.f25034e.f25033d = c7524d.f25033d;
            c7524d.f25033d.f25034e = c7524d.f25034e;
        }
        C7524d<K, V> c7524d2 = c7524d.f25031b;
        C7524d<K, V> c7524d3 = c7524d.f25032c;
        C7524d<K, V> c7524d4 = c7524d.f25030a;
        if (c7524d2 == null || c7524d3 == null) {
            if (c7524d2 != null) {
                m14289a((C7524d) c7524d, (C7524d) c7524d2);
                c7524d.f25031b = null;
            } else if (c7524d3 != null) {
                m14289a((C7524d) c7524d, (C7524d) c7524d3);
                c7524d.f25032c = null;
            } else {
                m14289a((C7524d) c7524d, (C7524d) null);
            }
            m14282b(c7524d4, false);
            this.f25017c--;
            this.f25018d++;
            return;
        }
        C7524d<K, V> m14276b = c7524d2.f25037h > c7524d3.f25037h ? c7524d2.m14276b() : c7524d3.m14277a();
        m14288a((C7524d) m14276b, false);
        C7524d<K, V> c7524d5 = c7524d.f25031b;
        if (c7524d5 != null) {
            i = c7524d5.f25037h;
            m14276b.f25031b = c7524d5;
            c7524d5.f25030a = m14276b;
            c7524d.f25031b = null;
        } else {
            i = 0;
        }
        C7524d<K, V> c7524d6 = c7524d.f25032c;
        if (c7524d6 != null) {
            i2 = c7524d6.f25037h;
            m14276b.f25032c = c7524d6;
            c7524d6.f25030a = m14276b;
            c7524d.f25032c = null;
        }
        m14276b.f25037h = Math.max(i, i2) + 1;
        m14289a((C7524d) c7524d, (C7524d) m14276b);
    }

    /* renamed from: b */
    C7524d<K, V> m14281b(Object obj) {
        C7524d<K, V> m14287a = m14287a(obj);
        if (m14287a != null) {
            m14288a((C7524d) m14287a, true);
        }
        return m14287a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f25016b = null;
        this.f25017c = 0;
        this.f25018d++;
        C7524d<K, V> c7524d = this.f25019e;
        c7524d.f25034e = c7524d;
        c7524d.f25033d = c7524d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m14287a(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C7519a c7519a = this.f25020h;
        if (c7519a != null) {
            return c7519a;
        }
        C7519a c7519a2 = new C7519a();
        this.f25020h = c7519a2;
        return c7519a2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C7524d<K, V> m14287a = m14287a(obj);
        if (m14287a != null) {
            return m14287a.f25036g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C7521b c7521b = this.f25021i;
        if (c7521b != null) {
            return c7521b;
        }
        C7521b c7521b2 = new C7521b();
        this.f25021i = c7521b2;
        return c7521b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        C7524d<K, V> m14285a = m14285a((C7517ow<K, V>) k, true);
        V v2 = m14285a.f25036g;
        m14285a.f25036g = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C7524d<K, V> m14281b = m14281b(obj);
        if (m14281b != null) {
            return m14281b.f25036g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f25017c;
    }
}
