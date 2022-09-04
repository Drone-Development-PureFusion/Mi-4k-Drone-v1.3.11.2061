package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.vision.barcode.Barcode;
/* renamed from: com.google.android.gms.vision.barcode.g */
/* loaded from: classes2.dex */
public class C9257g implements Parcelable.Creator<Barcode.DriverLicense> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8800a(Barcode.DriverLicense driverLicense, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, driverLicense.f29192a);
        C4630b.m23464a(parcel, 2, driverLicense.f29193b, false);
        C4630b.m23464a(parcel, 3, driverLicense.f29194c, false);
        C4630b.m23464a(parcel, 4, driverLicense.f29195d, false);
        C4630b.m23464a(parcel, 5, driverLicense.f29196e, false);
        C4630b.m23464a(parcel, 6, driverLicense.f29197f, false);
        C4630b.m23464a(parcel, 7, driverLicense.f29198g, false);
        C4630b.m23464a(parcel, 8, driverLicense.f29199h, false);
        C4630b.m23464a(parcel, 9, driverLicense.f29200i, false);
        C4630b.m23464a(parcel, 10, driverLicense.f29201j, false);
        C4630b.m23464a(parcel, 11, driverLicense.f29202k, false);
        C4630b.m23464a(parcel, 12, driverLicense.f29203l, false);
        C4630b.m23464a(parcel, 13, driverLicense.f29204m, false);
        C4630b.m23464a(parcel, 14, driverLicense.f29205n, false);
        C4630b.m23464a(parcel, 15, driverLicense.f29206o, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode.DriverLicense createFromParcel(Parcel parcel) {
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
                    str13 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 15:
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
        return new Barcode.DriverLicense(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode.DriverLicense[] newArray(int i) {
        return new Barcode.DriverLicense[i];
    }
}
