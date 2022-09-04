package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.google.android.gms.internal.n */
/* loaded from: classes2.dex */
public class C7430n extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    public AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23627a(abstractC6880eaArr);
        C4588d.m23619b(abstractC6880eaArr.length == 3);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        String str = (String) ((C6893ej) abstractC6880eaArr[0]).mo16034b();
        C4588d.m23619b(aprVar.m16317a(str));
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[1];
        C4588d.m23627a(abstractC6880ea);
        AbstractC6880ea<?> abstractC6880ea2 = abstractC6880eaArr[2];
        C4588d.m23619b(abstractC6880ea2 instanceof C6887ef);
        List<AbstractC6880ea<?>> mo16034b = ((C6887ef) abstractC6880ea2).mo16034b();
        Iterator<AbstractC6880ea<?>> mo16037a = abstractC6880ea.mo16037a();
        while (mo16037a.hasNext()) {
            aprVar.m16314b(str, mo16037a.next());
            C6886ee m16026a = C6895ek.m16026a(aprVar, mo16034b);
            if (m16026a == C6886ee.f23119b) {
                return C6886ee.f23122e;
            }
            if (m16026a.m16053e()) {
                return m16026a;
            }
        }
        return C6886ee.f23122e;
    }
}
