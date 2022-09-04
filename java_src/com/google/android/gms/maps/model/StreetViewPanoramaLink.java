package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.p253b.C9755a;
/* loaded from: classes2.dex */
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final C8633y CREATOR = new C8633y();

    /* renamed from: a */
    public final String f27520a;

    /* renamed from: b */
    public final float f27521b;

    /* renamed from: c */
    private final int f27522c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreetViewPanoramaLink(int i, String str, float f) {
        this.f27522c = i;
        this.f27520a = str;
        this.f27521b = (((double) f) <= C9755a.f30449c ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11279a() {
        return this.f27522c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.f27520a.equals(streetViewPanoramaLink.f27520a) && Float.floatToIntBits(this.f27521b) == Float.floatToIntBits(streetViewPanoramaLink.f27521b);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f27520a, Float.valueOf(this.f27521b));
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("panoId", this.f27520a).m23632a("bearing", Float.valueOf(this.f27521b)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8633y.m10919a(this, parcel, i);
    }
}
