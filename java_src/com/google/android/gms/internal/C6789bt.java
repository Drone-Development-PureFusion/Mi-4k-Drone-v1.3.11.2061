package com.google.android.gms.internal;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.bt */
/* loaded from: classes2.dex */
public class C6789bt implements aqe {

    /* renamed from: a */
    private final Context f22885a;

    public C6789bt(Context context) {
        this.f22885a = context;
    }

    /* renamed from: a */
    protected String m16198a(Context context) {
        return Settings.Secure.getString(this.f22885a.getContentResolver(), "android_id");
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
        String m16198a = m16198a(this.f22885a);
        if (m16198a == null) {
            m16198a = "";
        }
        return new C6893ej(m16198a);
    }
}
