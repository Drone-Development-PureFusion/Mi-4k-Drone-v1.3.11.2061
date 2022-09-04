package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.events.TransferStateOptions;
/* renamed from: com.google.android.gms.drive.internal.a */
/* loaded from: classes2.dex */
public class C4844a implements Parcelable.Creator<AddEventListenerRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22598a(AddEventListenerRequest addEventListenerRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, addEventListenerRequest.f17641a);
        C4630b.m23470a(parcel, 2, (Parcelable) addEventListenerRequest.f17642b, i, false);
        C4630b.m23475a(parcel, 3, addEventListenerRequest.f17643c);
        C4630b.m23470a(parcel, 4, (Parcelable) addEventListenerRequest.f17644d, i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) addEventListenerRequest.f17645e, i, false);
        C4630b.m23470a(parcel, 6, (Parcelable) addEventListenerRequest.f17646f, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AddEventListenerRequest createFromParcel(Parcel parcel) {
        int i = 0;
        TransferProgressOptions transferProgressOptions = null;
        int m23508b = C4628a.m23508b(parcel);
        TransferStateOptions transferStateOptions = null;
        ChangesAvailableOptions changesAvailableOptions = null;
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
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    changesAvailableOptions = (ChangesAvailableOptions) C4628a.m23510a(parcel, m23514a, ChangesAvailableOptions.CREATOR);
                    break;
                case 5:
                    transferStateOptions = (TransferStateOptions) C4628a.m23510a(parcel, m23514a, TransferStateOptions.CREATOR);
                    break;
                case 6:
                    transferProgressOptions = (TransferProgressOptions) C4628a.m23510a(parcel, m23514a, TransferProgressOptions.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AddEventListenerRequest(i2, driveId, i, changesAvailableOptions, transferStateOptions, transferProgressOptions);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AddEventListenerRequest[] newArray(int i) {
        return new AddEventListenerRequest[i];
    }
}
