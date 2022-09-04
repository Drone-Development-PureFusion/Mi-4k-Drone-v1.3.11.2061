package com.google.android.gms.safetynet;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.anx;
import com.google.android.gms.internal.any;
import com.google.android.gms.internal.anz;
/* renamed from: com.google.android.gms.safetynet.b */
/* loaded from: classes2.dex */
public final class C8988b {

    /* renamed from: a */
    public static final C4467a.C4478g<any> f28619a = new C4467a.C4478g<>();

    /* renamed from: b */
    public static final C4467a.AbstractC4473b<any, C4467a.AbstractC4468a.C4470b> f28620b = new C4467a.AbstractC4473b<any, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.safetynet.b.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public any mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new any(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: c */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f28621c = new C4467a<>("SafetyNet.API", f28620b, f28619a);

    /* renamed from: d */
    public static final AbstractC8990c f28622d = new anx();

    /* renamed from: e */
    public static final AbstractC8999h f28623e = new anz();

    private C8988b() {
    }
}
