package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class DeleteResourceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeleteResourceRequest> CREATOR = new C4892bp();

    /* renamed from: a */
    final int f17705a;

    /* renamed from: b */
    final DriveId f17706b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeleteResourceRequest(int i, DriveId driveId) {
        this.f17705a = i;
        this.f17706b = driveId;
    }

    public DeleteResourceRequest(DriveId driveId) {
        this(1, driveId);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4892bp.m22475a(this, parcel, i);
    }
}
