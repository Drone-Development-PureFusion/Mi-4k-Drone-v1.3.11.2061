package com.google.android.gms.auth.api.credentials.internal;

import com.google.android.gms.auth.api.credentials.AbstractC4003a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.auth.api.credentials.internal.d */
/* loaded from: classes2.dex */
public final class C4015d implements AbstractC4003a {

    /* renamed from: a */
    private final Status f15453a;

    /* renamed from: b */
    private final Credential f15454b;

    public C4015d(Status status, Credential credential) {
        this.f15453a = status;
        this.f15454b = credential;
    }

    /* renamed from: a */
    public static C4015d m25742a(Status status) {
        return new C4015d(status, null);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f15453a;
    }

    @Override // com.google.android.gms.auth.api.credentials.AbstractC4003a
    /* renamed from: b */
    public Credential mo25741b() {
        return this.f15454b;
    }
}
