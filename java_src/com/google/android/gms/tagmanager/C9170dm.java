package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import com.google.android.gms.internal.AbstractC6896el;
import com.google.android.gms.internal.AbstractC7030gi;
import com.google.android.gms.internal.C6898em;
import com.google.android.gms.internal.C6899en;
import com.google.android.gms.internal.ahn;
import com.google.android.gms.tagmanager.AbstractC9063av;
import com.google.android.gms.tagmanager.C9092bs;
import com.google.android.gms.tagmanager.C9167dl;
/* renamed from: com.google.android.gms.tagmanager.dm */
/* loaded from: classes2.dex */
public class C9170dm extends ahn<AbstractC9069b> {

    /* renamed from: a */
    private final AbstractC4682e f28942a;

    /* renamed from: b */
    private final C9177d f28943b;

    /* renamed from: c */
    private final Looper f28944c;

    /* renamed from: d */
    private final AbstractC9095bu f28945d;

    /* renamed from: e */
    private final int f28946e;

    /* renamed from: f */
    private final Context f28947f;

    /* renamed from: g */
    private final C9203f f28948g;

    /* renamed from: h */
    private final String f28949h;

    /* renamed from: l */
    private final C9180dn f28950l;

    /* renamed from: m */
    private AbstractC9179f f28951m;

    /* renamed from: n */
    private C6898em f28952n;

    /* renamed from: o */
    private volatile C9167dl f28953o;

    /* renamed from: p */
    private volatile boolean f28954p;

    /* renamed from: q */
    private AbstractC7030gi.C7040j f28955q;

    /* renamed from: r */
    private long f28956r;

    /* renamed from: s */
    private String f28957s;

    /* renamed from: t */
    private AbstractC9178e f28958t;

    /* renamed from: u */
    private AbstractC9174a f28959u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tagmanager.dm$1 */
    /* loaded from: classes2.dex */
    public class C91711 {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tagmanager.dm$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9174a {
        /* renamed from: a */
        boolean mo9032a(C9020a c9020a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.tagmanager.dm$b */
    /* loaded from: classes2.dex */
    public class C9175b implements AbstractC9063av<AbstractC6896el.C6897a> {
        private C9175b() {
        }

        /* synthetic */ C9175b(C9170dm c9170dm, C91711 c91711) {
            this();
        }

        @Override // com.google.android.gms.tagmanager.AbstractC9063av
        /* renamed from: a */
        public void mo9030a() {
        }

        @Override // com.google.android.gms.tagmanager.AbstractC9063av
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo9027a(AbstractC6896el.C6897a c6897a) {
            AbstractC7030gi.C7040j c7040j;
            if (c6897a.f23266c != null) {
                c7040j = c6897a.f23266c;
            } else {
                AbstractC7030gi.C7036f c7036f = c6897a.f23265b;
                c7040j = new AbstractC7030gi.C7040j();
                c7040j.f23783b = c7036f;
                c7040j.f23782a = null;
                c7040j.f23784c = c7036f.f23752l;
            }
            C9170dm.this.m9052a(c7040j, c6897a.f23264a, true);
        }

        @Override // com.google.android.gms.tagmanager.AbstractC9063av
        /* renamed from: a */
        public void mo9028a(AbstractC9063av.EnumC9064a enumC9064a) {
            if (!C9170dm.this.f28954p) {
                C9170dm.this.m9055a(0L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.tagmanager.dm$c */
    /* loaded from: classes2.dex */
    public class C9176c implements AbstractC9063av<AbstractC7030gi.C7040j> {
        private C9176c() {
        }

        /* synthetic */ C9176c(C9170dm c9170dm, C91711 c91711) {
            this();
        }

        @Override // com.google.android.gms.tagmanager.AbstractC9063av
        /* renamed from: a */
        public void mo9030a() {
        }

        @Override // com.google.android.gms.tagmanager.AbstractC9063av
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo9027a(AbstractC7030gi.C7040j c7040j) {
            C9170dm.this.f28950l.m9012d();
            synchronized (C9170dm.this) {
                if (c7040j.f23783b == null) {
                    if (C9170dm.this.f28955q.f23783b == null) {
                        C9065aw.m9301a("Current resource is null; network resource is also null");
                        C9170dm.this.m9055a(C9170dm.this.f28950l.m9014b());
                        return;
                    }
                    c7040j.f23783b = C9170dm.this.f28955q.f23783b;
                }
                C9170dm.this.m9052a(c7040j, C9170dm.this.f28942a.mo16434a(), false);
                C9065aw.m9295e(new StringBuilder(58).append("setting refresh time to current time: ").append(C9170dm.this.f28956r).toString());
                if (!C9170dm.this.m9034n()) {
                    C9170dm.this.m9053a(c7040j);
                }
            }
        }

        @Override // com.google.android.gms.tagmanager.AbstractC9063av
        /* renamed from: a */
        public void mo9028a(AbstractC9063av.EnumC9064a enumC9064a) {
            if (enumC9064a == AbstractC9063av.EnumC9064a.SERVER_UNAVAILABLE_ERROR) {
                C9170dm.this.f28950l.m9013c();
            }
            synchronized (C9170dm.this) {
                if (!C9170dm.this.i()) {
                    if (C9170dm.this.f28953o != null) {
                        C9170dm.this.b((C9170dm) C9170dm.this.f28953o);
                    } else {
                        C9170dm.this.b((C9170dm) C9170dm.this.mo7807b(Status.f16789d));
                    }
                }
            }
            C9170dm.this.m9055a(C9170dm.this.f28950l.m9014b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.tagmanager.dm$d */
    /* loaded from: classes2.dex */
    public class C9177d implements C9167dl.AbstractC9168a {
        private C9177d() {
        }

        /* synthetic */ C9177d(C9170dm c9170dm, C91711 c91711) {
            this();
        }

        @Override // com.google.android.gms.tagmanager.C9167dl.AbstractC9168a
        /* renamed from: a */
        public void mo9026a() {
            if (C9170dm.this.f28945d.mo9185a()) {
                C9170dm.this.m9055a(0L);
            }
        }

        @Override // com.google.android.gms.tagmanager.C9167dl.AbstractC9168a
        /* renamed from: a */
        public void mo9025a(String str) {
            C9170dm.this.m9047a(str);
        }

        @Override // com.google.android.gms.tagmanager.C9167dl.AbstractC9168a
        /* renamed from: b */
        public String mo9024b() {
            return C9170dm.this.m9036h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tagmanager.dm$e */
    /* loaded from: classes2.dex */
    public interface AbstractC9178e extends AbstractC4500k {
        /* renamed from: a */
        void mo9023a(long j, String str);

        /* renamed from: a */
        void mo9022a(AbstractC9063av<AbstractC7030gi.C7040j> abstractC9063av);

        /* renamed from: a */
        void mo9021a(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tagmanager.dm$f */
    /* loaded from: classes2.dex */
    public interface AbstractC9179f extends AbstractC4500k {
        /* renamed from: a */
        C6899en.C6903c mo9019a(int i);

        /* renamed from: a */
        void mo9020a();

        /* renamed from: a */
        void mo9018a(AbstractC6896el.C6897a c6897a);

        /* renamed from: a */
        void mo9017a(AbstractC9063av<AbstractC6896el.C6897a> abstractC9063av);
    }

    C9170dm(Context context, C9203f c9203f, Looper looper, String str, int i, AbstractC9179f abstractC9179f, AbstractC9178e abstractC9178e, C6898em c6898em, AbstractC4682e abstractC4682e, AbstractC9095bu abstractC9095bu, C9180dn c9180dn) {
        super(looper == null ? Looper.getMainLooper() : looper);
        this.f28947f = context;
        this.f28948g = c9203f;
        this.f28944c = looper == null ? Looper.getMainLooper() : looper;
        this.f28949h = str;
        this.f28946e = i;
        this.f28951m = abstractC9179f;
        this.f28958t = abstractC9178e;
        this.f28952n = c6898em;
        this.f28943b = new C9177d(this, null);
        this.f28955q = new AbstractC7030gi.C7040j();
        this.f28942a = abstractC4682e;
        this.f28945d = abstractC9095bu;
        this.f28950l = c9180dn;
        if (m9034n()) {
            m9047a(C9092bs.m9265a().m9260c());
        }
    }

    public C9170dm(Context context, C9203f c9203f, Looper looper, String str, int i, C9183dq c9183dq) {
        this(context, c9203f, looper, str, i, new C9110ce(context, str), new C9105cd(context, str, c9183dq), new C6898em(context), C4685h.m23138d(), new C9062au(1, 5, 900000L, 5000L, "refreshing", C4685h.m23138d()), new C9180dn(context, str));
        this.f28952n.m16015a(c9183dq.m9010a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m9055a(long j) {
        if (this.f28958t == null) {
            C9065aw.m9299b("Refresh requested, but no network load scheduler.");
        } else {
            this.f28958t.mo9023a(j, this.f28955q.f23784c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m9053a(AbstractC7030gi.C7040j c7040j) {
        if (this.f28951m != null) {
            AbstractC6896el.C6897a c6897a = new AbstractC6896el.C6897a();
            c6897a.f23264a = this.f28956r;
            c6897a.f23265b = new AbstractC7030gi.C7036f();
            c6897a.f23266c = c7040j;
            this.f28951m.mo9018a(c6897a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m9052a(AbstractC7030gi.C7040j c7040j, long j, boolean z) {
        if (z) {
            boolean z2 = this.f28954p;
        }
        if (!i() || this.f28953o != null) {
            this.f28955q = c7040j;
            this.f28956r = j;
            long m9016a = this.f28950l.m9016a();
            m9055a(Math.max(0L, Math.min(m9016a, (this.f28956r + m9016a) - this.f28942a.mo16434a())));
            C9020a c9020a = new C9020a(this.f28947f, this.f28948g.m8944a(), this.f28949h, j, c7040j);
            if (this.f28953o == null) {
                this.f28953o = new C9167dl(this.f28948g, this.f28944c, c9020a, this.f28943b);
            } else {
                this.f28953o.m9066a(c9020a);
            }
            if (!i() && this.f28959u.mo9032a(c9020a)) {
                b((C9170dm) this.f28953o);
            }
        }
    }

    /* renamed from: a */
    private void m9046a(final boolean z) {
        this.f28951m.mo9017a(new C9175b(this, null));
        this.f28958t.mo9022a(new C9176c(this, null));
        C6899en.C6903c mo9019a = this.f28951m.mo9019a(this.f28946e);
        if (mo9019a != null) {
            this.f28953o = new C9167dl(this.f28948g, this.f28944c, new C9020a(this.f28947f, this.f28948g.m8944a(), this.f28949h, 0L, mo9019a), this.f28943b);
        }
        this.f28959u = new AbstractC9174a() { // from class: com.google.android.gms.tagmanager.dm.3

            /* renamed from: c */
            private Long f28963c;

            /* renamed from: a */
            private long m9033a() {
                if (this.f28963c == null) {
                    this.f28963c = Long.valueOf(C9170dm.this.f28950l.m9016a());
                }
                return this.f28963c.longValue();
            }

            @Override // com.google.android.gms.tagmanager.C9170dm.AbstractC9174a
            /* renamed from: a */
            public boolean mo9032a(C9020a c9020a) {
                return z ? c9020a.m9345b() + m9033a() >= C9170dm.this.f28942a.mo16434a() : !c9020a.m9343c();
            }
        };
        if (m9034n()) {
            this.f28958t.mo9023a(0L, "");
        } else {
            this.f28951m.mo9020a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public boolean m9034n() {
        C9092bs m9265a = C9092bs.m9265a();
        return (m9265a.m9262b() == C9092bs.EnumC9093a.CONTAINER || m9265a.m9262b() == C9092bs.EnumC9093a.CONTAINER_DEBUG) && this.f28949h.equals(m9265a.m9259d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ahn
    /* renamed from: a */
    public AbstractC9069b mo7807b(Status status) {
        if (this.f28953o != null) {
            return this.f28953o;
        }
        if (status == Status.f16789d) {
            C9065aw.m9301a("timer expired: setting result to failure");
        }
        return new C9167dl(status);
    }

    /* renamed from: a */
    synchronized void m9047a(String str) {
        this.f28957s = str;
        if (this.f28958t != null) {
            this.f28958t.mo9021a(str);
        }
    }

    /* renamed from: b */
    public void m9045b() {
        C6899en.C6903c mo9019a = this.f28951m.mo9019a(this.f28946e);
        if (mo9019a != null) {
            b((C9170dm) new C9167dl(this.f28948g, this.f28944c, new C9020a(this.f28947f, this.f28948g.m8944a(), this.f28949h, 0L, mo9019a), new C9167dl.AbstractC9168a() { // from class: com.google.android.gms.tagmanager.dm.2
                @Override // com.google.android.gms.tagmanager.C9167dl.AbstractC9168a
                /* renamed from: a */
                public void mo9026a() {
                    C9065aw.m9299b("Refresh ignored: container loaded as default only.");
                }

                @Override // com.google.android.gms.tagmanager.C9167dl.AbstractC9168a
                /* renamed from: a */
                public void mo9025a(String str) {
                    C9170dm.this.m9047a(str);
                }

                @Override // com.google.android.gms.tagmanager.C9167dl.AbstractC9168a
                /* renamed from: b */
                public String mo9024b() {
                    return C9170dm.this.m9036h();
                }
            }));
        } else {
            C9065aw.m9301a("Default was requested, but no default container was found");
            b((C9170dm) mo7807b(new Status(10, "Default was requested, but no default container was found", null)));
        }
        this.f28958t = null;
        this.f28951m = null;
    }

    /* renamed from: c */
    public void m9043c() {
        m9046a(false);
    }

    /* renamed from: g */
    public void m9038g() {
        m9046a(true);
    }

    /* renamed from: h */
    synchronized String m9036h() {
        return this.f28957s;
    }
}
