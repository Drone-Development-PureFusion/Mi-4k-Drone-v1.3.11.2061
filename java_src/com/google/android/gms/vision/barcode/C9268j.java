package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.vision.barcode.Barcode;
/* renamed from: com.google.android.gms.vision.barcode.j */
/* loaded from: classes2.dex */
public class C9268j implements Parcelable.Creator<Barcode.PersonName> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8779a(Barcode.PersonName personName, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, personName.f29218a);
        C4630b.m23464a(parcel, 2, personName.f29219b, false);
        C4630b.m23464a(parcel, 3, personName.f29220c, false);
        C4630b.m23464a(parcel, 4, personName.f29221d, false);
        C4630b.m23464a(parcel, 5, personName.f29222e, false);
        C4630b.m23464a(parcel, 6, personName.f29223f, false);
        C4630b.m23464a(parcel, 7, personName.f29224g, false);
        C4630b.m23464a(parcel, 8, personName.f29225h, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode.PersonName createFromParcel(Parcel parcel) {
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str7 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
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
        return new Barcode.PersonName(i, str7, str6, str5, str4, str3, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode.PersonName[] newArray(int i) {
        return new Barcode.PersonName[i];
    }
}
