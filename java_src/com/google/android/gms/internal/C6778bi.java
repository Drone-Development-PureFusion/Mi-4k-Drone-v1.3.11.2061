package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.bi */
/* loaded from: classes2.dex */
public class C6778bi implements aqe {

    /* renamed from: a */
    private final aoo f22874a;

    public C6778bi(Context context) {
        this(aoo.m16479a(context));
    }

    C6778bi(aoo aooVar) {
        this.f22874a = aooVar;
    }

    @Override // com.google.android.gms.internal.aqe
    /* renamed from: a_ */
    public AbstractC6880ea<?> mo12846a_(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 0);
        if (this.f22874a.m16476b()) {
            z = false;
        }
        return new C6883eb(Boolean.valueOf(z));
    }
}
