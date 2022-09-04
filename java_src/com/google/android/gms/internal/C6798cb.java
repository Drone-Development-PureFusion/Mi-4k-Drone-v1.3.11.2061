package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.cb */
/* loaded from: classes2.dex */
public class C6798cb implements aqe {

    /* renamed from: a */
    private Context f22891a;

    public C6798cb(Context context) {
        this.f22891a = (Context) C4588d.m23627a(context);
    }

    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        String str = null;
        if (abstractC6880eaArr.length > 0 && abstractC6880eaArr[0] != C6886ee.f23122e) {
            str = aqf.m16218d(C6895ek.m16028a(aprVar, abstractC6880eaArr[0]));
        }
        String m16399a = apg.m16399a(this.f22891a, str);
        return m16399a != null ? new C6893ej(m16399a) : C6886ee.f23122e;
    }
}
