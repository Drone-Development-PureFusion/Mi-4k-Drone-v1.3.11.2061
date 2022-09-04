package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.List;
/* loaded from: classes2.dex */
public class aqo extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        int i;
        C4588d.m23627a(abstractC6880eaArr);
        C4588d.m23619b(abstractC6880eaArr.length > 0 && abstractC6880eaArr.length <= 3);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6887ef);
        C6887ef c6887ef = (C6887ef) abstractC6880eaArr[0];
        C6886ee c6886ee = abstractC6880eaArr.length < 2 ? C6886ee.f23122e : abstractC6880eaArr[1];
        List<AbstractC6880ea<?>> mo16034b = c6887ef.mo16034b();
        int size = mo16034b.size();
        int i2 = size - 1;
        if (abstractC6880eaArr.length == 3) {
            int m16220c = (int) aqf.m16220c(abstractC6880eaArr[2]);
            i2 = m16220c < 0 ? size - Math.abs(m16220c) : Math.min(m16220c, size - 1);
        }
        int i3 = i2;
        while (true) {
            if (i3 < 0) {
                i = -1;
                break;
            } else if (c6887ef.m16048c(i3) && aqf.m16217d(c6886ee, mo16034b.get(i3))) {
                i = i3;
                break;
            } else {
                i3--;
            }
        }
        return new C6884ec(Double.valueOf(i));
    }
}
