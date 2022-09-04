package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* loaded from: classes2.dex */
public class ari extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        boolean z2 = false;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 2);
        C6893ej c6893ej = abstractC6880eaArr[0];
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[1];
        if ((c6893ej instanceof C6891eh) || (c6893ej instanceof C6887ef) || (c6893ej instanceof C6885ed)) {
            c6893ej = new C6893ej(aqf.m16218d(c6893ej));
        }
        AbstractC6880ea<?> c6893ej2 = ((abstractC6880ea instanceof C6891eh) || (abstractC6880ea instanceof C6887ef) || (abstractC6880ea instanceof C6885ed)) ? new C6893ej(aqf.m16218d(abstractC6880ea)) : abstractC6880ea;
        if (((c6893ej instanceof C6893ej) && (c6893ej2 instanceof C6893ej)) || (!Double.isNaN(aqf.m16222b(c6893ej)) && !Double.isNaN(aqf.m16222b(c6893ej2)))) {
            if (aqf.m16221b(c6893ej2, c6893ej)) {
                z = false;
            }
            z2 = z;
        }
        return new C6883eb(Boolean.valueOf(z2));
    }
}
