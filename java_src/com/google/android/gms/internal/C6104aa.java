package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.List;
/* renamed from: com.google.android.gms.internal.aa */
/* loaded from: classes2.dex */
public class C6104aa implements aqe {
    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C6886ee m16026a;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 4);
        AbstractC6880ea m16028a = C6895ek.m16028a(aprVar, abstractC6880eaArr[3]);
        C4588d.m23619b(m16028a instanceof C6887ef);
        List<AbstractC6880ea<?>> mo16034b = ((C6887ef) m16028a).mo16034b();
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[2];
        C4588d.m23619b(abstractC6880ea instanceof C6883eb);
        if (((Boolean) ((C6883eb) abstractC6880ea).mo16034b()).booleanValue()) {
            C6886ee m16026a2 = C6895ek.m16026a(aprVar, mo16034b);
            if (m16026a2 == C6886ee.f23119b) {
                return C6886ee.f23122e;
            }
            if (m16026a2.m16053e()) {
                return m16026a2;
            }
        }
        while (aqf.m16224a(C6895ek.m16028a(aprVar, abstractC6880eaArr[0])) && (m16026a = C6895ek.m16026a(aprVar, mo16034b)) != C6886ee.f23119b) {
            if (m16026a.m16053e()) {
                return m16026a;
            }
            C6895ek.m16028a(aprVar, abstractC6880eaArr[1]);
        }
        return C6886ee.f23122e;
    }
}
