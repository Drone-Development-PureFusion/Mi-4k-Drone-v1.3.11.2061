package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.internal.al */
/* loaded from: classes2.dex */
public class C6480al extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 1 || abstractC6880eaArr.length == 2);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        Matcher matcher = Pattern.compile(abstractC6880eaArr.length < 2 ? "" : aqf.m16218d(abstractC6880eaArr[1])).matcher((String) ((C6893ej) abstractC6880eaArr[0]).mo16034b());
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C6893ej(matcher.group()));
            return new C6887ef(arrayList);
        }
        return C6886ee.f23121d;
    }
}
