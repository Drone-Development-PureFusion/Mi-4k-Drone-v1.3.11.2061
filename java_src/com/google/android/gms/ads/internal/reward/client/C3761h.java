package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.ads.internal.reward.client.h */
/* loaded from: classes2.dex */
public class C3761h implements Parcelable.Creator<RewardedVideoAdRequestParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m26964a(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, rewardedVideoAdRequestParcel.f14660a);
        C4630b.m23470a(parcel, 2, (Parcelable) rewardedVideoAdRequestParcel.f14661b, i, false);
        C4630b.m23464a(parcel, 3, rewardedVideoAdRequestParcel.f14662c, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RewardedVideoAdRequestParcel createFromParcel(Parcel parcel) {
        String m23490q;
        AdRequestParcel adRequestParcel;
        int i;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        AdRequestParcel adRequestParcel2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    String str2 = str;
                    adRequestParcel = adRequestParcel2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23490q = str2;
                    break;
                case 2:
                    AdRequestParcel adRequestParcel3 = (AdRequestParcel) C4628a.m23510a(parcel, m23514a, AdRequestParcel.CREATOR);
                    i = i2;
                    m23490q = str;
                    adRequestParcel = adRequestParcel3;
                    break;
                case 3:
                    m23490q = C4628a.m23490q(parcel, m23514a);
                    adRequestParcel = adRequestParcel2;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23490q = str;
                    adRequestParcel = adRequestParcel2;
                    i = i2;
                    break;
            }
            i2 = i;
            adRequestParcel2 = adRequestParcel;
            str = m23490q;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new RewardedVideoAdRequestParcel(i2, adRequestParcel2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RewardedVideoAdRequestParcel[] newArray(int i) {
        return new RewardedVideoAdRequestParcel[i];
    }
}
