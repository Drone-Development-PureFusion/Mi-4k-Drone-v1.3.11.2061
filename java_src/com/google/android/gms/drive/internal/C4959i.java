package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveSpace;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.drive.internal.i */
/* loaded from: classes2.dex */
public class C4959i implements Parcelable.Creator<GetChangesRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22339a(GetChangesRequest getChangesRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, getChangesRequest.f17716a);
        C4630b.m23470a(parcel, 2, (Parcelable) getChangesRequest.f17717b, i, false);
        C4630b.m23475a(parcel, 3, getChangesRequest.f17718c);
        C4630b.m23447c(parcel, 4, getChangesRequest.f17719d, false);
        C4630b.m23461a(parcel, 5, getChangesRequest.f17720e);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetChangesRequest createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ChangeSequenceNumber changeSequenceNumber = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    changeSequenceNumber = (ChangeSequenceNumber) C4628a.m23510a(parcel, m23514a, ChangeSequenceNumber.CREATOR);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    arrayList = C4628a.m23504c(parcel, m23514a, DriveSpace.CREATOR);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GetChangesRequest(i2, changeSequenceNumber, i, arrayList, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetChangesRequest[] newArray(int i) {
        return new GetChangesRequest[i];
    }
}
