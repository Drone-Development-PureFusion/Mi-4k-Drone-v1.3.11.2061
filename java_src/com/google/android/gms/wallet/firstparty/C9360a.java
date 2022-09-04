package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wallet.firstparty.a */
/* loaded from: classes2.dex */
public class C9360a implements Parcelable.Creator<ExecuteBuyFlowRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8418a(ExecuteBuyFlowRequest executeBuyFlowRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, executeBuyFlowRequest.m8428a());
        C4630b.m23460a(parcel, 2, executeBuyFlowRequest.f29617a, false);
        C4630b.m23460a(parcel, 3, executeBuyFlowRequest.f29618b, false);
        C4630b.m23470a(parcel, 4, (Parcelable) executeBuyFlowRequest.f29619c, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ExecuteBuyFlowRequest createFromParcel(Parcel parcel) {
        WalletCustomTheme walletCustomTheme = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        byte[] bArr = null;
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
                case 4:
                    walletCustomTheme = (WalletCustomTheme) C4628a.m23510a(parcel, m23514a, WalletCustomTheme.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ExecuteBuyFlowRequest(i, bArr2, bArr, walletCustomTheme);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ExecuteBuyFlowRequest[] newArray(int i) {
        return new ExecuteBuyFlowRequest[i];
    }
}
