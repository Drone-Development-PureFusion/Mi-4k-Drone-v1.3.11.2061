package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.request.r */
/* loaded from: classes2.dex */
public class C5241r implements Parcelable.Creator<DataDeleteRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20992a(DataDeleteRequest dataDeleteRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23474a(parcel, 1, dataDeleteRequest.m21374j());
        C4630b.m23474a(parcel, 2, dataDeleteRequest.m21375i());
        C4630b.m23447c(parcel, 3, dataDeleteRequest.m21386a(), false);
        C4630b.m23447c(parcel, 4, dataDeleteRequest.m21383b(), false);
        C4630b.m23447c(parcel, 5, dataDeleteRequest.m21381c(), false);
        C4630b.m23461a(parcel, 6, dataDeleteRequest.m21377g());
        C4630b.m23461a(parcel, 7, dataDeleteRequest.m21376h());
        C4630b.m23475a(parcel, 1000, dataDeleteRequest.m21378f());
        C4630b.m23472a(parcel, 8, dataDeleteRequest.m21373k(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataDeleteRequest createFromParcel(Parcel parcel) {
        long j = 0;
        boolean z = false;
        IBinder iBinder = null;
        int m23508b = C4628a.m23508b(parcel);
        boolean z2 = false;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        long j2 = 0;
        int i = 0;
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
                    arrayList3 = C4628a.m23504c(parcel, m23514a, DataSource.CREATOR);
                    break;
                case 4:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, DataType.CREATOR);
                    break;
                case 5:
                    arrayList = C4628a.m23504c(parcel, m23514a, Session.CREATOR);
                    break;
                case 6:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 8:
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
        return new DataDeleteRequest(i, j2, j, arrayList3, arrayList2, arrayList, z2, z, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataDeleteRequest[] newArray(int i) {
        return new DataDeleteRequest[i];
    }
}
