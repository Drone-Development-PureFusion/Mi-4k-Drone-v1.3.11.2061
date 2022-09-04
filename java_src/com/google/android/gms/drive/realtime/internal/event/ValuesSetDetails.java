package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ValuesSetDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ValuesSetDetails> CREATOR = new C5073k();

    /* renamed from: a */
    final int f18187a;

    /* renamed from: b */
    final int f18188b;

    /* renamed from: c */
    final int f18189c;

    /* renamed from: d */
    final int f18190d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ValuesSetDetails(int i, int i2, int i3, int i4) {
        this.f18187a = i;
        this.f18188b = i2;
        this.f18189c = i3;
        this.f18190d = i4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5073k.m21896a(this, parcel, i);
    }
}
