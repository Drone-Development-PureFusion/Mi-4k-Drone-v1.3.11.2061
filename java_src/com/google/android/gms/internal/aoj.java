package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C4538f;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.signin.internal.C9016g;
/* loaded from: classes2.dex */
public final class aoj {

    /* renamed from: a */
    public static final C4467a.C4478g<C9016g> f22582a = new C4467a.C4478g<>();

    /* renamed from: b */
    public static final C4467a.C4478g<C9016g> f22583b = new C4467a.C4478g<>();

    /* renamed from: c */
    public static final C4467a.AbstractC4473b<C9016g, aom> f22584c = new C4467a.AbstractC4473b<C9016g, aom>() { // from class: com.google.android.gms.internal.aoj.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C9016g mo7438a(Context context, Looper looper, C4626s c4626s, aom aomVar, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C9016g(context, looper, true, c4626s, aomVar == null ? aom.f22590a : aomVar, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: d */
    static final C4467a.AbstractC4473b<C9016g, C6691a> f22585d = new C4467a.AbstractC4473b<C9016g, C6691a>() { // from class: com.google.android.gms.internal.aoj.2
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C9016g mo7438a(Context context, Looper looper, C4626s c4626s, C6691a c6691a, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C9016g(context, looper, false, c4626s, c6691a.m16504a(), abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: e */
    public static final Scope f22586e = new Scope(C4538f.f16921a);

    /* renamed from: f */
    public static final Scope f22587f = new Scope(C4538f.f16922b);

    /* renamed from: g */
    public static final C4467a<aom> f22588g = new C4467a<>("SignIn.API", f22584c, f22582a);

    /* renamed from: h */
    public static final C4467a<C6691a> f22589h = new C4467a<>("SignIn.INTERNAL_API", f22585d, f22583b);

    /* renamed from: com.google.android.gms.internal.aoj$a */
    /* loaded from: classes2.dex */
    public static class C6691a implements C4467a.AbstractC4468a.AbstractC4469a {
        /* renamed from: a */
        public Bundle m16504a() {
            return null;
        }
    }
}
