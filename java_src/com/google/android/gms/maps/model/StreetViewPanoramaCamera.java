package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.firebase.p253b.C9755a;
/* loaded from: classes2.dex */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable {
    public static final C8632x CREATOR = new C8632x();

    /* renamed from: a */
    public final float f27512a;

    /* renamed from: b */
    public final float f27513b;

    /* renamed from: c */
    public final float f27514c;

    /* renamed from: d */
    private final int f27515d;

    /* renamed from: e */
    private StreetViewPanoramaOrientation f27516e;

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaCamera$a */
    /* loaded from: classes2.dex */
    public static final class C8571a {

        /* renamed from: a */
        public float f27517a;

        /* renamed from: b */
        public float f27518b;

        /* renamed from: c */
        public float f27519c;

        public C8571a() {
        }

        public C8571a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
            this.f27519c = streetViewPanoramaCamera.f27512a;
            this.f27517a = streetViewPanoramaCamera.f27514c;
            this.f27518b = streetViewPanoramaCamera.f27513b;
        }

        /* renamed from: a */
        public C8571a m11283a(float f) {
            this.f27519c = f;
            return this;
        }

        /* renamed from: a */
        public C8571a m11282a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            this.f27518b = streetViewPanoramaOrientation.f27527a;
            this.f27517a = streetViewPanoramaOrientation.f27528b;
            return this;
        }

        /* renamed from: a */
        public StreetViewPanoramaCamera m11284a() {
            return new StreetViewPanoramaCamera(this.f27519c, this.f27518b, this.f27517a);
        }

        /* renamed from: b */
        public C8571a m11281b(float f) {
            this.f27518b = f;
            return this;
        }

        /* renamed from: c */
        public C8571a m11280c(float f) {
            this.f27517a = f;
            return this;
        }
    }

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        this(1, f, f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreetViewPanoramaCamera(int i, float f, float f2, float f3) {
        C4588d.m23618b(-90.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between -90 and 90 inclusive");
        this.f27515d = i;
        this.f27512a = ((double) f) <= C9755a.f30449c ? 0.0f : f;
        this.f27513b = f2 + 0.0f;
        this.f27514c = (((double) f3) <= C9755a.f30449c ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        this.f27516e = new StreetViewPanoramaOrientation.C8572a().m11273a(f2).m11272b(f3).m11274a();
    }

    /* renamed from: a */
    public static C8571a m11287a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new C8571a(streetViewPanoramaCamera);
    }

    /* renamed from: b */
    public static C8571a m11286b() {
        return new C8571a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11288a() {
        return this.f27515d;
    }

    /* renamed from: c */
    public StreetViewPanoramaOrientation m11285c() {
        return this.f27516e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f27512a) == Float.floatToIntBits(streetViewPanoramaCamera.f27512a) && Float.floatToIntBits(this.f27513b) == Float.floatToIntBits(streetViewPanoramaCamera.f27513b) && Float.floatToIntBits(this.f27514c) == Float.floatToIntBits(streetViewPanoramaCamera.f27514c);
    }

    public int hashCode() {
        return C4585c.m23633a(Float.valueOf(this.f27512a), Float.valueOf(this.f27513b), Float.valueOf(this.f27514c));
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("zoom", Float.valueOf(this.f27512a)).m23632a("tilt", Float.valueOf(this.f27513b)).m23632a("bearing", Float.valueOf(this.f27514c)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8632x.m10922a(this, parcel, i);
    }
}
