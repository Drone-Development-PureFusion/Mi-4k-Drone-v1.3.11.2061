package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.bl */
/* loaded from: classes2.dex */
public class C6781bl implements aqe {

    /* renamed from: a */
    private Context f22878a;

    public C6781bl(Context context) {
        this.f22878a = context;
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
            PackageManager packageManager = this.f22878a.getPackageManager();
            return new C6893ej(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f22878a.getPackageName(), 0)).toString());
        } catch (PackageManager.NameNotFoundException e) {
            return new C6893ej("");
        }
    }
}
