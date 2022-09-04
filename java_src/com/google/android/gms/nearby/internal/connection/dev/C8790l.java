package com.google.android.gms.nearby.internal.connection.dev;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.nearby.connection.dev.AbstractC8767d;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.l */
/* loaded from: classes2.dex */
public final class C8790l implements AbstractC8767d {

    /* renamed from: a */
    public static final C4467a.C4478g<C8789k> f28155a = new C4467a.C4478g<>();

    /* renamed from: b */
    public static final C4467a.AbstractC4473b<C8789k, C4467a.AbstractC4468a.C4470b> f28156b = new C4467a.AbstractC4473b<C8789k, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.nearby.internal.connection.dev.l.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C8789k mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C8789k(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    };
}
