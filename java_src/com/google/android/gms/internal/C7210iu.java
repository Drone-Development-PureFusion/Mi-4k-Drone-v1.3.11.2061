package com.google.android.gms.internal;

import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.internal.AbstractC7078he;
import com.google.android.gms.internal.AbstractC7287kc;
import com.google.android.gms.internal.C7271ju;
import com.google.firebase.database.C9831c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* renamed from: com.google.android.gms.internal.iu */
/* loaded from: classes2.dex */
public class C7210iu {

    /* renamed from: a */
    static final /* synthetic */ boolean f24220a;

    /* renamed from: g */
    private final AbstractC7228d f24226g;

    /* renamed from: h */
    private final AbstractC7257jp f24227h;

    /* renamed from: i */
    private final C7315ks f24228i;

    /* renamed from: j */
    private long f24229j = 1;

    /* renamed from: b */
    private C7271ju<C7209it> f24221b = C7271ju.m15000a();

    /* renamed from: c */
    private final C7238jb f24222c = new C7238jb();

    /* renamed from: d */
    private final Map<C7229iv, C7296kg> f24223d = new HashMap();

    /* renamed from: e */
    private final Map<C7296kg, C7229iv> f24224e = new HashMap();

    /* renamed from: f */
    private final Set<C7296kg> f24225f = new HashSet();

    /* renamed from: com.google.android.gms.internal.iu$a */
    /* loaded from: classes2.dex */
    public interface AbstractC7225a {
        /* renamed from: a */
        List<? extends AbstractC7287kc> mo15164a(C9831c c9831c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.iu$b */
    /* loaded from: classes2.dex */
    public static class C7226b extends AbstractC7151ie {

        /* renamed from: b */
        private C7296kg f24281b;

        public C7226b(C7296kg c7296kg) {
            this.f24281b = c7296kg;
        }

        @Override // com.google.android.gms.internal.AbstractC7151ie
        /* renamed from: a */
        public AbstractC7151ie mo15135a(C7296kg c7296kg) {
            return new C7226b(c7296kg);
        }

        @Override // com.google.android.gms.internal.AbstractC7151ie
        /* renamed from: a */
        public C7286kb mo15138a(C7285ka c7285ka, C7296kg c7296kg) {
            return null;
        }

        @Override // com.google.android.gms.internal.AbstractC7151ie
        /* renamed from: a */
        public C7296kg mo15140a() {
            return this.f24281b;
        }

        @Override // com.google.android.gms.internal.AbstractC7151ie
        /* renamed from: a */
        public void mo15137a(C7286kb c7286kb) {
        }

        @Override // com.google.android.gms.internal.AbstractC7151ie
        /* renamed from: a */
        public void mo15134a(C9831c c9831c) {
        }

        @Override // com.google.android.gms.internal.AbstractC7151ie
        /* renamed from: a */
        public boolean mo15139a(AbstractC7151ie abstractC7151ie) {
            return abstractC7151ie instanceof C7226b;
        }

        @Override // com.google.android.gms.internal.AbstractC7151ie
        /* renamed from: a */
        public boolean mo15136a(AbstractC7287kc.EnumC7288a enumC7288a) {
            return false;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C7226b) && ((C7226b) obj).f24281b.equals(this.f24281b);
        }

        public int hashCode() {
            return this.f24281b.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.iu$c */
    /* loaded from: classes2.dex */
    public class C7227c implements AbstractC7102hq, AbstractC7225a {

        /* renamed from: b */
        private final C7297kh f24283b;

        /* renamed from: c */
        private final C7229iv f24284c;

        public C7227c(C7297kh c7297kh) {
            this.f24283b = c7297kh;
            this.f24284c = C7210iu.this.m15187b(c7297kh.m14893a());
        }

        @Override // com.google.android.gms.internal.AbstractC7102hq
        /* renamed from: a */
        public String mo6835a() {
            return this.f24283b.m14887b().mo14744d();
        }

        @Override // com.google.android.gms.internal.C7210iu.AbstractC7225a
        /* renamed from: a */
        public List<? extends AbstractC7287kc> mo15164a(C9831c c9831c) {
            if (c9831c == null) {
                return this.f24284c != null ? C7210iu.this.m15207a(this.f24284c) : C7210iu.this.m15225a(this.f24283b.m14893a().m14900a());
            }
            C7315ks c7315ks = C7210iu.this.f24228i;
            String valueOf = String.valueOf(this.f24283b.m14893a().m14900a());
            String valueOf2 = String.valueOf(c9831c.toString());
            c7315ks.m14843a(new StringBuilder(String.valueOf(valueOf).length() + 19 + String.valueOf(valueOf2).length()).append("Listen at ").append(valueOf).append(" failed: ").append(valueOf2).toString());
            return C7210iu.this.m15198a(this.f24283b.m14893a(), c9831c);
        }

        @Override // com.google.android.gms.internal.AbstractC7102hq
        /* renamed from: b */
        public boolean mo6834b() {
            return C7387mf.m14620a(this.f24283b.m14887b()) > FimiMediaMeta.AV_CH_SIDE_RIGHT;
        }

        @Override // com.google.android.gms.internal.AbstractC7102hq
        /* renamed from: c */
        public C7092hk mo6833c() {
            C7327kx m14807a = C7327kx.m14807a(this.f24283b.m14887b());
            List<C7160ij> m14808a = m14807a.m14808a();
            ArrayList arrayList = new ArrayList(m14808a.size());
            for (C7160ij c7160ij : m14808a) {
                arrayList.add(c7160ij.m15365c());
            }
            return new C7092hk(arrayList, m14807a.m14804b());
        }
    }

    /* renamed from: com.google.android.gms.internal.iu$d */
    /* loaded from: classes2.dex */
    public interface AbstractC7228d {
        /* renamed from: a */
        void mo15163a(C7296kg c7296kg, C7229iv c7229iv);

        /* renamed from: a */
        void mo15162a(C7296kg c7296kg, C7229iv c7229iv, AbstractC7102hq abstractC7102hq, AbstractC7225a abstractC7225a);
    }

    static {
        f24220a = !C7210iu.class.desiredAssertionStatus();
    }

    public C7210iu(C7146ic c7146ic, AbstractC7257jp abstractC7257jp, AbstractC7228d abstractC7228d) {
        this.f24226g = abstractC7228d;
        this.f24227h = abstractC7257jp;
        this.f24228i = c7146ic.m15413a("SyncTree");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C7296kg m15202a(C7296kg c7296kg) {
        return (!c7296kg.m14894e() || c7296kg.m14895d()) ? c7296kg : C7296kg.m14899a(c7296kg.m14900a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public List<AbstractC7287kc> m15206a(AbstractC7246jh abstractC7246jh) {
        return m15205a(abstractC7246jh, this.f24221b, (AbstractC7344lh) null, this.f24222c.m15131a(C7160ij.m15371a()));
    }

    /* renamed from: a */
    private List<AbstractC7287kc> m15205a(AbstractC7246jh abstractC7246jh, C7271ju<C7209it> c7271ju, AbstractC7344lh abstractC7344lh, C7241jc c7241jc) {
        if (abstractC7246jh.m15099c().m15356h()) {
            return m15188b(abstractC7246jh, c7271ju, abstractC7344lh, c7241jc);
        }
        C7209it m14990b = c7271ju.m14990b();
        if (abstractC7344lh == null && m14990b != null) {
            abstractC7344lh = m14990b.m15237a(C7160ij.m15371a());
        }
        ArrayList arrayList = new ArrayList();
        C7319kv m15363d = abstractC7246jh.m15099c().m15363d();
        AbstractC7246jh mo15090a = abstractC7246jh.mo15090a(m15363d);
        C7271ju<C7209it> mo15617b = c7271ju.m14987c().mo15617b(m15363d);
        if (mo15617b != null && mo15090a != null) {
            arrayList.addAll(m15205a(mo15090a, mo15617b, abstractC7344lh != null ? abstractC7344lh.mo14738c(m15363d) : null, c7241jc.m15114a(m15363d)));
        }
        if (m14990b != null) {
            arrayList.addAll(m14990b.m15236a(abstractC7246jh, c7241jc, abstractC7344lh));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public List<C7297kh> m15204a(C7271ju<C7209it> c7271ju) {
        ArrayList arrayList = new ArrayList();
        m15203a(c7271ju, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private List<AbstractC7287kc> m15201a(final C7296kg c7296kg, final AbstractC7151ie abstractC7151ie, final C9831c c9831c) {
        return (List) this.f24227h.mo15071a(new Callable<List<AbstractC7287kc>>() { // from class: com.google.android.gms.internal.iu.9

            /* renamed from: a */
            static final /* synthetic */ boolean f24276a;

            static {
                f24276a = !C7210iu.class.desiredAssertionStatus();
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<AbstractC7287kc> call() {
                boolean z;
                C7160ij m14900a = c7296kg.m14900a();
                C7209it c7209it = (C7209it) C7210iu.this.f24221b.m14981e(m14900a);
                List<AbstractC7287kc> arrayList = new ArrayList<>();
                if (c7209it != null && (c7296kg.m14895d() || c7209it.m15231b(c7296kg))) {
                    C7389mh<List<C7296kg>, List<AbstractC7287kc>> m15234a = c7209it.m15234a(c7296kg, abstractC7151ie, c9831c);
                    if (c7209it.m15239a()) {
                        C7210iu.this.f24221b = C7210iu.this.f24221b.m14983d(m14900a);
                    }
                    List<C7296kg> m14616a = m15234a.m14616a();
                    arrayList = m15234a.m14615b();
                    boolean z2 = false;
                    for (C7296kg c7296kg2 : m14616a) {
                        C7210iu.this.f24227h.mo15067c(c7296kg);
                        z2 = z2 || c7296kg2.m14894e();
                    }
                    C7271ju c7271ju = C7210iu.this.f24221b;
                    boolean z3 = c7271ju.m14990b() != null && ((C7209it) c7271ju.m14990b()).m15230c();
                    Iterator<C7319kv> it2 = m14900a.iterator();
                    C7271ju c7271ju2 = c7271ju;
                    while (true) {
                        z = z3;
                        if (!it2.hasNext()) {
                            break;
                        }
                        c7271ju2 = c7271ju2.m14992a(it2.next());
                        z3 = z || (c7271ju2.m14990b() != null && ((C7209it) c7271ju2.m14990b()).m15230c());
                        if (z3) {
                            z = z3;
                            break;
                        } else if (c7271ju2.m14984d()) {
                            z = z3;
                            break;
                        }
                    }
                    if (z2 && !z) {
                        C7271ju m14986c = C7210iu.this.f24221b.m14986c(m14900a);
                        if (!m14986c.m14984d()) {
                            for (C7297kh c7297kh : C7210iu.this.m15204a(m14986c)) {
                                C7227c c7227c = new C7227c(c7297kh);
                                C7210iu.this.f24226g.mo15162a(C7210iu.this.m15202a(c7297kh.m14893a()), c7227c.f24284c, c7227c, c7227c);
                            }
                        }
                    }
                    if (!z && !m14616a.isEmpty() && c9831c == null) {
                        if (z2) {
                            C7210iu.this.f24226g.mo15163a(C7210iu.this.m15202a(c7296kg), null);
                        } else {
                            for (C7296kg c7296kg3 : m14616a) {
                                C7229iv m15187b = C7210iu.this.m15187b(c7296kg3);
                                if (!f24276a && m15187b == null) {
                                    throw new AssertionError();
                                }
                                C7210iu.this.f24226g.mo15163a(C7210iu.this.m15202a(c7296kg3), m15187b);
                            }
                        }
                    }
                    C7210iu.this.m15196a(m14616a);
                }
                return arrayList;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public List<? extends AbstractC7287kc> m15200a(C7296kg c7296kg, AbstractC7246jh abstractC7246jh) {
        C7160ij m14900a = c7296kg.m14900a();
        C7209it m14981e = this.f24221b.m14981e(m14900a);
        if (f24220a || m14981e != null) {
            return m14981e.m15236a(abstractC7246jh, this.f24222c.m15131a(m14900a), (AbstractC7344lh) null);
        }
        throw new AssertionError("Missing sync point for query tag that we're tracking");
    }

    /* renamed from: a */
    private void m15203a(C7271ju<C7209it> c7271ju, List<C7297kh> list) {
        C7209it m14990b = c7271ju.m14990b();
        if (m14990b != null && m14990b.m15230c()) {
            list.add(m14990b.m15229d());
            return;
        }
        if (m14990b != null) {
            list.addAll(m14990b.m15232b());
        }
        Iterator<Map.Entry<C7319kv, C7271ju<C7209it>>> it2 = c7271ju.m14987c().iterator();
        while (it2.hasNext()) {
            m15203a(it2.next().getValue(), list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m15199a(C7296kg c7296kg, C7297kh c7297kh) {
        C7160ij m14900a = c7296kg.m14900a();
        C7229iv m15187b = m15187b(c7296kg);
        C7227c c7227c = new C7227c(c7297kh);
        this.f24226g.mo15162a(m15202a(c7296kg), m15187b, c7227c, c7227c);
        C7271ju<C7209it> m14986c = this.f24221b.m14986c(m14900a);
        if (m15187b == null) {
            m14986c.m14994a(new C7271ju.AbstractC7274a<C7209it, Void>() { // from class: com.google.android.gms.internal.iu.10
                @Override // com.google.android.gms.internal.C7271ju.AbstractC7274a
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public Void mo14978a(C7160ij c7160ij, C7209it c7209it, Void r8) {
                    if (!c7160ij.m15356h() && c7209it.m15230c()) {
                        C7296kg m14893a = c7209it.m15229d().m14893a();
                        C7210iu.this.f24226g.mo15163a(C7210iu.this.m15202a(m14893a), C7210iu.this.m15187b(m14893a));
                        return null;
                    }
                    for (C7297kh c7297kh2 : c7209it.m15232b()) {
                        C7296kg m14893a2 = c7297kh2.m14893a();
                        C7210iu.this.f24226g.mo15163a(C7210iu.this.m15202a(m14893a2), C7210iu.this.m15187b(m14893a2));
                    }
                    return null;
                }
            });
        } else if (!f24220a && m14986c.m14990b().m15230c()) {
            throw new AssertionError("If we're adding a query, it shouldn't be shadowed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m15196a(List<C7296kg> list) {
        for (C7296kg c7296kg : list) {
            if (!c7296kg.m14894e()) {
                C7229iv m15187b = m15187b(c7296kg);
                if (!f24220a && m15187b == null) {
                    throw new AssertionError();
                }
                this.f24224e.remove(c7296kg);
                this.f24223d.remove(m15187b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public C7229iv m15187b(C7296kg c7296kg) {
        return this.f24224e.get(c7296kg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public C7296kg m15189b(C7229iv c7229iv) {
        return this.f24223d.get(c7229iv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public List<AbstractC7287kc> m15188b(final AbstractC7246jh abstractC7246jh, C7271ju<C7209it> c7271ju, AbstractC7344lh abstractC7344lh, final C7241jc c7241jc) {
        C7209it m14990b = c7271ju.m14990b();
        final AbstractC7344lh m15237a = (abstractC7344lh != null || m14990b == null) ? abstractC7344lh : m14990b.m15237a(C7160ij.m15371a());
        final ArrayList arrayList = new ArrayList();
        c7271ju.m14987c().mo15623a(new AbstractC7078he.AbstractC7080b<C7319kv, C7271ju<C7209it>>() { // from class: com.google.android.gms.internal.iu.11
            @Override // com.google.android.gms.internal.AbstractC7078he.AbstractC7080b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo14811a(C7319kv c7319kv, C7271ju<C7209it> c7271ju2) {
                AbstractC7344lh abstractC7344lh2 = null;
                if (m15237a != null) {
                    abstractC7344lh2 = m15237a.mo14738c(c7319kv);
                }
                C7241jc m15114a = c7241jc.m15114a(c7319kv);
                AbstractC7246jh mo15090a = abstractC7246jh.mo15090a(c7319kv);
                if (mo15090a != null) {
                    arrayList.addAll(C7210iu.this.m15188b(mo15090a, c7271ju2, abstractC7344lh2, m15114a));
                }
            }
        });
        if (m14990b != null) {
            arrayList.addAll(m14990b.m15236a(abstractC7246jh, c7241jc, m15237a));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public C7229iv m15186c() {
        long j = this.f24229j;
        this.f24229j = 1 + j;
        return new C7229iv(j);
    }

    /* renamed from: a */
    public List<? extends AbstractC7287kc> m15227a(final long j, final boolean z, final boolean z2, final AbstractC7381mc abstractC7381mc) {
        return (List) this.f24227h.mo15071a(new Callable<List<? extends AbstractC7287kc>>() { // from class: com.google.android.gms.internal.iu.13
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<? extends AbstractC7287kc> call() {
                C7271ju c7271ju;
                if (z2) {
                    C7210iu.this.f24227h.mo15080a(j);
                }
                C7234iy m15132a = C7210iu.this.f24222c.m15132a(j);
                boolean m15120b = C7210iu.this.f24222c.m15120b(j);
                if (m15132a.m15149f() && !z) {
                    Map<String, Object> m15250a = C7200iq.m15250a(abstractC7381mc);
                    if (m15132a.m15150e()) {
                        C7210iu.this.f24227h.mo15077a(m15132a.m15153b(), C7200iq.m15251a(m15132a.m15152c(), m15250a));
                    } else {
                        C7210iu.this.f24227h.mo15079a(m15132a.m15153b(), C7200iq.m15253a(m15132a.m15151d(), m15250a));
                    }
                }
                if (!m15120b) {
                    return Collections.emptyList();
                }
                C7271ju m15000a = C7271ju.m15000a();
                if (!m15132a.m15150e()) {
                    Iterator<Map.Entry<C7160ij, AbstractC7344lh>> it2 = m15132a.m15151d().iterator();
                    while (true) {
                        c7271ju = m15000a;
                        if (!it2.hasNext()) {
                            break;
                        }
                        m15000a = c7271ju.m14995a(it2.next().getKey(), (C7160ij) true);
                    }
                } else {
                    c7271ju = m15000a.m14995a(C7160ij.m15371a(), (C7160ij) true);
                }
                return C7210iu.this.m15206a(new C7243je(m15132a.m15153b(), c7271ju, z));
            }
        });
    }

    /* renamed from: a */
    public List<? extends AbstractC7287kc> m15226a(final AbstractC7151ie abstractC7151ie) {
        return (List) this.f24227h.mo15071a(new Callable<List<? extends AbstractC7287kc>>() { // from class: com.google.android.gms.internal.iu.8

            /* renamed from: a */
            static final /* synthetic */ boolean f24273a;

            static {
                f24273a = !C7210iu.class.desiredAssertionStatus();
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<? extends AbstractC7287kc> call() {
                AbstractC7344lh abstractC7344lh;
                boolean z;
                C7209it c7209it;
                C7282jy c7282jy;
                AbstractC7344lh m15237a;
                boolean z2;
                AbstractC7344lh abstractC7344lh2;
                C7296kg mo15140a = abstractC7151ie.mo15140a();
                C7160ij m14900a = mo15140a.m14900a();
                AbstractC7344lh abstractC7344lh3 = null;
                C7160ij c7160ij = m14900a;
                C7271ju c7271ju = C7210iu.this.f24221b;
                boolean z3 = false;
                while (!c7271ju.m14984d()) {
                    C7209it c7209it2 = (C7209it) c7271ju.m14990b();
                    if (c7209it2 != null) {
                        if (abstractC7344lh3 == null) {
                            abstractC7344lh3 = c7209it2.m15237a(c7160ij);
                        }
                        z2 = z3 || c7209it2.m15230c();
                        abstractC7344lh2 = abstractC7344lh3;
                    } else {
                        z2 = z3;
                        abstractC7344lh2 = abstractC7344lh3;
                    }
                    c7271ju = c7271ju.m14992a(c7160ij.m15356h() ? C7319kv.m14828a("") : c7160ij.m15363d());
                    c7160ij = c7160ij.m15361e();
                    abstractC7344lh3 = abstractC7344lh2;
                    z3 = z2;
                }
                C7209it c7209it3 = (C7209it) C7210iu.this.f24221b.m14981e(m14900a);
                if (c7209it3 == null) {
                    C7209it c7209it4 = new C7209it(C7210iu.this.f24227h);
                    C7210iu.this.f24221b = C7210iu.this.f24221b.m14995a(m14900a, (C7160ij) c7209it4);
                    abstractC7344lh = abstractC7344lh3;
                    z = z3;
                    c7209it = c7209it4;
                } else {
                    boolean z4 = z3 || c7209it3.m15230c();
                    if (abstractC7344lh3 == null) {
                        abstractC7344lh3 = c7209it3.m15237a(C7160ij.m15371a());
                    }
                    abstractC7344lh = abstractC7344lh3;
                    z = z4;
                    c7209it = c7209it3;
                }
                C7210iu.this.f24227h.mo15068b(mo15140a);
                if (abstractC7344lh != null) {
                    c7282jy = new C7282jy(C7337lc.m14768a(abstractC7344lh, mo15140a.m14896c()), true, false);
                } else {
                    C7282jy mo15075a = C7210iu.this.f24227h.mo15075a(mo15140a);
                    if (mo15075a.m14959a()) {
                        c7282jy = mo15075a;
                    } else {
                        AbstractC7344lh m14778j = C7335la.m14778j();
                        Iterator it2 = C7210iu.this.f24221b.m14986c(m14900a).m14987c().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            C7209it c7209it5 = (C7209it) ((C7271ju) entry.getValue()).m14990b();
                            m14778j = (c7209it5 == null || (m15237a = c7209it5.m15237a(C7160ij.m15371a())) == null) ? m14778j : m14778j.mo14748a((C7319kv) entry.getKey(), m15237a);
                        }
                        for (C7343lg c7343lg : mo15075a.m14955c()) {
                            if (!m14778j.mo14741a(c7343lg.m14752c())) {
                                m14778j = m14778j.mo14748a(c7343lg.m14752c(), c7343lg.m14751d());
                            }
                        }
                        c7282jy = new C7282jy(C7337lc.m14768a(m14778j, mo15140a.m14896c()), false, false);
                    }
                }
                boolean m15231b = c7209it.m15231b(mo15140a);
                if (!m15231b && !mo15140a.m14894e()) {
                    if (!f24273a && C7210iu.this.f24224e.containsKey(mo15140a)) {
                        throw new AssertionError("View does not exist but we have a tag");
                    }
                    C7229iv m15186c = C7210iu.this.m15186c();
                    C7210iu.this.f24224e.put(mo15140a, m15186c);
                    C7210iu.this.f24223d.put(m15186c, mo15140a);
                }
                List<C7286kb> m15238a = c7209it.m15238a(abstractC7151ie, C7210iu.this.f24222c.m15131a(m14900a), c7282jy);
                if (!m15231b && !z) {
                    C7210iu.this.m15199a(mo15140a, c7209it.m15235a(mo15140a));
                }
                return m15238a;
            }
        });
    }

    /* renamed from: a */
    public List<? extends AbstractC7287kc> m15225a(final C7160ij c7160ij) {
        return (List) this.f24227h.mo15071a(new Callable<List<? extends AbstractC7287kc>>() { // from class: com.google.android.gms.internal.iu.4
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<? extends AbstractC7287kc> call() {
                C7210iu.this.f24227h.mo15066d(C7296kg.m14899a(c7160ij));
                return C7210iu.this.m15206a(new C7244jf(C7248ji.f24328b, c7160ij));
            }
        });
    }

    /* renamed from: a */
    public List<? extends AbstractC7287kc> m15224a(final C7160ij c7160ij, final C7142ia c7142ia, final C7142ia c7142ia2, final long j, final boolean z) {
        return (List) this.f24227h.mo15071a(new Callable<List<? extends AbstractC7287kc>>() { // from class: com.google.android.gms.internal.iu.12
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<? extends AbstractC7287kc> call() {
                if (z) {
                    C7210iu.this.f24227h.mo15078a(c7160ij, c7142ia, j);
                }
                C7210iu.this.f24222c.m15130a(c7160ij, c7142ia2, Long.valueOf(j));
                return C7210iu.this.m15206a(new C7245jg(C7248ji.f24327a, c7160ij, c7142ia2));
            }
        });
    }

    /* renamed from: a */
    public List<? extends AbstractC7287kc> m15223a(final C7160ij c7160ij, final AbstractC7344lh abstractC7344lh) {
        return (List) this.f24227h.mo15071a(new Callable<List<? extends AbstractC7287kc>>() { // from class: com.google.android.gms.internal.iu.2
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<? extends AbstractC7287kc> call() {
                C7210iu.this.f24227h.mo15074a(C7296kg.m14899a(c7160ij), abstractC7344lh);
                return C7210iu.this.m15206a(new C7250jj(C7248ji.f24328b, c7160ij, abstractC7344lh));
            }
        });
    }

    /* renamed from: a */
    public List<? extends AbstractC7287kc> m15222a(final C7160ij c7160ij, final AbstractC7344lh abstractC7344lh, final C7229iv c7229iv) {
        return (List) this.f24227h.mo15071a(new Callable<List<? extends AbstractC7287kc>>() { // from class: com.google.android.gms.internal.iu.6
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<? extends AbstractC7287kc> call() {
                C7296kg m15189b = C7210iu.this.m15189b(c7229iv);
                if (m15189b != null) {
                    C7160ij m15369a = C7160ij.m15369a(m15189b.m14900a(), c7160ij);
                    C7210iu.this.f24227h.mo15074a(m15369a.m15356h() ? m15189b : C7296kg.m14899a(c7160ij), abstractC7344lh);
                    return C7210iu.this.m15200a(m15189b, new C7250jj(C7248ji.m15095a(m15189b.m14897b()), m15369a, abstractC7344lh));
                }
                return Collections.emptyList();
            }
        });
    }

    /* renamed from: a */
    public List<? extends AbstractC7287kc> m15221a(final C7160ij c7160ij, final AbstractC7344lh abstractC7344lh, final AbstractC7344lh abstractC7344lh2, final long j, final boolean z, final boolean z2) {
        C7392mk.m14606a(z || !z2, "We shouldn't be persisting non-visible writes.");
        return (List) this.f24227h.mo15071a(new Callable<List<? extends AbstractC7287kc>>() { // from class: com.google.android.gms.internal.iu.1
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<? extends AbstractC7287kc> call() {
                if (z2) {
                    C7210iu.this.f24227h.mo15076a(c7160ij, abstractC7344lh, j);
                }
                C7210iu.this.f24222c.m15125a(c7160ij, abstractC7344lh2, Long.valueOf(j), z);
                return !z ? Collections.emptyList() : C7210iu.this.m15206a(new C7250jj(C7248ji.f24327a, c7160ij, abstractC7344lh2));
            }
        });
    }

    /* renamed from: a */
    public List<? extends AbstractC7287kc> m15220a(C7160ij c7160ij, List<C7351lm> list) {
        C7297kh m15229d;
        C7209it m14981e = this.f24221b.m14981e(c7160ij);
        if (m14981e != null && (m15229d = m14981e.m15229d()) != null) {
            AbstractC7344lh m14887b = m15229d.m14887b();
            Iterator<C7351lm> it2 = list.iterator();
            while (true) {
                AbstractC7344lh abstractC7344lh = m14887b;
                if (!it2.hasNext()) {
                    return m15223a(c7160ij, abstractC7344lh);
                }
                m14887b = it2.next().m14726a(abstractC7344lh);
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public List<? extends AbstractC7287kc> m15219a(C7160ij c7160ij, List<C7351lm> list, C7229iv c7229iv) {
        C7296kg m15189b = m15189b(c7229iv);
        if (m15189b != null) {
            if (!f24220a && !c7160ij.equals(m15189b.m14900a())) {
                throw new AssertionError();
            }
            C7209it m14981e = this.f24221b.m14981e(m15189b.m14900a());
            if (!f24220a && m14981e == null) {
                throw new AssertionError("Missing sync point for query tag that we're tracking");
            }
            C7297kh m15235a = m14981e.m15235a(m15189b);
            if (!f24220a && m15235a == null) {
                throw new AssertionError("Missing view for query tag that we're tracking");
            }
            AbstractC7344lh m14887b = m15235a.m14887b();
            Iterator<C7351lm> it2 = list.iterator();
            while (true) {
                AbstractC7344lh abstractC7344lh = m14887b;
                if (!it2.hasNext()) {
                    return m15222a(c7160ij, abstractC7344lh, c7229iv);
                }
                m14887b = it2.next().m14726a(abstractC7344lh);
            }
        } else {
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public List<? extends AbstractC7287kc> m15218a(final C7160ij c7160ij, final Map<C7160ij, AbstractC7344lh> map) {
        return (List) this.f24227h.mo15071a(new Callable<List<? extends AbstractC7287kc>>() { // from class: com.google.android.gms.internal.iu.3
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<? extends AbstractC7287kc> call() {
                C7142ia m15425b = C7142ia.m15425b(map);
                C7210iu.this.f24227h.mo15069b(c7160ij, m15425b);
                return C7210iu.this.m15206a(new C7245jg(C7248ji.f24328b, c7160ij, m15425b));
            }
        });
    }

    /* renamed from: a */
    public List<? extends AbstractC7287kc> m15217a(final C7160ij c7160ij, final Map<C7160ij, AbstractC7344lh> map, final C7229iv c7229iv) {
        return (List) this.f24227h.mo15071a(new Callable<List<? extends AbstractC7287kc>>() { // from class: com.google.android.gms.internal.iu.7
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<? extends AbstractC7287kc> call() {
                C7296kg m15189b = C7210iu.this.m15189b(c7229iv);
                if (m15189b != null) {
                    C7160ij m15369a = C7160ij.m15369a(m15189b.m14900a(), c7160ij);
                    C7142ia m15425b = C7142ia.m15425b(map);
                    C7210iu.this.f24227h.mo15069b(c7160ij, m15425b);
                    return C7210iu.this.m15200a(m15189b, new C7245jg(C7248ji.m15095a(m15189b.m14897b()), m15369a, m15425b));
                }
                return Collections.emptyList();
            }
        });
    }

    /* renamed from: a */
    public List<? extends AbstractC7287kc> m15207a(final C7229iv c7229iv) {
        return (List) this.f24227h.mo15071a(new Callable<List<? extends AbstractC7287kc>>() { // from class: com.google.android.gms.internal.iu.5
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<? extends AbstractC7287kc> call() {
                C7296kg m15189b = C7210iu.this.m15189b(c7229iv);
                if (m15189b != null) {
                    C7210iu.this.f24227h.mo15066d(m15189b);
                    return C7210iu.this.m15200a(m15189b, new C7244jf(C7248ji.m15095a(m15189b.m14897b()), C7160ij.m15371a()));
                }
                return Collections.emptyList();
            }
        });
    }

    /* renamed from: a */
    public List<AbstractC7287kc> m15198a(C7296kg c7296kg, C9831c c9831c) {
        return m15201a(c7296kg, (AbstractC7151ie) null, c9831c);
    }

    /* renamed from: a */
    public void m15197a(C7296kg c7296kg, boolean z) {
        if (z && !this.f24225f.contains(c7296kg)) {
            m15226a(new C7226b(c7296kg));
            this.f24225f.add(c7296kg);
        } else if (z || !this.f24225f.contains(c7296kg)) {
        } else {
            m15194b(new C7226b(c7296kg));
            this.f24225f.remove(c7296kg);
        }
    }

    /* renamed from: a */
    public boolean m15228a() {
        return this.f24221b.m14984d();
    }

    /* renamed from: b */
    public AbstractC7344lh m15193b(C7160ij c7160ij, List<Long> list) {
        AbstractC7344lh m15237a;
        C7271ju<C7209it> c7271ju = this.f24221b;
        c7271ju.m14990b();
        AbstractC7344lh abstractC7344lh = null;
        C7160ij m15371a = C7160ij.m15371a();
        C7271ju<C7209it> c7271ju2 = c7271ju;
        C7160ij c7160ij2 = c7160ij;
        while (true) {
            C7319kv m15363d = c7160ij2.m15363d();
            C7160ij m15361e = c7160ij2.m15361e();
            C7160ij m15368a = m15371a.m15368a(m15363d);
            C7160ij m15369a = C7160ij.m15369a(m15368a, c7160ij);
            c7271ju2 = m15363d != null ? c7271ju2.m14992a(m15363d) : C7271ju.m15000a();
            C7209it m14990b = c7271ju2.m14990b();
            m15237a = m14990b != null ? m14990b.m15237a(m15369a) : abstractC7344lh;
            if (m15361e.m15356h() || m15237a != null) {
                break;
            }
            abstractC7344lh = m15237a;
            m15371a = m15368a;
            c7160ij2 = m15361e;
        }
        return this.f24222c.m15124a(c7160ij, m15237a, list, true);
    }

    /* renamed from: b */
    public List<? extends AbstractC7287kc> m15195b() {
        return (List) this.f24227h.mo15071a(new Callable<List<? extends AbstractC7287kc>>() { // from class: com.google.android.gms.internal.iu.14
            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public List<? extends AbstractC7287kc> call() {
                C7210iu.this.f24227h.mo15081a();
                if (C7210iu.this.f24222c.m15133a().isEmpty()) {
                    return Collections.emptyList();
                }
                return C7210iu.this.m15206a(new C7243je(C7160ij.m15371a(), new C7271ju(true), true));
            }
        });
    }

    /* renamed from: b */
    public List<AbstractC7287kc> m15194b(AbstractC7151ie abstractC7151ie) {
        return m15201a(abstractC7151ie.mo15140a(), abstractC7151ie, (C9831c) null);
    }
}
