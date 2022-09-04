package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* loaded from: classes2.dex */
public class arg extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 2);
        if (aqf.m16217d(abstractC6880eaArr[1], abstractC6880eaArr[0])) {
            z = false;
        }
        return new C6883eb(Boolean.valueOf(z));
    }
}
