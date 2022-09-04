package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
/* renamed from: com.google.android.gms.drive.internal.ap */
/* loaded from: classes2.dex */
public class C4860ap implements Parcelable.Creator<RemovePermissionRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22553a(RemovePermissionRequest removePermissionRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, removePermissionRequest.f17808a);
        C4630b.m23470a(parcel, 2, (Parcelable) removePermissionRequest.f17809b, i, false);
        C4630b.m23464a(parcel, 3, removePermissionRequest.f17810c, false);
        C4630b.m23461a(parcel, 4, removePermissionRequest.f17811d);
        C4630b.m23464a(parcel, 5, removePermissionRequest.f17812e, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RemovePermissionRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        DriveId driveId = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    driveId = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
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
        return new RemovePermissionRequest(i, driveId, str2, z, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RemovePermissionRequest[] newArray(int i) {
        return new RemovePermissionRequest[i];
    }
}
