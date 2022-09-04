package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.d */
/* loaded from: classes2.dex */
public class C6824d implements aqe {
    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 3);
        AbstractC6880ea<?> m16028a = aqf.m16224a(C6895ek.m16028a(aprVar, abstractC6880eaArr[0])) ? C6895ek.m16028a(aprVar, abstractC6880eaArr[1]) : C6895ek.m16028a(aprVar, abstractC6880eaArr[2]);
        if (!(m16028a instanceof C6886ee) || m16028a == C6886ee.f23122e || m16028a == C6886ee.f23121d) {
            return m16028a;
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Ternary.");
    }
}
