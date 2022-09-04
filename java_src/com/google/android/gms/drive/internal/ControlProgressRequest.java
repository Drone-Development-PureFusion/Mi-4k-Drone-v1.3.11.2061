package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class ControlProgressRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ControlProgressRequest> CREATOR = new C4885bi();

    /* renamed from: a */
    final int f17679a;

    /* renamed from: b */
    final int f17680b;

    /* renamed from: c */
    final int f17681c;

    /* renamed from: d */
    final DriveId f17682d;

    /* renamed from: e */
    final ParcelableTransferPreferences f17683e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ControlProgressRequest(int i, int i2, int i3, DriveId driveId, ParcelableTransferPreferences parcelableTransferPreferences) {
        this.f17679a = i;
        this.f17680b = i2;
        this.f17681c = i3;
        this.f17682d = driveId;
        this.f17683e = parcelableTransferPreferences;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4885bi.m22496a(this, parcel, i);
    }
}
