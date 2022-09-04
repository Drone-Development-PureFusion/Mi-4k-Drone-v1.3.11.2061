package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSet;
/* renamed from: com.google.android.gms.fitness.request.s */
/* loaded from: classes2.dex */
public class C5242s implements Parcelable.Creator<DataInsertRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20989a(DataInsertRequest dataInsertRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) dataInsertRequest.m21357a(), i, false);
        C4630b.m23472a(parcel, 2, dataInsertRequest.m21355b(), false);
        C4630b.m23461a(parcel, 4, dataInsertRequest.m21354c());
        C4630b.m23475a(parcel, 1000, dataInsertRequest.m21353d());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataInsertRequest createFromParcel(Parcel parcel) {
        IBinder iBinder;
        DataSet dataSet;
        int m23500g;
        boolean z;
        IBinder iBinder2 = null;
        boolean z2 = false;
        int m23508b = C4628a.m23508b(parcel);
        DataSet dataSet2 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    m23500g = i;
                    IBinder iBinder3 = iBinder2;
                    dataSet = (DataSet) C4628a.m23510a(parcel, m23514a, DataSet.CREATOR);
                    z = z2;
                    iBinder = iBinder3;
                    break;
                case 2:
                    dataSet = dataSet2;
                    m23500g = i;
                    boolean z3 = z2;
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    z = z3;
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    iBinder = iBinder2;
                    dataSet = dataSet2;
                    m23500g = i;
                    break;
                case 1000:
                    boolean z4 = z2;
                    iBinder = iBinder2;
                    dataSet = dataSet2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    z = z4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    z = z2;
                    iBinder = iBinder2;
                    dataSet = dataSet2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            dataSet2 = dataSet;
            iBinder2 = iBinder;
            z2 = z;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new DataInsertRequest(i, dataSet2, iBinder2, z2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataInsertRequest[] newArray(int i) {
        return new DataInsertRequest[i];
    }
}
