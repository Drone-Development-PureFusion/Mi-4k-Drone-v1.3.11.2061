package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.wearable.internal.C9478aa;
import com.google.android.gms.wearable.internal.C9486ad;
import com.google.android.gms.wearable.internal.C9503ao;
import com.google.android.gms.wearable.internal.C9527ar;
import com.google.android.gms.wearable.internal.C9538at;
import com.google.android.gms.wearable.internal.C9541aw;
import com.google.android.gms.wearable.internal.C9543ay;
import com.google.android.gms.wearable.internal.C9547bb;
import com.google.android.gms.wearable.internal.C9560bd;
import com.google.android.gms.wearable.internal.C9577bo;
import com.google.android.gms.wearable.internal.C9578bp;
/* renamed from: com.google.android.gms.wearable.r */
/* loaded from: classes2.dex */
public class C9641r {

    /* renamed from: a */
    public static final AbstractC9458e f30163a = new C9578bp();

    /* renamed from: b */
    public static final AbstractC9441a f30164b = new C9547bb();

    /* renamed from: c */
    public static final AbstractC9630m f30165c = new C9478aa();

    /* renamed from: d */
    public static final AbstractC9636p f30166d = new C9486ad();

    /* renamed from: e */
    public static final AbstractC9453c f30167e = new C9560bd();

    /* renamed from: f */
    public static final AbstractC9648v f30168f = new C9543ay();

    /* renamed from: g */
    public static final AbstractC9646t f30169g = new C9541aw();

    /* renamed from: h */
    public static final AbstractC9651y f30170h = new C9577bo();

    /* renamed from: i */
    public static final AbstractC9450ab f30171i = new C9503ao();

    /* renamed from: j */
    public static final AbstractC9451ac f30172j = new C9538at();

    /* renamed from: k */
    public static final C4467a.C4478g<C9527ar> f30173k = new C4467a.C4478g<>();

    /* renamed from: m */
    private static final C4467a.AbstractC4473b<C9527ar, C9643a> f30175m = new C4467a.AbstractC4473b<C9527ar, C9643a>() { // from class: com.google.android.gms.wearable.r.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C9527ar mo7438a(Context context, Looper looper, C4626s c4626s, C9643a c9643a, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            if (c9643a == null) {
                new C9643a(new C9643a.C9644a());
            }
            return new C9527ar(context, looper, abstractC4491b, abstractC4492c, c4626s);
        }
    };

    /* renamed from: l */
    public static final C4467a<C9643a> f30174l = new C4467a<>("Wearable.API", f30175m, f30173k);

    /* renamed from: com.google.android.gms.wearable.r$a */
    /* loaded from: classes2.dex */
    public static final class C9643a implements C4467a.AbstractC4468a.AbstractC4472d {

        /* renamed from: com.google.android.gms.wearable.r$a$a */
        /* loaded from: classes2.dex */
        public static class C9644a {
            /* renamed from: a */
            public C9643a m7548a() {
                return new C9643a(this);
            }
        }

        private C9643a(C9644a c9644a) {
        }
    }

    private C9641r() {
    }
}
