package com.google.android.gms.nearby.internal.connection.dev;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.nearby.internal.connection.dev.AbstractC8810u;
import com.xiaomi.market.sdk.C10445j;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.k */
/* loaded from: classes2.dex */
public final class C8789k extends AbstractC4638w<AbstractC8810u> {

    /* renamed from: a */
    private final long f28154a = hashCode();

    public C8789k(Context context, Looper looper, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 54, c4626s, abstractC4491b, abstractC4492c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC8810u mo7440b(IBinder iBinder) {
        return AbstractC8810u.AbstractBinderC8811a.m10024a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: c */
    public Bundle mo9367c() {
        Bundle bundle = new Bundle();
        bundle.putLong(C10445j.f32455aa, this.f28154a);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: f */
    public void mo9828f() {
        if (t()) {
            try {
                ((AbstractC8810u) G()).mo10020a(new ClientDisconnectingParams());
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        super.f();
    }
}
