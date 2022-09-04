package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.Field;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.request.w */
/* loaded from: classes2.dex */
public class C5246w implements Parcelable.Creator<DataTypeCreateRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20977a(DataTypeCreateRequest dataTypeCreateRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, dataTypeCreateRequest.m21293a(), false);
        C4630b.m23447c(parcel, 2, dataTypeCreateRequest.m21291b(), false);
        C4630b.m23472a(parcel, 3, dataTypeCreateRequest.m21290c(), false);
        C4630b.m23475a(parcel, 1000, dataTypeCreateRequest.m21289d());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataTypeCreateRequest createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    arrayList = C4628a.m23504c(parcel, m23514a, Field.CREATOR);
                    break;
                case 3:
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
        return new DataTypeCreateRequest(i, str, arrayList, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataTypeCreateRequest[] newArray(int i) {
        return new DataTypeCreateRequest[i];
    }
}
