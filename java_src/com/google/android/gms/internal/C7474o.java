package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.o */
/* loaded from: classes2.dex */
public class C7474o implements aqe {
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
        AbstractC6880ea<?> m16315b = aprVar.m16315b((String) ((C6893ej) abstractC6880eaArr[0]).mo16034b());
        if (m16315b instanceof C6892ei) {
            throw new IllegalStateException("Illegal Statement type encountered in Get.");
        }
        if ((m16315b instanceof C6886ee) && m16315b != C6886ee.f23122e && m16315b != C6886ee.f23121d) {
            throw new IllegalStateException("Illegal InternalType encountered in Get.");
        }
        return m16315b;
    }
}
