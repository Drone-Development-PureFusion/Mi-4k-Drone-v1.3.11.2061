package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.maps.model.t */
/* loaded from: classes2.dex */
public class C8628t implements Parcelable.Creator<MarkerOptions> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10934a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, markerOptions.m11356a());
        C4630b.m23470a(parcel, 2, (Parcelable) markerOptions.m11344c(), i, false);
        C4630b.m23464a(parcel, 3, markerOptions.m11341d(), false);
        C4630b.m23464a(parcel, 4, markerOptions.m11340e(), false);
        C4630b.m23472a(parcel, 5, markerOptions.m11349b(), false);
        C4630b.m23476a(parcel, 6, markerOptions.m11338g());
        C4630b.m23476a(parcel, 7, markerOptions.m11337h());
        C4630b.m23461a(parcel, 8, markerOptions.m11336i());
        C4630b.m23461a(parcel, 9, markerOptions.m11335j());
        C4630b.m23461a(parcel, 10, markerOptions.m11334k());
        C4630b.m23476a(parcel, 11, markerOptions.m11333l());
        C4630b.m23476a(parcel, 12, markerOptions.m11332m());
        C4630b.m23476a(parcel, 13, markerOptions.m11331n());
        C4630b.m23476a(parcel, 14, markerOptions.m11330o());
        C4630b.m23476a(parcel, 15, markerOptions.m11329p());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MarkerOptions createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
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
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 6:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 7:
                    f2 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 8:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 9:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 10:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 11:
                    f3 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 12:
                    f4 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 13:
                    f5 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 14:
                    f6 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 15:
                    f7 = C4628a.m23495l(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new MarkerOptions(i, latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
