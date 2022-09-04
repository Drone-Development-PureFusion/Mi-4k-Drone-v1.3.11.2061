package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.maps.model.ad */
/* loaded from: classes2.dex */
public class C8609ad implements Parcelable.Creator<VisibleRegion> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m11089a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, visibleRegion.m11257a());
        C4630b.m23470a(parcel, 2, (Parcelable) visibleRegion.f27547a, i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) visibleRegion.f27548b, i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) visibleRegion.f27549c, i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) visibleRegion.f27550d, i, false);
        C4630b.m23470a(parcel, 6, (Parcelable) visibleRegion.f27551e, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VisibleRegion createFromParcel(Parcel parcel) {
        LatLngBounds latLngBounds = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    latLng4 = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    break;
                case 3:
                    latLng3 = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    break;
                case 4:
                    latLng2 = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    break;
                case 5:
                    latLng = (LatLng) C4628a.m23510a(parcel, m23514a, LatLng.CREATOR);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C4628a.m23510a(parcel, m23514a, LatLngBounds.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new VisibleRegion(i, latLng4, latLng3, latLng2, latLng, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
