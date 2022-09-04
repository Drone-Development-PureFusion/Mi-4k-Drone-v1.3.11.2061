package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.auth.g */
/* loaded from: classes2.dex */
public class C4079g implements Parcelable.Creator<AccountChangeEventsRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25544a(AccountChangeEventsRequest accountChangeEventsRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, accountChangeEventsRequest.f15336a);
        C4630b.m23475a(parcel, 2, accountChangeEventsRequest.f15337b);
        C4630b.m23464a(parcel, 3, accountChangeEventsRequest.f15338c, false);
        C4630b.m23470a(parcel, 4, (Parcelable) accountChangeEventsRequest.f15339d, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AccountChangeEventsRequest createFromParcel(Parcel parcel) {
        Account account = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    account = (Account) C4628a.m23510a(parcel, m23514a, Account.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AccountChangeEventsRequest(i2, i, str, account);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AccountChangeEventsRequest[] newArray(int i) {
        return new AccountChangeEventsRequest[i];
    }
}
