package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.List;
/* loaded from: classes2.dex */
public class aqq extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23627a(abstractC6880eaArr);
        if (abstractC6880eaArr.length != 1) {
            z = false;
        }
        C4588d.m23619b(z);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6887ef);
        List<AbstractC6880ea<?>> mo16034b = ((C6887ef) abstractC6880eaArr[0]).mo16034b();
        return !mo16034b.isEmpty() ? mo16034b.remove(mo16034b.size() - 1) : C6886ee.f23122e;
    }
}
