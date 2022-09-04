package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.e */
/* loaded from: classes2.dex */
public class C6879e extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 1);
        C4588d.m23619b(!(abstractC6880eaArr[0] instanceof C6892ei));
        if (C6895ek.m16019d(abstractC6880eaArr[0])) {
            z = false;
        }
        C4588d.m23619b(z);
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[0];
        String str = "object";
        if (abstractC6880ea == C6886ee.f23122e) {
            str = "undefined";
        } else if (abstractC6880ea instanceof C6883eb) {
            str = "boolean";
        } else if (abstractC6880ea instanceof C6884ec) {
            str = "number";
        } else if (abstractC6880ea instanceof C6893ej) {
            str = "string";
        } else if (abstractC6880ea instanceof C6885ed) {
            str = "function";
        }
        return new C6893ej(str);
    }
}
