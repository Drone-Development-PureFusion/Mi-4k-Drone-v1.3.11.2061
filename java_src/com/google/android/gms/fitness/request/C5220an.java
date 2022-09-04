package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.fitness.request.an */
/* loaded from: classes2.dex */
public class C5220an implements Parcelable.Creator<SensorUnregistrationRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21065a(SensorUnregistrationRequest sensorUnregistrationRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23472a(parcel, 1, sensorUnregistrationRequest.m21205d(), false);
        C4630b.m23470a(parcel, 2, (Parcelable) sensorUnregistrationRequest.m21208a(), i, false);
        C4630b.m23472a(parcel, 3, sensorUnregistrationRequest.m21207b(), false);
        C4630b.m23475a(parcel, 1000, sensorUnregistrationRequest.m21206c());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SensorUnregistrationRequest createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent;
        IBinder iBinder;
        int m23500g;
        IBinder iBinder2;
        IBinder iBinder3 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        PendingIntent pendingIntent2 = null;
        IBinder iBinder4 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    m23500g = i;
                    PendingIntent pendingIntent3 = pendingIntent2;
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    iBinder2 = iBinder3;
                    pendingIntent = pendingIntent3;
                    break;
                case 2:
                    iBinder = iBinder4;
                    m23500g = i;
                    IBinder iBinder5 = iBinder3;
                    pendingIntent = (PendingIntent) C4628a.m23510a(parcel, m23514a, PendingIntent.CREATOR);
                    iBinder2 = iBinder5;
                    break;
                case 3:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
                    pendingIntent = pendingIntent2;
                    iBinder = iBinder4;
                    m23500g = i;
                    break;
                case 1000:
                    IBinder iBinder6 = iBinder3;
                    pendingIntent = pendingIntent2;
                    iBinder = iBinder4;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    iBinder2 = iBinder6;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    iBinder2 = iBinder3;
                    pendingIntent = pendingIntent2;
                    iBinder = iBinder4;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            iBinder4 = iBinder;
            pendingIntent2 = pendingIntent;
            iBinder3 = iBinder2;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SensorUnregistrationRequest(i, iBinder4, pendingIntent2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SensorUnregistrationRequest[] newArray(int i) {
        return new SensorUnregistrationRequest[i];
    }
}
