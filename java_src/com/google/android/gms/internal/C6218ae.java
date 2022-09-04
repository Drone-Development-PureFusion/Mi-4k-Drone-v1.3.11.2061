package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.internal.ae */
/* loaded from: classes2.dex */
public class C6218ae extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 2);
        double m16222b = aqf.m16222b(abstractC6880eaArr[0]);
        double m16222b2 = aqf.m16222b(abstractC6880eaArr[1]);
        return (Double.isNaN(m16222b) || Double.isNaN(m16222b2)) ? new C6884ec(Double.valueOf(Double.NaN)) : (Double.isInfinite(m16222b) || m16222b2 == C9755a.f30449c) ? new C6884ec(Double.valueOf(Double.NaN)) : (Double.isInfinite(m16222b) || !Double.isInfinite(m16222b2)) ? (m16222b != C9755a.f30449c || m16222b2 == C9755a.f30449c || Double.isInfinite(m16222b2)) ? new C6884ec(Double.valueOf(m16222b % m16222b2)) : new C6884ec(Double.valueOf(m16222b)) : new C6884ec(Double.valueOf(m16222b));
    }
}
