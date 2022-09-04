package com.google.android.gms.games.internal.p241a;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.C5355c;
import com.google.android.gms.games.internal.C5670d;
import com.google.android.gms.games.stats.AbstractC6028c;
import com.google.android.gms.games.stats.PlayerStats;
/* renamed from: com.google.android.gms.games.internal.a.o */
/* loaded from: classes2.dex */
public final class C5579o implements AbstractC6028c {

    /* renamed from: com.google.android.gms.games.internal.a.o$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5581a extends C5355c.AbstractC5363a<AbstractC6028c.AbstractC6029a> {
        private AbstractC5581a(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC6028c.AbstractC6029a mo7807b(final Status status) {
            return new AbstractC6028c.AbstractC6029a() { // from class: com.google.android.gms.games.internal.a.o.a.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }

                @Override // com.google.android.gms.games.stats.AbstractC6028c.AbstractC6029a
                /* renamed from: c */
                public PlayerStats mo19026c() {
                    return null;
                }
            };
        }
    }

    @Override // com.google.android.gms.games.stats.AbstractC6028c
    /* renamed from: a */
    public AbstractC4494i<AbstractC6028c.AbstractC6029a> mo19027a(AbstractC4489g abstractC4489g, final boolean z) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5581a(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.o.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20086e(this, z);
            }
        });
    }
}
