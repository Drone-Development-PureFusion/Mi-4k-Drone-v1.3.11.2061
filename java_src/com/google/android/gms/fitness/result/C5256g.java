package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataType;
/* renamed from: com.google.android.gms.fitness.result.g */
/* loaded from: classes2.dex */
public class C5256g implements Parcelable.Creator<DataTypeResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20885a(DataTypeResult dataTypeResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) dataTypeResult.mo7645a(), i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) dataTypeResult.m20934b(), i, false);
        C4630b.m23475a(parcel, 1000, dataTypeResult.m20933c());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataTypeResult createFromParcel(Parcel parcel) {
        Status status;
        int m23500g;
        DataType dataType;
        DataType dataType2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Status status2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    Status status3 = (Status) C4628a.m23510a(parcel, m23514a, Status.CREATOR);
                    m23500g = i;
                    dataType = dataType2;
                    status = status3;
                    break;
                case 3:
                    dataType = (DataType) C4628a.m23510a(parcel, m23514a, DataType.CREATOR);
                    status = status2;
                    m23500g = i;
                    break;
                case 1000:
                    DataType dataType3 = dataType2;
                    status = status2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    dataType = dataType3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    dataType = dataType2;
                    status = status2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            status2 = status;
            dataType2 = dataType;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new DataTypeResult(i, status2, dataType2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataTypeResult[] newArray(int i) {
        return new DataTypeResult[i];
    }
}
