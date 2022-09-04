package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.signin.internal.a */
/* loaded from: classes2.dex */
public class C9006a implements Parcelable.Creator<AuthAccountResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9395a(AuthAccountResult authAccountResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, authAccountResult.f28640a);
        C4630b.m23475a(parcel, 2, authAccountResult.m9405b());
        C4630b.m23470a(parcel, 3, (Parcelable) authAccountResult.m9404c(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AuthAccountResult createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        Intent intent = null;
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
                    intent = (Intent) C4628a.m23510a(parcel, m23514a, Intent.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AuthAccountResult(i2, i, intent);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AuthAccountResult[] newArray(int i) {
        return new AuthAccountResult[i];
    }
}
