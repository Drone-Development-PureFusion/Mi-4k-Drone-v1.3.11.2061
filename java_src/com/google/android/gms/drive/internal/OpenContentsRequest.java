package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class OpenContentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OpenContentsRequest> CREATOR = new C4854aj();

    /* renamed from: a */
    final int f17789a;

    /* renamed from: b */
    final DriveId f17790b;

    /* renamed from: c */
    final int f17791c;

    /* renamed from: d */
    final int f17792d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OpenContentsRequest(int i, DriveId driveId, int i2, int i3) {
        this.f17789a = i;
        this.f17790b = driveId;
        this.f17791c = i2;
        this.f17792d = i3;
    }

    public OpenContentsRequest(DriveId driveId, int i, int i2) {
        this(1, driveId, i, i2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4854aj.m22568a(this, parcel, i);
    }
}
