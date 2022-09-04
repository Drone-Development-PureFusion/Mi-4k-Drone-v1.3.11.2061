package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ValuesRemovedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ValuesRemovedDetails> CREATOR = new C5072j();

    /* renamed from: a */
    final int f18181a;

    /* renamed from: b */
    final int f18182b;

    /* renamed from: c */
    final int f18183c;

    /* renamed from: d */
    final int f18184d;

    /* renamed from: e */
    final String f18185e;

    /* renamed from: f */
    final int f18186f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ValuesRemovedDetails(int i, int i2, int i3, int i4, String str, int i5) {
        this.f18181a = i;
        this.f18182b = i2;
        this.f18183c = i3;
        this.f18184d = i4;
        this.f18185e = str;
        this.f18186f = i5;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5072j.m21899a(this, parcel, i);
    }
}
