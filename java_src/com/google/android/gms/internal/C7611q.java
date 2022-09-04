package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.q */
/* loaded from: classes2.dex */
public class C7611q extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        AbstractC6880ea<?> m16049b;
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 2);
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[0];
        AbstractC6880ea<?> abstractC6880ea2 = abstractC6880eaArr[1];
        C4588d.m23619b((abstractC6880ea instanceof C6893ej) || !C6895ek.m16020c(abstractC6880ea));
        C4588d.m23619b(!C6895ek.m16019d(abstractC6880ea));
        if (C6895ek.m16019d(abstractC6880ea2)) {
            z = false;
        }
        C4588d.m23619b(z);
        String m16218d = aqf.m16218d(abstractC6880ea2);
        if (abstractC6880ea instanceof C6887ef) {
            C6887ef c6887ef = (C6887ef) abstractC6880ea;
            if ("length".equals(m16218d)) {
                return new C6884ec(Double.valueOf(c6887ef.mo16034b().size()));
            }
            double m16222b = aqf.m16222b(abstractC6880ea2);
            if (m16222b == Math.floor(m16222b) && m16218d.equals(Integer.toString((int) m16222b)) && (m16049b = c6887ef.m16049b((int) m16222b)) != C6886ee.f23122e) {
                return m16049b;
            }
        } else if (abstractC6880ea instanceof C6893ej) {
            C6893ej c6893ej = (C6893ej) abstractC6880ea;
            if ("length".equals(m16218d)) {
                return new C6884ec(Double.valueOf(((String) c6893ej.mo16034b()).length()));
            }
            double m16222b2 = aqf.m16222b(abstractC6880ea2);
            return (m16222b2 != Math.floor(m16222b2) || !m16218d.equals(Integer.toString((int) m16222b2))) ? C6886ee.f23122e : c6893ej.m16036a((int) m16222b2);
        }
        return abstractC6880ea.mo16044b(m16218d);
    }
}
