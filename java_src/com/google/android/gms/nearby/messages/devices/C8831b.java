package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.messages.devices.b */
/* loaded from: classes2.dex */
public class C8831b implements Parcelable.Creator<NearbyDeviceFilter> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9936a(NearbyDeviceFilter nearbyDeviceFilter, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, nearbyDeviceFilter.f28226b);
        C4630b.m23460a(parcel, 2, nearbyDeviceFilter.f28227c, false);
        C4630b.m23461a(parcel, 3, nearbyDeviceFilter.f28228d);
        C4630b.m23475a(parcel, 1000, nearbyDeviceFilter.f28225a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NearbyDeviceFilter createFromParcel(Parcel parcel) {
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        byte[] bArr = null;
        int i = 0;
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
                case 3:
                    z = C4628a.m23505c(parcel, m23514a);
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
        return new NearbyDeviceFilter(i2, i, bArr, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NearbyDeviceFilter[] newArray(int i) {
        return new NearbyDeviceFilter[i];
    }
}
