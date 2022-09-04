package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.aev;
/* renamed from: com.google.android.gms.auth.api.b */
/* loaded from: classes2.dex */
public final class C3990b {

    /* renamed from: a */
    public static final C4467a.C4478g<aev> f15369a = new C4467a.C4478g<>();

    /* renamed from: c */
    private static final C4467a.AbstractC4473b<aev, C3992c> f15371c = new C4467a.AbstractC4473b<aev, C3992c>() { // from class: com.google.android.gms.auth.api.b.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public aev mo7438a(Context context, Looper looper, C4626s c4626s, C3992c c3992c, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new aev(context, looper, c4626s, c3992c, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: b */
    public static final C4467a<C3992c> f15370b = new C4467a<>("Auth.PROXY_API", f15371c, f15369a);
}
