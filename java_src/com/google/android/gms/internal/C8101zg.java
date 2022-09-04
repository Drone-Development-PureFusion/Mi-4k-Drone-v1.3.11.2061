package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.purchase.AbstractC3820c;
@aaa
/* renamed from: com.google.android.gms.internal.zg */
/* loaded from: classes.dex */
public class C8101zg implements AbstractC3820c {

    /* renamed from: a */
    private final AbstractC8093zc f26450a;

    public C8101zg(AbstractC8093zc abstractC8093zc) {
        this.f26450a = abstractC8093zc;
    }

    @Override // com.google.android.gms.ads.purchase.AbstractC3820c
    /* renamed from: a */
    public String mo12833a() {
        try {
            return this.f26450a.mo12841b();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward getProductId to InAppPurchaseResult", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.purchase.AbstractC3820c
    /* renamed from: b */
    public Intent mo12832b() {
        try {
            return this.f26450a.mo12840c();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward getPurchaseData to InAppPurchaseResult", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.purchase.AbstractC3820c
    /* renamed from: c */
    public int mo12831c() {
        try {
            return this.f26450a.mo12839d();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward getPurchaseData to InAppPurchaseResult", e);
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.purchase.AbstractC3820c
    /* renamed from: d */
    public boolean mo12830d() {
        try {
            return this.f26450a.mo12842a();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward isVerified to InAppPurchaseResult", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.purchase.AbstractC3820c
    /* renamed from: e */
    public void mo12829e() {
        try {
            this.f26450a.mo12838e();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward finishPurchase to InAppPurchaseResult", e);
        }
    }
}
