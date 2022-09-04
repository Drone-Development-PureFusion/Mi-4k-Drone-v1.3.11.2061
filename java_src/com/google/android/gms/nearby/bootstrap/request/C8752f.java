package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.nearby.bootstrap.Device;
/* renamed from: com.google.android.gms.nearby.bootstrap.request.f */
/* loaded from: classes2.dex */
public class C8752f implements Parcelable.Creator<SendDataRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10236a(SendDataRequest sendDataRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) sendDataRequest.m10260a(), i, false);
        C4630b.m23460a(parcel, 2, sendDataRequest.m10259b(), false);
        C4630b.m23472a(parcel, 3, sendDataRequest.m10258c(), false);
        C4630b.m23475a(parcel, 1000, sendDataRequest.f28034a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SendDataRequest createFromParcel(Parcel parcel) {
        byte[] bArr;
        Device device;
        int m23500g;
        IBinder iBinder;
        IBinder iBinder2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        byte[] bArr2 = null;
        Device device2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    m23500g = i;
                    byte[] bArr3 = bArr2;
                    device = (Device) C4628a.m23510a(parcel, m23514a, Device.CREATOR);
                    iBinder = iBinder2;
                    bArr = bArr3;
                    break;
                case 2:
                    device = device2;
                    m23500g = i;
                    IBinder iBinder3 = iBinder2;
                    bArr = C4628a.m23487t(parcel, m23514a);
                    iBinder = iBinder3;
                    break;
                case 3:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    bArr = bArr2;
                    device = device2;
                    m23500g = i;
                    break;
                case 1000:
                    IBinder iBinder4 = iBinder2;
                    bArr = bArr2;
                    device = device2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    iBinder = iBinder4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    iBinder = iBinder2;
                    bArr = bArr2;
                    device = device2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            device2 = device;
            bArr2 = bArr;
            iBinder2 = iBinder;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SendDataRequest(i, device2, bArr2, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SendDataRequest[] newArray(int i) {
        return new SendDataRequest[i];
    }
}
