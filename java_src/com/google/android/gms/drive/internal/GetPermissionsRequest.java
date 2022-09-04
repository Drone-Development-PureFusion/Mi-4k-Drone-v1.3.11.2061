package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class GetPermissionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPermissionsRequest> CREATOR = new C4962l();

    /* renamed from: a */
    final int f17728a;

    /* renamed from: b */
    final DriveId f17729b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetPermissionsRequest(int i, DriveId driveId) {
        this.f17728a = i;
        this.f17729b = driveId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4962l.m22330a(this, parcel, i);
    }
}
