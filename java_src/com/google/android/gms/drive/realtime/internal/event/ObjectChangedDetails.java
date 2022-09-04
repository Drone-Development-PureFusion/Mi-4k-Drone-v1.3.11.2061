package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ObjectChangedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ObjectChangedDetails> CREATOR = new C5064b();

    /* renamed from: a */
    final int f18135a;

    /* renamed from: b */
    final int f18136b;

    /* renamed from: c */
    final int f18137c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObjectChangedDetails(int i, int i2, int i3) {
        this.f18135a = i;
        this.f18136b = i2;
        this.f18137c = i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5064b.m21923a(this, parcel, i);
    }
}
