package com.google.firebase.auth;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import com.tencent.p263mm.sdk.plugin.MMPluginProviderConstants;
/* renamed from: com.google.firebase.auth.r */
/* loaded from: classes2.dex */
public class C9744r extends AbstractC9718a {

    /* renamed from: a */
    private final String f30422a;

    /* renamed from: b */
    private final String f30423b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9744r(@Nullable String str, @Nullable String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        this.f30422a = m7243a(str, "idToken");
        this.f30423b = m7243a(str2, MMPluginProviderConstants.OAuth.ACCESS_TOKEN);
    }

    /* renamed from: a */
    public static VerifyAssertionRequest m7244a(@NonNull C9744r c9744r) {
        C4588d.m23627a(c9744r);
        return new VerifyAssertionRequest(c9744r.m7241c(), c9744r.m7242b(), c9744r.mo7238a(), null, null);
    }

    /* renamed from: a */
    private static String m7243a(String str, String str2) {
        if (str == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(str2).concat(" must not be empty"));
    }

    @Override // com.google.firebase.auth.AbstractC9718a
    /* renamed from: a */
    public String mo7238a() {
        return C9745s.f30424a;
    }

    @Nullable
    /* renamed from: b */
    public String m7242b() {
        return this.f30423b;
    }

    @Nullable
    /* renamed from: c */
    public String m7241c() {
        return this.f30422a;
    }
}
