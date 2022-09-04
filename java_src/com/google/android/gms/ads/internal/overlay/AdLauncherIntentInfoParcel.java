package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public final class AdLauncherIntentInfoParcel extends AbstractSafeParcelable {
    public static final C3640b CREATOR = new C3640b();

    /* renamed from: a */
    public final int f14244a;

    /* renamed from: b */
    public final String f14245b;

    /* renamed from: c */
    public final String f14246c;

    /* renamed from: d */
    public final String f14247d;

    /* renamed from: e */
    public final String f14248e;

    /* renamed from: f */
    public final String f14249f;

    /* renamed from: g */
    public final String f14250g;

    /* renamed from: h */
    public final String f14251h;

    /* renamed from: i */
    public final Intent f14252i;

    public AdLauncherIntentInfoParcel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f14244a = i;
        this.f14245b = str;
        this.f14246c = str2;
        this.f14247d = str3;
        this.f14248e = str4;
        this.f14249f = str5;
        this.f14250g = str6;
        this.f14251h = str7;
        this.f14252i = intent;
    }

    public AdLauncherIntentInfoParcel(Intent intent) {
        this(2, null, null, null, null, null, null, null, intent);
    }

    public AdLauncherIntentInfoParcel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(2, str, str2, str3, str4, str5, str6, str7, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3640b.m27248a(this, parcel, i);
    }
}
