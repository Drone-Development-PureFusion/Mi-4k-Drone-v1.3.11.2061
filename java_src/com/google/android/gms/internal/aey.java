package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.auth.api.C3990b;
import com.google.android.gms.auth.api.proxy.AbstractC4036b;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ahl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class aey extends ahl.AbstractC6343a<AbstractC4036b.AbstractC4037a, aev> {
    public aey(AbstractC4489g abstractC4489g) {
        super(C3990b.f15370b, abstractC4489g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ahn
    /* renamed from: a */
    public AbstractC4036b.AbstractC4037a mo7807b(Status status) {
        return new afa(status);
    }

    /* renamed from: a */
    protected abstract void mo17822a(Context context, aex aexVar);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ahl.AbstractC6343a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public final void mo7809a(aev aevVar) {
        mo17822a(aevVar.B(), (aex) aevVar.G());
    }
}
