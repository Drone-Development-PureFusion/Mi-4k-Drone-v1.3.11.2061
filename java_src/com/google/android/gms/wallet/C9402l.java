package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
/* renamed from: com.google.android.gms.wallet.l */
/* loaded from: classes2.dex */
public class C9402l implements Parcelable.Creator<GiftCardWalletObject> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8219a(GiftCardWalletObject giftCardWalletObject, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, giftCardWalletObject.m8572a());
        C4630b.m23470a(parcel, 2, (Parcelable) giftCardWalletObject.f29454b, i, false);
        C4630b.m23464a(parcel, 3, giftCardWalletObject.f29455c, false);
        C4630b.m23464a(parcel, 4, giftCardWalletObject.f29456d, false);
        C4630b.m23464a(parcel, 5, giftCardWalletObject.f29457e, false);
        C4630b.m23474a(parcel, 6, giftCardWalletObject.f29458f);
        C4630b.m23464a(parcel, 7, giftCardWalletObject.f29459g, false);
        C4630b.m23474a(parcel, 8, giftCardWalletObject.f29460h);
        C4630b.m23464a(parcel, 9, giftCardWalletObject.f29461i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GiftCardWalletObject createFromParcel(Parcel parcel) {
        long j = 0;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str2 = null;
        long j2 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        CommonWalletObject commonWalletObject = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    commonWalletObject = (CommonWalletObject) C4628a.m23510a(parcel, m23514a, CommonWalletObject.CREATOR);
                    break;
                case 3:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 7:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 9:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GiftCardWalletObject(i, commonWalletObject, str5, str4, str3, j2, str2, j, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GiftCardWalletObject[] newArray(int i) {
        return new GiftCardWalletObject[i];
    }
}
