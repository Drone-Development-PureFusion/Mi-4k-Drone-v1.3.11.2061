package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* renamed from: com.google.android.gms.internal.cx */
/* loaded from: classes2.dex */
public class C6821cx extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 2 || abstractC6880eaArr.length == 3);
        try {
            return new C6883eb(Boolean.valueOf(Pattern.compile(aqf.m16218d(abstractC6880eaArr[1]), abstractC6880eaArr.length < 3 ? false : "true".equalsIgnoreCase(aqf.m16218d(abstractC6880eaArr[2])) ? 66 : 64).matcher(aqf.m16218d(abstractC6880eaArr[0])).find()));
        } catch (PatternSyntaxException e) {
            return new C6883eb(false);
        }
    }
}
