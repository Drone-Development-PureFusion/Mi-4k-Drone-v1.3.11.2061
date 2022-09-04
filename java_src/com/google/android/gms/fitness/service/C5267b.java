package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSource;
/* renamed from: com.google.android.gms.fitness.service.b */
/* loaded from: classes2.dex */
public class C5267b implements Parcelable.Creator<FitnessSensorServiceRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20845a(FitnessSensorServiceRequest fitnessSensorServiceRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) fitnessSensorServiceRequest.m20856a(), i, false);
        C4630b.m23472a(parcel, 2, fitnessSensorServiceRequest.m20850d(), false);
        C4630b.m23474a(parcel, 3, fitnessSensorServiceRequest.m20849e());
        C4630b.m23474a(parcel, 4, fitnessSensorServiceRequest.m20848f());
        C4630b.m23475a(parcel, 1000, fitnessSensorServiceRequest.m20851c());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FitnessSensorServiceRequest createFromParcel(Parcel parcel) {
        long j = 0;
        IBinder iBinder = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j2 = 0;
        DataSource dataSource = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    dataSource = (DataSource) C4628a.m23510a(parcel, m23514a, DataSource.CREATOR);
                    break;
                case 2:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 3:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
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
        return new FitnessSensorServiceRequest(i, dataSource, iBinder, j2, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FitnessSensorServiceRequest[] newArray(int i) {
        return new FitnessSensorServiceRequest[i];
    }
}
