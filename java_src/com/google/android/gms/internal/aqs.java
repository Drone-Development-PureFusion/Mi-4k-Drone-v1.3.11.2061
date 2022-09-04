package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.List;
/* loaded from: classes2.dex */
public class aqs extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        int i;
        AbstractC6880ea<?> abstractC6880ea;
        C4588d.m23627a(abstractC6880eaArr);
        C4588d.m23619b(abstractC6880eaArr.length == 2 || abstractC6880eaArr.length == 3);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6887ef);
        C4588d.m23619b(abstractC6880eaArr[1] instanceof C6885ed);
        C6887ef c6887ef = (C6887ef) abstractC6880eaArr[0];
        C6885ed c6885ed = (C6885ed) abstractC6880eaArr[1];
        List<AbstractC6880ea<?>> mo16034b = c6887ef.mo16034b();
        int size = mo16034b.size();
        if (abstractC6880eaArr.length == 3) {
            abstractC6880ea = abstractC6880eaArr[2];
            i = 0;
        } else {
            C4588d.m23623a(size > 0);
            AbstractC6880ea<?> m16049b = c6887ef.m16049b(0);
            int i2 = 1;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                } else if (c6887ef.m16048c(i3)) {
                    m16049b = c6887ef.m16049b(i3);
                    i2 = i3 + 1;
                    break;
                } else {
                    i3++;
                }
            }
            C4588d.m23623a(i3 < size);
            i = i2;
            abstractC6880ea = m16049b;
        }
        int i4 = i;
        while (i4 < size && i4 < c6887ef.mo16034b().size()) {
            AbstractC6880ea<?> mo12846a_ = c6887ef.m16048c(i4) ? ((aqe) c6885ed.mo16034b()).mo12846a_(aprVar, abstractC6880ea, mo16034b.get(i4), new C6884ec(Double.valueOf(i4)), c6887ef) : abstractC6880ea;
            i4++;
            abstractC6880ea = mo12846a_;
        }
        return abstractC6880ea;
    }
}
