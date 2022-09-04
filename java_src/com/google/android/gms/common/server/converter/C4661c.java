package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.common.server.converter.StringToIntConverter;
/* renamed from: com.google.android.gms.common.server.converter.c */
/* loaded from: classes2.dex */
public class C4661c implements Parcelable.Creator<StringToIntConverter.Entry> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23299a(StringToIntConverter.Entry entry, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, entry.f17199a);
        C4630b.m23464a(parcel, 2, entry.f17200b, false);
        C4630b.m23475a(parcel, 3, entry.f17201c);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StringToIntConverter.Entry createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
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
        return new StringToIntConverter.Entry(i2, str, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public StringToIntConverter.Entry[] newArray(int i) {
        return new StringToIntConverter.Entry[i];
    }
}
