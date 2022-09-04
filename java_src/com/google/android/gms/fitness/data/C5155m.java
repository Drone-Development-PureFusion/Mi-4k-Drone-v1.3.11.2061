package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.data.m */
/* loaded from: classes2.dex */
public class C5155m implements Parcelable.Creator<DataSet> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21445a(DataSet dataSet, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) dataSet.m21702b(), i, false);
        C4630b.m23470a(parcel, 2, (Parcelable) dataSet.m21699c(), i, false);
        C4630b.m23446d(parcel, 3, dataSet.m21693h(), false);
        C4630b.m23447c(parcel, 4, dataSet.m21692i(), false);
        C4630b.m23461a(parcel, 5, dataSet.m21695f());
        C4630b.m23475a(parcel, 1000, dataSet.m21694g());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataSet createFromParcel(Parcel parcel) {
        boolean z = false;
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList arrayList2 = new ArrayList();
        DataType dataType = null;
        DataSource dataSource = null;
        int i = 0;
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
                    C4628a.m23509a(parcel, m23514a, arrayList2, getClass().getClassLoader());
                    break;
                case 4:
                    arrayList = C4628a.m23504c(parcel, m23514a, DataSource.CREATOR);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
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
        return new DataSet(i, dataSource, dataType, arrayList2, arrayList, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataSet[] newArray(int i) {
        return new DataSet[i];
    }
}
