package com.google.android.gms.internal;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.ph */
/* loaded from: classes2.dex */
public final class C7548ph implements AbstractC7489ok {

    /* renamed from: a */
    private final C7500os f25068a;

    /* renamed from: b */
    private final boolean f25069b;

    /* renamed from: com.google.android.gms.internal.ph$a */
    /* loaded from: classes2.dex */
    private final class C7549a<K, V> extends AbstractC7488oj<Map<K, V>> {

        /* renamed from: b */
        private final AbstractC7488oj<K> f25071b;

        /* renamed from: c */
        private final AbstractC7488oj<V> f25072c;

        /* renamed from: d */
        private final AbstractC7525ox<? extends Map<K, V>> f25073d;

        public C7549a(C7459nr c7459nr, Type type, AbstractC7488oj<K> abstractC7488oj, Type type2, AbstractC7488oj<V> abstractC7488oj2, AbstractC7525ox<? extends Map<K, V>> abstractC7525ox) {
            this.f25071b = new C7561pm(c7459nr, abstractC7488oj, type);
            this.f25072c = new C7561pm(c7459nr, abstractC7488oj2, type2);
            this.f25073d = abstractC7525ox;
        }

        /* renamed from: a */
        private String m14250a(AbstractC7471nx abstractC7471nx) {
            if (!abstractC7471nx.m14369j()) {
                if (!abstractC7471nx.m14368k()) {
                    throw new AssertionError();
                }
                return "null";
            }
            C7478od m14365n = abstractC7471nx.m14365n();
            if (m14365n.m14342p()) {
                return String.valueOf(m14365n.mo14350b());
            }
            if (m14365n.m14353a()) {
                return Boolean.toString(m14365n.mo14344g());
            }
            if (!m14365n.m14341q()) {
                throw new AssertionError();
            }
            return m14365n.mo14348c();
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public Map<K, V> mo14172b(C7598pp c7598pp) {
            EnumC7600pq mo14146f = c7598pp.mo14146f();
            if (mo14146f == EnumC7600pq.NULL) {
                c7598pp.mo14142j();
                return null;
            }
            Map<K, V> mo14275a = this.f25073d.mo14275a();
            if (mo14146f != EnumC7600pq.BEGIN_ARRAY) {
                c7598pp.mo14152c();
                while (c7598pp.mo14147e()) {
                    AbstractC7515ou.f25011a.mo14125a(c7598pp);
                    K mo14172b = this.f25071b.mo14172b(c7598pp);
                    if (mo14275a.put(mo14172b, this.f25072c.mo14172b(c7598pp)) != null) {
                        String valueOf = String.valueOf(mo14172b);
                        throw new C7481og(new StringBuilder(String.valueOf(valueOf).length() + 15).append("duplicate key: ").append(valueOf).toString());
                    }
                }
                c7598pp.mo14149d();
                return mo14275a;
            }
            c7598pp.mo14165a();
            while (c7598pp.mo14147e()) {
                c7598pp.mo14165a();
                K mo14172b2 = this.f25071b.mo14172b(c7598pp);
                if (mo14275a.put(mo14172b2, this.f25072c.mo14172b(c7598pp)) != null) {
                    String valueOf2 = String.valueOf(mo14172b2);
                    throw new C7481og(new StringBuilder(String.valueOf(valueOf2).length() + 15).append("duplicate key: ").append(valueOf2).toString());
                }
                c7598pp.mo14158b();
            }
            c7598pp.mo14158b();
            return mo14275a;
        }

        @Override // com.google.android.gms.internal.AbstractC7488oj
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo14173a(C7602ps c7602ps, Object obj) {
            m14248a(c7602ps, (Map) ((Map) obj));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void m14248a(C7602ps c7602ps, Map<K, V> map) {
            int i = 0;
            if (map == null) {
                c7602ps.mo14095f();
            } else if (!C7548ph.this.f25069b) {
                c7602ps.mo14100d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c7602ps.mo14109a(String.valueOf(entry.getKey()));
                    this.f25072c.mo14173a(c7602ps, entry.getValue());
                }
                c7602ps.mo14097e();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    AbstractC7471nx m14336a = this.f25071b.m14336a(entry2.getKey());
                    arrayList.add(m14336a);
                    arrayList2.add(entry2.getValue());
                    z = (m14336a.m14371h() || m14336a.m14370i()) | z;
                }
                if (!z) {
                    c7602ps.mo14100d();
                    while (i < arrayList.size()) {
                        c7602ps.mo14109a(m14250a((AbstractC7471nx) arrayList.get(i)));
                        this.f25072c.mo14173a(c7602ps, arrayList2.get(i));
                        i++;
                    }
                    c7602ps.mo14097e();
                    return;
                }
                c7602ps.mo14107b();
                while (i < arrayList.size()) {
                    c7602ps.mo14107b();
                    C7527oz.m14271a((AbstractC7471nx) arrayList.get(i), c7602ps);
                    this.f25072c.mo14173a(c7602ps, arrayList2.get(i));
                    c7602ps.mo14103c();
                    i++;
                }
                c7602ps.mo14103c();
            }
        }
    }

    public C7548ph(C7500os c7500os, boolean z) {
        this.f25068a = c7500os;
        this.f25069b = z;
    }

    /* renamed from: a */
    private AbstractC7488oj<?> m14252a(C7459nr c7459nr, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? C7562pn.f25121f : c7459nr.m14403a((C7597po) C7597po.m14169a(type));
    }

    @Override // com.google.android.gms.internal.AbstractC7489ok
    /* renamed from: a */
    public <T> AbstractC7488oj<T> mo14182a(C7459nr c7459nr, C7597po<T> c7597po) {
        Type m14168b = c7597po.m14168b();
        if (!Map.class.isAssignableFrom(c7597po.m14171a())) {
            return null;
        }
        Type[] m14315b = C7496or.m14315b(m14168b, C7496or.m14311e(m14168b));
        return new C7549a(c7459nr, m14315b[0], m14252a(c7459nr, m14315b[0]), m14315b[1], c7459nr.m14403a((C7597po) C7597po.m14169a(m14315b[1])), this.f25068a.m14306a(c7597po));
    }
}
