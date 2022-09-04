package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C6716app;
/* renamed from: com.google.android.gms.internal.cg */
/* loaded from: classes2.dex */
public class C6804cg extends aqg {

    /* renamed from: a */
    private final Context f22902a;

    /* renamed from: b */
    private final C6716app.AbstractC6720c f22903b;

    public C6804cg(Context context, C6716app.AbstractC6720c abstractC6720c) {
        this.f22902a = context;
        this.f22903b = abstractC6720c;
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length >= 1);
        Object obj = this.f22903b.mo16320a().m16427g().get(aqf.m16218d(abstractC6880eaArr[0]));
        AbstractC6880ea<?> abstractC6880ea = obj;
        if (obj == null) {
            abstractC6880ea = obj;
            if (abstractC6880eaArr.length > 1) {
                abstractC6880ea = abstractC6880eaArr[1];
            }
        }
        return C6895ek.m16024a((Object) abstractC6880ea);
    }
}
