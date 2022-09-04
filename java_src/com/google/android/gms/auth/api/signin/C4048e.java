package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.auth.api.signin.e */
/* loaded from: classes2.dex */
public class C4048e implements Parcelable.Creator<GoogleSignInOptions> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25630a(GoogleSignInOptions googleSignInOptions, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, googleSignInOptions.f15527e);
        C4630b.m23447c(parcel, 2, googleSignInOptions.m25669a(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) googleSignInOptions.m25664c(), i, false);
        C4630b.m23461a(parcel, 4, googleSignInOptions.m25662d());
        C4630b.m23461a(parcel, 5, googleSignInOptions.m25660e());
        C4630b.m23461a(parcel, 6, googleSignInOptions.m25658f());
        C4630b.m23464a(parcel, 7, googleSignInOptions.m25656g(), false);
        C4630b.m23464a(parcel, 8, googleSignInOptions.m25654h(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GoogleSignInOptions createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        Account account = null;
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    arrayList = C4628a.m23504c(parcel, m23514a, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C4628a.m23510a(parcel, m23514a, Account.CREATOR);
                    break;
                case 4:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
                    str2 = C4628a.m23490q(parcel, m23514a);
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
        return new GoogleSignInOptions(i, arrayList, account, z3, z2, z, str2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
