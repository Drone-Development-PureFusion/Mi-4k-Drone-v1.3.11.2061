package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class DriveFileRange extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DriveFileRange> CREATOR = new C5051r();

    /* renamed from: a */
    final int f17510a;

    /* renamed from: b */
    final long f17511b;

    /* renamed from: c */
    final long f17512c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DriveFileRange(int i, long j, long j2) {
        this.f17510a = i;
        this.f17511b = j;
        this.f17512c = j2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5051r.m21944a(this, parcel, i);
    }
}
