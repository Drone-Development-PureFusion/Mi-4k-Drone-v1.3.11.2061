package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* renamed from: com.google.android.gms.drive.internal.bl */
/* loaded from: classes2.dex */
public class C4888bl implements Parcelable.Creator<CreateFileIntentSenderRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22485a(CreateFileIntentSenderRequest createFileIntentSenderRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, createFileIntentSenderRequest.f17686a);
        C4630b.m23470a(parcel, 2, (Parcelable) createFileIntentSenderRequest.f17687b, i, false);
        C4630b.m23475a(parcel, 3, createFileIntentSenderRequest.f17688c);
        C4630b.m23464a(parcel, 4, createFileIntentSenderRequest.f17689d, false);
        C4630b.m23470a(parcel, 5, (Parcelable) createFileIntentSenderRequest.f17690e, i, false);
        C4630b.m23466a(parcel, 6, createFileIntentSenderRequest.f17691f, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CreateFileIntentSenderRequest createFromParcel(Parcel parcel) {
        int i = 0;
        Integer num = null;
        int m23508b = C4628a.m23508b(parcel);
        DriveId driveId = null;
        String str = null;
        MetadataBundle metadataBundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    metadataBundle = (MetadataBundle) C4628a.m23510a(parcel, m23514a, MetadataBundle.CREATOR);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    driveId = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    break;
                case 6:
                    num = C4628a.m23499h(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CreateFileIntentSenderRequest(i2, metadataBundle, i, str, driveId, num);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CreateFileIntentSenderRequest[] newArray(int i) {
        return new CreateFileIntentSenderRequest[i];
    }
}
