package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.location.places.r */
/* loaded from: classes2.dex */
public class C8307r implements Parcelable.Creator<NearbyAlertRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12108a(NearbyAlertRequest nearbyAlertRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, nearbyAlertRequest.m12351b());
        C4630b.m23475a(parcel, 2, nearbyAlertRequest.m12350c());
        C4630b.m23470a(parcel, 3, (Parcelable) nearbyAlertRequest.m12349d(), i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) nearbyAlertRequest.m12348e(), i, false);
        C4630b.m23461a(parcel, 5, nearbyAlertRequest.m12347f());
        C4630b.m23475a(parcel, 6, nearbyAlertRequest.m12346g());
        C4630b.m23475a(parcel, 7, nearbyAlertRequest.m12345h());
        C4630b.m23475a(parcel, 1000, nearbyAlertRequest.m12352a());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NearbyAlertRequest createFromParcel(Parcel parcel) {
        NearbyAlertFilter nearbyAlertFilter = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = -1;
        int i3 = 110;
        boolean z = false;
        PlaceFilter placeFilter = null;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    placeFilter = (PlaceFilter) C4628a.m23510a(parcel, m23514a, PlaceFilter.CREATOR);
                    break;
                case 4:
                    nearbyAlertFilter = (NearbyAlertFilter) C4628a.m23510a(parcel, m23514a, NearbyAlertFilter.CREATOR);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 1000:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new NearbyAlertRequest(i5, i4, i2, placeFilter, nearbyAlertFilter, z, i, i3);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NearbyAlertRequest[] newArray(int i) {
        return new NearbyAlertRequest[i];
    }
}
