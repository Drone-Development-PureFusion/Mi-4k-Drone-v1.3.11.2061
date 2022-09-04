package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class aqz extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23627a(abstractC6880eaArr);
        C4588d.m23619b(abstractC6880eaArr.length >= 3);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6887ef);
        C6887ef c6887ef = (C6887ef) abstractC6880eaArr[0];
        int m16220c = (int) aqf.m16220c(abstractC6880eaArr[1]);
        int max = m16220c < 0 ? Math.max(c6887ef.mo16034b().size() + m16220c, 0) : Math.min(m16220c, c6887ef.mo16034b().size());
        int min = max + Math.min(Math.max((int) aqf.m16220c(abstractC6880eaArr[2]), 0), c6887ef.mo16034b().size() - max);
        ArrayList arrayList = new ArrayList(c6887ef.mo16034b().subList(max, min));
        c6887ef.mo16034b().subList(max, min).clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 3; i < abstractC6880eaArr.length; i++) {
            arrayList2.add(abstractC6880eaArr[i]);
        }
        c6887ef.mo16034b().addAll(max, arrayList2);
        return new C6887ef(arrayList);
    }
}
