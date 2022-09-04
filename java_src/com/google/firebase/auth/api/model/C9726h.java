package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.firebase.auth.api.model.h */
/* loaded from: classes2.dex */
public class C9726h implements Parcelable.Creator<VerifyAssertionRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7282a(VerifyAssertionRequest verifyAssertionRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, verifyAssertionRequest.f30400a);
        C4630b.m23464a(parcel, 2, verifyAssertionRequest.m7314a(), false);
        C4630b.m23464a(parcel, 3, verifyAssertionRequest.m7313b(), false);
        C4630b.m23464a(parcel, 4, verifyAssertionRequest.m7312c(), false);
        C4630b.m23464a(parcel, 5, verifyAssertionRequest.m7311d(), false);
        C4630b.m23464a(parcel, 6, verifyAssertionRequest.m7310e(), false);
        C4630b.m23464a(parcel, 7, verifyAssertionRequest.m7307h(), false);
        C4630b.m23464a(parcel, 8, verifyAssertionRequest.m7306i(), false);
        C4630b.m23464a(parcel, 9, verifyAssertionRequest.m7309f(), false);
        C4630b.m23461a(parcel, 10, verifyAssertionRequest.m7308g());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VerifyAssertionRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str8 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str7 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 10:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new VerifyAssertionRequest(i, str8, str7, str6, str5, str4, str3, str2, str, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VerifyAssertionRequest[] newArray(int i) {
        return new VerifyAssertionRequest[i];
    }
}
