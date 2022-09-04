package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.common.server.converter.b */
/* loaded from: classes2.dex */
public class C4660b implements Parcelable.Creator<StringToIntConverter> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23302a(StringToIntConverter stringToIntConverter, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, stringToIntConverter.m23312a());
        C4630b.m23447c(parcel, 2, stringToIntConverter.m23308b(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StringToIntConverter createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    arrayList = C4628a.m23504c(parcel, m23514a, StringToIntConverter.Entry.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new StringToIntConverter(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StringToIntConverter[] newArray(int i) {
        return new StringToIntConverter[i];
    }
}
