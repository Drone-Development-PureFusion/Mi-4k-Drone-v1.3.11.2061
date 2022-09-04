package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSet;
/* renamed from: com.google.android.gms.fitness.request.aa */
/* loaded from: classes2.dex */
public class C5203aa implements Parcelable.Creator<DataUpdateRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21104a(DataUpdateRequest dataUpdateRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23474a(parcel, 1, dataUpdateRequest.m21261a());
        C4630b.m23474a(parcel, 2, dataUpdateRequest.m21258b());
        C4630b.m23470a(parcel, 3, (Parcelable) dataUpdateRequest.m21256c(), i, false);
        C4630b.m23472a(parcel, 4, dataUpdateRequest.m21255d(), false);
        C4630b.m23475a(parcel, 1000, dataUpdateRequest.m21254e());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataUpdateRequest createFromParcel(Parcel parcel) {
        long j = 0;
        IBinder iBinder = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        DataSet dataSet = null;
        long j2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 2:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    dataSet = (DataSet) C4628a.m23510a(parcel, m23514a, DataSet.CREATOR);
                    break;
                case 4:
                    iBinder = C4628a.m23489r(parcel, m23514a);
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
        return new DataUpdateRequest(i, j2, j, dataSet, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataUpdateRequest[] newArray(int i) {
        return new DataUpdateRequest[i];
    }
}
