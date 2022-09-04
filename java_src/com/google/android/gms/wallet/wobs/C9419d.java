package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.wallet.wobs.d */
/* loaded from: classes2.dex */
public class C9419d implements Parcelable.Creator<LoyaltyPointsBalance> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8161a(LoyaltyPointsBalance loyaltyPointsBalance, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, loyaltyPointsBalance.m8177a());
        C4630b.m23475a(parcel, 2, loyaltyPointsBalance.f29763a);
        C4630b.m23464a(parcel, 3, loyaltyPointsBalance.f29764b, false);
        C4630b.m23477a(parcel, 4, loyaltyPointsBalance.f29765c);
        C4630b.m23464a(parcel, 5, loyaltyPointsBalance.f29766d, false);
        C4630b.m23474a(parcel, 6, loyaltyPointsBalance.f29767e);
        C4630b.m23475a(parcel, 7, loyaltyPointsBalance.f29768f);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LoyaltyPointsBalance createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        double d = C9755a.f30449c;
        long j = 0;
        int i2 = -1;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    d = C4628a.m23493n(parcel, m23514a);
                    break;
                case 5:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 7:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new LoyaltyPointsBalance(i3, i, str2, d, str, j, i2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LoyaltyPointsBalance[] newArray(int i) {
        return new LoyaltyPointsBalance[i];
    }
}
