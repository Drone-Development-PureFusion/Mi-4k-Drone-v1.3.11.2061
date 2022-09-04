package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.firebase.auth.api.model.d */
/* loaded from: classes2.dex */
public class C9722d implements Parcelable.Creator<GetTokenResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7294a(GetTokenResponse getTokenResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, getTokenResponse.f30385a);
        C4630b.m23464a(parcel, 2, getTokenResponse.m7330b(), false);
        C4630b.m23464a(parcel, 3, getTokenResponse.m7329c(), false);
        C4630b.m23465a(parcel, 4, Long.valueOf(getTokenResponse.m7328d()), false);
        C4630b.m23464a(parcel, 5, getTokenResponse.m7327e(), false);
        C4630b.m23465a(parcel, 6, Long.valueOf(getTokenResponse.m7326f()), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetTokenResponse createFromParcel(Parcel parcel) {
        Long l = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        Long l2 = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    l2 = C4628a.m23497j(parcel, m23514a);
                    break;
                case 5:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    l = C4628a.m23497j(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GetTokenResponse(i, str3, str2, l2, str, l);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetTokenResponse[] newArray(int i) {
        return new GetTokenResponse[i];
    }
}
