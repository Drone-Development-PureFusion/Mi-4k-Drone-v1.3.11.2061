package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* renamed from: com.google.android.gms.drive.internal.bm */
/* loaded from: classes2.dex */
public class C4889bm implements Parcelable.Creator<CreateFileRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22482a(CreateFileRequest createFileRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, createFileRequest.f17692a);
        C4630b.m23470a(parcel, 2, (Parcelable) createFileRequest.f17693b, i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) createFileRequest.f17694c, i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) createFileRequest.f17695d, i, false);
        C4630b.m23466a(parcel, 5, createFileRequest.f17696e, false);
        C4630b.m23461a(parcel, 6, createFileRequest.f17697f);
        C4630b.m23464a(parcel, 7, createFileRequest.f17698g, false);
        C4630b.m23475a(parcel, 8, createFileRequest.f17699h);
        C4630b.m23475a(parcel, 9, createFileRequest.f17700i);
        C4630b.m23464a(parcel, 10, createFileRequest.f17701j, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CreateFileRequest createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        String str2 = null;
        boolean z = false;
        Integer num = null;
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
                    num = C4628a.m23499h(parcel, m23514a);
                    break;
                case 6:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 9:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 10:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CreateFileRequest(i3, driveId, metadataBundle, contents, num, z, str2, i2, i, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CreateFileRequest[] newArray(int i) {
        return new CreateFileRequest[i];
    }
}
