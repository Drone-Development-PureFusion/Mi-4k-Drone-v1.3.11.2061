package com.google.android.gms.ads.internal.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public class CapabilityParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CapabilityParcel> CREATOR = new C3728j();

    /* renamed from: a */
    public final int f14594a;

    /* renamed from: b */
    public final boolean f14595b;

    /* renamed from: c */
    public final boolean f14596c;

    /* renamed from: d */
    public final boolean f14597d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CapabilityParcel(int i, boolean z, boolean z2, boolean z3) {
        this.f14594a = i;
        this.f14595b = z;
        this.f14596c = z2;
        this.f14597d = z3;
    }

    public CapabilityParcel(boolean z, boolean z2, boolean z3) {
        this(2, z, z2, z3);
    }

    /* renamed from: a */
    public Bundle m27038a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("iap_supported", this.f14595b);
        bundle.putBoolean("default_iap_supported", this.f14596c);
        bundle.putBoolean("app_streaming_supported", this.f14597d);
        return bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3728j.m26997a(this, parcel, i);
    }
}
