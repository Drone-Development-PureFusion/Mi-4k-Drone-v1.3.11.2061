package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.ah */
/* loaded from: classes2.dex */
public class C6330ah extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        int i = 0;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 1 || abstractC6880eaArr.length == 2);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        String str = (String) ((C6893ej) abstractC6880eaArr[0]).mo16034b();
        if (abstractC6880eaArr.length == 2) {
            i = (int) aqf.m16220c(abstractC6880eaArr[1]);
        }
        return (i < 0 || i >= str.length()) ? new C6893ej("") : new C6893ej(String.valueOf(str.charAt(i)));
    }
}
