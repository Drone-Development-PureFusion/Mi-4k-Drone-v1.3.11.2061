package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
/* renamed from: com.google.android.gms.drive.internal.k */
/* loaded from: classes2.dex */
public class C4961k implements Parcelable.Creator<GetMetadataRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22333a(GetMetadataRequest getMetadataRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, getMetadataRequest.f17725a);
        C4630b.m23470a(parcel, 2, (Parcelable) getMetadataRequest.f17726b, i, false);
        C4630b.m23461a(parcel, 3, getMetadataRequest.f17727c);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetMetadataRequest createFromParcel(Parcel parcel) {
        boolean m23505c;
        DriveId driveId;
        int i;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        DriveId driveId2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    boolean z2 = z;
                    driveId = driveId2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23505c = z2;
                    break;
                case 2:
                    DriveId driveId3 = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    i = i2;
                    m23505c = z;
                    driveId = driveId3;
                    break;
                case 3:
                    m23505c = C4628a.m23505c(parcel, m23514a);
                    driveId = driveId2;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23505c = z;
                    driveId = driveId2;
                    i = i2;
                    break;
            }
            i2 = i;
            driveId2 = driveId;
            z = m23505c;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GetMetadataRequest(i2, driveId2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetMetadataRequest[] newArray(int i) {
        return new GetMetadataRequest[i];
    }
}
