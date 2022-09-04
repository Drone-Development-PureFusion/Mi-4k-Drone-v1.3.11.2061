package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.internal.connection.dev.ag */
/* loaded from: classes2.dex */
public class C8778ag implements Parcelable.Creator<OnStoppedDiscoveryParams> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10091a(OnStoppedDiscoveryParams onStoppedDiscoveryParams, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, onStoppedDiscoveryParams.m10141a());
        C4630b.m23475a(parcel, 1000, onStoppedDiscoveryParams.f28117a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnStoppedDiscoveryParams createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
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
        return new OnStoppedDiscoveryParams(i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnStoppedDiscoveryParams[] newArray(int i) {
        return new OnStoppedDiscoveryParams[i];
    }
}
