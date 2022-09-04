package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.common.api.e */
/* loaded from: classes2.dex */
public class C4487e implements AbstractC4502m {

    /* renamed from: a */
    private final Status f16813a;

    /* renamed from: b */
    private final boolean f16814b;

    public C4487e(Status status, boolean z) {
        this.f16813a = (Status) C4588d.m23626a(status, "Status must not be null");
        this.f16814b = z;
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f16813a;
    }

    /* renamed from: b */
    public boolean m23982b() {
        return this.f16814b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4487e)) {
            return false;
        }
        C4487e c4487e = (C4487e) obj;
        return this.f16813a.equals(c4487e.f16813a) && this.f16814b == c4487e.f16814b;
    }

    public final int hashCode() {
        return (this.f16814b ? 1 : 0) + ((this.f16813a.hashCode() + 527) * 31);
    }
}
