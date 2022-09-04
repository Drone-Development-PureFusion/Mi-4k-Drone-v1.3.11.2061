package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.ads.internal.formats.k */
/* loaded from: classes2.dex */
public class C3615k implements Parcelable.Creator<NativeAdOptionsParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27355a(NativeAdOptionsParcel nativeAdOptionsParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, nativeAdOptionsParcel.f14074a);
        C4630b.m23461a(parcel, 2, nativeAdOptionsParcel.f14075b);
        C4630b.m23475a(parcel, 3, nativeAdOptionsParcel.f14076c);
        C4630b.m23461a(parcel, 4, nativeAdOptionsParcel.f14077d);
        C4630b.m23475a(parcel, 5, nativeAdOptionsParcel.f14078e);
        C4630b.m23470a(parcel, 6, (Parcelable) nativeAdOptionsParcel.f14079f, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NativeAdOptionsParcel createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        VideoOptionsParcel videoOptionsParcel = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 3:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    videoOptionsParcel = (VideoOptionsParcel) C4628a.m23510a(parcel, m23514a, VideoOptionsParcel.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new NativeAdOptionsParcel(i3, z2, i2, z, i, videoOptionsParcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public NativeAdOptionsParcel[] newArray(int i) {
        return new NativeAdOptionsParcel[i];
    }
}
