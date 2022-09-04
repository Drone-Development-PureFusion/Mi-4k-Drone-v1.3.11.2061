package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.common.internal.o */
/* loaded from: classes2.dex */
public class C4599o implements Parcelable.Creator<AuthAccountRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23588a(AuthAccountRequest authAccountRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, authAccountRequest.f16984a);
        C4630b.m23472a(parcel, 2, authAccountRequest.f16985b, false);
        C4630b.m23456a(parcel, 3, (Parcelable[]) authAccountRequest.f16986c, i, false);
        C4630b.m23466a(parcel, 4, authAccountRequest.f16987d, false);
        C4630b.m23466a(parcel, 5, authAccountRequest.f16988e, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AuthAccountRequest createFromParcel(Parcel parcel) {
        Integer num = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Integer num2 = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 3:
                    scopeArr = (Scope[]) C4628a.m23506b(parcel, m23514a, Scope.CREATOR);
                    break;
                case 4:
                    num2 = C4628a.m23499h(parcel, m23514a);
                    break;
                case 5:
                    num = C4628a.m23499h(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AuthAccountRequest(i, iBinder, scopeArr, num2, num);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AuthAccountRequest[] newArray(int i) {
        return new AuthAccountRequest[i];
    }
}
