package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.identity.intents.model.UserAddress;
/* renamed from: com.google.android.gms.wallet.j */
/* loaded from: classes2.dex */
public class C9400j implements Parcelable.Creator<FullWallet> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8225a(FullWallet fullWallet, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, fullWallet.m8591a());
        C4630b.m23464a(parcel, 2, fullWallet.f29436a, false);
        C4630b.m23464a(parcel, 3, fullWallet.f29437b, false);
        C4630b.m23470a(parcel, 4, (Parcelable) fullWallet.f29438c, i, false);
        C4630b.m23464a(parcel, 5, fullWallet.f29439d, false);
        C4630b.m23470a(parcel, 6, (Parcelable) fullWallet.f29440e, i, false);
        C4630b.m23470a(parcel, 7, (Parcelable) fullWallet.f29441f, i, false);
        C4630b.m23455a(parcel, 8, fullWallet.f29442g, false);
        C4630b.m23470a(parcel, 9, (Parcelable) fullWallet.f29443h, i, false);
        C4630b.m23470a(parcel, 10, (Parcelable) fullWallet.f29444i, i, false);
        C4630b.m23456a(parcel, 11, (Parcelable[]) fullWallet.f29445j, i, false);
        C4630b.m23470a(parcel, 12, (Parcelable) fullWallet.f29446k, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FullWallet createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        ProxyCard proxyCard = null;
        String str3 = null;
        Address address = null;
        Address address2 = null;
        String[] strArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        PaymentMethodToken paymentMethodToken = null;
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
                    proxyCard = (ProxyCard) C4628a.m23510a(parcel, m23514a, ProxyCard.CREATOR);
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
                    strArr = C4628a.m23520C(parcel, m23514a);
                    break;
                case 9:
                    userAddress = (UserAddress) C4628a.m23510a(parcel, m23514a, UserAddress.CREATOR);
                    break;
                case 10:
                    userAddress2 = (UserAddress) C4628a.m23510a(parcel, m23514a, UserAddress.CREATOR);
                    break;
                case 11:
                    instrumentInfoArr = (InstrumentInfo[]) C4628a.m23506b(parcel, m23514a, InstrumentInfo.CREATOR);
                    break;
                case 12:
                    paymentMethodToken = (PaymentMethodToken) C4628a.m23510a(parcel, m23514a, PaymentMethodToken.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new FullWallet(i, str, str2, proxyCard, str3, address, address2, strArr, userAddress, userAddress2, instrumentInfoArr, paymentMethodToken);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FullWallet[] newArray(int i) {
        return new FullWallet[i];
    }
}
