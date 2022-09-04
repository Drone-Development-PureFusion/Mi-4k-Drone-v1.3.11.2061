package com.google.android.gms.games.internal.p241a;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.C5355c;
import com.google.android.gms.games.internal.C5670d;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.turnbased.AbstractC5964b;
import com.google.android.gms.games.multiplayer.turnbased.AbstractC5966d;
import com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g;
import com.google.android.gms.games.multiplayer.turnbased.C5963a;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import java.util.List;
/* renamed from: com.google.android.gms.games.internal.a.p */
/* loaded from: classes2.dex */
public final class C5583p implements AbstractC5971g {

    /* renamed from: com.google.android.gms.games.internal.a.p$3 */
    /* loaded from: classes2.dex */
    class C55903 extends AbstractC5599b {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20108c(this, (String) null, (String) null);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.p$4 */
    /* loaded from: classes2.dex */
    class C55914 extends AbstractC5599b {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20095d(this, (String) null, (String) null);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.p$5 */
    /* loaded from: classes2.dex */
    class C55925 extends AbstractC5605e {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20173a(this, (String) null, 0, (int[]) null);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.p$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5597a extends C5355c.AbstractC5363a<AbstractC5971g.AbstractC5972a> {

        /* renamed from: a */
        private final String f19762a;

        public AbstractC5597a(String str, AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
            this.f19762a = str;
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5971g.AbstractC5972a mo7807b(final Status status) {
            return new AbstractC5971g.AbstractC5972a() { // from class: com.google.android.gms.games.internal.a.p.a.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g.AbstractC5972a
                /* renamed from: b */
                public String mo19275b() {
                    return AbstractC5597a.this.f19762a;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.p$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5599b extends C5355c.AbstractC5363a<AbstractC5971g.AbstractC5973b> {
        private AbstractC5599b(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5971g.AbstractC5973b mo7807b(final Status status) {
            return new AbstractC5971g.AbstractC5973b() { // from class: com.google.android.gms.games.internal.a.p.b.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g.AbstractC5973b
                /* renamed from: c */
                public TurnBasedMatch mo19274c() {
                    return null;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.p$c */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5601c extends C5355c.AbstractC5363a<AbstractC5971g.AbstractC5974c> {
        private AbstractC5601c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5971g.AbstractC5974c mo7807b(final Status status) {
            return new AbstractC5971g.AbstractC5974c() { // from class: com.google.android.gms.games.internal.a.p.c.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g.AbstractC5974c
                /* renamed from: c */
                public TurnBasedMatch mo19273c() {
                    return null;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.p$d */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5603d extends C5355c.AbstractC5363a<AbstractC5971g.AbstractC5975d> {
        private AbstractC5603d(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5971g.AbstractC5975d mo7807b(final Status status) {
            return new AbstractC5971g.AbstractC5975d() { // from class: com.google.android.gms.games.internal.a.p.d.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g.AbstractC5975d
                /* renamed from: c */
                public TurnBasedMatch mo19272c() {
                    return null;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.p$e */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5605e extends C5355c.AbstractC5363a<AbstractC5971g.AbstractC5976e> {
        private AbstractC5605e(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5971g.AbstractC5976e mo7807b(final Status status) {
            return new AbstractC5971g.AbstractC5976e() { // from class: com.google.android.gms.games.internal.a.p.e.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }

                @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g.AbstractC5976e
                /* renamed from: c */
                public C5963a mo19271c() {
                    return new C5963a(new Bundle());
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.p$f */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5607f extends C5355c.AbstractC5363a<AbstractC5971g.AbstractC5977f> {
        private AbstractC5607f(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5971g.AbstractC5977f mo7807b(final Status status) {
            return new AbstractC5971g.AbstractC5977f() { // from class: com.google.android.gms.games.internal.a.p.f.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g.AbstractC5977f
                /* renamed from: c */
                public TurnBasedMatch mo19270c() {
                    return null;
                }
            };
        }
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public Intent mo19299a(AbstractC4489g abstractC4489g) {
        return C5355c.m20511a(abstractC4489g).m20055m();
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public Intent mo19298a(AbstractC4489g abstractC4489g, int i, int i2) {
        return C5355c.m20511a(abstractC4489g).m20205a(i, i2, true);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public Intent mo19297a(AbstractC4489g abstractC4489g, int i, int i2, boolean z) {
        return C5355c.m20511a(abstractC4489g).m20205a(i, i2, z);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public AbstractC4494i<AbstractC5971g.AbstractC5976e> mo19296a(AbstractC4489g abstractC4489g, final int i, final int[] iArr) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5605e(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.p.13
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20183a(this, i, iArr);
            }
        });
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public AbstractC4494i<AbstractC5971g.AbstractC5973b> mo19294a(AbstractC4489g abstractC4489g, final AbstractC5966d abstractC5966d) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5599b(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.p.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20180a(this, abstractC5966d);
            }
        });
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public AbstractC4494i<AbstractC5971g.AbstractC5973b> mo19293a(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5599b(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.p.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20110c(this, str);
            }
        });
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public AbstractC4494i<AbstractC5971g.AbstractC5974c> mo19292a(AbstractC4489g abstractC4489g, final String str, final String str2) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5601c(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.p.11
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20171a(this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public AbstractC4494i<AbstractC5971g.AbstractC5977f> mo19291a(AbstractC4489g abstractC4489g, String str, byte[] bArr, String str2) {
        return mo19289a(abstractC4489g, str, bArr, str2, (ParticipantResult[]) null);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public AbstractC4494i<AbstractC5971g.AbstractC5977f> mo19290a(AbstractC4489g abstractC4489g, String str, byte[] bArr, String str2, List<ParticipantResult> list) {
        return mo19289a(abstractC4489g, str, bArr, str2, list == null ? null : (ParticipantResult[]) list.toArray(new ParticipantResult[list.size()]));
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public AbstractC4494i<AbstractC5971g.AbstractC5977f> mo19289a(AbstractC4489g abstractC4489g, final String str, final byte[] bArr, final String str2, final ParticipantResult... participantResultArr) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5607f(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.p.8
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20158a(this, str, bArr, str2, participantResultArr);
            }
        });
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public AbstractC4494i<AbstractC5971g.AbstractC5977f> mo19288a(AbstractC4489g abstractC4489g, String str, byte[] bArr, List<ParticipantResult> list) {
        return mo19287a(abstractC4489g, str, bArr, list == null ? null : (ParticipantResult[]) list.toArray(new ParticipantResult[list.size()]));
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public AbstractC4494i<AbstractC5971g.AbstractC5977f> mo19287a(AbstractC4489g abstractC4489g, final String str, final byte[] bArr, final ParticipantResult... participantResultArr) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5607f(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.p.9
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20157a(this, str, bArr, participantResultArr);
            }
        });
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public AbstractC4494i<AbstractC5971g.AbstractC5976e> mo19286a(AbstractC4489g abstractC4489g, int[] iArr) {
        return mo19296a(abstractC4489g, 0, iArr);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: a */
    public void mo19295a(AbstractC4489g abstractC4489g, AbstractC5964b abstractC5964b) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20118b(abstractC4489g.mo17373a((AbstractC4489g) abstractC5964b));
        }
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: b */
    public AbstractC4494i<AbstractC5971g.AbstractC5973b> mo19284b(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5599b(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.p.7
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20097d(this, str);
            }
        });
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: b */
    public void mo19285b(AbstractC4489g abstractC4489g) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20047p();
        }
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: c */
    public int mo19283c(AbstractC4489g abstractC4489g) {
        return C5355c.m20511a(abstractC4489g).m20216N();
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: c */
    public void mo19282c(AbstractC4489g abstractC4489g, String str) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20101c(str, 1);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: d */
    public void mo19281d(AbstractC4489g abstractC4489g, String str) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20115b(str, 1);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: e */
    public AbstractC4494i<AbstractC5971g.AbstractC5977f> mo19280e(AbstractC4489g abstractC4489g, String str) {
        return mo19287a(abstractC4489g, str, (byte[]) null, (ParticipantResult[]) null);
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: f */
    public AbstractC4494i<AbstractC5971g.AbstractC5974c> mo19279f(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5601c(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.p.10
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20089e(this, str);
            }
        });
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: g */
    public AbstractC4494i<AbstractC5971g.AbstractC5972a> mo19278g(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5597a(str, abstractC4489g) { // from class: com.google.android.gms.games.internal.a.p.12
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20083f(this, str);
            }
        });
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: h */
    public void mo19277h(AbstractC4489g abstractC4489g, String str) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20145a(str);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g
    /* renamed from: i */
    public AbstractC4494i<AbstractC5971g.AbstractC5975d> mo19276i(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5603d(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.p.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20078g(this, str);
            }
        });
    }
}
