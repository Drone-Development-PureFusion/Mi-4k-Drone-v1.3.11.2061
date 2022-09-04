package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.location.places.internal.o */
/* loaded from: classes2.dex */
public class C8281o implements Parcelable.Creator<PlaceLocalization> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12195a(PlaceLocalization placeLocalization, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, placeLocalization.f27107b, false);
        C4630b.m23464a(parcel, 2, placeLocalization.f27108c, false);
        C4630b.m23464a(parcel, 3, placeLocalization.f27109d, false);
        C4630b.m23464a(parcel, 4, placeLocalization.f27110e, false);
        C4630b.m23449b(parcel, 5, placeLocalization.f27111f, false);
        C4630b.m23475a(parcel, 1000, placeLocalization.f27106a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlaceLocalization createFromParcel(Parcel parcel) {
        ArrayList<String> arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
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
                case 5:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                case 1000:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PlaceLocalization(i, str4, str3, str2, str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlaceLocalization[] newArray(int i) {
        return new PlaceLocalization[i];
    }
}
