package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.location.internal.o */
/* loaded from: classes2.dex */
public class C8221o implements Parcelable.Creator<ParcelableGeofence> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12387a(ParcelableGeofence parcelableGeofence, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, parcelableGeofence.mo12535a(), false);
        C4630b.m23474a(parcel, 2, parcelableGeofence.m12523g());
        C4630b.m23462a(parcel, 3, parcelableGeofence.m12527c());
        C4630b.m23477a(parcel, 4, parcelableGeofence.m12526d());
        C4630b.m23477a(parcel, 5, parcelableGeofence.m12525e());
        C4630b.m23476a(parcel, 6, parcelableGeofence.m12524f());
        C4630b.m23475a(parcel, 7, parcelableGeofence.m12522h());
        C4630b.m23475a(parcel, 1000, parcelableGeofence.m12529b());
        C4630b.m23475a(parcel, 8, parcelableGeofence.m12521i());
        C4630b.m23475a(parcel, 9, parcelableGeofence.m12520j());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelableGeofence createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        short s = 0;
        double d = C9755a.f30449c;
        double d2 = C9755a.f30449c;
        float f = 0.0f;
        long j = 0;
        int i3 = 0;
        int i4 = -1;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    s = C4628a.m23501f(parcel, m23514a);
                    break;
                case 4:
                    d = C4628a.m23493n(parcel, m23514a);
                    break;
                case 5:
                    d2 = C4628a.m23493n(parcel, m23514a);
                    break;
                case 6:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 7:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 9:
                    i4 = C4628a.m23500g(parcel, m23514a);
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
        return new ParcelableGeofence(i, str, i2, s, d, d2, f, j, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelableGeofence[] newArray(int i) {
        return new ParcelableGeofence[i];
    }
}
