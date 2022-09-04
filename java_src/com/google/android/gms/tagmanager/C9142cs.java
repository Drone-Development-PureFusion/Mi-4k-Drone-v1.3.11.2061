package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.cs */
/* loaded from: classes2.dex */
class C9142cs extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28871a = EnumC6890eg.TIME.toString();

    public C9142cs() {
        super(f28871a, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        return C9147cw.m9111f(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return false;
    }
}
