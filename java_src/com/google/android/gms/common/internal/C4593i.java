package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
/* renamed from: com.google.android.gms.common.internal.i */
/* loaded from: classes2.dex */
public class C4593i<T extends IInterface> extends AbstractC4638w<T> {

    /* renamed from: a */
    private final C4467a.AbstractC4479h<T> f17045a;

    public C4593i(Context context, Looper looper, int i, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, C4626s c4626s, C4467a.AbstractC4479h<T> abstractC4479h) {
        super(context, looper, i, c4626s, abstractC4491b, abstractC4492c);
        this.f17045a = abstractC4479h;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return this.f17045a.m24001a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected void mo23578a(int i, T t) {
        this.f17045a.m24000a(i, t);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected T mo7440b(IBinder iBinder) {
        return this.f17045a.m23999a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return this.f17045a.m23998b();
    }

    /* renamed from: h */
    public C4467a.AbstractC4479h<T> m23603h() {
        return this.f17045a;
    }
}
