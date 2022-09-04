package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.result.f */
/* loaded from: classes2.dex */
public class C5255f implements Parcelable.Creator<DataStatsResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20888a(DataStatsResult dataStatsResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) dataStatsResult.mo7645a(), i, false);
        C4630b.m23447c(parcel, 2, dataStatsResult.m20937c(), false);
        C4630b.m23475a(parcel, 1000, dataStatsResult.m20938b());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataStatsResult createFromParcel(Parcel parcel) {
        Status status;
        int m23500g;
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Status status2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    Status status3 = (Status) C4628a.m23510a(parcel, m23514a, Status.CREATOR);
                    m23500g = i;
                    arrayList = arrayList2;
                    status = status3;
                    break;
                case 2:
                    arrayList = C4628a.m23504c(parcel, m23514a, DataSourceStatsResult.CREATOR);
                    status = status2;
                    m23500g = i;
                    break;
                case 1000:
                    ArrayList arrayList3 = arrayList2;
                    status = status2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    arrayList = arrayList3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    arrayList = arrayList2;
                    status = status2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            status2 = status;
            arrayList2 = arrayList;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new DataStatsResult(i, status2, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataStatsResult[] newArray(int i) {
        return new DataStatsResult[i];
    }
}
