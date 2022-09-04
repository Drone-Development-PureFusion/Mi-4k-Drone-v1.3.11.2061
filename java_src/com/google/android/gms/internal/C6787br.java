package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
/* renamed from: com.google.android.gms.internal.br */
/* loaded from: classes2.dex */
public class C6787br implements aqe {

    /* renamed from: a */
    private AbstractC4682e f22883a = new C4685h();

    /* renamed from: a */
    public void m16199a(AbstractC4682e abstractC4682e) {
        this.f22883a = (AbstractC4682e) C4588d.m23627a(abstractC4682e);
    }

    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 0) {
            z = false;
        }
        C4588d.m23619b(z);
        return new C6884ec(Double.valueOf(this.f22883a.mo16434a()));
    }
}
