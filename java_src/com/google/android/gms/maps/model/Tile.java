package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class Tile extends AbstractSafeParcelable {
    public static final C8607ab CREATOR = new C8607ab();

    /* renamed from: a */
    public final int f27532a;

    /* renamed from: b */
    public final int f27533b;

    /* renamed from: c */
    public final byte[] f27534c;

    /* renamed from: d */
    private final int f27535d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Tile(int i, int i2, int i3, byte[] bArr) {
        this.f27535d = i;
        this.f27532a = i2;
        this.f27533b = i3;
        this.f27534c = bArr;
    }

    public Tile(int i, int i2, byte[] bArr) {
        this(1, i, i2, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11271a() {
        return this.f27535d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8607ab.m11095a(this, parcel, i);
    }
}
