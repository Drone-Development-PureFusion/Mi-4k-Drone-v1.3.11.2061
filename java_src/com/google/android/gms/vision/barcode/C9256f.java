package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.vision.barcode.Barcode;
/* renamed from: com.google.android.gms.vision.barcode.f */
/* loaded from: classes2.dex */
public class C9256f implements Parcelable.Creator<Barcode.ContactInfo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8803a(Barcode.ContactInfo contactInfo, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, contactInfo.f29184a);
        C4630b.m23470a(parcel, 2, (Parcelable) contactInfo.f29185b, i, false);
        C4630b.m23464a(parcel, 3, contactInfo.f29186c, false);
        C4630b.m23464a(parcel, 4, contactInfo.f29187d, false);
        C4630b.m23456a(parcel, 5, (Parcelable[]) contactInfo.f29188e, i, false);
        C4630b.m23456a(parcel, 6, (Parcelable[]) contactInfo.f29189f, i, false);
        C4630b.m23455a(parcel, 7, contactInfo.f29190g, false);
        C4630b.m23456a(parcel, 8, (Parcelable[]) contactInfo.f29191h, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode.ContactInfo createFromParcel(Parcel parcel) {
        Barcode.Address[] addressArr = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String[] strArr = null;
        Barcode.Email[] emailArr = null;
        Barcode.Phone[] phoneArr = null;
        String str = null;
        String str2 = null;
        Barcode.PersonName personName = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    personName = (Barcode.PersonName) C4628a.m23510a(parcel, m23514a, Barcode.PersonName.CREATOR);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    phoneArr = (Barcode.Phone[]) C4628a.m23506b(parcel, m23514a, Barcode.Phone.CREATOR);
                    break;
                case 6:
                    emailArr = (Barcode.Email[]) C4628a.m23506b(parcel, m23514a, Barcode.Email.CREATOR);
                    break;
                case 7:
                    strArr = C4628a.m23520C(parcel, m23514a);
                    break;
                case 8:
                    addressArr = (Barcode.Address[]) C4628a.m23506b(parcel, m23514a, Barcode.Address.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new Barcode.ContactInfo(i, personName, str2, str, phoneArr, emailArr, strArr, addressArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Barcode.ContactInfo[] newArray(int i) {
        return new Barcode.ContactInfo[i];
    }
}
