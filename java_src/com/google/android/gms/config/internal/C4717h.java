package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.config.internal.h */
/* loaded from: classes2.dex */
public class C4717h implements Parcelable.Creator<FetchConfigIpcResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23031a(FetchConfigIpcResponse fetchConfigIpcResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, fetchConfigIpcResponse.m23061a());
        C4630b.m23475a(parcel, 2, fetchConfigIpcResponse.m23060b());
        C4630b.m23470a(parcel, 3, (Parcelable) fetchConfigIpcResponse.m23059c(), i, false);
        C4630b.m23474a(parcel, 4, fetchConfigIpcResponse.m23058d());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FetchConfigIpcResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        DataHolder dataHolder = null;
        long j = 0;
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
                    dataHolder = (DataHolder) C4628a.m23510a(parcel, m23514a, DataHolder.CREATOR);
                    break;
                case 4:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new FetchConfigIpcResponse(i2, i, dataHolder, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FetchConfigIpcResponse[] newArray(int i) {
        return new FetchConfigIpcResponse[i];
    }
}
