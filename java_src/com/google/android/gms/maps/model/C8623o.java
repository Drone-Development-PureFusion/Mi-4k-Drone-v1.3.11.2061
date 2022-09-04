package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.maps.model.o */
/* loaded from: classes2.dex */
public class C8623o implements Parcelable.Creator<CircleOptions> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10949a(CircleOptions circleOptions, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, circleOptions.m11417a());
        C4630b.m23470a(parcel, 2, (Parcelable) circleOptions.m11411b(), i, false);
        C4630b.m23477a(parcel, 3, circleOptions.m11407c());
        C4630b.m23476a(parcel, 4, circleOptions.m11406d());
        C4630b.m23475a(parcel, 5, circleOptions.m11405e());
        C4630b.m23475a(parcel, 6, circleOptions.m11404f());
        C4630b.m23476a(parcel, 7, circleOptions.m11403g());
        C4630b.m23461a(parcel, 8, circleOptions.m11402h());
        C4630b.m23461a(parcel, 9, circleOptions.m11401i());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CircleOptions createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        LatLng latLng = null;
        double d = C9755a.f30449c;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    latLng = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    break;
                case 3:
                    d = C4628a.m23493n(parcel, m23514a);
                    break;
                case 4:
                    f2 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 5:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 8:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 9:
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
        return new CircleOptions(i3, latLng, d, f2, i2, i, f, z2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CircleOptions[] newArray(int i) {
        return new CircleOptions[i];
    }
}
