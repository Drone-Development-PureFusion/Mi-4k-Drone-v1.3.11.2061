package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.wearable.internal.bc */
/* loaded from: classes2.dex */
public class C9559bc implements Parcelable.Creator<CapabilityInfoParcelable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7875a(CapabilityInfoParcelable capabilityInfoParcelable, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, capabilityInfoParcelable.f29881a);
        C4630b.m23464a(parcel, 2, capabilityInfoParcelable.mo7883a(), false);
        C4630b.m23447c(parcel, 3, capabilityInfoParcelable.m8077c(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CapabilityInfoParcelable createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    arrayList = C4628a.m23504c(parcel, m23514a, NodeParcelable.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CapabilityInfoParcelable(i, str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CapabilityInfoParcelable[] newArray(int i) {
        return new CapabilityInfoParcelable[i];
    }
}
