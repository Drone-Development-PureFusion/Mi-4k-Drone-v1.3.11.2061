package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.result.k */
/* loaded from: classes2.dex */
public class C5260k implements Parcelable.Creator<ReadRawResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20873a(ReadRawResult readRawResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) readRawResult.m20921c(), i, false);
        C4630b.m23447c(parcel, 2, readRawResult.m20920d(), false);
        C4630b.m23475a(parcel, 1000, readRawResult.m20922b());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ReadRawResult createFromParcel(Parcel parcel) {
        DataHolder dataHolder;
        int m23500g;
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        DataHolder dataHolder2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    DataHolder dataHolder3 = (DataHolder) C4628a.m23510a(parcel, m23514a, DataHolder.CREATOR);
                    m23500g = i;
                    arrayList = arrayList2;
                    dataHolder = dataHolder3;
                    break;
                case 2:
                    arrayList = C4628a.m23504c(parcel, m23514a, DataHolder.CREATOR);
                    dataHolder = dataHolder2;
                    m23500g = i;
                    break;
                case 1000:
                    ArrayList arrayList3 = arrayList2;
                    dataHolder = dataHolder2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    arrayList = arrayList3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    arrayList = arrayList2;
                    dataHolder = dataHolder2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            dataHolder2 = dataHolder;
            arrayList2 = arrayList;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ReadRawResult(i, dataHolder2, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ReadRawResult[] newArray(int i) {
        return new ReadRawResult[i];
    }
}
