package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class FaceParcel extends AbstractSafeParcelable {
    public static final C9294b CREATOR = new C9294b();

    /* renamed from: a */
    public final int f29327a;

    /* renamed from: b */
    public final int f29328b;

    /* renamed from: c */
    public final float f29329c;

    /* renamed from: d */
    public final float f29330d;

    /* renamed from: e */
    public final float f29331e;

    /* renamed from: f */
    public final float f29332f;

    /* renamed from: g */
    public final float f29333g;

    /* renamed from: h */
    public final float f29334h;

    /* renamed from: i */
    public final LandmarkParcel[] f29335i;

    /* renamed from: j */
    public final float f29336j;

    /* renamed from: k */
    public final float f29337k;

    /* renamed from: l */
    public final float f29338l;

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, LandmarkParcel[] landmarkParcelArr, float f7, float f8, float f9) {
        this.f29327a = i;
        this.f29328b = i2;
        this.f29329c = f;
        this.f29330d = f2;
        this.f29331e = f3;
        this.f29332f = f4;
        this.f29333g = f5;
        this.f29334h = f6;
        this.f29335i = landmarkParcelArr;
        this.f29336j = f7;
        this.f29337k = f8;
        this.f29338l = f9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9294b.m8686a(this, parcel, i);
    }
}
