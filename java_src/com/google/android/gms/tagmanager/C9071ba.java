package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.ba */
/* loaded from: classes2.dex */
class C9071ba extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28730a = EnumC6890eg.MOBILE_ADWORDS_UNIQUE_ID.toString();

    /* renamed from: b */
    private final Context f28731b;

    public C9071ba(Context context) {
        super(f28730a, new String[0]);
        this.f28731b = context;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        String m9293a = m9293a(this.f28731b);
        return m9293a == null ? C9147cw.m9110g() : C9147cw.m9111f(m9293a);
    }

    /* renamed from: a */
    protected String m9293a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
