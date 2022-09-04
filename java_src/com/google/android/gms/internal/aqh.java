package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class aqh extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23627a(abstractC6880eaArr);
        C4588d.m23619b(abstractC6880eaArr.length >= 1);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6887ef);
        ArrayList arrayList = new ArrayList();
        for (AbstractC6880ea<?> abstractC6880ea : ((C6887ef) abstractC6880eaArr[0]).mo16034b()) {
            arrayList.add(abstractC6880ea);
        }
        for (int i = 1; i < abstractC6880eaArr.length; i++) {
            if (abstractC6880eaArr[i] instanceof C6887ef) {
                for (AbstractC6880ea<?> abstractC6880ea2 : ((C6887ef) abstractC6880eaArr[i]).mo16034b()) {
                    arrayList.add(abstractC6880ea2);
                }
            } else {
                arrayList.add(abstractC6880eaArr[i]);
            }
        }
        return new C6887ef(arrayList);
    }
}
