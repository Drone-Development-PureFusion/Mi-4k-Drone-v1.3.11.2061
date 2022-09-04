package com.google.android.gms.internal;

import android.os.Build;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.bv */
/* loaded from: classes2.dex */
public class C6791bv implements aqe {

    /* renamed from: a */
    private final String f22887a = Build.MANUFACTURER;

    /* renamed from: b */
    private final String f22888b = Build.MODEL;

    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 0) {
            z = false;
        }
        C4588d.m23619b(z);
        String str = this.f22887a;
        String str2 = this.f22888b;
        if (!str2.startsWith(str) && !str.equals("unknown")) {
            str2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append(" ").append(str2).toString();
        }
        return new C6893ej(str2);
    }
}
