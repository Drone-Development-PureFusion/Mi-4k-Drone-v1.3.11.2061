package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ValueChangedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ValueChangedDetails> CREATOR = new C5070h();

    /* renamed from: a */
    final int f18173a;

    /* renamed from: b */
    final int f18174b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ValueChangedDetails(int i, int i2) {
        this.f18173a = i;
        this.f18174b = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5070h.m21905a(this, parcel, i);
    }
}
