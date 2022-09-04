package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class PointOfInterest extends AbstractSafeParcelable {
    public static final C8629u CREATOR = new C8629u();

    /* renamed from: a */
    public final LatLng f27490a;

    /* renamed from: b */
    public final String f27491b;

    /* renamed from: c */
    public final String f27492c;

    /* renamed from: d */
    private final int f27493d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PointOfInterest(int i, LatLng latLng, String str, String str2) {
        this.f27493d = i;
        this.f27490a = latLng;
        this.f27491b = str;
        this.f27492c = str2;
    }

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this(1, latLng, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11328a() {
        return this.f27493d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8629u.m10931a(this, parcel, i);
    }
}
