package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.common.internal.k */
/* loaded from: classes2.dex */
public class C4595k implements Parcelable.Creator<ValidateAccountRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23599a(ValidateAccountRequest validateAccountRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, validateAccountRequest.f17016a);
        C4630b.m23475a(parcel, 2, validateAccountRequest.m23720a());
        C4630b.m23472a(parcel, 3, validateAccountRequest.f17017b, false);
        C4630b.m23456a(parcel, 4, (Parcelable[]) validateAccountRequest.m23719b(), i, false);
        C4630b.m23473a(parcel, 5, validateAccountRequest.m23717d(), false);
        C4630b.m23464a(parcel, 6, validateAccountRequest.m23718c(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ValidateAccountRequest createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
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
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 4:
                    scopeArr = (Scope[]) C4628a.m23506b(parcel, m23514a, Scope.CREATOR);
                    break;
                case 5:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 6:
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
        return new ValidateAccountRequest(i2, i, iBinder, scopeArr, bundle, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ValidateAccountRequest[] newArray(int i) {
        return new ValidateAccountRequest[i];
    }
}
