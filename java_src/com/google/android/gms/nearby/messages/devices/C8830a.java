package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.messages.devices.a */
/* loaded from: classes2.dex */
public class C8830a implements Parcelable.Creator<NearbyDevice> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9939a(NearbyDevice nearbyDevice, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) nearbyDevice.f28220c, i, false);
        C4630b.m23464a(parcel, 2, nearbyDevice.f28221d, false);
        C4630b.m23464a(parcel, 3, nearbyDevice.m9945a(), false);
        C4630b.m23456a(parcel, 4, (Parcelable[]) nearbyDevice.f28222e, i, false);
        C4630b.m23455a(parcel, 5, nearbyDevice.f28223f, false);
        C4630b.m23475a(parcel, 1000, nearbyDevice.f28219b);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NearbyDevice createFromParcel(Parcel parcel) {
        String[] strArr = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        NearbyDeviceId[] nearbyDeviceIdArr = null;
        String str = null;
        String str2 = null;
        NearbyDeviceId nearbyDeviceId = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    nearbyDeviceId = (NearbyDeviceId) C4628a.m23510a(parcel, m23514a, NearbyDeviceId.CREATOR);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    nearbyDeviceIdArr = (NearbyDeviceId[]) C4628a.m23506b(parcel, m23514a, NearbyDeviceId.CREATOR);
                    break;
                case 5:
                    strArr = C4628a.m23520C(parcel, m23514a);
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
        return new NearbyDevice(i, nearbyDeviceId, str2, str, nearbyDeviceIdArr, strArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NearbyDevice[] newArray(int i) {
        return new NearbyDevice[i];
    }
}
