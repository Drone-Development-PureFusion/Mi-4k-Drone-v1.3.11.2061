package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.plus.internal.h */
/* loaded from: classes2.dex */
public class C8974h implements Parcelable.Creator<PlusSession> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9610a(PlusSession plusSession, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, plusSession.m9677b(), false);
        C4630b.m23455a(parcel, 2, plusSession.m9676c(), false);
        C4630b.m23455a(parcel, 3, plusSession.m9675d(), false);
        C4630b.m23455a(parcel, 4, plusSession.m9674e(), false);
        C4630b.m23464a(parcel, 5, plusSession.m9673f(), false);
        C4630b.m23464a(parcel, 6, plusSession.m9672g(), false);
        C4630b.m23464a(parcel, 7, plusSession.m9671h(), false);
        C4630b.m23475a(parcel, 1000, plusSession.m9678a());
        C4630b.m23464a(parcel, 8, plusSession.m9670i(), false);
        C4630b.m23470a(parcel, 9, (Parcelable) plusSession.m9669j(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlusSession createFromParcel(Parcel parcel) {
        PlusCommonExtras plusCommonExtras = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str5 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    strArr3 = C4628a.m23520C(parcel, m23514a);
                    break;
                case 3:
                    strArr2 = C4628a.m23520C(parcel, m23514a);
                    break;
                case 4:
                    strArr = C4628a.m23520C(parcel, m23514a);
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
                case 9:
                    plusCommonExtras = (PlusCommonExtras) C4628a.m23510a(parcel, m23514a, PlusCommonExtras.CREATOR);
                    break;
                case 1000:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PlusSession(i, str5, strArr3, strArr2, strArr, str4, str3, str2, str, plusCommonExtras);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlusSession[] newArray(int i) {
        return new PlusSession[i];
    }
}
