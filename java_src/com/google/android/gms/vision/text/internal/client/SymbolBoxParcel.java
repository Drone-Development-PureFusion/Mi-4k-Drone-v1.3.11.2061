package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class SymbolBoxParcel extends AbstractSafeParcelable {
    public static final C9325f CREATOR = new C9325f();

    /* renamed from: a */
    public final int f29400a;

    public SymbolBoxParcel(int i) {
        this.f29400a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9325f.m8616a(this, parcel, i);
    }
}
