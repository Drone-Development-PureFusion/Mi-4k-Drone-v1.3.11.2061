package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* loaded from: classes2.dex */
public abstract class aqg implements aqe {
    /* renamed from: a */
    protected abstract AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr);

    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(aprVar != null);
        C4588d.m23619b(abstractC6880eaArr != null);
        AbstractC6880ea<?>[] abstractC6880eaArr2 = new AbstractC6880ea[abstractC6880eaArr.length];
        for (int i = 0; i < abstractC6880eaArr.length; i++) {
            C4588d.m23619b(abstractC6880eaArr[i] != null);
            C4588d.m23619b(abstractC6880eaArr[i] != C6886ee.f23119b);
            C4588d.m23619b(abstractC6880eaArr[i] != C6886ee.f23120c);
            abstractC6880eaArr2[i] = C6895ek.m16028a(aprVar, abstractC6880eaArr[i]);
            C4588d.m23619b(abstractC6880eaArr2[i] != null);
            C4588d.m23619b(abstractC6880eaArr2[i] != C6886ee.f23119b);
            C4588d.m23619b(abstractC6880eaArr2[i] != C6886ee.f23120c);
        }
        AbstractC6880ea<?> mo13115a = mo13115a(aprVar, abstractC6880eaArr2);
        if (mo13115a == null) {
            z = false;
        }
        C4588d.m23623a(z);
        return mo13115a;
    }
}
