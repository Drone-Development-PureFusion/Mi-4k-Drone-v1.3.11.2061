package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.location.places.internal.s */
/* loaded from: classes2.dex */
public class C8286s implements Parcelable.Creator<PlacesParams> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12164a(PlacesParams placesParams, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, placesParams.f27114c, false);
        C4630b.m23464a(parcel, 2, placesParams.f27115d, false);
        C4630b.m23464a(parcel, 3, placesParams.f27116e, false);
        C4630b.m23464a(parcel, 4, placesParams.f27117f, false);
        C4630b.m23475a(parcel, 6, placesParams.f27118g);
        C4630b.m23475a(parcel, 7, placesParams.f27119h);
        C4630b.m23475a(parcel, 1000, placesParams.f27113b);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlacesParams createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 1000:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PlacesParams(i3, str4, str3, str2, str, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlacesParams[] newArray(int i) {
        return new PlacesParams[i];
    }
}
