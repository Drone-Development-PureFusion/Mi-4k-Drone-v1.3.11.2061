package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.identity.intents.model.b */
/* loaded from: classes2.dex */
public class C6090b implements Parcelable.Creator<UserAddress> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18773a(UserAddress userAddress, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, userAddress.m18795a());
        C4630b.m23464a(parcel, 2, userAddress.f20585a, false);
        C4630b.m23464a(parcel, 3, userAddress.f20586b, false);
        C4630b.m23464a(parcel, 4, userAddress.f20587c, false);
        C4630b.m23464a(parcel, 5, userAddress.f20588d, false);
        C4630b.m23464a(parcel, 6, userAddress.f20589e, false);
        C4630b.m23464a(parcel, 7, userAddress.f20590f, false);
        C4630b.m23464a(parcel, 8, userAddress.f20591g, false);
        C4630b.m23464a(parcel, 9, userAddress.f20592h, false);
        C4630b.m23464a(parcel, 10, userAddress.f20593i, false);
        C4630b.m23464a(parcel, 11, userAddress.f20594j, false);
        C4630b.m23464a(parcel, 12, userAddress.f20595k, false);
        C4630b.m23464a(parcel, 13, userAddress.f20596l, false);
        C4630b.m23461a(parcel, 14, userAddress.f20597m);
        C4630b.m23464a(parcel, 15, userAddress.f20598n, false);
        C4630b.m23464a(parcel, 16, userAddress.f20599o, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UserAddress createFromParcel(Parcel parcel) {
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
        String str11 = null;
        String str12 = null;
        boolean z = false;
        String str13 = null;
        String str14 = null;
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
                    str11 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 13:
                    str12 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 14:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 15:
                    str13 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 16:
                    str14 = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new UserAddress(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UserAddress[] newArray(int i) {
        return new UserAddress[i];
    }
}
