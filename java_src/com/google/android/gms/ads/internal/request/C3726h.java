package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.safebrowsing.SafeBrowsingConfigParcel;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.ads.internal.request.h */
/* loaded from: classes2.dex */
public class C3726h implements Parcelable.Creator<AdResponseParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27003a(AdResponseParcel adResponseParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, adResponseParcel.f14565a);
        C4630b.m23464a(parcel, 2, adResponseParcel.f14566b, false);
        C4630b.m23464a(parcel, 3, adResponseParcel.f14567c, false);
        C4630b.m23449b(parcel, 4, adResponseParcel.f14568d, false);
        C4630b.m23475a(parcel, 5, adResponseParcel.f14569e);
        C4630b.m23449b(parcel, 6, adResponseParcel.f14570f, false);
        C4630b.m23474a(parcel, 7, adResponseParcel.f14571g);
        C4630b.m23461a(parcel, 8, adResponseParcel.f14572h);
        C4630b.m23474a(parcel, 9, adResponseParcel.f14573i);
        C4630b.m23449b(parcel, 10, adResponseParcel.f14574j, false);
        C4630b.m23474a(parcel, 11, adResponseParcel.f14575k);
        C4630b.m23475a(parcel, 12, adResponseParcel.f14576l);
        C4630b.m23464a(parcel, 13, adResponseParcel.f14577m, false);
        C4630b.m23474a(parcel, 14, adResponseParcel.f14578n);
        C4630b.m23464a(parcel, 15, adResponseParcel.f14579o, false);
        C4630b.m23461a(parcel, 18, adResponseParcel.f14580p);
        C4630b.m23464a(parcel, 19, adResponseParcel.f14581q, false);
        C4630b.m23464a(parcel, 21, adResponseParcel.f14582r, false);
        C4630b.m23461a(parcel, 22, adResponseParcel.f14583s);
        C4630b.m23461a(parcel, 23, adResponseParcel.f14584t);
        C4630b.m23461a(parcel, 24, adResponseParcel.f14585u);
        C4630b.m23461a(parcel, 25, adResponseParcel.f14586v);
        C4630b.m23461a(parcel, 26, adResponseParcel.f14587w);
        C4630b.m23470a(parcel, 28, (Parcelable) adResponseParcel.f14588x, i, false);
        C4630b.m23464a(parcel, 29, adResponseParcel.f14589y, false);
        C4630b.m23464a(parcel, 30, adResponseParcel.f14590z, false);
        C4630b.m23461a(parcel, 31, adResponseParcel.f14550A);
        C4630b.m23461a(parcel, 32, adResponseParcel.f14551B);
        C4630b.m23470a(parcel, 33, (Parcelable) adResponseParcel.f14552C, i, false);
        C4630b.m23449b(parcel, 34, adResponseParcel.f14553D, false);
        C4630b.m23449b(parcel, 35, adResponseParcel.f14554E, false);
        C4630b.m23461a(parcel, 36, adResponseParcel.f14555F);
        C4630b.m23470a(parcel, 37, (Parcelable) adResponseParcel.f14556G, i, false);
        C4630b.m23461a(parcel, 38, adResponseParcel.f14557H);
        C4630b.m23464a(parcel, 39, adResponseParcel.f14558I, false);
        C4630b.m23449b(parcel, 40, adResponseParcel.f14559J, false);
        C4630b.m23461a(parcel, 42, adResponseParcel.f14560K);
        C4630b.m23464a(parcel, 43, adResponseParcel.f14561L, false);
        C4630b.m23470a(parcel, 44, (Parcelable) adResponseParcel.f14562M, i, false);
        C4630b.m23464a(parcel, 45, adResponseParcel.f14563N, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdResponseParcel createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        int i2 = 0;
        ArrayList<String> arrayList2 = null;
        long j = 0;
        boolean z = false;
        long j2 = 0;
        ArrayList<String> arrayList3 = null;
        long j3 = 0;
        int i3 = 0;
        String str3 = null;
        long j4 = 0;
        String str4 = null;
        boolean z2 = false;
        String str5 = null;
        String str6 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        LargeParcelTeleporter largeParcelTeleporter = null;
        String str7 = null;
        String str8 = null;
        boolean z8 = false;
        boolean z9 = false;
        RewardItemParcel rewardItemParcel = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        boolean z10 = false;
        AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel = null;
        boolean z11 = false;
        String str9 = null;
        ArrayList<String> arrayList6 = null;
        boolean z12 = false;
        String str10 = null;
        SafeBrowsingConfigParcel safeBrowsingConfigParcel = null;
        String str11 = null;
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
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                case 5:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    arrayList2 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 7:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 8:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 9:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 10:
                    arrayList3 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 11:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 12:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 13:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 14:
                    j4 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 15:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 16:
                case 17:
                case 20:
                case 27:
                case 41:
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
                case 18:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 19:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 21:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 22:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 23:
                    z4 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 24:
                    z5 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 25:
                    z6 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 26:
                    z7 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 28:
                    largeParcelTeleporter = (LargeParcelTeleporter) C4628a.m23510a(parcel, m23514a, LargeParcelTeleporter.CREATOR);
                    break;
                case 29:
                    str7 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 30:
                    str8 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 31:
                    z8 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 32:
                    z9 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 33:
                    rewardItemParcel = (RewardItemParcel) C4628a.m23510a(parcel, m23514a, RewardItemParcel.CREATOR);
                    break;
                case 34:
                    arrayList4 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 35:
                    arrayList5 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 36:
                    z10 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 37:
                    autoClickProtectionConfigurationParcel = (AutoClickProtectionConfigurationParcel) C4628a.m23510a(parcel, m23514a, AutoClickProtectionConfigurationParcel.CREATOR);
                    break;
                case 38:
                    z11 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 39:
                    str9 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 40:
                    arrayList6 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 42:
                    z12 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 43:
                    str10 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 44:
                    safeBrowsingConfigParcel = (SafeBrowsingConfigParcel) C4628a.m23510a(parcel, m23514a, SafeBrowsingConfigParcel.CREATOR);
                    break;
                case 45:
                    str11 = C4628a.m23490q(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AdResponseParcel(i, str, str2, arrayList, i2, arrayList2, j, z, j2, arrayList3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, largeParcelTeleporter, str7, str8, z8, z9, rewardItemParcel, arrayList4, arrayList5, z10, autoClickProtectionConfigurationParcel, z11, str9, arrayList6, z12, str10, safeBrowsingConfigParcel, str11);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdResponseParcel[] newArray(int i) {
        return new AdResponseParcel[i];
    }
}
