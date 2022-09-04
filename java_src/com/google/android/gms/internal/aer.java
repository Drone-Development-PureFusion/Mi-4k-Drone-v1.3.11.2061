package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.aet;
/* loaded from: classes2.dex */
public class aer extends AbstractC4638w<aet> {
    public aer(Context context, Looper looper, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 74, c4626s, abstractC4491b, abstractC4492c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public aet mo7440b(IBinder iBinder) {
        return aet.AbstractBinderC6250a.m17834a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    @NonNull
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.auth.api.accountactivationstate.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    @NonNull
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService";
    }
}
