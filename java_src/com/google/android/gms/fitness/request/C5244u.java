package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSource;
/* renamed from: com.google.android.gms.fitness.request.u */
/* loaded from: classes2.dex */
public class C5244u implements Parcelable.Creator<DataSourceQueryParams> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20983a(DataSourceQueryParams dataSourceQueryParams, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) dataSourceQueryParams.f18903b, i, false);
        C4630b.m23474a(parcel, 2, dataSourceQueryParams.f18904c);
        C4630b.m23474a(parcel, 3, dataSourceQueryParams.f18905d);
        C4630b.m23474a(parcel, 4, dataSourceQueryParams.f18906e);
        C4630b.m23475a(parcel, 5, dataSourceQueryParams.f18907f);
        C4630b.m23475a(parcel, 6, dataSourceQueryParams.f18908g);
        C4630b.m23475a(parcel, 1000, dataSourceQueryParams.f18902a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataSourceQueryParams createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        DataSource dataSource = null;
        int i2 = 0;
        long j2 = 0;
        long j3 = 0;
        int i3 = 0;
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
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 5:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
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
        return new DataSourceQueryParams(i3, dataSource, j3, j2, j, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataSourceQueryParams[] newArray(int i) {
        return new DataSourceQueryParams[i];
    }
}
