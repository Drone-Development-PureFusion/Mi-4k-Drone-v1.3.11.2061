package com.google.android.gms.games.internal.p241a;

import android.content.Intent;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.C5355c;
import com.google.android.gms.games.internal.C5670d;
import com.google.android.gms.games.multiplayer.AbstractC5940c;
import com.google.android.gms.games.multiplayer.AbstractC5943e;
import com.google.android.gms.games.multiplayer.C5938a;
/* renamed from: com.google.android.gms.games.internal.a.e */
/* loaded from: classes2.dex */
public final class C5430e implements AbstractC5940c {

    /* renamed from: com.google.android.gms.games.internal.a.e$2 */
    /* loaded from: classes2.dex */
    class C54322 extends AbstractC5434a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20082f(this, (String) null, 0);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.e$3 */
    /* loaded from: classes2.dex */
    class C54333 extends AbstractC5434a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20053m(this, null);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.e$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5434a extends C5355c.AbstractC5363a<AbstractC5940c.AbstractC5941a> {
        private AbstractC5434a(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5940c.AbstractC5941a mo7807b(final Status status) {
            return new AbstractC5940c.AbstractC5941a() { // from class: com.google.android.gms.games.internal.a.e.a.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }

                @Override // com.google.android.gms.games.multiplayer.AbstractC5940c.AbstractC5941a
                /* renamed from: c */
                public C5938a mo19455c() {
                    return new C5938a(DataHolder.m23889b(14));
                }
            };
        }
    }

    @Override // com.google.android.gms.games.multiplayer.AbstractC5940c
    /* renamed from: a */
    public Intent mo19460a(AbstractC4489g abstractC4489g) {
        return C5355c.m20511a(abstractC4489g).m20052n();
    }

    @Override // com.google.android.gms.games.multiplayer.AbstractC5940c
    /* renamed from: a */
    public AbstractC4494i<AbstractC5940c.AbstractC5941a> mo19459a(AbstractC4489g abstractC4489g, final int i) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5434a(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.e.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20187a(this, i);
            }
        });
    }

    @Override // com.google.android.gms.games.multiplayer.AbstractC5940c
    /* renamed from: a */
    public void mo19458a(AbstractC4489g abstractC4489g, AbstractC5943e abstractC5943e) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20149a(abstractC4489g.mo17373a((AbstractC4489g) abstractC5943e));
        }
    }

    @Override // com.google.android.gms.games.multiplayer.AbstractC5940c
    /* renamed from: b */
    public void mo19457b(AbstractC4489g abstractC4489g) {
        C5670d m20507a = C5355c.m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20049o();
        }
    }

    @Override // com.google.android.gms.games.multiplayer.AbstractC5940c
    /* renamed from: c */
    public AbstractC4494i<AbstractC5940c.AbstractC5941a> mo19456c(AbstractC4489g abstractC4489g) {
        return mo19459a(abstractC4489g, 0);
    }
}
