package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
/* renamed from: com.google.android.gms.drive.internal.bi */
/* loaded from: classes2.dex */
public class C4885bi implements Parcelable.Creator<ControlProgressRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22496a(ControlProgressRequest controlProgressRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, controlProgressRequest.f17679a);
        C4630b.m23475a(parcel, 2, controlProgressRequest.f17680b);
        C4630b.m23475a(parcel, 3, controlProgressRequest.f17681c);
        C4630b.m23470a(parcel, 4, (Parcelable) controlProgressRequest.f17682d, i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) controlProgressRequest.f17683e, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ControlProgressRequest createFromParcel(Parcel parcel) {
        ParcelableTransferPreferences parcelableTransferPreferences = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        DriveId driveId = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    driveId = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    break;
                case 5:
                    parcelableTransferPreferences = (ParcelableTransferPreferences) C4628a.m23510a(parcel, m23514a, ParcelableTransferPreferences.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ControlProgressRequest(i3, i2, i, driveId, parcelableTransferPreferences);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ControlProgressRequest[] newArray(int i) {
        return new ControlProgressRequest[i];
    }
}
