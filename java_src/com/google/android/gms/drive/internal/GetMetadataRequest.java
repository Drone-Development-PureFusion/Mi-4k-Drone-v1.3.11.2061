package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
/* loaded from: classes2.dex */
public class GetMetadataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetMetadataRequest> CREATOR = new C4961k();

    /* renamed from: a */
    final int f17725a;

    /* renamed from: b */
    final DriveId f17726b;

    /* renamed from: c */
    final boolean f17727c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetMetadataRequest(int i, DriveId driveId, boolean z) {
        this.f17725a = i;
        this.f17726b = driveId;
        this.f17727c = z;
    }

    public GetMetadataRequest(DriveId driveId, boolean z) {
        this(1, driveId, z);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4961k.m22333a(this, parcel, i);
    }
}
