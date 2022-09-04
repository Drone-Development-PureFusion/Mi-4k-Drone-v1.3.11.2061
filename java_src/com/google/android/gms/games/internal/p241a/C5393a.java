package com.google.android.gms.games.internal.p241a;

import android.content.Intent;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.C5355c;
import com.google.android.gms.games.achievement.AbstractC5335c;
import com.google.android.gms.games.achievement.C5333a;
import com.google.android.gms.games.internal.C5670d;
import com.google.android.gms.internal.ahl;
/* renamed from: com.google.android.gms.games.internal.a.a */
/* loaded from: classes2.dex */
public final class C5393a implements AbstractC5335c {

    /* renamed from: com.google.android.gms.games.internal.a.a$2 */
    /* loaded from: classes2.dex */
    class C53962 extends AbstractC5404a {
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20123b((ahl.AbstractC6344b<AbstractC5335c.AbstractC5336a>) this, (String) null, (String) null, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.a$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5404a extends C5355c.AbstractC5363a<AbstractC5335c.AbstractC5336a> {
        private AbstractC5404a(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5335c.AbstractC5336a mo7807b(final Status status) {
            return new AbstractC5335c.AbstractC5336a() { // from class: com.google.android.gms.games.internal.a.a.a.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }

                @Override // com.google.android.gms.games.achievement.AbstractC5335c.AbstractC5336a
                /* renamed from: c */
                public C5333a mo20028c() {
                    return new C5333a(DataHolder.m23889b(14));
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.a$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5406b extends C5355c.AbstractC5363a<AbstractC5335c.AbstractC5337b> {

        /* renamed from: a */
        private final String f19567a;

        public AbstractC5406b(String str, AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
            this.f19567a = str;
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5335c.AbstractC5337b mo7807b(final Status status) {
            return new AbstractC5335c.AbstractC5337b() { // from class: com.google.android.gms.games.internal.a.a.b.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.achievement.AbstractC5335c.AbstractC5337b
                /* renamed from: b */
                public String mo20000b() {
                    return AbstractC5406b.this.f19567a;
                }
            };
        }
    }

    @Override // com.google.android.gms.games.achievement.AbstractC5335c
    /* renamed from: a */
    public Intent mo20447a(AbstractC4489g abstractC4489g) {
        return C5355c.m20511a(abstractC4489g).m20059l();
    }

    @Override // com.google.android.gms.games.achievement.AbstractC5335c
    /* renamed from: a */
    public AbstractC4494i<AbstractC5335c.AbstractC5336a> mo20444a(AbstractC4489g abstractC4489g, final boolean z) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5404a(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.a.1
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20105c(this, z);
            }
        });
    }

    @Override // com.google.android.gms.games.achievement.AbstractC5335c
    /* renamed from: a */
    public void mo20446a(AbstractC4489g abstractC4489g, final String str) {
        abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5406b(str, abstractC4489g) { // from class: com.google.android.gms.games.internal.a.a.3
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20177a((ahl.AbstractC6344b<AbstractC5335c.AbstractC5337b>) null, str);
            }
        });
    }

    @Override // com.google.android.gms.games.achievement.AbstractC5335c
    /* renamed from: a */
    public void mo20445a(AbstractC4489g abstractC4489g, final String str, final int i) {
        abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5406b(str, abstractC4489g) { // from class: com.google.android.gms.games.internal.a.a.7
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20176a((ahl.AbstractC6344b<AbstractC5335c.AbstractC5337b>) null, str, i);
            }
        });
    }

    @Override // com.google.android.gms.games.achievement.AbstractC5335c
    /* renamed from: b */
    public AbstractC4494i<AbstractC5335c.AbstractC5337b> mo20443b(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5406b(str, abstractC4489g) { // from class: com.google.android.gms.games.internal.a.a.4
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20177a(this, str);
            }
        });
    }

    @Override // com.google.android.gms.games.achievement.AbstractC5335c
    /* renamed from: b */
    public AbstractC4494i<AbstractC5335c.AbstractC5337b> mo20442b(AbstractC4489g abstractC4489g, final String str, final int i) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5406b(str, abstractC4489g) { // from class: com.google.android.gms.games.internal.a.a.8
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20176a(this, str, i);
            }
        });
    }

    @Override // com.google.android.gms.games.achievement.AbstractC5335c
    /* renamed from: c */
    public void mo20441c(AbstractC4489g abstractC4489g, final String str) {
        abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5406b(str, abstractC4489g) { // from class: com.google.android.gms.games.internal.a.a.5
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20130b((ahl.AbstractC6344b<AbstractC5335c.AbstractC5337b>) null, str);
            }
        });
    }

    @Override // com.google.android.gms.games.achievement.AbstractC5335c
    /* renamed from: c */
    public void mo20440c(AbstractC4489g abstractC4489g, final String str, final int i) {
        abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5406b(str, abstractC4489g) { // from class: com.google.android.gms.games.internal.a.a.9
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20129b((ahl.AbstractC6344b<AbstractC5335c.AbstractC5337b>) null, str, i);
            }
        });
    }

    @Override // com.google.android.gms.games.achievement.AbstractC5335c
    /* renamed from: d */
    public AbstractC4494i<AbstractC5335c.AbstractC5337b> mo20439d(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5406b(str, abstractC4489g) { // from class: com.google.android.gms.games.internal.a.a.6
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20130b(this, str);
            }
        });
    }

    @Override // com.google.android.gms.games.achievement.AbstractC5335c
    /* renamed from: d */
    public AbstractC4494i<AbstractC5335c.AbstractC5337b> mo20438d(AbstractC4489g abstractC4489g, final String str, final int i) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5406b(str, abstractC4489g) { // from class: com.google.android.gms.games.internal.a.a.10
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20129b(this, str, i);
            }
        });
    }
}
