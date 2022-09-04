package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    public static final C3786d CREATOR = new C3786d();

    /* renamed from: a */
    public final int f14732a;

    /* renamed from: b */
    public String f14733b;

    /* renamed from: c */
    public int f14734c;

    /* renamed from: d */
    public int f14735d;

    /* renamed from: e */
    public boolean f14736e;

    public VersionInfoParcel(int i, int i2, boolean z) {
        this(i, i2, z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VersionInfoParcel(int i, int i2, boolean z, boolean z2) {
        this(1, new StringBuilder(String.valueOf(r2).length() + 24 + String.valueOf(r0).length()).append(r2).append(i).append(".").append(i2).append(".").append(r0).toString(), i, i2, z);
        String valueOf = String.valueOf("afma-sdk-a-v");
        String str = z ? "0" : z2 ? "2" : "1";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VersionInfoParcel(int i, String str, int i2, int i3, boolean z) {
        this.f14732a = i;
        this.f14733b = str;
        this.f14734c = i2;
        this.f14735d = i3;
        this.f14736e = z;
    }

    /* renamed from: a */
    public static VersionInfoParcel m26868a() {
        return new VersionInfoParcel(9683208, 9683208, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3786d.m26836a(this, parcel, i);
    }
}
