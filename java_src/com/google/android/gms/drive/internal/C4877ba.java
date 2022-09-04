package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
/* renamed from: com.google.android.gms.drive.internal.ba */
/* loaded from: classes2.dex */
public class C4877ba implements Parcelable.Creator<UpdatePermissionRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22517a(UpdatePermissionRequest updatePermissionRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, updatePermissionRequest.f17833a);
        C4630b.m23470a(parcel, 2, (Parcelable) updatePermissionRequest.f17834b, i, false);
        C4630b.m23464a(parcel, 3, updatePermissionRequest.f17835c, false);
        C4630b.m23475a(parcel, 4, updatePermissionRequest.f17836d);
        C4630b.m23461a(parcel, 5, updatePermissionRequest.f17837e);
        C4630b.m23464a(parcel, 6, updatePermissionRequest.f17838f, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UpdatePermissionRequest createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str2 = null;
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    driveId = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    break;
                case 3:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
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
        return new UpdatePermissionRequest(i2, driveId, str2, i, z, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UpdatePermissionRequest[] newArray(int i) {
        return new UpdatePermissionRequest[i];
    }
}
