package com.google.android.gms.location.places;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class PlaceFilter extends AbstractPlaceFilter {
    public static final C8311t CREATOR = new C8311t();

    /* renamed from: f */
    private static final PlaceFilter f26879f = new PlaceFilter();

    /* renamed from: a */
    final int f26880a;

    /* renamed from: b */
    final List<Integer> f26881b;

    /* renamed from: c */
    final boolean f26882c;

    /* renamed from: d */
    final List<UserDataType> f26883d;

    /* renamed from: e */
    final List<String> f26884e;

    /* renamed from: g */
    private final Set<Integer> f26885g;

    /* renamed from: h */
    private final Set<UserDataType> f26886h;

    /* renamed from: i */
    private final Set<String> f26887i;

    @Deprecated
    /* renamed from: com.google.android.gms.location.places.PlaceFilter$a */
    /* loaded from: classes.dex */
    public static final class C8236a {

        /* renamed from: a */
        private Collection<Integer> f26888a;

        /* renamed from: b */
        private boolean f26889b;

        /* renamed from: c */
        private Collection<UserDataType> f26890c;

        /* renamed from: d */
        private String[] f26891d;

        private C8236a() {
            this.f26888a = null;
            this.f26889b = false;
            this.f26890c = null;
            this.f26891d = null;
        }

        /* renamed from: a */
        public PlaceFilter m12340a() {
            return new PlaceFilter(null, false, null, null);
        }
    }

    public PlaceFilter() {
        this(false, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlaceFilter(int i, @Nullable List<Integer> list, boolean z, @Nullable List<String> list2, @Nullable List<UserDataType> list3) {
        this.f26880a = i;
        this.f26881b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f26882c = z;
        this.f26883d = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f26884e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f26885g = a((List) this.f26881b);
        this.f26886h = a((List) this.f26883d);
        this.f26887i = a((List) this.f26884e);
    }

    public PlaceFilter(@Nullable Collection<Integer> collection, boolean z, @Nullable Collection<String> collection2, @Nullable Collection<UserDataType> collection3) {
        this(0, a(collection), z, a(collection2), a(collection3));
    }

    public PlaceFilter(boolean z, @Nullable Collection<String> collection) {
        this(null, z, collection, null);
    }

    @Deprecated
    /* renamed from: d */
    public static PlaceFilter m12341d() {
        return new C8236a().m12340a();
    }

    @Override // com.google.android.gms.location.places.AbstractPlaceFilter
    /* renamed from: a */
    public boolean mo12344a() {
        return this.f26882c;
    }

    @Override // com.google.android.gms.location.places.AbstractPlaceFilter
    /* renamed from: b */
    public Set<String> mo12343b() {
        return this.f26887i;
    }

    /* renamed from: c */
    public Set<Integer> m12342c() {
        return this.f26885g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceFilter)) {
            return false;
        }
        PlaceFilter placeFilter = (PlaceFilter) obj;
        return this.f26885g.equals(placeFilter.f26885g) && this.f26882c == placeFilter.f26882c && this.f26886h.equals(placeFilter.f26886h) && this.f26887i.equals(placeFilter.f26887i);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f26885g, Boolean.valueOf(this.f26882c), this.f26886h, this.f26887i);
    }

    public String toString() {
        C4585c.C4587a m23635a = C4585c.m23635a(this);
        if (!this.f26885g.isEmpty()) {
            m23635a.m23632a("types", this.f26885g);
        }
        m23635a.m23632a("requireOpenNow", Boolean.valueOf(this.f26882c));
        if (!this.f26887i.isEmpty()) {
            m23635a.m23632a("placeIds", this.f26887i);
        }
        if (!this.f26886h.isEmpty()) {
            m23635a.m23632a("requestedUserDataTypes", this.f26886h);
        }
        return m23635a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8311t.m12101a(this, parcel, i);
    }
}
