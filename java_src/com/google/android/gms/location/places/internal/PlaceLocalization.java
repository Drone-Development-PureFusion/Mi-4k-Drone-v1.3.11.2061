package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public final class PlaceLocalization extends AbstractSafeParcelable {
    public static final C8281o CREATOR = new C8281o();

    /* renamed from: a */
    public final int f27106a;

    /* renamed from: b */
    public final String f27107b;

    /* renamed from: c */
    public final String f27108c;

    /* renamed from: d */
    public final String f27109d;

    /* renamed from: e */
    public final String f27110e;

    /* renamed from: f */
    public final List<String> f27111f;

    public PlaceLocalization(int i, String str, String str2, String str3, String str4, List<String> list) {
        this.f27106a = i;
        this.f27107b = str;
        this.f27108c = str2;
        this.f27109d = str3;
        this.f27110e = str4;
        this.f27111f = list;
    }

    /* renamed from: a */
    public static PlaceLocalization m12281a(String str, String str2, String str3, String str4, List<String> list) {
        return new PlaceLocalization(0, str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceLocalization)) {
            return false;
        }
        PlaceLocalization placeLocalization = (PlaceLocalization) obj;
        return C4585c.m23634a(this.f27107b, placeLocalization.f27107b) && C4585c.m23634a(this.f27108c, placeLocalization.f27108c) && C4585c.m23634a(this.f27109d, placeLocalization.f27109d) && C4585c.m23634a(this.f27110e, placeLocalization.f27110e) && C4585c.m23634a(this.f27111f, placeLocalization.f27111f);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f27107b, this.f27108c, this.f27109d, this.f27110e);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("name", this.f27107b).m23632a("address", this.f27108c).m23632a("internationalPhoneNumber", this.f27109d).m23632a("regularOpenHours", this.f27110e).m23632a("attributions", this.f27111f).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8281o c8281o = CREATOR;
        C8281o.m12195a(this, parcel, i);
    }
}
