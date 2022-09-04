package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.drive.internal.s */
/* loaded from: classes2.dex */
public class C4977s implements Parcelable.Creator<LoadRealtimeRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22247a(LoadRealtimeRequest loadRealtimeRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, loadRealtimeRequest.f17735a);
        C4630b.m23470a(parcel, 2, (Parcelable) loadRealtimeRequest.f17736b, i, false);
        C4630b.m23461a(parcel, 3, loadRealtimeRequest.f17737c);
        C4630b.m23449b(parcel, 4, loadRealtimeRequest.f17738d, false);
        C4630b.m23461a(parcel, 5, loadRealtimeRequest.f17739e);
        C4630b.m23470a(parcel, 6, (Parcelable) loadRealtimeRequest.f17740f, i, false);
        C4630b.m23464a(parcel, 7, loadRealtimeRequest.f17741g, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LoadRealtimeRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        DataHolder dataHolder = null;
        ArrayList<String> arrayList = null;
        boolean z2 = false;
        DriveId driveId = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    driveId = (DriveId) C4628a.m23510a(parcel, m23514a, DriveId.CREATOR);
                    break;
                case 3:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    dataHolder = (DataHolder) C4628a.m23510a(parcel, m23514a, DataHolder.CREATOR);
                    break;
                case 7:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new LoadRealtimeRequest(i, driveId, z2, arrayList, z, dataHolder, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public LoadRealtimeRequest[] newArray(int i) {
        return new LoadRealtimeRequest[i];
    }
}
