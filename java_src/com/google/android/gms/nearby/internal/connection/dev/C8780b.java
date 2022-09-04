package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.b */
/* loaded from: classes2.dex */
public class C8780b implements Parcelable.Creator<RejectConnectionRequestParams> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10085a(RejectConnectionRequestParams rejectConnectionRequestParams, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23472a(parcel, 1, rejectConnectionRequestParams.m10136a(), false);
        C4630b.m23464a(parcel, 2, rejectConnectionRequestParams.m10135b(), false);
        C4630b.m23475a(parcel, 1000, rejectConnectionRequestParams.f28124a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RejectConnectionRequestParams createFromParcel(Parcel parcel) {
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 2:
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
        return new RejectConnectionRequestParams(i, iBinder, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RejectConnectionRequestParams[] newArray(int i) {
        return new RejectConnectionRequestParams[i];
    }
}
