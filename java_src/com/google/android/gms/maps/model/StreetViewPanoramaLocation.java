package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final C8634z CREATOR = new C8634z();

    /* renamed from: a */
    public final StreetViewPanoramaLink[] f27523a;

    /* renamed from: b */
    public final LatLng f27524b;

    /* renamed from: c */
    public final String f27525c;

    /* renamed from: d */
    private final int f27526d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreetViewPanoramaLocation(int i, StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f27526d = i;
        this.f27523a = streetViewPanoramaLinkArr;
        this.f27524b = latLng;
        this.f27525c = str;
    }

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this(1, streetViewPanoramaLinkArr, latLng, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11278a() {
        return this.f27526d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.f27525c.equals(streetViewPanoramaLocation.f27525c) && this.f27524b.equals(streetViewPanoramaLocation.f27524b);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f27524b, this.f27525c);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("panoId", this.f27525c).m23632a("position", this.f27524b.toString()).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8634z.m10916a(this, parcel, i);
    }
}
