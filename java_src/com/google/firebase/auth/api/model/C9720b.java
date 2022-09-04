package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.firebase.auth.api.model.b */
/* loaded from: classes2.dex */
public class C9720b implements Parcelable.Creator<GetAccountInfoUser> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7300a(GetAccountInfoUser getAccountInfoUser, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, getAccountInfoUser.f30375a);
        C4630b.m23464a(parcel, 2, getAccountInfoUser.m7340c(), false);
        C4630b.m23464a(parcel, 3, getAccountInfoUser.m7342a(), false);
        C4630b.m23461a(parcel, 4, getAccountInfoUser.m7341b());
        C4630b.m23464a(parcel, 5, getAccountInfoUser.m7339d(), false);
        C4630b.m23464a(parcel, 6, getAccountInfoUser.m7338e(), false);
        C4630b.m23470a(parcel, 7, (Parcelable) getAccountInfoUser.m7334i(), i, false);
        C4630b.m23464a(parcel, 8, getAccountInfoUser.m7336g(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetAccountInfoUser createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        ProviderUserInfoList providerUserInfoList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    providerUserInfoList = (ProviderUserInfoList) C4628a.m23510a(parcel, m23514a, ProviderUserInfoList.CREATOR);
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
        return new GetAccountInfoUser(i, str5, str4, z, str3, str2, providerUserInfoList, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetAccountInfoUser[] newArray(int i) {
        return new GetAccountInfoUser[i];
    }
}
