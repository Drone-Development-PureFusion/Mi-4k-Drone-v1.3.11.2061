package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.nearby.bootstrap.AbstractC8745a;
/* loaded from: classes2.dex */
public class amy implements AbstractC8745a {

    /* renamed from: a */
    public static final C4467a.C4478g<amx> f22412a = new C4467a.C4478g<>();

    /* renamed from: b */
    public static final C4467a.AbstractC4473b<amx, C4467a.AbstractC4468a.C4470b> f22413b = new C4467a.AbstractC4473b<amx, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.internal.amy.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public amx mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new amx(context, looper, abstractC4491b, abstractC4492c, c4626s);
        }
    };
}
