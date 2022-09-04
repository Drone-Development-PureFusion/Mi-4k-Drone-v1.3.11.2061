package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
/* renamed from: com.google.android.gms.drive.metadata.internal.c */
/* loaded from: classes2.dex */
public class C5004c implements Parcelable.Creator<CustomProperty> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22138a(CustomProperty customProperty, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, customProperty.f17992a);
        C4630b.m23470a(parcel, 2, (Parcelable) customProperty.f17993b, i, false);
        C4630b.m23464a(parcel, 3, customProperty.f17994c, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CustomProperty createFromParcel(Parcel parcel) {
        String m23490q;
        CustomPropertyKey customPropertyKey;
        int i;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i2 = 0;
        CustomPropertyKey customPropertyKey2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    String str2 = str;
                    customPropertyKey = customPropertyKey2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23490q = str2;
                    break;
                case 2:
                    CustomPropertyKey customPropertyKey3 = (CustomPropertyKey) C4628a.m23510a(parcel, m23514a, CustomPropertyKey.CREATOR);
                    i = i2;
                    m23490q = str;
                    customPropertyKey = customPropertyKey3;
                    break;
                case 3:
                    m23490q = C4628a.m23490q(parcel, m23514a);
                    customPropertyKey = customPropertyKey2;
                    i = i2;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23490q = str;
                    customPropertyKey = customPropertyKey2;
                    i = i2;
                    break;
            }
            i2 = i;
            customPropertyKey2 = customPropertyKey;
            str = m23490q;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CustomProperty(i2, customPropertyKey2, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CustomProperty[] newArray(int i) {
        return new CustomProperty[i];
    }
}
