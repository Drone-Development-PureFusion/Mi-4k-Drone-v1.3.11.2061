package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.AbstractC3749b;
import com.google.android.gms.ads.internal.reward.client.AbstractC3752c;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.common.internal.C4612q;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.p232c.AbstractC4175h;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.ads.internal.reward.client.f */
/* loaded from: classes.dex */
public class C3759f extends AbstractC4175h<AbstractC3752c> {
    public C3759f() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* renamed from: a */
    public AbstractC3749b m26968a(Context context, AbstractC8005xq abstractC8005xq) {
        try {
            return AbstractC3749b.AbstractBinderC3750a.m26974a(b(context).mo26972a(BinderC4173f.m25293a(context), abstractC8005xq, C4612q.f17087a));
        } catch (RemoteException | AbstractC4175h.C4176a e) {
            C3784b.m26839d("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.p232c.AbstractC4175h
    /* renamed from: a */
    public AbstractC3752c mo9613b(IBinder iBinder) {
        return AbstractC3752c.AbstractBinderC3753a.m26973a(iBinder);
    }
}
