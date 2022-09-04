package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final C8609ad CREATOR = new C8609ad();

    /* renamed from: a */
    public final LatLng f27547a;

    /* renamed from: b */
    public final LatLng f27548b;

    /* renamed from: c */
    public final LatLng f27549c;

    /* renamed from: d */
    public final LatLng f27550d;

    /* renamed from: e */
    public final LatLngBounds f27551e;

    /* renamed from: f */
    private final int f27552f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VisibleRegion(int i, LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f27552f = i;
        this.f27547a = latLng;
        this.f27548b = latLng2;
        this.f27549c = latLng3;
        this.f27550d = latLng4;
        this.f27551e = latLngBounds;
    }

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this(1, latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11257a() {
        return this.f27552f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f27547a.equals(visibleRegion.f27547a) && this.f27548b.equals(visibleRegion.f27548b) && this.f27549c.equals(visibleRegion.f27549c) && this.f27550d.equals(visibleRegion.f27550d) && this.f27551e.equals(visibleRegion.f27551e);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f27547a, this.f27548b, this.f27549c, this.f27550d, this.f27551e);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("nearLeft", this.f27547a).m23632a("nearRight", this.f27548b).m23632a("farLeft", this.f27549c).m23632a("farRight", this.f27550d).m23632a("latLngBounds", this.f27551e).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8609ad.m11089a(this, parcel, i);
    }
}
