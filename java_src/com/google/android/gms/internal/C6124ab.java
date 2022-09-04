package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.ab */
/* loaded from: classes2.dex */
public class C6124ab extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 2);
        C6893ej c6893ej = abstractC6880eaArr[0];
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[1];
        if ((!(c6893ej instanceof C6886ee) || c6893ej == C6886ee.f23122e || c6893ej == C6886ee.f23121d) && (!(abstractC6880ea instanceof C6886ee) || abstractC6880ea == C6886ee.f23122e || abstractC6880ea == C6886ee.f23121d)) {
            if ((c6893ej instanceof C6891eh) || (c6893ej instanceof C6887ef) || (c6893ej instanceof C6885ed)) {
                c6893ej = new C6893ej(aqf.m16218d(c6893ej));
            }
            AbstractC6880ea<?> c6893ej2 = ((abstractC6880ea instanceof C6891eh) || (abstractC6880ea instanceof C6887ef) || (abstractC6880ea instanceof C6885ed)) ? new C6893ej(aqf.m16218d(abstractC6880ea)) : abstractC6880ea;
            if (!(c6893ej instanceof C6893ej) && !(c6893ej2 instanceof C6893ej)) {
                return new C6884ec(Double.valueOf(aqf.m16223a(c6893ej, c6893ej2)));
            }
            String valueOf = String.valueOf(aqf.m16218d(c6893ej));
            String valueOf2 = String.valueOf(aqf.m16218d(c6893ej2));
            return new C6893ej(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Add.");
    }
}
