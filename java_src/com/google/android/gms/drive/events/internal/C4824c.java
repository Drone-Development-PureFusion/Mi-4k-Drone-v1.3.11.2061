package com.google.android.gms.drive.events.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
/* renamed from: com.google.android.gms.drive.events.internal.c */
/* loaded from: classes2.dex */
public class C4824c implements Parcelable.Creator<TransferProgressData> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22643a(TransferProgressData transferProgressData, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, transferProgressData.f17624a);
        C4630b.m23475a(parcel, 2, transferProgressData.f17625b);
        C4630b.m23470a(parcel, 3, (Parcelable) transferProgressData.f17626c, i, false);
        C4630b.m23475a(parcel, 4, transferProgressData.f17627d);
        C4630b.m23474a(parcel, 5, transferProgressData.f17628e);
        C4630b.m23474a(parcel, 6, transferProgressData.f17629f);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TransferProgressData createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        DriveId driveId = null;
        long j2 = 0;
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
                    driveId = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    break;
                case 4:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 6:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new TransferProgressData(i3, i2, driveId, i, j2, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TransferProgressData[] newArray(int i) {
        return new TransferProgressData[i];
    }
}
