package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.wearable.internal.r */
/* loaded from: classes2.dex */
public class C9608r implements Parcelable.Creator<GetConnectedNodesResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7746a(GetConnectedNodesResponse getConnectedNodesResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, getConnectedNodesResponse.f29957a);
        C4630b.m23475a(parcel, 2, getConnectedNodesResponse.f29958b);
        C4630b.m23447c(parcel, 3, getConnectedNodesResponse.f29959c, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetConnectedNodesResponse createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
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
                    arrayList = C4628a.m23504c(parcel, m23514a, NodeParcelable.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GetConnectedNodesResponse(i2, i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetConnectedNodesResponse[] newArray(int i) {
        return new GetConnectedNodesResponse[i];
    }
}
