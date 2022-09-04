package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class LocationRequestInternal extends AbstractSafeParcelable {

    /* renamed from: b */
    LocationRequest f26740b;

    /* renamed from: c */
    boolean f26741c;

    /* renamed from: d */
    List<ClientIdentity> f26742d;
    @Nullable

    /* renamed from: e */
    String f26743e;

    /* renamed from: f */
    boolean f26744f;

    /* renamed from: g */
    boolean f26745g;

    /* renamed from: h */
    private final int f26746h;

    /* renamed from: a */
    static final List<ClientIdentity> f26739a = Collections.emptyList();
    public static final C8219m CREATOR = new C8219m();

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationRequestInternal(int i, LocationRequest locationRequest, boolean z, List<ClientIdentity> list, @Nullable String str, boolean z2, boolean z3) {
        this.f26746h = i;
        this.f26740b = locationRequest;
        this.f26741c = z;
        this.f26742d = list;
        this.f26743e = str;
        this.f26744f = z2;
        this.f26745g = z3;
    }

    @Deprecated
    /* renamed from: a */
    public static LocationRequestInternal m12547a(LocationRequest locationRequest) {
        return m12546a(null, locationRequest);
    }

    /* renamed from: a */
    public static LocationRequestInternal m12546a(@Nullable String str, LocationRequest locationRequest) {
        return new LocationRequestInternal(1, locationRequest, true, f26739a, str, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m12548a() {
        return this.f26746h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationRequestInternal)) {
            return false;
        }
        LocationRequestInternal locationRequestInternal = (LocationRequestInternal) obj;
        return C4585c.m23634a(this.f26740b, locationRequestInternal.f26740b) && this.f26741c == locationRequestInternal.f26741c && this.f26744f == locationRequestInternal.f26744f && C4585c.m23634a(this.f26742d, locationRequestInternal.f26742d) && this.f26745g == locationRequestInternal.f26745g;
    }

    public int hashCode() {
        return this.f26740b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26740b.toString());
        if (this.f26743e != null) {
            sb.append(" tag=").append(this.f26743e);
        }
        sb.append(" trigger=").append(this.f26741c);
        sb.append(" hideAppOps=").append(this.f26744f);
        sb.append(" clients=").append(this.f26742d);
        sb.append(" forceCoarseLocation=").append(this.f26745g);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8219m.m12393a(this, parcel, i);
    }
}
