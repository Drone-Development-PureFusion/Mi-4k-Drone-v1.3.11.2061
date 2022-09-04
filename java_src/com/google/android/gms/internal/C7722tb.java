package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.C4648j;
import com.google.android.gms.internal.AbstractC7723tc;
import com.google.android.gms.internal.AbstractC7726td;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.AbstractC4175h;
import com.google.android.gms.p232c.BinderC4173f;
/* renamed from: com.google.android.gms.internal.tb */
/* loaded from: classes2.dex */
public final class C7722tb extends AbstractC4175h<AbstractC7726td> {

    /* renamed from: a */
    private static final C7722tb f25576a = new C7722tb();

    private C7722tb() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    /* renamed from: a */
    public static AbstractC7723tc m13654a(String str, Context context, boolean z) {
        AbstractC7723tc m13653b;
        return (C4648j.m23370b().mo23375a(context) != 0 || (m13653b = f25576a.m13653b(str, context, z)) == null) ? new BinderC7721ta(str, context, z) : m13653b;
    }

    /* renamed from: b */
    private AbstractC7723tc m13653b(String str, Context context, boolean z) {
        AbstractC4170e m25293a = BinderC4173f.m25293a(context);
        try {
            return AbstractC7723tc.AbstractBinderC7724a.m13652a(z ? b(context).mo13639a(str, m25293a) : b(context).mo13638b(str, m25293a));
        } catch (RemoteException | AbstractC4175h.C4176a e) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.p232c.AbstractC4175h
    /* renamed from: a */
    public AbstractC7726td mo9613b(IBinder iBinder) {
        return AbstractC7726td.AbstractBinderC7727a.m13640a(iBinder);
    }
}
