package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.aog;
/* loaded from: classes2.dex */
public class aoh extends AbstractC4638w<aog> {
    public aoh(Context context, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, C4626s c4626s) {
        super(context, context.getMainLooper(), 73, c4626s, abstractC4491b, abstractC4492c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public aog mo7440b(IBinder iBinder) {
        return aog.AbstractBinderC6681a.m16518a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.search.service.SEARCH_AUTH_START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.search.internal.ISearchAuthService";
    }
}
