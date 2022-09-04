package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.i */
/* loaded from: classes2.dex */
public class C7141i extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 1) {
            z = false;
        }
        C4588d.m23619b(z);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6887ef);
        for (AbstractC6880ea<?> abstractC6880ea : ((C6887ef) abstractC6880eaArr[0]).mo16034b()) {
            AbstractC6880ea<?> m16028a = C6895ek.m16028a(aprVar, abstractC6880ea);
            if ((m16028a instanceof C6886ee) && (m16028a == C6886ee.f23119b || m16028a == C6886ee.f23120c || ((C6886ee) m16028a).m16053e())) {
                return m16028a;
            }
        }
        return C6886ee.f23122e;
    }
}
