package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.signin.internal.f */
/* loaded from: classes2.dex */
public class C9015f implements Parcelable.Creator<RecordConsentRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9372a(RecordConsentRequest recordConsentRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, recordConsentRequest.f28646a);
        C4630b.m23470a(parcel, 2, (Parcelable) recordConsentRequest.m9403a(), i, false);
        C4630b.m23456a(parcel, 3, (Parcelable[]) recordConsentRequest.m9402b(), i, false);
        C4630b.m23464a(parcel, 4, recordConsentRequest.m9401c(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RecordConsentRequest createFromParcel(Parcel parcel) {
        String m23490q;
        Scope[] scopeArr;
        Account account;
        int i;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        Scope[] scopeArr2 = null;
        Account account2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    String str2 = str;
                    scopeArr = scopeArr2;
                    account = account2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23490q = str2;
                    break;
                case 2:
                    i = i2;
                    Scope[] scopeArr3 = scopeArr2;
                    account = (Account) C4628a.m23510a(parcel, m23514a, Account.CREATOR);
                    m23490q = str;
                    scopeArr = scopeArr3;
                    break;
                case 3:
                    account = account2;
                    i = i2;
                    String str3 = str;
                    scopeArr = (Scope[]) C4628a.m23506b(parcel, m23514a, Scope.CREATOR);
                    m23490q = str3;
                    break;
                case 4:
                    m23490q = C4628a.m23490q(parcel, m23514a);
                    scopeArr = scopeArr2;
                    account = account2;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23490q = str;
                    scopeArr = scopeArr2;
                    account = account2;
                    i = i2;
                    break;
            }
            i2 = i;
            account2 = account;
            scopeArr2 = scopeArr;
            str = m23490q;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new RecordConsentRequest(i2, account2, scopeArr2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RecordConsentRequest[] newArray(int i) {
        return new RecordConsentRequest[i];
    }
}
