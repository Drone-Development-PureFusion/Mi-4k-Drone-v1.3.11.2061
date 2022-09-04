package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.ads.internal.request.i */
/* loaded from: classes2.dex */
public class C3727i implements Parcelable.Creator<AutoClickProtectionConfigurationParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27000a(AutoClickProtectionConfigurationParcel autoClickProtectionConfigurationParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, autoClickProtectionConfigurationParcel.f14591a);
        C4630b.m23461a(parcel, 2, autoClickProtectionConfigurationParcel.f14592b);
        C4630b.m23449b(parcel, 3, autoClickProtectionConfigurationParcel.f14593c, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AutoClickProtectionConfigurationParcel createFromParcel(Parcel parcel) {
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList<String> arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 3:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AutoClickProtectionConfigurationParcel(i, z, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AutoClickProtectionConfigurationParcel[] newArray(int i) {
        return new AutoClickProtectionConfigurationParcel[i];
    }
}
