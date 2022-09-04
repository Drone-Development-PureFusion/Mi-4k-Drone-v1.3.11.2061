package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class LineBoxParcel extends AbstractSafeParcelable {
    public static final C9323d CREATOR = new C9323d();

    /* renamed from: a */
    public final int f29386a;

    /* renamed from: b */
    public final WordBoxParcel[] f29387b;

    /* renamed from: c */
    public final BoundingBoxParcel f29388c;

    /* renamed from: d */
    public final BoundingBoxParcel f29389d;

    /* renamed from: e */
    public final BoundingBoxParcel f29390e;

    /* renamed from: f */
    public final String f29391f;

    /* renamed from: g */
    public final float f29392g;

    /* renamed from: h */
    public final String f29393h;

    /* renamed from: i */
    public final int f29394i;

    /* renamed from: j */
    public final boolean f29395j;

    /* renamed from: k */
    public final int f29396k;

    /* renamed from: l */
    public final int f29397l;

    public LineBoxParcel(int i, WordBoxParcel[] wordBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, BoundingBoxParcel boundingBoxParcel3, String str, float f, String str2, int i2, boolean z, int i3, int i4) {
        this.f29386a = i;
        this.f29387b = wordBoxParcelArr;
        this.f29388c = boundingBoxParcel;
        this.f29389d = boundingBoxParcel2;
        this.f29390e = boundingBoxParcel3;
        this.f29391f = str;
        this.f29392g = f;
        this.f29393h = str2;
        this.f29394i = i2;
        this.f29395j = z;
        this.f29396k = i3;
        this.f29397l = i4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9323d.m8622a(this, parcel, i);
    }
}
