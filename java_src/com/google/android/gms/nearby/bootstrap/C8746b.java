package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.bootstrap.b */
/* loaded from: classes2.dex */
public class C8746b implements Parcelable.Creator<Device> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10284a(Device device, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, device.m10290a(), false);
        C4630b.m23464a(parcel, 2, device.m10289b(), false);
        C4630b.m23464a(parcel, 3, device.m10288c(), false);
        C4630b.m23478a(parcel, 4, device.m10287d());
        C4630b.m23475a(parcel, 1000, device.f28001a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Device createFromParcel(Parcel parcel) {
        byte b = 0;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    b = C4628a.m23502e(parcel, m23514a);
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
        return new Device(i, str3, str2, str, b);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Device[] newArray(int i) {
        return new Device[i];
    }
}
