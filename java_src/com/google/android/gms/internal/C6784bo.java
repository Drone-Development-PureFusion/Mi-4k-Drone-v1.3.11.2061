package com.google.android.gms.internal;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.bo */
/* loaded from: classes2.dex */
public class C6784bo implements aqe {

    /* renamed from: a */
    private final Context f22881a;

    public C6784bo(Context context) {
        this.f22881a = (Context) C4588d.m23627a(context);
    }

    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        String networkOperatorName;
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 0) {
            z = false;
        }
        C4588d.m23619b(z);
        TelephonyManager telephonyManager = (TelephonyManager) this.f22881a.getSystemService("phone");
        return (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) ? C6886ee.f23122e : new C6893ej(networkOperatorName);
    }
}
