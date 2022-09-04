package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.fitness.data.l */
/* loaded from: classes2.dex */
public class C5154l implements Parcelable.Creator<DataPoint> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21448a(DataPoint dataPoint, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) dataPoint.m21720c(), i, false);
        C4630b.m23474a(parcel, 3, dataPoint.m21712j());
        C4630b.m23474a(parcel, 4, dataPoint.m21711k());
        C4630b.m23456a(parcel, 5, (Parcelable[]) dataPoint.m21736a(), i, false);
        C4630b.m23470a(parcel, 6, (Parcelable) dataPoint.m21717e(), i, false);
        C4630b.m23474a(parcel, 7, dataPoint.m21716f());
        C4630b.m23475a(parcel, 1000, dataPoint.m21713i());
        C4630b.m23474a(parcel, 8, dataPoint.m21715g());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataPoint createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        DataSource dataSource = null;
        long j = 0;
        long j2 = 0;
        Value[] valueArr = null;
        DataSource dataSource2 = null;
        long j3 = 0;
        long j4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    dataSource = (DataSource) C4628a.m23510a(parcel, m23514a, DataSource.CREATOR);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 5:
                    valueArr = (Value[]) C4628a.m23506b(parcel, m23514a, Value.CREATOR);
                    break;
                case 6:
                    dataSource2 = (DataSource) C4628a.m23510a(parcel, m23514a, DataSource.CREATOR);
                    break;
                case 7:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 8:
                    j4 = C4628a.m23498i(parcel, m23514a);
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
        return new DataPoint(i, dataSource, j, j2, valueArr, dataSource2, j3, j4);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataPoint[] newArray(int i) {
        return new DataPoint[i];
    }
}
