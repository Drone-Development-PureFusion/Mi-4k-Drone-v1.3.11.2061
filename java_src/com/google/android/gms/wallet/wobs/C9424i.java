package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wallet.wobs.i */
/* loaded from: classes2.dex */
public class C9424i implements Parcelable.Creator<WalletObjectMessage> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8146a(WalletObjectMessage walletObjectMessage, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, walletObjectMessage.m8173a());
        C4630b.m23464a(parcel, 2, walletObjectMessage.f29779a, false);
        C4630b.m23464a(parcel, 3, walletObjectMessage.f29780b, false);
        C4630b.m23470a(parcel, 4, (Parcelable) walletObjectMessage.f29781c, i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) walletObjectMessage.f29782d, i, false);
        C4630b.m23470a(parcel, 6, (Parcelable) walletObjectMessage.f29783e, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WalletObjectMessage createFromParcel(Parcel parcel) {
        UriData uriData = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        UriData uriData2 = null;
        TimeInterval timeInterval = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    timeInterval = (TimeInterval) C4628a.m23510a(parcel, m23514a, TimeInterval.CREATOR);
                    break;
                case 5:
                    uriData2 = (UriData) C4628a.m23510a(parcel, m23514a, UriData.CREATOR);
                    break;
                case 6:
                    uriData = (UriData) C4628a.m23510a(parcel, m23514a, UriData.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new WalletObjectMessage(i, str2, str, timeInterval, uriData2, uriData);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WalletObjectMessage[] newArray(int i) {
        return new WalletObjectMessage[i];
    }
}
