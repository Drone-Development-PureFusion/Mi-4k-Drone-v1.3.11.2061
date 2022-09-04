package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GetRecentContextCall;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.appdatasearch.f */
/* loaded from: classes2.dex */
public class C3958f implements Parcelable.Creator<GetRecentContextCall.Request> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25914a(GetRecentContextCall.Request request, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) request.f15251b, i, false);
        C4630b.m23461a(parcel, 2, request.f15252c);
        C4630b.m23461a(parcel, 3, request.f15253d);
        C4630b.m23461a(parcel, 4, request.f15254e);
        C4630b.m23464a(parcel, 5, request.f15255f, false);
        C4630b.m23475a(parcel, 1000, request.f15250a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetRecentContextCall.Request createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    account = (Account) C4628a.m23510a(parcel, m23514a, Account.CREATOR);
                    break;
                case 2:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 3:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 1000:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GetRecentContextCall.Request(i, account, z3, z2, z, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetRecentContextCall.Request[] newArray(int i) {
        return new GetRecentContextCall.Request[i];
    }
}
