package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.identity.intents.model.UserAddress;
/* renamed from: com.google.android.gms.wallet.q */
/* loaded from: classes2.dex */
public class C9407q implements Parcelable.Creator<MaskedWallet> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8204a(MaskedWallet maskedWallet, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, maskedWallet.m8536b());
        C4630b.m23464a(parcel, 2, maskedWallet.f29502a, false);
        C4630b.m23464a(parcel, 3, maskedWallet.f29503b, false);
        C4630b.m23455a(parcel, 4, maskedWallet.f29504c, false);
        C4630b.m23464a(parcel, 5, maskedWallet.f29505d, false);
        C4630b.m23470a(parcel, 6, (Parcelable) maskedWallet.f29506e, i, false);
        C4630b.m23470a(parcel, 7, (Parcelable) maskedWallet.f29507f, i, false);
        C4630b.m23456a(parcel, 8, (Parcelable[]) maskedWallet.f29508g, i, false);
        C4630b.m23456a(parcel, 9, (Parcelable[]) maskedWallet.f29509h, i, false);
        C4630b.m23470a(parcel, 10, (Parcelable) maskedWallet.f29510i, i, false);
        C4630b.m23470a(parcel, 11, (Parcelable) maskedWallet.f29511j, i, false);
        C4630b.m23456a(parcel, 12, (Parcelable[]) maskedWallet.f29512k, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MaskedWallet createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        Address address = null;
        Address address2 = null;
        LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
        OfferWalletObject[] offerWalletObjectArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
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
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    strArr = C4628a.m23520C(parcel, m23514a);
                    break;
                case 5:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    address = (Address) C4628a.m23510a(parcel, m23514a, Address.CREATOR);
                    break;
                case 7:
                    address2 = (Address) C4628a.m23510a(parcel, m23514a, Address.CREATOR);
                    break;
                case 8:
                    loyaltyWalletObjectArr = (LoyaltyWalletObject[]) C4628a.m23506b(parcel, m23514a, LoyaltyWalletObject.CREATOR);
                    break;
                case 9:
                    offerWalletObjectArr = (OfferWalletObject[]) C4628a.m23506b(parcel, m23514a, OfferWalletObject.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) C4628a.m23510a(parcel, m23514a, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) C4628a.m23510a(parcel, m23514a, UserAddress.CREATOR);
                    break;
                case 12:
                    instrumentInfoArr = (InstrumentInfo[]) C4628a.m23506b(parcel, m23514a, InstrumentInfo.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new MaskedWallet(i, str, str2, strArr, str3, address, address2, loyaltyWalletObjectArr, offerWalletObjectArr, userAddress, userAddress2, instrumentInfoArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MaskedWallet[] newArray(int i) {
        return new MaskedWallet[i];
    }
}
