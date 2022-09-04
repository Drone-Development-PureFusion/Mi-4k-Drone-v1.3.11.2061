package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.internal.AbstractC8085yz;
import com.google.android.gms.internal.AbstractC8089za;
import com.google.android.gms.p232c.AbstractC4175h;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.internal.zf */
/* loaded from: classes.dex */
public final class C8100zf extends AbstractC4175h<AbstractC8089za> {
    public C8100zf() {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    /* renamed from: a */
    public AbstractC8085yz m12835a(Activity activity) {
        try {
            return AbstractC8085yz.AbstractBinderC8086a.m12850a(b(activity).mo12844a(BinderC4173f.m25293a(activity)));
        } catch (RemoteException e) {
            C3784b.m26839d("Could not create remote InAppPurchaseManager.", e);
            return null;
        } catch (AbstractC4175h.C4176a e2) {
            C3784b.m26839d("Could not create remote InAppPurchaseManager.", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.p232c.AbstractC4175h
    /* renamed from: a */
    public AbstractC8089za mo9613b(IBinder iBinder) {
        return AbstractC8089za.AbstractBinderC8090a.m12845a(iBinder);
    }
}
