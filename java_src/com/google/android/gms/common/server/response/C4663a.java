package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.response.FastJsonResponse;
/* renamed from: com.google.android.gms.common.server.response.a */
/* loaded from: classes2.dex */
public class C4663a implements Parcelable.Creator<FastJsonResponse.Field> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23243a(FastJsonResponse.Field field, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, field.m23291a());
        C4630b.m23475a(parcel, 2, field.m23284b());
        C4630b.m23461a(parcel, 3, field.m23281c());
        C4630b.m23475a(parcel, 4, field.m23279d());
        C4630b.m23461a(parcel, 5, field.m23278e());
        C4630b.m23464a(parcel, 6, field.m23277f(), false);
        C4630b.m23475a(parcel, 7, field.m23276g());
        C4630b.m23464a(parcel, 8, field.m23274i(), false);
        C4630b.m23470a(parcel, 9, (Parcelable) field.m23272k(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FastJsonResponse.Field createFromParcel(Parcel parcel) {
        ConverterWrapper converterWrapper = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        String str2 = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    converterWrapper = (ConverterWrapper) C4628a.m23510a(parcel, m23514a, ConverterWrapper.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new FastJsonResponse.Field(i4, i3, z2, i2, z, str2, i, str, converterWrapper);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FastJsonResponse.Field[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
