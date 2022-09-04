package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.signin.internal.i */
/* loaded from: classes2.dex */
public class C9018i implements Parcelable.Creator<SignInResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9357a(SignInResponse signInResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, signInResponse.f28652a);
        C4630b.m23470a(parcel, 2, (Parcelable) signInResponse.m9399a(), i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) signInResponse.m9398b(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SignInResponse createFromParcel(Parcel parcel) {
        ResolveAccountResponse resolveAccountResponse;
        ConnectionResult connectionResult;
        int i;
        ResolveAccountResponse resolveAccountResponse2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        ConnectionResult connectionResult2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    ResolveAccountResponse resolveAccountResponse3 = resolveAccountResponse2;
                    connectionResult = connectionResult2;
                    i = C4628a.m23500g(parcel, m23514a);
                    resolveAccountResponse = resolveAccountResponse3;
                    break;
                case 2:
                    ConnectionResult connectionResult3 = (ConnectionResult) C4628a.m23510a(parcel, m23514a, ConnectionResult.CREATOR);
                    i = i2;
                    resolveAccountResponse = resolveAccountResponse2;
                    connectionResult = connectionResult3;
                    break;
                case 3:
                    resolveAccountResponse = (ResolveAccountResponse) C4628a.m23510a(parcel, m23514a, ResolveAccountResponse.CREATOR);
                    connectionResult = connectionResult2;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    resolveAccountResponse = resolveAccountResponse2;
                    connectionResult = connectionResult2;
                    i = i2;
                    break;
            }
            i2 = i;
            connectionResult2 = connectionResult;
            resolveAccountResponse2 = resolveAccountResponse;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SignInResponse(i2, connectionResult2, resolveAccountResponse2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SignInResponse[] newArray(int i) {
        return new SignInResponse[i];
    }
}
