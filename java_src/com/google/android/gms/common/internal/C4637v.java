package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.common.internal.v */
/* loaded from: classes2.dex */
public class C4637v implements Parcelable.Creator<GetServiceRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23426a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, getServiceRequest.f16994a);
        C4630b.m23475a(parcel, 2, getServiceRequest.f16995b);
        C4630b.m23475a(parcel, 3, getServiceRequest.f16996c);
        C4630b.m23464a(parcel, 4, getServiceRequest.f16997d, false);
        C4630b.m23472a(parcel, 5, getServiceRequest.f16998e, false);
        C4630b.m23456a(parcel, 6, (Parcelable[]) getServiceRequest.f16999f, i, false);
        C4630b.m23473a(parcel, 7, getServiceRequest.f17000g, false);
        C4630b.m23470a(parcel, 8, (Parcelable) getServiceRequest.f17001h, i, false);
        C4630b.m23474a(parcel, 9, getServiceRequest.f17002i);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetServiceRequest createFromParcel(Parcel parcel) {
        int i = 0;
        Account account = null;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 6:
                    scopeArr = (Scope[]) C4628a.m23506b(parcel, m23514a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 8:
                    account = (Account) C4628a.m23510a(parcel, m23514a, Account.CREATOR);
                    break;
                case 9:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GetServiceRequest(i3, i2, i, str, iBinder, scopeArr, bundle, account, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetServiceRequest[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
