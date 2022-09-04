package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public final class RewardedVideoAdRequestParcel extends AbstractSafeParcelable {
    public static final C3761h CREATOR = new C3761h();

    /* renamed from: a */
    public final int f14660a;

    /* renamed from: b */
    public final AdRequestParcel f14661b;

    /* renamed from: c */
    public final String f14662c;

    public RewardedVideoAdRequestParcel(int i, AdRequestParcel adRequestParcel, String str) {
        this.f14660a = i;
        this.f14661b = adRequestParcel;
        this.f14662c = str;
    }

    public RewardedVideoAdRequestParcel(AdRequestParcel adRequestParcel, String str) {
        this(1, adRequestParcel, str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3761h.m26964a(this, parcel, i);
    }
}
