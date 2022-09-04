package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataType;
/* renamed from: com.google.android.gms.fitness.request.ai */
/* loaded from: classes2.dex */
public class C5213ai implements Parcelable.Creator<ListSubscriptionsRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21082a(ListSubscriptionsRequest listSubscriptionsRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) listSubscriptionsRequest.m21232a(), i, false);
        C4630b.m23472a(parcel, 2, listSubscriptionsRequest.m21231b(), false);
        C4630b.m23475a(parcel, 1000, listSubscriptionsRequest.m21230c());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ListSubscriptionsRequest createFromParcel(Parcel parcel) {
        DataType dataType;
        int m23500g;
        IBinder iBinder;
        IBinder iBinder2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        DataType dataType2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    DataType dataType3 = (DataType) C4628a.m23510a(parcel, m23514a, DataType.CREATOR);
                    m23500g = i;
                    iBinder = iBinder2;
                    dataType = dataType3;
                    break;
                case 2:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    dataType = dataType2;
                    m23500g = i;
                    break;
                case 1000:
                    IBinder iBinder3 = iBinder2;
                    dataType = dataType2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    iBinder = iBinder3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    iBinder = iBinder2;
                    dataType = dataType2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            dataType2 = dataType;
            iBinder2 = iBinder;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ListSubscriptionsRequest(i, dataType2, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ListSubscriptionsRequest[] newArray(int i) {
        return new ListSubscriptionsRequest[i];
    }
}
