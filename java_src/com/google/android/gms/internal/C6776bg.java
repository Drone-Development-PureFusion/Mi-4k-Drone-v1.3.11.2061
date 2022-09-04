package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C6716app;
/* renamed from: com.google.android.gms.internal.bg */
/* loaded from: classes2.dex */
public class C6776bg extends aqg {

    /* renamed from: a */
    private final C6716app.AbstractC6720c f22872a;

    public C6776bg(Context context, C6716app.AbstractC6720c abstractC6720c) {
        this.f22872a = abstractC6720c;
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 0) {
            z = false;
        }
        C4588d.m23619b(z);
        this.f22872a.mo16320a().m16433a(false);
        return C6886ee.f23122e;
    }
}
