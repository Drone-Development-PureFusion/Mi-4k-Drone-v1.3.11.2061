package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.auth.api.signin.internal.i */
/* loaded from: classes2.dex */
public class C4072i implements Parcelable.Creator<SignInConfiguration> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25584a(SignInConfiguration signInConfiguration, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, signInConfiguration.f15551a);
        C4630b.m23464a(parcel, 2, signInConfiguration.m25626a(), false);
        C4630b.m23470a(parcel, 5, (Parcelable) signInConfiguration.m25625b(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SignInConfiguration createFromParcel(Parcel parcel) {
        GoogleSignInOptions googleSignInOptions = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                case 4:
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
                case 5:
                    googleSignInOptions = (GoogleSignInOptions) C4628a.m23510a(parcel, m23514a, GoogleSignInOptions.CREATOR);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SignInConfiguration(i, str, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SignInConfiguration[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
