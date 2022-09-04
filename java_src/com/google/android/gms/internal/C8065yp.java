package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.internal.AbstractC8066yq;
import com.google.android.gms.internal.AbstractC8069yr;
import com.google.android.gms.p232c.AbstractC4175h;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.internal.yp */
/* loaded from: classes.dex */
public final class C8065yp extends AbstractC4175h<AbstractC8069yr> {
    public C8065yp() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: a */
    public AbstractC8066yq m12877a(Activity activity) {
        try {
            return AbstractC8066yq.AbstractBinderC8067a.m12875a(b(activity).mo12860a(BinderC4173f.m25293a(activity)));
        } catch (RemoteException e) {
            C3784b.m26839d("Could not create remote AdOverlay.", e);
            return null;
        } catch (AbstractC4175h.C4176a e2) {
            C3784b.m26839d("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.p232c.AbstractC4175h
    /* renamed from: a */
    public AbstractC8069yr mo9613b(IBinder iBinder) {
        return AbstractC8069yr.AbstractBinderC8070a.m12861a(iBinder);
    }
}
