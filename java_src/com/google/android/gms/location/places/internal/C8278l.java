package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.location.places.internal.l */
/* loaded from: classes2.dex */
public class C8278l implements Parcelable.Creator<PlaceEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12204a(PlaceEntity placeEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, placeEntity.mo12184c(), false);
        C4630b.m23473a(parcel, 2, placeEntity.m12301x(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) placeEntity.m12299z(), i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) placeEntity.mo12179h(), i, false);
        C4630b.m23476a(parcel, 5, placeEntity.m12307r());
        C4630b.m23470a(parcel, 6, (Parcelable) placeEntity.mo12178i(), i, false);
        C4630b.m23464a(parcel, 7, placeEntity.m12300y(), false);
        C4630b.m23475a(parcel, 1000, placeEntity.f27085bx);
        C4630b.m23470a(parcel, 8, (Parcelable) placeEntity.mo12177j(), i, false);
        C4630b.m23461a(parcel, 9, placeEntity.m12303v());
        C4630b.m23476a(parcel, 10, placeEntity.mo12175l());
        C4630b.m23475a(parcel, 11, placeEntity.mo12174m());
        C4630b.m23474a(parcel, 12, placeEntity.m12302w());
        C4630b.m23463a(parcel, 13, placeEntity.m12310o(), false);
        C4630b.m23464a(parcel, 14, (String) placeEntity.mo12182e(), false);
        C4630b.m23464a(parcel, 15, (String) placeEntity.mo12176k(), false);
        C4630b.m23464a(parcel, 16, placeEntity.m12305t(), false);
        C4630b.m23449b(parcel, 17, placeEntity.m12304u(), false);
        C4630b.m23464a(parcel, 19, (String) placeEntity.mo12180g(), false);
        C4630b.m23463a(parcel, 20, placeEntity.mo12183d(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlaceEntity createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        ArrayList<Integer> arrayList = null;
        ArrayList<Integer> arrayList2 = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        LatLng latLng = null;
        float f = 0.0f;
        LatLngBounds latLngBounds = null;
        String str6 = null;
        Uri uri = null;
        boolean z = false;
        float f2 = 0.0f;
        int i2 = 0;
        long j = 0;
        PlaceLocalization placeLocalization = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 3:
                    placeLocalization = (PlaceLocalization) C4628a.m23510a(parcel, m23514a, PlaceLocalization.CREATOR);
                    break;
                case 4:
                    latLng = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    break;
                case 5:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C4628a.m23510a(parcel, m23514a, LatLngBounds.CREATOR);
                    break;
                case 7:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 9:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 10:
                    f2 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 11:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 12:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 13:
                    arrayList2 = C4628a.m23519D(parcel, m23514a);
                    break;
                case 14:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 15:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 16:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 17:
                    arrayList3 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 19:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 20:
                    arrayList = C4628a.m23519D(parcel, m23514a);
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
        return new PlaceEntity(i, str, arrayList, arrayList2, bundle, str2, str3, str4, str5, arrayList3, latLng, f, latLngBounds, str6, uri, z, f2, i2, j, placeLocalization);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlaceEntity[] newArray(int i) {
        return new PlaceEntity[i];
    }
}
