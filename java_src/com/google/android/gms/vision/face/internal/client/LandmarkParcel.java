package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final C9302f CREATOR = new C9302f();

    /* renamed from: a */
    public final int f29346a;

    /* renamed from: b */
    public final float f29347b;

    /* renamed from: c */
    public final float f29348c;

    /* renamed from: d */
    public final int f29349d;

    public LandmarkParcel(int i, float f, float f2, int i2) {
        this.f29346a = i;
        this.f29347b = f;
        this.f29348c = f2;
        this.f29349d = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9302f.m8674a(this, parcel, i);
    }
}
