package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.purchase.AbstractC3818a;
@aaa
/* renamed from: com.google.android.gms.internal.zh */
/* loaded from: classes.dex */
public class C8102zh implements AbstractC3818a {

    /* renamed from: e */
    private final AbstractC8079yx f26451e;

    public C8102zh(AbstractC8079yx abstractC8079yx) {
        this.f26451e = abstractC8079yx;
    }

    @Override // com.google.android.gms.ads.purchase.AbstractC3818a
    /* renamed from: a */
    public String mo12828a() {
        try {
            return this.f26451e.mo12854a();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward getProductId to InAppPurchase", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.purchase.AbstractC3818a
    /* renamed from: a */
    public void mo12827a(int i) {
        try {
            this.f26451e.mo12853b(i);
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward recordResolution to InAppPurchase", e);
        }
    }

    @Override // com.google.android.gms.ads.purchase.AbstractC3818a
    /* renamed from: b */
    public void mo12826b(int i) {
        try {
            this.f26451e.mo12852c(i);
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward recordPlayBillingResolution to InAppPurchase", e);
        }
    }
}
