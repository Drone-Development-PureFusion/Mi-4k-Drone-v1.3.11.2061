package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.location.places.x */
/* loaded from: classes2.dex */
public class C8326x implements Parcelable.Creator<PlaceRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12055a(PlaceRequest placeRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 2, (Parcelable) placeRequest.m12331a(), i, false);
        C4630b.m23474a(parcel, 3, placeRequest.m12330b());
        C4630b.m23475a(parcel, 4, placeRequest.m12329c());
        C4630b.m23474a(parcel, 5, placeRequest.m12328d());
        C4630b.m23461a(parcel, 6, placeRequest.m12327e());
        C4630b.m23461a(parcel, 7, placeRequest.m12326f());
        C4630b.m23475a(parcel, 1000, placeRequest.f26904a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlaceRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        PlaceFilter placeFilter = null;
        long j = -1;
        int i = -1;
        long j2 = Long.MAX_VALUE;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 2:
                    placeFilter = (PlaceFilter) C4628a.m23510a(parcel, m23514a, PlaceFilter.CREATOR);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 6:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 1000:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PlaceRequest(i2, placeFilter, j, i, j2, z2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlaceRequest[] newArray(int i) {
        return new PlaceRequest[i];
    }
}
