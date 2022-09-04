package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wallet.o */
/* loaded from: classes2.dex */
public class C9405o implements Parcelable.Creator<LineItem> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8210a(LineItem lineItem, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, lineItem.m8561b());
        C4630b.m23464a(parcel, 2, lineItem.f29468a, false);
        C4630b.m23464a(parcel, 3, lineItem.f29469b, false);
        C4630b.m23464a(parcel, 4, lineItem.f29470c, false);
        C4630b.m23464a(parcel, 5, lineItem.f29471d, false);
        C4630b.m23475a(parcel, 6, lineItem.f29472e);
        C4630b.m23464a(parcel, 7, lineItem.f29473f, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LineItem createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
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
        return new LineItem(i2, str5, str4, str3, str2, i, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LineItem[] newArray(int i) {
        return new LineItem[i];
    }
}
