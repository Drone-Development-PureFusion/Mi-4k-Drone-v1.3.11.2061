package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.ads.internal.m */
/* loaded from: classes2.dex */
public class C3631m implements Parcelable.Creator<InterstitialAdParameterParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27294a(InterstitialAdParameterParcel interstitialAdParameterParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, interstitialAdParameterParcel.f13788a);
        C4630b.m23461a(parcel, 2, interstitialAdParameterParcel.f13789b);
        C4630b.m23461a(parcel, 3, interstitialAdParameterParcel.f13790c);
        C4630b.m23464a(parcel, 4, interstitialAdParameterParcel.f13791d, false);
        C4630b.m23461a(parcel, 5, interstitialAdParameterParcel.f13792e);
        C4630b.m23476a(parcel, 6, interstitialAdParameterParcel.f13793f);
        C4630b.m23475a(parcel, 7, interstitialAdParameterParcel.f13794g);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public InterstitialAdParameterParcel createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        float f = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 3:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 7:
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
        return new InterstitialAdParameterParcel(i2, z3, z2, str, z, f, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public InterstitialAdParameterParcel[] newArray(int i) {
        return new InterstitialAdParameterParcel[i];
    }
}
