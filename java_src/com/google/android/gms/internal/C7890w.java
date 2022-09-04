package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.internal.w */
/* loaded from: classes2.dex */
public class C7890w extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 3);
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[0];
        AbstractC6880ea<?> abstractC6880ea2 = abstractC6880eaArr[1];
        AbstractC6880ea<?> abstractC6880ea3 = abstractC6880eaArr[2];
        C4588d.m23619b(abstractC6880ea != C6886ee.f23121d);
        C4588d.m23619b(abstractC6880ea != C6886ee.f23122e);
        C4588d.m23619b(!C6895ek.m16019d(abstractC6880ea));
        C4588d.m23619b(!C6895ek.m16019d(abstractC6880ea2));
        C4588d.m23619b(!C6895ek.m16019d(abstractC6880ea3));
        if (C6895ek.m16020c(abstractC6880ea)) {
            return abstractC6880ea3;
        }
        String m16218d = aqf.m16218d(abstractC6880ea2);
        if (abstractC6880ea instanceof C6891eh) {
            C6891eh c6891eh = (C6891eh) abstractC6880ea;
            if (!c6891eh.m16041f()) {
                c6891eh.a(m16218d, abstractC6880ea3);
            }
            return abstractC6880ea3;
        }
        if (abstractC6880ea instanceof C6887ef) {
            C6887ef c6887ef = (C6887ef) abstractC6880ea;
            if ("length".equals(m16218d)) {
                double m16222b = aqf.m16222b(abstractC6880ea3);
                if (Double.isInfinite(m16222b) || m16222b != Math.floor(m16222b)) {
                    z = false;
                }
                C4588d.m23619b(z);
                c6887ef.m16052a((int) m16222b);
                return abstractC6880ea3;
            }
            double m16222b2 = aqf.m16222b(abstractC6880ea2);
            if (!Double.isInfinite(m16222b2) && m16222b2 >= C9755a.f30449c && m16218d.equals(Integer.toString((int) m16222b2))) {
                c6887ef.m16051a((int) m16222b2, abstractC6880ea3);
                return abstractC6880ea3;
            }
        }
        abstractC6880ea.m16061a(m16218d, abstractC6880ea3);
        return abstractC6880ea3;
    }
}
