package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AbstractC3547ap;
import com.google.android.gms.ads.internal.client.AbstractC3550b;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.common.internal.C4612q;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.p232c.AbstractC4175h;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.ads.internal.client.j */
/* loaded from: classes.dex */
public class C3566j extends AbstractC4175h<AbstractC3550b> {
    public C3566j() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* renamed from: a */
    public AbstractC3547ap m27438a(Context context) {
        try {
            return AbstractC3547ap.AbstractBinderC3548a.m27564a(b(context).mo27562a(BinderC4173f.m25293a(context), C4612q.f17087a));
        } catch (RemoteException e) {
            C3784b.m26839d("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (AbstractC4175h.C4176a e2) {
            C3784b.m26839d("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.p232c.AbstractC4175h
    /* renamed from: a */
    public AbstractC3550b mo9613b(IBinder iBinder) {
        return AbstractC3550b.AbstractBinderC3551a.m27563a(iBinder);
    }
}
