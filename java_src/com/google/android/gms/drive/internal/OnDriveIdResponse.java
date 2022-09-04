package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class OnDriveIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnDriveIdResponse> CREATOR = new C4982x();

    /* renamed from: a */
    final int f17758a;

    /* renamed from: b */
    DriveId f17759b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnDriveIdResponse(int i, DriveId driveId) {
        this.f17758a = i;
        this.f17759b = driveId;
    }

    /* renamed from: a */
    public DriveId m22611a() {
        return this.f17759b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4982x.m22232a(this, parcel, i);
    }
}
