package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.maps.model.q */
/* loaded from: classes2.dex */
public class C8625q implements Parcelable.Creator<LatLngBounds> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10943a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, latLngBounds.m11374a());
        C4630b.m23470a(parcel, 2, (Parcelable) latLngBounds.f27465a, i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) latLngBounds.f27466b, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LatLngBounds createFromParcel(Parcel parcel) {
        LatLng latLng;
        LatLng latLng2;
        int i;
        LatLng latLng3 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    LatLng latLng5 = latLng3;
                    latLng2 = latLng4;
                    i = C4628a.m23500g(parcel, m23514a);
                    latLng = latLng5;
                    break;
                case 2:
                    LatLng latLng6 = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    i = i2;
                    latLng = latLng3;
                    latLng2 = latLng6;
                    break;
                case 3:
                    latLng = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    latLng2 = latLng4;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    latLng = latLng3;
                    latLng2 = latLng4;
                    i = i2;
                    break;
            }
            i2 = i;
            latLng4 = latLng2;
            latLng3 = latLng;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new LatLngBounds(i2, latLng4, latLng3);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
