package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.connection.dev.f */
/* loaded from: classes2.dex */
public class C8769f implements Parcelable.Creator<PayloadTransferUpdate> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10169a(PayloadTransferUpdate payloadTransferUpdate, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23474a(parcel, 1, payloadTransferUpdate.m10189a());
        C4630b.m23475a(parcel, 2, payloadTransferUpdate.m10188b());
        C4630b.m23474a(parcel, 3, payloadTransferUpdate.m10187c());
        C4630b.m23474a(parcel, 4, payloadTransferUpdate.m10186d());
        C4630b.m23475a(parcel, 1000, payloadTransferUpdate.f28069a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PayloadTransferUpdate createFromParcel(Parcel parcel) {
        int i = 0;
        long j = 0;
        int m23508b = C4628a.m23508b(parcel);
        long j2 = 0;
        long j3 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    j = C4628a.m23498i(parcel, m23514a);
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
        return new PayloadTransferUpdate(i2, j3, i, j2, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PayloadTransferUpdate[] newArray(int i) {
        return new PayloadTransferUpdate[i];
    }
}
