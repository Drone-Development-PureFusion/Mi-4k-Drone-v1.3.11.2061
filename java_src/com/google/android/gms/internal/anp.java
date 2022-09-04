package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.AbstractC8922a;
import com.google.android.gms.plus.C8943c;
import com.google.android.gms.plus.internal.C8968e;
/* loaded from: classes2.dex */
public final class anp implements AbstractC8922a {

    /* renamed from: com.google.android.gms.internal.anp$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC6647a extends C8943c.AbstractC8947b<Status> {
        private AbstractC6647a(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }
    }

    @Override // com.google.android.gms.plus.AbstractC8922a
    @SuppressLint({"MissingRemoteException"})
    /* renamed from: a */
    public AbstractC4494i<Status> mo9718a(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC6647a(abstractC4489g) { // from class: com.google.android.gms.internal.anp.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8968e c8968e) {
                c8968e.m9627b(this);
            }
        });
    }

    @Override // com.google.android.gms.plus.AbstractC8922a
    /* renamed from: b */
    public void mo9717b(AbstractC4489g abstractC4489g) {
        C8968e m9707a = C8943c.m9707a(abstractC4489g, false);
        if (m9707a != null) {
            m9707a.m9623j();
        }
    }

    @Override // com.google.android.gms.plus.AbstractC8922a
    /* renamed from: c */
    public String mo9716c(AbstractC4489g abstractC4489g) {
        return C8943c.m9707a(abstractC4489g, true).m9625h();
    }
}
