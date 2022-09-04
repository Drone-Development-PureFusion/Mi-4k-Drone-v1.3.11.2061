package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.aq */
/* loaded from: classes2.dex */
public class C6752aq extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length > 0 && abstractC6880eaArr.length <= 3);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        String str = (String) ((C6893ej) abstractC6880eaArr[0]).mo16034b();
        int m16220c = (int) aqf.m16220c(abstractC6880eaArr.length < 2 ? C6886ee.f23122e : abstractC6880eaArr[1]);
        int length = str.length();
        if (abstractC6880eaArr.length == 3 && abstractC6880eaArr[2] != C6886ee.f23122e) {
            length = (int) aqf.m16220c(C6895ek.m16028a(aprVar, abstractC6880eaArr[2]));
        }
        int min = Math.min(Math.max(m16220c, 0), str.length());
        int min2 = Math.min(Math.max(length, 0), str.length());
        return new C6893ej(str.substring(Math.min(min, min2), Math.max(min, min2)));
    }
}
