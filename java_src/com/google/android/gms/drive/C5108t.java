package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.drive.t */
/* loaded from: classes2.dex */
public class C5108t implements Parcelable.Creator<DriveId> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21807a(DriveId driveId, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, driveId.f17516d);
        C4630b.m23464a(parcel, 2, driveId.f17517e, false);
        C4630b.m23474a(parcel, 3, driveId.f17518f);
        C4630b.m23474a(parcel, 4, driveId.f17519g);
        C4630b.m23475a(parcel, 5, driveId.f17520h);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DriveId createFromParcel(Parcel parcel) {
        long j = 0;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        int i2 = -1;
        long j2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 5:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new DriveId(i, str, j2, j, i2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DriveId[] newArray(int i) {
        return new DriveId[i];
    }
}
