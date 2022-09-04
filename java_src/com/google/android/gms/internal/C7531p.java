package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.p */
/* loaded from: classes2.dex */
public class C7531p implements aqe {

    /* renamed from: a */
    private static C6716app f25043a;

    public C7531p(C6716app c6716app) {
        f25043a = c6716app;
    }

    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 1) {
            z = false;
        }
        C4588d.m23619b(z);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        return f25043a.m16339a((String) ((C6893ej) abstractC6880eaArr[0]).mo16034b());
    }
}
