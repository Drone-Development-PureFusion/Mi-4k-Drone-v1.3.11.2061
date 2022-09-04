package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class aqj extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23627a(abstractC6880eaArr);
        C4588d.m23619b(abstractC6880eaArr.length == 2);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6887ef);
        C4588d.m23619b(abstractC6880eaArr[1] instanceof C6885ed);
        C6887ef c6887ef = (C6887ef) abstractC6880eaArr[0];
        C6885ed c6885ed = (C6885ed) abstractC6880eaArr[1];
        List<AbstractC6880ea<?>> mo16034b = c6887ef.mo16034b();
        int size = mo16034b.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size && i < c6887ef.mo16034b().size(); i++) {
            if (c6887ef.m16048c(i) && aqf.m16224a(((aqe) c6885ed.mo16034b()).mo12846a_(aprVar, mo16034b.get(i), new C6884ec(Double.valueOf(i)), c6887ef))) {
                arrayList.add(mo16034b.get(i));
            }
        }
        return new C6887ef(arrayList);
    }
}
