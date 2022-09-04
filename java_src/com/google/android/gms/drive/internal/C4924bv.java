package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.drive.AbstractC4803c;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.C4894br;
import com.google.android.gms.internal.ail;
/* renamed from: com.google.android.gms.drive.internal.bv */
/* loaded from: classes2.dex */
public class C4924bv extends C4939c implements AbstractC4808e {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.drive.internal.bv$a */
    /* loaded from: classes2.dex */
    public static class C4926a implements AbstractC4808e.AbstractC4809a {

        /* renamed from: a */
        private final ail<AbstractC4808e.AbstractC4809a> f17914a;

        public C4926a(ail<AbstractC4808e.AbstractC4809a> ailVar) {
            this.f17914a = ailVar;
        }

        @Override // com.google.android.gms.drive.AbstractC4808e.AbstractC4809a
        /* renamed from: a */
        public void mo22402a(final long j, final long j2) {
            this.f17914a.m17214a(new ail.AbstractC6386c<AbstractC4808e.AbstractC4809a>() { // from class: com.google.android.gms.drive.internal.bv.a.1
                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a */
                public void mo7919a() {
                }

                @Override // com.google.android.gms.internal.ail.AbstractC6386c
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7917a(AbstractC4808e.AbstractC4809a abstractC4809a) {
                    abstractC4809a.mo22402a(j, j2);
                }
            });
        }
    }

    public C4924bv(DriveId driveId) {
        super(driveId);
    }

    /* renamed from: a */
    private static AbstractC4808e.AbstractC4809a m22404a(AbstractC4489g abstractC4489g, AbstractC4808e.AbstractC4809a abstractC4809a) {
        if (abstractC4809a == null) {
            return null;
        }
        return new C4926a(abstractC4489g.mo17373a((AbstractC4489g) abstractC4809a));
    }

    @Override // com.google.android.gms.drive.AbstractC4808e
    /* renamed from: a */
    public AbstractC4494i<AbstractC4803c.AbstractC4804a> mo22405a(AbstractC4489g abstractC4489g, final int i, AbstractC4808e.AbstractC4809a abstractC4809a) {
        if (i == 268435456 || i == 536870912 || i == 805306368) {
            final AbstractC4808e.AbstractC4809a m22404a = m22404a(abstractC4489g, abstractC4809a);
            return abstractC4489g.mo17255a((AbstractC4489g) new C4894br.AbstractC4903c(abstractC4489g) { // from class: com.google.android.gms.drive.internal.bv.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.ahl.AbstractC6343a
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo7809a(C4913bt c4913bt) {
                    a(c4913bt.m22433i().mo22302a(new OpenContentsRequest(C4924bv.this.a(), i, 0), new BinderC4855ak(this, m22404a)).m22619a());
                }
            });
        }
        throw new IllegalArgumentException("Invalid mode provided.");
    }
}
