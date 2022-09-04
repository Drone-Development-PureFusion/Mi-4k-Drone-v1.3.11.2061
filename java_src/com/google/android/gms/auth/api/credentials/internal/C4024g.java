package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.C3984a;
import com.google.android.gms.auth.api.credentials.internal.AbstractC4030k;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
/* renamed from: com.google.android.gms.auth.api.credentials.internal.g */
/* loaded from: classes2.dex */
public final class C4024g extends AbstractC4638w<AbstractC4030k> {
    @Nullable

    /* renamed from: a */
    private final C3984a.C3988a f15464a;

    public C4024g(Context context, Looper looper, C4626s c4626s, C3984a.C3988a c3988a, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 68, c4626s, abstractC4491b, abstractC4492c);
        this.f15464a = c3988a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC4030k mo7440b(IBinder iBinder) {
        return AbstractC4030k.AbstractBinderC4031a.m25716a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: c */
    public Bundle mo9367c() {
        return this.f15464a == null ? new Bundle() : this.f15464a.m25845b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C3984a.C3988a m25727d() {
        return this.f15464a;
    }
}
