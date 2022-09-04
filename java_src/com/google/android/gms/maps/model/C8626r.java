package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.maps.model.r */
/* loaded from: classes2.dex */
public class C8626r implements Parcelable.Creator<LatLng> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10940a(LatLng latLng, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, latLng.m11375a());
        C4630b.m23477a(parcel, 2, latLng.f27462a);
        C4630b.m23477a(parcel, 3, latLng.f27463b);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LatLng createFromParcel(Parcel parcel) {
        double d = C9755a.f30449c;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        double d2 = 0.0d;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    d2 = C4628a.m23493n(parcel, m23514a);
                    break;
                case 3:
                    d = C4628a.m23493n(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new LatLng(i, d2, d);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LatLng[] newArray(int i) {
        return new LatLng[i];
    }
}
