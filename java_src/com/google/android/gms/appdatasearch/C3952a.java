package com.google.android.gms.appdatasearch;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.aee;
import com.google.android.gms.internal.aeh;
/* renamed from: com.google.android.gms.appdatasearch.a */
/* loaded from: classes2.dex */
public final class C3952a {

    /* renamed from: a */
    public static final C4467a.C4478g<aee> f15294a = new C4467a.C4478g<>();

    /* renamed from: d */
    private static final C4467a.AbstractC4473b<aee, C4467a.AbstractC4468a.C4470b> f15297d = new C4467a.AbstractC4473b<aee, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.appdatasearch.a.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public aee mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new aee(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: b */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f15295b = new C4467a<>("AppDataSearch.LIGHTWEIGHT_API", f15297d, f15294a);

    /* renamed from: c */
    public static final AbstractC3963k f15296c = new aeh();
}
