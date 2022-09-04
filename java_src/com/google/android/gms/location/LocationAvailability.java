package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C8225j CREATOR = new C8225j();

    /* renamed from: a */
    int f26666a;

    /* renamed from: b */
    int f26667b;

    /* renamed from: c */
    long f26668c;

    /* renamed from: d */
    int f26669d;

    /* renamed from: e */
    private final int f26670e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationAvailability(int i, int i2, int i3, int i4, long j) {
        this.f26670e = i;
        this.f26669d = i2;
        this.f26666a = i3;
        this.f26667b = i4;
        this.f26668c = j;
    }

    /* renamed from: a */
    public static boolean m12630a(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    /* renamed from: b */
    public static LocationAvailability m12628b(Intent intent) {
        if (!m12630a(intent)) {
            return null;
        }
        return (LocationAvailability) intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    /* renamed from: a */
    public boolean m12631a() {
        return this.f26669d < 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m12629b() {
        return this.f26670e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationAvailability)) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        return this.f26669d == locationAvailability.f26669d && this.f26666a == locationAvailability.f26666a && this.f26667b == locationAvailability.f26667b && this.f26668c == locationAvailability.f26668c;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f26669d), Integer.valueOf(this.f26666a), Integer.valueOf(this.f26667b), Long.valueOf(this.f26668c));
    }

    public String toString() {
        return new StringBuilder(48).append("LocationAvailability[isLocationAvailable: ").append(m12631a()).append("]").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8225j.m12379a(this, parcel, i);
    }
}
