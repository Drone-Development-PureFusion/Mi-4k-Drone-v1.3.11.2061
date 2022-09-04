package com.google.firebase.auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
/* renamed from: com.google.firebase.auth.e */
/* loaded from: classes2.dex */
public class C9730e extends AbstractC9718a {

    /* renamed from: a */
    private final String f30413a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9730e(@NonNull String str) {
        this.f30413a = C4588d.m23625a(str);
    }

    /* renamed from: a */
    public static VerifyAssertionRequest m7277a(@NonNull C9730e c9730e) {
        C4588d.m23627a(c9730e);
        return new VerifyAssertionRequest(null, c9730e.m7276b(), c9730e.mo7238a(), null, null);
    }

    @Override // com.google.firebase.auth.AbstractC9718a
    /* renamed from: a */
    public String mo7238a() {
        return C9731f.f30414a;
    }

    /* renamed from: b */
    public String m7276b() {
        return this.f30413a;
    }
}
