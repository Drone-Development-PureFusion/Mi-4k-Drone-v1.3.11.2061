package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* loaded from: classes2.dex */
public class CreateFolderRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateFolderRequest> CREATOR = new C4890bn();

    /* renamed from: a */
    final int f17702a;

    /* renamed from: b */
    final DriveId f17703b;

    /* renamed from: c */
    final MetadataBundle f17704c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CreateFolderRequest(int i, DriveId driveId, MetadataBundle metadataBundle) {
        this.f17702a = i;
        this.f17703b = (DriveId) C4588d.m23627a(driveId);
        this.f17704c = (MetadataBundle) C4588d.m23627a(metadataBundle);
    }

    public CreateFolderRequest(DriveId driveId, MetadataBundle metadataBundle) {
        this(1, driveId, metadataBundle);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4890bn.m22479a(this, parcel, i);
    }
}
