package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7944wu;
import com.google.android.gms.internal.acr;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.wx */
/* loaded from: classes.dex */
public class C7957wx {

    /* renamed from: a */
    private final Object f26161a;

    /* renamed from: b */
    private final Context f26162b;

    /* renamed from: c */
    private final String f26163c;

    /* renamed from: d */
    private final VersionInfoParcel f26164d;

    /* renamed from: e */
    private aca<AbstractC7944wu> f26165e;

    /* renamed from: f */
    private aca<AbstractC7944wu> f26166f;
    @Nullable

    /* renamed from: g */
    private C7974d f26167g;

    /* renamed from: h */
    private int f26168h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.wx$1 */
    /* loaded from: classes2.dex */
    public class RunnableC79581 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7667ro f26169a;

        /* renamed from: b */
        final /* synthetic */ C7974d f26170b;

        /* renamed from: com.google.android.gms.internal.wx$1$1 */
        /* loaded from: classes2.dex */
        class C79591 implements AbstractC7944wu.AbstractC7945a {

            /* renamed from: a */
            final /* synthetic */ AbstractC7944wu f26172a;

            C79591(AbstractC7944wu abstractC7944wu) {
                this.f26172a = abstractC7944wu;
            }

            @Override // com.google.android.gms.internal.AbstractC7944wu.AbstractC7945a
            /* renamed from: a */
            public void mo13136a() {
                abv.f21039a.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.wx.1.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (C7957wx.this.f26161a) {
                            if (RunnableC79581.this.f26170b.b() == -1 || RunnableC79581.this.f26170b.b() == 1) {
                                return;
                            }
                            RunnableC79581.this.f26170b.a();
                            C3779u.m26890e().m18348a(new Runnable() { // from class: com.google.android.gms.internal.wx.1.1.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    C79591.this.f26172a.mo13159a();
                                }
                            });
                            abr.m18409e("Could not receive loaded message in a timely manner. Rejecting.");
                        }
                    }
                }, C7968a.f26189b);
            }
        }

        RunnableC79581(C7667ro c7667ro, C7974d c7974d) {
            this.f26169a = c7667ro;
            this.f26170b = c7974d;
        }

        @Override // java.lang.Runnable
        public void run() {
            final AbstractC7944wu m13149a = C7957wx.this.m13149a(C7957wx.this.f26162b, C7957wx.this.f26164d, this.f26169a);
            m13149a.mo13157a(new C79591(m13149a));
            m13149a.a("/jsLoaded", new AbstractC7877vt() { // from class: com.google.android.gms.internal.wx.1.2
                @Override // com.google.android.gms.internal.AbstractC7877vt
                /* renamed from: a */
                public void mo12713a(acy acyVar, Map<String, String> map) {
                    synchronized (C7957wx.this.f26161a) {
                        if (RunnableC79581.this.f26170b.b() == -1 || RunnableC79581.this.f26170b.b() == 1) {
                            return;
                        }
                        C7957wx.this.f26168h = 0;
                        C7957wx.this.f26165e.mo12761a(m13149a);
                        RunnableC79581.this.f26170b.a((C7974d) m13149a);
                        C7957wx.this.f26167g = RunnableC79581.this.f26170b;
                        abr.m18409e("Successfully loaded JS Engine.");
                    }
                }
            });
            final aci aciVar = new aci();
            AbstractC7877vt abstractC7877vt = new AbstractC7877vt() { // from class: com.google.android.gms.internal.wx.1.3
                @Override // com.google.android.gms.internal.AbstractC7877vt
                /* renamed from: a */
                public void mo12713a(acy acyVar, Map<String, String> map) {
                    synchronized (C7957wx.this.f26161a) {
                        abr.c("JS Engine is requesting an update");
                        if (C7957wx.this.f26168h == 0) {
                            abr.c("Starting reload.");
                            C7957wx.this.f26168h = 2;
                            C7957wx.this.m13148a(RunnableC79581.this.f26169a);
                        }
                        m13149a.b("/requestReload", (AbstractC7877vt) aciVar.m18221a());
                    }
                }
            };
            aciVar.m18220a(abstractC7877vt);
            m13149a.a("/requestReload", abstractC7877vt);
            if (C7957wx.this.f26163c.endsWith(".js")) {
                m13149a.mo13154a(C7957wx.this.f26163c);
            } else if (C7957wx.this.f26163c.startsWith("<html>")) {
                m13149a.mo13151c(C7957wx.this.f26163c);
            } else {
                m13149a.mo13152b(C7957wx.this.f26163c);
            }
            abv.f21039a.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.wx.1.4
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (C7957wx.this.f26161a) {
                        if (RunnableC79581.this.f26170b.b() == -1 || RunnableC79581.this.f26170b.b() == 1) {
                            return;
                        }
                        RunnableC79581.this.f26170b.a();
                        C3779u.m26890e().m18348a(new Runnable() { // from class: com.google.android.gms.internal.wx.1.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                m13149a.mo13159a();
                            }
                        });
                        abr.m18409e("Could not receive loaded message in a timely manner. Rejecting.");
                    }
                }
            }, C7968a.f26188a);
        }
    }

    /* renamed from: com.google.android.gms.internal.wx$a */
    /* loaded from: classes2.dex */
    static class C7968a {

        /* renamed from: a */
        static int f26188a = 60000;

        /* renamed from: b */
        static int f26189b = 10000;
    }

    /* renamed from: com.google.android.gms.internal.wx$b */
    /* loaded from: classes2.dex */
    public static class C7969b<T> implements aca<T> {
        @Override // com.google.android.gms.internal.aca
        /* renamed from: a */
        public void mo12761a(T t) {
        }
    }

    /* renamed from: com.google.android.gms.internal.wx$c */
    /* loaded from: classes2.dex */
    public static class C7970c extends acs<AbstractC7980wy> {

        /* renamed from: d */
        private final Object f26190d = new Object();

        /* renamed from: e */
        private final C7974d f26191e;

        /* renamed from: f */
        private boolean f26192f;

        public C7970c(C7974d c7974d) {
            this.f26191e = c7974d;
        }

        /* renamed from: v_ */
        public void m13133v_() {
            synchronized (this.f26190d) {
                if (this.f26192f) {
                    return;
                }
                this.f26192f = true;
                a(new acr.AbstractC6193c<AbstractC7980wy>() { // from class: com.google.android.gms.internal.wx.c.1
                    @Override // com.google.android.gms.internal.acr.AbstractC6193c
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo12764a(AbstractC7980wy abstractC7980wy) {
                        abr.m18409e("Ending javascript session.");
                        ((AbstractC7983xa) abstractC7980wy).mo13114a();
                    }
                }, new acr.C6192b());
                a(new acr.AbstractC6193c<AbstractC7980wy>() { // from class: com.google.android.gms.internal.wx.c.2
                    @Override // com.google.android.gms.internal.acr.AbstractC6193c
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo12764a(AbstractC7980wy abstractC7980wy) {
                        abr.m18409e("Releasing engine reference.");
                        C7970c.this.f26191e.m13126x_();
                    }
                }, new acr.AbstractC6191a() { // from class: com.google.android.gms.internal.wx.c.3
                    @Override // com.google.android.gms.internal.acr.AbstractC6191a
                    /* renamed from: a */
                    public void mo12763a() {
                        C7970c.this.f26191e.m13126x_();
                    }
                });
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.wx$d */
    /* loaded from: classes2.dex */
    public static class C7974d extends acs<AbstractC7944wu> {

        /* renamed from: e */
        private aca<AbstractC7944wu> f26197e;

        /* renamed from: d */
        private final Object f26196d = new Object();

        /* renamed from: f */
        private boolean f26198f = false;

        /* renamed from: g */
        private int f26199g = 0;

        public C7974d(aca<AbstractC7944wu> acaVar) {
            this.f26197e = acaVar;
        }

        /* renamed from: c */
        public void m13129c() {
            boolean z = true;
            synchronized (this.f26196d) {
                if (this.f26199g < 0) {
                    z = false;
                }
                C4588d.m23623a(z);
                abr.m18409e("Releasing root reference. JS Engine will be destroyed once other references are released.");
                this.f26198f = true;
                m13128d();
            }
        }

        /* renamed from: d */
        protected void m13128d() {
            synchronized (this.f26196d) {
                C4588d.m23623a(this.f26199g >= 0);
                if (!this.f26198f || this.f26199g != 0) {
                    abr.m18409e("There are still references to the engine. Not destroying.");
                } else {
                    abr.m18409e("No reference is left (including root). Cleaning up engine.");
                    a(new acr.AbstractC6193c<AbstractC7944wu>() { // from class: com.google.android.gms.internal.wx.d.3
                        @Override // com.google.android.gms.internal.acr.AbstractC6193c
                        /* renamed from: a  reason: avoid collision after fix types in other method */
                        public void mo12764a(final AbstractC7944wu abstractC7944wu) {
                            C3779u.m26890e().m18348a(new Runnable() { // from class: com.google.android.gms.internal.wx.d.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    C7974d.this.f26197e.mo12761a(abstractC7944wu);
                                    abstractC7944wu.mo13159a();
                                }
                            });
                        }
                    }, new acr.C6192b());
                }
            }
        }

        /* renamed from: w_ */
        public C7970c m13127w_() {
            final C7970c c7970c = new C7970c(this);
            synchronized (this.f26196d) {
                a(new acr.AbstractC6193c<AbstractC7944wu>() { // from class: com.google.android.gms.internal.wx.d.1
                    @Override // com.google.android.gms.internal.acr.AbstractC6193c
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo12764a(AbstractC7944wu abstractC7944wu) {
                        abr.m18409e("Getting a new session for JS Engine.");
                        c7970c.a((C7970c) abstractC7944wu.mo13153b());
                    }
                }, new acr.AbstractC6191a() { // from class: com.google.android.gms.internal.wx.d.2
                    @Override // com.google.android.gms.internal.acr.AbstractC6191a
                    /* renamed from: a */
                    public void mo12763a() {
                        abr.m18409e("Rejecting reference for JS Engine.");
                        c7970c.a();
                    }
                });
                C4588d.m23623a(this.f26199g >= 0);
                this.f26199g++;
            }
            return c7970c;
        }

        /* renamed from: x_ */
        protected void m13126x_() {
            boolean z = true;
            synchronized (this.f26196d) {
                if (this.f26199g < 1) {
                    z = false;
                }
                C4588d.m23623a(z);
                abr.m18409e("Releasing 1 reference for JS Engine");
                this.f26199g--;
                m13128d();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.wx$e */
    /* loaded from: classes2.dex */
    public static class C7979e extends acs<AbstractC7980wy> {

        /* renamed from: d */
        private C7970c f26207d;

        public C7979e(C7970c c7970c) {
            this.f26207d = c7970c;
        }

        @Override // com.google.android.gms.internal.acs
        /* renamed from: a */
        public void mo13123a() {
            this.f26207d.a();
        }

        @Override // com.google.android.gms.internal.acs, com.google.android.gms.internal.acr
        /* renamed from: a */
        public void mo13122a(acr.AbstractC6193c<AbstractC7980wy> abstractC6193c, acr.AbstractC6191a abstractC6191a) {
            this.f26207d.a(abstractC6193c, abstractC6191a);
        }

        @Override // com.google.android.gms.internal.acs, com.google.android.gms.internal.acr
        /* renamed from: a */
        public void mo13120a(AbstractC7980wy abstractC7980wy) {
            this.f26207d.a((C7970c) abstractC7980wy);
        }

        @Override // com.google.android.gms.internal.acs
        /* renamed from: b */
        public int mo13119b() {
            return this.f26207d.b();
        }

        public void finalize() {
            this.f26207d.m13133v_();
            this.f26207d = null;
        }
    }

    public C7957wx(Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.f26161a = new Object();
        this.f26168h = 1;
        this.f26163c = str;
        this.f26162b = context.getApplicationContext();
        this.f26164d = versionInfoParcel;
        this.f26165e = new C7969b();
        this.f26166f = new C7969b();
    }

    public C7957wx(Context context, VersionInfoParcel versionInfoParcel, String str, aca<AbstractC7944wu> acaVar, aca<AbstractC7944wu> acaVar2) {
        this(context, versionInfoParcel, str);
        this.f26165e = acaVar;
        this.f26166f = acaVar2;
    }

    /* renamed from: c */
    private C7974d m13142c(@Nullable C7667ro c7667ro) {
        C7974d c7974d = new C7974d(this.f26166f);
        C3779u.m26890e().m18348a(new RunnableC79581(c7667ro, c7974d));
        return c7974d;
    }

    /* renamed from: a */
    protected AbstractC7944wu m13149a(Context context, VersionInfoParcel versionInfoParcel, @Nullable C7667ro c7667ro) {
        return new C7950ww(context, versionInfoParcel, c7667ro, null);
    }

    /* renamed from: a */
    public C7970c m13150a() {
        return m13144b((C7667ro) null);
    }

    /* renamed from: a */
    protected C7974d m13148a(@Nullable C7667ro c7667ro) {
        final C7974d m13142c = m13142c(c7667ro);
        m13142c.a(new acr.AbstractC6193c<AbstractC7944wu>() { // from class: com.google.android.gms.internal.wx.2
            @Override // com.google.android.gms.internal.acr.AbstractC6193c
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo12764a(AbstractC7944wu abstractC7944wu) {
                synchronized (C7957wx.this.f26161a) {
                    C7957wx.this.f26168h = 0;
                    if (C7957wx.this.f26167g != null && m13142c != C7957wx.this.f26167g) {
                        abr.m18409e("New JS engine is loaded, marking previous one as destroyable.");
                        C7957wx.this.f26167g.m13129c();
                    }
                    C7957wx.this.f26167g = m13142c;
                }
            }
        }, new acr.AbstractC6191a() { // from class: com.google.android.gms.internal.wx.3
            @Override // com.google.android.gms.internal.acr.AbstractC6191a
            /* renamed from: a */
            public void mo12763a() {
                synchronized (C7957wx.this.f26161a) {
                    C7957wx.this.f26168h = 1;
                    abr.m18409e("Failed loading new engine. Marking new engine destroyable.");
                    m13142c.m13129c();
                }
            }
        });
        return m13142c;
    }

    /* renamed from: b */
    public C7970c m13144b(@Nullable C7667ro c7667ro) {
        C7970c m13127w_;
        synchronized (this.f26161a) {
            if (this.f26167g == null || this.f26167g.b() == -1) {
                this.f26168h = 2;
                this.f26167g = m13148a(c7667ro);
                m13127w_ = this.f26167g.m13127w_();
            } else if (this.f26168h == 0) {
                m13127w_ = this.f26167g.m13127w_();
            } else if (this.f26168h == 1) {
                this.f26168h = 2;
                m13148a(c7667ro);
                m13127w_ = this.f26167g.m13127w_();
            } else {
                m13127w_ = this.f26168h == 2 ? this.f26167g.m13127w_() : this.f26167g.m13127w_();
            }
        }
        return m13127w_;
    }
}
