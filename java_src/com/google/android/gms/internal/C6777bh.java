package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.bh */
/* loaded from: classes2.dex */
public class C6777bh implements aqe {

    /* renamed from: a */
    private final aoo f22873a;

    public C6777bh(Context context) {
        this(aoo.m16479a(context));
    }

    C6777bh(aoo aooVar) {
        this.f22873a = aooVar;
    }

    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 0) {
            z = false;
        }
        C4588d.m23619b(z);
        String m16480a = this.f22873a.m16480a();
        return m16480a == null ? C6886ee.f23122e : new C6893ej(m16480a);
    }
}
