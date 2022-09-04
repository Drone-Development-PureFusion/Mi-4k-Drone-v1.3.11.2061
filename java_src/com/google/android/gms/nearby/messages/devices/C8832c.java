package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.messages.devices.c */
/* loaded from: classes2.dex */
public class C8832c implements Parcelable.Creator<NearbyDeviceId> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9933a(NearbyDeviceId nearbyDeviceId, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, nearbyDeviceId.m9942a());
        C4630b.m23460a(parcel, 2, nearbyDeviceId.f28231c, false);
        C4630b.m23475a(parcel, 1000, nearbyDeviceId.f28230b);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NearbyDeviceId createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
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
        return new NearbyDeviceId(i2, i, bArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NearbyDeviceId[] newArray(int i) {
        return new NearbyDeviceId[i];
    }
}
