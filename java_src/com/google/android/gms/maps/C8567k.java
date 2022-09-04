package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
/* renamed from: com.google.android.gms.maps.k */
/* loaded from: classes2.dex */
public class C8567k implements Parcelable.Creator<GoogleMapOptions> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m11431a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, googleMapOptions.m12013a());
        C4630b.m23478a(parcel, 2, googleMapOptions.m12006b());
        C4630b.m23478a(parcel, 3, googleMapOptions.m12003c());
        C4630b.m23475a(parcel, 4, googleMapOptions.m11982o());
        C4630b.m23470a(parcel, 5, (Parcelable) googleMapOptions.m11981p(), i, false);
        C4630b.m23478a(parcel, 6, googleMapOptions.m12001d());
        C4630b.m23478a(parcel, 7, googleMapOptions.m11999e());
        C4630b.m23478a(parcel, 8, googleMapOptions.m11997f());
        C4630b.m23478a(parcel, 9, googleMapOptions.m11995g());
        C4630b.m23478a(parcel, 10, googleMapOptions.m11993h());
        C4630b.m23478a(parcel, 11, googleMapOptions.m11991i());
        C4630b.m23478a(parcel, 12, googleMapOptions.m11989j());
        C4630b.m23478a(parcel, 14, googleMapOptions.m11987k());
        C4630b.m23478a(parcel, 15, googleMapOptions.m11985l());
        C4630b.m23467a(parcel, 16, googleMapOptions.m11971z(), false);
        C4630b.m23467a(parcel, 17, googleMapOptions.m12015A(), false);
        C4630b.m23470a(parcel, 18, (Parcelable) googleMapOptions.m12014B(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GoogleMapOptions createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        byte b = -1;
        byte b2 = -1;
        int i2 = 0;
        CameraPosition cameraPosition = null;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    b = C4628a.m23502e(parcel, m23514a);
                    break;
                case 3:
                    b2 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) C4628a.m23510a(parcel, m23514a, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 7:
                    b4 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 8:
                    b5 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 9:
                    b6 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 10:
                    b7 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 11:
                    b8 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 12:
                    b9 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 13:
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
                case 14:
                    b10 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 15:
                    b11 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 16:
                    f = C4628a.m23494m(parcel, m23514a);
                    break;
                case 17:
                    f2 = C4628a.m23494m(parcel, m23514a);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) C4628a.m23510a(parcel, m23514a, LatLngBounds.CREATOR);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GoogleMapOptions(i, b, b2, i2, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
