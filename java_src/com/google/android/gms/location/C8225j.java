package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.location.j */
/* loaded from: classes2.dex */
public class C8225j implements Parcelable.Creator<LocationAvailability> {

    /* renamed from: a */
    public static final int f26827a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12379a(LocationAvailability locationAvailability, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, locationAvailability.f26666a);
        C4630b.m23475a(parcel, 2, locationAvailability.f26667b);
        C4630b.m23474a(parcel, 3, locationAvailability.f26668c);
        C4630b.m23475a(parcel, 4, locationAvailability.f26669d);
        C4630b.m23475a(parcel, 1000, locationAvailability.m12629b());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LocationAvailability createFromParcel(Parcel parcel) {
        int i = 1;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        int i3 = 1000;
        long j = 0;
        int i4 = 1;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 1000:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new LocationAvailability(i2, i3, i4, i, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LocationAvailability[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
