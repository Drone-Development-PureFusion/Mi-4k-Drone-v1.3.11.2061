package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
/* renamed from: com.google.android.gms.wallet.fragment.g */
/* loaded from: classes2.dex */
public class C9394g implements Parcelable.Creator<WalletFragmentInitParams> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8243a(WalletFragmentInitParams walletFragmentInitParams, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, walletFragmentInitParams.f29671a);
        C4630b.m23464a(parcel, 2, walletFragmentInitParams.m8299b(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) walletFragmentInitParams.m8297c(), i, false);
        C4630b.m23475a(parcel, 4, walletFragmentInitParams.m8295d());
        C4630b.m23470a(parcel, 5, (Parcelable) walletFragmentInitParams.m8294e(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WalletFragmentInitParams createFromParcel(Parcel parcel) {
        MaskedWallet maskedWallet = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        int i2 = -1;
        MaskedWalletRequest maskedWalletRequest = null;
        String str = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    maskedWalletRequest = (MaskedWalletRequest) C4628a.m23510a(parcel, m23514a, MaskedWalletRequest.CREATOR);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    maskedWallet = (MaskedWallet) C4628a.m23510a(parcel, m23514a, MaskedWallet.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new WalletFragmentInitParams(i, str, maskedWalletRequest, i2, maskedWallet);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WalletFragmentInitParams[] newArray(int i) {
        return new WalletFragmentInitParams[i];
    }
}
