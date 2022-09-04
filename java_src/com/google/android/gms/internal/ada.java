package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.AbstractC3768s;
import com.google.android.gms.ads.internal.C3588d;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
@aaa
/* loaded from: classes.dex */
public class ada {
    /* renamed from: a */
    public acy m18143a(Context context, AdSizeParcel adSizeParcel, boolean z, boolean z2, @Nullable C7667ro c7667ro, VersionInfoParcel versionInfoParcel) {
        return m18142a(context, adSizeParcel, z, z2, c7667ro, versionInfoParcel, null, null, null);
    }

    /* renamed from: a */
    public acy m18142a(Context context, AdSizeParcel adSizeParcel, boolean z, boolean z2, @Nullable C7667ro c7667ro, VersionInfoParcel versionInfoParcel, C7801un c7801un, AbstractC3768s abstractC3768s, C3588d c3588d) {
        adb adbVar = new adb(adc.m18118a(context, adSizeParcel, z, z2, c7667ro, versionInfoParcel, c7801un, abstractC3768s, c3588d));
        adbVar.setWebViewClient(C3779u.m26888g().mo18283a(adbVar, z2));
        adbVar.setWebChromeClient(C3779u.m26888g().mo18293c((acy) adbVar));
        return adbVar;
    }
}
