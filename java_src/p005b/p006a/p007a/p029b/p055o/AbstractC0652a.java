package p005b.p006a.p007a.p029b.p055o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: b.a.a.b.o.a */
/* loaded from: classes.dex */
public abstract class AbstractC0652a<C> implements AbstractC0660d<C> {

    /* renamed from: a */
    private static final boolean f1177a = true;

    /* renamed from: e */
    public static final long f1178e = 10000;

    /* renamed from: f */
    public static final long f1179f = 1000;

    /* renamed from: g */
    protected int f1183g = Integer.MAX_VALUE;

    /* renamed from: h */
    protected long f1184h = 1800000;

    /* renamed from: i */
    LinkedHashMap<String, C0656a<C>> f1185i = new LinkedHashMap<>(32, 0.75f, true);

    /* renamed from: j */
    LinkedHashMap<String, C0656a<C>> f1186j = new LinkedHashMap<>(16, 0.75f, true);

    /* renamed from: k */
    long f1187k = 0;

    /* renamed from: b */
    private AbstractC0657b<C> f1180b = new AbstractC0657b<C>() { // from class: b.a.a.b.o.a.1
        @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0652a.AbstractC0657b
        /* renamed from: a */
        public boolean mo38570a(C0656a<C> c0656a, long j) {
            return AbstractC0652a.this.f1185i.size() > AbstractC0652a.this.f1183g;
        }
    };

    /* renamed from: c */
    private AbstractC0657b<C> f1181c = new AbstractC0657b<C>() { // from class: b.a.a.b.o.a.2
        @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0652a.AbstractC0657b
        /* renamed from: a */
        public boolean mo38570a(C0656a<C> c0656a, long j) {
            return AbstractC0652a.this.m38584a(c0656a, j);
        }
    };

    /* renamed from: d */
    private AbstractC0657b<C> f1182d = new AbstractC0657b<C>() { // from class: b.a.a.b.o.a.3
        @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0652a.AbstractC0657b
        /* renamed from: a */
        public boolean mo38570a(C0656a<C> c0656a, long j) {
            return AbstractC0652a.this.m38579b(c0656a, j);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.a.a.b.o.a$a */
    /* loaded from: classes.dex */
    public static class C0656a<C> {

        /* renamed from: a */
        String f1191a;

        /* renamed from: b */
        C f1192b;

        /* renamed from: c */
        long f1193c;

        C0656a(String str, C c, long j) {
            this.f1191a = str;
            this.f1192b = c;
            this.f1193c = j;
        }

        /* renamed from: a */
        public void m38571a(long j) {
            this.f1193c = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C0656a c0656a = (C0656a) obj;
                if (this.f1191a == null) {
                    if (c0656a.f1191a != null) {
                        return false;
                    }
                } else if (!this.f1191a.equals(c0656a.f1191a)) {
                    return false;
                }
                return this.f1192b == null ? c0656a.f1192b == null : this.f1192b.equals(c0656a.f1192b);
            }
            return false;
        }

        public int hashCode() {
            return this.f1191a.hashCode();
        }

        public String toString() {
            return "(" + this.f1191a + ", " + this.f1192b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.a.a.b.o.a$b */
    /* loaded from: classes.dex */
    public interface AbstractC0657b<C> {
        /* renamed from: a */
        boolean mo38570a(C0656a<C> c0656a, long j);
    }

    /* renamed from: a */
    private C0656a<C> m38582a(String str) {
        C0656a<C> c0656a = this.f1185i.get(str);
        return c0656a != null ? c0656a : this.f1186j.get(str);
    }

    /* renamed from: a */
    private void m38581a(LinkedHashMap<String, C0656a<C>> linkedHashMap, long j, AbstractC0657b<C> abstractC0657b) {
        Iterator<Map.Entry<String, C0656a<C>>> it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            C0656a<C> value = it2.next().getValue();
            if (!abstractC0657b.mo38570a(value, j)) {
                return;
            }
            it2.remove();
            mo38536b((AbstractC0652a<C>) value.f1192b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m38584a(C0656a<C> c0656a, long j) {
        return mo38540a((AbstractC0652a<C>) c0656a.f1192b) || c0656a.f1193c + this.f1184h < j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m38579b(C0656a c0656a, long j) {
        return c0656a.f1193c + 10000 < j;
    }

    /* renamed from: c */
    private void m38577c(long j) {
        m38581a(this.f1185i, j, this.f1181c);
    }

    /* renamed from: d */
    private void m38575d(long j) {
        m38581a(this.f1186j, j, this.f1182d);
    }

    /* renamed from: e */
    private boolean m38573e(long j) {
        if (this.f1187k + 1000 > j) {
            return true;
        }
        this.f1187k = j;
        return false;
    }

    /* renamed from: f */
    private void m38572f() {
        m38581a(this.f1185i, 0L, this.f1180b);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0660d
    /* renamed from: a */
    public int mo38561a() {
        return this.f1185i.size() + this.f1186j.size();
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0660d
    /* renamed from: a */
    public synchronized C mo38559a(String str, long j) {
        C0656a<C> m38582a;
        m38582a = m38582a(str);
        if (m38582a == null) {
            m38582a = new C0656a<>(str, mo38535b(str), j);
            this.f1185i.put(str, m38582a);
        } else {
            m38582a.m38571a(j);
        }
        return m38582a.f1192b;
    }

    /* renamed from: a */
    public void m38585a(int i) {
        this.f1183g = i;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0660d
    /* renamed from: a */
    public synchronized void mo38560a(long j) {
        if (!m38573e(j)) {
            m38572f();
            m38577c(j);
            m38575d(j);
        }
    }

    /* renamed from: a */
    protected abstract boolean mo38540a(C c);

    /* renamed from: b */
    protected abstract C mo38535b(String str);

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0660d
    /* renamed from: b */
    public Set<String> mo38558b() {
        HashSet hashSet = new HashSet(this.f1185i.keySet());
        hashSet.addAll(this.f1186j.keySet());
        return hashSet;
    }

    /* renamed from: b */
    public void m38580b(long j) {
        this.f1184h = j;
    }

    /* renamed from: b */
    protected abstract void mo38536b(C c);

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0660d
    /* renamed from: c */
    public synchronized C mo38556c(String str) {
        C0656a<C> m38582a;
        m38582a = m38582a(str);
        return m38582a == null ? null : m38582a.f1192b;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0660d
    /* renamed from: c */
    public Collection<C> mo38557c() {
        ArrayList arrayList = new ArrayList();
        for (C0656a<C> c0656a : this.f1185i.values()) {
            arrayList.add(c0656a.f1192b);
        }
        for (C0656a<C> c0656a2 : this.f1186j.values()) {
            arrayList.add(c0656a2.f1192b);
        }
        return arrayList;
    }

    /* renamed from: d */
    public long m38576d() {
        return this.f1184h;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0660d
    /* renamed from: d */
    public void mo38555d(String str) {
        C0656a<C> remove = this.f1185i.remove(str);
        if (remove == null) {
            return;
        }
        this.f1186j.put(str, remove);
    }

    /* renamed from: e */
    public int m38574e() {
        return this.f1183g;
    }
}
