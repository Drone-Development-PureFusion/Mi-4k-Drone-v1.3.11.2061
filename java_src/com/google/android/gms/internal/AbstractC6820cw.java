package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.cw */
/* loaded from: classes2.dex */
public abstract class AbstractC6820cw extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 2) {
            z = false;
        }
        C4588d.m23619b(z);
        try {
            double m16222b = aqf.m16222b(abstractC6880eaArr[0]);
            double m16222b2 = aqf.m16222b(abstractC6880eaArr[1]);
            return (Double.isNaN(m16222b) || Double.isNaN(m16222b2)) ? new C6883eb(false) : new C6883eb(Boolean.valueOf(mo16189a(m16222b, m16222b2)));
        } catch (IllegalArgumentException e) {
            return new C6883eb(false);
        }
    }

    /* renamed from: a */
    protected abstract boolean mo16189a(double d, double d2);
}
