package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements AbstractC4502m {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new C8161aa();

    /* renamed from: a */
    private final int f26694a;

    /* renamed from: b */
    private final Status f26695b;

    /* renamed from: c */
    private final LocationSettingsStates f26696c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationSettingsResult(int i, Status status, LocationSettingsStates locationSettingsStates) {
        this.f26694a = i;
        this.f26695b = status;
        this.f26696c = locationSettingsStates;
    }

    public LocationSettingsResult(Status status) {
        this(1, status, null);
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f26695b;
    }

    /* renamed from: b */
    public int m12591b() {
        return this.f26694a;
    }

    /* renamed from: c */
    public LocationSettingsStates m12590c() {
        return this.f26696c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8161aa.m12576a(this, parcel, i);
    }
}
