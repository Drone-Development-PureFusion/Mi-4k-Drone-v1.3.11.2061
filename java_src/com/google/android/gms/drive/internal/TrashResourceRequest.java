package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class TrashResourceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TrashResourceRequest> CREATOR = new C4867aw();

    /* renamed from: a */
    final int f17824a;

    /* renamed from: b */
    final DriveId f17825b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TrashResourceRequest(int i, DriveId driveId) {
        this.f17824a = i;
        this.f17825b = driveId;
    }

    public TrashResourceRequest(DriveId driveId) {
        this(1, driveId);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4867aw.m22535a(this, parcel, i);
    }
}
