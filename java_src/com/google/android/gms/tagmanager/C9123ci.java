package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.ci */
/* loaded from: classes2.dex */
class C9123ci extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28834a = EnumC6890eg.SDK_VERSION.toString();

    public C9123ci() {
        super(f28834a, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        return C9147cw.m9111f(Integer.valueOf(Build.VERSION.SDK_INT));
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
