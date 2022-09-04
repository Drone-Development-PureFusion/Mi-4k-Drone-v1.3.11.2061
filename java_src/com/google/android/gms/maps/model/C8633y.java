package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.maps.model.y */
/* loaded from: classes2.dex */
public class C8633y implements Parcelable.Creator<StreetViewPanoramaLink> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10919a(StreetViewPanoramaLink streetViewPanoramaLink, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, streetViewPanoramaLink.m11279a());
        C4630b.m23464a(parcel, 2, streetViewPanoramaLink.f27520a, false);
        C4630b.m23476a(parcel, 3, streetViewPanoramaLink.f27521b);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StreetViewPanoramaLink createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        float f = 0.0f;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
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
        return new StreetViewPanoramaLink(i, str, f);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StreetViewPanoramaLink[] newArray(int i) {
        return new StreetViewPanoramaLink[i];
    }
}
