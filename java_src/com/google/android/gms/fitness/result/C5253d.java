package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSource;
/* renamed from: com.google.android.gms.fitness.result.d */
/* loaded from: classes2.dex */
public class C5253d implements Parcelable.Creator<DataSourceStatsResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20894a(DataSourceStatsResult dataSourceStatsResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) dataSourceStatsResult.f19093b, i, false);
        C4630b.m23474a(parcel, 2, dataSourceStatsResult.f19094c);
        C4630b.m23461a(parcel, 3, dataSourceStatsResult.f19095d);
        C4630b.m23474a(parcel, 4, dataSourceStatsResult.f19096e);
        C4630b.m23474a(parcel, 5, dataSourceStatsResult.f19097f);
        C4630b.m23475a(parcel, 1000, dataSourceStatsResult.f19092a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataSourceStatsResult createFromParcel(Parcel parcel) {
        boolean z = false;
        long j = 0;
        int m23508b = C4628a.m23508b(parcel);
        DataSource dataSource = null;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    dataSource = (DataSource) C4628a.m23510a(parcel, m23514a, DataSource.CREATOR);
                    break;
                case 2:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 5:
                    j = C4628a.m23498i(parcel, m23514a);
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
        return new DataSourceStatsResult(i, dataSource, j3, z, j2, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataSourceStatsResult[] newArray(int i) {
        return new DataSourceStatsResult[i];
    }
}
