package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.r */
/* loaded from: classes2.dex */
public class C7645r extends aqg {

    /* renamed from: a */
    public static final C7645r f25384a = new C7645r();

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        int i;
        int i2;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 2);
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[0];
        AbstractC6880ea<?> abstractC6880ea2 = abstractC6880eaArr[1];
        C4588d.m23619b(!C6895ek.m16019d(abstractC6880ea));
        C4588d.m23619b(!C6895ek.m16019d(abstractC6880ea2));
        String m16218d = aqf.m16218d(abstractC6880ea2);
        if (abstractC6880ea instanceof C6887ef) {
            if ("length".equals(m16218d)) {
                return new C6883eb(true);
            }
            double m16222b = aqf.m16222b(abstractC6880ea2);
            if (m16222b == Math.floor(m16222b) && m16218d.equals(Integer.toString((int) m16222b)) && (i2 = (int) m16222b) >= 0 && i2 < ((C6887ef) abstractC6880ea).mo16034b().size()) {
                return new C6883eb(true);
            }
        } else if (abstractC6880ea instanceof C6893ej) {
            if ("length".equals(m16218d)) {
                return new C6883eb(true);
            }
            double m16222b2 = aqf.m16222b(abstractC6880ea2);
            return (m16222b2 != Math.floor(m16222b2) || !m16218d.equals(Integer.toString((int) m16222b2)) || (i = (int) m16222b2) < 0 || i >= ((String) ((C6893ej) abstractC6880ea).mo16034b()).length()) ? new C6883eb(false) : new C6883eb(true);
        }
        return new C6883eb(Boolean.valueOf(abstractC6880ea.m16062a(m16218d)));
    }
}
