package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import com.google.android.gms.auth.api.C3984a;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.internal.ahl;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.auth.api.credentials.internal.f */
/* loaded from: classes2.dex */
public abstract class AbstractC4023f<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, C4024g> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4023f(AbstractC4489g abstractC4489g) {
        super(C3984a.f15358e, abstractC4489g);
    }

    /* renamed from: a */
    protected abstract void mo25730a(Context context, AbstractC4030k abstractC4030k);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ahl.AbstractC6343a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public final void mo7809a(C4024g c4024g) {
        mo25730a(c4024g.B(), (AbstractC4030k) c4024g.G());
    }
}
