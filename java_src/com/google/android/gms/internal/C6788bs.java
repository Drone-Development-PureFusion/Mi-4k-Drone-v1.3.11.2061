package com.google.android.gms.internal;

import android.os.Build;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.bs */
/* loaded from: classes2.dex */
public class C6788bs implements aqe {

    /* renamed from: a */
    private final String f22884a = Build.BRAND;

    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 0) {
            z = false;
        }
        C4588d.m23619b(z);
        return new C6893ej(this.f22884a);
    }
}
