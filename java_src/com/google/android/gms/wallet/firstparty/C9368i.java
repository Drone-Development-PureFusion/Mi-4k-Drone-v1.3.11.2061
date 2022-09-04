package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wallet.firstparty.i */
/* loaded from: classes2.dex */
public class C9368i implements Parcelable.Creator<InitializeBuyFlowRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8397a(InitializeBuyFlowRequest initializeBuyFlowRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, initializeBuyFlowRequest.m8421a());
        C4630b.m23453a(parcel, 2, initializeBuyFlowRequest.f29635a, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public InitializeBuyFlowRequest createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        byte[][] bArr = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    bArr = C4628a.m23486u(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new InitializeBuyFlowRequest(i, bArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public InitializeBuyFlowRequest[] newArray(int i) {
        return new InitializeBuyFlowRequest[i];
    }
}
