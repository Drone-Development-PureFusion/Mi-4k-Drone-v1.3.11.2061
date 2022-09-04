package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class NearbyAlertRequest extends AbstractSafeParcelable {
    public static final C8307r CREATOR = new C8307r();

    /* renamed from: a */
    private final int f26871a;

    /* renamed from: b */
    private final int f26872b;

    /* renamed from: c */
    private final int f26873c;
    @Deprecated

    /* renamed from: d */
    private final PlaceFilter f26874d;

    /* renamed from: e */
    private final NearbyAlertFilter f26875e;

    /* renamed from: f */
    private final boolean f26876f;

    /* renamed from: g */
    private final int f26877g;

    /* renamed from: h */
    private int f26878h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NearbyAlertRequest(int i, int i2, int i3, PlaceFilter placeFilter, NearbyAlertFilter nearbyAlertFilter, boolean z, int i4, int i5) {
        this.f26878h = 110;
        this.f26871a = i;
        this.f26872b = i2;
        this.f26873c = i3;
        if (nearbyAlertFilter != null) {
            this.f26875e = nearbyAlertFilter;
        } else if (placeFilter == null) {
            this.f26875e = null;
        } else if (placeFilter.mo12343b() != null && !placeFilter.mo12343b().isEmpty()) {
            this.f26875e = NearbyAlertFilter.m12355b(placeFilter.mo12343b());
        } else if (placeFilter.m12342c() == null || placeFilter.m12342c().isEmpty()) {
            this.f26875e = null;
        } else {
            this.f26875e = NearbyAlertFilter.m12353c(placeFilter.m12342c());
        }
        this.f26874d = null;
        this.f26876f = z;
        this.f26877g = i4;
        this.f26878h = i5;
    }

    /* renamed from: a */
    public int m12352a() {
        return this.f26871a;
    }

    /* renamed from: b */
    public int m12351b() {
        return this.f26872b;
    }

    /* renamed from: c */
    public int m12350c() {
        return this.f26873c;
    }

    @Deprecated
    /* renamed from: d */
    public PlaceFilter m12349d() {
        return null;
    }

    /* renamed from: e */
    public NearbyAlertFilter m12348e() {
        return this.f26875e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyAlertRequest)) {
            return false;
        }
        NearbyAlertRequest nearbyAlertRequest = (NearbyAlertRequest) obj;
        return this.f26872b == nearbyAlertRequest.f26872b && this.f26873c == nearbyAlertRequest.f26873c && C4585c.m23634a(this.f26875e, nearbyAlertRequest.f26875e) && this.f26878h == nearbyAlertRequest.f26878h;
    }

    /* renamed from: f */
    public boolean m12347f() {
        return this.f26876f;
    }

    /* renamed from: g */
    public int m12346g() {
        return this.f26877g;
    }

    /* renamed from: h */
    public int m12345h() {
        return this.f26878h;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f26872b), Integer.valueOf(this.f26873c), this.f26875e, Integer.valueOf(this.f26878h));
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("transitionTypes", Integer.valueOf(this.f26872b)).m23632a("loiteringTimeMillis", Integer.valueOf(this.f26873c)).m23632a("nearbyAlertFilter", this.f26875e).m23632a("priority", Integer.valueOf(this.f26878h)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8307r.m12108a(this, parcel, i);
    }
}
