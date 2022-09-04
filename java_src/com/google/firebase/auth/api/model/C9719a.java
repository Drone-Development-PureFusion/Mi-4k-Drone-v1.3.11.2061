package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.firebase.auth.api.model.a */
/* loaded from: classes2.dex */
public class C9719a implements Parcelable.Creator<CreateAuthUriResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7303a(CreateAuthUriResponse createAuthUriResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, createAuthUriResponse.f30369a);
        C4630b.m23464a(parcel, 2, createAuthUriResponse.m7348a(), false);
        C4630b.m23461a(parcel, 3, createAuthUriResponse.m7347b());
        C4630b.m23464a(parcel, 4, createAuthUriResponse.m7346c(), false);
        C4630b.m23461a(parcel, 5, createAuthUriResponse.m7345d());
        C4630b.m23470a(parcel, 6, (Parcelable) createAuthUriResponse.m7344e(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CreateAuthUriResponse createFromParcel(Parcel parcel) {
        StringList stringList = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        boolean z2 = false;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    stringList = (StringList) C4628a.m23510a(parcel, m23514a, StringList.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CreateAuthUriResponse(i, str2, z2, str, z, stringList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CreateAuthUriResponse[] newArray(int i) {
        return new CreateAuthUriResponse[i];
    }
}
