package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.AbstractC3749b;
import com.google.android.gms.ads.internal.reward.client.AbstractC3755d;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.util.client.C3780a;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.ads.internal.client.o */
/* loaded from: classes2.dex */
public class BinderC3575o extends AbstractC3749b.AbstractBinderC3750a {

    /* renamed from: a */
    private AbstractC3755d f14034a;

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: a */
    public void mo18592a() {
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: a */
    public void mo18591a(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel) {
        C3784b.m26844b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.o.1
            @Override // java.lang.Runnable
            public void run() {
                if (BinderC3575o.this.f14034a != null) {
                    try {
                        BinderC3575o.this.f14034a.mo13239a(1);
                    } catch (RemoteException e) {
                        C3784b.m26839d("Could not notify onRewardedVideoAdFailedToLoad event.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: a */
    public void mo18590a(AbstractC3755d abstractC3755d) {
        this.f14034a = abstractC3755d;
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: a */
    public void mo18589a(AbstractC4170e abstractC4170e) {
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: a */
    public void mo18588a(String str) {
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: b */
    public void mo18586b(AbstractC4170e abstractC4170e) {
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: b */
    public boolean mo18587b() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: c */
    public void mo18585c() {
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: c */
    public void mo18584c(AbstractC4170e abstractC4170e) {
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: d */
    public void mo18583d() {
    }

    @Override // com.google.android.gms.ads.internal.reward.client.AbstractC3749b
    /* renamed from: e */
    public void mo18582e() {
    }
}
