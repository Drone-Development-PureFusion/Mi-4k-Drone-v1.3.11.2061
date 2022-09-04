package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.do */
/* loaded from: classes2.dex */
class C9181do extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28970a = EnumC6890eg.CONTAINER_VERSION.toString();

    /* renamed from: b */
    private final String f28971b;

    public C9181do(String str) {
        super(f28970a, new String[0]);
        this.f28971b = str;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        return this.f28971b == null ? C9147cw.m9110g() : C9147cw.m9111f(this.f28971b);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
