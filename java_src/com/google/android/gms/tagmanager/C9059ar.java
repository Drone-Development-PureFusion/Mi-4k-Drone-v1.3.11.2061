package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.tagmanager.ar */
/* loaded from: classes2.dex */
public class C9059ar extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28710a = EnumC6890eg.LANGUAGE.toString();

    public C9059ar() {
        super(f28710a, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        String language;
        Locale locale = Locale.getDefault();
        if (locale != null && (language = locale.getLanguage()) != null) {
            return C9147cw.m9111f(language.toLowerCase());
        }
        return C9147cw.m9110g();
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return false;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: b */
    public /* bridge */ /* synthetic */ String mo8877b() {
        return super.mo8877b();
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: c */
    public /* bridge */ /* synthetic */ Set mo8876c() {
        return super.mo8876c();
    }
}
