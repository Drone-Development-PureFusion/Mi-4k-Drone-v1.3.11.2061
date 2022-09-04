package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.a */
/* loaded from: classes2.dex */
public class C8771a implements Parcelable.Creator<AcceptConnectionRequestParams> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10112a(AcceptConnectionRequestParams acceptConnectionRequestParams, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23472a(parcel, 1, acceptConnectionRequestParams.m10165a(), false);
        C4630b.m23472a(parcel, 2, acceptConnectionRequestParams.m10164b(), false);
        C4630b.m23464a(parcel, 3, acceptConnectionRequestParams.m10163c(), false);
        C4630b.m23460a(parcel, 4, acceptConnectionRequestParams.m10162d(), false);
        C4630b.m23475a(parcel, 1000, acceptConnectionRequestParams.f28079a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AcceptConnectionRequestParams createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 2:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    bArr = C4628a.m23487t(parcel, m23514a);
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
        return new AcceptConnectionRequestParams(i, iBinder2, iBinder, str, bArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AcceptConnectionRequestParams[] newArray(int i) {
        return new AcceptConnectionRequestParams[i];
    }
}
