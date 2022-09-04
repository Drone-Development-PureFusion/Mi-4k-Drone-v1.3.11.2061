package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new C8348z();

    /* renamed from: a */
    private final int f26687a;

    /* renamed from: b */
    private final List<LocationRequest> f26688b;

    /* renamed from: c */
    private final boolean f26689c;

    /* renamed from: d */
    private final boolean f26690d;

    /* renamed from: com.google.android.gms.location.LocationSettingsRequest$a */
    /* loaded from: classes2.dex */
    public static final class C8157a {

        /* renamed from: a */
        private final ArrayList<LocationRequest> f26691a = new ArrayList<>();

        /* renamed from: b */
        private boolean f26692b = false;

        /* renamed from: c */
        private boolean f26693c = false;

        /* renamed from: a */
        public C8157a m12595a(LocationRequest locationRequest) {
            this.f26691a.add(locationRequest);
            return this;
        }

        /* renamed from: a */
        public C8157a m12594a(Collection<LocationRequest> collection) {
            this.f26691a.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public C8157a m12593a(boolean z) {
            this.f26692b = z;
            return this;
        }

        /* renamed from: a */
        public LocationSettingsRequest m12596a() {
            return new LocationSettingsRequest(this.f26691a, this.f26692b, this.f26693c);
        }

        /* renamed from: b */
        public C8157a m12592b(boolean z) {
            this.f26693c = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationSettingsRequest(int i, List<LocationRequest> list, boolean z, boolean z2) {
        this.f26687a = i;
        this.f26688b = list;
        this.f26689c = z;
        this.f26690d = z2;
    }

    private LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2) {
        this(3, list, z, z2);
    }

    /* renamed from: a */
    public int m12600a() {
        return this.f26687a;
    }

    /* renamed from: b */
    public List<LocationRequest> m12599b() {
        return Collections.unmodifiableList(this.f26688b);
    }

    /* renamed from: c */
    public boolean m12598c() {
        return this.f26689c;
    }

    /* renamed from: d */
    public boolean m12597d() {
        return this.f26690d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8348z.m12016a(this, parcel, i);
    }
}
