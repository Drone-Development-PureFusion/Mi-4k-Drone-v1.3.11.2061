package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.auth.api.signin.d */
/* loaded from: classes2.dex */
public class C4047d implements Parcelable.Creator<GoogleSignInAccount> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25633a(GoogleSignInAccount googleSignInAccount, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, googleSignInAccount.f15510b);
        C4630b.m23464a(parcel, 2, googleSignInAccount.m25688a(), false);
        C4630b.m23464a(parcel, 3, googleSignInAccount.m25685b(), false);
        C4630b.m23464a(parcel, 4, googleSignInAccount.m25683c(), false);
        C4630b.m23464a(parcel, 5, googleSignInAccount.m25682d(), false);
        C4630b.m23470a(parcel, 6, (Parcelable) googleSignInAccount.m25679g(), i, false);
        C4630b.m23464a(parcel, 7, googleSignInAccount.m25678h(), false);
        C4630b.m23474a(parcel, 8, googleSignInAccount.m25677i());
        C4630b.m23464a(parcel, 9, googleSignInAccount.m25675k(), false);
        C4630b.m23447c(parcel, 10, googleSignInAccount.f15511c, false);
        C4630b.m23464a(parcel, 11, googleSignInAccount.m25681e(), false);
        C4630b.m23464a(parcel, 12, googleSignInAccount.m25680f(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GoogleSignInAccount createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        long j = 0;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 9:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 10:
                    arrayList = C4628a.m23504c(parcel, m23514a, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 12:
                    str8 = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
