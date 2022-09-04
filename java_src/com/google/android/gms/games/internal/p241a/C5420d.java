package com.google.android.gms.games.internal.p241a;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AbstractC5376e;
import com.google.android.gms.games.C5311a;
import com.google.android.gms.games.C5355c;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.internal.C5670d;
/* renamed from: com.google.android.gms.games.internal.a.d */
/* loaded from: classes2.dex */
public final class C5420d implements AbstractC5376e {

    /* renamed from: com.google.android.gms.games.internal.a.d$2 */
    /* loaded from: classes2.dex */
    class C54222 extends AbstractC5424a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20065j(this, (String) null);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.d$3 */
    /* loaded from: classes2.dex */
    class C54233 extends AbstractC5426b {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20061k(this, (String) null);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.d$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5424a extends C5355c.AbstractC5363a<AbstractC5376e.AbstractC5377a> {
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5376e.AbstractC5377a mo7807b(final Status status) {
            return new AbstractC5376e.AbstractC5377a() { // from class: com.google.android.gms.games.internal.a.d.a.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.d$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5426b extends C5355c.AbstractC5363a<AbstractC5376e.AbstractC5378b> {
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5376e.AbstractC5378b mo7807b(final Status status) {
            return new AbstractC5376e.AbstractC5378b() { // from class: com.google.android.gms.games.internal.a.d.b.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.d$c */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5428c extends C5355c.AbstractC5363a<AbstractC5376e.AbstractC5379c> {
        private AbstractC5428c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5376e.AbstractC5379c mo7807b(final Status status) {
            return new AbstractC5376e.AbstractC5379c() { // from class: com.google.android.gms.games.internal.a.d.c.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }

                @Override // com.google.android.gms.games.AbstractC5376e.AbstractC5379c
                /* renamed from: c */
                public C5311a mo20022c() {
                    return new C5311a(DataHolder.m23889b(14));
                }
            };
        }
    }

    @Override // com.google.android.gms.games.AbstractC5376e
    /* renamed from: a */
    public Game mo20415a(AbstractC4489g abstractC4489g) {
        return C5355c.m20511a(abstractC4489g).m20067j();
    }

    @Override // com.google.android.gms.games.AbstractC5376e
    /* renamed from: b */
    public AbstractC4494i<AbstractC5376e.AbstractC5379c> mo20414b(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5428c(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.d.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20133b(this);
            }
        });
    }
}
