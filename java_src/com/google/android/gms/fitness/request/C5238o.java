package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
/* renamed from: com.google.android.gms.fitness.request.o */
/* loaded from: classes2.dex */
public class C5238o implements Parcelable.Creator<UnsubscribeRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21001a(UnsubscribeRequest unsubscribeRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) unsubscribeRequest.m21111b(), i, false);
        C4630b.m23470a(parcel, 2, (Parcelable) unsubscribeRequest.m21110c(), i, false);
        C4630b.m23472a(parcel, 3, unsubscribeRequest.m21109d(), false);
        C4630b.m23475a(parcel, 1000, unsubscribeRequest.m21113a());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UnsubscribeRequest createFromParcel(Parcel parcel) {
        DataSource dataSource;
        DataType dataType;
        int m23500g;
        IBinder iBinder;
        IBinder iBinder2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        DataSource dataSource2 = null;
        DataType dataType2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    m23500g = i;
                    DataSource dataSource3 = dataSource2;
                    dataType = (DataType) C4628a.m23510a(parcel, m23514a, DataType.CREATOR);
                    iBinder = iBinder2;
                    dataSource = dataSource3;
                    break;
                case 2:
                    dataType = dataType2;
                    m23500g = i;
                    IBinder iBinder3 = iBinder2;
                    dataSource = (DataSource) C4628a.m23510a(parcel, m23514a, DataSource.CREATOR);
                    iBinder = iBinder3;
                    break;
                case 3:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    dataSource = dataSource2;
                    dataType = dataType2;
                    m23500g = i;
                    break;
                case 1000:
                    IBinder iBinder4 = iBinder2;
                    dataSource = dataSource2;
                    dataType = dataType2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    iBinder = iBinder4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    iBinder = iBinder2;
                    dataSource = dataSource2;
                    dataType = dataType2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            dataType2 = dataType;
            dataSource2 = dataSource;
            iBinder2 = iBinder;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new UnsubscribeRequest(i, dataType2, dataSource2, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UnsubscribeRequest[] newArray(int i) {
        return new UnsubscribeRequest[i];
    }
}
