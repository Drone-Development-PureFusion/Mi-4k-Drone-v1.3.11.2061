package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* loaded from: classes2.dex */
public class aqr extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23627a(abstractC6880eaArr);
        C4588d.m23619b(abstractC6880eaArr.length >= 1);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6887ef);
        C6887ef c6887ef = (C6887ef) abstractC6880eaArr[0];
        int size = c6887ef.mo16034b().size();
        c6887ef.m16052a((abstractC6880eaArr.length + size) - 1);
        for (int i = 1; i < abstractC6880eaArr.length; i++) {
            c6887ef.m16051a(size, abstractC6880eaArr[i]);
            size++;
        }
        return new C6884ec(Double.valueOf(size));
    }
}
