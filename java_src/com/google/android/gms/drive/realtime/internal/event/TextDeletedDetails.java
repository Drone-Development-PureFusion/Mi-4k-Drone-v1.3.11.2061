package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class TextDeletedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TextDeletedDetails> CREATOR = new C5068f();

    /* renamed from: a */
    final int f18167a;

    /* renamed from: b */
    final int f18168b;

    /* renamed from: c */
    final int f18169c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextDeletedDetails(int i, int i2, int i3) {
        this.f18167a = i;
        this.f18168b = i2;
        this.f18169c = i3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5068f.m21911a(this, parcel, i);
    }
}
