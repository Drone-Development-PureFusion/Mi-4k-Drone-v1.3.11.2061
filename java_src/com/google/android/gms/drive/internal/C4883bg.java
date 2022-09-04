package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* renamed from: com.google.android.gms.drive.internal.bg */
/* loaded from: classes2.dex */
public class C4883bg implements Parcelable.Creator<CloseContentsAndUpdateMetadataRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22502a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, closeContentsAndUpdateMetadataRequest.f17665a);
        C4630b.m23470a(parcel, 2, (Parcelable) closeContentsAndUpdateMetadataRequest.f17666b, i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) closeContentsAndUpdateMetadataRequest.f17667c, i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) closeContentsAndUpdateMetadataRequest.f17668d, i, false);
        C4630b.m23461a(parcel, 5, closeContentsAndUpdateMetadataRequest.f17669e);
        C4630b.m23464a(parcel, 6, closeContentsAndUpdateMetadataRequest.f17670f, false);
        C4630b.m23475a(parcel, 7, closeContentsAndUpdateMetadataRequest.f17671g);
        C4630b.m23475a(parcel, 8, closeContentsAndUpdateMetadataRequest.f17672h);
        C4630b.m23461a(parcel, 9, closeContentsAndUpdateMetadataRequest.f17673i);
        C4630b.m23461a(parcel, 10, closeContentsAndUpdateMetadataRequest.f17674j);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CloseContentsAndUpdateMetadataRequest createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        boolean z2 = true;
        int i = 0;
        int i2 = 0;
        boolean z3 = false;
        Contents contents = null;
        MetadataBundle metadataBundle = null;
        DriveId driveId = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    driveId = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    break;
                case 3:
                    metadataBundle = (MetadataBundle) C4628a.m23510a(parcel, m23514a, MetadataBundle.CREATOR);
                    break;
                case 4:
                    contents = (Contents) C4628a.m23510a(parcel, m23514a, Contents.CREATOR);
                    break;
                case 5:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 9:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 10:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CloseContentsAndUpdateMetadataRequest(i3, driveId, metadataBundle, contents, z3, str, i2, i, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CloseContentsAndUpdateMetadataRequest[] newArray(int i) {
        return new CloseContentsAndUpdateMetadataRequest[i];
    }
}
