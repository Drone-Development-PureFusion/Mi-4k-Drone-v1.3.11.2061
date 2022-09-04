package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.ap */
/* loaded from: classes2.dex */
public class C6705ap extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        int i = 1;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 1 || abstractC6880eaArr.length == 2);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        ArrayList arrayList = new ArrayList();
        if (abstractC6880eaArr.length == 1) {
            arrayList.add(abstractC6880eaArr[0]);
        } else {
            String str = (String) ((C6893ej) abstractC6880eaArr[0]).mo16034b();
            String m16218d = aqf.m16218d(abstractC6880eaArr[1]);
            boolean equals = m16218d.equals("");
            String[] split = str.split(m16218d, equals ? 0 : -1);
            if (!equals) {
                i = 0;
            }
            while (i < split.length) {
                arrayList.add(new C6893ej(split[i]));
                i++;
            }
        }
        return new C6887ef(arrayList);
    }
}
