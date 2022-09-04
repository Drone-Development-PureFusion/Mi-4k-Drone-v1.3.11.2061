package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.drive.realtime.internal.r */
/* loaded from: classes2.dex */
public class C5106r implements Parcelable.Creator<ParcelableIndexReference> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21810a(ParcelableIndexReference parcelableIndexReference, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, parcelableIndexReference.f18125a);
        C4630b.m23464a(parcel, 2, parcelableIndexReference.f18126b, false);
        C4630b.m23475a(parcel, 3, parcelableIndexReference.f18127c);
        C4630b.m23461a(parcel, 4, parcelableIndexReference.f18128d);
        C4630b.m23475a(parcel, 5, parcelableIndexReference.f18129e);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelableIndexReference createFromParcel(Parcel parcel) {
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
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
        return new ParcelableIndexReference(i3, str, i2, z, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelableIndexReference[] newArray(int i) {
        return new ParcelableIndexReference[i];
    }
}
