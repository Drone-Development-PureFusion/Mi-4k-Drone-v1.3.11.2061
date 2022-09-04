package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
/* renamed from: com.google.android.gms.drive.internal.bb */
/* loaded from: classes2.dex */
public class C4878bb implements Parcelable.Creator<AuthorizeAccessRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22514a(AuthorizeAccessRequest authorizeAccessRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, authorizeAccessRequest.f17654a);
        C4630b.m23474a(parcel, 2, authorizeAccessRequest.f17655b);
        C4630b.m23470a(parcel, 3, (Parcelable) authorizeAccessRequest.f17656c, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AuthorizeAccessRequest createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    driveId = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AuthorizeAccessRequest(i, j, driveId);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AuthorizeAccessRequest[] newArray(int i) {
        return new AuthorizeAccessRequest[i];
    }
}
