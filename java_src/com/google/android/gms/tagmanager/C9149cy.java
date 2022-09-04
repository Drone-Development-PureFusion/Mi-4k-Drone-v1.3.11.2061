package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.cy */
/* loaded from: classes2.dex */
class C9149cy extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28905a = EnumC6890eg.UPPERCASE_STRING.toString();

    /* renamed from: b */
    private static final String f28906b = EnumC6958fh.ARG0.toString();

    public C9149cy() {
        super(f28905a, f28906b);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        return C9147cw.m9111f(C9147cw.m9132a(map.get(f28906b)).toUpperCase());
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
