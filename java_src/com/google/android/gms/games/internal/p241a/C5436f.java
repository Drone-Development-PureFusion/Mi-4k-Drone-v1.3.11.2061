package com.google.android.gms.games.internal.p241a;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.C5355c;
import com.google.android.gms.games.internal.C5670d;
import com.google.android.gms.games.internal.C5906h;
import com.google.android.gms.games.p240a.AbstractC5312a;
import com.google.android.gms.games.p240a.AbstractC5316e;
import com.google.android.gms.games.p240a.AbstractC5326m;
import com.google.android.gms.games.p240a.C5313b;
import com.google.android.gms.games.p240a.C5317f;
import com.google.android.gms.games.p240a.C5331n;
import com.google.android.gms.internal.ahl;
/* renamed from: com.google.android.gms.games.internal.a.f */
/* loaded from: classes2.dex */
public final class C5436f implements AbstractC5326m {

    /* renamed from: com.google.android.gms.games.internal.a.f$10 */
    /* loaded from: classes2.dex */
    class C543810 extends AbstractC5448a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20094d((ahl.AbstractC6344b<AbstractC5326m.AbstractC5327a>) this, (String) null, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.f$11 */
    /* loaded from: classes2.dex */
    class C543911 extends AbstractC5448a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20165a((ahl.AbstractC6344b<AbstractC5326m.AbstractC5327a>) this, (String) null, (String) null, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.f$2 */
    /* loaded from: classes2.dex */
    class C54402 extends AbstractC5452c {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20168a(this, null, null, 0, 0, 0, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.f$3 */
    /* loaded from: classes2.dex */
    class C54413 extends AbstractC5452c {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20125b(this, null, null, 0, 0, 0, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.f$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5448a extends C5355c.AbstractC5363a<AbstractC5326m.AbstractC5327a> {
        private AbstractC5448a(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5326m.AbstractC5327a mo7807b(final Status status) {
            return new AbstractC5326m.AbstractC5327a() { // from class: com.google.android.gms.games.internal.a.f.a.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }

                @Override // com.google.android.gms.games.p240a.AbstractC5326m.AbstractC5327a
                /* renamed from: c */
                public C5313b mo20030c() {
                    return new C5313b(DataHolder.m23889b(14));
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.f$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5450b extends C5355c.AbstractC5363a<AbstractC5326m.AbstractC5328b> {
        private AbstractC5450b(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5326m.AbstractC5328b mo7807b(final Status status) {
            return new AbstractC5326m.AbstractC5328b() { // from class: com.google.android.gms.games.internal.a.f.b.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.p240a.AbstractC5326m.AbstractC5328b
                /* renamed from: c */
                public AbstractC5316e mo20021c() {
                    return null;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.f$c */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5452c extends C5355c.AbstractC5363a<AbstractC5326m.AbstractC5329c> {
        private AbstractC5452c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5326m.AbstractC5329c mo7807b(final Status status) {
            return new AbstractC5326m.AbstractC5329c() { // from class: com.google.android.gms.games.internal.a.f.c.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }

                @Override // com.google.android.gms.games.p240a.AbstractC5326m.AbstractC5329c
                /* renamed from: c */
                public AbstractC5312a mo20020c() {
                    return null;
                }

                @Override // com.google.android.gms.games.p240a.AbstractC5326m.AbstractC5329c
                /* renamed from: d */
                public C5317f mo20019d() {
                    return new C5317f(DataHolder.m23889b(14));
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.f$d */
    /* loaded from: classes2.dex */
    protected static abstract class AbstractC5454d extends C5355c.AbstractC5363a<AbstractC5326m.AbstractC5330d> {
        protected AbstractC5454d(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5326m.AbstractC5330d mo7807b(final Status status) {
            return new AbstractC5326m.AbstractC5330d() { // from class: com.google.android.gms.games.internal.a.f.d.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }

                @Override // com.google.android.gms.games.p240a.AbstractC5326m.AbstractC5330d
                /* renamed from: c */
                public C5331n mo20002c() {
                    return new C5331n(DataHolder.m23889b(14));
                }
            };
        }
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: a */
    public Intent mo20403a(AbstractC4489g abstractC4489g) {
        return C5355c.m20511a(abstractC4489g).m20063k();
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: a */
    public Intent mo20401a(AbstractC4489g abstractC4489g, String str) {
        return mo20400a(abstractC4489g, str, -1);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: a */
    public Intent mo20400a(AbstractC4489g abstractC4489g, String str, int i) {
        return mo20399a(abstractC4489g, str, i, -1);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: a */
    public Intent mo20399a(AbstractC4489g abstractC4489g, String str, int i, int i2) {
        return C5355c.m20511a(abstractC4489g).m20143a(str, i, i2);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: a */
    public AbstractC4494i<AbstractC5326m.AbstractC5329c> mo20402a(AbstractC4489g abstractC4489g, final C5317f c5317f, final int i, final int i2) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5452c(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.f.8
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20181a(this, c5317f, i, i2);
            }
        });
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: a */
    public AbstractC4494i<AbstractC5326m.AbstractC5329c> mo20398a(AbstractC4489g abstractC4489g, String str, int i, int i2, int i3) {
        return mo20397a(abstractC4489g, str, i, i2, i3, false);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: a */
    public AbstractC4494i<AbstractC5326m.AbstractC5329c> mo20397a(AbstractC4489g abstractC4489g, final String str, final int i, final int i2, final int i3, final boolean z) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5452c(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.f.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20175a(this, str, i, i2, i3, z);
            }
        });
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: a */
    public AbstractC4494i<AbstractC5326m.AbstractC5327a> mo20394a(AbstractC4489g abstractC4489g, final String str, final boolean z) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5448a(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.f.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20122b(this, str, z);
            }
        });
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: a */
    public AbstractC4494i<AbstractC5326m.AbstractC5327a> mo20393a(AbstractC4489g abstractC4489g, final boolean z) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5448a(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.f.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20121b(this, z);
            }
        });
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: a */
    public void mo20396a(AbstractC4489g abstractC4489g, String str, long j) {
        mo20395a(abstractC4489g, str, j, (String) null);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: a */
    public void mo20395a(AbstractC4489g abstractC4489g, String str, long j, String str2) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            try {
                m20507a.m20172a((ahl.AbstractC6344b<AbstractC5326m.AbstractC5330d>) null, str, j, str2);
            } catch (RemoteException e) {
                C5906h.m19940a("LeaderboardsImpl", "service died");
            }
        }
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: b */
    public AbstractC4494i<AbstractC5326m.AbstractC5328b> mo20392b(AbstractC4489g abstractC4489g, final String str, final int i, final int i2) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5450b(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.f.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20170a(this, (String) null, str, i, i2);
            }
        });
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: b */
    public AbstractC4494i<AbstractC5326m.AbstractC5329c> mo20391b(AbstractC4489g abstractC4489g, String str, int i, int i2, int i3) {
        return mo20390b(abstractC4489g, str, i, i2, i3, false);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: b */
    public AbstractC4494i<AbstractC5326m.AbstractC5329c> mo20390b(AbstractC4489g abstractC4489g, final String str, final int i, final int i2, final int i3, final boolean z) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5452c(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.f.7
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20128b(this, str, i, i2, i3, z);
            }
        });
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: b */
    public AbstractC4494i<AbstractC5326m.AbstractC5330d> mo20389b(AbstractC4489g abstractC4489g, String str, long j) {
        return mo20388b(abstractC4489g, str, j, (String) null);
    }

    @Override // com.google.android.gms.games.p240a.AbstractC5326m
    /* renamed from: b */
    public AbstractC4494i<AbstractC5326m.AbstractC5330d> mo20388b(AbstractC4489g abstractC4489g, final String str, final long j, final String str2) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5454d(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.f.9
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20172a(this, str, j, str2);
            }
        });
    }
}
