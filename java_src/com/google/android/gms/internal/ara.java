package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class ara extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23627a(abstractC6880eaArr);
        C4588d.m23619b(abstractC6880eaArr.length >= 1);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6887ef);
        C6887ef c6887ef = (C6887ef) abstractC6880eaArr[0];
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < abstractC6880eaArr.length; i++) {
            arrayList.add(abstractC6880eaArr[i]);
        }
        c6887ef.mo16034b().addAll(0, arrayList);
        return new C6884ec(Double.valueOf(c6887ef.mo16034b().size()));
    }
}
