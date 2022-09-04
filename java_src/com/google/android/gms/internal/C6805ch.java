package com.google.android.gms.internal;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.ch */
/* loaded from: classes2.dex */
public class C6805ch implements aqe {

    /* renamed from: a */
    private final Context f22904a;

    public C6805ch(Context context) {
        this.f22904a = (Context) C4588d.m23627a(context);
    }

    /* renamed from: a */
    public String m16191a() {
        return Settings.Secure.getString(this.f22904a.getContentResolver(), "android_id");
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
        String m16191a = m16191a();
        return m16191a != null ? new C6893ej(m16191a) : C6886ee.f23122e;
    }
}
