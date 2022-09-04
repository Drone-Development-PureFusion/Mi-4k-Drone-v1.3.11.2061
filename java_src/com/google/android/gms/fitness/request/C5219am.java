package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.request.am */
/* loaded from: classes2.dex */
public class C5219am implements Parcelable.Creator<SensorRegistrationRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21068a(SensorRegistrationRequest sensorRegistrationRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) sensorRegistrationRequest.m21221a(), i, false);
        C4630b.m23470a(parcel, 2, (Parcelable) sensorRegistrationRequest.m21219b(), i, false);
        C4630b.m23472a(parcel, 3, sensorRegistrationRequest.m21209l(), false);
        C4630b.m23475a(parcel, 4, sensorRegistrationRequest.f18969a);
        C4630b.m23475a(parcel, 5, sensorRegistrationRequest.f18970b);
        C4630b.m23474a(parcel, 6, sensorRegistrationRequest.m21216e());
        C4630b.m23474a(parcel, 7, sensorRegistrationRequest.m21215f());
        C4630b.m23475a(parcel, 1000, sensorRegistrationRequest.m21210k());
        C4630b.m23470a(parcel, 8, (Parcelable) sensorRegistrationRequest.m21218c(), i, false);
        C4630b.m23474a(parcel, 9, sensorRegistrationRequest.m21217d());
        C4630b.m23475a(parcel, 10, sensorRegistrationRequest.m21213h());
        C4630b.m23447c(parcel, 11, sensorRegistrationRequest.m21214g(), false);
        C4630b.m23474a(parcel, 12, sensorRegistrationRequest.m21212i());
        C4630b.m23472a(parcel, 13, sensorRegistrationRequest.m21211j(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SensorRegistrationRequest createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        DataSource dataSource = null;
        DataType dataType = null;
        IBinder iBinder = null;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        long j2 = 0;
        PendingIntent pendingIntent = null;
        long j3 = 0;
        int i4 = 0;
        ArrayList arrayList = null;
        long j4 = 0;
        IBinder iBinder2 = null;
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
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 7:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 8:
                    pendingIntent = (PendingIntent) C4628a.m23510a(parcel, m23514a, PendingIntent.CREATOR);
                    break;
                case 9:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 10:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 11:
                    arrayList = C4628a.m23504c(parcel, m23514a, LocationRequest.CREATOR);
                    break;
                case 12:
                    j4 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 13:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
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
        return new SensorRegistrationRequest(i, dataSource, dataType, iBinder, i2, i3, j, j2, pendingIntent, j3, i4, arrayList, j4, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SensorRegistrationRequest[] newArray(int i) {
        return new SensorRegistrationRequest[i];
    }
}
