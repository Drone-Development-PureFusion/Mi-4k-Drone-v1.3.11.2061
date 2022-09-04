package com.google.android.gms.internal;

import com.google.android.gms.internal.C7271ju;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.internal.jt */
/* loaded from: classes2.dex */
public class C7264jt {

    /* renamed from: a */
    static final /* synthetic */ boolean f24358a;

    /* renamed from: b */
    private static final AbstractC7275jv<Map<C7293kf, C7263js>> f24359b;

    /* renamed from: c */
    private static final AbstractC7275jv<Map<C7293kf, C7263js>> f24360c;

    /* renamed from: d */
    private static final AbstractC7275jv<C7263js> f24361d;

    /* renamed from: e */
    private static final AbstractC7275jv<C7263js> f24362e;

    /* renamed from: f */
    private C7271ju<Map<C7293kf, C7263js>> f24363f = new C7271ju<>(null);

    /* renamed from: g */
    private final AbstractC7258jq f24364g;

    /* renamed from: h */
    private final C7315ks f24365h;

    /* renamed from: i */
    private final AbstractC7381mc f24366i;

    /* renamed from: j */
    private long f24367j;

    static {
        f24358a = !C7264jt.class.desiredAssertionStatus();
        f24359b = new AbstractC7275jv<Map<C7293kf, C7263js>>() { // from class: com.google.android.gms.internal.jt.1
            @Override // com.google.android.gms.internal.AbstractC7275jv
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public boolean mo14977a(Map<C7293kf, C7263js> map) {
                C7263js c7263js = map.get(C7293kf.f24417a);
                return c7263js != null && c7263js.f24356d;
            }
        };
        f24360c = new AbstractC7275jv<Map<C7293kf, C7263js>>() { // from class: com.google.android.gms.internal.jt.2
            @Override // com.google.android.gms.internal.AbstractC7275jv
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public boolean mo14977a(Map<C7293kf, C7263js> map) {
                C7263js c7263js = map.get(C7293kf.f24417a);
                return c7263js != null && c7263js.f24357e;
            }
        };
        f24361d = new AbstractC7275jv<C7263js>() { // from class: com.google.android.gms.internal.jt.3
            @Override // com.google.android.gms.internal.AbstractC7275jv
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public boolean mo14977a(C7263js c7263js) {
                return !c7263js.f24357e;
            }
        };
        f24362e = new AbstractC7275jv<C7263js>() { // from class: com.google.android.gms.internal.jt.4
            @Override // com.google.android.gms.internal.AbstractC7275jv
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public boolean mo14977a(C7263js c7263js) {
                return !C7264jt.f24361d.mo14977a(c7263js);
            }
        };
    }

    public C7264jt(AbstractC7258jq abstractC7258jq, C7315ks c7315ks, AbstractC7381mc abstractC7381mc) {
        this.f24367j = 0L;
        this.f24364g = abstractC7258jq;
        this.f24365h = c7315ks;
        this.f24366i = abstractC7381mc;
        m15017c();
        for (C7263js c7263js : this.f24364g.mo15050c()) {
            this.f24367j = Math.max(c7263js.f24353a + 1, this.f24367j);
            m15026a(c7263js);
        }
    }

    /* renamed from: a */
    private static long m15027a(AbstractC7251jk abstractC7251jk, long j) {
        return j - Math.min((long) Math.floor((1.0f - abstractC7251jk.mo15086a()) * ((float) j)), abstractC7251jk.mo15083b());
    }

    /* renamed from: a */
    private List<C7263js> m15024a(AbstractC7275jv<C7263js> abstractC7275jv) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<C7160ij, Map<C7293kf, C7263js>>> it2 = this.f24363f.iterator();
        while (it2.hasNext()) {
            for (C7263js c7263js : it2.next().getValue().values()) {
                if (abstractC7275jv.mo14977a(c7263js)) {
                    arrayList.add(c7263js);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m15026a(C7263js c7263js) {
        HashMap hashMap;
        m15008g(c7263js.f24354b);
        Map<C7293kf, C7263js> m14981e = this.f24363f.m14981e(c7263js.f24354b.m14900a());
        if (m14981e == null) {
            HashMap hashMap2 = new HashMap();
            this.f24363f = this.f24363f.m14995a(c7263js.f24354b.m14900a(), (C7160ij) hashMap2);
            hashMap = hashMap2;
        } else {
            hashMap = m14981e;
        }
        C7263js c7263js2 = hashMap.get(c7263js.f24354b.m14897b());
        C7392mk.m14607a(c7263js2 == null || c7263js2.f24353a == c7263js.f24353a);
        hashMap.put(c7263js.f24354b.m14897b(), c7263js);
    }

    /* renamed from: a */
    private void m15022a(C7296kg c7296kg, boolean z) {
        C7263js c7263js;
        C7296kg m15007h = m15007h(c7296kg);
        C7263js m15023a = m15023a(m15007h);
        long mo14618a = this.f24366i.mo14618a();
        if (m15023a != null) {
            c7263js = m15023a.m15032a(mo14618a).m15031a(z);
        } else if (!f24358a && !z) {
            throw new AssertionError("If we're setting the query to inactive, we should already be tracking it!");
        } else {
            long j = this.f24367j;
            this.f24367j = 1 + j;
            c7263js = new C7263js(j, m15007h, mo14618a, false, z);
        }
        m15019b(c7263js);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m15019b(C7263js c7263js) {
        m15026a(c7263js);
        this.f24364g.mo15055a(c7263js);
    }

    /* renamed from: c */
    private void m15017c() {
        try {
            this.f24364g.mo15046e();
            this.f24364g.mo15049c(this.f24366i.mo14618a());
            this.f24364g.mo15044g();
        } finally {
            this.f24364g.mo15045f();
        }
    }

    /* renamed from: e */
    private boolean m15012e(C7160ij c7160ij) {
        return this.f24363f.m14996a(c7160ij, f24359b) != null;
    }

    /* renamed from: f */
    private Set<Long> m15010f(C7160ij c7160ij) {
        HashSet hashSet = new HashSet();
        Map<C7293kf, C7263js> m14981e = this.f24363f.m14981e(c7160ij);
        if (m14981e != null) {
            for (C7263js c7263js : m14981e.values()) {
                if (!c7263js.f24354b.m14894e()) {
                    hashSet.add(Long.valueOf(c7263js.f24353a));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: g */
    private static void m15008g(C7296kg c7296kg) {
        C7392mk.m14606a(!c7296kg.m14894e() || c7296kg.m14895d(), "Can't have tracked non-default query that loads all data");
    }

    /* renamed from: h */
    private static C7296kg m15007h(C7296kg c7296kg) {
        return c7296kg.m14894e() ? C7296kg.m14899a(c7296kg.m14900a()) : c7296kg;
    }

    /* renamed from: a */
    public long m15030a() {
        return m15024a(f24361d).size();
    }

    /* renamed from: a */
    public C7259jr m15028a(AbstractC7251jk abstractC7251jk) {
        List<C7263js> m15024a = m15024a(f24361d);
        long m15027a = m15027a(abstractC7251jk, m15024a.size());
        C7259jr c7259jr = new C7259jr();
        if (this.f24365h.m14844a()) {
            this.f24365h.m14840a(new StringBuilder(80).append("Pruning old queries.  Prunable: ").append(m15024a.size()).append(" Count to prune: ").append(m15027a).toString(), new Object[0]);
        }
        Collections.sort(m15024a, new Comparator<C7263js>() { // from class: com.google.android.gms.internal.jt.6
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(C7263js c7263js, C7263js c7263js2) {
                return C7392mk.m14610a(c7263js.f24355c, c7263js2.f24355c);
            }
        });
        for (int i = 0; i < m15027a; i++) {
            C7263js c7263js = m15024a.get(i);
            c7259jr = c7259jr.m15038c(c7263js.f24354b.m14900a());
            m15018b(c7263js.f24354b);
        }
        int i2 = (int) m15027a;
        C7259jr c7259jr2 = c7259jr;
        while (true) {
            int i3 = i2;
            if (i3 >= m15024a.size()) {
                break;
            }
            c7259jr2 = c7259jr2.m15037d(m15024a.get(i3).f24354b.m14900a());
            i2 = i3 + 1;
        }
        List<C7263js> m15024a2 = m15024a(f24362e);
        if (this.f24365h.m14844a()) {
            this.f24365h.m14840a(new StringBuilder(31).append("Unprunable queries: ").append(m15024a2.size()).toString(), new Object[0]);
        }
        for (C7263js c7263js2 : m15024a2) {
            c7259jr2 = c7259jr2.m15037d(c7263js2.f24354b.m14900a());
        }
        return c7259jr2;
    }

    /* renamed from: a */
    public C7263js m15023a(C7296kg c7296kg) {
        C7296kg m15007h = m15007h(c7296kg);
        Map<C7293kf, C7263js> m14981e = this.f24363f.m14981e(m15007h.m14900a());
        if (m14981e != null) {
            return m14981e.get(m15007h.m14897b());
        }
        return null;
    }

    /* renamed from: a */
    public void m15029a(C7160ij c7160ij) {
        this.f24363f.m14986c(c7160ij).m14994a(new C7271ju.AbstractC7274a<Map<C7293kf, C7263js>, Void>() { // from class: com.google.android.gms.internal.jt.5
            @Override // com.google.android.gms.internal.C7271ju.AbstractC7274a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public Void mo14978a(C7160ij c7160ij2, Map<C7293kf, C7263js> map, Void r6) {
                for (Map.Entry<C7293kf, C7263js> entry : map.entrySet()) {
                    C7263js value = entry.getValue();
                    if (!value.f24356d) {
                        C7264jt.this.m15019b(value.m15033a());
                    }
                }
                return null;
            }
        });
    }

    /* renamed from: b */
    public Set<C7319kv> m15020b(C7160ij c7160ij) {
        if (f24358a || !m15009f(C7296kg.m14899a(c7160ij))) {
            HashSet hashSet = new HashSet();
            Set<Long> m15010f = m15010f(c7160ij);
            if (!m15010f.isEmpty()) {
                hashSet.addAll(this.f24364g.mo15054a(m15010f));
            }
            Iterator<Map.Entry<C7319kv, C7271ju<Map<C7293kf, C7263js>>>> it2 = this.f24363f.m14986c(c7160ij).m14987c().iterator();
            while (it2.hasNext()) {
                Map.Entry<C7319kv, C7271ju<Map<C7293kf, C7263js>>> next = it2.next();
                C7319kv key = next.getKey();
                C7271ju<Map<C7293kf, C7263js>> value = next.getValue();
                if (value.m14990b() != null && f24359b.mo14977a(value.m14990b())) {
                    hashSet.add(key);
                }
            }
            return hashSet;
        }
        throw new AssertionError("Path is fully complete.");
    }

    /* renamed from: b */
    public void m15018b(C7296kg c7296kg) {
        C7296kg m15007h = m15007h(c7296kg);
        C7263js m15023a = m15023a(m15007h);
        if (f24358a || m15023a != null) {
            this.f24364g.mo15052b(m15023a.f24353a);
            Map<C7293kf, C7263js> m14981e = this.f24363f.m14981e(m15007h.m14900a());
            m14981e.remove(m15007h.m14897b());
            if (!m14981e.isEmpty()) {
                return;
            }
            this.f24363f = this.f24363f.m14983d(m15007h.m14900a());
            return;
        }
        throw new AssertionError("Query must exist to be removed.");
    }

    /* renamed from: c */
    public void m15016c(C7160ij c7160ij) {
        C7263js m15033a;
        if (!m15012e(c7160ij)) {
            C7296kg m14899a = C7296kg.m14899a(c7160ij);
            C7263js m15023a = m15023a(m14899a);
            if (m15023a == null) {
                long j = this.f24367j;
                this.f24367j = 1 + j;
                m15033a = new C7263js(j, m14899a, this.f24366i.mo14618a(), true, false);
            } else if (!f24358a && m15023a.f24356d) {
                throw new AssertionError("This should have been handled above!");
            } else {
                m15033a = m15023a.m15033a();
            }
            m15019b(m15033a);
        }
    }

    /* renamed from: c */
    public void m15015c(C7296kg c7296kg) {
        m15022a(c7296kg, true);
    }

    /* renamed from: d */
    public void m15013d(C7296kg c7296kg) {
        m15022a(c7296kg, false);
    }

    /* renamed from: d */
    public boolean m15014d(C7160ij c7160ij) {
        return this.f24363f.m14988b(c7160ij, f24360c) != null;
    }

    /* renamed from: e */
    public void m15011e(C7296kg c7296kg) {
        C7263js m15023a = m15023a(m15007h(c7296kg));
        if (m15023a == null || m15023a.f24356d) {
            return;
        }
        m15019b(m15023a.m15033a());
    }

    /* renamed from: f */
    public boolean m15009f(C7296kg c7296kg) {
        if (m15012e(c7296kg.m14900a())) {
            return true;
        }
        if (c7296kg.m14894e()) {
            return false;
        }
        Map<C7293kf, C7263js> m14981e = this.f24363f.m14981e(c7296kg.m14900a());
        return m14981e != null && m14981e.containsKey(c7296kg.m14897b()) && m14981e.get(c7296kg.m14897b()).f24356d;
    }
}
