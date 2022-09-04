package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
/* renamed from: com.google.android.gms.maps.l */
/* loaded from: classes2.dex */
public class C8568l implements Parcelable.Creator<StreetViewPanoramaOptions> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m11428a(StreetViewPanoramaOptions streetViewPanoramaOptions, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, streetViewPanoramaOptions.m11929a());
        C4630b.m23470a(parcel, 2, (Parcelable) streetViewPanoramaOptions.m11914g(), i, false);
        C4630b.m23464a(parcel, 3, streetViewPanoramaOptions.m11911j(), false);
        C4630b.m23470a(parcel, 4, (Parcelable) streetViewPanoramaOptions.m11913h(), i, false);
        C4630b.m23466a(parcel, 5, streetViewPanoramaOptions.m11912i(), false);
        C4630b.m23478a(parcel, 6, streetViewPanoramaOptions.m11923b());
        C4630b.m23478a(parcel, 7, streetViewPanoramaOptions.m11921c());
        C4630b.m23478a(parcel, 8, streetViewPanoramaOptions.m11919d());
        C4630b.m23478a(parcel, 9, streetViewPanoramaOptions.m11917e());
        C4630b.m23478a(parcel, 10, streetViewPanoramaOptions.m11915f());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StreetViewPanoramaOptions createFromParcel(Parcel parcel) {
        Integer num = null;
        byte b = 0;
        int m23508b = C4628a.m23508b(parcel);
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        LatLng latLng = null;
        String str = null;
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) C4628a.m23510a(parcel, m23514a, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    latLng = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    break;
                case 5:
                    num = C4628a.m23499h(parcel, m23514a);
                    break;
                case 6:
                    b5 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 7:
                    b4 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 8:
                    b3 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 9:
                    b2 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 10:
                    b = C4628a.m23502e(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new StreetViewPanoramaOptions(i, streetViewPanoramaCamera, str, latLng, num, b5, b4, b3, b2, b);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StreetViewPanoramaOptions[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
