package com.google.android.gms.location.places;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class PlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PlaceRequest> CREATOR = new C8326x();

    /* renamed from: a */
    final int f26904a;

    /* renamed from: b */
    private final PlaceFilter f26905b;

    /* renamed from: c */
    private final long f26906c;

    /* renamed from: d */
    private final int f26907d;

    /* renamed from: e */
    private final long f26908e;

    /* renamed from: f */
    private final boolean f26909f;

    /* renamed from: g */
    private final boolean f26910g;

    public PlaceRequest(int i, PlaceFilter placeFilter, long j, int i2, long j2, boolean z, boolean z2) {
        this.f26904a = i;
        this.f26905b = placeFilter;
        this.f26906c = j;
        this.f26907d = i2;
        this.f26908e = j2;
        this.f26909f = z;
        this.f26910g = z2;
    }

    @Deprecated
    /* renamed from: a */
    public PlaceFilter m12331a() {
        return this.f26905b;
    }

    /* renamed from: b */
    public long m12330b() {
        return this.f26906c;
    }

    /* renamed from: c */
    public int m12329c() {
        return this.f26907d;
    }

    /* renamed from: d */
    public long m12328d() {
        return this.f26908e;
    }

    /* renamed from: e */
    public boolean m12327e() {
        return this.f26909f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceRequest)) {
            return false;
        }
        PlaceRequest placeRequest = (PlaceRequest) obj;
        return C4585c.m23634a(this.f26905b, placeRequest.f26905b) && this.f26906c == placeRequest.f26906c && this.f26907d == placeRequest.f26907d && this.f26908e == placeRequest.f26908e && this.f26909f == placeRequest.f26909f;
    }

    /* renamed from: f */
    public boolean m12326f() {
        return this.f26910g;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f26905b, Long.valueOf(this.f26906c), Integer.valueOf(this.f26907d), Long.valueOf(this.f26908e), Boolean.valueOf(this.f26909f));
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return C4585c.m23635a(this).m23632a("filter", this.f26905b).m23632a("interval", Long.valueOf(this.f26906c)).m23632a("priority", Integer.valueOf(this.f26907d)).m23632a("expireAt", Long.valueOf(this.f26908e)).m23632a("receiveFailures", Boolean.valueOf(this.f26909f)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8326x.m12055a(this, parcel, i);
    }
}
