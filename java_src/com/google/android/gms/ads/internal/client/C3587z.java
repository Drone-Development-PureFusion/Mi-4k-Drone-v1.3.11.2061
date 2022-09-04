package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.ads.internal.client.z */
/* loaded from: classes2.dex */
public class C3587z implements Parcelable.Creator<AdSizeParcel> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m27409a(AdSizeParcel adSizeParcel, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, adSizeParcel.f13863a);
        C4630b.m23464a(parcel, 2, adSizeParcel.f13864b, false);
        C4630b.m23475a(parcel, 3, adSizeParcel.f13865c);
        C4630b.m23475a(parcel, 4, adSizeParcel.f13866d);
        C4630b.m23461a(parcel, 5, adSizeParcel.f13867e);
        C4630b.m23475a(parcel, 6, adSizeParcel.f13868f);
        C4630b.m23475a(parcel, 7, adSizeParcel.f13869g);
        C4630b.m23456a(parcel, 8, (Parcelable[]) adSizeParcel.f13870h, i, false);
        C4630b.m23461a(parcel, 9, adSizeParcel.f13871i);
        C4630b.m23461a(parcel, 10, adSizeParcel.f13872j);
        C4630b.m23461a(parcel, 11, adSizeParcel.f13873k);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdSizeParcel createFromParcel(Parcel parcel) {
        AdSizeParcel[] adSizeParcelArr = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        int i5 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i5 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    z4 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 7:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    adSizeParcelArr = (AdSizeParcel[]) C4628a.m23506b(parcel, m23514a, AdSizeParcel.CREATOR);
                    break;
                case 9:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 10:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 11:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AdSizeParcel(i5, str, i4, i3, z4, i2, i, adSizeParcelArr, z3, z2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AdSizeParcel[] newArray(int i) {
        return new AdSizeParcel[i];
    }
}
