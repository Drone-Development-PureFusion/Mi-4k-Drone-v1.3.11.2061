package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.nearby.bootstrap.Device;
/* renamed from: com.google.android.gms.nearby.bootstrap.request.a */
/* loaded from: classes2.dex */
public class C8747a implements Parcelable.Creator<ConnectRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10251a(ConnectRequest connectRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) connectRequest.m10283a(), i, false);
        C4630b.m23464a(parcel, 2, connectRequest.m10282b(), false);
        C4630b.m23464a(parcel, 3, connectRequest.m10281c(), false);
        C4630b.m23472a(parcel, 4, connectRequest.m10275i(), false);
        C4630b.m23472a(parcel, 5, connectRequest.m10274j(), false);
        C4630b.m23472a(parcel, 6, connectRequest.m10273k(), false);
        C4630b.m23478a(parcel, 7, connectRequest.m10280d());
        C4630b.m23475a(parcel, 1000, connectRequest.f28006a);
        C4630b.m23474a(parcel, 8, connectRequest.m10279e());
        C4630b.m23464a(parcel, 9, connectRequest.m10278f(), false);
        C4630b.m23478a(parcel, 10, connectRequest.m10277g());
        C4630b.m23478a(parcel, 11, connectRequest.m10276h());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ConnectRequest createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Device device = null;
        String str = null;
        String str2 = null;
        byte b = 0;
        long j = 0;
        String str3 = null;
        byte b2 = 0;
        byte b3 = 0;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    device = (Device) C4628a.m23510a(parcel, m23514a, Device.CREATOR);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 5:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 6:
                    iBinder3 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 7:
                    b = C4628a.m23502e(parcel, m23514a);
                    break;
                case 8:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 9:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 10:
                    b2 = C4628a.m23502e(parcel, m23514a);
                    break;
                case 11:
                    b3 = C4628a.m23502e(parcel, m23514a);
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
        return new ConnectRequest(i, device, str, str2, b, j, str3, b2, b3, iBinder, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ConnectRequest[] newArray(int i) {
        return new ConnectRequest[i];
    }
}
