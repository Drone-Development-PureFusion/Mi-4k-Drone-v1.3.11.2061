package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wallet.firstparty.c */
/* loaded from: classes2.dex */
public class C9362c implements Parcelable.Creator<GetBuyFlowInitializationTokenRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8415a(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, getBuyFlowInitializationTokenRequest.m8427a());
        C4630b.m23460a(parcel, 2, getBuyFlowInitializationTokenRequest.f29621a, false);
        C4630b.m23460a(parcel, 3, getBuyFlowInitializationTokenRequest.f29622b, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetBuyFlowInitializationTokenRequest createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    bArr2 = C4628a.m23487t(parcel, m23514a);
                    break;
                case 3:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GetBuyFlowInitializationTokenRequest(i, bArr2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetBuyFlowInitializationTokenRequest[] newArray(int i) {
        return new GetBuyFlowInitializationTokenRequest[i];
    }
}
