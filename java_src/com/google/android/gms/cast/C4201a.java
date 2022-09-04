package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.internal.AbstractC4418b;
import com.google.android.gms.cast.internal.AbstractC4433i;
import com.google.android.gms.cast.internal.C4423e;
import com.google.android.gms.cast.internal.C4439l;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahl;
import java.io.IOException;
/* renamed from: com.google.android.gms.cast.a */
/* loaded from: classes2.dex */
public final class C4201a {

    /* renamed from: a */
    public static final int f16021a = 65536;

    /* renamed from: b */
    public static final int f16022b = 128;

    /* renamed from: c */
    public static final int f16023c = -1;

    /* renamed from: d */
    public static final int f16024d = 0;

    /* renamed from: e */
    public static final int f16025e = 1;

    /* renamed from: f */
    public static final int f16026f = -1;

    /* renamed from: g */
    public static final int f16027g = 0;

    /* renamed from: h */
    public static final int f16028h = 1;

    /* renamed from: i */
    public static final String f16029i = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";

    /* renamed from: j */
    static final C4467a.AbstractC4473b<C4423e, C4213c> f16030j = new C4467a.AbstractC4473b<C4423e, C4213c>() { // from class: com.google.android.gms.cast.a.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C4423e mo7438a(Context context, Looper looper, C4626s c4626s, C4213c c4213c, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            C4588d.m23626a(c4213c, "Setting the API options is required.");
            return new C4423e(context, looper, c4626s, c4213c.f16049a, c4213c.f16051c, c4213c.f16050b, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: k */
    public static final C4467a<C4213c> f16031k = new C4467a<>("Cast.API", f16030j, C4439l.f16660a);

    /* renamed from: l */
    public static final AbstractC4204b f16032l = new AbstractC4204b.C4205a();

    /* renamed from: com.google.android.gms.cast.a$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4203a extends AbstractC4502m {
        /* renamed from: b */
        ApplicationMetadata mo24217b();

        /* renamed from: c */
        String mo24216c();

        /* renamed from: d */
        String mo24215d();

        /* renamed from: e */
        boolean mo24214e();
    }

    /* renamed from: com.google.android.gms.cast.a$b */
    /* loaded from: classes.dex */
    public interface AbstractC4204b {

        /* renamed from: com.google.android.gms.cast.a$b$a */
        /* loaded from: classes.dex */
        public static final class C4205a implements AbstractC4204b {
            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: a */
            public AbstractC4494i<AbstractC4203a> mo24954a(AbstractC4489g abstractC4489g, final String str) {
                return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4217f(abstractC4489g) { // from class: com.google.android.gms.cast.a.b.a.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.android.gms.cast.C4201a.AbstractC4217f, com.google.android.gms.internal.ahl.AbstractC6343a
                    /* renamed from: a */
                    public void mo7809a(C4423e c4423e) {
                        try {
                            c4423e.m24242a(str, false, (ahl.AbstractC6344b<AbstractC4203a>) this);
                        } catch (IllegalStateException e) {
                            a(2001);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: a */
            public AbstractC4494i<AbstractC4203a> mo24953a(AbstractC4489g abstractC4489g, final String str, final LaunchOptions launchOptions) {
                return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4217f(abstractC4489g) { // from class: com.google.android.gms.cast.a.b.a.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.android.gms.cast.C4201a.AbstractC4217f, com.google.android.gms.internal.ahl.AbstractC6343a
                    /* renamed from: a */
                    public void mo7809a(C4423e c4423e) {
                        try {
                            c4423e.m24247a(str, launchOptions, this);
                        } catch (IllegalStateException e) {
                            a(2001);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: a */
            public AbstractC4494i<Status> mo24951a(AbstractC4489g abstractC4489g, final String str, final String str2) {
                return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4433i(abstractC4489g) { // from class: com.google.android.gms.cast.a.b.a.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.android.gms.cast.internal.AbstractC4433i, com.google.android.gms.internal.ahl.AbstractC6343a
                    /* renamed from: a */
                    public void mo7809a(C4423e c4423e) {
                        try {
                            c4423e.m24243a(str, str2, this);
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            a(2001);
                        }
                    }
                });
            }

            /* renamed from: a */
            public AbstractC4494i<AbstractC4203a> m24950a(AbstractC4489g abstractC4489g, final String str, final String str2, final JoinOptions joinOptions) {
                return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4217f(abstractC4489g) { // from class: com.google.android.gms.cast.a.b.a.4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.android.gms.cast.C4201a.AbstractC4217f, com.google.android.gms.internal.ahl.AbstractC6343a
                    /* renamed from: a */
                    public void mo7809a(C4423e c4423e) {
                        try {
                            c4423e.m24244a(str, str2, joinOptions, this);
                        } catch (IllegalStateException e) {
                            a(2001);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            @Deprecated
            /* renamed from: a */
            public AbstractC4494i<AbstractC4203a> mo24949a(AbstractC4489g abstractC4489g, String str, boolean z) {
                return mo24953a(abstractC4489g, str, new LaunchOptions.C4195a().m25152a(z).m25154a());
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: a */
            public void mo24956a(AbstractC4489g abstractC4489g) {
                try {
                    ((C4423e) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4439l.f16660a)).m24228i();
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: a */
            public void mo24955a(AbstractC4489g abstractC4489g, double d) {
                try {
                    ((C4423e) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4439l.f16660a)).m24259a(d);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: a */
            public void mo24952a(AbstractC4489g abstractC4489g, String str, AbstractC4216e abstractC4216e) {
                try {
                    ((C4423e) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4439l.f16660a)).m24246a(str, abstractC4216e);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: a */
            public void mo24948a(AbstractC4489g abstractC4489g, boolean z) {
                try {
                    ((C4423e) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4439l.f16660a)).m24241a(z);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: b */
            public AbstractC4494i<AbstractC4203a> mo24947b(AbstractC4489g abstractC4489g) {
                return m24950a(abstractC4489g, null, null, null);
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: b */
            public AbstractC4494i<AbstractC4203a> mo24946b(AbstractC4489g abstractC4489g, String str) {
                return m24950a(abstractC4489g, str, null, null);
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: b */
            public AbstractC4494i<AbstractC4203a> mo24945b(AbstractC4489g abstractC4489g, String str, String str2) {
                return m24950a(abstractC4489g, str, str2, null);
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: c */
            public AbstractC4494i<Status> mo24944c(AbstractC4489g abstractC4489g) {
                return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4433i(abstractC4489g) { // from class: com.google.android.gms.cast.a.b.a.5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.android.gms.cast.internal.AbstractC4433i, com.google.android.gms.internal.ahl.AbstractC6343a
                    /* renamed from: a */
                    public void mo7809a(C4423e c4423e) {
                        try {
                            c4423e.m24249a(this);
                        } catch (IllegalStateException e) {
                            a(2001);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: c */
            public AbstractC4494i<Status> mo24943c(AbstractC4489g abstractC4489g, final String str) {
                return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4433i(abstractC4489g) { // from class: com.google.android.gms.cast.a.b.a.7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.android.gms.cast.internal.AbstractC4433i, com.google.android.gms.internal.ahl.AbstractC6343a
                    /* renamed from: a */
                    public void mo7809a(C4423e c4423e) {
                        if (TextUtils.isEmpty(str)) {
                            a(2001, "IllegalArgument: sessionId cannot be null or empty");
                            return;
                        }
                        try {
                            c4423e.m24245a(str, this);
                        } catch (IllegalStateException e) {
                            a(2001);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: d */
            public AbstractC4494i<Status> mo24942d(AbstractC4489g abstractC4489g) {
                return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC4433i(abstractC4489g) { // from class: com.google.android.gms.cast.a.b.a.6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.android.gms.cast.internal.AbstractC4433i, com.google.android.gms.internal.ahl.AbstractC6343a
                    /* renamed from: a */
                    public void mo7809a(C4423e c4423e) {
                        try {
                            c4423e.m24245a("", this);
                        } catch (IllegalStateException e) {
                            a(2001);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: d */
            public void mo24941d(AbstractC4489g abstractC4489g, String str) {
                try {
                    ((C4423e) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4439l.f16660a)).m24248a(str);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: e */
            public double mo24940e(AbstractC4489g abstractC4489g) {
                return ((C4423e) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4439l.f16660a)).m24227j();
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: f */
            public boolean mo24939f(AbstractC4489g abstractC4489g) {
                return ((C4423e) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4439l.f16660a)).m24226k();
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: g */
            public int mo24938g(AbstractC4489g abstractC4489g) {
                return ((C4423e) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4439l.f16660a)).m24225l();
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: h */
            public int mo24937h(AbstractC4489g abstractC4489g) {
                return ((C4423e) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4439l.f16660a)).m24224m();
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: i */
            public ApplicationMetadata mo24936i(AbstractC4489g abstractC4489g) {
                return ((C4423e) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4439l.f16660a)).m24223n();
            }

            @Override // com.google.android.gms.cast.C4201a.AbstractC4204b
            /* renamed from: j */
            public String mo24935j(AbstractC4489g abstractC4489g) {
                return ((C4423e) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4439l.f16660a)).m24222o();
            }
        }

        /* renamed from: a */
        AbstractC4494i<AbstractC4203a> mo24954a(AbstractC4489g abstractC4489g, String str);

        /* renamed from: a */
        AbstractC4494i<AbstractC4203a> mo24953a(AbstractC4489g abstractC4489g, String str, LaunchOptions launchOptions);

        /* renamed from: a */
        AbstractC4494i<Status> mo24951a(AbstractC4489g abstractC4489g, String str, String str2);

        @Deprecated
        /* renamed from: a */
        AbstractC4494i<AbstractC4203a> mo24949a(AbstractC4489g abstractC4489g, String str, boolean z);

        /* renamed from: a */
        void mo24956a(AbstractC4489g abstractC4489g);

        /* renamed from: a */
        void mo24955a(AbstractC4489g abstractC4489g, double d);

        /* renamed from: a */
        void mo24952a(AbstractC4489g abstractC4489g, String str, AbstractC4216e abstractC4216e);

        /* renamed from: a */
        void mo24948a(AbstractC4489g abstractC4489g, boolean z);

        /* renamed from: b */
        AbstractC4494i<AbstractC4203a> mo24947b(AbstractC4489g abstractC4489g);

        /* renamed from: b */
        AbstractC4494i<AbstractC4203a> mo24946b(AbstractC4489g abstractC4489g, String str);

        /* renamed from: b */
        AbstractC4494i<AbstractC4203a> mo24945b(AbstractC4489g abstractC4489g, String str, String str2);

        /* renamed from: c */
        AbstractC4494i<Status> mo24944c(AbstractC4489g abstractC4489g);

        /* renamed from: c */
        AbstractC4494i<Status> mo24943c(AbstractC4489g abstractC4489g, String str);

        /* renamed from: d */
        AbstractC4494i<Status> mo24942d(AbstractC4489g abstractC4489g);

        /* renamed from: d */
        void mo24941d(AbstractC4489g abstractC4489g, String str);

        /* renamed from: e */
        double mo24940e(AbstractC4489g abstractC4489g);

        /* renamed from: f */
        boolean mo24939f(AbstractC4489g abstractC4489g);

        /* renamed from: g */
        int mo24938g(AbstractC4489g abstractC4489g);

        /* renamed from: h */
        int mo24937h(AbstractC4489g abstractC4489g);

        /* renamed from: i */
        ApplicationMetadata mo24936i(AbstractC4489g abstractC4489g);

        /* renamed from: j */
        String mo24935j(AbstractC4489g abstractC4489g);
    }

    /* renamed from: com.google.android.gms.cast.a$c */
    /* loaded from: classes.dex */
    public static final class C4213c implements C4467a.AbstractC4468a.AbstractC4469a {

        /* renamed from: a */
        final CastDevice f16049a;

        /* renamed from: b */
        final C4215d f16050b;

        /* renamed from: c */
        private final int f16051c;

        /* renamed from: com.google.android.gms.cast.a$c$a */
        /* loaded from: classes2.dex */
        public static final class C4214a {

            /* renamed from: a */
            CastDevice f16052a;

            /* renamed from: b */
            C4215d f16053b;

            /* renamed from: c */
            private int f16054c = 0;

            public C4214a(CastDevice castDevice, C4215d c4215d) {
                C4588d.m23626a(castDevice, "CastDevice parameter cannot be null");
                C4588d.m23626a(c4215d, "CastListener parameter cannot be null");
                this.f16052a = castDevice;
                this.f16053b = c4215d;
            }

            /* renamed from: a */
            public C4214a m24930a(boolean z) {
                if (z) {
                    this.f16054c |= 1;
                } else {
                    this.f16054c &= -2;
                }
                return this;
            }

            /* renamed from: a */
            public C4213c m24932a() {
                return new C4213c(this);
            }
        }

        private C4213c(C4214a c4214a) {
            this.f16049a = c4214a.f16052a;
            this.f16050b = c4214a.f16053b;
            this.f16051c = c4214a.f16054c;
        }

        @Deprecated
        /* renamed from: a */
        public static C4214a m24934a(CastDevice castDevice, C4215d c4215d) {
            return new C4214a(castDevice, c4215d);
        }
    }

    /* renamed from: com.google.android.gms.cast.a$d */
    /* loaded from: classes2.dex */
    public static class C4215d {
        /* renamed from: a */
        public void mo24823a() {
        }

        /* renamed from: a */
        public void mo24822a(int i) {
        }

        /* renamed from: a */
        public void mo24821a(ApplicationMetadata applicationMetadata) {
        }

        /* renamed from: b */
        public void mo17693b() {
        }

        /* renamed from: b */
        public void mo24820b(int i) {
        }

        /* renamed from: c */
        public void mo24819c(int i) {
        }
    }

    /* renamed from: com.google.android.gms.cast.a$e */
    /* loaded from: classes.dex */
    public interface AbstractC4216e {
        /* renamed from: a */
        void mo17637a(CastDevice castDevice, String str, String str2);
    }

    /* renamed from: com.google.android.gms.cast.a$f */
    /* loaded from: classes2.dex */
    static abstract class AbstractC4217f extends AbstractC4418b<AbstractC4203a> {
        public AbstractC4217f(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC4203a mo7807b(final Status status) {
            return new AbstractC4203a() { // from class: com.google.android.gms.cast.a.f.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.cast.C4201a.AbstractC4203a
                /* renamed from: b */
                public ApplicationMetadata mo24217b() {
                    return null;
                }

                @Override // com.google.android.gms.cast.C4201a.AbstractC4203a
                /* renamed from: c */
                public String mo24216c() {
                    return null;
                }

                @Override // com.google.android.gms.cast.C4201a.AbstractC4203a
                /* renamed from: d */
                public String mo24215d() {
                    return null;
                }

                @Override // com.google.android.gms.cast.C4201a.AbstractC4203a
                /* renamed from: e */
                public boolean mo24214e() {
                    return false;
                }
            };
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a */
        public void mo7809a(C4423e c4423e) {
        }
    }

    private C4201a() {
    }
}
