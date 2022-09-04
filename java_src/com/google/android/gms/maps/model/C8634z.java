package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.maps.model.z */
/* loaded from: classes2.dex */
public class C8634z implements Parcelable.Creator<StreetViewPanoramaLocation> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10916a(StreetViewPanoramaLocation streetViewPanoramaLocation, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, streetViewPanoramaLocation.m11278a());
        C4630b.m23456a(parcel, 2, (Parcelable[]) streetViewPanoramaLocation.f27523a, i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) streetViewPanoramaLocation.f27524b, i, false);
        C4630b.m23464a(parcel, 4, streetViewPanoramaLocation.f27525c, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StreetViewPanoramaLocation createFromParcel(Parcel parcel) {
        String m23490q;
        LatLng latLng;
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr;
        int i;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        LatLng latLng2 = null;
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    String str2 = str;
                    latLng = latLng2;
                    streetViewPanoramaLinkArr = streetViewPanoramaLinkArr2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23490q = str2;
                    break;
                case 2:
                    i = i2;
                    LatLng latLng3 = latLng2;
                    streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) C4628a.m23506b(parcel, m23514a, StreetViewPanoramaLink.CREATOR);
                    m23490q = str;
                    latLng = latLng3;
                    break;
                case 3:
                    streetViewPanoramaLinkArr = streetViewPanoramaLinkArr2;
                    i = i2;
                    String str3 = str;
                    latLng = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    m23490q = str3;
                    break;
                case 4:
                    m23490q = C4628a.m23490q(parcel, m23514a);
                    latLng = latLng2;
                    streetViewPanoramaLinkArr = streetViewPanoramaLinkArr2;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23490q = str;
                    latLng = latLng2;
                    streetViewPanoramaLinkArr = streetViewPanoramaLinkArr2;
                    i = i2;
                    break;
            }
            i2 = i;
            streetViewPanoramaLinkArr2 = streetViewPanoramaLinkArr;
            latLng2 = latLng;
            str = m23490q;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new StreetViewPanoramaLocation(i2, streetViewPanoramaLinkArr2, latLng2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StreetViewPanoramaLocation[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }
}
