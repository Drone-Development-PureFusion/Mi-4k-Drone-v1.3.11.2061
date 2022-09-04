package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.maps.model.u */
/* loaded from: classes2.dex */
public class C8629u implements Parcelable.Creator<PointOfInterest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10931a(PointOfInterest pointOfInterest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, pointOfInterest.m11328a());
        C4630b.m23470a(parcel, 2, (Parcelable) pointOfInterest.f27490a, i, false);
        C4630b.m23464a(parcel, 3, pointOfInterest.f27491b, false);
        C4630b.m23464a(parcel, 4, pointOfInterest.f27492c, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PointOfInterest createFromParcel(Parcel parcel) {
        String m23490q;
        String str;
        LatLng latLng;
        int i;
        String str2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        String str3 = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    String str4 = str2;
                    str = str3;
                    latLng = latLng2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23490q = str4;
                    break;
                case 2:
                    i = i2;
                    String str5 = str3;
                    latLng = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    m23490q = str2;
                    str = str5;
                    break;
                case 3:
                    latLng = latLng2;
                    i = i2;
                    String str6 = str2;
                    str = C4628a.m23490q(parcel, m23514a);
                    m23490q = str6;
                    break;
                case 4:
                    m23490q = C4628a.m23490q(parcel, m23514a);
                    str = str3;
                    latLng = latLng2;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23490q = str2;
                    str = str3;
                    latLng = latLng2;
                    i = i2;
                    break;
            }
            i2 = i;
            latLng2 = latLng;
            str3 = str;
            str2 = m23490q;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PointOfInterest(i2, latLng2, str3, str2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PointOfInterest[] newArray(int i) {
        return new PointOfInterest[i];
    }
}
