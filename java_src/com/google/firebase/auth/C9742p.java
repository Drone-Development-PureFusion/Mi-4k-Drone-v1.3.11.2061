package com.google.firebase.auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
/* renamed from: com.google.firebase.auth.p */
/* loaded from: classes2.dex */
public class C9742p extends AbstractC9718a {

    /* renamed from: a */
    private String f30420a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9742p(@NonNull String str) {
        this.f30420a = C4588d.m23625a(str);
    }

    /* renamed from: a */
    public static VerifyAssertionRequest m7247a(@NonNull C9742p c9742p) {
        C4588d.m23627a(c9742p);
        return new VerifyAssertionRequest(null, c9742p.m7246b(), c9742p.mo7238a(), null, null);
    }

    @Override // com.google.firebase.auth.AbstractC9718a
    /* renamed from: a */
    public String mo7238a() {
        return C9743q.f30421a;
    }

    /* renamed from: b */
    public String m7246b() {
        return this.f30420a;
    }
}
