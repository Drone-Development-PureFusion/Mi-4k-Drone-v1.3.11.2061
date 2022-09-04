package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.config.internal.C4706c;
import com.google.android.gms.config.internal.C4714e;
/* loaded from: classes2.dex */
public final class ajq {

    /* renamed from: a */
    public static final C4467a.C4478g<C4714e> f22034a = new C4467a.C4478g<>();

    /* renamed from: b */
    static final C4467a.AbstractC4473b<C4714e, C4467a.AbstractC4468a.C4470b> f22035b = new C4467a.AbstractC4473b<C4714e, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.internal.ajq.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C4714e mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C4714e(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: c */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f22036c = new C4467a<>("Config.API", f22035b, f22034a);

    /* renamed from: d */
    public static final ajr f22037d = new C4706c();
}
