package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.AbstractC4068g;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
/* renamed from: com.google.android.gms.auth.api.signin.internal.c */
/* loaded from: classes2.dex */
public class C4061c extends AbstractC4638w<AbstractC4068g> {

    /* renamed from: a */
    private final GoogleSignInOptions f15569a;

    public C4061c(Context context, Looper looper, C4626s c4626s, GoogleSignInOptions googleSignInOptions, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(context, looper, 91, c4626s, abstractC4491b, abstractC4492c);
        googleSignInOptions = googleSignInOptions == null ? new GoogleSignInOptions.C4043a().m25642d() : googleSignInOptions;
        if (!c4626s.m23529f().isEmpty()) {
            GoogleSignInOptions.C4043a c4043a = new GoogleSignInOptions.C4043a(googleSignInOptions);
            for (Scope scope : c4626s.m23529f()) {
                c4043a.m25649a(scope, new Scope[0]);
            }
            googleSignInOptions = c4043a.m25642d();
        }
        this.f15569a = googleSignInOptions;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC4068g mo7440b(IBinder iBinder) {
        return AbstractC4068g.AbstractBinderC4069a.m25593a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: e */
    public Intent mo23565e() {
        SignInConfiguration signInConfiguration = new SignInConfiguration(B().getPackageName(), this.f15569a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setClass(B(), SignInHubActivity.class);
        intent.putExtra("config", signInConfiguration);
        return intent;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: m_ */
    public boolean mo23561m_() {
        return true;
    }

    /* renamed from: n_ */
    public GoogleSignInOptions m25601n_() {
        return this.f15569a;
    }
}
