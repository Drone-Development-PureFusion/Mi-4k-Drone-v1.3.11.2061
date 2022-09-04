package com.google.android.gms.games.internal.p241a;

import android.content.Intent;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.C5355c;
import com.google.android.gms.games.internal.C5670d;
import com.google.android.gms.games.quest.AbstractC5990e;
import com.google.android.gms.games.quest.AbstractC5991f;
import com.google.android.gms.games.quest.C5988c;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.internal.ahl;
/* renamed from: com.google.android.gms.games.internal.a.j */
/* loaded from: classes2.dex */
public final class C5519j implements AbstractC5991f {

    /* renamed from: com.google.android.gms.games.internal.a.j$5 */
    /* loaded from: classes2.dex */
    class C55245 extends AbstractC5530c {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20163a((ahl.AbstractC6344b<AbstractC5991f.AbstractC5994c>) this, (String) null, (String) null, (int[]) null, 0, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.j$6 */
    /* loaded from: classes2.dex */
    class C55256 extends AbstractC5530c {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20164a((ahl.AbstractC6344b<AbstractC5991f.AbstractC5994c>) this, (String) null, (String) null, false, (String[]) null);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.j$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5526a extends C5355c.AbstractC5363a<AbstractC5991f.AbstractC5992a> {
        private AbstractC5526a(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5991f.AbstractC5992a mo7807b(final Status status) {
            return new AbstractC5991f.AbstractC5992a() { // from class: com.google.android.gms.games.internal.a.j.a.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.quest.AbstractC5991f.AbstractC5992a
                /* renamed from: c */
                public Quest mo19195c() {
                    return null;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.j$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5528b extends C5355c.AbstractC5363a<AbstractC5991f.AbstractC5993b> {
        private AbstractC5528b(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5991f.AbstractC5993b mo7807b(final Status status) {
            return new AbstractC5991f.AbstractC5993b() { // from class: com.google.android.gms.games.internal.a.j.b.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.quest.AbstractC5991f.AbstractC5993b
                /* renamed from: c */
                public Milestone mo19194c() {
                    return null;
                }

                @Override // com.google.android.gms.games.quest.AbstractC5991f.AbstractC5993b
                /* renamed from: d */
                public Quest mo19193d() {
                    return null;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.j$c */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5530c extends C5355c.AbstractC5363a<AbstractC5991f.AbstractC5994c> {
        private AbstractC5530c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5991f.AbstractC5994c mo7807b(final Status status) {
            return new AbstractC5991f.AbstractC5994c() { // from class: com.google.android.gms.games.internal.a.j.c.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }

                @Override // com.google.android.gms.games.quest.AbstractC5991f.AbstractC5994c
                /* renamed from: c */
                public C5988c mo19192c() {
                    return new C5988c(DataHolder.m23889b(status.m24015i()));
                }
            };
        }
    }

    @Override // com.google.android.gms.games.quest.AbstractC5991f
    /* renamed from: a */
    public Intent mo19202a(AbstractC4489g abstractC4489g, String str) {
        return C5355c.m20511a(abstractC4489g).m20116b(str);
    }

    @Override // com.google.android.gms.games.quest.AbstractC5991f
    /* renamed from: a */
    public Intent mo19199a(AbstractC4489g abstractC4489g, int[] iArr) {
        return C5355c.m20511a(abstractC4489g).m20137a(iArr);
    }

    @Override // com.google.android.gms.games.quest.AbstractC5991f
    /* renamed from: a */
    public AbstractC4494i<AbstractC5991f.AbstractC5993b> mo19201a(AbstractC4489g abstractC4489g, final String str, final String str2) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5528b(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.j.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20126b(this, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.games.quest.AbstractC5991f
    /* renamed from: a */
    public AbstractC4494i<AbstractC5991f.AbstractC5994c> mo19200a(AbstractC4489g abstractC4489g, final boolean z, final String... strArr) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5530c(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.j.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20120b(this, z, strArr);
            }
        });
    }

    @Override // com.google.android.gms.games.quest.AbstractC5991f
    /* renamed from: a */
    public AbstractC4494i<AbstractC5991f.AbstractC5994c> mo19198a(AbstractC4489g abstractC4489g, final int[] iArr, final int i, final boolean z) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5530c(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.j.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20151a(this, iArr, i, z);
            }
        });
    }

    @Override // com.google.android.gms.games.quest.AbstractC5991f
    /* renamed from: a */
    public void mo19204a(AbstractC4489g abstractC4489g) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20045q();
        }
    }

    @Override // com.google.android.gms.games.quest.AbstractC5991f
    /* renamed from: a */
    public void mo19203a(AbstractC4489g abstractC4489g, AbstractC5990e abstractC5990e) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20103c(abstractC4489g.mo17373a((AbstractC4489g) abstractC5990e));
        }
    }

    @Override // com.google.android.gms.games.quest.AbstractC5991f
    /* renamed from: b */
    public AbstractC4494i<AbstractC5991f.AbstractC5992a> mo19197b(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5526a(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.j.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20073h(this, str);
            }
        });
    }

    @Override // com.google.android.gms.games.quest.AbstractC5991f
    /* renamed from: c */
    public void mo19196c(AbstractC4489g abstractC4489g, String str) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20102c(str);
        }
    }
}
