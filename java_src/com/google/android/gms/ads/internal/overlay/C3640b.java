package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.ads.internal.overlay.b */
/* loaded from: classes2.dex */
public class C3640b implements Parcelable.Creator<AdLauncherIntentInfoParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27248a(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, adLauncherIntentInfoParcel.f14244a);
        C4630b.m23464a(parcel, 2, adLauncherIntentInfoParcel.f14245b, false);
        C4630b.m23464a(parcel, 3, adLauncherIntentInfoParcel.f14246c, false);
        C4630b.m23464a(parcel, 4, adLauncherIntentInfoParcel.f14247d, false);
        C4630b.m23464a(parcel, 5, adLauncherIntentInfoParcel.f14248e, false);
        C4630b.m23464a(parcel, 6, adLauncherIntentInfoParcel.f14249f, false);
        C4630b.m23464a(parcel, 7, adLauncherIntentInfoParcel.f14250g, false);
        C4630b.m23464a(parcel, 8, adLauncherIntentInfoParcel.f14251h, false);
        C4630b.m23470a(parcel, 9, (Parcelable) adLauncherIntentInfoParcel.f14252i, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdLauncherIntentInfoParcel createFromParcel(Parcel parcel) {
        Intent intent = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str7 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    intent = (Intent) C4628a.m23510a(parcel, m23514a, Intent.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AdLauncherIntentInfoParcel(i, str7, str6, str5, str4, str3, str2, str, intent);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdLauncherIntentInfoParcel[] newArray(int i) {
        return new AdLauncherIntentInfoParcel[i];
    }
}
