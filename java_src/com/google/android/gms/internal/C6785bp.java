package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.bp */
/* loaded from: classes2.dex */
public class C6785bp implements aqe {

    /* renamed from: a */
    private final AbstractC6880ea<?> f22882a;

    public C6785bp(AbstractC6880ea<?> abstractC6880ea) {
        this.f22882a = (AbstractC6880ea) C4588d.m23627a(abstractC6880ea);
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
        return this.f22882a;
    }
}
