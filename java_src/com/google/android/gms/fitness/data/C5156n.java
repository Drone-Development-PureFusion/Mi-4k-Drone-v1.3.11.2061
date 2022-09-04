package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.fitness.data.n */
/* loaded from: classes2.dex */
public class C5156n implements Parcelable.Creator<DataSource> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21442a(DataSource dataSource, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) dataSource.m21691a(), i, false);
        C4630b.m23464a(parcel, 2, dataSource.m21685c(), false);
        C4630b.m23475a(parcel, 3, dataSource.m21687b());
        C4630b.m23470a(parcel, 4, (Parcelable) dataSource.m21682f(), i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) dataSource.m21683e(), i, false);
        C4630b.m23464a(parcel, 6, dataSource.m21681g(), false);
        C4630b.m23475a(parcel, 1000, dataSource.m21677k());
        C4630b.m23458a(parcel, 8, dataSource.m21680h(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataSource createFromParcel(Parcel parcel) {
        int i = 0;
        int[] iArr = null;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        Application application = null;
        Device device = null;
        String str2 = null;
        DataType dataType = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    dataType = (DataType) C4628a.m23510a(parcel, m23514a, DataType.CREATOR);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    device = (Device) C4628a.m23510a(parcel, m23514a, Device.CREATOR);
                    break;
                case 5:
                    application = (Application) C4628a.m23510a(parcel, m23514a, Application.CREATOR);
                    break;
                case 6:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    iArr = C4628a.m23484w(parcel, m23514a);
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
        return new DataSource(i2, dataType, str2, i, device, application, str, iArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataSource[] newArray(int i) {
        return new DataSource[i];
    }
}
