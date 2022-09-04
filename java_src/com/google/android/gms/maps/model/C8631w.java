package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.maps.model.w */
/* loaded from: classes2.dex */
public class C8631w implements Parcelable.Creator<PolylineOptions> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10925a(PolylineOptions polylineOptions, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, polylineOptions.m11305a());
        C4630b.m23447c(parcel, 2, polylineOptions.m11298b(), false);
        C4630b.m23476a(parcel, 3, polylineOptions.m11295c());
        C4630b.m23475a(parcel, 4, polylineOptions.m11293d());
        C4630b.m23476a(parcel, 5, polylineOptions.m11292e());
        C4630b.m23461a(parcel, 6, polylineOptions.m11291f());
        C4630b.m23461a(parcel, 7, polylineOptions.m11290g());
        C4630b.m23461a(parcel, 8, polylineOptions.m11289h());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PolylineOptions createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList arrayList = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    arrayList = C4628a.m23504c(parcel, m23514a, LatLng.CREATOR);
                    break;
                case 3:
                    f2 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 4:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 6:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 8:
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
        return new PolylineOptions(i2, arrayList, f2, i, f, z3, z2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PolylineOptions[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
