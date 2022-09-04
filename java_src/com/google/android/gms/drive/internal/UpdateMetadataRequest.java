package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* loaded from: classes2.dex */
public class UpdateMetadataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UpdateMetadataRequest> CREATOR = new C4870az();

    /* renamed from: a */
    final int f17830a;

    /* renamed from: b */
    final DriveId f17831b;

    /* renamed from: c */
    final MetadataBundle f17832c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UpdateMetadataRequest(int i, DriveId driveId, MetadataBundle metadataBundle) {
        this.f17830a = i;
        this.f17831b = driveId;
        this.f17832c = metadataBundle;
    }

    public UpdateMetadataRequest(DriveId driveId, MetadataBundle metadataBundle) {
        this(1, driveId, metadataBundle);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4870az.m22526a(this, parcel, i);
    }
}
