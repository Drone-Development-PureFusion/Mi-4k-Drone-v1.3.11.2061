package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.fitness.data.q */
/* loaded from: classes2.dex */
public class C5159q implements Parcelable.Creator<DataUpdateNotification> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21435a(DataUpdateNotification dataUpdateNotification, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23474a(parcel, 1, dataUpdateNotification.m21651a());
        C4630b.m23474a(parcel, 2, dataUpdateNotification.m21647b());
        C4630b.m23475a(parcel, 3, dataUpdateNotification.m21645c());
        C4630b.m23470a(parcel, 4, (Parcelable) dataUpdateNotification.m21644d(), i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) dataUpdateNotification.m21643e(), i, false);
        C4630b.m23475a(parcel, 1000, dataUpdateNotification.f18481f);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataUpdateNotification createFromParcel(Parcel parcel) {
        long j = 0;
        DataType dataType = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        DataSource dataSource = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 2:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    dataSource = (DataSource) C4628a.m23510a(parcel, m23514a, DataSource.CREATOR);
                    break;
                case 5:
                    dataType = (DataType) C4628a.m23510a(parcel, m23514a, DataType.CREATOR);
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
        return new DataUpdateNotification(i2, j2, j, i, dataSource, dataType);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataUpdateNotification[] newArray(int i) {
        return new DataUpdateNotification[i];
    }
}
