package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.firebase.auth.api.model.e */
/* loaded from: classes2.dex */
public class C9723e implements Parcelable.Creator<ProviderUserInfo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7291a(ProviderUserInfo providerUserInfo, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, providerUserInfo.f30391a);
        C4630b.m23464a(parcel, 2, providerUserInfo.m7325a(), false);
        C4630b.m23464a(parcel, 3, providerUserInfo.m7324b(), false);
        C4630b.m23464a(parcel, 4, providerUserInfo.m7323c(), false);
        C4630b.m23464a(parcel, 5, providerUserInfo.m7321e(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ProviderUserInfo createFromParcel(Parcel parcel) {
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
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
        return new ProviderUserInfo(i, str4, str3, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ProviderUserInfo[] newArray(int i) {
        return new ProviderUserInfo[i];
    }
}
