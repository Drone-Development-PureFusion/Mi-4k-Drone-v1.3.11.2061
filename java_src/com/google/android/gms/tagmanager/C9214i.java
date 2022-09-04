package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.i */
/* loaded from: classes2.dex */
class C9214i extends AbstractC9229t {

    /* renamed from: a */
    private static final String f29045a = EnumC6890eg.DEVICE_ID.toString();

    /* renamed from: b */
    private final Context f29046b;

    public C9214i(Context context) {
        super(f29045a, new String[0]);
        this.f29046b = context;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        String m8912a = m8912a(this.f29046b);
        return m8912a == null ? C9147cw.m9110g() : C9147cw.m9111f(m8912a);
    }

    /* renamed from: a */
    protected String m8912a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
