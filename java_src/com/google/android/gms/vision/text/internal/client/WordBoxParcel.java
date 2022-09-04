package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class WordBoxParcel extends AbstractSafeParcelable {
    public static final C9328i CREATOR = new C9328i();

    /* renamed from: a */
    public final int f29402a;

    /* renamed from: b */
    public final SymbolBoxParcel[] f29403b;

    /* renamed from: c */
    public final BoundingBoxParcel f29404c;

    /* renamed from: d */
    public final BoundingBoxParcel f29405d;

    /* renamed from: e */
    public final String f29406e;

    /* renamed from: f */
    public final float f29407f;

    /* renamed from: g */
    public final String f29408g;

    /* renamed from: h */
    public final boolean f29409h;

    public WordBoxParcel(int i, SymbolBoxParcel[] symbolBoxParcelArr, BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2, String str, float f, String str2, boolean z) {
        this.f29402a = i;
        this.f29403b = symbolBoxParcelArr;
        this.f29404c = boundingBoxParcel;
        this.f29405d = boundingBoxParcel2;
        this.f29406e = str;
        this.f29407f = f;
        this.f29408g = str2;
        this.f29409h = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9328i.m8606a(this, parcel, i);
    }
}
