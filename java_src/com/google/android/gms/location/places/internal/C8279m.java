package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.location.places.internal.m */
/* loaded from: classes2.dex */
public class C8279m implements Parcelable.Creator<PlaceLikelihoodEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12201a(PlaceLikelihoodEntity placeLikelihoodEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) placeLikelihoodEntity.f27104b, i, false);
        C4630b.m23476a(parcel, 2, placeLikelihoodEntity.f27105c);
        C4630b.m23475a(parcel, 1000, placeLikelihoodEntity.f27103a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlaceLikelihoodEntity createFromParcel(Parcel parcel) {
        PlaceEntity placeEntity;
        int m23500g;
        float f;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        PlaceEntity placeEntity2 = null;
        float f2 = 0.0f;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    PlaceEntity placeEntity3 = (PlaceEntity) C4628a.m23510a(parcel, m23514a, PlaceEntity.CREATOR);
                    m23500g = i;
                    f = f2;
                    placeEntity = placeEntity3;
                    break;
                case 2:
                    f = C4628a.m23495l(parcel, m23514a);
                    placeEntity = placeEntity2;
                    m23500g = i;
                    break;
                case 1000:
                    float f3 = f2;
                    placeEntity = placeEntity2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    f = f3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    f = f2;
                    placeEntity = placeEntity2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            placeEntity2 = placeEntity;
            f2 = f;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PlaceLikelihoodEntity(i, placeEntity2, f2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlaceLikelihoodEntity[] newArray(int i) {
        return new PlaceLikelihoodEntity[i];
    }
}
