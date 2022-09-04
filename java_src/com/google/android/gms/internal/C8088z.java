package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.z */
/* loaded from: classes2.dex */
public class C8088z implements aqe {
    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length <= 0) {
            z = false;
        }
        C4588d.m23619b(z);
        for (AbstractC6880ea<?> abstractC6880ea : abstractC6880eaArr) {
            C4588d.m23627a(abstractC6880ea);
            C4588d.m23619b(abstractC6880ea instanceof C6893ej);
            aprVar.m16316a((String) ((C6893ej) abstractC6880ea).mo16034b(), C6886ee.f23122e);
        }
        return C6886ee.f23122e;
    }
}
