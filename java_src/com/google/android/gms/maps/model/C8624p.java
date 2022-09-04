package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.maps.model.p */
/* loaded from: classes2.dex */
public class C8624p implements Parcelable.Creator<GroundOverlayOptions> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10946a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, groundOverlayOptions.m11392b());
        C4630b.m23472a(parcel, 2, groundOverlayOptions.m11400a(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) groundOverlayOptions.m11386d(), i, false);
        C4630b.m23476a(parcel, 4, groundOverlayOptions.m11385e());
        C4630b.m23476a(parcel, 5, groundOverlayOptions.m11384f());
        C4630b.m23470a(parcel, 6, (Parcelable) groundOverlayOptions.m11383g(), i, false);
        C4630b.m23476a(parcel, 7, groundOverlayOptions.m11382h());
        C4630b.m23476a(parcel, 8, groundOverlayOptions.m11381i());
        C4630b.m23461a(parcel, 9, groundOverlayOptions.m11377m());
        C4630b.m23476a(parcel, 10, groundOverlayOptions.m11380j());
        C4630b.m23476a(parcel, 11, groundOverlayOptions.m11379k());
        C4630b.m23476a(parcel, 12, groundOverlayOptions.m11378l());
        C4630b.m23461a(parcel, 13, groundOverlayOptions.m11376n());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GroundOverlayOptions createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        IBinder iBinder = null;
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        LatLngBounds latLngBounds = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 3:
                    latLng = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    break;
                case 4:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 5:
                    f2 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C4628a.m23510a(parcel, m23514a, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 8:
                    f4 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 9:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 10:
                    f5 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 11:
                    f6 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 12:
                    f7 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 13:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GroundOverlayOptions(i, iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GroundOverlayOptions[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
