package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.result.a */
/* loaded from: classes2.dex */
public class C5250a implements Parcelable.Creator<BleDevicesResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20903a(BleDevicesResult bleDevicesResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23447c(parcel, 1, bleDevicesResult.m20964b(), false);
        C4630b.m23470a(parcel, 2, (Parcelable) bleDevicesResult.mo7645a(), i, false);
        C4630b.m23475a(parcel, 1000, bleDevicesResult.m20963c());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BleDevicesResult createFromParcel(Parcel parcel) {
        Status status = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList = C4628a.m23504c(parcel, m23514a, BleDevice.CREATOR);
                    break;
                case 2:
                    status = (Status) C4628a.m23510a(parcel, m23514a, Status.CREATOR);
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
        return new BleDevicesResult(i, arrayList, status);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BleDevicesResult[] newArray(int i) {
        return new BleDevicesResult[i];
    }
}
