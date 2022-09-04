package com.google.android.gms.auth.api.signin;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.auth.api.signin.b */
/* loaded from: classes2.dex */
public class C4045b implements AbstractC4502m {

    /* renamed from: a */
    private Status f15547a;

    /* renamed from: b */
    private GoogleSignInAccount f15548b;

    public C4045b(@Nullable GoogleSignInAccount googleSignInAccount, @NonNull Status status) {
        this.f15548b = googleSignInAccount;
        this.f15547a = status;
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    @NonNull
    /* renamed from: a */
    public Status mo7645a() {
        return this.f15547a;
    }

    @Nullable
    /* renamed from: b */
    public GoogleSignInAccount m25638b() {
        return this.f15548b;
    }

    /* renamed from: c */
    public boolean m25637c() {
        return this.f15547a.m24018f();
    }
}
