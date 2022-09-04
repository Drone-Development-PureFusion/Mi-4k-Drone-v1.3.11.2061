package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AbstractC3523ah;
import com.google.android.gms.ads.internal.client.AbstractC3526ai;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.C3780a;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.internal.AbstractC7839vf;
import com.google.android.gms.internal.AbstractC7842vg;
import com.google.android.gms.internal.AbstractC7845vh;
import com.google.android.gms.internal.AbstractC7848vi;
/* renamed from: com.google.android.gms.ads.internal.client.k */
/* loaded from: classes2.dex */
public class BinderC3567k extends AbstractC3526ai.AbstractBinderC3527a {

    /* renamed from: a */
    private AbstractC3520ag f14029a;

    /* renamed from: com.google.android.gms.ads.internal.client.k$a */
    /* loaded from: classes2.dex */
    private class BinderC3569a extends AbstractC3523ah.AbstractBinderC3524a {
        private BinderC3569a() {
        }

        @Override // com.google.android.gms.ads.internal.client.AbstractC3523ah
        /* renamed from: a */
        public void mo27328a(AdRequestParcel adRequestParcel) {
            C3784b.m26844b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.k.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (BinderC3567k.this.f14029a != null) {
                        try {
                            BinderC3567k.this.f14029a.mo13230a(1);
                        } catch (RemoteException e) {
                            C3784b.m26839d("Could not notify onAdFailedToLoad event.", e);
                        }
                    }
                }
            });
        }

        @Override // com.google.android.gms.ads.internal.client.AbstractC3523ah
        /* renamed from: a */
        public boolean mo27329a() {
            return false;
        }

        @Override // com.google.android.gms.ads.internal.client.AbstractC3523ah
        /* renamed from: b */
        public String mo27324b() {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public AbstractC3523ah mo27313a() {
        return new BinderC3569a();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public void mo27312a(AbstractC3520ag abstractC3520ag) {
        this.f14029a = abstractC3520ag;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public void mo27311a(AbstractC3544ao abstractC3544ao) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public void mo27310a(NativeAdOptionsParcel nativeAdOptionsParcel) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public void mo27309a(AbstractC7839vf abstractC7839vf) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public void mo27308a(AbstractC7842vg abstractC7842vg) {
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public void mo27307a(String str, AbstractC7848vi abstractC7848vi, AbstractC7845vh abstractC7845vh) {
    }
}
