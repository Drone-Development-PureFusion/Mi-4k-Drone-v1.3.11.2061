package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.request.k */
/* loaded from: classes2.dex */
public class C5234k implements Parcelable.Creator<StartBleScanRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21013a(StartBleScanRequest startBleScanRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23447c(parcel, 1, startBleScanRequest.m21136a(), false);
        C4630b.m23472a(parcel, 2, startBleScanRequest.m21134c(), false);
        C4630b.m23475a(parcel, 3, startBleScanRequest.m21135b());
        C4630b.m23472a(parcel, 4, startBleScanRequest.m21133d(), false);
        C4630b.m23475a(parcel, 1000, startBleScanRequest.m21132e());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StartBleScanRequest createFromParcel(Parcel parcel) {
        int i = 0;
        IBinder iBinder = null;
        int m23508b = C4628a.m23508b(parcel);
        IBinder iBinder2 = null;
        ArrayList arrayList = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList = C4628a.m23504c(parcel, m23514a, DataType.CREATOR);
                    break;
                case 2:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 1000:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new StartBleScanRequest(i2, arrayList, iBinder2, i, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StartBleScanRequest[] newArray(int i) {
        return new StartBleScanRequest[i];
    }
}
