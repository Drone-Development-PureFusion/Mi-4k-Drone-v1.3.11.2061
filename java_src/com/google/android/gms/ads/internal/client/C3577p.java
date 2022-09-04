package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.ads.internal.client.p */
/* loaded from: classes2.dex */
public class C3577p implements Parcelable.Creator<SearchAdRequestParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27431a(SearchAdRequestParcel searchAdRequestParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, searchAdRequestParcel.f13874a);
        C4630b.m23475a(parcel, 2, searchAdRequestParcel.f13875b);
        C4630b.m23475a(parcel, 3, searchAdRequestParcel.f13876c);
        C4630b.m23475a(parcel, 4, searchAdRequestParcel.f13877d);
        C4630b.m23475a(parcel, 5, searchAdRequestParcel.f13878e);
        C4630b.m23475a(parcel, 6, searchAdRequestParcel.f13879f);
        C4630b.m23475a(parcel, 7, searchAdRequestParcel.f13880g);
        C4630b.m23475a(parcel, 8, searchAdRequestParcel.f13881h);
        C4630b.m23475a(parcel, 9, searchAdRequestParcel.f13882i);
        C4630b.m23464a(parcel, 10, searchAdRequestParcel.f13883j, false);
        C4630b.m23475a(parcel, 11, searchAdRequestParcel.f13884k);
        C4630b.m23464a(parcel, 12, searchAdRequestParcel.f13885l, false);
        C4630b.m23475a(parcel, 13, searchAdRequestParcel.f13886m);
        C4630b.m23475a(parcel, 14, searchAdRequestParcel.f13887n);
        C4630b.m23464a(parcel, 15, searchAdRequestParcel.f13888o, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SearchAdRequestParcel createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        int i10 = 0;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        String str3 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    i6 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    i7 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    i8 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 9:
                    i9 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 10:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 11:
                    i10 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 12:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 13:
                    i11 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 14:
                    i12 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 15:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SearchAdRequestParcel(i, i2, i3, i4, i5, i6, i7, i8, i9, str, i10, str2, i11, i12, str3);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SearchAdRequestParcel[] newArray(int i) {
        return new SearchAdRequestParcel[i];
    }
}
