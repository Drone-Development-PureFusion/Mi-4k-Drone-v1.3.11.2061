package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.fitness.data.r */
/* loaded from: classes2.dex */
public class C5160r implements Parcelable.Creator<Device> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21432a(Device device, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, device.m21642a(), false);
        C4630b.m23464a(parcel, 2, device.m21638b(), false);
        C4630b.m23464a(parcel, 3, device.m21636c(), false);
        C4630b.m23464a(parcel, 4, device.m21631h(), false);
        C4630b.m23475a(parcel, 5, device.m21634e());
        C4630b.m23475a(parcel, 6, device.m21633f());
        C4630b.m23475a(parcel, 1000, device.m21630i());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Device createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 1000:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new Device(i3, str4, str3, str2, str, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Device[] newArray(int i) {
        return new Device[i];
    }
}
