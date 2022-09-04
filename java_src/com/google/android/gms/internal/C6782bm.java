package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.bm */
/* loaded from: classes2.dex */
public class C6782bm implements aqe {

    /* renamed from: a */
    private final Context f22879a;

    public C6782bm(Context context) {
        this.f22879a = (Context) C4588d.m23627a(context);
    }

    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 0) {
            z = false;
        }
        C4588d.m23619b(z);
        try {
            return new C6884ec(Double.valueOf(this.f22879a.getPackageManager().getPackageInfo(this.f22879a.getPackageName(), 0).versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(this.f22879a.getPackageName());
            String valueOf2 = String.valueOf(e.getMessage());
            aph.m16396a(new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(valueOf2).length()).append("Package name ").append(valueOf).append(" not found. ").append(valueOf2).toString());
            return C6886ee.f23122e;
        }
    }
}
