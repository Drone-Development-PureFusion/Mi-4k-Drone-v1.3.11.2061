package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.request.ak */
/* loaded from: classes2.dex */
public class C5217ak implements Parcelable.Creator<ReadRawRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21074a(ReadRawRequest readRawRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23472a(parcel, 1, readRawRequest.m21227c(), false);
        C4630b.m23447c(parcel, 3, readRawRequest.m21229a(), false);
        C4630b.m23461a(parcel, 4, readRawRequest.m21225e());
        C4630b.m23461a(parcel, 5, readRawRequest.m21226d());
        C4630b.m23475a(parcel, 1000, readRawRequest.m21228b());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ReadRawRequest createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        boolean z2 = false;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 3:
                    arrayList = C4628a.m23504c(parcel, m23514a, DataSourceQueryParams.CREATOR);
                    break;
                case 4:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
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
        return new ReadRawRequest(i, iBinder, arrayList, z2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ReadRawRequest[] newArray(int i) {
        return new ReadRawRequest[i];
    }
}
