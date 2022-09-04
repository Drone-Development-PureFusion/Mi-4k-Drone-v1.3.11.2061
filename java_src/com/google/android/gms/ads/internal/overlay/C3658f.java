package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.ads.internal.overlay.f */
/* loaded from: classes2.dex */
public class C3658f implements Parcelable.Creator<AdOverlayInfoParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27211a(AdOverlayInfoParcel adOverlayInfoParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, adOverlayInfoParcel.f14253a);
        C4630b.m23470a(parcel, 2, (Parcelable) adOverlayInfoParcel.f14254b, i, false);
        C4630b.m23472a(parcel, 3, adOverlayInfoParcel.m27260a(), false);
        C4630b.m23472a(parcel, 4, adOverlayInfoParcel.m27257b(), false);
        C4630b.m23472a(parcel, 5, adOverlayInfoParcel.m27256c(), false);
        C4630b.m23472a(parcel, 6, adOverlayInfoParcel.m27255d(), false);
        C4630b.m23464a(parcel, 7, adOverlayInfoParcel.f14259g, false);
        C4630b.m23461a(parcel, 8, adOverlayInfoParcel.f14260h);
        C4630b.m23464a(parcel, 9, adOverlayInfoParcel.f14261i, false);
        C4630b.m23472a(parcel, 10, adOverlayInfoParcel.m27253f(), false);
        C4630b.m23475a(parcel, 11, adOverlayInfoParcel.f14263k);
        C4630b.m23475a(parcel, 12, adOverlayInfoParcel.f14264l);
        C4630b.m23464a(parcel, 13, adOverlayInfoParcel.f14265m, false);
        C4630b.m23470a(parcel, 14, (Parcelable) adOverlayInfoParcel.f14266n, i, false);
        C4630b.m23472a(parcel, 15, adOverlayInfoParcel.m27254e(), false);
        C4630b.m23464a(parcel, 16, adOverlayInfoParcel.f14268p, false);
        C4630b.m23470a(parcel, 17, (Parcelable) adOverlayInfoParcel.f14269q, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i2 = 0;
        int i3 = 0;
        String str3 = null;
        VersionInfoParcel versionInfoParcel = null;
        IBinder iBinder6 = null;
        String str4 = null;
        InterstitialAdParameterParcel interstitialAdParameterParcel = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    adLauncherIntentInfoParcel = (AdLauncherIntentInfoParcel) C4628a.m23510a(parcel, m23514a, AdLauncherIntentInfoParcel.CREATOR);
                    break;
                case 3:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 4:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 5:
                    iBinder3 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 6:
                    iBinder4 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 7:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 9:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 10:
                    iBinder5 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 11:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 12:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 13:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) C4628a.m23510a(parcel, m23514a, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                    iBinder6 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 16:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 17:
                    interstitialAdParameterParcel = (InterstitialAdParameterParcel) C4628a.m23510a(parcel, m23514a, InterstitialAdParameterParcel.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AdOverlayInfoParcel(i, adLauncherIntentInfoParcel, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, versionInfoParcel, iBinder6, str4, interstitialAdParameterParcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdOverlayInfoParcel[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
