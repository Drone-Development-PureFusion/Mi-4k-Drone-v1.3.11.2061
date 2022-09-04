package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
/* renamed from: com.google.android.gms.drive.events.c */
/* loaded from: classes2.dex */
public class C4815c implements Parcelable.Creator<ChangeEvent> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22662a(ChangeEvent changeEvent, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, changeEvent.f17573a);
        C4630b.m23470a(parcel, 2, (Parcelable) changeEvent.f17574b, i, false);
        C4630b.m23475a(parcel, 3, changeEvent.f17575c);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ChangeEvent createFromParcel(Parcel parcel) {
        int m23500g;
        DriveId driveId;
        int i;
        int i2 = 0;
        int m23508b = C4628a.m23508b(parcel);
        DriveId driveId2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    int i4 = i2;
                    driveId = driveId2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23500g = i4;
                    break;
                case 2:
                    DriveId driveId3 = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    i = i3;
                    m23500g = i2;
                    driveId = driveId3;
                    break;
                case 3:
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    driveId = driveId2;
                    i = i3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23500g = i2;
                    driveId = driveId2;
                    i = i3;
                    break;
            }
            i3 = i;
            driveId2 = driveId;
            i2 = m23500g;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ChangeEvent(i3, driveId2, i2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ChangeEvent[] newArray(int i) {
        return new ChangeEvent[i];
    }
}
