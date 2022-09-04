package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.internal.ao */
/* loaded from: classes2.dex */
public class C6676ao extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length > 0 && abstractC6880eaArr.length <= 3);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        String str = (String) ((C6893ej) abstractC6880eaArr[0]).mo16034b();
        double m16220c = abstractC6880eaArr.length < 2 ? 0.0d : aqf.m16220c(abstractC6880eaArr[1]);
        double length = str.length();
        if (abstractC6880eaArr.length == 3 && abstractC6880eaArr[2] != C6886ee.f23122e) {
            length = aqf.m16220c(abstractC6880eaArr[2]);
        }
        int max = m16220c < C9755a.f30449c ? (int) Math.max(m16220c + str.length(), (double) C9755a.f30449c) : (int) Math.min(m16220c, str.length());
        return new C6893ej(str.substring(max, Math.max(0, (length < C9755a.f30449c ? (int) Math.max(str.length() + length, (double) C9755a.f30449c) : (int) Math.min(length, str.length())) - max) + max));
    }
}
