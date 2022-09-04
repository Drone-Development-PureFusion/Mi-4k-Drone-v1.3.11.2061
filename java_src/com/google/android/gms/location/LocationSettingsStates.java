package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4631c;
/* loaded from: classes2.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new C8162ab();

    /* renamed from: a */
    private final int f26697a;

    /* renamed from: b */
    private final boolean f26698b;

    /* renamed from: c */
    private final boolean f26699c;

    /* renamed from: d */
    private final boolean f26700d;

    /* renamed from: e */
    private final boolean f26701e;

    /* renamed from: f */
    private final boolean f26702f;

    /* renamed from: g */
    private final boolean f26703g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationSettingsStates(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f26697a = i;
        this.f26698b = z;
        this.f26699c = z2;
        this.f26700d = z3;
        this.f26701e = z4;
        this.f26702f = z5;
        this.f26703g = z6;
    }

    /* renamed from: a */
    public static LocationSettingsStates m12588a(Intent intent) {
        return (LocationSettingsStates) C4631c.m23445a(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    /* renamed from: a */
    public int m12589a() {
        return this.f26697a;
    }

    /* renamed from: b */
    public boolean m12587b() {
        return this.f26698b;
    }

    /* renamed from: c */
    public boolean m12586c() {
        return this.f26701e;
    }

    /* renamed from: d */
    public boolean m12585d() {
        return this.f26699c;
    }

    /* renamed from: e */
    public boolean m12584e() {
        return this.f26702f;
    }

    /* renamed from: f */
    public boolean m12583f() {
        return this.f26698b || this.f26699c;
    }

    /* renamed from: g */
    public boolean m12582g() {
        return this.f26701e || this.f26702f;
    }

    /* renamed from: h */
    public boolean m12581h() {
        return this.f26700d;
    }

    /* renamed from: i */
    public boolean m12580i() {
        return this.f26703g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8162ab.m12573a(this, parcel, i);
    }
}
