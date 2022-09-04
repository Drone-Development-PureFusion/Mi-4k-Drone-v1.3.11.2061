package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.common.util.C4679b;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.wallet.wobs.a */
/* loaded from: classes2.dex */
public class C9416a implements Parcelable.Creator<CommonWalletObject> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8170a(CommonWalletObject commonWalletObject, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, commonWalletObject.m8184b());
        C4630b.m23464a(parcel, 2, commonWalletObject.f29730a, false);
        C4630b.m23464a(parcel, 3, commonWalletObject.f29731b, false);
        C4630b.m23464a(parcel, 4, commonWalletObject.f29732c, false);
        C4630b.m23464a(parcel, 5, commonWalletObject.f29733d, false);
        C4630b.m23464a(parcel, 6, commonWalletObject.f29734e, false);
        C4630b.m23464a(parcel, 7, commonWalletObject.f29735f, false);
        C4630b.m23464a(parcel, 8, commonWalletObject.f29736g, false);
        C4630b.m23464a(parcel, 9, commonWalletObject.f29737h, false);
        C4630b.m23475a(parcel, 10, commonWalletObject.f29738i);
        C4630b.m23447c(parcel, 11, commonWalletObject.f29739j, false);
        C4630b.m23470a(parcel, 12, (Parcelable) commonWalletObject.f29740k, i, false);
        C4630b.m23447c(parcel, 13, commonWalletObject.f29741l, false);
        C4630b.m23464a(parcel, 14, commonWalletObject.f29742m, false);
        C4630b.m23464a(parcel, 15, commonWalletObject.f29743n, false);
        C4630b.m23447c(parcel, 16, commonWalletObject.f29744o, false);
        C4630b.m23461a(parcel, 17, commonWalletObject.f29745p);
        C4630b.m23447c(parcel, 18, commonWalletObject.f29746q, false);
        C4630b.m23447c(parcel, 19, commonWalletObject.f29747r, false);
        C4630b.m23447c(parcel, 20, commonWalletObject.f29748s, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CommonWalletObject createFromParcel(Parcel parcel) {
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
        int i2 = 0;
        ArrayList m23173a = C4679b.m23173a();
        TimeInterval timeInterval = null;
        ArrayList m23173a2 = C4679b.m23173a();
        String str9 = null;
        String str10 = null;
        ArrayList m23173a3 = C4679b.m23173a();
        boolean z = false;
        ArrayList m23173a4 = C4679b.m23173a();
        ArrayList m23173a5 = C4679b.m23173a();
        ArrayList m23173a6 = C4679b.m23173a();
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
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 11:
                    m23173a = C4628a.m23504c(parcel, m23514a, WalletObjectMessage.CREATOR);
                    break;
                case 12:
                    timeInterval = (TimeInterval) C4628a.m23510a(parcel, m23514a, TimeInterval.CREATOR);
                    break;
                case 13:
                    m23173a2 = C4628a.m23504c(parcel, m23514a, LatLng.CREATOR);
                    break;
                case 14:
                    str9 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 15:
                    str10 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 16:
                    m23173a3 = C4628a.m23504c(parcel, m23514a, LabelValueRow.CREATOR);
                    break;
                case 17:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 18:
                    m23173a4 = C4628a.m23504c(parcel, m23514a, UriData.CREATOR);
                    break;
                case 19:
                    m23173a5 = C4628a.m23504c(parcel, m23514a, TextModuleData.CREATOR);
                    break;
                case 20:
                    m23173a6 = C4628a.m23504c(parcel, m23514a, UriData.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CommonWalletObject(i, str, str2, str3, str4, str5, str6, str7, str8, i2, m23173a, timeInterval, m23173a2, str9, str10, m23173a3, z, m23173a4, m23173a5, m23173a6);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CommonWalletObject[] newArray(int i) {
        return new CommonWalletObject[i];
    }
}
