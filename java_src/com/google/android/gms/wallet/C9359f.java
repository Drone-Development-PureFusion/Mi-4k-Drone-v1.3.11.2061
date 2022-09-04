package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wallet.f */
/* loaded from: classes2.dex */
public class C9359f implements Parcelable.Creator<Address> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8429a(Address address, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, address.m8605a());
        C4630b.m23464a(parcel, 2, address.f29413a, false);
        C4630b.m23464a(parcel, 3, address.f29414b, false);
        C4630b.m23464a(parcel, 4, address.f29415c, false);
        C4630b.m23464a(parcel, 5, address.f29416d, false);
        C4630b.m23464a(parcel, 6, address.f29417e, false);
        C4630b.m23464a(parcel, 7, address.f29418f, false);
        C4630b.m23464a(parcel, 8, address.f29419g, false);
        C4630b.m23464a(parcel, 9, address.f29420h, false);
        C4630b.m23464a(parcel, 10, address.f29421i, false);
        C4630b.m23461a(parcel, 11, address.f29422j);
        C4630b.m23464a(parcel, 12, address.f29423k, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Address createFromParcel(Parcel parcel) {
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
        boolean z = false;
        String str10 = null;
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
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 12:
                    str10 = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new Address(i, str, str2, str3, str4, str5, str6, str7, str8, str9, z, str10);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Address[] newArray(int i) {
        return new Address[i];
    }
}
