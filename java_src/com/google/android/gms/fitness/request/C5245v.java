package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.request.v */
/* loaded from: classes2.dex */
public class C5245v implements Parcelable.Creator<DataSourcesRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20980a(DataSourcesRequest dataSourcesRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23447c(parcel, 1, dataSourcesRequest.m21304a(), false);
        C4630b.m23463a(parcel, 2, dataSourcesRequest.m21303b(), false);
        C4630b.m23461a(parcel, 3, dataSourcesRequest.m21302c());
        C4630b.m23472a(parcel, 4, dataSourcesRequest.m21301d(), false);
        C4630b.m23475a(parcel, 1000, dataSourcesRequest.m21300e());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataSourcesRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        IBinder iBinder = null;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList<Integer> arrayList = null;
        ArrayList arrayList2 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, DataType.CREATOR);
                    break;
                case 2:
                    arrayList = C4628a.m23519D(parcel, m23514a);
                    break;
                case 3:
                    z = C4628a.m23505c(parcel, m23514a);
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
        return new DataSourcesRequest(i, arrayList2, arrayList, z, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataSourcesRequest[] newArray(int i) {
        return new DataSourcesRequest[i];
    }
}
