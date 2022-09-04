package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.List;
/* renamed from: com.google.android.gms.internal.f */
/* loaded from: classes2.dex */
public class C6940f extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 3);
        C4588d.m23619b(abstractC6880eaArr[1] instanceof C6893ej);
        C4588d.m23619b(abstractC6880eaArr[2] instanceof C6887ef);
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[0];
        String str = (String) ((C6893ej) abstractC6880eaArr[1]).mo16034b();
        List<AbstractC6880ea<?>> mo16034b = ((C6887ef) abstractC6880eaArr[2]).mo16034b();
        if (abstractC6880ea.m16062a(str)) {
            AbstractC6880ea<?> mo16044b = abstractC6880ea.mo16044b(str);
            if (!(mo16044b instanceof C6885ed)) {
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 35).append("Apply TypeError: ").append(str).append(" is not a function").toString());
            }
            return ((aqe) ((C6885ed) mo16044b).mo16034b()).mo12846a_(aprVar, (AbstractC6880ea[]) mo16034b.toArray(new AbstractC6880ea[mo16034b.size()]));
        } else if (!abstractC6880ea.mo16033c(str)) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 40).append("Apply TypeError: object has no ").append(str).append(" property").toString());
        } else {
            aqe mo16031d = abstractC6880ea.mo16031d(str);
            mo16034b.add(0, abstractC6880ea);
            return mo16031d.mo12846a_(aprVar, (AbstractC6880ea[]) mo16034b.toArray(new AbstractC6880ea[mo16034b.size()]));
        }
    }
}
