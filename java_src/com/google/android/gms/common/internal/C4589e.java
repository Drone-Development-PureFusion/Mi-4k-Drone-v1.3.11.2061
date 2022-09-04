package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.common.internal.e */
/* loaded from: classes2.dex */
public class C4589e implements Parcelable.Creator<ResolveAccountRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23613a(ResolveAccountRequest resolveAccountRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, resolveAccountRequest.f17003a);
        C4630b.m23470a(parcel, 2, (Parcelable) resolveAccountRequest.m23730a(), i, false);
        C4630b.m23475a(parcel, 3, resolveAccountRequest.m23729b());
        C4630b.m23470a(parcel, 4, (Parcelable) resolveAccountRequest.m23728c(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ResolveAccountRequest createFromParcel(Parcel parcel) {
        GoogleSignInAccount googleSignInAccount;
        int i;
        Account account;
        int i2;
        GoogleSignInAccount googleSignInAccount2 = null;
        int i3 = 0;
        int m23508b = C4628a.m23508b(parcel);
        Account account2 = null;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    GoogleSignInAccount googleSignInAccount3 = googleSignInAccount2;
                    i = i3;
                    account = account2;
                    i2 = C4628a.m23500g(parcel, m23514a);
                    googleSignInAccount = googleSignInAccount3;
                    break;
                case 2:
                    i2 = i4;
                    int i5 = i3;
                    account = (Account) C4628a.m23510a(parcel, m23514a, Account.CREATOR);
                    googleSignInAccount = googleSignInAccount2;
                    i = i5;
                    break;
                case 3:
                    account = account2;
                    i2 = i4;
                    GoogleSignInAccount googleSignInAccount4 = googleSignInAccount2;
                    i = C4628a.m23500g(parcel, m23514a);
                    googleSignInAccount = googleSignInAccount4;
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) C4628a.m23510a(parcel, m23514a, GoogleSignInAccount.CREATOR);
                    i = i3;
                    account = account2;
                    i2 = i4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    googleSignInAccount = googleSignInAccount2;
                    i = i3;
                    account = account2;
                    i2 = i4;
                    break;
            }
            i4 = i2;
            account2 = account;
            i3 = i;
            googleSignInAccount2 = googleSignInAccount;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ResolveAccountRequest(i4, account2, i3, googleSignInAccount2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ResolveAccountRequest[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }
}
