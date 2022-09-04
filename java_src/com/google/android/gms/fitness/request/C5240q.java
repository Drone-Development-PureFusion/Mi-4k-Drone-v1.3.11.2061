package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataType;
/* renamed from: com.google.android.gms.fitness.request.q */
/* loaded from: classes2.dex */
public class C5240q implements Parcelable.Creator<DailyTotalRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20995a(DailyTotalRequest dailyTotalRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23472a(parcel, 1, dailyTotalRequest.m21387d(), false);
        C4630b.m23470a(parcel, 2, (Parcelable) dailyTotalRequest.m21389b(), i, false);
        C4630b.m23461a(parcel, 4, dailyTotalRequest.m21388c());
        C4630b.m23475a(parcel, 1000, dailyTotalRequest.m21390a());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DailyTotalRequest createFromParcel(Parcel parcel) {
        DataType dataType;
        IBinder iBinder;
        int m23500g;
        boolean z;
        DataType dataType2 = null;
        boolean z2 = false;
        int m23508b = C4628a.m23508b(parcel);
        IBinder iBinder2 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    m23500g = i;
                    DataType dataType3 = dataType2;
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    z = z2;
                    dataType = dataType3;
                    break;
                case 2:
                    iBinder = iBinder2;
                    m23500g = i;
                    boolean z3 = z2;
                    dataType = (DataType) C4628a.m23510a(parcel, m23514a, DataType.CREATOR);
                    z = z3;
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    dataType = dataType2;
                    iBinder = iBinder2;
                    m23500g = i;
                    break;
                case 1000:
                    boolean z4 = z2;
                    dataType = dataType2;
                    iBinder = iBinder2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    z = z4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    z = z2;
                    dataType = dataType2;
                    iBinder = iBinder2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            iBinder2 = iBinder;
            dataType2 = dataType;
            z2 = z;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new DailyTotalRequest(i, iBinder2, dataType2, z2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DailyTotalRequest[] newArray(int i) {
        return new DailyTotalRequest[i];
    }
}
