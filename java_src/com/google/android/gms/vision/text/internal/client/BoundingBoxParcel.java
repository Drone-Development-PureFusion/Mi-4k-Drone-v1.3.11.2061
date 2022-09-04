package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class BoundingBoxParcel extends AbstractSafeParcelable {
    public static final C9316a CREATOR = new C9316a();

    /* renamed from: a */
    public final int f29380a;

    /* renamed from: b */
    public final int f29381b;

    /* renamed from: c */
    public final int f29382c;

    /* renamed from: d */
    public final int f29383d;

    /* renamed from: e */
    public final int f29384e;

    /* renamed from: f */
    public final float f29385f;

    public BoundingBoxParcel(int i, int i2, int i3, int i4, int i5, float f) {
        this.f29380a = i;
        this.f29381b = i2;
        this.f29382c = i3;
        this.f29383d = i4;
        this.f29384e = i5;
        this.f29385f = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9316a.m8631a(this, parcel, i);
    }
}
