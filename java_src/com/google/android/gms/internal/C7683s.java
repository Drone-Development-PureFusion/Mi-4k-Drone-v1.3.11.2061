package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.s */
/* loaded from: classes2.dex */
public class C7683s extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 2 || abstractC6880eaArr.length == 3);
        C4588d.m23619b(abstractC6880eaArr[1] instanceof C6887ef);
        if (abstractC6880eaArr.length == 3) {
            C4588d.m23619b(abstractC6880eaArr[2] instanceof C6887ef);
        }
        List<AbstractC6880ea<?>> arrayList = new ArrayList<>();
        if (aqf.m16224a(abstractC6880eaArr[0])) {
            arrayList = ((C6887ef) abstractC6880eaArr[1]).mo16034b();
        } else if (abstractC6880eaArr.length > 2) {
            arrayList = ((C6887ef) abstractC6880eaArr[2]).mo16034b();
        }
        C6886ee m16026a = C6895ek.m16026a(aprVar, arrayList);
        return (!(m16026a instanceof C6886ee) || !C6895ek.m16019d(m16026a)) ? C6886ee.f23122e : m16026a;
    }
}
