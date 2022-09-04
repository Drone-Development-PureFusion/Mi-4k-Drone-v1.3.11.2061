package com.google.android.gms.vision.barcode.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class BarcodeDetectorOptions extends AbstractSafeParcelable {
    public static final C9260a CREATOR = new C9260a();

    /* renamed from: a */
    final int f29250a;

    /* renamed from: b */
    public int f29251b;

    public BarcodeDetectorOptions() {
        this.f29250a = 1;
    }

    public BarcodeDetectorOptions(int i, int i2) {
        this.f29250a = i;
        this.f29251b = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9260a c9260a = CREATOR;
        C9260a.m8791a(this, parcel, i);
    }
}
