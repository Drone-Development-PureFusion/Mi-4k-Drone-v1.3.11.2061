package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.internal.ak */
/* loaded from: classes2.dex */
public class C6436ak extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 2 || abstractC6880eaArr.length == 3);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        String str = (String) ((C6893ej) abstractC6880eaArr[0]).mo16034b();
        String m16218d = aqf.m16218d(abstractC6880eaArr[1]);
        double d = Double.POSITIVE_INFINITY;
        if (abstractC6880eaArr.length == 3 && !Double.isNaN(aqf.m16222b(abstractC6880eaArr[2]))) {
            d = aqf.m16220c(abstractC6880eaArr[2]);
        }
        return new C6884ec(Double.valueOf(str.lastIndexOf(m16218d, (int) Math.min(Math.max(d, (double) C9755a.f30449c), str.length()))));
    }
}
