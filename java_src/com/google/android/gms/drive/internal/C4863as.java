package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.drive.internal.as */
/* loaded from: classes2.dex */
public class C4863as implements Parcelable.Creator<SetResourceParentsRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22544a(SetResourceParentsRequest setResourceParentsRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, setResourceParentsRequest.f17817a);
        C4630b.m23470a(parcel, 2, (Parcelable) setResourceParentsRequest.f17818b, i, false);
        C4630b.m23447c(parcel, 3, setResourceParentsRequest.f17819c, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SetResourceParentsRequest createFromParcel(Parcel parcel) {
        ArrayList m23504c;
        DriveId driveId;
        int i;
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        DriveId driveId2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    ArrayList arrayList2 = arrayList;
                    driveId = driveId2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23504c = arrayList2;
                    break;
                case 2:
                    DriveId driveId3 = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    i = i2;
                    m23504c = arrayList;
                    driveId = driveId3;
                    break;
                case 3:
                    m23504c = C4628a.m23504c(parcel, m23514a, DriveId.CREATOR);
                    driveId = driveId2;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23504c = arrayList;
                    driveId = driveId2;
                    i = i2;
                    break;
            }
            i2 = i;
            driveId2 = driveId;
            arrayList = m23504c;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SetResourceParentsRequest(i2, driveId2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SetResourceParentsRequest[] newArray(int i) {
        return new SetResourceParentsRequest[i];
    }
}
