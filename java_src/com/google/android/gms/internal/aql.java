package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.List;
/* loaded from: classes2.dex */
public class aql extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        int i;
        int i2 = 0;
        C4588d.m23627a(abstractC6880eaArr);
        C4588d.m23619b(abstractC6880eaArr.length > 0 && abstractC6880eaArr.length <= 3);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6887ef);
        C6887ef c6887ef = (C6887ef) abstractC6880eaArr[0];
        C6886ee c6886ee = abstractC6880eaArr.length < 2 ? C6886ee.f23122e : abstractC6880eaArr[1];
        C6886ee c6886ee2 = abstractC6880eaArr.length < 3 ? C6886ee.f23122e : abstractC6880eaArr[2];
        List<AbstractC6880ea<?>> mo16034b = c6887ef.mo16034b();
        int size = mo16034b.size();
        if (c6886ee2 != C6886ee.f23122e) {
            int m16220c = (int) aqf.m16220c(c6886ee2);
            i2 = m16220c < 0 ? Math.max(size - Math.abs(m16220c), 0) : m16220c;
        }
        int i3 = i2;
        while (true) {
            if (i3 >= size) {
                i = -1;
                break;
            } else if (c6887ef.m16048c(i3) && aqf.m16217d(c6886ee, mo16034b.get(i3))) {
                i = i3;
                break;
            } else {
                i3++;
            }
        }
        return new C6884ec(Double.valueOf(i));
    }
}
