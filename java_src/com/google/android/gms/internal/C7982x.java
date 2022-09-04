package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.List;
/* renamed from: com.google.android.gms.internal.x */
/* loaded from: classes2.dex */
public class C7982x extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z;
        boolean z2 = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 3);
        C4588d.m23619b(abstractC6880eaArr[1] instanceof C6887ef);
        C4588d.m23619b(abstractC6880eaArr[2] instanceof C6887ef);
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[0];
        List<AbstractC6880ea<?>> mo16034b = ((C6887ef) abstractC6880eaArr[1]).mo16034b();
        List<AbstractC6880ea<?>> mo16034b2 = ((C6887ef) abstractC6880eaArr[2]).mo16034b();
        C4588d.m23619b(mo16034b2.size() <= mo16034b.size() + 1);
        int i = 0;
        boolean z3 = false;
        while (i < mo16034b.size()) {
            if (z3 || aqf.m16217d(abstractC6880ea, C6895ek.m16028a(aprVar, mo16034b.get(i)))) {
                AbstractC6880ea<?> m16028a = C6895ek.m16028a(aprVar, mo16034b2.get(i));
                if (!(m16028a instanceof C6886ee)) {
                    z = true;
                    i++;
                    z3 = z;
                } else if (m16028a == C6886ee.f23120c || ((C6886ee) m16028a).m16053e()) {
                    return m16028a;
                } else {
                    if (m16028a == C6886ee.f23119b) {
                        return C6886ee.f23122e;
                    }
                }
            }
            z = z3;
            i++;
            z3 = z;
        }
        if (mo16034b.size() >= mo16034b2.size()) {
            z2 = false;
        }
        if (z2) {
            AbstractC6880ea<?> m16028a2 = C6895ek.m16028a(aprVar, mo16034b2.get(mo16034b2.size() - 1));
            if ((m16028a2 instanceof C6886ee) && (m16028a2 == C6886ee.f23120c || ((C6886ee) m16028a2).m16053e())) {
                return m16028a2;
            }
        }
        return C6886ee.f23122e;
    }
}
