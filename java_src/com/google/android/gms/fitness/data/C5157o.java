package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.data.o */
/* loaded from: classes2.dex */
public class C5157o implements Parcelable.Creator<DataType> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21439a(DataType dataType, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, dataType.m21659a(), false);
        C4630b.m23447c(parcel, 2, dataType.m21656b(), false);
        C4630b.m23475a(parcel, 1000, dataType.m21652d());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataType createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
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
        return new DataType(i, str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataType[] newArray(int i) {
        return new DataType[i];
    }
}
