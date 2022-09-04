package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ParcelableTransferPreferences extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableTransferPreferences> CREATOR = new C4857am();

    /* renamed from: a */
    final int f17798a;

    /* renamed from: b */
    final int f17799b;

    /* renamed from: c */
    final int f17800c;

    /* renamed from: d */
    final boolean f17801d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ParcelableTransferPreferences(int i, int i2, int i3, boolean z) {
        this.f17798a = i;
        this.f17799b = i2;
        this.f17800c = i3;
        this.f17801d = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4857am.m22562a(this, parcel, i);
    }
}
