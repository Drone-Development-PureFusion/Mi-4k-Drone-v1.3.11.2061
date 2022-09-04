package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ReferenceShiftedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ReferenceShiftedDetails> CREATOR = new C5067e();

    /* renamed from: a */
    final int f18162a;

    /* renamed from: b */
    final String f18163b;

    /* renamed from: c */
    final String f18164c;

    /* renamed from: d */
    final int f18165d;

    /* renamed from: e */
    final int f18166e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReferenceShiftedDetails(int i, String str, String str2, int i2, int i3) {
        this.f18162a = i;
        this.f18163b = str;
        this.f18164c = str2;
        this.f18165d = i2;
        this.f18166e = i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5067e.m21914a(this, parcel, i);
    }
}
