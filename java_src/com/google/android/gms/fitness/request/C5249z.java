package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.fitness.request.z */
/* loaded from: classes2.dex */
public class C5249z implements Parcelable.Creator<DataUpdateListenerUnregistrationRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20968a(DataUpdateListenerUnregistrationRequest dataUpdateListenerUnregistrationRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) dataUpdateListenerUnregistrationRequest.m21265a(), i, false);
        C4630b.m23472a(parcel, 2, dataUpdateListenerUnregistrationRequest.m21263b(), false);
        C4630b.m23475a(parcel, 1000, dataUpdateListenerUnregistrationRequest.m21262c());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataUpdateListenerUnregistrationRequest createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent;
        int m23500g;
        IBinder iBinder;
        IBinder iBinder2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        PendingIntent pendingIntent2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    PendingIntent pendingIntent3 = (PendingIntent) C4628a.m23510a(parcel, m23514a, PendingIntent.CREATOR);
                    m23500g = i;
                    iBinder = iBinder2;
                    pendingIntent = pendingIntent3;
                    break;
                case 2:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    pendingIntent = pendingIntent2;
                    m23500g = i;
                    break;
                case 1000:
                    IBinder iBinder3 = iBinder2;
                    pendingIntent = pendingIntent2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    iBinder = iBinder3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    iBinder = iBinder2;
                    pendingIntent = pendingIntent2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            pendingIntent2 = pendingIntent;
            iBinder2 = iBinder;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new DataUpdateListenerUnregistrationRequest(i, pendingIntent2, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataUpdateListenerUnregistrationRequest[] newArray(int i) {
        return new DataUpdateListenerUnregistrationRequest[i];
    }
}
