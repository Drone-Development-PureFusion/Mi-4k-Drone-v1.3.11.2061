package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.l */
/* loaded from: classes2.dex */
public class C7334l extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < abstractC6880eaArr.length - 1; i += 2) {
            String m16218d = aqf.m16218d(abstractC6880eaArr[i]);
            AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[i + 1];
            if ((abstractC6880ea instanceof C6886ee) && abstractC6880ea != C6886ee.f23121d && abstractC6880ea != C6886ee.f23122e) {
                throw new IllegalStateException("Illegal InternalType found in CreateObject.");
            }
            hashMap.put(m16218d, abstractC6880ea);
        }
        return new C6891eh(hashMap);
    }
}
