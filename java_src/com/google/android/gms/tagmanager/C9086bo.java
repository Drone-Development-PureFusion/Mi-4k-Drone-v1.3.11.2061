package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.bo */
/* loaded from: classes2.dex */
class C9086bo extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28739a = EnumC6890eg.OS_VERSION.toString();

    public C9086bo() {
        super(f28739a, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        return C9147cw.m9111f(Build.VERSION.RELEASE);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
