package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.os.Parcel;
import com.google.android.gms.common.C4515b;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
/* loaded from: classes2.dex */
public class PlacesParams extends AbstractSafeParcelable {

    /* renamed from: b */
    public final int f27113b;

    /* renamed from: c */
    public final String f27114c;

    /* renamed from: d */
    public final String f27115d;

    /* renamed from: e */
    public final String f27116e;

    /* renamed from: f */
    public final String f27117f;

    /* renamed from: g */
    public final int f27118g;

    /* renamed from: h */
    public final int f27119h;

    /* renamed from: a */
    public static final PlacesParams f27112a = new PlacesParams("com.google.android.gms", Locale.getDefault(), null);
    public static final C8286s CREATOR = new C8286s();

    public PlacesParams(int i, String str, String str2, String str3, String str4, int i2, int i3) {
        this.f27113b = i;
        this.f27114c = str;
        this.f27115d = str2;
        this.f27116e = str3;
        this.f27117f = str4;
        this.f27118g = i2;
        this.f27119h = i3;
    }

    public PlacesParams(String str, Locale locale, String str2) {
        this(3, str, locale.toString(), str2, null, C4515b.f16876a, 0);
    }

    public PlacesParams(String str, Locale locale, String str2, String str3, int i) {
        this(3, str, locale.toString(), str2, str3, C4515b.f16876a, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PlacesParams)) {
            return false;
        }
        PlacesParams placesParams = (PlacesParams) obj;
        return this.f27118g == placesParams.f27118g && this.f27119h == placesParams.f27119h && this.f27115d.equals(placesParams.f27115d) && this.f27114c.equals(placesParams.f27114c) && C4585c.m23634a(this.f27116e, placesParams.f27116e) && C4585c.m23634a(this.f27117f, placesParams.f27117f);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f27114c, this.f27115d, this.f27116e, this.f27117f, Integer.valueOf(this.f27118g), Integer.valueOf(this.f27119h));
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return C4585c.m23635a(this).m23632a("clientPackageName", this.f27114c).m23632a("locale", this.f27115d).m23632a("accountName", this.f27116e).m23632a("gCoreClientName", this.f27117f).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8286s.m12164a(this, parcel, i);
    }
}
