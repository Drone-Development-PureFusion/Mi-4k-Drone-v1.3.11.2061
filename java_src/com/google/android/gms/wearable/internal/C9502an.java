package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.wearable.internal.an */
/* loaded from: classes2.dex */
public class C9502an implements Parcelable.Creator<StorageInfoResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7987a(StorageInfoResponse storageInfoResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, storageInfoResponse.f29996a);
        C4630b.m23475a(parcel, 2, storageInfoResponse.f29997b);
        C4630b.m23474a(parcel, 3, storageInfoResponse.f29998c);
        C4630b.m23447c(parcel, 4, storageInfoResponse.f29999d, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StorageInfoResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        ArrayList arrayList = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    arrayList = C4628a.m23504c(parcel, m23514a, PackageStorageInfo.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new StorageInfoResponse(i2, i, j, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StorageInfoResponse[] newArray(int i) {
        return new StorageInfoResponse[i];
    }
}
