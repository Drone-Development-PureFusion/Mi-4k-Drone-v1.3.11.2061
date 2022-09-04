package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.phenotype.a */
/* loaded from: classes2.dex */
public class C8916a implements Parcelable.Creator<Configuration> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9734a(Configuration configuration, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, configuration.f28397a);
        C4630b.m23475a(parcel, 2, configuration.f28398b);
        C4630b.m23456a(parcel, 3, (Parcelable[]) configuration.f28399c, i, false);
        C4630b.m23455a(parcel, 4, configuration.f28400d, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Configuration createFromParcel(Parcel parcel) {
        String[] m23520C;
        Flag[] flagArr;
        int i;
        int i2;
        String[] strArr = null;
        int i3 = 0;
        int m23508b = C4628a.m23508b(parcel);
        Flag[] flagArr2 = null;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    String[] strArr2 = strArr;
                    flagArr = flagArr2;
                    i = i3;
                    i2 = C4628a.m23500g(parcel, m23514a);
                    m23520C = strArr2;
                    break;
                case 2:
                    i2 = i4;
                    Flag[] flagArr3 = flagArr2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23520C = strArr;
                    flagArr = flagArr3;
                    break;
                case 3:
                    i = i3;
                    i2 = i4;
                    String[] strArr3 = strArr;
                    flagArr = (Flag[]) C4628a.m23506b(parcel, m23514a, Flag.CREATOR);
                    m23520C = strArr3;
                    break;
                case 4:
                    m23520C = C4628a.m23520C(parcel, m23514a);
                    flagArr = flagArr2;
                    i = i3;
                    i2 = i4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23520C = strArr;
                    flagArr = flagArr2;
                    i = i3;
                    i2 = i4;
                    break;
            }
            i4 = i2;
            i3 = i;
            flagArr2 = flagArr;
            strArr = m23520C;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new Configuration(i4, i3, flagArr2, strArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Configuration[] newArray(int i) {
        return new Configuration[i];
    }
}
