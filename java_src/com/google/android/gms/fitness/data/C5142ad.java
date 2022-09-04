package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.data.ad */
/* loaded from: classes2.dex */
public class C5142ad implements Parcelable.Creator<RawDataSet> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21487a(RawDataSet rawDataSet, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, rawDataSet.f18634b);
        C4630b.m23475a(parcel, 2, rawDataSet.f18635c);
        C4630b.m23447c(parcel, 3, rawDataSet.f18636d, false);
        C4630b.m23461a(parcel, 4, rawDataSet.f18637e);
        C4630b.m23475a(parcel, 1000, rawDataSet.f18633a);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RawDataSet createFromParcel(Parcel parcel) {
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    arrayList = C4628a.m23504c(parcel, m23514a, RawDataPoint.CREATOR);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 1000:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new RawDataSet(i3, i2, i, arrayList, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RawDataSet[] newArray(int i) {
        return new RawDataSet[i];
    }
}
