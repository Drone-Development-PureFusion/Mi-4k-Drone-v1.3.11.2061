package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.p253b.C9755a;
/* loaded from: classes2.dex */
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final C8606aa CREATOR = new C8606aa();

    /* renamed from: a */
    public final float f27527a;

    /* renamed from: b */
    public final float f27528b;

    /* renamed from: c */
    private final int f27529c;

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaOrientation$a */
    /* loaded from: classes2.dex */
    public static final class C8572a {

        /* renamed from: a */
        public float f27530a;

        /* renamed from: b */
        public float f27531b;

        public C8572a() {
        }

        public C8572a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            this.f27530a = streetViewPanoramaOrientation.f27528b;
            this.f27531b = streetViewPanoramaOrientation.f27527a;
        }

        /* renamed from: a */
        public C8572a m11273a(float f) {
            this.f27531b = f;
            return this;
        }

        /* renamed from: a */
        public StreetViewPanoramaOrientation m11274a() {
            return new StreetViewPanoramaOrientation(this.f27531b, this.f27530a);
        }

        /* renamed from: b */
        public C8572a m11272b(float f) {
            this.f27530a = f;
            return this;
        }
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        this(1, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreetViewPanoramaOrientation(int i, float f, float f2) {
        C4588d.m23618b(-90.0f <= f && f <= 90.0f, "Tilt needs to be between -90 and 90 inclusive");
        this.f27529c = i;
        this.f27527a = 0.0f + f;
        this.f27528b = (((double) f2) <= C9755a.f30449c ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    /* renamed from: a */
    public static C8572a m11276a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        return new C8572a(streetViewPanoramaOrientation);
    }

    /* renamed from: b */
    public static C8572a m11275b() {
        return new C8572a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11277a() {
        return this.f27529c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.f27527a) == Float.floatToIntBits(streetViewPanoramaOrientation.f27527a) && Float.floatToIntBits(this.f27528b) == Float.floatToIntBits(streetViewPanoramaOrientation.f27528b);
    }

    public int hashCode() {
        return C4585c.m23633a(Float.valueOf(this.f27527a), Float.valueOf(this.f27528b));
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("tilt", Float.valueOf(this.f27527a)).m23632a("bearing", Float.valueOf(this.f27528b)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8606aa.m11098a(this, parcel, i);
    }
}
