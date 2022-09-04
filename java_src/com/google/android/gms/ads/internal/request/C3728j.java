package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.ads.internal.request.j */
/* loaded from: classes2.dex */
public class C3728j implements Parcelable.Creator<CapabilityParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m26997a(CapabilityParcel capabilityParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, capabilityParcel.f14594a);
        C4630b.m23461a(parcel, 2, capabilityParcel.f14595b);
        C4630b.m23461a(parcel, 3, capabilityParcel.f14596c);
        C4630b.m23461a(parcel, 4, capabilityParcel.f14597d);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CapabilityParcel createFromParcel(Parcel parcel) {
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 3:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CapabilityParcel(i, z3, z2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CapabilityParcel[] newArray(int i) {
        return new CapabilityParcel[i];
    }
}
