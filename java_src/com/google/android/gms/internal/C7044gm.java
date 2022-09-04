package com.google.android.gms.internal;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.C4538f;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.auth.AbstractC9749w;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.ProviderUserInfo;
/* renamed from: com.google.android.gms.internal.gm */
/* loaded from: classes.dex */
public class C7044gm implements AbstractC9749w {
    @NonNull
    @AbstractC7491om(m14334a = "userId")

    /* renamed from: a */
    private String f23786a;
    @NonNull
    @AbstractC7491om(m14334a = "providerId")

    /* renamed from: b */
    private String f23787b;
    @Nullable
    @AbstractC7491om(m14334a = "displayName")

    /* renamed from: c */
    private String f23788c;
    @Nullable
    @AbstractC7491om(m14334a = "photoUrl")

    /* renamed from: d */
    private String f23789d;
    @AbstractC7022gc
    @Nullable

    /* renamed from: e */
    private Uri f23790e;
    @Nullable
    @AbstractC7491om(m14334a = C4538f.f16922b)

    /* renamed from: f */
    private String f23791f;
    @AbstractC7491om(m14334a = "isEmailVerified")

    /* renamed from: g */
    private boolean f23792g;

    public C7044gm(@NonNull GetAccountInfoUser getAccountInfoUser, @NonNull String str) {
        C4588d.m23627a(getAccountInfoUser);
        C4588d.m23625a(str);
        this.f23786a = C4588d.m23625a(getAccountInfoUser.m7340c());
        this.f23787b = str;
        this.f23791f = getAccountInfoUser.m7342a();
        this.f23788c = getAccountInfoUser.m7339d();
        Uri m7337f = getAccountInfoUser.m7337f();
        if (m7337f != null) {
            this.f23789d = m7337f.toString();
            this.f23790e = m7337f;
        }
        this.f23792g = getAccountInfoUser.m7341b();
    }

    public C7044gm(@NonNull ProviderUserInfo providerUserInfo) {
        C4588d.m23627a(providerUserInfo);
        this.f23786a = C4588d.m23625a(providerUserInfo.m7325a());
        this.f23787b = C4588d.m23625a(providerUserInfo.m7321e());
        this.f23788c = providerUserInfo.m7324b();
        Uri m7322d = providerUserInfo.m7322d();
        if (m7322d != null) {
            this.f23789d = m7322d.toString();
            this.f23790e = m7322d;
        }
        this.f23791f = null;
        this.f23792g = false;
    }

    public C7044gm(@NonNull AbstractC9749w abstractC9749w) {
        C4588d.m23627a(abstractC9749w);
        this.f23786a = C4588d.m23625a(abstractC9749w.mo7233a());
        this.f23787b = C4588d.m23625a(abstractC9749w.mo7232b());
        this.f23788c = abstractC9749w.mo7231c();
        if (abstractC9749w.mo7230d() != null) {
            this.f23790e = abstractC9749w.mo7230d();
            this.f23789d = abstractC9749w.mo7230d().toString();
        }
        this.f23791f = abstractC9749w.mo7229e();
        this.f23792g = abstractC9749w.mo7228f();
    }

    @Override // com.google.firebase.auth.AbstractC9749w
    @NonNull
    /* renamed from: a */
    public String mo7233a() {
        return this.f23786a;
    }

    @Override // com.google.firebase.auth.AbstractC9749w
    @NonNull
    /* renamed from: b */
    public String mo7232b() {
        return this.f23787b;
    }

    @Override // com.google.firebase.auth.AbstractC9749w
    @Nullable
    /* renamed from: c */
    public String mo7231c() {
        return this.f23788c;
    }

    @Override // com.google.firebase.auth.AbstractC9749w
    @Nullable
    /* renamed from: d */
    public Uri mo7230d() {
        if (!TextUtils.isEmpty(this.f23789d) && this.f23790e == null) {
            this.f23790e = Uri.parse(this.f23789d);
        }
        return this.f23790e;
    }

    @Override // com.google.firebase.auth.AbstractC9749w
    @Nullable
    /* renamed from: e */
    public String mo7229e() {
        return this.f23791f;
    }

    @Override // com.google.firebase.auth.AbstractC9749w
    /* renamed from: f */
    public boolean mo7228f() {
        return this.f23792g;
    }
}
