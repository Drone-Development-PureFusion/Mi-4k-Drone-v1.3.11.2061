package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
/* renamed from: com.google.android.gms.common.server.response.b */
/* loaded from: classes2.dex */
public class C4664b implements Parcelable.Creator<FieldMappingDictionary.FieldMapPair> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23240a(FieldMappingDictionary.FieldMapPair fieldMapPair, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, fieldMapPair.f17220a);
        C4630b.m23464a(parcel, 2, fieldMapPair.f17221b, false);
        C4630b.m23470a(parcel, 3, (Parcelable) fieldMapPair.f17222c, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FieldMappingDictionary.FieldMapPair createFromParcel(Parcel parcel) {
        FastJsonResponse.Field field = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    field = (FastJsonResponse.Field) C4628a.m23510a(parcel, m23514a, FastJsonResponse.Field.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new FieldMappingDictionary.FieldMapPair(i, str, field);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FieldMappingDictionary.FieldMapPair[] newArray(int i) {
        return new FieldMappingDictionary.FieldMapPair[i];
    }
}
