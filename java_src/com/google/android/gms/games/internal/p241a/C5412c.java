package com.google.android.gms.games.internal.p241a;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.C5355c;
import com.google.android.gms.games.event.AbstractC5382c;
import com.google.android.gms.games.event.C5380a;
import com.google.android.gms.games.internal.C5670d;
/* renamed from: com.google.android.gms.games.internal.a.c */
/* loaded from: classes2.dex */
public final class C5412c implements AbstractC5382c {

    /* renamed from: com.google.android.gms.games.internal.a.c$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5416a extends C5355c.AbstractC5363a<AbstractC5382c.AbstractC5383a> {
        private AbstractC5416a(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5382c.AbstractC5383a mo7807b(final Status status) {
            return new AbstractC5382c.AbstractC5383a() { // from class: com.google.android.gms.games.internal.a.c.a.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }

                @Override // com.google.android.gms.games.event.AbstractC5382c.AbstractC5383a
                /* renamed from: c */
                public C5380a mo20027c() {
                    return new C5380a(DataHolder.m23889b(14));
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.c$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5418b extends C5355c.AbstractC5363a<AbstractC4502m> {
        private AbstractC5418b(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: b */
        public AbstractC4502m mo7807b(final Status status) {
            return new AbstractC4502m() { // from class: com.google.android.gms.games.internal.a.c.b.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }
            };
        }
    }

    @Override // com.google.android.gms.games.event.AbstractC5382c
    /* renamed from: a */
    public AbstractC4494i<AbstractC5382c.AbstractC5383a> mo20421a(AbstractC4489g abstractC4489g, final boolean z) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5416a(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.c.2
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20093d(this, z);
            }
        });
    }

    @Override // com.google.android.gms.games.event.AbstractC5382c
    /* renamed from: a */
    public AbstractC4494i<AbstractC5382c.AbstractC5383a> mo20420a(AbstractC4489g abstractC4489g, final boolean z, final String... strArr) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5416a(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.c.1
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20152a(this, z, strArr);
            }
        });
    }

    @Override // com.google.android.gms.games.event.AbstractC5382c
    @SuppressLint({"MissingRemoteException"})
    /* renamed from: a */
    public void mo20422a(AbstractC4489g abstractC4489g, final String str, final int i) {
        C5670d m20505b = C5355c.m20505b(abstractC4489g, false);
        if (m20505b == null) {
            return;
        }
        if (m20505b.t()) {
            m20505b.m20144a(str, i);
        } else {
            abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5418b(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.c.3
                @Override // com.google.android.gms.internal.ahl.AbstractC6343a
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7809a(C5670d c5670d) {
                    c5670d.m20144a(str, i);
                }
            });
        }
    }
}
