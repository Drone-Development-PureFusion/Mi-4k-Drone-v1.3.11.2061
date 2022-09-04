package com.google.android.gms.location.places;

import android.os.Parcel;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* loaded from: classes2.dex */
public class AutocompleteFilter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C8297p CREATOR = new C8297p();

    /* renamed from: a */
    public static final int f26848a = 0;

    /* renamed from: b */
    public static final int f26849b = 1007;

    /* renamed from: c */
    public static final int f26850c = 2;

    /* renamed from: d */
    public static final int f26851d = 34;

    /* renamed from: e */
    public static final int f26852e = 4;

    /* renamed from: f */
    public static final int f26853f = 5;

    /* renamed from: g */
    final int f26854g;

    /* renamed from: h */
    final boolean f26855h;

    /* renamed from: i */
    final List<Integer> f26856i;

    /* renamed from: j */
    final String f26857j;

    /* renamed from: k */
    final int f26858k;

    /* renamed from: com.google.android.gms.location.places.AutocompleteFilter$a */
    /* loaded from: classes2.dex */
    public static final class C8234a {

        /* renamed from: a */
        private boolean f26859a = false;

        /* renamed from: b */
        private int f26860b = 0;

        /* renamed from: c */
        private String f26861c = "";

        /* renamed from: a */
        public C8234a m12357a(int i) {
            this.f26860b = i;
            return this;
        }

        /* renamed from: a */
        public C8234a m12356a(String str) {
            this.f26861c = str;
            return this;
        }

        /* renamed from: a */
        public AutocompleteFilter m12358a() {
            return new AutocompleteFilter(1, false, Arrays.asList(Integer.valueOf(this.f26860b)), this.f26861c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutocompleteFilter(int i, boolean z, List<Integer> list, String str) {
        boolean z2 = true;
        this.f26854g = i;
        this.f26856i = list;
        this.f26858k = m12359a(list);
        this.f26857j = str;
        if (this.f26854g < 1) {
            this.f26855h = z ? false : z2;
        } else {
            this.f26855h = z;
        }
    }

    /* renamed from: a */
    private static int m12359a(@Nullable Collection<Integer> collection) {
        if (collection == null || collection.isEmpty()) {
            return 0;
        }
        return collection.iterator().next().intValue();
    }

    /* renamed from: a */
    public int m12360a() {
        return this.f26858k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompleteFilter)) {
            return false;
        }
        AutocompleteFilter autocompleteFilter = (AutocompleteFilter) obj;
        return this.f26858k == autocompleteFilter.f26858k && this.f26855h == autocompleteFilter.f26855h && this.f26857j == autocompleteFilter.f26857j;
    }

    public int hashCode() {
        return C4585c.m23633a(Boolean.valueOf(this.f26855h), Integer.valueOf(this.f26858k), this.f26857j);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("includeQueryPredictions", Boolean.valueOf(this.f26855h)).m23632a("typeFilter", Integer.valueOf(this.f26858k)).m23632a("country", this.f26857j).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8297p.m12137a(this, parcel, i);
    }
}
