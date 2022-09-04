package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.location.ab */
/* loaded from: classes2.dex */
public class C8162ab implements Parcelable.Creator<LocationSettingsStates> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12573a(LocationSettingsStates locationSettingsStates, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23461a(parcel, 1, locationSettingsStates.m12587b());
        C4630b.m23461a(parcel, 2, locationSettingsStates.m12585d());
        C4630b.m23461a(parcel, 3, locationSettingsStates.m12581h());
        C4630b.m23461a(parcel, 4, locationSettingsStates.m12586c());
        C4630b.m23461a(parcel, 5, locationSettingsStates.m12584e());
        C4630b.m23461a(parcel, 6, locationSettingsStates.m12580i());
        C4630b.m23475a(parcel, 1000, locationSettingsStates.m12589a());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LocationSettingsStates createFromParcel(Parcel parcel) {
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    z6 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 2:
                    z5 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 3:
                    z4 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    z = C4628a.m23505c(parcel, m23514a);
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
        return new LocationSettingsStates(i, z6, z5, z4, z3, z2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LocationSettingsStates[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
