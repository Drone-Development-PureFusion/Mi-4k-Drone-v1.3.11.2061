package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AbstractC3532ak;
import com.google.android.gms.ads.internal.client.AbstractC3535al;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.common.internal.C4612q;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.p232c.AbstractC4175h;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.ads.internal.client.v */
/* loaded from: classes.dex */
public class C3583v extends AbstractC4175h<AbstractC3535al> {
    public C3583v() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public AbstractC3532ak m27421a(Context context, AdSizeParcel adSizeParcel, String str, AbstractC8005xq abstractC8005xq, int i) {
        try {
            return AbstractC3532ak.AbstractBinderC3533a.m27571a(b(context).mo27568a(BinderC4173f.m25293a(context), adSizeParcel, str, abstractC8005xq, C4612q.f17087a, i));
        } catch (RemoteException | AbstractC4175h.C4176a e) {
            C3784b.m26845a("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.p232c.AbstractC4175h
    /* renamed from: a */
    public AbstractC3535al mo9613b(IBinder iBinder) {
        return AbstractC3535al.AbstractBinderC3536a.m27570a(iBinder);
    }
}
