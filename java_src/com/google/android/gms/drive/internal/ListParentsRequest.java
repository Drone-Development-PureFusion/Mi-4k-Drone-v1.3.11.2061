package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class ListParentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ListParentsRequest> CREATOR = new C4976r();

    /* renamed from: a */
    final int f17733a;

    /* renamed from: b */
    final DriveId f17734b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListParentsRequest(int i, DriveId driveId) {
        this.f17733a = i;
        this.f17734b = driveId;
    }

    public ListParentsRequest(DriveId driveId) {
        this(1, driveId);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4976r.m22250a(this, parcel, i);
    }
}
