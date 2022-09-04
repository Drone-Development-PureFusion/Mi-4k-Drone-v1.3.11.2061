package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.internal.AbstractC8085yz;
/* loaded from: classes.dex */
public class InAppPurchaseActivity extends Activity {

    /* renamed from: a */
    public static final String f14825a = "com.google.android.gms.ads.purchase.InAppPurchaseActivity";

    /* renamed from: b */
    public static final String f14826b = "InAppPurchaseActivity";

    /* renamed from: c */
    private AbstractC8085yz f14827c;

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            if (this.f14827c != null) {
                this.f14827c.mo12848a(i, i2, intent);
            }
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward onActivityResult to in-app purchase manager:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14827c = C3514ac.m27584b().m27630a((Activity) this);
        if (this.f14827c == null) {
            C3784b.m26840d("Could not create in-app purchase manager.");
            finish();
            return;
        }
        try {
            this.f14827c.mo12849a();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward onCreate to in-app purchase manager:", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            if (this.f14827c != null) {
                this.f14827c.mo12847b();
            }
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward onDestroy to in-app purchase manager:", e);
        }
        super.onDestroy();
    }
}
