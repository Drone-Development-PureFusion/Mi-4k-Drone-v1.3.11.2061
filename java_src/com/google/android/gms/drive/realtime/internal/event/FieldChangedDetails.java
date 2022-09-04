package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class FieldChangedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FieldChangedDetails> CREATOR = new C5063a();

    /* renamed from: a */
    final int f18133a;

    /* renamed from: b */
    final int f18134b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FieldChangedDetails(int i, int i2) {
        this.f18133a = i;
        this.f18134b = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5063a.m21926a(this, parcel, i);
    }
}
