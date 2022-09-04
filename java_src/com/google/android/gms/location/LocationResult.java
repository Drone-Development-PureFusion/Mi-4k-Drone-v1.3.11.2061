package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: b */
    private final int f26685b;

    /* renamed from: c */
    private final List<Location> f26686c;

    /* renamed from: a */
    static final List<Location> f26684a = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new C8347y();

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationResult(int i, List<Location> list) {
        this.f26685b = i;
        this.f26686c = list;
    }

    /* renamed from: a */
    public static LocationResult m12604a(List<Location> list) {
        if (list == null) {
            list = f26684a;
        }
        return new LocationResult(2, list);
    }

    /* renamed from: a */
    public static boolean m12605a(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    /* renamed from: b */
    public static LocationResult m12602b(Intent intent) {
        if (!m12605a(intent)) {
            return null;
        }
        return (LocationResult) intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    /* renamed from: a */
    public Location m12606a() {
        int size = this.f26686c.size();
        if (size == 0) {
            return null;
        }
        return this.f26686c.get(size - 1);
    }

    @NonNull
    /* renamed from: b */
    public List<Location> m12603b() {
        return this.f26686c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m12601c() {
        return this.f26685b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f26686c.size() != this.f26686c.size()) {
            return false;
        }
        Iterator<Location> it2 = locationResult.f26686c.iterator();
        Iterator<Location> it3 = this.f26686c.iterator();
        while (it2.hasNext()) {
            if (it3.next().getTime() != it2.next().getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 17;
        Iterator<Location> it2 = this.f26686c.iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                long time = it2.next().getTime();
                i = ((int) (time ^ (time >>> 32))) + (i2 * 31);
            } else {
                return i2;
            }
        }
    }

    public String toString() {
        String valueOf = String.valueOf(this.f26686c);
        return new StringBuilder(String.valueOf(valueOf).length() + 27).append("LocationResult[locations: ").append(valueOf).append("]").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8347y.m12019a(this, parcel, i);
    }
}
