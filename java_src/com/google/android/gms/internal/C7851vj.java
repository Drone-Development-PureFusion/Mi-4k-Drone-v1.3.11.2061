package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.common.internal.C4612q;
import com.google.android.gms.internal.AbstractC7817uw;
import com.google.android.gms.internal.AbstractC7823uy;
import com.google.android.gms.p232c.AbstractC4175h;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.internal.vj */
/* loaded from: classes.dex */
public class C7851vj extends AbstractC4175h<AbstractC7823uy> {
    public C7851vj() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* renamed from: a */
    public AbstractC7817uw m13327a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            return AbstractC7817uw.AbstractBinderC7818a.m13401a(b(context).mo13392a(BinderC4173f.m25293a(context), BinderC4173f.m25293a(frameLayout), BinderC4173f.m25293a(frameLayout2), C4612q.f17087a));
        } catch (RemoteException | AbstractC4175h.C4176a e) {
            C3784b.m26839d("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.p232c.AbstractC4175h
    /* renamed from: a */
    public AbstractC7823uy mo9613b(IBinder iBinder) {
        return AbstractC7823uy.AbstractBinderC7824a.m13393a(iBinder);
    }
}
