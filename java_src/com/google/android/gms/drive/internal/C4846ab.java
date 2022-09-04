package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;
/* renamed from: com.google.android.gms.drive.internal.ab */
/* loaded from: classes2.dex */
public class C4846ab implements Parcelable.Creator<AddPermissionRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22592a(AddPermissionRequest addPermissionRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, addPermissionRequest.f17647a);
        C4630b.m23470a(parcel, 2, (Parcelable) addPermissionRequest.f17648b, i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) addPermissionRequest.f17649c, i, false);
        C4630b.m23461a(parcel, 4, addPermissionRequest.f17650d);
        C4630b.m23464a(parcel, 5, addPermissionRequest.f17651e, false);
        C4630b.m23461a(parcel, 6, addPermissionRequest.f17652f);
        C4630b.m23464a(parcel, 7, addPermissionRequest.f17653g, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AddPermissionRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        String str2 = null;
        boolean z2 = false;
        Permission permission = null;
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
                    permission = (Permission) C4628a.m23510a(parcel, m23514a, Permission.CREATOR);
                    break;
                case 4:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
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
        return new AddPermissionRequest(i, driveId, permission, z2, str2, z, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AddPermissionRequest[] newArray(int i) {
        return new AddPermissionRequest[i];
    }
}
