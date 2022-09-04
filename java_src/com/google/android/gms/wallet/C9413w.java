package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wallet.w */
/* loaded from: classes2.dex */
public class C9413w implements Parcelable.Creator<ProxyCard> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8186a(ProxyCard proxyCard, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, proxyCard.m8460a());
        C4630b.m23464a(parcel, 2, proxyCard.f29558a, false);
        C4630b.m23464a(parcel, 3, proxyCard.f29559b, false);
        C4630b.m23475a(parcel, 4, proxyCard.f29560c);
        C4630b.m23475a(parcel, 5, proxyCard.f29561d);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ProxyCard createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
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
        return new ProxyCard(i3, str2, str, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ProxyCard[] newArray(int i) {
        return new ProxyCard[i];
    }
}
