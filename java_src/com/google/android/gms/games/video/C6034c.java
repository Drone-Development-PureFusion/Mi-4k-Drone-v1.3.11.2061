package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.games.video.c */
/* loaded from: classes2.dex */
public class C6034c implements Parcelable.Creator<VideoCapabilities> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18983a(VideoCapabilities videoCapabilities, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23461a(parcel, 1, videoCapabilities.m19020c());
        C4630b.m23461a(parcel, 2, videoCapabilities.m19022b());
        C4630b.m23461a(parcel, 3, videoCapabilities.m19019d());
        C4630b.m23454a(parcel, 4, videoCapabilities.m19018e(), false);
        C4630b.m23454a(parcel, 5, videoCapabilities.m19017f(), false);
        C4630b.m23475a(parcel, 1000, videoCapabilities.m19025a());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VideoCapabilities createFromParcel(Parcel parcel) {
        boolean[] zArr = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        boolean[] zArr2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 2:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 3:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    zArr2 = C4628a.m23485v(parcel, m23514a);
                    break;
                case 5:
                    zArr = C4628a.m23485v(parcel, m23514a);
                    break;
                case 1000:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new VideoCapabilities(i, z3, z2, z, zArr2, zArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VideoCapabilities[] newArray(int i) {
        return new VideoCapabilities[i];
    }
}
