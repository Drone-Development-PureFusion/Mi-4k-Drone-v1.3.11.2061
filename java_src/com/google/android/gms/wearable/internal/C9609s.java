package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wearable.internal.s */
/* loaded from: classes2.dex */
public class C9609s implements Parcelable.Creator<GetDataItemResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7743a(GetDataItemResponse getDataItemResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, getDataItemResponse.f29960a);
        C4630b.m23475a(parcel, 2, getDataItemResponse.f29961b);
        C4630b.m23470a(parcel, 3, (Parcelable) getDataItemResponse.f29962c, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetDataItemResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        DataItemParcelable dataItemParcelable = null;
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
                    dataItemParcelable = (DataItemParcelable) C4628a.m23510a(parcel, m23514a, DataItemParcelable.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GetDataItemResponse(i2, i, dataItemParcelable);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetDataItemResponse[] newArray(int i) {
        return new GetDataItemResponse[i];
    }
}
