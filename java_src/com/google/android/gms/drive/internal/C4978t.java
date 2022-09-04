package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.drive.internal.t */
/* loaded from: classes2.dex */
public class C4978t implements Parcelable.Creator<OnChangesResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22244a(OnChangesResponse onChangesResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, onChangesResponse.f17742a);
        C4630b.m23470a(parcel, 2, (Parcelable) onChangesResponse.f17743b, i, false);
        C4630b.m23447c(parcel, 3, onChangesResponse.f17744c, false);
        C4630b.m23470a(parcel, 4, (Parcelable) onChangesResponse.f17745d, i, false);
        C4630b.m23461a(parcel, 5, onChangesResponse.f17746e);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnChangesResponse createFromParcel(Parcel parcel) {
        boolean z = false;
        ChangeSequenceNumber changeSequenceNumber = null;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList arrayList = null;
        DataHolder dataHolder = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    dataHolder = (DataHolder) C4628a.m23510a(parcel, m23514a, DataHolder.CREATOR);
                    break;
                case 3:
                    arrayList = C4628a.m23504c(parcel, m23514a, DriveId.CREATOR);
                    break;
                case 4:
                    changeSequenceNumber = (ChangeSequenceNumber) C4628a.m23510a(parcel, m23514a, ChangeSequenceNumber.CREATOR);
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
        return new OnChangesResponse(i, dataHolder, arrayList, changeSequenceNumber, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public OnChangesResponse[] newArray(int i) {
        return new OnChangesResponse[i];
    }
}
