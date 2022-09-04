package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7068gz;
import com.google.android.gms.internal.AbstractC7078he;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.hh */
/* loaded from: classes2.dex */
public class C7083hh<K, V> extends AbstractC7068gz<K, V> {

    /* renamed from: a */
    private AbstractC7078he<K, V> f23866a;

    /* renamed from: b */
    private Comparator<K> f23867b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.hh$a */
    /* loaded from: classes2.dex */
    public static class C7085a<A, B, C> {

        /* renamed from: a */
        private final List<A> f23868a;

        /* renamed from: b */
        private final Map<B, C> f23869b;

        /* renamed from: c */
        private final AbstractC7068gz.C7069a.AbstractC7071a<A, B> f23870c;

        /* renamed from: d */
        private AbstractC7082hg<A, C> f23871d;

        /* renamed from: e */
        private AbstractC7082hg<A, C> f23872e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.gms.internal.hh$a$a */
        /* loaded from: classes2.dex */
        public static class C7086a implements Iterable<C7088b> {

            /* renamed from: a */
            private long f23873a;

            /* renamed from: b */
            private final int f23874b;

            public C7086a(int i) {
                int i2 = i + 1;
                this.f23874b = (int) Math.floor(Math.log(i2) / Math.log(2.0d));
                this.f23873a = i2 & (((long) Math.pow(2.0d, this.f23874b)) - 1);
            }

            @Override // java.lang.Iterable
            public Iterator<C7088b> iterator() {
                return new Iterator<C7088b>() { // from class: com.google.android.gms.internal.hh.a.a.1

                    /* renamed from: b */
                    private int f23876b;

                    {
                        this.f23876b = C7086a.this.f23874b - 1;
                    }

                    @Override // java.util.Iterator
                    /* renamed from: a */
                    public C7088b next() {
                        boolean z = true;
                        C7088b c7088b = new C7088b();
                        if ((C7086a.this.f23873a & (1 << this.f23876b)) != 0) {
                            z = false;
                        }
                        c7088b.f23877a = z;
                        c7088b.f23878b = (int) Math.pow(2.0d, this.f23876b);
                        this.f23876b--;
                        return c7088b;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.f23876b >= 0;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                    }
                };
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.gms.internal.hh$a$b */
        /* loaded from: classes2.dex */
        public static class C7088b {

            /* renamed from: a */
            public boolean f23877a;

            /* renamed from: b */
            public int f23878b;

            C7088b() {
            }
        }

        private C7085a(List<A> list, Map<B, C> map, AbstractC7068gz.C7069a.AbstractC7071a<A, B> abstractC7071a) {
            this.f23868a = list;
            this.f23869b = map;
            this.f23870c = abstractC7071a;
        }

        /* renamed from: a */
        private AbstractC7078he<A, C> m15609a(int i, int i2) {
            if (i2 == 0) {
                return C7077hd.m15650a();
            }
            if (i2 == 1) {
                A a = this.f23868a.get(i);
                return new C7076hc(a, m15607a(a), null, null);
            }
            int i3 = i2 / 2;
            int i4 = i + i3;
            AbstractC7078he<A, C> m15609a = m15609a(i, i3);
            AbstractC7078he<A, C> m15609a2 = m15609a(i4 + 1, i3);
            A a2 = this.f23868a.get(i4);
            return new C7076hc(a2, m15607a(a2), m15609a, m15609a2);
        }

        /* renamed from: a */
        public static <A, B, C> C7083hh<A, C> m15606a(List<A> list, Map<B, C> map, AbstractC7068gz.C7069a.AbstractC7071a<A, B> abstractC7071a, Comparator<A> comparator) {
            C7085a c7085a = new C7085a(list, map, abstractC7071a);
            Collections.sort(list, comparator);
            Iterator<C7088b> it2 = new C7086a(list.size()).iterator();
            int size = list.size();
            while (true) {
                int i = size;
                if (!it2.hasNext()) {
                    break;
                }
                C7088b next = it2.next();
                int i2 = i - next.f23878b;
                if (next.f23877a) {
                    c7085a.m15608a(AbstractC7078he.EnumC7079a.BLACK, next.f23878b, i2);
                } else {
                    c7085a.m15608a(AbstractC7078he.EnumC7079a.BLACK, next.f23878b, i2);
                    i2 -= next.f23878b;
                    c7085a.m15608a(AbstractC7078he.EnumC7079a.RED, next.f23878b, i2);
                }
                size = i2;
            }
            return new C7083hh<>(c7085a.f23871d == null ? C7077hd.m15650a() : c7085a.f23871d, comparator);
        }

        /* renamed from: a */
        private C m15607a(A a) {
            return this.f23869b.get(this.f23870c.mo15658a(a));
        }

        /* renamed from: a */
        private void m15608a(AbstractC7078he.EnumC7079a enumC7079a, int i, int i2) {
            AbstractC7078he<A, C> m15609a = m15609a(i2 + 1, i - 1);
            A a = this.f23868a.get(i2);
            AbstractC7082hg<A, C> c7081hf = enumC7079a == AbstractC7078he.EnumC7079a.RED ? new C7081hf<>(a, m15607a(a), null, m15609a) : new C7076hc<>(a, m15607a(a), null, m15609a);
            if (this.f23871d == null) {
                this.f23871d = c7081hf;
                this.f23872e = c7081hf;
                return;
            }
            this.f23872e.m15646a(c7081hf);
            this.f23872e = c7081hf;
        }
    }

    private C7083hh(AbstractC7078he<K, V> abstractC7078he, Comparator<K> comparator) {
        this.f23866a = abstractC7078he;
        this.f23867b = comparator;
    }

    /* renamed from: a */
    public static <A, B, C> C7083hh<A, C> m15620a(List<A> list, Map<B, C> map, AbstractC7068gz.C7069a.AbstractC7071a<A, B> abstractC7071a, Comparator<A> comparator) {
        return C7085a.m15606a(list, map, abstractC7071a, comparator);
    }

    /* renamed from: a */
    public static <A, B> C7083hh<A, B> m15619a(Map<A, B> map, Comparator<A> comparator) {
        return C7085a.m15606a(new ArrayList(map.keySet()), map, AbstractC7068gz.C7069a.m15662a(), comparator);
    }

    /* renamed from: e */
    private AbstractC7078he<K, V> m15611e(K k) {
        AbstractC7078he<K, V> abstractC7078he = this.f23866a;
        while (!abstractC7078he.mo15639c()) {
            int compare = this.f23867b.compare(k, abstractC7078he.mo15638d());
            if (compare < 0) {
                abstractC7078he = abstractC7078he.mo15636f();
            } else if (compare == 0) {
                return abstractC7078he;
            } else {
                abstractC7078he = abstractC7078he.mo15635g();
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: a */
    public AbstractC7068gz<K, V> mo15621a(K k, V v) {
        return new C7083hh(this.f23866a.mo15643a(k, v, this.f23867b).mo15645a(null, null, AbstractC7078he.EnumC7079a.BLACK, null, null), this.f23867b);
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: a */
    public K mo15624a() {
        return this.f23866a.mo15634h().mo15638d();
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: a */
    public void mo15623a(AbstractC7078he.AbstractC7080b<K, V> abstractC7080b) {
        this.f23866a.mo15647a(abstractC7080b);
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: a */
    public boolean mo15622a(K k) {
        return m15611e(k) != null;
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: b */
    public K mo15618b() {
        return this.f23866a.mo15633i().mo15638d();
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: b */
    public V mo15617b(K k) {
        AbstractC7078he<K, V> m15611e = m15611e(k);
        if (m15611e != null) {
            return m15611e.mo15637e();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: c */
    public int mo15616c() {
        return this.f23866a.mo15632j();
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: c */
    public AbstractC7068gz<K, V> mo15615c(K k) {
        return !mo15622a((C7083hh<K, V>) k) ? this : new C7083hh(this.f23866a.mo15642a(k, this.f23867b).mo15645a(null, null, AbstractC7078he.EnumC7079a.BLACK, null, null), this.f23867b);
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: d */
    public K mo15613d(K k) {
        AbstractC7078he<K, V> abstractC7078he = this.f23866a;
        AbstractC7078he<K, V> abstractC7078he2 = null;
        while (!abstractC7078he.mo15639c()) {
            int compare = this.f23867b.compare(k, abstractC7078he.mo15638d());
            if (compare == 0) {
                if (abstractC7078he.mo15636f().mo15639c()) {
                    if (abstractC7078he2 == null) {
                        return null;
                    }
                    return abstractC7078he2.mo15638d();
                }
                AbstractC7078he<K, V> mo15636f = abstractC7078he.mo15636f();
                while (!mo15636f.mo15635g().mo15639c()) {
                    mo15636f = mo15636f.mo15635g();
                }
                return mo15636f.mo15638d();
            } else if (compare < 0) {
                abstractC7078he = abstractC7078he.mo15636f();
            } else {
                AbstractC7078he<K, V> abstractC7078he3 = abstractC7078he;
                abstractC7078he = abstractC7078he.mo15635g();
                abstractC7078he2 = abstractC7078he3;
            }
        }
        String valueOf = String.valueOf(k);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Couldn't find predecessor key of non-present key: ").append(valueOf).toString());
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: d */
    public boolean mo15614d() {
        return this.f23866a.mo15639c();
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: e */
    public Iterator<Map.Entry<K, V>> mo15612e() {
        return new C7073ha(this.f23866a, null, this.f23867b, true);
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz
    /* renamed from: f */
    public Comparator<K> mo15610f() {
        return this.f23867b;
    }

    @Override // com.google.android.gms.internal.AbstractC7068gz, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new C7073ha(this.f23866a, null, this.f23867b, false);
    }
}
