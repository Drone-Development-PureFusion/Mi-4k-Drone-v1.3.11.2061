package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* renamed from: com.google.android.gms.drive.internal.bn */
/* loaded from: classes2.dex */
public class C4890bn implements Parcelable.Creator<CreateFolderRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22479a(CreateFolderRequest createFolderRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, createFolderRequest.f17702a);
        C4630b.m23470a(parcel, 2, (Parcelable) createFolderRequest.f17703b, i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) createFolderRequest.f17704c, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CreateFolderRequest createFromParcel(Parcel parcel) {
        MetadataBundle metadataBundle;
        DriveId driveId;
        int i;
        MetadataBundle metadataBundle2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        DriveId driveId2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    MetadataBundle metadataBundle3 = metadataBundle2;
                    driveId = driveId2;
                    i = C4628a.m23500g(parcel, m23514a);
                    metadataBundle = metadataBundle3;
                    break;
                case 2:
                    DriveId driveId3 = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    i = i2;
                    metadataBundle = metadataBundle2;
                    driveId = driveId3;
                    break;
                case 3:
                    metadataBundle = (MetadataBundle) C4628a.m23510a(parcel, m23514a, MetadataBundle.CREATOR);
                    driveId = driveId2;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    metadataBundle = metadataBundle2;
                    driveId = driveId2;
                    i = i2;
                    break;
            }
            i2 = i;
            driveId2 = driveId;
            metadataBundle2 = metadataBundle;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CreateFolderRequest(i2, driveId2, metadataBundle2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CreateFolderRequest[] newArray(int i) {
        return new CreateFolderRequest[i];
    }
}
