package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.location.places.t */
/* loaded from: classes2.dex */
public class C8311t implements Parcelable.Creator<PlaceFilter> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12101a(PlaceFilter placeFilter, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23463a(parcel, 1, placeFilter.f26881b, false);
        C4630b.m23461a(parcel, 3, placeFilter.f26882c);
        C4630b.m23447c(parcel, 4, placeFilter.f26883d, false);
        C4630b.m23449b(parcel, 6, placeFilter.f26884e, false);
        C4630b.m23475a(parcel, 1000, placeFilter.f26880a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlaceFilter createFromParcel(Parcel parcel) {
        boolean z = false;
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList<String> arrayList2 = null;
        ArrayList<Integer> arrayList3 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList3 = C4628a.m23519D(parcel, m23514a);
                    break;
                case 3:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    arrayList = C4628a.m23504c(parcel, m23514a, UserDataType.CREATOR);
                    break;
                case 6:
                    arrayList2 = C4628a.m23518E(parcel, m23514a);
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
        return new PlaceFilter(i, arrayList3, z, arrayList2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlaceFilter[] newArray(int i) {
        return new PlaceFilter[i];
    }
}
