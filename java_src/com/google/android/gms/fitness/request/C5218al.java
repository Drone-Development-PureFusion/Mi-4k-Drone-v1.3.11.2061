package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSource;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.request.al */
/* loaded from: classes2.dex */
public class C5218al implements Parcelable.Creator<ReadStatsRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21071a(ReadStatsRequest readStatsRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23472a(parcel, 1, readStatsRequest.m21223b(), false);
        C4630b.m23447c(parcel, 3, readStatsRequest.m21222c(), false);
        C4630b.m23475a(parcel, 1000, readStatsRequest.m21224a());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ReadStatsRequest createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 3:
                    arrayList = C4628a.m23504c(parcel, m23514a, DataSource.CREATOR);
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
        return new ReadStatsRequest(i, iBinder, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ReadStatsRequest[] newArray(int i) {
        return new ReadStatsRequest[i];
    }
}
