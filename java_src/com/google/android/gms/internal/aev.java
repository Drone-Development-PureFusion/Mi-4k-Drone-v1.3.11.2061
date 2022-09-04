package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.C3990b;
import com.google.android.gms.auth.api.C3992c;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.aex;
/* loaded from: classes2.dex */
public final class aev extends AbstractC4638w<aex> {

    /* renamed from: a */
    private final Bundle f21376a;

    public aev(Context context, Looper looper, C4626s c4626s, C3992c c3992c, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 16, c4626s, abstractC4491b, abstractC4492c);
        this.f21376a = c3992c == null ? new Bundle() : c3992c.m25843a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public aex mo7440b(IBinder iBinder) {
        return aex.AbstractBinderC6254a.m17829a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: c */
    public Bundle mo9367c() {
        return this.f21376a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: v */
    public boolean mo9364v() {
        C4626s J = J();
        return !TextUtils.isEmpty(J.m23537a()) && !J.m23535a(C3990b.f15370b).isEmpty();
    }
}
