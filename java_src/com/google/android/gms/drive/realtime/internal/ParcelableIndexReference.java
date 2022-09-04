package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ParcelableIndexReference extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ParcelableIndexReference> CREATOR = new C5106r();

    /* renamed from: a */
    final int f18125a;

    /* renamed from: b */
    final String f18126b;

    /* renamed from: c */
    final int f18127c;

    /* renamed from: d */
    final boolean f18128d;

    /* renamed from: e */
    final int f18129e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ParcelableIndexReference(int i, String str, int i2, boolean z, int i3) {
        this.f18125a = i;
        this.f18126b = str;
        this.f18127c = i2;
        this.f18128d = z;
        this.f18129e = i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5106r.m21810a(this, parcel, i);
    }
}
