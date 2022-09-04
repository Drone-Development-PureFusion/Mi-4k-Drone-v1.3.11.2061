package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.AbstractC4004b;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.auth.api.credentials.internal.C4016e;
import com.google.android.gms.auth.api.credentials.internal.C4024g;
import com.google.android.gms.auth.api.proxy.AbstractC4036b;
import com.google.android.gms.auth.api.signin.AbstractC4044a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C4053b;
import com.google.android.gms.auth.api.signin.internal.C4061c;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.aep;
import com.google.android.gms.internal.aeq;
import com.google.android.gms.internal.aer;
import com.google.android.gms.internal.aez;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.auth.api.a */
/* loaded from: classes2.dex */
public final class C3984a {

    /* renamed from: a */
    public static final C4467a.C4478g<C4024g> f15354a = new C4467a.C4478g<>();

    /* renamed from: b */
    public static final C4467a.C4478g<aer> f15355b = new C4467a.C4478g<>();

    /* renamed from: c */
    public static final C4467a.C4478g<C4061c> f15356c = new C4467a.C4478g<>();

    /* renamed from: l */
    private static final C4467a.AbstractC4473b<C4024g, C3988a> f15365l = new C4467a.AbstractC4473b<C4024g, C3988a>() { // from class: com.google.android.gms.auth.api.a.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C4024g mo7438a(Context context, Looper looper, C4626s c4626s, C3988a c3988a, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C4024g(context, looper, c4626s, c3988a, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: m */
    private static final C4467a.AbstractC4473b<aer, C4467a.AbstractC4468a.C4470b> f15366m = new C4467a.AbstractC4473b<aer, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.auth.api.a.2
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public aer mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new aer(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: n */
    private static final C4467a.AbstractC4473b<C4061c, GoogleSignInOptions> f15367n = new C4467a.AbstractC4473b<C4061c, GoogleSignInOptions>() { // from class: com.google.android.gms.auth.api.a.3
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C4061c mo7438a(Context context, Looper looper, C4626s c4626s, @Nullable GoogleSignInOptions googleSignInOptions, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C4061c(context, looper, c4626s, googleSignInOptions, abstractC4491b, abstractC4492c);
        }

        @Override // com.google.android.gms.common.api.C4467a.AbstractC4476e
        /* renamed from: a */
        public List<Scope> mo20498a(@Nullable GoogleSignInOptions googleSignInOptions) {
            return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.m25669a();
        }
    };

    /* renamed from: d */
    public static final C4467a<C3992c> f15357d = C3990b.f15370b;

    /* renamed from: e */
    public static final C4467a<C3988a> f15358e = new C4467a<>("Auth.CREDENTIALS_API", f15365l, f15354a);

    /* renamed from: f */
    public static final C4467a<GoogleSignInOptions> f15359f = new C4467a<>("Auth.GOOGLE_SIGN_IN_API", f15367n, f15356c);

    /* renamed from: g */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f15360g = new C4467a<>("Auth.ACCOUNT_STATUS_API", f15366m, f15355b);

    /* renamed from: h */
    public static final AbstractC4036b f15361h = new aez();

    /* renamed from: i */
    public static final AbstractC4004b f15362i = new C4016e();

    /* renamed from: j */
    public static final aep f15363j = new aeq();

    /* renamed from: k */
    public static final AbstractC4044a f15364k = new C4053b();

    /* renamed from: com.google.android.gms.auth.api.a$a */
    /* loaded from: classes2.dex */
    public static final class C3988a implements C4467a.AbstractC4468a.AbstractC4472d {

        /* renamed from: com.google.android.gms.auth.api.a$a$a */
        /* loaded from: classes2.dex */
        public static class C3989a {
            @NonNull

            /* renamed from: a */
            private PasswordSpecification f15368a = PasswordSpecification.f15422a;
        }

        /* renamed from: a */
        public PasswordSpecification m25846a() {
            return null;
        }

        /* renamed from: b */
        public Bundle m25845b() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putParcelable("password_specification", null);
            return bundle;
        }
    }

    private C3984a() {
    }
}
