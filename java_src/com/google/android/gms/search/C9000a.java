package com.google.android.gms.search;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.aoh;
import com.google.android.gms.internal.aoi;
/* renamed from: com.google.android.gms.search.a */
/* loaded from: classes2.dex */
public class C9000a {

    /* renamed from: d */
    private static final C4467a.AbstractC4473b<aoh, C4467a.AbstractC4468a.C4470b> f28634d = new C4467a.AbstractC4473b<aoh, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.search.a.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public aoh mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new aoh(context, abstractC4491b, abstractC4492c, c4626s);
        }
    };

    /* renamed from: a */
    public static final C4467a.C4478g<aoh> f28631a = new C4467a.C4478g<>();

    /* renamed from: b */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f28632b = new C4467a<>("SearchAuth.API", f28634d, f28631a);

    /* renamed from: c */
    public static final AbstractC9003b f28633c = new aoi();

    /* renamed from: com.google.android.gms.search.a$a */
    /* loaded from: classes2.dex */
    public static class C9002a {

        /* renamed from: a */
        public static final int f28635a = 0;

        /* renamed from: b */
        public static final int f28636b = 8;

        /* renamed from: c */
        public static final int f28637c = 10;

        /* renamed from: d */
        public static final int f28638d = 10000;

        /* renamed from: e */
        public static final int f28639e = 10001;
    }

    private C9000a() {
    }
}
