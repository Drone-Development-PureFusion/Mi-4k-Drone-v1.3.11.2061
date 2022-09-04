package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;
/* renamed from: com.google.android.gms.drive.internal.al */
/* loaded from: classes2.dex */
public class C4856al implements Parcelable.Creator<OpenFileIntentSenderRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22565a(OpenFileIntentSenderRequest openFileIntentSenderRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, openFileIntentSenderRequest.f17793a);
        C4630b.m23464a(parcel, 2, openFileIntentSenderRequest.f17794b, false);
        C4630b.m23455a(parcel, 3, openFileIntentSenderRequest.f17795c, false);
        C4630b.m23470a(parcel, 4, (Parcelable) openFileIntentSenderRequest.f17796d, i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) openFileIntentSenderRequest.f17797e, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OpenFileIntentSenderRequest createFromParcel(Parcel parcel) {
        FilterHolder filterHolder = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        DriveId driveId = null;
        String[] strArr = null;
        String str = null;
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
                    strArr = C4628a.m23520C(parcel, m23514a);
                    break;
                case 4:
                    driveId = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    break;
                case 5:
                    filterHolder = (FilterHolder) C4628a.m23510a(parcel, m23514a, FilterHolder.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new OpenFileIntentSenderRequest(i, str, strArr, driveId, filterHolder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OpenFileIntentSenderRequest[] newArray(int i) {
        return new OpenFileIntentSenderRequest[i];
    }
}
