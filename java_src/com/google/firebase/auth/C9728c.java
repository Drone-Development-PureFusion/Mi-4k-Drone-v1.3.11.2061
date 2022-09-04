package com.google.firebase.auth;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.firebase.auth.c */
/* loaded from: classes2.dex */
public class C9728c extends AbstractC9718a {

    /* renamed from: a */
    private String f30410a;

    /* renamed from: b */
    private String f30411b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9728c(@NonNull String str, @NonNull String str2) {
        this.f30410a = C4588d.m23625a(str);
        this.f30411b = C4588d.m23625a(str2);
    }

    @Override // com.google.firebase.auth.AbstractC9718a
    @NonNull
    /* renamed from: a */
    public String mo7238a() {
        return C9729d.f30412a;
    }

    @NonNull
    /* renamed from: b */
    public String m7280b() {
        return this.f30410a;
    }

    @NonNull
    /* renamed from: c */
    public String m7279c() {
        return this.f30411b;
    }
}
