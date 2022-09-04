package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.am */
/* loaded from: classes2.dex */
public class C6549am extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length > 0 && abstractC6880eaArr.length <= 3);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        String str = (String) ((C6893ej) abstractC6880eaArr[0]).mo16034b();
        if (abstractC6880eaArr.length == 1) {
            return new C6893ej(str);
        }
        String m16218d = aqf.m16218d(abstractC6880eaArr[1]);
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr.length < 3 ? C6886ee.f23122e : abstractC6880eaArr[2];
        int indexOf = str.indexOf(m16218d);
        if (indexOf == -1) {
            return new C6893ej(str);
        }
        if (abstractC6880ea instanceof C6885ed) {
            abstractC6880ea = ((aqe) ((C6885ed) abstractC6880ea).mo16034b()).mo12846a_(aprVar, new C6893ej(m16218d), new C6884ec(Double.valueOf(indexOf)), new C6893ej(str));
        }
        String m16218d2 = aqf.m16218d(abstractC6880ea);
        String valueOf = String.valueOf(str.substring(0, indexOf));
        String valueOf2 = String.valueOf(str.substring(m16218d.length() + indexOf));
        return new C6893ej(new StringBuilder(String.valueOf(valueOf).length() + 0 + String.valueOf(m16218d2).length() + String.valueOf(valueOf2).length()).append(valueOf).append(m16218d2).append(valueOf2).toString());
    }
}
