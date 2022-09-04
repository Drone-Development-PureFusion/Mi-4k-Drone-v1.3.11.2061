package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C6716app;
import com.google.android.gms.tagmanager.AbstractC9042aj;
/* renamed from: com.google.android.gms.internal.da */
/* loaded from: classes2.dex */
public class C6825da extends aqg {

    /* renamed from: a */
    private final AbstractC9042aj f22911a;

    /* renamed from: b */
    private final C6716app.AbstractC6720c f22912b;

    public C6825da(AbstractC9042aj abstractC9042aj, C6716app.AbstractC6720c abstractC6720c) {
        this.f22911a = abstractC9042aj;
        this.f22912b = abstractC6720c;
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 1 || abstractC6880eaArr.length == 2);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        C6886ee c6886ee = abstractC6880eaArr.length > 1 ? abstractC6880eaArr[1] : C6886ee.f23122e;
        if (c6886ee != C6886ee.f23122e && !(c6886ee instanceof C6891eh)) {
            z = false;
        }
        C4588d.m23619b(z);
        aow mo16320a = this.f22912b.mo16320a();
        String str = (String) ((C6893ej) abstractC6880eaArr[0]).mo16034b();
        Bundle bundle = null;
        if (c6886ee != C6886ee.f23122e) {
            bundle = C6895ek.m16022a(((C6891eh) c6886ee).mo16034b());
        }
        try {
            this.f22911a.mo8895a(mo16320a.m16428f(), str, bundle, mo16320a.mo16434a());
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            aph.m16396a(valueOf.length() != 0 ? "Error calling measurement proxy:".concat(valueOf) : new String("Error calling measurement proxy:"));
        }
        return C6886ee.f23122e;
    }
}
