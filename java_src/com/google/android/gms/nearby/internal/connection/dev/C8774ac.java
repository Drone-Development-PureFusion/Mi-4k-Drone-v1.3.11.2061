package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.ac */
/* loaded from: classes2.dex */
public class C8774ac implements Parcelable.Creator<OnPayloadReceivedParams> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10103a(OnPayloadReceivedParams onPayloadReceivedParams, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, onPayloadReceivedParams.m10149a(), false);
        C4630b.m23470a(parcel, 2, (Parcelable) onPayloadReceivedParams.m10148b(), i, false);
        C4630b.m23461a(parcel, 3, onPayloadReceivedParams.m10147c());
        C4630b.m23475a(parcel, 1000, onPayloadReceivedParams.f28105a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnPayloadReceivedParams createFromParcel(Parcel parcel) {
        ParcelablePayload parcelablePayload;
        String str;
        int m23500g;
        boolean z;
        ParcelablePayload parcelablePayload2 = null;
        boolean z2 = false;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    m23500g = i;
                    ParcelablePayload parcelablePayload3 = parcelablePayload2;
                    str = C4628a.m23490q(parcel, m23514a);
                    z = z2;
                    parcelablePayload = parcelablePayload3;
                    break;
                case 2:
                    str = str2;
                    m23500g = i;
                    boolean z3 = z2;
                    parcelablePayload = (ParcelablePayload) C4628a.m23510a(parcel, m23514a, ParcelablePayload.CREATOR);
                    z = z3;
                    break;
                case 3:
                    z = C4628a.m23505c(parcel, m23514a);
                    parcelablePayload = parcelablePayload2;
                    str = str2;
                    m23500g = i;
                    break;
                case 1000:
                    boolean z4 = z2;
                    parcelablePayload = parcelablePayload2;
                    str = str2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    z = z4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    z = z2;
                    parcelablePayload = parcelablePayload2;
                    str = str2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            str2 = str;
            parcelablePayload2 = parcelablePayload;
            z2 = z;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new OnPayloadReceivedParams(i, str2, parcelablePayload2, z2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnPayloadReceivedParams[] newArray(int i) {
        return new OnPayloadReceivedParams[i];
    }
}
