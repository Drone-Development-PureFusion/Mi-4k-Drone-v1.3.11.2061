package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.alg;
/* loaded from: classes2.dex */
public class aks extends akn<alg> {

    /* renamed from: a */
    public static final C4467a.C4478g<aks> f22143a = new C4467a.C4478g<>();

    /* renamed from: e */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f22144e = new C4467a<>("Fitness.INTERNAL_API", new C6462a(), f22143a);

    /* renamed from: com.google.android.gms.internal.aks$a */
    /* loaded from: classes2.dex */
    public static class C6462a extends C4467a.AbstractC4473b<aks, C4467a.AbstractC4468a.C4470b> {
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public aks mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new aks(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    }

    public aks(Context context, Looper looper, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 61, abstractC4491b, abstractC4492c, c4626s);
    }

    @Override // com.google.android.gms.internal.akn, com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public alg mo7440b(IBinder iBinder) {
        return alg.AbstractBinderC6493a.m16960a(iBinder);
    }

    @Override // com.google.android.gms.internal.akn, com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public String mo7443a() {
        return "com.google.android.gms.fitness.InternalApi";
    }

    @Override // com.google.android.gms.internal.akn, com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    public String mo7441b() {
        return "com.google.android.gms.fitness.internal.IGoogleFitInternalApi";
    }
}
