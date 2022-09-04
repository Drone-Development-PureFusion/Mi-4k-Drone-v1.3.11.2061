package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.C3424R;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C8625q CREATOR = new C8625q();

    /* renamed from: a */
    public final LatLng f27465a;

    /* renamed from: b */
    public final LatLng f27466b;

    /* renamed from: c */
    private final int f27467c;

    /* renamed from: com.google.android.gms.maps.model.LatLngBounds$a */
    /* loaded from: classes2.dex */
    public static final class C8570a {

        /* renamed from: a */
        private double f27468a = Double.POSITIVE_INFINITY;

        /* renamed from: b */
        private double f27469b = Double.NEGATIVE_INFINITY;

        /* renamed from: c */
        private double f27470c = Double.NaN;

        /* renamed from: d */
        private double f27471d = Double.NaN;

        /* renamed from: a */
        private boolean m11361a(double d) {
            boolean z = false;
            if (this.f27470c <= this.f27471d) {
                return this.f27470c <= d && d <= this.f27471d;
            }
            if (this.f27470c <= d || d <= this.f27471d) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        public C8570a m11360a(LatLng latLng) {
            this.f27468a = Math.min(this.f27468a, latLng.f27462a);
            this.f27469b = Math.max(this.f27469b, latLng.f27462a);
            double d = latLng.f27463b;
            if (Double.isNaN(this.f27470c)) {
                this.f27470c = d;
                this.f27471d = d;
            } else if (!m11361a(d)) {
                if (LatLngBounds.m11364c(this.f27470c, d) < LatLngBounds.m11363d(this.f27471d, d)) {
                    this.f27470c = d;
                } else {
                    this.f27471d = d;
                }
            }
            return this;
        }

        /* renamed from: a */
        public LatLngBounds m11362a() {
            C4588d.m23622a(!Double.isNaN(this.f27470c), "no included points");
            return new LatLngBounds(new LatLng(this.f27468a, this.f27470c), new LatLng(this.f27469b, this.f27471d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        C4588d.m23626a(latLng, "null southwest");
        C4588d.m23626a(latLng2, "null northeast");
        C4588d.m23617b(latLng2.f27462a >= latLng.f27462a, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.f27462a), Double.valueOf(latLng2.f27462a));
        this.f27467c = i;
        this.f27465a = latLng;
        this.f27466b = latLng2;
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        this(1, latLng, latLng2);
    }

    /* renamed from: a */
    public static LatLngBounds m11371a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C3424R.styleable.MapAttrs);
        Float valueOf = obtainAttributes.hasValue(C3424R.styleable.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(obtainAttributes.getFloat(C3424R.styleable.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float valueOf2 = obtainAttributes.hasValue(C3424R.styleable.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(obtainAttributes.getFloat(C3424R.styleable.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float valueOf3 = obtainAttributes.hasValue(C3424R.styleable.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(obtainAttributes.getFloat(C3424R.styleable.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float valueOf4 = obtainAttributes.hasValue(C3424R.styleable.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(obtainAttributes.getFloat(C3424R.styleable.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        if (valueOf != null && valueOf2 != null && valueOf3 != null && valueOf4 != null) {
            return new LatLngBounds(new LatLng(valueOf.floatValue(), valueOf2.floatValue()), new LatLng(valueOf3.floatValue(), valueOf4.floatValue()));
        }
        return null;
    }

    /* renamed from: a */
    private boolean m11373a(double d) {
        return this.f27465a.f27462a <= d && d <= this.f27466b.f27462a;
    }

    /* renamed from: b */
    public static C8570a m11369b() {
        return new C8570a();
    }

    /* renamed from: b */
    private boolean m11368b(double d) {
        boolean z = false;
        if (this.f27465a.f27463b <= this.f27466b.f27463b) {
            return this.f27465a.f27463b <= d && d <= this.f27466b.f27463b;
        }
        if (this.f27465a.f27463b <= d || d <= this.f27466b.f27463b) {
            z = true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static double m11364c(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static double m11363d(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11374a() {
        return this.f27467c;
    }

    /* renamed from: a */
    public boolean m11370a(LatLng latLng) {
        return m11373a(latLng.f27462a) && m11368b(latLng.f27463b);
    }

    /* renamed from: b */
    public LatLngBounds m11366b(LatLng latLng) {
        double d;
        double min = Math.min(this.f27465a.f27462a, latLng.f27462a);
        double max = Math.max(this.f27466b.f27462a, latLng.f27462a);
        double d2 = this.f27466b.f27463b;
        double d3 = this.f27465a.f27463b;
        double d4 = latLng.f27463b;
        if (m11368b(d4)) {
            d4 = d3;
            d = d2;
        } else if (m11364c(d3, d4) < m11363d(d2, d4)) {
            d = d2;
        } else {
            d = d4;
            d4 = d3;
        }
        return new LatLngBounds(new LatLng(min, d4), new LatLng(max, d));
    }

    /* renamed from: c */
    public LatLng m11365c() {
        double d = (this.f27465a.f27462a + this.f27466b.f27462a) / 2.0d;
        double d2 = this.f27466b.f27463b;
        double d3 = this.f27465a.f27463b;
        return new LatLng(d, d3 <= d2 ? (d2 + d3) / 2.0d : ((d2 + 360.0d) + d3) / 2.0d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f27465a.equals(latLngBounds.f27465a) && this.f27466b.equals(latLngBounds.f27466b);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f27465a, this.f27466b);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("southwest", this.f27465a).m23632a("northeast", this.f27466b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8625q.m10943a(this, parcel, i);
    }
}
