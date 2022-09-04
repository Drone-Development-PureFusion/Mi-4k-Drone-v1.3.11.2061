package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.d */
/* loaded from: classes2.dex */
public class C8782d implements Parcelable.Creator<SendPayloadParams> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10079a(SendPayloadParams sendPayloadParams, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23472a(parcel, 1, sendPayloadParams.m10128a(), false);
        C4630b.m23455a(parcel, 2, sendPayloadParams.m10127b(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) sendPayloadParams.m10126c(), i, false);
        C4630b.m23461a(parcel, 4, sendPayloadParams.m10125d());
        C4630b.m23475a(parcel, 1000, sendPayloadParams.f28134a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SendPayloadParams createFromParcel(Parcel parcel) {
        boolean z = false;
        ParcelablePayload parcelablePayload = null;
        int m23508b = C4628a.m23508b(parcel);
        String[] strArr = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 2:
                    strArr = C4628a.m23520C(parcel, m23514a);
                    break;
                case 3:
                    parcelablePayload = (ParcelablePayload) C4628a.m23510a(parcel, m23514a, ParcelablePayload.CREATOR);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
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
        return new SendPayloadParams(i, iBinder, strArr, parcelablePayload, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SendPayloadParams[] newArray(int i) {
        return new SendPayloadParams[i];
    }
}
