package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.dc */
/* loaded from: classes2.dex */
class C9154dc extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28911a = EnumC6890eg.APP_ID.toString();

    /* renamed from: b */
    private final Context f28912b;

    public C9154dc(Context context) {
        super(f28911a, new String[0]);
        this.f28912b = context;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        return C9147cw.m9111f(this.f28912b.getPackageName());
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
