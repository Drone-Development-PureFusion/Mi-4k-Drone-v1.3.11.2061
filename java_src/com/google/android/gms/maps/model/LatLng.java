package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.xiaomi.mipush.sdk.Constants;
/* loaded from: classes.dex */
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C8626r CREATOR = new C8626r();

    /* renamed from: a */
    public final double f27462a;

    /* renamed from: b */
    public final double f27463b;

    /* renamed from: c */
    private final int f27464c;

    public LatLng(double d, double d2) {
        this(1, d, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LatLng(int i, double d, double d2) {
        this.f27464c = i;
        if (-180.0d > d2 || d2 >= 180.0d) {
            this.f27463b = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f27463b = d2;
        }
        this.f27462a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11375a() {
        return this.f27464c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f27462a) == Double.doubleToLongBits(latLng.f27462a) && Double.doubleToLongBits(this.f27463b) == Double.doubleToLongBits(latLng.f27463b);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f27462a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f27463b);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        double d = this.f27462a;
        return new StringBuilder(60).append("lat/lng: (").append(d).append(Constants.ACCEPT_TIME_SEPARATOR_SP).append(this.f27463b).append(")").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8626r.m10940a(this, parcel, i);
    }
}
