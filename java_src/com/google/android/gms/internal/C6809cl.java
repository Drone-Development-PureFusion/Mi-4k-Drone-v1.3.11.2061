package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.p253b.C9755a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* renamed from: com.google.android.gms.internal.cl */
/* loaded from: classes2.dex */
public class C6809cl extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        int i;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length >= 2);
        if (abstractC6880eaArr[0] == C6886ee.f23122e || abstractC6880eaArr[1] == C6886ee.f23122e) {
            return C6886ee.f23122e;
        }
        String m16218d = aqf.m16218d(abstractC6880eaArr[0]);
        String m16218d2 = aqf.m16218d(abstractC6880eaArr[1]);
        int i2 = 64;
        if (abstractC6880eaArr.length > 2 && abstractC6880eaArr[2] != C6886ee.f23122e && aqf.m16224a(abstractC6880eaArr[2])) {
            i2 = 66;
        }
        if (abstractC6880eaArr.length <= 3 || abstractC6880eaArr[3] == C6886ee.f23122e) {
            i = 1;
        } else if (!(abstractC6880eaArr[3] instanceof C6884ec)) {
            return C6886ee.f23122e;
        } else {
            double m16220c = aqf.m16220c(abstractC6880eaArr[3]);
            if (Double.isInfinite(m16220c) || m16220c < C9755a.f30449c) {
                return C6886ee.f23122e;
            }
            i = (int) m16220c;
        }
        String str = null;
        try {
            Matcher matcher = Pattern.compile(m16218d2, i2).matcher(m16218d);
            if (matcher.find() && matcher.groupCount() >= i) {
                str = matcher.group(i);
            }
            return str == null ? C6886ee.f23122e : new C6893ej(str);
        } catch (PatternSyntaxException e) {
            return C6886ee.f23122e;
        }
    }
}
