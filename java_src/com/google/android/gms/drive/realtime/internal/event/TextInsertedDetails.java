package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class TextInsertedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TextInsertedDetails> CREATOR = new C5069g();

    /* renamed from: a */
    final int f18170a;

    /* renamed from: b */
    final int f18171b;

    /* renamed from: c */
    final int f18172c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextInsertedDetails(int i, int i2, int i3) {
        this.f18170a = i;
        this.f18171b = i2;
        this.f18172c = i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5069g.m21908a(this, parcel, i);
    }
}
