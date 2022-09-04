package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.drive.internal.be */
/* loaded from: classes2.dex */
public class C4881be implements Parcelable.Creator<ChangeResourceParentsRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22508a(ChangeResourceParentsRequest changeResourceParentsRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, changeResourceParentsRequest.f17659a);
        C4630b.m23470a(parcel, 2, (Parcelable) changeResourceParentsRequest.f17660b, i, false);
        C4630b.m23447c(parcel, 3, changeResourceParentsRequest.f17661c, false);
        C4630b.m23447c(parcel, 4, changeResourceParentsRequest.f17662d, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ChangeResourceParentsRequest createFromParcel(Parcel parcel) {
        ArrayList m23504c;
        ArrayList arrayList;
        DriveId driveId;
        int i;
        ArrayList arrayList2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        ArrayList arrayList3 = null;
        DriveId driveId2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    ArrayList arrayList4 = arrayList2;
                    arrayList = arrayList3;
                    driveId = driveId2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23504c = arrayList4;
                    break;
                case 2:
                    i = i2;
                    ArrayList arrayList5 = arrayList3;
                    driveId = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    m23504c = arrayList2;
                    arrayList = arrayList5;
                    break;
                case 3:
                    driveId = driveId2;
                    i = i2;
                    ArrayList arrayList6 = arrayList2;
                    arrayList = C4628a.m23504c(parcel, m23514a, DriveId.CREATOR);
                    m23504c = arrayList6;
                    break;
                case 4:
                    m23504c = C4628a.m23504c(parcel, m23514a, DriveId.CREATOR);
                    arrayList = arrayList3;
                    driveId = driveId2;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23504c = arrayList2;
                    arrayList = arrayList3;
                    driveId = driveId2;
                    i = i2;
                    break;
            }
            i2 = i;
            driveId2 = driveId;
            arrayList3 = arrayList;
            arrayList2 = m23504c;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ChangeResourceParentsRequest(i2, driveId2, arrayList3, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ChangeResourceParentsRequest[] newArray(int i) {
        return new ChangeResourceParentsRequest[i];
    }
}
