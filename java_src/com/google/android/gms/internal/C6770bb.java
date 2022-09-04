package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.bb */
/* loaded from: classes2.dex */
public class C6770bb extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 1) {
            z = false;
        }
        C4588d.m23619b(z);
        return new C6883eb(Boolean.valueOf(abstractC6880eaArr[0] instanceof C6887ef));
    }
}
