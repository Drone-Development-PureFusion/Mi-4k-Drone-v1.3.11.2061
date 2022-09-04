package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.cast.internal.g */
/* loaded from: classes2.dex */
public class C4431g implements Parcelable.Creator<DeviceStatus> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m24199a(DeviceStatus deviceStatus, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, deviceStatus.m24278a());
        C4630b.m23477a(parcel, 2, deviceStatus.m24277b());
        C4630b.m23461a(parcel, 3, deviceStatus.m24276c());
        C4630b.m23475a(parcel, 4, deviceStatus.m24275d());
        C4630b.m23470a(parcel, 5, (Parcelable) deviceStatus.m24273f(), i, false);
        C4630b.m23475a(parcel, 6, deviceStatus.m24274e());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DeviceStatus createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        double d = C9755a.f30449c;
        ApplicationMetadata applicationMetadata = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    d = C4628a.m23493n(parcel, m23514a);
                    break;
                case 3:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    applicationMetadata = (ApplicationMetadata) C4628a.m23510a(parcel, m23514a, ApplicationMetadata.CREATOR);
                    break;
                case 6:
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
        return new DeviceStatus(i3, d, z, i2, applicationMetadata, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DeviceStatus[] newArray(int i) {
        return new DeviceStatus[i];
    }
}
