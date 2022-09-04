package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressOptions;
/* renamed from: com.google.android.gms.drive.internal.ao */
/* loaded from: classes2.dex */
public class C4859ao implements Parcelable.Creator<RemoveEventListenerRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22556a(RemoveEventListenerRequest removeEventListenerRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, removeEventListenerRequest.f17804a);
        C4630b.m23470a(parcel, 2, (Parcelable) removeEventListenerRequest.f17805b, i, false);
        C4630b.m23475a(parcel, 3, removeEventListenerRequest.f17806c);
        C4630b.m23470a(parcel, 4, (Parcelable) removeEventListenerRequest.f17807d, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RemoveEventListenerRequest createFromParcel(Parcel parcel) {
        TransferProgressOptions transferProgressOptions;
        int i;
        DriveId driveId;
        int i2;
        TransferProgressOptions transferProgressOptions2 = null;
        int i3 = 0;
        int m23508b = C4628a.m23508b(parcel);
        DriveId driveId2 = null;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    TransferProgressOptions transferProgressOptions3 = transferProgressOptions2;
                    i = i3;
                    driveId = driveId2;
                    i2 = C4628a.m23500g(parcel, m23514a);
                    transferProgressOptions = transferProgressOptions3;
                    break;
                case 2:
                    i2 = i4;
                    int i5 = i3;
                    driveId = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    transferProgressOptions = transferProgressOptions2;
                    i = i5;
                    break;
                case 3:
                    driveId = driveId2;
                    i2 = i4;
                    TransferProgressOptions transferProgressOptions4 = transferProgressOptions2;
                    i = C4628a.m23500g(parcel, m23514a);
                    transferProgressOptions = transferProgressOptions4;
                    break;
                case 4:
                    transferProgressOptions = (TransferProgressOptions) C4628a.m23510a(parcel, m23514a, TransferProgressOptions.CREATOR);
                    i = i3;
                    driveId = driveId2;
                    i2 = i4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    transferProgressOptions = transferProgressOptions2;
                    i = i3;
                    driveId = driveId2;
                    i2 = i4;
                    break;
            }
            i4 = i2;
            driveId2 = driveId;
            i3 = i;
            transferProgressOptions2 = transferProgressOptions;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new RemoveEventListenerRequest(i4, driveId2, i3, transferProgressOptions2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RemoveEventListenerRequest[] newArray(int i) {
        return new RemoveEventListenerRequest[i];
    }
}
