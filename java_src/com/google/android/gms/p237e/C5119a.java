package com.google.android.gms.p237e;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.anm;
import com.google.android.gms.internal.ann;
/* renamed from: com.google.android.gms.e.a */
/* loaded from: classes2.dex */
public final class C5119a {

    /* renamed from: a */
    public static final C4467a.C4478g<ann> f18205a = new C4467a.C4478g<>();

    /* renamed from: b */
    static final C4467a.AbstractC4473b<ann, C4467a.AbstractC4468a.C4470b> f18206b = new C4467a.AbstractC4473b<ann, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.e.a.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public ann mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new ann(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: c */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f18207c = new C4467a<>("Panorama.API", f18206b, f18205a);

    /* renamed from: d */
    public static final AbstractC5121b f18208d = new anm();

    private C5119a() {
    }
}
