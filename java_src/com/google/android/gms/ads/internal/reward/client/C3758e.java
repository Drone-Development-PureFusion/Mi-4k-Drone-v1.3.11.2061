package com.google.android.gms.ads.internal.reward.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.p226b.AbstractC3438a;
import com.google.android.gms.internal.aaa;
@aaa
/* renamed from: com.google.android.gms.ads.internal.reward.client.e */
/* loaded from: classes.dex */
public class C3758e implements AbstractC3438a {

    /* renamed from: a */
    private final AbstractC3746a f14667a;

    public C3758e(AbstractC3746a abstractC3746a) {
        this.f14667a = abstractC3746a;
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3438a
    /* renamed from: a */
    public String mo26970a() {
        if (this.f14667a == null) {
            return null;
        }
        try {
            return this.f14667a.mo18594a();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p226b.AbstractC3438a
    /* renamed from: b */
    public int mo26969b() {
        if (this.f14667a == null) {
            return 0;
        }
        try {
            return this.f14667a.mo18593b();
        } catch (RemoteException e) {
            C3784b.m26839d("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
