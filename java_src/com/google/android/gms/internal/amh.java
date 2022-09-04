package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.akb;
import com.google.android.gms.internal.ami;
import com.google.android.gms.p232c.BinderC4173f;
/* loaded from: classes2.dex */
public class amh {

    /* renamed from: a */
    private boolean f22266a = false;

    /* renamed from: b */
    private ami f22267b = null;

    /* renamed from: a */
    public <T> T m16814a(amf<T> amfVar) {
        synchronized (this) {
            if (!this.f22266a) {
                return amfVar.m16825b();
            }
            return amfVar.mo16819a(this.f22267b);
        }
    }

    /* renamed from: a */
    public void m16815a(Context context) {
        synchronized (this) {
            if (this.f22266a) {
                return;
            }
            try {
                this.f22267b = ami.AbstractBinderC6565a.asInterface(akb.m17066a(context, akb.f22109a, ModuleDescriptor.MODULE_ID).m17062a("com.google.android.gms.flags.impl.FlagProviderImpl"));
                this.f22267b.init(BinderC4173f.m25293a(context));
                this.f22266a = true;
            } catch (RemoteException | akb.C6444a e) {
                Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
            }
        }
    }
}
