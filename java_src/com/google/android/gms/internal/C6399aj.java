package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.internal.aj */
/* loaded from: classes2.dex */
public class C6399aj extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 2 || abstractC6880eaArr.length == 3);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        String str = (String) ((C6893ej) abstractC6880eaArr[0]).mo16034b();
        return new C6884ec(Double.valueOf(str.indexOf(aqf.m16218d(abstractC6880eaArr[1]), (int) Math.min(Math.max(abstractC6880eaArr.length < 3 ? 0.0d : aqf.m16220c(abstractC6880eaArr[2]), (double) C9755a.f30449c), str.length()))));
    }
}
