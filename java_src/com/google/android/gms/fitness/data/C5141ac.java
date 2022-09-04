package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.fitness.data.ac */
/* loaded from: classes2.dex */
public class C5141ac implements Parcelable.Creator<RawDataPoint> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21490a(RawDataPoint rawDataPoint, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23474a(parcel, 1, rawDataPoint.f18626b);
        C4630b.m23474a(parcel, 2, rawDataPoint.f18627c);
        C4630b.m23456a(parcel, 3, (Parcelable[]) rawDataPoint.f18628d, i, false);
        C4630b.m23475a(parcel, 4, rawDataPoint.f18629e);
        C4630b.m23475a(parcel, 5, rawDataPoint.f18630f);
        C4630b.m23474a(parcel, 6, rawDataPoint.f18631g);
        C4630b.m23474a(parcel, 7, rawDataPoint.f18632h);
        C4630b.m23475a(parcel, 1000, rawDataPoint.f18625a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RawDataPoint createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j = 0;
        long j2 = 0;
        Value[] valueArr = null;
        int i2 = 0;
        int i3 = 0;
        long j3 = 0;
        long j4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 2:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    valueArr = (Value[]) C4628a.m23506b(parcel, m23514a, Value.CREATOR);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 7:
                    j4 = C4628a.m23498i(parcel, m23514a);
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
        return new RawDataPoint(i, j, j2, valueArr, i2, i3, j3, j4);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RawDataPoint[] newArray(int i) {
        return new RawDataPoint[i];
    }
}
