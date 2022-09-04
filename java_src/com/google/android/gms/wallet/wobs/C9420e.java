package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wallet.wobs.e */
/* loaded from: classes2.dex */
public class C9420e implements Parcelable.Creator<LoyaltyPoints> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8158a(LoyaltyPoints loyaltyPoints, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, loyaltyPoints.m8178a());
        C4630b.m23464a(parcel, 2, loyaltyPoints.f29758a, false);
        C4630b.m23470a(parcel, 3, (Parcelable) loyaltyPoints.f29759b, i, false);
        C4630b.m23464a(parcel, 4, loyaltyPoints.f29760c, false);
        C4630b.m23470a(parcel, 5, (Parcelable) loyaltyPoints.f29761d, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LoyaltyPoints createFromParcel(Parcel parcel) {
        TimeInterval timeInterval = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
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
                    loyaltyPointsBalance = (LoyaltyPointsBalance) C4628a.m23510a(parcel, m23514a, LoyaltyPointsBalance.CREATOR);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    timeInterval = (TimeInterval) C4628a.m23510a(parcel, m23514a, TimeInterval.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new LoyaltyPoints(i, str2, loyaltyPointsBalance, str, timeInterval);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LoyaltyPoints[] newArray(int i) {
        return new LoyaltyPoints[i];
    }
}
