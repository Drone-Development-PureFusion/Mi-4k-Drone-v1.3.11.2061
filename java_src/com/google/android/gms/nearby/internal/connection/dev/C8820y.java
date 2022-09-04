package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.y */
/* loaded from: classes2.dex */
public class C8820y implements Parcelable.Creator<OnConnectionResponseParams> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9987a(OnConnectionResponseParams onConnectionResponseParams, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, onConnectionResponseParams.m10157a(), false);
        C4630b.m23475a(parcel, 2, onConnectionResponseParams.m10156b());
        C4630b.m23460a(parcel, 3, onConnectionResponseParams.m10155c(), false);
        C4630b.m23475a(parcel, 1000, onConnectionResponseParams.f28093a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnConnectionResponseParams createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                case 1000:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new OnConnectionResponseParams(i2, str, i, bArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnConnectionResponseParams[] newArray(int i) {
        return new OnConnectionResponseParams[i];
    }
}
