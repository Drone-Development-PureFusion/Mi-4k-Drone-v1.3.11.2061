package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.maps.model.n */
/* loaded from: classes2.dex */
public class C8622n implements Parcelable.Creator<CameraPosition> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10952a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, cameraPosition.m11427a());
        C4630b.m23470a(parcel, 2, (Parcelable) cameraPosition.f27430a, i, false);
        C4630b.m23476a(parcel, 3, cameraPosition.f27431b);
        C4630b.m23476a(parcel, 4, cameraPosition.f27432c);
        C4630b.m23476a(parcel, 5, cameraPosition.f27433d);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CameraPosition createFromParcel(Parcel parcel) {
        float f = 0.0f;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    latLng = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    break;
                case 3:
                    f3 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 4:
                    f2 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 5:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CameraPosition(i, latLng, f3, f2, f);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }
}
