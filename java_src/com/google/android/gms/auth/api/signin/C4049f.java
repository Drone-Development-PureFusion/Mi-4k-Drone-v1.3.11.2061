package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.auth.api.signin.f */
/* loaded from: classes2.dex */
public class C4049f implements Parcelable.Creator<SignInAccount> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25627a(SignInAccount signInAccount, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, signInAccount.f15542a);
        C4630b.m23464a(parcel, 4, signInAccount.f15543b, false);
        C4630b.m23470a(parcel, 7, (Parcelable) signInAccount.m25639a(), i, false);
        C4630b.m23464a(parcel, 8, signInAccount.f15544c, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SignInAccount createFromParcel(Parcel parcel) {
        String m23490q;
        GoogleSignInAccount googleSignInAccount;
        String str;
        int i;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        String str2 = "";
        GoogleSignInAccount googleSignInAccount2 = null;
        String str3 = "";
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    String str4 = str3;
                    googleSignInAccount = googleSignInAccount2;
                    str = str2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23490q = str4;
                    break;
                case 2:
                case 3:
                case 5:
                case 6:
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23490q = str3;
                    googleSignInAccount = googleSignInAccount2;
                    str = str2;
                    i = i2;
                    break;
                case 4:
                    i = i2;
                    GoogleSignInAccount googleSignInAccount3 = googleSignInAccount2;
                    str = C4628a.m23490q(parcel, m23514a);
                    m23490q = str3;
                    googleSignInAccount = googleSignInAccount3;
                    break;
                case 7:
                    str = str2;
                    i = i2;
                    String str5 = str3;
                    googleSignInAccount = (GoogleSignInAccount) C4628a.m23510a(parcel, m23514a, GoogleSignInAccount.CREATOR);
                    m23490q = str5;
                    break;
                case 8:
                    m23490q = C4628a.m23490q(parcel, m23514a);
                    googleSignInAccount = googleSignInAccount2;
                    str = str2;
                    i = i2;
                    break;
            }
            i2 = i;
            str2 = str;
            googleSignInAccount2 = googleSignInAccount;
            str3 = m23490q;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SignInAccount(i2, str2, googleSignInAccount2, str3);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SignInAccount[] newArray(int i) {
        return new SignInAccount[i];
    }
}
