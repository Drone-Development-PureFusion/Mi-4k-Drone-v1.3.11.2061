package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.u */
/* loaded from: classes2.dex */
public class C7777u implements aqe {
    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        ArrayList arrayList = new ArrayList(abstractC6880eaArr.length);
        for (AbstractC6880ea<?> abstractC6880ea : abstractC6880eaArr) {
            arrayList.add(abstractC6880ea);
        }
        return new C6887ef(arrayList);
    }
}
