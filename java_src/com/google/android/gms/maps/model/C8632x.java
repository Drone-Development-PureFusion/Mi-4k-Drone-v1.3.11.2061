package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.maps.model.x */
/* loaded from: classes2.dex */
public class C8632x implements Parcelable.Creator<StreetViewPanoramaCamera> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10922a(StreetViewPanoramaCamera streetViewPanoramaCamera, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, streetViewPanoramaCamera.m11288a());
        C4630b.m23476a(parcel, 2, streetViewPanoramaCamera.f27512a);
        C4630b.m23476a(parcel, 3, streetViewPanoramaCamera.f27513b);
        C4630b.m23476a(parcel, 4, streetViewPanoramaCamera.f27514c);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StreetViewPanoramaCamera createFromParcel(Parcel parcel) {
        float f = 0.0f;
        int m23508b = C4628a.m23508b(parcel);
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    f2 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 3:
                    f3 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 4:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new StreetViewPanoramaCamera(i, f2, f3, f);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StreetViewPanoramaCamera[] newArray(int i) {
        return new StreetViewPanoramaCamera[i];
    }
}
