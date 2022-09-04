package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.result.c */
/* loaded from: classes2.dex */
public class C5252c implements Parcelable.Creator<DataReadResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20897a(DataReadResult dataReadResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23446d(parcel, 1, dataReadResult.m20946g(), false);
        C4630b.m23470a(parcel, 2, (Parcelable) dataReadResult.mo7645a(), i, false);
        C4630b.m23446d(parcel, 3, dataReadResult.m20947f(), false);
        C4630b.m23475a(parcel, 5, dataReadResult.m20949d());
        C4630b.m23447c(parcel, 6, dataReadResult.m20945h(), false);
        C4630b.m23447c(parcel, 7, dataReadResult.m20944i(), false);
        C4630b.m23475a(parcel, 1000, dataReadResult.m20948e());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataReadResult createFromParcel(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = null;
        Status status = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    C4628a.m23509a(parcel, m23514a, arrayList2, getClass().getClassLoader());
                    break;
                case 2:
                    status = (Status) C4628a.m23510a(parcel, m23514a, Status.CREATOR);
                    break;
                case 3:
                    C4628a.m23509a(parcel, m23514a, arrayList3, getClass().getClassLoader());
                    break;
                case 5:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    arrayList4 = C4628a.m23504c(parcel, m23514a, DataSource.CREATOR);
                    break;
                case 7:
                    arrayList = C4628a.m23504c(parcel, m23514a, DataType.CREATOR);
                    break;
                case 1000:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new DataReadResult(i2, arrayList2, status, arrayList3, i, arrayList4, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataReadResult[] newArray(int i) {
        return new DataReadResult[i];
    }
}
