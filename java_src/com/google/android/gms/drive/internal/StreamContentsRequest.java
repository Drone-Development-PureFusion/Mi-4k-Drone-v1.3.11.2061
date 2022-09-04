package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class StreamContentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreamContentsRequest> CREATOR = new C4865au();

    /* renamed from: a */
    final int f17820a;

    /* renamed from: b */
    final DriveId f17821b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamContentsRequest(int i, DriveId driveId) {
        this.f17820a = i;
        this.f17821b = driveId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4865au.m22541a(this, parcel, i);
    }
}
