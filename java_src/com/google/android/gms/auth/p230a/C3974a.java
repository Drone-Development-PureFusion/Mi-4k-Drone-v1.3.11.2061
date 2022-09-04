package com.google.android.gms.auth.p230a;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.aen;
import com.google.android.gms.internal.aeo;
/* renamed from: com.google.android.gms.auth.a.a */
/* loaded from: classes2.dex */
public class C3974a {

    /* renamed from: c */
    private static final C4467a.C4478g<aeo> f15350c = new C4467a.C4478g<>();

    /* renamed from: d */
    private static final C4467a.AbstractC4473b<aeo, C4467a.AbstractC4468a.C4470b> f15351d = new C4467a.AbstractC4473b<aeo, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.auth.a.a.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public aeo mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new aeo(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: a */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f15348a = new C4467a<>("WorkAccount.API", f15351d, f15350c);

    /* renamed from: b */
    public static final AbstractC3976b f15349b = new aen();

    private C3974a() {
    }
}
