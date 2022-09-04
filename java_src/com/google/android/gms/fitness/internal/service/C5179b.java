package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSource;
/* renamed from: com.google.android.gms.fitness.internal.service.b */
/* loaded from: classes2.dex */
public class C5179b implements Parcelable.Creator<FitnessUnregistrationRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21397a(FitnessUnregistrationRequest fitnessUnregistrationRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) fitnessUnregistrationRequest.m21404a(), i, false);
        C4630b.m23475a(parcel, 1000, fitnessUnregistrationRequest.m21403b());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FitnessUnregistrationRequest createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        DataSource dataSource = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    dataSource = (DataSource) C4628a.m23510a(parcel, m23514a, DataSource.CREATOR);
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
        return new FitnessUnregistrationRequest(i, dataSource);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FitnessUnregistrationRequest[] newArray(int i) {
        return new FitnessUnregistrationRequest[i];
    }
}
