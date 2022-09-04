package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C6716app;
/* renamed from: com.google.android.gms.internal.bj */
/* loaded from: classes2.dex */
public class C6779bj extends aqg {

    /* renamed from: a */
    private final Context f22875a;

    /* renamed from: b */
    private final C6716app.AbstractC6720c f22876b;

    public C6779bj(Context context, C6716app.AbstractC6720c abstractC6720c) {
        this.f22875a = (Context) C4588d.m23627a(context);
        this.f22876b = abstractC6720c;
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length == 0 || abstractC6880eaArr[0] == C6886ee.f23122e) {
            return new C6893ej("");
        }
        Object obj = this.f22876b.mo16320a().m16427g().get("_ldl");
        if (obj == null) {
            return new C6893ej("");
        }
        AbstractC6880ea<?> m16024a = C6895ek.m16024a(obj);
        if (!(m16024a instanceof C6893ej)) {
            return new C6893ej("");
        }
        String str = (String) ((C6893ej) m16024a).mo16034b();
        if (!apg.m16398a(str, "conv").equals(aqf.m16218d(abstractC6880eaArr[0]))) {
            return new C6893ej("");
        }
        String m16398a = apg.m16398a(str, abstractC6880eaArr.length > 1 ? abstractC6880eaArr[1] == C6886ee.f23122e ? null : aqf.m16218d(abstractC6880eaArr[1]) : null);
        return m16398a != null ? new C6893ej(m16398a) : new C6893ej("");
    }
}
