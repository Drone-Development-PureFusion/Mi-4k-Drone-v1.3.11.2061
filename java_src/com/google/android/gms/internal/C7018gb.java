package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
/* renamed from: com.google.android.gms.internal.gb */
/* loaded from: classes2.dex */
public final class C7018gb {

    /* renamed from: a */
    public static final C4467a.C4478g<AbstractC7006fu> f23698a = new C4467a.C4478g<>();

    /* renamed from: c */
    private static final C4467a.AbstractC4473b<AbstractC7006fu, C7020a> f23700c = new C4467a.AbstractC4473b<AbstractC7006fu, C7020a>() { // from class: com.google.android.gms.internal.gb.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public AbstractC7006fu mo7438a(Context context, Looper looper, C4626s c4626s, C7020a c7020a, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C7007fv(context, looper, c4626s, c7020a, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: b */
    public static final C4467a<C7020a> f23699b = new C4467a<>("InternalFirebaseAuth.FIREBASE_AUTH_API", f23700c, f23698a);

    /* renamed from: com.google.android.gms.internal.gb$a */
    /* loaded from: classes2.dex */
    public static final class C7020a implements C4467a.AbstractC4468a.AbstractC4469a {

        /* renamed from: a */
        private final String f23701a;

        /* renamed from: com.google.android.gms.internal.gb$a$a */
        /* loaded from: classes2.dex */
        public static final class C7021a {

            /* renamed from: a */
            private String f23702a;

            public C7021a(@NonNull String str) {
                this.f23702a = C4588d.m23625a(str);
            }

            /* renamed from: a */
            public C7020a m15776a() {
                return new C7020a(this.f23702a);
            }
        }

        private C7020a(@NonNull String str) {
            this.f23701a = C4588d.m23624a(str, (Object) "A valid API key must be provided");
        }

        /* renamed from: a */
        public String m15777a() {
            return this.f23701a;
        }
    }

    /* renamed from: a */
    public static C6984ft m15779a(Context context, C7020a c7020a) {
        return new C6984ft(context, c7020a);
    }
}
