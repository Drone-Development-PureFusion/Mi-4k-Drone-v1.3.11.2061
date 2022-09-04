package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class UntrashResourceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UntrashResourceRequest> CREATOR = new C4869ay();

    /* renamed from: a */
    final int f17828a;

    /* renamed from: b */
    final DriveId f17829b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UntrashResourceRequest(int i, DriveId driveId) {
        this.f17828a = i;
        this.f17829b = driveId;
    }

    public UntrashResourceRequest(DriveId driveId) {
        this(1, driveId);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4869ay.m22529a(this, parcel, i);
    }
}
