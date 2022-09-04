package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.internal.ck */
/* loaded from: classes2.dex */
public class C6808ck extends aqg {

    /* renamed from: a */
    private static final C6884ec f22905a = new C6884ec(Double.valueOf((double) C9755a.f30449c));

    /* renamed from: b */
    private static final C6884ec f22906b = new C6884ec(Double.valueOf(2.147483647E9d));

    /* renamed from: a */
    private boolean m16190a(AbstractC6880ea<?> abstractC6880ea) {
        return (abstractC6880ea instanceof C6884ec) && !Double.isNaN(((Double) ((C6884ec) abstractC6880ea).mo16034b()).doubleValue());
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        double d;
        double d2;
        C4588d.m23619b(abstractC6880eaArr != null);
        C6884ec c6884ec = abstractC6880eaArr.length > 0 ? abstractC6880eaArr[0] : f22905a;
        C6884ec c6884ec2 = abstractC6880eaArr.length > 1 ? abstractC6880eaArr[1] : f22906b;
        if (!m16190a(c6884ec) || !m16190a(c6884ec2) || !aqf.m16221b(c6884ec, c6884ec2)) {
            d = 2.147483647E9d;
            d2 = 0.0d;
        } else {
            d2 = ((Double) c6884ec.mo16034b()).doubleValue();
            d = ((Double) c6884ec2.mo16034b()).doubleValue();
        }
        return new C6884ec(Double.valueOf(Math.round(((d - d2) * Math.random()) + d2)));
    }
}
