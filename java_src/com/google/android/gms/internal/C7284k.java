package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.k */
/* loaded from: classes2.dex */
public class C7284k extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        ArrayList arrayList = new ArrayList();
        int length = abstractC6880eaArr.length;
        for (int i = 0; i < length; i++) {
            AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[i];
            C4588d.m23619b(!(abstractC6880ea instanceof C6886ee) || abstractC6880ea == C6886ee.f23122e || abstractC6880ea == C6886ee.f23121d);
            arrayList.add(abstractC6880ea);
        }
        return new C6887ef(arrayList);
    }
}
