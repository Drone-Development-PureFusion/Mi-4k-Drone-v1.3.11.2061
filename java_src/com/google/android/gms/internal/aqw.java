package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class aqw extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23627a(abstractC6880eaArr);
        C4588d.m23619b(abstractC6880eaArr.length == 2 || abstractC6880eaArr.length == 3);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6887ef);
        C6887ef c6887ef = (C6887ef) abstractC6880eaArr[0];
        int m16220c = (int) aqf.m16220c(abstractC6880eaArr[1]);
        int max = m16220c < 0 ? Math.max(c6887ef.mo16034b().size() + m16220c, 0) : Math.min(m16220c, c6887ef.mo16034b().size());
        int size = c6887ef.mo16034b().size();
        if (abstractC6880eaArr.length == 3) {
            int m16220c2 = (int) aqf.m16220c(abstractC6880eaArr[2]);
            size = m16220c2 < 0 ? Math.max(c6887ef.mo16034b().size() + m16220c2, 0) : Math.min(m16220c2, c6887ef.mo16034b().size());
        }
        return new C6887ef(new ArrayList(c6887ef.mo16034b().subList(max, Math.max(max, size))));
    }
}
