package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7103hr;
import com.google.android.gms.internal.AbstractC7136hy;
import com.google.android.gms.internal.C7204is;
import com.google.android.gms.internal.C7210iu;
import com.google.android.gms.internal.C7277jw;
import com.google.firebase.database.AbstractC9901r;
import com.google.firebase.database.C9828b;
import com.google.firebase.database.C9831c;
import com.google.firebase.database.C9866d;
import com.google.firebase.database.C9867e;
import com.google.firebase.database.C9874g;
import com.google.firebase.database.C9897q;
import com.google.firebase.database.C9902s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.im */
/* loaded from: classes2.dex */
public class C7164im implements AbstractC7103hr.AbstractC7104a {

    /* renamed from: b */
    static final /* synthetic */ boolean f24089b;

    /* renamed from: c */
    private final C7193in f24091c;

    /* renamed from: e */
    private final AbstractC7103hr f24093e;

    /* renamed from: f */
    private C7203ir f24094f;

    /* renamed from: g */
    private C7204is f24095g;

    /* renamed from: h */
    private C7277jw<List<C7191a>> f24096h;

    /* renamed from: j */
    private final C7291ke f24098j;

    /* renamed from: k */
    private final C7146ic f24099k;

    /* renamed from: l */
    private final C7315ks f24100l;

    /* renamed from: m */
    private final C7315ks f24101m;

    /* renamed from: n */
    private final C7315ks f24102n;

    /* renamed from: p */
    private C7210iu f24104p;

    /* renamed from: q */
    private C7210iu f24105q;

    /* renamed from: r */
    private C9874g f24106r;

    /* renamed from: d */
    private final C7388mg f24092d = new C7388mg(new C7382md(), 0);

    /* renamed from: i */
    private boolean f24097i = false;

    /* renamed from: a */
    public long f24090a = 0;

    /* renamed from: o */
    private long f24103o = 1;

    /* renamed from: s */
    private boolean f24107s = false;

    /* renamed from: t */
    private long f24108t = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.im$a */
    /* loaded from: classes2.dex */
    public static class C7191a implements Comparable<C7191a> {

        /* renamed from: a */
        private C7160ij f24174a;

        /* renamed from: b */
        private C9897q.AbstractC9899a f24175b;

        /* renamed from: c */
        private AbstractC9901r f24176c;

        /* renamed from: d */
        private EnumC7192b f24177d;

        /* renamed from: e */
        private long f24178e;

        /* renamed from: f */
        private boolean f24179f;

        /* renamed from: g */
        private int f24180g;

        /* renamed from: h */
        private C9831c f24181h;

        /* renamed from: i */
        private long f24182i;

        /* renamed from: j */
        private AbstractC7344lh f24183j;

        /* renamed from: k */
        private AbstractC7344lh f24184k;

        /* renamed from: l */
        private AbstractC7344lh f24185l;

        private C7191a(C7160ij c7160ij, C9897q.AbstractC9899a abstractC9899a, AbstractC9901r abstractC9901r, EnumC7192b enumC7192b, boolean z, long j) {
            this.f24174a = c7160ij;
            this.f24175b = abstractC9899a;
            this.f24176c = abstractC9901r;
            this.f24177d = enumC7192b;
            this.f24180g = 0;
            this.f24179f = z;
            this.f24178e = j;
            this.f24181h = null;
            this.f24183j = null;
            this.f24184k = null;
            this.f24185l = null;
        }

        /* renamed from: e */
        static /* synthetic */ int m15271e(C7191a c7191a) {
            int i = c7191a.f24180g;
            c7191a.f24180g = i + 1;
            return i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C7191a c7191a) {
            if (this.f24178e < c7191a.f24178e) {
                return -1;
            }
            return this.f24178e == c7191a.f24178e ? 0 : 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.im$b */
    /* loaded from: classes2.dex */
    public enum EnumC7192b {
        INITIALIZING,
        RUN,
        SENT,
        COMPLETED,
        SENT_NEEDS_ABORT,
        NEEDS_ABORT
    }

    static {
        f24089b = !C7164im.class.desiredAssertionStatus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7164im(C7193in c7193in, C7146ic c7146ic, C9874g c9874g) {
        this.f24091c = c7193in;
        this.f24099k = c7146ic;
        this.f24106r = c9874g;
        this.f24100l = this.f24099k.m15413a("RepoOperation");
        this.f24101m = this.f24099k.m15413a("Transaction");
        this.f24102n = this.f24099k.m15413a("DataOperation");
        this.f24098j = new C7291ke(this.f24099k);
        this.f24093e = c7146ic.m15415a(new C7101hp(c7193in.f24193a, c7193in.f24195c, c7193in.f24194b), this);
        m15320a(new Runnable() { // from class: com.google.android.gms.internal.im.1
            @Override // java.lang.Runnable
            public void run() {
                C7164im.this.m15288j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C7160ij m15342a(C7160ij c7160ij, final int i) {
        C7160ij m14967b = m15303c(c7160ij).m14967b();
        if (this.f24101m.m14844a()) {
            C7315ks c7315ks = this.f24100l;
            String valueOf = String.valueOf(c7160ij);
            String valueOf2 = String.valueOf(m14967b);
            c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 44 + String.valueOf(valueOf2).length()).append("Aborting transactions for path: ").append(valueOf).append(". Affected: ").append(valueOf2).toString(), new Object[0]);
        }
        C7277jw<List<C7191a>> m14975a = this.f24096h.m14975a(c7160ij);
        m14975a.m14974a(new C7277jw.AbstractC7279a<List<C7191a>>() { // from class: com.google.android.gms.internal.im.6
            @Override // com.google.android.gms.internal.C7277jw.AbstractC7279a
            /* renamed from: a */
            public boolean mo14962a(C7277jw<List<C7191a>> c7277jw) {
                C7164im.this.m15324a(c7277jw, i);
                return false;
            }
        });
        m15324a(m14975a, i);
        m14975a.m14972a(new C7277jw.AbstractC7280b<List<C7191a>>() { // from class: com.google.android.gms.internal.im.7
            @Override // com.google.android.gms.internal.C7277jw.AbstractC7280b
            /* renamed from: a */
            public void mo14961a(C7277jw<List<C7191a>> c7277jw) {
                C7164im.this.m15324a(c7277jw, i);
            }
        });
        return m14967b;
    }

    /* renamed from: a */
    private AbstractC7344lh m15343a(C7160ij c7160ij) {
        return m15337a(c7160ij, new ArrayList());
    }

    /* renamed from: a */
    private AbstractC7344lh m15337a(C7160ij c7160ij, List<Long> list) {
        AbstractC7344lh m15193b = this.f24105q.m15193b(c7160ij, list);
        return m15193b == null ? C7335la.m14778j() : m15193b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m15345a(long j, C7160ij c7160ij, C9831c c9831c) {
        if (c9831c == null || c9831c.m6859a() != -25) {
            List<? extends AbstractC7287kc> m15227a = this.f24105q.m15227a(j, !(c9831c == null), true, (AbstractC7381mc) this.f24092d);
            if (m15227a.size() > 0) {
                m15313b(c7160ij);
            }
            m15317a(m15227a);
        }
    }

    /* renamed from: a */
    private void m15326a(AbstractC7257jp abstractC7257jp) {
        List<C7234iy> mo15070b = abstractC7257jp.mo15070b();
        Map<String, Object> m15250a = C7200iq.m15250a(this.f24092d);
        long j = Long.MIN_VALUE;
        for (final C7234iy c7234iy : mo15070b) {
            AbstractC7121hu abstractC7121hu = new AbstractC7121hu() { // from class: com.google.android.gms.internal.im.11
                @Override // com.google.android.gms.internal.AbstractC7121hu
                /* renamed from: a */
                public void mo6832a(String str, String str2) {
                    C9831c m15306b = C7164im.m15306b(str, str2);
                    C7164im.this.m15319a("Persisted write", c7234iy.m15153b(), m15306b);
                    C7164im.this.m15345a(c7234iy.m15154a(), c7234iy.m15153b(), m15306b);
                }
            };
            if (j >= c7234iy.m15154a()) {
                throw new IllegalStateException("Write ids were not in order.");
            }
            long m15154a = c7234iy.m15154a();
            this.f24103o = c7234iy.m15154a() + 1;
            if (c7234iy.m15150e()) {
                if (this.f24100l.m14844a()) {
                    this.f24100l.m14840a(new StringBuilder(48).append("Restoring overwrite with id ").append(c7234iy.m15154a()).toString(), new Object[0]);
                }
                this.f24093e.mo6810a(c7234iy.m15153b().m15365c(), c7234iy.m15152c().mo14747a(true), abstractC7121hu);
                this.f24105q.m15221a(c7234iy.m15153b(), c7234iy.m15152c(), C7200iq.m15251a(c7234iy.m15152c(), m15250a), c7234iy.m15154a(), true, false);
            } else {
                if (this.f24100l.m14844a()) {
                    this.f24100l.m14840a(new StringBuilder(44).append("Restoring merge with id ").append(c7234iy.m15154a()).toString(), new Object[0]);
                }
                this.f24093e.mo6806a(c7234iy.m15153b().m15365c(), c7234iy.m15151d().m15428a(true), abstractC7121hu);
                this.f24105q.m15224a(c7234iy.m15153b(), c7234iy.m15151d(), C7200iq.m15253a(c7234iy.m15151d(), m15250a), c7234iy.m15154a(), false);
            }
            j = m15154a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m15325a(C7277jw<List<C7191a>> c7277jw) {
        Boolean bool;
        if (c7277jw.m14976a() == null) {
            if (!c7277jw.m14965c()) {
                return;
            }
            c7277jw.m14966b(new C7277jw.AbstractC7280b<List<C7191a>>() { // from class: com.google.android.gms.internal.im.21
                @Override // com.google.android.gms.internal.C7277jw.AbstractC7280b
                /* renamed from: a */
                public void mo14961a(C7277jw<List<C7191a>> c7277jw2) {
                    C7164im.this.m15325a(c7277jw2);
                }
            });
            return;
        }
        List<C7191a> m15301c = m15301c(c7277jw);
        if (!f24089b && m15301c.size() <= 0) {
            throw new AssertionError();
        }
        Iterator<C7191a> it2 = m15301c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                bool = true;
                break;
            } else if (it2.next().f24177d != EnumC7192b.RUN) {
                bool = false;
                break;
            }
        }
        if (!bool.booleanValue()) {
            return;
        }
        m15316a(m15301c, c7277jw.m14967b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m15324a(C7277jw<List<C7191a>> c7277jw, int i) {
        final C9831c m6858a;
        List<C7191a> m14976a = c7277jw.m14976a();
        ArrayList arrayList = new ArrayList();
        if (m14976a != null) {
            ArrayList<Runnable> arrayList2 = new ArrayList();
            if (i == -9) {
                m6858a = C9831c.m6857a("overriddenBySet");
            } else {
                C7392mk.m14606a(i == -25, new StringBuilder(45).append("Unknown transaction abort reason: ").append(i).toString());
                m6858a = C9831c.m6858a(-25);
            }
            int i2 = -1;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                int i5 = i2;
                if (i4 >= m14976a.size()) {
                    if (i5 == -1) {
                        c7277jw.m14969a((C7277jw<List<C7191a>>) null);
                    } else {
                        c7277jw.m14969a((C7277jw<List<C7191a>>) m14976a.subList(0, i5 + 1));
                    }
                    m15317a(arrayList);
                    for (Runnable runnable : arrayList2) {
                        m15307b(runnable);
                    }
                    return;
                }
                final C7191a c7191a = m14976a.get(i4);
                if (c7191a.f24177d == EnumC7192b.SENT_NEEDS_ABORT) {
                    i2 = i5;
                } else if (c7191a.f24177d == EnumC7192b.SENT) {
                    if (!f24089b && i5 != i4 - 1) {
                        throw new AssertionError();
                    }
                    c7191a.f24177d = EnumC7192b.SENT_NEEDS_ABORT;
                    c7191a.f24181h = m6858a;
                    i2 = i4;
                } else if (!f24089b && c7191a.f24177d != EnumC7192b.RUN) {
                    throw new AssertionError();
                } else {
                    m15344a(new C7237ja(this, c7191a.f24176c, C7296kg.m14899a(c7191a.f24174a)));
                    if (i == -9) {
                        arrayList.addAll(this.f24105q.m15227a(c7191a.f24182i, true, false, (AbstractC7381mc) this.f24092d));
                    } else {
                        C7392mk.m14606a(i == -25, new StringBuilder(45).append("Unknown transaction abort reason: ").append(i).toString());
                    }
                    arrayList2.add(new Runnable() { // from class: com.google.android.gms.internal.im.8
                        @Override // java.lang.Runnable
                        public void run() {
                            c7191a.f24175b.m6649a(m6858a, false, null);
                        }
                    });
                    i2 = i5;
                }
                i3 = i4 + 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m15319a(String str, C7160ij c7160ij, C9831c c9831c) {
        if (c9831c == null || c9831c.m6859a() == -1 || c9831c.m6859a() == -25) {
            return;
        }
        C7315ks c7315ks = this.f24100l;
        String valueOf = String.valueOf(c7160ij.toString());
        String valueOf2 = String.valueOf(c9831c.toString());
        c7315ks.m14843a(new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length()).append(str).append(" at ").append(valueOf).append(" failed: ").append(valueOf2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m15317a(List<? extends AbstractC7287kc> list) {
        if (!list.isEmpty()) {
            this.f24098j.m14926a(list);
        }
    }

    /* renamed from: a */
    private void m15316a(final List<C7191a> list, final C7160ij c7160ij) {
        ArrayList arrayList = new ArrayList();
        for (C7191a c7191a : list) {
            arrayList.add(Long.valueOf(c7191a.f24182i));
        }
        AbstractC7344lh m15337a = m15337a(c7160ij, arrayList);
        String mo14744d = m15337a.mo14744d();
        for (C7191a c7191a2 : list) {
            if (!f24089b && c7191a2.f24177d != EnumC7192b.RUN) {
                throw new AssertionError();
            }
            c7191a2.f24177d = EnumC7192b.SENT;
            C7191a.m15271e(c7191a2);
            m15337a = m15337a.mo14749a(C7160ij.m15369a(c7160ij, c7191a2.f24174a), c7191a2.f24184k);
        }
        Object mo14747a = m15337a.mo14747a(true);
        m15286k();
        this.f24093e.mo6809a(c7160ij.m15365c(), mo14747a, mo14744d, new AbstractC7121hu() { // from class: com.google.android.gms.internal.im.22
            @Override // com.google.android.gms.internal.AbstractC7121hu
            /* renamed from: a */
            public void mo6832a(String str, String str2) {
                C9831c m15306b = C7164im.m15306b(str, str2);
                C7164im.this.m15319a("Transaction", c7160ij, m15306b);
                ArrayList arrayList2 = new ArrayList();
                if (m15306b != null) {
                    if (m15306b.m6859a() == -1) {
                        for (C7191a c7191a3 : list) {
                            if (c7191a3.f24177d == EnumC7192b.SENT_NEEDS_ABORT) {
                                c7191a3.f24177d = EnumC7192b.NEEDS_ABORT;
                            } else {
                                c7191a3.f24177d = EnumC7192b.RUN;
                            }
                        }
                    } else {
                        for (C7191a c7191a4 : list) {
                            c7191a4.f24177d = EnumC7192b.NEEDS_ABORT;
                            c7191a4.f24181h = m15306b;
                        }
                    }
                    C7164im.this.m15313b(c7160ij);
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                for (final C7191a c7191a5 : list) {
                    c7191a5.f24177d = EnumC7192b.COMPLETED;
                    arrayList2.addAll(C7164im.this.f24105q.m15227a(c7191a5.f24182i, false, false, (AbstractC7381mc) C7164im.this.f24092d));
                    final C9828b m6641a = C9902s.m6641a(C9902s.m6643a(this, c7191a5.f24174a), C7337lc.m14769a(c7191a5.f24185l));
                    arrayList3.add(new Runnable() { // from class: com.google.android.gms.internal.im.22.1
                        @Override // java.lang.Runnable
                        public void run() {
                            c7191a5.f24175b.m6649a(null, true, m6641a);
                        }
                    });
                    C7164im.this.m15344a(new C7237ja(C7164im.this, c7191a5.f24176c, C7296kg.m14899a(c7191a5.f24174a)));
                }
                C7164im.this.m15309b(C7164im.this.f24096h.m14975a(c7160ij));
                C7164im.this.m15284m();
                this.m15317a(arrayList2);
                for (int i = 0; i < arrayList3.size(); i++) {
                    C7164im.this.m15307b((Runnable) arrayList3.get(i));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m15315a(final List<C7191a> list, C7277jw<List<C7191a>> c7277jw) {
        List<C7191a> m14976a = c7277jw.m14976a();
        if (m14976a != null) {
            list.addAll(m14976a);
        }
        c7277jw.m14966b(new C7277jw.AbstractC7280b<List<C7191a>>() { // from class: com.google.android.gms.internal.im.5
            @Override // com.google.android.gms.internal.C7277jw.AbstractC7280b
            /* renamed from: a */
            public void mo14961a(C7277jw<List<C7191a>> c7277jw2) {
                C7164im.this.m15315a(list, c7277jw2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public C7160ij m15313b(C7160ij c7160ij) {
        C7277jw<List<C7191a>> m15303c = m15303c(c7160ij);
        C7160ij m14967b = m15303c.m14967b();
        m15305b(m15301c(m15303c), m14967b);
        return m14967b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static C9831c m15306b(String str, String str2) {
        if (str != null) {
            return C9831c.m6856a(str, str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m15309b(C7277jw<List<C7191a>> c7277jw) {
        List<C7191a> m14976a = c7277jw.m14976a();
        if (m14976a != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= m14976a.size()) {
                    break;
                } else if (m14976a.get(i2).f24177d == EnumC7192b.COMPLETED) {
                    m14976a.remove(i2);
                    i = i2;
                } else {
                    i = i2 + 1;
                }
            }
            if (m14976a.size() > 0) {
                c7277jw.m14969a((C7277jw<List<C7191a>>) m14976a);
            } else {
                c7277jw.m14969a((C7277jw<List<C7191a>>) null);
            }
        }
        c7277jw.m14966b(new C7277jw.AbstractC7280b<List<C7191a>>() { // from class: com.google.android.gms.internal.im.23
            @Override // com.google.android.gms.internal.C7277jw.AbstractC7280b
            /* renamed from: a */
            public void mo14961a(C7277jw<List<C7191a>> c7277jw2) {
                C7164im.this.m15309b(c7277jw2);
            }
        });
    }

    /* renamed from: b */
    private void m15308b(C7319kv c7319kv, Object obj) {
        if (c7319kv.equals(C7145ib.f24046b)) {
            this.f24092d.m14617a(((Long) obj).longValue());
        }
        C7160ij c7160ij = new C7160ij(C7145ib.f24045a, c7319kv);
        try {
            AbstractC7344lh m14735a = C7347li.m14735a(obj);
            this.f24094f.m15246a(c7160ij, m14735a);
            m15317a(this.f24104p.m15223a(c7160ij, m14735a));
        } catch (C9866d e) {
            this.f24100l.m14842a("Failed to parse info update", e);
        }
    }

    /* renamed from: b */
    private void m15305b(List<C7191a> list, C7160ij c7160ij) {
        final C9831c c9831c;
        boolean z;
        C9897q.C9900b m6651a;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<Long> arrayList2 = new ArrayList<>();
        for (C7191a c7191a : list) {
            arrayList2.add(Long.valueOf(c7191a.f24182i));
        }
        for (final C7191a c7191a2 : list) {
            C7160ij m15369a = C7160ij.m15369a(c7160ij, c7191a2.f24174a);
            ArrayList arrayList3 = new ArrayList();
            if (!f24089b && m15369a == null) {
                throw new AssertionError();
            }
            if (c7191a2.f24177d == EnumC7192b.NEEDS_ABORT) {
                z = true;
                c9831c = c7191a2.f24181h;
                if (c9831c.m6859a() != -25) {
                    arrayList3.addAll(this.f24105q.m15227a(c7191a2.f24182i, true, false, (AbstractC7381mc) this.f24092d));
                }
            } else if (c7191a2.f24177d != EnumC7192b.RUN) {
                c9831c = null;
                z = false;
            } else if (c7191a2.f24180g >= 25) {
                z = true;
                c9831c = C9831c.m6857a("maxretries");
                arrayList3.addAll(this.f24105q.m15227a(c7191a2.f24182i, true, false, (AbstractC7381mc) this.f24092d));
            } else {
                AbstractC7344lh m15337a = m15337a(c7191a2.f24174a, arrayList2);
                c7191a2.f24183j = m15337a;
                try {
                    m6651a = c7191a2.f24175b.m6648a(C9902s.m6642a(m15337a));
                    c9831c = null;
                } catch (Throwable th) {
                    C9831c m6854a = C9831c.m6854a(th);
                    m6651a = C9897q.m6651a();
                    c9831c = m6854a;
                }
                if (m6651a.m6647a()) {
                    Long valueOf = Long.valueOf(c7191a2.f24182i);
                    Map<String, Object> m15250a = C7200iq.m15250a(this.f24092d);
                    AbstractC7344lh m6646b = m6651a.m6646b();
                    AbstractC7344lh m15251a = C7200iq.m15251a(m6646b, m15250a);
                    c7191a2.f24184k = m6646b;
                    c7191a2.f24185l = m15251a;
                    c7191a2.f24182i = m15286k();
                    arrayList2.remove(valueOf);
                    arrayList3.addAll(this.f24105q.m15221a(c7191a2.f24174a, m6646b, m15251a, c7191a2.f24182i, c7191a2.f24179f, false));
                    arrayList3.addAll(this.f24105q.m15227a(valueOf.longValue(), true, false, (AbstractC7381mc) this.f24092d));
                    c9831c = null;
                    z = false;
                } else {
                    z = true;
                    arrayList3.addAll(this.f24105q.m15227a(c7191a2.f24182i, true, false, (AbstractC7381mc) this.f24092d));
                }
            }
            m15317a(arrayList3);
            if (z) {
                c7191a2.f24177d = EnumC7192b.COMPLETED;
                final C9828b m6641a = C9902s.m6641a(C9902s.m6643a(this, c7191a2.f24174a), C7337lc.m14769a(c7191a2.f24183j));
                m15320a(new Runnable() { // from class: com.google.android.gms.internal.im.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C7164im.this.m15344a(new C7237ja(C7164im.this, c7191a2.f24176c, C7296kg.m14899a(c7191a2.f24174a)));
                    }
                });
                arrayList.add(new Runnable() { // from class: com.google.android.gms.internal.im.3
                    @Override // java.lang.Runnable
                    public void run() {
                        c7191a2.f24175b.m6649a(c9831c, false, m6641a);
                    }
                });
            }
        }
        m15309b(this.f24096h);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= arrayList.size()) {
                m15284m();
                return;
            } else {
                m15307b((Runnable) arrayList.get(i2));
                i = i2 + 1;
            }
        }
    }

    /* renamed from: c */
    private C7277jw<List<C7191a>> m15303c(C7160ij c7160ij) {
        C7277jw<List<C7191a>> c7277jw = this.f24096h;
        while (!c7160ij.m15356h() && c7277jw.m14976a() == null) {
            c7277jw = c7277jw.m14975a(new C7160ij(c7160ij.m15363d()));
            c7160ij = c7160ij.m15361e();
        }
        return c7277jw;
    }

    /* renamed from: c */
    private List<C7191a> m15301c(C7277jw<List<C7191a>> c7277jw) {
        ArrayList arrayList = new ArrayList();
        m15315a(arrayList, c7277jw);
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m15288j() {
        this.f24099k.m15396p().mo15438a(new AbstractC7136hy.AbstractC7138b() { // from class: com.google.android.gms.internal.im.4
            @Override // com.google.android.gms.internal.AbstractC7136hy.AbstractC7138b
            /* renamed from: a */
            public void mo15282a(String str) {
                C7164im.this.f24100l.m14840a("Auth token changed, triggering auth token refresh", new Object[0]);
                C7164im.this.f24093e.mo6801c(str);
            }
        });
        this.f24093e.mo6814a();
        AbstractC7257jp m15411b = this.f24099k.m15411b(this.f24091c.f24193a);
        this.f24094f = new C7203ir();
        this.f24095g = new C7204is();
        this.f24096h = new C7277jw<>();
        this.f24104p = new C7210iu(this.f24099k, new C7256jo(), new C7210iu.AbstractC7228d() { // from class: com.google.android.gms.internal.im.9
            @Override // com.google.android.gms.internal.C7210iu.AbstractC7228d
            /* renamed from: a */
            public void mo15163a(C7296kg c7296kg, C7229iv c7229iv) {
            }

            @Override // com.google.android.gms.internal.C7210iu.AbstractC7228d
            /* renamed from: a */
            public void mo15162a(final C7296kg c7296kg, C7229iv c7229iv, AbstractC7102hq abstractC7102hq, final C7210iu.AbstractC7225a abstractC7225a) {
                C7164im.this.m15320a(new Runnable() { // from class: com.google.android.gms.internal.im.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC7344lh m15247a = C7164im.this.f24094f.m15247a(c7296kg.m14900a());
                        if (!m15247a.mo14739b()) {
                            C7164im.this.m15317a(C7164im.this.f24104p.m15223a(c7296kg.m14900a(), m15247a));
                            abstractC7225a.mo15164a(null);
                        }
                    }
                });
            }
        });
        this.f24105q = new C7210iu(this.f24099k, m15411b, new C7210iu.AbstractC7228d() { // from class: com.google.android.gms.internal.im.10
            @Override // com.google.android.gms.internal.C7210iu.AbstractC7228d
            /* renamed from: a */
            public void mo15163a(C7296kg c7296kg, C7229iv c7229iv) {
                C7164im.this.f24093e.mo6808a(c7296kg.m14900a().m15365c(), c7296kg.m14897b().m14907l());
            }

            @Override // com.google.android.gms.internal.C7210iu.AbstractC7228d
            /* renamed from: a */
            public void mo15162a(C7296kg c7296kg, C7229iv c7229iv, AbstractC7102hq abstractC7102hq, final C7210iu.AbstractC7225a abstractC7225a) {
                C7164im.this.f24093e.mo6807a(c7296kg.m14900a().m15365c(), c7296kg.m14897b().m14907l(), abstractC7102hq, c7229iv != null ? Long.valueOf(c7229iv.m15161a()) : null, new AbstractC7121hu() { // from class: com.google.android.gms.internal.im.10.1
                    @Override // com.google.android.gms.internal.AbstractC7121hu
                    /* renamed from: a */
                    public void mo6832a(String str, String str2) {
                        C7164im.this.m15317a(abstractC7225a.mo15164a(C7164im.m15306b(str, str2)));
                    }
                });
            }
        });
        m15326a(m15411b);
        m15308b(C7145ib.f24047c, (Object) false);
        m15308b(C7145ib.f24048d, (Object) false);
    }

    /* renamed from: k */
    private long m15286k() {
        long j = this.f24103o;
        this.f24103o = 1 + j;
        return j;
    }

    /* renamed from: l */
    private void m15285l() {
        C7204is m15252a = C7200iq.m15252a(this.f24095g, C7200iq.m15250a(this.f24092d));
        final ArrayList arrayList = new ArrayList();
        m15252a.m15244a(C7160ij.m15371a(), new C7204is.AbstractC7208b() { // from class: com.google.android.gms.internal.im.18
            @Override // com.google.android.gms.internal.C7204is.AbstractC7208b
            /* renamed from: a */
            public void mo15240a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
                arrayList.addAll(C7164im.this.f24105q.m15223a(c7160ij, abstractC7344lh));
                C7164im.this.m15313b(C7164im.this.m15342a(c7160ij, -9));
            }
        });
        this.f24095g = new C7204is();
        m15317a(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m15284m() {
        C7277jw<List<C7191a>> c7277jw = this.f24096h;
        m15309b(c7277jw);
        m15325a(c7277jw);
    }

    /* renamed from: n */
    private long m15283n() {
        long j = this.f24108t;
        this.f24108t = 1 + j;
        return j;
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr.AbstractC7104a
    /* renamed from: a */
    public void mo6831a() {
        m15322a(C7145ib.f24048d, (Object) true);
    }

    /* renamed from: a */
    public void m15344a(AbstractC7151ie abstractC7151ie) {
        m15317a(C7145ib.f24045a.equals(abstractC7151ie.mo15140a().m14900a().m15363d()) ? this.f24104p.m15194b(abstractC7151ie) : this.f24105q.m15194b(abstractC7151ie));
    }

    /* renamed from: a */
    public void m15341a(final C7160ij c7160ij, C7142ia c7142ia, final C9867e.AbstractC9872a abstractC9872a, Map<String, Object> map) {
        if (this.f24100l.m14844a()) {
            C7315ks c7315ks = this.f24100l;
            String valueOf = String.valueOf(c7160ij);
            c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 8).append("update: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.f24102n.m14844a()) {
            C7315ks c7315ks2 = this.f24102n;
            String valueOf2 = String.valueOf(c7160ij);
            String valueOf3 = String.valueOf(map);
            c7315ks2.m14840a(new StringBuilder(String.valueOf(valueOf2).length() + 9 + String.valueOf(valueOf3).length()).append("update: ").append(valueOf2).append(" ").append(valueOf3).toString(), new Object[0]);
        }
        if (c7142ia.m15420e()) {
            if (this.f24100l.m14844a()) {
                this.f24100l.m14840a("update called with no changes. No-op", new Object[0]);
            }
            m15321a(abstractC9872a, (C9831c) null, c7160ij);
            return;
        }
        C7142ia m15253a = C7200iq.m15253a(c7142ia, C7200iq.m15250a(this.f24092d));
        final long m15286k = m15286k();
        m15317a(this.f24105q.m15224a(c7160ij, c7142ia, m15253a, m15286k, true));
        this.f24093e.mo6806a(c7160ij.m15365c(), map, new AbstractC7121hu() { // from class: com.google.android.gms.internal.im.15
            @Override // com.google.android.gms.internal.AbstractC7121hu
            /* renamed from: a */
            public void mo6832a(String str, String str2) {
                C9831c m15306b = C7164im.m15306b(str, str2);
                C7164im.this.m15319a("updateChildren", c7160ij, m15306b);
                C7164im.this.m15345a(m15286k, c7160ij, m15306b);
                C7164im.this.m15321a(abstractC9872a, m15306b, c7160ij);
            }
        });
        m15313b(m15342a(c7160ij, -9));
    }

    /* renamed from: a */
    public void m15340a(final C7160ij c7160ij, AbstractC7344lh abstractC7344lh, final C9867e.AbstractC9872a abstractC9872a) {
        if (this.f24100l.m14844a()) {
            C7315ks c7315ks = this.f24100l;
            String valueOf = String.valueOf(c7160ij);
            c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 5).append("set: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.f24102n.m14844a()) {
            C7315ks c7315ks2 = this.f24102n;
            String valueOf2 = String.valueOf(c7160ij);
            String valueOf3 = String.valueOf(abstractC7344lh);
            c7315ks2.m14840a(new StringBuilder(String.valueOf(valueOf2).length() + 6 + String.valueOf(valueOf3).length()).append("set: ").append(valueOf2).append(" ").append(valueOf3).toString(), new Object[0]);
        }
        AbstractC7344lh m15251a = C7200iq.m15251a(abstractC7344lh, C7200iq.m15250a(this.f24092d));
        final long m15286k = m15286k();
        m15317a(this.f24105q.m15221a(c7160ij, abstractC7344lh, m15251a, m15286k, true, true));
        this.f24093e.mo6810a(c7160ij.m15365c(), abstractC7344lh.mo14747a(true), new AbstractC7121hu() { // from class: com.google.android.gms.internal.im.14
            @Override // com.google.android.gms.internal.AbstractC7121hu
            /* renamed from: a */
            public void mo6832a(String str, String str2) {
                C9831c m15306b = C7164im.m15306b(str, str2);
                C7164im.this.m15319a("setValue", c7160ij, m15306b);
                C7164im.this.m15345a(m15286k, c7160ij, m15306b);
                C7164im.this.m15321a(abstractC9872a, m15306b, c7160ij);
            }
        });
        m15313b(m15342a(c7160ij, -9));
    }

    /* renamed from: a */
    public void m15339a(final C7160ij c7160ij, final C9867e.AbstractC9872a abstractC9872a) {
        this.f24093e.mo6811a(c7160ij.m15365c(), new AbstractC7121hu() { // from class: com.google.android.gms.internal.im.17
            @Override // com.google.android.gms.internal.AbstractC7121hu
            /* renamed from: a */
            public void mo6832a(String str, String str2) {
                C9831c m15306b = C7164im.m15306b(str, str2);
                if (m15306b == null) {
                    C7164im.this.f24095g.m15245a(c7160ij);
                }
                C7164im.this.m15321a(abstractC9872a, m15306b, c7160ij);
            }
        });
    }

    /* renamed from: a */
    public void m15338a(C7160ij c7160ij, final C9897q.AbstractC9899a abstractC9899a, boolean z) {
        final C9831c m6854a;
        C9897q.C9900b m6651a;
        C9897q.C9900b m6648a;
        if (this.f24100l.m14844a()) {
            C7315ks c7315ks = this.f24100l;
            String valueOf = String.valueOf(c7160ij);
            c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 13).append("transaction: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.f24102n.m14844a()) {
            C7315ks c7315ks2 = this.f24100l;
            String valueOf2 = String.valueOf(c7160ij);
            c7315ks2.m14840a(new StringBuilder(String.valueOf(valueOf2).length() + 13).append("transaction: ").append(valueOf2).toString(), new Object[0]);
        }
        if (this.f24099k.m15402j() && !this.f24107s) {
            this.f24107s = true;
            this.f24101m.m14837b("runTransaction() usage detected while persistence is enabled. Please be aware that transactions *will not* be persisted across database restarts.  See https://www.firebase.com/docs/android/guide/offline-capabilities.html#section-handling-transactions-offline for more details.");
        }
        C9867e m6643a = C9902s.m6643a(this, c7160ij);
        AbstractC9901r abstractC9901r = new AbstractC9901r() { // from class: com.google.android.gms.internal.im.19
            @Override // com.google.firebase.database.AbstractC9901r
            /* renamed from: a */
            public void mo6645a(C9828b c9828b) {
            }

            @Override // com.google.firebase.database.AbstractC9901r
            /* renamed from: a */
            public void mo6644a(C9831c c9831c) {
            }
        };
        m15314b(new C7237ja(this, abstractC9901r, m6643a.o()));
        C7191a c7191a = new C7191a(c7160ij, abstractC9899a, abstractC9901r, EnumC7192b.INITIALIZING, z, m15283n());
        AbstractC7344lh m15343a = m15343a(c7160ij);
        c7191a.f24183j = m15343a;
        try {
            m6648a = abstractC9899a.m6648a(C9902s.m6642a(m15343a));
        } catch (Throwable th) {
            m6854a = C9831c.m6854a(th);
            m6651a = C9897q.m6651a();
        }
        if (m6648a == null) {
            throw new NullPointerException("Transaction returned null as result");
        }
        m6651a = m6648a;
        m6854a = null;
        if (!m6651a.m6647a()) {
            c7191a.f24184k = null;
            c7191a.f24185l = null;
            final C9828b m6641a = C9902s.m6641a(m6643a, C7337lc.m14769a(c7191a.f24183j));
            m15307b(new Runnable() { // from class: com.google.android.gms.internal.im.20
                @Override // java.lang.Runnable
                public void run() {
                    abstractC9899a.m6649a(m6854a, false, m6641a);
                }
            });
            return;
        }
        c7191a.f24177d = EnumC7192b.RUN;
        C7277jw<List<C7191a>> m14975a = this.f24096h.m14975a(c7160ij);
        List<C7191a> m14976a = m14975a.m14976a();
        if (m14976a == null) {
            m14976a = new ArrayList<>();
        }
        m14976a.add(c7191a);
        m14975a.m14969a((C7277jw<List<C7191a>>) m14976a);
        Map<String, Object> m15250a = C7200iq.m15250a(this.f24092d);
        AbstractC7344lh m6646b = m6651a.m6646b();
        AbstractC7344lh m15251a = C7200iq.m15251a(m6646b, m15250a);
        c7191a.f24184k = m6646b;
        c7191a.f24185l = m15251a;
        c7191a.f24182i = m15286k();
        m15317a(this.f24105q.m15221a(c7160ij, m6646b, m15251a, c7191a.f24182i, z, false));
        m15284m();
    }

    /* renamed from: a */
    public void m15336a(final C7160ij c7160ij, final Map<C7160ij, AbstractC7344lh> map, final C9867e.AbstractC9872a abstractC9872a, Map<String, Object> map2) {
        this.f24093e.mo6803b(c7160ij.m15365c(), map2, new AbstractC7121hu() { // from class: com.google.android.gms.internal.im.12
            @Override // com.google.android.gms.internal.AbstractC7121hu
            /* renamed from: a */
            public void mo6832a(String str, String str2) {
                C9831c m15306b = C7164im.m15306b(str, str2);
                C7164im.this.m15319a("onDisconnect().updateChildren", c7160ij, m15306b);
                if (m15306b == null) {
                    for (Map.Entry entry : map.entrySet()) {
                        C7164im.this.f24095g.m15243a(c7160ij.m15370a((C7160ij) entry.getKey()), (AbstractC7344lh) entry.getValue());
                    }
                }
                C7164im.this.m15321a(abstractC9872a, m15306b, c7160ij);
            }
        });
    }

    /* renamed from: a */
    public void m15323a(C7296kg c7296kg, boolean z) {
        if (f24089b || c7296kg.m14900a().m15356h() || !c7296kg.m14900a().m15363d().equals(C7145ib.f24045a)) {
            this.f24105q.m15197a(c7296kg, z);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void m15322a(C7319kv c7319kv, Object obj) {
        m15308b(c7319kv, obj);
    }

    /* renamed from: a */
    void m15321a(final C9867e.AbstractC9872a abstractC9872a, final C9831c c9831c, C7160ij c7160ij) {
        if (abstractC9872a != null) {
            C7319kv m15357g = c7160ij.m15357g();
            final C9867e m6643a = (m15357g == null || !m15357g.m14822f()) ? C9902s.m6643a(this, c7160ij) : C9902s.m6643a(this, c7160ij.m15359f());
            m15307b(new Runnable() { // from class: com.google.android.gms.internal.im.13
                @Override // java.lang.Runnable
                public void run() {
                    abstractC9872a.mo6745a(c9831c, m6643a);
                }
            });
        }
    }

    /* renamed from: a */
    public void m15320a(Runnable runnable) {
        this.f24099k.m15410c();
        this.f24099k.m15399m().mo14628a(runnable);
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr.AbstractC7104a
    /* renamed from: a */
    public void mo6830a(List<String> list, Object obj, boolean z, Long l) {
        List<? extends AbstractC7287kc> m15223a;
        C7160ij c7160ij = new C7160ij(list);
        if (this.f24100l.m14844a()) {
            C7315ks c7315ks = this.f24100l;
            String valueOf = String.valueOf(c7160ij);
            c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 14).append("onDataUpdate: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.f24102n.m14844a()) {
            C7315ks c7315ks2 = this.f24100l;
            String valueOf2 = String.valueOf(c7160ij);
            String valueOf3 = String.valueOf(obj);
            c7315ks2.m14840a(new StringBuilder(String.valueOf(valueOf2).length() + 15 + String.valueOf(valueOf3).length()).append("onDataUpdate: ").append(valueOf2).append(" ").append(valueOf3).toString(), new Object[0]);
        }
        this.f24090a++;
        try {
            if (l != null) {
                C7229iv c7229iv = new C7229iv(l.longValue());
                if (z) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        hashMap.put(new C7160ij((String) entry.getKey()), C7347li.m14735a(entry.getValue()));
                    }
                    m15223a = this.f24105q.m15217a(c7160ij, hashMap, c7229iv);
                } else {
                    m15223a = this.f24105q.m15222a(c7160ij, C7347li.m14735a(obj), c7229iv);
                }
            } else if (z) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                    hashMap2.put(new C7160ij((String) entry2.getKey()), C7347li.m14735a(entry2.getValue()));
                }
                m15223a = this.f24105q.m15218a(c7160ij, hashMap2);
            } else {
                m15223a = this.f24105q.m15223a(c7160ij, C7347li.m14735a(obj));
            }
            if (m15223a.size() > 0) {
                m15313b(c7160ij);
            }
            m15317a(m15223a);
        } catch (C9866d e) {
            this.f24100l.m14842a("FIREBASE INTERNAL ERROR", e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr.AbstractC7104a
    /* renamed from: a */
    public void mo6829a(List<String> list, List<C7120ht> list2, Long l) {
        C7160ij c7160ij = new C7160ij(list);
        if (this.f24100l.m14844a()) {
            C7315ks c7315ks = this.f24100l;
            String valueOf = String.valueOf(c7160ij);
            c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 20).append("onRangeMergeUpdate: ").append(valueOf).toString(), new Object[0]);
        }
        if (this.f24102n.m14844a()) {
            C7315ks c7315ks2 = this.f24100l;
            String valueOf2 = String.valueOf(c7160ij);
            String valueOf3 = String.valueOf(list2);
            c7315ks2.m14840a(new StringBuilder(String.valueOf(valueOf2).length() + 21 + String.valueOf(valueOf3).length()).append("onRangeMergeUpdate: ").append(valueOf2).append(" ").append(valueOf3).toString(), new Object[0]);
        }
        this.f24090a++;
        ArrayList arrayList = new ArrayList(list2.size());
        for (C7120ht c7120ht : list2) {
            arrayList.add(new C7351lm(c7120ht));
        }
        List<? extends AbstractC7287kc> m15219a = l != null ? this.f24105q.m15219a(c7160ij, arrayList, new C7229iv(l.longValue())) : this.f24105q.m15220a(c7160ij, arrayList);
        if (m15219a.size() > 0) {
            m15313b(c7160ij);
        }
        m15317a(m15219a);
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr.AbstractC7104a
    /* renamed from: a */
    public void mo6828a(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            m15308b(C7319kv.m14828a(entry.getKey()), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr.AbstractC7104a
    /* renamed from: a */
    public void mo6827a(boolean z) {
        m15322a(C7145ib.f24047c, Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr.AbstractC7104a
    /* renamed from: b */
    public void mo6826b() {
        m15322a(C7145ib.f24048d, (Object) false);
        m15285l();
    }

    /* renamed from: b */
    public void m15314b(AbstractC7151ie abstractC7151ie) {
        C7319kv m15363d = abstractC7151ie.mo15140a().m14900a().m15363d();
        m15317a((m15363d == null || !m15363d.equals(C7145ib.f24045a)) ? this.f24105q.m15226a(abstractC7151ie) : this.f24104p.m15226a(abstractC7151ie));
    }

    /* renamed from: b */
    public void m15312b(final C7160ij c7160ij, final AbstractC7344lh abstractC7344lh, final C9867e.AbstractC9872a abstractC9872a) {
        this.f24093e.mo6804b(c7160ij.m15365c(), abstractC7344lh.mo14747a(true), new AbstractC7121hu() { // from class: com.google.android.gms.internal.im.16
            @Override // com.google.android.gms.internal.AbstractC7121hu
            /* renamed from: a */
            public void mo6832a(String str, String str2) {
                C9831c m15306b = C7164im.m15306b(str, str2);
                C7164im.this.m15319a("onDisconnect().setValue", c7160ij, m15306b);
                if (m15306b == null) {
                    C7164im.this.f24095g.m15243a(c7160ij, abstractC7344lh);
                }
                C7164im.this.m15321a(abstractC9872a, m15306b, c7160ij);
            }
        });
    }

    /* renamed from: b */
    public void m15307b(Runnable runnable) {
        this.f24099k.m15410c();
        this.f24099k.m15400l().mo15156a(runnable);
    }

    /* renamed from: c */
    public C9874g m15304c() {
        return this.f24106r;
    }

    /* renamed from: d */
    public C7193in m15300d() {
        return this.f24091c;
    }

    /* renamed from: e */
    public long m15298e() {
        return this.f24092d.mo14618a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m15296f() {
        return !this.f24104p.m15228a() || !this.f24105q.m15228a();
    }

    /* renamed from: g */
    public void m15294g() {
        if (this.f24100l.m14844a()) {
            this.f24100l.m14840a("Purging writes", new Object[0]);
        }
        m15317a(this.f24105q.m15195b());
        m15342a(C7160ij.m15371a(), -25);
        this.f24093e.mo6800d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m15292h() {
        this.f24093e.mo6799d("repo_interrupt");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m15290i() {
        this.f24093e.mo6798e("repo_interrupt");
    }

    public String toString() {
        return this.f24091c.toString();
    }
}
