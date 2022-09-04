package com.google.android.gms.internal;

import android.os.Build;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.co */
/* loaded from: classes2.dex */
public class C6812co implements aqe {
    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 0) {
            z = false;
        }
        C4588d.m23619b(z);
        return new C6884ec(Double.valueOf(Build.VERSION.SDK_INT));
    }
}
