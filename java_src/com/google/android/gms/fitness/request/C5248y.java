package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
/* renamed from: com.google.android.gms.fitness.request.y */
/* loaded from: classes2.dex */
public class C5248y implements Parcelable.Creator<DataUpdateListenerRegistrationRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20971a(DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) dataUpdateListenerRegistrationRequest.m21278a(), i, false);
        C4630b.m23470a(parcel, 2, (Parcelable) dataUpdateListenerRegistrationRequest.m21276b(), i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) dataUpdateListenerRegistrationRequest.m21275c(), i, false);
        C4630b.m23472a(parcel, 4, dataUpdateListenerRegistrationRequest.m21274d(), false);
        C4630b.m23475a(parcel, 1000, dataUpdateListenerRegistrationRequest.m21273e());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataUpdateListenerRegistrationRequest createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        DataType dataType = null;
        DataSource dataSource = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    dataSource = (DataSource) C4628a.m23510a(parcel, m23514a, DataSource.CREATOR);
                    break;
                case 2:
                    dataType = (DataType) C4628a.m23510a(parcel, m23514a, DataType.CREATOR);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) C4628a.m23510a(parcel, m23514a, PendingIntent.CREATOR);
                    break;
                case 4:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 1000:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new DataUpdateListenerRegistrationRequest(i, dataSource, dataType, pendingIntent, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataUpdateListenerRegistrationRequest[] newArray(int i) {
        return new DataUpdateListenerRegistrationRequest[i];
    }
}
