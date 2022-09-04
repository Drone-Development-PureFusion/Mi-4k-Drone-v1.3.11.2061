package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.C4516c;
import com.google.android.gms.common.C4536e;
import com.google.android.gms.internal.AbstractC6922ew;
import com.google.android.gms.p232c.AbstractC4167d;
import com.google.android.gms.p232c.AbstractC4175h;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
/* renamed from: com.google.android.gms.internal.fb */
/* loaded from: classes2.dex */
public class C6946fb extends AbstractC4175h<AbstractC6922ew> {

    /* renamed from: a */
    private static C6946fb f23343a;

    protected C6946fb() {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    /* renamed from: a */
    public static AbstractC6913et m15898a(Activity activity, AbstractC4167d abstractC4167d, WalletFragmentOptions walletFragmentOptions, AbstractC6916eu abstractC6916eu) {
        int m23815a = C4536e.m23815a((Context) activity);
        if (m23815a != 0) {
            throw new C4516c(m23815a);
        }
        try {
            return m15899a().b(activity).mo15927a(BinderC4173f.m25293a(activity), abstractC4167d, walletFragmentOptions, abstractC6916eu);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (AbstractC4175h.C4176a e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    private static C6946fb m15899a() {
        if (f23343a == null) {
            f23343a = new C6946fb();
        }
        return f23343a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.p232c.AbstractC4175h
    /* renamed from: a */
    public AbstractC6922ew mo9613b(IBinder iBinder) {
        return AbstractC6922ew.AbstractBinderC6923a.m15928a(iBinder);
    }
}
