package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4583ak;
import com.google.android.gms.common.internal.C4588d;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class aqm extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23627a(abstractC6880eaArr);
        C4588d.m23619b(abstractC6880eaArr.length == 1 || abstractC6880eaArr.length == 2);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6887ef);
        List<AbstractC6880ea<?>> mo16034b = ((C6887ef) abstractC6880eaArr[0]).mo16034b();
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr.length < 2 ? C6886ee.f23122e : abstractC6880eaArr[1];
        String m16218d = abstractC6880ea == C6886ee.f23122e ? Constants.ACCEPT_TIME_SEPARATOR_SP : aqf.m16218d(abstractC6880ea);
        ArrayList arrayList = new ArrayList();
        for (AbstractC6880ea<?> abstractC6880ea2 : mo16034b) {
            if (abstractC6880ea2 == C6886ee.f23121d || abstractC6880ea2 == C6886ee.f23122e) {
                arrayList.add("");
            } else {
                arrayList.add(aqf.m16218d(abstractC6880ea2));
            }
        }
        return new C6893ej(C4583ak.m23640a(m16218d).m23642a((Iterable<?>) arrayList));
    }
}
