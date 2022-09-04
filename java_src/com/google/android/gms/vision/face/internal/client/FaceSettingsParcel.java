package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class FaceSettingsParcel extends AbstractSafeParcelable {
    public static final C9295c CREATOR = new C9295c();

    /* renamed from: a */
    public final int f29339a;

    /* renamed from: b */
    public int f29340b;

    /* renamed from: c */
    public int f29341c;

    /* renamed from: d */
    public int f29342d;

    /* renamed from: e */
    public boolean f29343e;

    /* renamed from: f */
    public boolean f29344f;

    /* renamed from: g */
    public float f29345g;

    public FaceSettingsParcel() {
        this.f29339a = 2;
    }

    public FaceSettingsParcel(int i, int i2, int i3, int i4, boolean z, boolean z2, float f) {
        this.f29339a = i;
        this.f29340b = i2;
        this.f29341c = i3;
        this.f29342d = i4;
        this.f29343e = z;
        this.f29344f = z2;
        this.f29345g = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9295c.m8683a(this, parcel, i);
    }
}
