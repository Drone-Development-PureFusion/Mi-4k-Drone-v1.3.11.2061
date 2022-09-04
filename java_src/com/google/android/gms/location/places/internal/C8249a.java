package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.location.places.internal.a */
/* loaded from: classes2.dex */
public class C8249a implements Parcelable.Creator<AutocompletePredictionEntity> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12278a(AutocompletePredictionEntity autocompletePredictionEntity, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, autocompletePredictionEntity.f27053b, false);
        C4630b.m23464a(parcel, 2, autocompletePredictionEntity.f27054c, false);
        C4630b.m23463a(parcel, 3, autocompletePredictionEntity.f27055d, false);
        C4630b.m23447c(parcel, 4, autocompletePredictionEntity.f27056e, false);
        C4630b.m23475a(parcel, 5, autocompletePredictionEntity.f27057f);
        C4630b.m23464a(parcel, 6, autocompletePredictionEntity.f27058g, false);
        C4630b.m23447c(parcel, 7, autocompletePredictionEntity.f27059h, false);
        C4630b.m23475a(parcel, 1000, autocompletePredictionEntity.f27052a);
        C4630b.m23464a(parcel, 8, autocompletePredictionEntity.f27060i, false);
        C4630b.m23447c(parcel, 9, autocompletePredictionEntity.f27061j, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AutocompletePredictionEntity createFromParcel(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        ArrayList arrayList3 = null;
        String str3 = null;
        ArrayList<Integer> arrayList4 = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    arrayList4 = C4628a.m23519D(parcel, m23514a);
                    break;
                case 4:
                    arrayList3 = C4628a.m23504c(parcel, m23514a, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;
                case 5:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;
                case 8:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    arrayList = C4628a.m23504c(parcel, m23514a, AutocompletePredictionEntity.SubstringEntity.CREATOR);
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
        return new AutocompletePredictionEntity(i2, str4, arrayList4, i, str3, arrayList3, str2, arrayList2, str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AutocompletePredictionEntity[] newArray(int i) {
        return new AutocompletePredictionEntity[i];
    }
}
