package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.BleDevice;
/* renamed from: com.google.android.gms.fitness.request.p */
/* loaded from: classes2.dex */
public class C5239p implements Parcelable.Creator<ClaimBleDeviceRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20998a(ClaimBleDeviceRequest claimBleDeviceRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, claimBleDeviceRequest.m21394a(), false);
        C4630b.m23470a(parcel, 2, (Parcelable) claimBleDeviceRequest.m21393b(), i, false);
        C4630b.m23472a(parcel, 3, claimBleDeviceRequest.m21392c(), false);
        C4630b.m23475a(parcel, 1000, claimBleDeviceRequest.m21391d());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ClaimBleDeviceRequest createFromParcel(Parcel parcel) {
        BleDevice bleDevice;
        String str;
        int m23500g;
        IBinder iBinder;
        IBinder iBinder2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        BleDevice bleDevice2 = null;
        String str2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    m23500g = i;
                    BleDevice bleDevice3 = bleDevice2;
                    str = C4628a.m23490q(parcel, m23514a);
                    iBinder = iBinder2;
                    bleDevice = bleDevice3;
                    break;
                case 2:
                    str = str2;
                    m23500g = i;
                    IBinder iBinder3 = iBinder2;
                    bleDevice = (BleDevice) C4628a.m23510a(parcel, m23514a, BleDevice.CREATOR);
                    iBinder = iBinder3;
                    break;
                case 3:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    bleDevice = bleDevice2;
                    str = str2;
                    m23500g = i;
                    break;
                case 1000:
                    IBinder iBinder4 = iBinder2;
                    bleDevice = bleDevice2;
                    str = str2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    iBinder = iBinder4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    iBinder = iBinder2;
                    bleDevice = bleDevice2;
                    str = str2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            str2 = str;
            bleDevice2 = bleDevice;
            iBinder2 = iBinder;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ClaimBleDeviceRequest(i, str2, bleDevice2, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ClaimBleDeviceRequest[] newArray(int i) {
        return new ClaimBleDeviceRequest[i];
    }
}
