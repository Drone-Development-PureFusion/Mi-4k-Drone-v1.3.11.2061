package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.maps.model.ac */
/* loaded from: classes2.dex */
public class C8608ac implements Parcelable.Creator<TileOverlayOptions> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m11092a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, tileOverlayOptions.m11270a());
        C4630b.m23472a(parcel, 2, tileOverlayOptions.m11265b(), false);
        C4630b.m23461a(parcel, 3, tileOverlayOptions.m11260e());
        C4630b.m23476a(parcel, 4, tileOverlayOptions.m11261d());
        C4630b.m23461a(parcel, 5, tileOverlayOptions.m11259f());
        C4630b.m23476a(parcel, 6, tileOverlayOptions.m11258g());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TileOverlayOptions createFromParcel(Parcel parcel) {
        boolean z = false;
        float f = 0.0f;
        int m23508b = C4628a.m23508b(parcel);
        IBinder iBinder = null;
        boolean z2 = true;
        float f2 = 0.0f;
        int i = 0;
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
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    f2 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 5:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
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
        return new TileOverlayOptions(i, iBinder, z, f2, z2, f);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TileOverlayOptions[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
