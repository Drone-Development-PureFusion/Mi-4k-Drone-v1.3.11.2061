package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.AbstractC8826b;
import java.util.Locale;
/* loaded from: classes.dex */
public class DistanceImpl extends AbstractSafeParcelable implements AbstractC8826b {
    public static final Parcelable.Creator<DistanceImpl> CREATOR = new C8845e();

    /* renamed from: b */
    final int f28263b;

    /* renamed from: c */
    public final int f28264c;

    /* renamed from: d */
    public final double f28265d;

    public DistanceImpl(int i, double d) {
        this(1, i, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DistanceImpl(int i, int i2, double d) {
        this.f28263b = i;
        this.f28264c = i2;
        this.f28265d = d;
    }

    /* renamed from: a */
    private static String m9916a(int i) {
        switch (i) {
            case 1:
                return "LOW";
            default:
                return "UNKNOWN";
        }
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8826b
    /* renamed from: a */
    public int mo9917a() {
        return this.f28264c;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(@NonNull AbstractC8826b abstractC8826b) {
        if (!Double.isNaN(mo9914b()) || !Double.isNaN(abstractC8826b.mo9914b())) {
            return Double.compare(mo9914b(), abstractC8826b.mo9914b());
        }
        return 0;
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8826b
    /* renamed from: b */
    public double mo9914b() {
        return this.f28265d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistanceImpl)) {
            return false;
        }
        DistanceImpl distanceImpl = (DistanceImpl) obj;
        return mo9917a() == distanceImpl.mo9917a() && compareTo(distanceImpl) == 0;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(mo9917a()), Double.valueOf(mo9914b()));
    }

    public String toString() {
        return String.format(Locale.US, "(%.1fm, %s)", Double.valueOf(this.f28265d), m9916a(this.f28264c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8845e.m9881a(this, parcel, i);
    }
}
