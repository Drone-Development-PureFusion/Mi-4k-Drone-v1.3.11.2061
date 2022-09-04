package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.ai */
/* loaded from: classes2.dex */
public class C6372ai extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length > 0);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        StringBuilder sb = new StringBuilder((String) ((C6893ej) abstractC6880eaArr[0]).mo16034b());
        for (int i = 1; i < abstractC6880eaArr.length; i++) {
            sb.append(aqf.m16218d(abstractC6880eaArr[i]));
        }
        return new C6893ej(sb.toString());
    }
}
