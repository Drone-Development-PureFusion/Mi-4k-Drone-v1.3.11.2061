package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HarmfulAppsData> CREATOR = new C8997f();

    /* renamed from: a */
    public final int f28609a;

    /* renamed from: b */
    public final String f28610b;

    /* renamed from: c */
    public final byte[] f28611c;

    /* renamed from: d */
    public final int f28612d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HarmfulAppsData(int i, String str, byte[] bArr, int i2) {
        this.f28609a = i;
        this.f28610b = str;
        this.f28611c = bArr;
        this.f28612d = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8997f.m9419a(this, parcel, i);
    }
}
