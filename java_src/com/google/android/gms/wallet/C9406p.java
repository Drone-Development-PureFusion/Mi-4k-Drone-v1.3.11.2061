package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.common.util.C4679b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.wallet.p */
/* loaded from: classes2.dex */
public class C9406p implements Parcelable.Creator<LoyaltyWalletObject> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8207a(LoyaltyWalletObject loyaltyWalletObject, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, loyaltyWalletObject.m8547a());
        C4630b.m23464a(parcel, 2, loyaltyWalletObject.f29479a, false);
        C4630b.m23464a(parcel, 3, loyaltyWalletObject.f29480b, false);
        C4630b.m23464a(parcel, 4, loyaltyWalletObject.f29481c, false);
        C4630b.m23464a(parcel, 5, loyaltyWalletObject.f29482d, false);
        C4630b.m23464a(parcel, 6, loyaltyWalletObject.f29483e, false);
        C4630b.m23464a(parcel, 7, loyaltyWalletObject.f29484f, false);
        C4630b.m23464a(parcel, 8, loyaltyWalletObject.f29485g, false);
        C4630b.m23464a(parcel, 9, loyaltyWalletObject.f29486h, false);
        C4630b.m23464a(parcel, 10, loyaltyWalletObject.f29487i, false);
        C4630b.m23464a(parcel, 11, loyaltyWalletObject.f29488j, false);
        C4630b.m23475a(parcel, 12, loyaltyWalletObject.f29489k);
        C4630b.m23447c(parcel, 13, loyaltyWalletObject.f29490l, false);
        C4630b.m23470a(parcel, 14, (Parcelable) loyaltyWalletObject.f29491m, i, false);
        C4630b.m23447c(parcel, 15, loyaltyWalletObject.f29492n, false);
        C4630b.m23464a(parcel, 16, loyaltyWalletObject.f29493o, false);
        C4630b.m23464a(parcel, 17, loyaltyWalletObject.f29494p, false);
        C4630b.m23447c(parcel, 18, loyaltyWalletObject.f29495q, false);
        C4630b.m23461a(parcel, 19, loyaltyWalletObject.f29496r);
        C4630b.m23447c(parcel, 20, loyaltyWalletObject.f29497s, false);
        C4630b.m23447c(parcel, 21, loyaltyWalletObject.f29498t, false);
        C4630b.m23447c(parcel, 22, loyaltyWalletObject.f29499u, false);
        C4630b.m23470a(parcel, 23, (Parcelable) loyaltyWalletObject.f29500v, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LoyaltyWalletObject createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int i2 = 0;
        ArrayList m23173a = C4679b.m23173a();
        TimeInterval timeInterval = null;
        ArrayList m23173a2 = C4679b.m23173a();
        String str11 = null;
        String str12 = null;
        ArrayList m23173a3 = C4679b.m23173a();
        boolean z = false;
        ArrayList m23173a4 = C4679b.m23173a();
        ArrayList m23173a5 = C4679b.m23173a();
        ArrayList m23173a6 = C4679b.m23173a();
        LoyaltyPoints loyaltyPoints = null;
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
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    str7 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    str8 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 10:
                    str9 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 11:
                    str10 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 12:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 13:
                    m23173a = C4628a.m23504c(parcel, m23514a, WalletObjectMessage.CREATOR);
                    break;
                case 14:
                    timeInterval = (TimeInterval) C4628a.m23510a(parcel, m23514a, TimeInterval.CREATOR);
                    break;
                case 15:
                    m23173a2 = C4628a.m23504c(parcel, m23514a, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 17:
                    str12 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 18:
                    m23173a3 = C4628a.m23504c(parcel, m23514a, LabelValueRow.CREATOR);
                    break;
                case 19:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 20:
                    m23173a4 = C4628a.m23504c(parcel, m23514a, UriData.CREATOR);
                    break;
                case 21:
                    m23173a5 = C4628a.m23504c(parcel, m23514a, TextModuleData.CREATOR);
                    break;
                case 22:
                    m23173a6 = C4628a.m23504c(parcel, m23514a, UriData.CREATOR);
                    break;
                case 23:
                    loyaltyPoints = (LoyaltyPoints) C4628a.m23510a(parcel, m23514a, LoyaltyPoints.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new LoyaltyWalletObject(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i2, m23173a, timeInterval, m23173a2, str11, str12, m23173a3, z, m23173a4, m23173a5, m23173a6, loyaltyPoints);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LoyaltyWalletObject[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }
}
