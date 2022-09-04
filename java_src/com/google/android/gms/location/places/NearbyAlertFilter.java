package com.google.android.gms.location.places;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public final class NearbyAlertFilter extends AbstractPlaceFilter {
    public static final C8306q CREATOR = new C8306q();

    /* renamed from: a */
    final int f26862a;

    /* renamed from: b */
    final List<String> f26863b;

    /* renamed from: c */
    final List<Integer> f26864c;

    /* renamed from: d */
    final List<UserDataType> f26865d;

    /* renamed from: e */
    final String f26866e;

    /* renamed from: f */
    final boolean f26867f;

    /* renamed from: g */
    private final Set<String> f26868g;

    /* renamed from: h */
    private final Set<Integer> f26869h;

    /* renamed from: i */
    private final Set<UserDataType> f26870i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NearbyAlertFilter(int i, @Nullable List<String> list, @Nullable List<Integer> list2, @Nullable List<UserDataType> list3, @Nullable String str, boolean z) {
        this.f26862a = i;
        this.f26864c = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f26865d = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f26863b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f26869h = a((List) this.f26864c);
        this.f26870i = a((List) this.f26865d);
        this.f26868g = a((List) this.f26863b);
        this.f26866e = str;
        this.f26867f = z;
    }

    /* renamed from: b */
    public static NearbyAlertFilter m12355b(Collection<String> collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least oneplace ID to match results with.");
        }
        return new NearbyAlertFilter(0, a(collection), null, null, null, false);
    }

    /* renamed from: c */
    public static NearbyAlertFilter m12353c(Collection<Integer> collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least oneplace type to match results with.");
        }
        return new NearbyAlertFilter(0, null, a(collection), null, null, false);
    }

    @Override // com.google.android.gms.location.places.AbstractPlaceFilter
    /* renamed from: b */
    public Set<String> mo12343b() {
        return this.f26868g;
    }

    /* renamed from: c */
    public boolean m12354c() {
        return this.f26867f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyAlertFilter)) {
            return false;
        }
        NearbyAlertFilter nearbyAlertFilter = (NearbyAlertFilter) obj;
        if (this.f26866e == null && nearbyAlertFilter.f26866e != null) {
            return false;
        }
        return this.f26869h.equals(nearbyAlertFilter.f26869h) && this.f26870i.equals(nearbyAlertFilter.f26870i) && this.f26868g.equals(nearbyAlertFilter.f26868g) && (this.f26866e == null || this.f26866e.equals(nearbyAlertFilter.f26866e)) && this.f26867f == nearbyAlertFilter.m12354c();
    }

    public int hashCode() {
        return C4585c.m23633a(this.f26869h, this.f26870i, this.f26868g, this.f26866e, Boolean.valueOf(this.f26867f));
    }

    public String toString() {
        C4585c.C4587a m23635a = C4585c.m23635a(this);
        if (!this.f26869h.isEmpty()) {
            m23635a.m23632a("types", this.f26869h);
        }
        if (!this.f26868g.isEmpty()) {
            m23635a.m23632a("placeIds", this.f26868g);
        }
        if (!this.f26870i.isEmpty()) {
            m23635a.m23632a("requestedUserDataTypes", this.f26870i);
        }
        if (this.f26866e != null) {
            m23635a.m23632a("chainName", this.f26866e);
        }
        m23635a.m23632a("Beacon required: ", Boolean.valueOf(this.f26867f));
        return m23635a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8306q.m12111a(this, parcel, i);
    }
}
