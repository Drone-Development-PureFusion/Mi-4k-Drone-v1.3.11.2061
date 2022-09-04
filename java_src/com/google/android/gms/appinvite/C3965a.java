package com.google.android.gms.appinvite;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.aei;
import com.google.android.gms.internal.aej;
/* renamed from: com.google.android.gms.appinvite.a */
/* loaded from: classes2.dex */
public final class C3965a {

    /* renamed from: a */
    public static final C4467a.C4478g<aej> f15316a = new C4467a.C4478g<>();

    /* renamed from: d */
    private static final C4467a.AbstractC4473b<aej, C4467a.AbstractC4468a.C4470b> f15319d = new C4467a.AbstractC4473b<aej, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.appinvite.a.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public aej mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new aej(context, looper, abstractC4491b, abstractC4492c, c4626s);
        }
    };

    /* renamed from: b */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f15317b = new C4467a<>("AppInvite.API", f15319d, f15316a);

    /* renamed from: c */
    public static final AbstractC3967b f15318c = new aei();

    private C3965a() {
    }
}
