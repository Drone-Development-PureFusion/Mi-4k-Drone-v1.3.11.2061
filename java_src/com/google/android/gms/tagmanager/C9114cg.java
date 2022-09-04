package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.AbstractC7030gi;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.C6899en;
import com.google.android.gms.internal.EnumC6958fh;
import com.google.android.gms.tagmanager.C9163dj;
import com.google.android.gms.tagmanager.C9184dr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.p286a.p287a.p299f.p302c.C11125l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.cg */
/* loaded from: classes2.dex */
public class C9114cg {

    /* renamed from: a */
    private static final C9085bn<AbstractC7090hj.C7091a> f28804a = new C9085bn<>(C9147cw.m9110g(), true);

    /* renamed from: b */
    private final C6899en.C6903c f28805b;

    /* renamed from: c */
    private final AbstractC9226q f28806c;

    /* renamed from: d */
    private final Map<String, AbstractC9229t> f28807d;

    /* renamed from: e */
    private final Map<String, AbstractC9229t> f28808e;

    /* renamed from: f */
    private final Map<String, AbstractC9229t> f28809f;

    /* renamed from: g */
    private final AbstractC9162di<C6899en.C6901a, C9085bn<AbstractC7090hj.C7091a>> f28810g;

    /* renamed from: h */
    private final AbstractC9162di<String, C9120b> f28811h;

    /* renamed from: i */
    private final Set<C6899en.C6905e> f28812i;

    /* renamed from: j */
    private final C9196e f28813j;

    /* renamed from: k */
    private final Map<String, C9121c> f28814k;

    /* renamed from: l */
    private volatile String f28815l;

    /* renamed from: m */
    private int f28816m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tagmanager.cg$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9119a {
        /* renamed from: a */
        void mo9201a(C6899en.C6905e c6905e, Set<C6899en.C6901a> set, Set<C6899en.C6901a> set2, AbstractC9103cb abstractC9103cb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.tagmanager.cg$b */
    /* loaded from: classes2.dex */
    public static class C9120b {

        /* renamed from: a */
        private C9085bn<AbstractC7090hj.C7091a> f28825a;

        /* renamed from: b */
        private AbstractC7090hj.C7091a f28826b;

        public C9120b(C9085bn<AbstractC7090hj.C7091a> c9085bn, AbstractC7090hj.C7091a c7091a) {
            this.f28825a = c9085bn;
            this.f28826b = c7091a;
        }

        /* renamed from: a */
        public C9085bn<AbstractC7090hj.C7091a> m9200a() {
            return this.f28825a;
        }

        /* renamed from: b */
        public AbstractC7090hj.C7091a m9199b() {
            return this.f28826b;
        }

        /* renamed from: c */
        public int m9198c() {
            return (this.f28826b == null ? 0 : this.f28826b.f()) + this.f28825a.m9288a().f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.tagmanager.cg$c */
    /* loaded from: classes2.dex */
    public static class C9121c {

        /* renamed from: f */
        private C6899en.C6901a f28832f;

        /* renamed from: a */
        private final Set<C6899en.C6905e> f28827a = new HashSet();

        /* renamed from: b */
        private final Map<C6899en.C6905e, List<C6899en.C6901a>> f28828b = new HashMap();

        /* renamed from: d */
        private final Map<C6899en.C6905e, List<String>> f28830d = new HashMap();

        /* renamed from: c */
        private final Map<C6899en.C6905e, List<C6899en.C6901a>> f28829c = new HashMap();

        /* renamed from: e */
        private final Map<C6899en.C6905e, List<String>> f28831e = new HashMap();

        /* renamed from: a */
        public Set<C6899en.C6905e> m9197a() {
            return this.f28827a;
        }

        /* renamed from: a */
        public void m9196a(C6899en.C6901a c6901a) {
            this.f28832f = c6901a;
        }

        /* renamed from: a */
        public void m9195a(C6899en.C6905e c6905e) {
            this.f28827a.add(c6905e);
        }

        /* renamed from: a */
        public void m9194a(C6899en.C6905e c6905e, C6899en.C6901a c6901a) {
            List<C6899en.C6901a> list = this.f28828b.get(c6905e);
            if (list == null) {
                list = new ArrayList<>();
                this.f28828b.put(c6905e, list);
            }
            list.add(c6901a);
        }

        /* renamed from: a */
        public void m9193a(C6899en.C6905e c6905e, String str) {
            List<String> list = this.f28830d.get(c6905e);
            if (list == null) {
                list = new ArrayList<>();
                this.f28830d.put(c6905e, list);
            }
            list.add(str);
        }

        /* renamed from: b */
        public Map<C6899en.C6905e, List<C6899en.C6901a>> m9192b() {
            return this.f28828b;
        }

        /* renamed from: b */
        public void m9191b(C6899en.C6905e c6905e, C6899en.C6901a c6901a) {
            List<C6899en.C6901a> list = this.f28829c.get(c6905e);
            if (list == null) {
                list = new ArrayList<>();
                this.f28829c.put(c6905e, list);
            }
            list.add(c6901a);
        }

        /* renamed from: b */
        public void m9190b(C6899en.C6905e c6905e, String str) {
            List<String> list = this.f28831e.get(c6905e);
            if (list == null) {
                list = new ArrayList<>();
                this.f28831e.put(c6905e, list);
            }
            list.add(str);
        }

        /* renamed from: c */
        public Map<C6899en.C6905e, List<String>> m9189c() {
            return this.f28830d;
        }

        /* renamed from: d */
        public Map<C6899en.C6905e, List<String>> m9188d() {
            return this.f28831e;
        }

        /* renamed from: e */
        public Map<C6899en.C6905e, List<C6899en.C6901a>> m9187e() {
            return this.f28829c;
        }

        /* renamed from: f */
        public C6899en.C6901a m9186f() {
            return this.f28832f;
        }
    }

    public C9114cg(Context context, C6899en.C6903c c6903c, C9196e c9196e, C9184dr.AbstractC9185a abstractC9185a, C9184dr.AbstractC9185a abstractC9185a2, AbstractC9226q abstractC9226q) {
        if (c6903c == null) {
            throw new NullPointerException("resource cannot be null");
        }
        this.f28805b = c6903c;
        this.f28812i = new HashSet(c6903c.m15997b());
        this.f28813j = c9196e;
        this.f28806c = abstractC9226q;
        this.f28810g = new C9163dj().m9070a(1048576, new C9163dj.AbstractC9165a<C6899en.C6901a, C9085bn<AbstractC7090hj.C7091a>>() { // from class: com.google.android.gms.tagmanager.cg.1
            @Override // com.google.android.gms.tagmanager.C9163dj.AbstractC9165a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public int mo9069a(C6899en.C6901a c6901a, C9085bn<AbstractC7090hj.C7091a> c9085bn) {
                return c9085bn.m9288a().f();
            }
        });
        this.f28811h = new C9163dj().m9070a(1048576, new C9163dj.AbstractC9165a<String, C9120b>() { // from class: com.google.android.gms.tagmanager.cg.2
            @Override // com.google.android.gms.tagmanager.C9163dj.AbstractC9165a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public int mo9069a(String str, C9120b c9120b) {
                return str.length() + c9120b.m9198c();
            }
        });
        this.f28807d = new HashMap();
        m9207b(new C9158dg(context));
        m9207b(new C9184dr(abstractC9185a2));
        m9207b(new C9194dv(c9196e));
        m9207b(new C9148cx(context, c9196e));
        this.f28808e = new HashMap();
        m9205c(new C9182dp());
        m9205c(new C9223n());
        m9205c(new C9224o());
        m9205c(new C9231v());
        m9205c(new C9232w());
        m9205c(new C9060as());
        m9205c(new C9061at());
        m9205c(new C9097bw());
        m9205c(new C9140cq());
        this.f28809f = new HashMap();
        m9219a(new C9038ah(context));
        m9219a(new C9079bi(context));
        m9219a(new C9153db(context));
        m9219a(new C9154dc(context));
        m9219a(new C9155dd(context));
        m9219a(new C9156de(context));
        m9219a(new C9157df(context));
        m9219a(new C9166dk());
        m9219a(new C9181do(this.f28805b.m15996c()));
        m9219a(new C9184dr(abstractC9185a));
        m9219a(new C9187dt(c9196e));
        m9219a(new C9214i(context));
        m9219a(new C9215j());
        m9219a(new C9222m());
        m9219a(new C9227r(this));
        m9219a(new C9233x());
        m9219a(new C9234y());
        m9219a(new C9051am(context));
        m9219a(new C9053ao());
        m9219a(new C9059ar());
        m9219a(new C9067ay());
        m9219a(new C9071ba(context));
        m9219a(new C9086bo());
        m9219a(new C9090bq());
        m9219a(new C9094bt());
        m9219a(new C9096bv());
        m9219a(new C9098bx(context));
        m9219a(new C9122ch());
        m9219a(new C9123ci());
        m9219a(new C9142cs());
        m9219a(new C9149cy());
        this.f28814k = new HashMap();
        for (C6899en.C6905e c6905e : this.f28812i) {
            if (abstractC9226q.mo8886a()) {
                m9214a(c6905e.m15984f(), c6905e.m15983g(), "add macro");
                m9214a(c6905e.m15979k(), c6905e.m15982h(), "remove macro");
                m9214a(c6905e.m15986d(), c6905e.m15981i(), "add tag");
                m9214a(c6905e.m15985e(), c6905e.m15980j(), "remove tag");
            }
            for (int i = 0; i < c6905e.m15984f().size(); i++) {
                C6899en.C6901a c6901a = c6905e.m15984f().get(i);
                String str = "Unknown";
                if (abstractC9226q.mo8886a() && i < c6905e.m15983g().size()) {
                    str = c6905e.m15983g().get(i);
                }
                C9121c m9211a = m9211a(this.f28814k, m9224a(c6901a));
                m9211a.m9195a(c6905e);
                m9211a.m9194a(c6905e, c6901a);
                m9211a.m9193a(c6905e, str);
            }
            for (int i2 = 0; i2 < c6905e.m15979k().size(); i2++) {
                C6899en.C6901a c6901a2 = c6905e.m15979k().get(i2);
                String str2 = "Unknown";
                if (abstractC9226q.mo8886a() && i2 < c6905e.m15982h().size()) {
                    str2 = c6905e.m15982h().get(i2);
                }
                C9121c m9211a2 = m9211a(this.f28814k, m9224a(c6901a2));
                m9211a2.m9195a(c6905e);
                m9211a2.m9191b(c6905e, c6901a2);
                m9211a2.m9190b(c6905e, str2);
            }
        }
        for (Map.Entry<String, List<C6899en.C6901a>> entry : this.f28805b.m15995d().entrySet()) {
            for (C6899en.C6901a c6901a3 : entry.getValue()) {
                if (!C9147cw.m9116e(c6901a3.m16003b().get(EnumC6958fh.NOT_DEFAULT_MACRO.toString())).booleanValue()) {
                    m9211a(this.f28814k, entry.getKey()).m9196a(c6901a3);
                }
            }
        }
    }

    /* renamed from: a */
    private C9085bn<AbstractC7090hj.C7091a> m9220a(AbstractC7090hj.C7091a c7091a, Set<String> set, AbstractC9150cz abstractC9150cz) {
        if (!c7091a.f23892l) {
            return new C9085bn<>(c7091a, true);
        }
        switch (c7091a.f23881a) {
            case 2:
                AbstractC7090hj.C7091a m16010a = C6899en.m16010a(c7091a);
                m16010a.f23883c = new AbstractC7090hj.C7091a[c7091a.f23883c.length];
                for (int i = 0; i < c7091a.f23883c.length; i++) {
                    C9085bn<AbstractC7090hj.C7091a> m9220a = m9220a(c7091a.f23883c[i], set, abstractC9150cz.mo9089a(i));
                    if (m9220a == f28804a) {
                        return f28804a;
                    }
                    m16010a.f23883c[i] = m9220a.m9288a();
                }
                return new C9085bn<>(m16010a, false);
            case 3:
                AbstractC7090hj.C7091a m16010a2 = C6899en.m16010a(c7091a);
                if (c7091a.f23884d.length != c7091a.f23885e.length) {
                    String valueOf = String.valueOf(c7091a.toString());
                    C9065aw.m9301a(valueOf.length() != 0 ? "Invalid serving value: ".concat(valueOf) : new String("Invalid serving value: "));
                    return f28804a;
                }
                m16010a2.f23884d = new AbstractC7090hj.C7091a[c7091a.f23884d.length];
                m16010a2.f23885e = new AbstractC7090hj.C7091a[c7091a.f23884d.length];
                for (int i2 = 0; i2 < c7091a.f23884d.length; i2++) {
                    C9085bn<AbstractC7090hj.C7091a> m9220a2 = m9220a(c7091a.f23884d[i2], set, abstractC9150cz.mo9088b(i2));
                    C9085bn<AbstractC7090hj.C7091a> m9220a3 = m9220a(c7091a.f23885e[i2], set, abstractC9150cz.mo9087c(i2));
                    if (m9220a2 == f28804a || m9220a3 == f28804a) {
                        return f28804a;
                    }
                    m16010a2.f23884d[i2] = m9220a2.m9288a();
                    m16010a2.f23885e[i2] = m9220a3.m9288a();
                }
                return new C9085bn<>(m16010a2, false);
            case 4:
                if (set.contains(c7091a.f23886f)) {
                    String valueOf2 = String.valueOf(c7091a.f23886f);
                    String valueOf3 = String.valueOf(set.toString());
                    C9065aw.m9301a(new StringBuilder(String.valueOf(valueOf2).length() + 79 + String.valueOf(valueOf3).length()).append("Macro cycle detected.  Current macro reference: ").append(valueOf2).append(".  Previous macro references: ").append(valueOf3).append(".").toString());
                    return f28804a;
                }
                set.add(c7091a.f23886f);
                C9085bn<AbstractC7090hj.C7091a> m9081a = C9152da.m9081a(m9217a(c7091a.f23886f, set, abstractC9150cz.mo9090a()), c7091a.f23891k);
                set.remove(c7091a.f23886f);
                return m9081a;
            case 5:
            case 6:
            default:
                C9065aw.m9301a(new StringBuilder(25).append("Unknown type: ").append(c7091a.f23881a).toString());
                return f28804a;
            case 7:
                AbstractC7090hj.C7091a m16010a3 = C6899en.m16010a(c7091a);
                m16010a3.f23890j = new AbstractC7090hj.C7091a[c7091a.f23890j.length];
                for (int i3 = 0; i3 < c7091a.f23890j.length; i3++) {
                    C9085bn<AbstractC7090hj.C7091a> m9220a4 = m9220a(c7091a.f23890j[i3], set, abstractC9150cz.mo9086d(i3));
                    if (m9220a4 == f28804a) {
                        return f28804a;
                    }
                    m16010a3.f23890j[i3] = m9220a4.m9288a();
                }
                return new C9085bn<>(m16010a3, false);
        }
    }

    /* renamed from: a */
    private C9085bn<AbstractC7090hj.C7091a> m9217a(String str, Set<String> set, AbstractC9068az abstractC9068az) {
        C6899en.C6901a next;
        this.f28816m++;
        C9120b mo9073a = this.f28811h.mo9073a(str);
        if (mo9073a != null && !this.f28806c.mo8886a()) {
            m9221a(mo9073a.m9199b(), set);
            this.f28816m--;
            return mo9073a.m9200a();
        }
        C9121c c9121c = this.f28814k.get(str);
        if (c9121c == null) {
            String valueOf = String.valueOf(m9208b());
            C9065aw.m9301a(new StringBuilder(String.valueOf(valueOf).length() + 15 + String.valueOf(str).length()).append(valueOf).append("Invalid macro: ").append(str).toString());
            this.f28816m--;
            return f28804a;
        }
        C9085bn<Set<C6899en.C6901a>> m9216a = m9216a(str, c9121c.m9197a(), c9121c.m9192b(), c9121c.m9189c(), c9121c.m9187e(), c9121c.m9188d(), set, abstractC9068az.mo9289b());
        if (m9216a.m9288a().isEmpty()) {
            next = c9121c.m9186f();
        } else {
            if (m9216a.m9288a().size() > 1) {
                String valueOf2 = String.valueOf(m9208b());
                C9065aw.m9299b(new StringBuilder(String.valueOf(valueOf2).length() + 37 + String.valueOf(str).length()).append(valueOf2).append("Multiple macros active for macroName ").append(str).toString());
            }
            next = m9216a.m9288a().iterator().next();
        }
        if (next == null) {
            this.f28816m--;
            return f28804a;
        }
        C9085bn<AbstractC7090hj.C7091a> m9213a = m9213a(this.f28809f, next, set, abstractC9068az.mo9290a());
        C9085bn<AbstractC7090hj.C7091a> c9085bn = m9213a == f28804a ? f28804a : new C9085bn<>(m9213a.m9288a(), m9216a.m9287b() && m9213a.m9287b());
        AbstractC7090hj.C7091a m16002c = next.m16002c();
        if (c9085bn.m9287b()) {
            this.f28811h.mo9072a(str, new C9120b(c9085bn, m16002c));
        }
        m9221a(m16002c, set);
        this.f28816m--;
        return c9085bn;
    }

    /* renamed from: a */
    private C9085bn<AbstractC7090hj.C7091a> m9213a(Map<String, AbstractC9229t> map, C6899en.C6901a c6901a, Set<String> set, AbstractC9099by abstractC9099by) {
        boolean z;
        boolean z2 = true;
        AbstractC7090hj.C7091a c7091a = c6901a.m16003b().get(EnumC6958fh.FUNCTION.toString());
        if (c7091a == null) {
            C9065aw.m9301a("No function id in properties");
            return f28804a;
        }
        String str = c7091a.f23887g;
        AbstractC9229t abstractC9229t = map.get(str);
        if (abstractC9229t == null) {
            C9065aw.m9301a(String.valueOf(str).concat(" has no backing implementation."));
            return f28804a;
        }
        C9085bn<AbstractC7090hj.C7091a> mo9073a = this.f28810g.mo9073a(c6901a);
        if (mo9073a != null && !this.f28806c.mo8886a()) {
            return mo9073a;
        }
        HashMap hashMap = new HashMap();
        boolean z3 = true;
        for (Map.Entry<String, AbstractC7090hj.C7091a> entry : c6901a.m16003b().entrySet()) {
            C9085bn<AbstractC7090hj.C7091a> m9220a = m9220a(entry.getValue(), set, abstractC9099by.mo9256a(entry.getKey()).mo9253a(entry.getValue()));
            if (m9220a == f28804a) {
                return f28804a;
            }
            if (m9220a.m9287b()) {
                c6901a.m16004a(entry.getKey(), m9220a.m9288a());
                z = z3;
            } else {
                z = false;
            }
            hashMap.put(entry.getKey(), m9220a.m9288a());
            z3 = z;
        }
        if (!abstractC9229t.m8878a(hashMap.keySet())) {
            String valueOf = String.valueOf(abstractC9229t.mo8876c());
            String valueOf2 = String.valueOf(hashMap.keySet());
            C9065aw.m9301a(new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length()).append("Incorrect keys for function ").append(str).append(" required ").append(valueOf).append(" had ").append(valueOf2).toString());
            return f28804a;
        }
        if (!z3 || !abstractC9229t.mo8872a()) {
            z2 = false;
        }
        C9085bn<AbstractC7090hj.C7091a> c9085bn = new C9085bn<>(abstractC9229t.mo8870a(hashMap), z2);
        if (z2) {
            this.f28810g.mo9072a(c6901a, c9085bn);
        }
        abstractC9099by.mo9257a(c9085bn.m9288a());
        return c9085bn;
    }

    /* renamed from: a */
    private C9085bn<Set<C6899en.C6901a>> m9209a(Set<C6899en.C6905e> set, Set<String> set2, AbstractC9119a abstractC9119a, AbstractC9113cf abstractC9113cf) {
        Set<C6899en.C6901a> hashSet = new HashSet<>();
        Set<C6899en.C6901a> hashSet2 = new HashSet<>();
        boolean z = true;
        for (C6899en.C6905e c6905e : set) {
            AbstractC9103cb mo9227a = abstractC9113cf.mo9227a();
            C9085bn<Boolean> m9222a = m9222a(c6905e, set2, mo9227a);
            if (m9222a.m9288a().booleanValue()) {
                abstractC9119a.mo9201a(c6905e, hashSet, hashSet2, mo9227a);
            }
            z = z && m9222a.m9287b();
        }
        hashSet.removeAll(hashSet2);
        abstractC9113cf.mo9226a(hashSet);
        return new C9085bn<>(hashSet, z);
    }

    /* renamed from: a */
    private static C9121c m9211a(Map<String, C9121c> map, String str) {
        C9121c c9121c = map.get(str);
        if (c9121c == null) {
            C9121c c9121c2 = new C9121c();
            map.put(str, c9121c2);
            return c9121c2;
        }
        return c9121c;
    }

    /* renamed from: a */
    private static String m9224a(C6899en.C6901a c6901a) {
        return C9147cw.m9132a(c6901a.m16003b().get(EnumC6958fh.INSTANCE_NAME.toString()));
    }

    /* renamed from: a */
    private void m9221a(AbstractC7090hj.C7091a c7091a, Set<String> set) {
        C9085bn<AbstractC7090hj.C7091a> m9220a;
        if (c7091a == null || (m9220a = m9220a(c7091a, set, new C9083bl())) == f28804a) {
            return;
        }
        Object m9112f = C9147cw.m9112f(m9220a.m9288a());
        if (m9112f instanceof Map) {
            this.f28813j.m8964a((Map) m9112f);
        } else if (!(m9112f instanceof List)) {
            C9065aw.m9299b("pushAfterEvaluate: value not a Map or List");
        } else {
            for (Object obj : (List) m9112f) {
                if (obj instanceof Map) {
                    this.f28813j.m8964a((Map) obj);
                } else {
                    C9065aw.m9299b("pushAfterEvaluate: value not a Map");
                }
            }
        }
    }

    /* renamed from: a */
    private static void m9214a(List<C6899en.C6901a> list, List<String> list2, String str) {
        if (list.size() != list2.size()) {
            C9065aw.m9297c(new StringBuilder(String.valueOf(str).length() + 102).append("Invalid resource: imbalance of rule names of functions for ").append(str).append(" operation. Using default rule name instead").toString());
        }
    }

    /* renamed from: a */
    private static void m9212a(Map<String, AbstractC9229t> map, AbstractC9229t abstractC9229t) {
        if (map.containsKey(abstractC9229t.mo8877b())) {
            String valueOf = String.valueOf(abstractC9229t.mo8877b());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Duplicate function type name: ".concat(valueOf) : new String("Duplicate function type name: "));
        } else {
            map.put(abstractC9229t.mo8877b(), abstractC9229t);
        }
    }

    /* renamed from: b */
    private String m9208b() {
        if (this.f28816m <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.f28816m));
        for (int i = 2; i < this.f28816m; i++) {
            sb.append(C11125l.f35805c);
        }
        sb.append(": ");
        return sb.toString();
    }

    /* renamed from: a */
    C9085bn<Boolean> m9223a(C6899en.C6901a c6901a, Set<String> set, AbstractC9099by abstractC9099by) {
        C9085bn<AbstractC7090hj.C7091a> m9213a = m9213a(this.f28808e, c6901a, set, abstractC9099by);
        Boolean m9116e = C9147cw.m9116e(m9213a.m9288a());
        abstractC9099by.mo9257a(C9147cw.m9111f(m9116e));
        return new C9085bn<>(m9116e, m9213a.m9287b());
    }

    /* renamed from: a */
    C9085bn<Boolean> m9222a(C6899en.C6905e c6905e, Set<String> set, AbstractC9103cb abstractC9103cb) {
        boolean z = true;
        for (C6899en.C6901a c6901a : c6905e.m15987c()) {
            C9085bn<Boolean> m9223a = m9223a(c6901a, set, abstractC9103cb.mo9252a());
            if (m9223a.m9288a().booleanValue()) {
                abstractC9103cb.mo9251a(C9147cw.m9111f((Object) false));
                return new C9085bn<>(false, m9223a.m9287b());
            }
            z = z && m9223a.m9287b();
        }
        for (C6899en.C6901a c6901a2 : c6905e.m15988b()) {
            C9085bn<Boolean> m9223a2 = m9223a(c6901a2, set, abstractC9103cb.mo9250b());
            if (!m9223a2.m9288a().booleanValue()) {
                abstractC9103cb.mo9251a(C9147cw.m9111f((Object) false));
                return new C9085bn<>(false, m9223a2.m9287b());
            }
            z = z && m9223a2.m9287b();
        }
        abstractC9103cb.mo9251a(C9147cw.m9111f((Object) true));
        return new C9085bn<>(true, z);
    }

    /* renamed from: a */
    C9085bn<Set<C6899en.C6901a>> m9216a(String str, Set<C6899en.C6905e> set, final Map<C6899en.C6905e, List<C6899en.C6901a>> map, final Map<C6899en.C6905e, List<String>> map2, final Map<C6899en.C6905e, List<C6899en.C6901a>> map3, final Map<C6899en.C6905e, List<String>> map4, Set<String> set2, AbstractC9113cf abstractC9113cf) {
        return m9209a(set, set2, new AbstractC9119a() { // from class: com.google.android.gms.tagmanager.cg.3
            @Override // com.google.android.gms.tagmanager.C9114cg.AbstractC9119a
            /* renamed from: a */
            public void mo9201a(C6899en.C6905e c6905e, Set<C6899en.C6901a> set3, Set<C6899en.C6901a> set4, AbstractC9103cb abstractC9103cb) {
                List<C6899en.C6901a> list = (List) map.get(c6905e);
                List<String> list2 = (List) map2.get(c6905e);
                if (list != null) {
                    set3.addAll(list);
                    abstractC9103cb.mo9249c().mo9255a(list, list2);
                }
                List<C6899en.C6901a> list3 = (List) map3.get(c6905e);
                List<String> list4 = (List) map4.get(c6905e);
                if (list3 != null) {
                    set4.addAll(list3);
                    abstractC9103cb.mo9248d().mo9255a(list3, list4);
                }
            }
        }, abstractC9113cf);
    }

    /* renamed from: a */
    C9085bn<Set<C6899en.C6901a>> m9210a(Set<C6899en.C6905e> set, AbstractC9113cf abstractC9113cf) {
        return m9209a(set, new HashSet(), new AbstractC9119a() { // from class: com.google.android.gms.tagmanager.cg.4
            @Override // com.google.android.gms.tagmanager.C9114cg.AbstractC9119a
            /* renamed from: a */
            public void mo9201a(C6899en.C6905e c6905e, Set<C6899en.C6901a> set2, Set<C6899en.C6901a> set3, AbstractC9103cb abstractC9103cb) {
                set2.addAll(c6905e.m15986d());
                set3.addAll(c6905e.m15985e());
                abstractC9103cb.mo9247e().mo9255a(c6905e.m15986d(), c6905e.m15981i());
                abstractC9103cb.mo9246f().mo9255a(c6905e.m15985e(), c6905e.m15980j());
            }
        }, abstractC9113cf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m9225a() {
        return this.f28815l;
    }

    /* renamed from: a */
    void m9219a(AbstractC9229t abstractC9229t) {
        m9212a(this.f28809f, abstractC9229t);
    }

    /* renamed from: a */
    public synchronized void m9218a(String str) {
        m9204c(str);
        AbstractC9225p mo8884b = this.f28806c.mo8884b(str);
        AbstractC9186ds mo8888b = mo8884b.mo8888b();
        for (C6899en.C6901a c6901a : m9210a(this.f28812i, mo8888b.mo9007b()).m9288a()) {
            m9213a(this.f28807d, c6901a, new HashSet(), mo8888b.mo9008a());
        }
        mo8884b.mo8887c();
        m9204c((String) null);
    }

    /* renamed from: a */
    public synchronized void m9215a(List<AbstractC7030gi.C7039i> list) {
        for (AbstractC7030gi.C7039i c7039i : list) {
            if (c7039i.f23779a == null || !c7039i.f23779a.startsWith("gaExperiment:")) {
                String valueOf = String.valueOf(c7039i);
                C9065aw.m9295e(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Ignored supplemental: ").append(valueOf).toString());
            } else {
                C9228s.m8881a(this.f28813j, c7039i);
            }
        }
    }

    /* renamed from: b */
    public C9085bn<AbstractC7090hj.C7091a> m9206b(String str) {
        this.f28816m = 0;
        AbstractC9225p mo8885a = this.f28806c.mo8885a(str);
        C9085bn<AbstractC7090hj.C7091a> m9217a = m9217a(str, new HashSet(), mo8885a.mo8889a());
        mo8885a.mo8887c();
        return m9217a;
    }

    /* renamed from: b */
    void m9207b(AbstractC9229t abstractC9229t) {
        m9212a(this.f28807d, abstractC9229t);
    }

    /* renamed from: c */
    void m9205c(AbstractC9229t abstractC9229t) {
        m9212a(this.f28808e, abstractC9229t);
    }

    /* renamed from: c */
    synchronized void m9204c(String str) {
        this.f28815l = str;
    }
}
