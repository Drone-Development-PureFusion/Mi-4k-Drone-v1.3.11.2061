package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.data.h */
/* loaded from: classes2.dex */
public class C5150h implements Parcelable.Creator<BleDevice> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21466a(BleDevice bleDevice, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, bleDevice.m21758a(), false);
        C4630b.m23464a(parcel, 2, bleDevice.m21756b(), false);
        C4630b.m23449b(parcel, 3, bleDevice.m21755c(), false);
        C4630b.m23447c(parcel, 4, bleDevice.m21754d(), false);
        C4630b.m23475a(parcel, 1000, bleDevice.m21753e());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BleDevice createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ArrayList<String> arrayList2 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    arrayList2 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 4:
                    arrayList = C4628a.m23504c(parcel, m23514a, DataType.CREATOR);
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
        return new BleDevice(i, str2, str, arrayList2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BleDevice[] newArray(int i) {
        return new BleDevice[i];
    }
}
