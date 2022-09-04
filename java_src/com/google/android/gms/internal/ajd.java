package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
/* loaded from: classes2.dex */
public final class ajd {

    /* renamed from: a */
    public static final C4467a.C4478g<aji> f22005a = new C4467a.C4478g<>();

    /* renamed from: d */
    private static final C4467a.AbstractC4473b<aji, C4467a.AbstractC4468a.C4470b> f22008d = new C4467a.AbstractC4473b<aji, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.internal.ajd.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public aji mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new aji(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: b */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f22006b = new C4467a<>("Common.API", f22008d, f22005a);

    /* renamed from: c */
    public static final aje f22007c = new ajf();
}
