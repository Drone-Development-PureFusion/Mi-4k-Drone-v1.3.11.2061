package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class FusedLocationProviderResult extends AbstractSafeParcelable implements AbstractC4502m {

    /* renamed from: b */
    private final int f26737b;

    /* renamed from: c */
    private final Status f26738c;

    /* renamed from: a */
    public static final FusedLocationProviderResult f26736a = new FusedLocationProviderResult(Status.f16786a);
    public static final Parcelable.Creator<FusedLocationProviderResult> CREATOR = new C8192e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public FusedLocationProviderResult(int i, Status status) {
        this.f26737b = i;
        this.f26738c = status;
    }

    public FusedLocationProviderResult(Status status) {
        this(1, status);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f26738c;
    }

    /* renamed from: b */
    public int m12549b() {
        return this.f26737b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8192e.m12483a(this, parcel, i);
    }
}
