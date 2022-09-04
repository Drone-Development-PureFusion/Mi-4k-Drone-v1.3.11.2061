package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AbstractC3526ai;
import com.google.android.gms.ads.internal.client.AbstractC3529aj;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.common.internal.C4612q;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.p232c.AbstractC4175h;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.ads.internal.client.u */
/* loaded from: classes.dex */
public final class C3582u extends AbstractC4175h<AbstractC3529aj> {
    public C3582u() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* renamed from: a */
    public AbstractC3526ai m27423a(Context context, String str, AbstractC8005xq abstractC8005xq) {
        try {
            return AbstractC3526ai.AbstractBinderC3527a.m27574a(b(context).mo27572a(BinderC4173f.m25293a(context), str, abstractC8005xq, C4612q.f17087a));
        } catch (RemoteException e) {
            C3784b.m26839d("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (AbstractC4175h.C4176a e2) {
            C3784b.m26839d("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.p232c.AbstractC4175h
    /* renamed from: a */
    public AbstractC3529aj mo9613b(IBinder iBinder) {
        return AbstractC3529aj.AbstractBinderC3530a.m27573a(iBinder);
    }
}
