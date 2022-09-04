package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public class PlaceUserData extends AbstractSafeParcelable {
    public static final C8305f CREATOR = new C8305f();

    /* renamed from: a */
    final int f27183a;

    /* renamed from: b */
    private final String f27184b;

    /* renamed from: c */
    private final String f27185c;

    /* renamed from: d */
    private final List<PlaceAlias> f27186d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlaceUserData(int i, String str, String str2, List<PlaceAlias> list) {
        this.f27183a = i;
        this.f27184b = str;
        this.f27185c = str2;
        this.f27186d = list;
    }

    /* renamed from: a */
    public String m12132a() {
        return this.f27184b;
    }

    /* renamed from: b */
    public String m12131b() {
        return this.f27185c;
    }

    /* renamed from: c */
    public List<PlaceAlias> m12130c() {
        return this.f27186d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceUserData)) {
            return false;
        }
        PlaceUserData placeUserData = (PlaceUserData) obj;
        return this.f27184b.equals(placeUserData.f27184b) && this.f27185c.equals(placeUserData.f27185c) && this.f27186d.equals(placeUserData.f27186d);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f27184b, this.f27185c, this.f27186d);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("accountName", this.f27184b).m23632a("placeId", this.f27185c).m23632a("placeAliases", this.f27186d).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8305f.m12114a(this, parcel, i);
    }
}
