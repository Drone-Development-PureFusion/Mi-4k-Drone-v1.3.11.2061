package com.google.firebase.auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
/* renamed from: com.google.firebase.auth.u */
/* loaded from: classes2.dex */
public class C9747u extends AbstractC9718a {

    /* renamed from: a */
    private String f30425a;

    /* renamed from: b */
    private String f30426b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9747u(@NonNull String str, @NonNull String str2) {
        this.f30425a = C4588d.m23625a(str);
        this.f30426b = C4588d.m23625a(str2);
    }

    /* renamed from: a */
    public static VerifyAssertionRequest m7237a(@NonNull C9747u c9747u) {
        C4588d.m23627a(c9747u);
        return new VerifyAssertionRequest(null, c9747u.m7236b(), c9747u.mo7238a(), null, c9747u.m7235c());
    }

    @Override // com.google.firebase.auth.AbstractC9718a
    /* renamed from: a */
    public String mo7238a() {
        return C9748v.f30427a;
    }

    @NonNull
    /* renamed from: b */
    public String m7236b() {
        return this.f30425a;
    }

    @NonNull
    /* renamed from: c */
    public String m7235c() {
        return this.f30426b;
    }
}
