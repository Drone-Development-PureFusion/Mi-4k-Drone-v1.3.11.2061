package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.search.c */
/* loaded from: classes2.dex */
public class C9005c implements Parcelable.Creator<GoogleNowAuthState> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9406a(GoogleNowAuthState googleNowAuthState, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, googleNowAuthState.m9415a(), false);
        C4630b.m23464a(parcel, 2, googleNowAuthState.m9414b(), false);
        C4630b.m23474a(parcel, 3, googleNowAuthState.m9413c());
        C4630b.m23475a(parcel, 1000, googleNowAuthState.f28627a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GoogleNowAuthState createFromParcel(Parcel parcel) {
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j = 0;
        String str2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
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
        return new GoogleNowAuthState(i, str2, str, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GoogleNowAuthState[] newArray(int i) {
        return new GoogleNowAuthState[i];
    }
}
