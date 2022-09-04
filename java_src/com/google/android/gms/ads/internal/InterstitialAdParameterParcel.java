package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public final class InterstitialAdParameterParcel extends AbstractSafeParcelable {
    public static final C3631m CREATOR = new C3631m();

    /* renamed from: a */
    public final int f13788a;

    /* renamed from: b */
    public final boolean f13789b;

    /* renamed from: c */
    public final boolean f13790c;

    /* renamed from: d */
    public final String f13791d;

    /* renamed from: e */
    public final boolean f13792e;

    /* renamed from: f */
    public final float f13793f;

    /* renamed from: g */
    public final int f13794g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterstitialAdParameterParcel(int i, boolean z, boolean z2, String str, boolean z3, float f, int i2) {
        this.f13788a = i;
        this.f13789b = z;
        this.f13790c = z2;
        this.f13791d = str;
        this.f13792e = z3;
        this.f13793f = f;
        this.f13794g = i2;
    }

    public InterstitialAdParameterParcel(boolean z, boolean z2, boolean z3, float f, int i) {
        this(3, z, z2, null, z3, f, i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3631m.m27294a(this, parcel, i);
    }
}
