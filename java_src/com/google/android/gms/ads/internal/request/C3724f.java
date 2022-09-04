package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.ads.internal.request.f */
/* loaded from: classes2.dex */
public class C3724f implements Parcelable.Creator<AdRequestInfoParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27006a(AdRequestInfoParcel adRequestInfoParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, adRequestInfoParcel.f14485a);
        C4630b.m23473a(parcel, 2, adRequestInfoParcel.f14486b, false);
        C4630b.m23470a(parcel, 3, (Parcelable) adRequestInfoParcel.f14487c, i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) adRequestInfoParcel.f14488d, i, false);
        C4630b.m23464a(parcel, 5, adRequestInfoParcel.f14489e, false);
        C4630b.m23470a(parcel, 6, (Parcelable) adRequestInfoParcel.f14490f, i, false);
        C4630b.m23470a(parcel, 7, (Parcelable) adRequestInfoParcel.f14491g, i, false);
        C4630b.m23464a(parcel, 8, adRequestInfoParcel.f14492h, false);
        C4630b.m23464a(parcel, 9, adRequestInfoParcel.f14493i, false);
        C4630b.m23464a(parcel, 10, adRequestInfoParcel.f14494j, false);
        C4630b.m23470a(parcel, 11, (Parcelable) adRequestInfoParcel.f14495k, i, false);
        C4630b.m23473a(parcel, 12, adRequestInfoParcel.f14496l, false);
        C4630b.m23475a(parcel, 13, adRequestInfoParcel.f14497m);
        C4630b.m23449b(parcel, 14, adRequestInfoParcel.f14498n, false);
        C4630b.m23473a(parcel, 15, adRequestInfoParcel.f14499o, false);
        C4630b.m23461a(parcel, 16, adRequestInfoParcel.f14500p);
        C4630b.m23470a(parcel, 17, (Parcelable) adRequestInfoParcel.f14501q, i, false);
        C4630b.m23475a(parcel, 18, adRequestInfoParcel.f14502r);
        C4630b.m23475a(parcel, 19, adRequestInfoParcel.f14503s);
        C4630b.m23476a(parcel, 20, adRequestInfoParcel.f14504t);
        C4630b.m23464a(parcel, 21, adRequestInfoParcel.f14505u, false);
        C4630b.m23474a(parcel, 25, adRequestInfoParcel.f14506v);
        C4630b.m23464a(parcel, 26, adRequestInfoParcel.f14507w, false);
        C4630b.m23449b(parcel, 27, adRequestInfoParcel.f14508x, false);
        C4630b.m23464a(parcel, 28, adRequestInfoParcel.f14509y, false);
        C4630b.m23470a(parcel, 29, (Parcelable) adRequestInfoParcel.f14510z, i, false);
        C4630b.m23449b(parcel, 30, adRequestInfoParcel.f14469A, false);
        C4630b.m23474a(parcel, 31, adRequestInfoParcel.f14470B);
        C4630b.m23470a(parcel, 32, (Parcelable) adRequestInfoParcel.f14471C, i, false);
        C4630b.m23464a(parcel, 33, adRequestInfoParcel.f14472D, false);
        C4630b.m23476a(parcel, 34, adRequestInfoParcel.f14473E);
        C4630b.m23475a(parcel, 35, adRequestInfoParcel.f14474F);
        C4630b.m23475a(parcel, 36, adRequestInfoParcel.f14475G);
        C4630b.m23461a(parcel, 37, adRequestInfoParcel.f14476H);
        C4630b.m23461a(parcel, 38, adRequestInfoParcel.f14477I);
        C4630b.m23464a(parcel, 39, adRequestInfoParcel.f14478J, false);
        C4630b.m23461a(parcel, 40, adRequestInfoParcel.f14479K);
        C4630b.m23464a(parcel, 41, adRequestInfoParcel.f14480L, false);
        C4630b.m23461a(parcel, 42, adRequestInfoParcel.f14481M);
        C4630b.m23475a(parcel, 43, adRequestInfoParcel.f14482N);
        C4630b.m23473a(parcel, 44, adRequestInfoParcel.f14483O, false);
        C4630b.m23464a(parcel, 45, adRequestInfoParcel.f14484P, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdRequestInfoParcel createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Bundle bundle = null;
        AdRequestParcel adRequestParcel = null;
        AdSizeParcel adSizeParcel = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        int i2 = 0;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        boolean z = false;
        Messenger messenger = null;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        String str5 = null;
        long j = 0;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        NativeAdOptionsParcel nativeAdOptionsParcel = null;
        ArrayList<String> arrayList3 = null;
        long j2 = 0;
        CapabilityParcel capabilityParcel = null;
        String str8 = null;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str9 = null;
        String str10 = null;
        boolean z5 = false;
        int i7 = 0;
        Bundle bundle4 = null;
        String str11 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 3:
                    adRequestParcel = (AdRequestParcel) C4628a.m23510a(parcel, m23514a, AdRequestParcel.CREATOR);
                    break;
                case 4:
                    adSizeParcel = (AdSizeParcel) C4628a.m23510a(parcel, m23514a, AdSizeParcel.CREATOR);
                    break;
                case 5:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) C4628a.m23510a(parcel, m23514a, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) C4628a.m23510a(parcel, m23514a, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 10:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) C4628a.m23510a(parcel, m23514a, VersionInfoParcel.CREATOR);
                    break;
                case 12:
                    bundle2 = C4628a.m23488s(parcel, m23514a);
                    break;
                case 13:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 14:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                case 15:
                    bundle3 = C4628a.m23488s(parcel, m23514a);
                    break;
                case 16:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 17:
                    messenger = (Messenger) C4628a.m23510a(parcel, m23514a, Messenger.CREATOR);
                    break;
                case 18:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 19:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 20:
                    f = C4628a.m23495l(parcel, m23514a);
                    break;
                case 21:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 22:
                case 23:
                case 24:
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
                case 25:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 26:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 27:
                    arrayList2 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 28:
                    str7 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 29:
                    nativeAdOptionsParcel = (NativeAdOptionsParcel) C4628a.m23510a(parcel, m23514a, NativeAdOptionsParcel.CREATOR);
                    break;
                case 30:
                    arrayList3 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 31:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 32:
                    capabilityParcel = (CapabilityParcel) C4628a.m23510a(parcel, m23514a, CapabilityParcel.CREATOR);
                    break;
                case 33:
                    str8 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 34:
                    f2 = C4628a.m23495l(parcel, m23514a);
                    break;
                case 35:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 36:
                    i6 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 37:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 38:
                    z4 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 39:
                    str9 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 40:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 41:
                    str10 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 42:
                    z5 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 43:
                    i7 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 44:
                    bundle4 = C4628a.m23488s(parcel, m23514a);
                    break;
                case 45:
                    str11 = C4628a.m23490q(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AdRequestInfoParcel(i, bundle, adRequestParcel, adSizeParcel, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i2, arrayList, bundle3, z, messenger, i3, i4, f, str5, j, str6, arrayList2, str7, nativeAdOptionsParcel, arrayList3, j2, capabilityParcel, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdRequestInfoParcel[] newArray(int i) {
        return new AdRequestInfoParcel[i];
    }
}
