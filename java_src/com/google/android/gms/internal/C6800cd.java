package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.Locale;
/* renamed from: com.google.android.gms.internal.cd */
/* loaded from: classes2.dex */
public class C6800cd implements aqe {
    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        String language;
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 0) {
            z = false;
        }
        C4588d.m23619b(z);
        Locale locale = Locale.getDefault();
        if (locale != null && (language = locale.getLanguage()) != null) {
            return new C6893ej(language.toLowerCase());
        }
        return new C6893ej("");
    }
}
