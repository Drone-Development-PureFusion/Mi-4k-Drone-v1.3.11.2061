package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.appdatasearch.i */
/* loaded from: classes2.dex */
public class C3961i implements Parcelable.Creator<RegisterSectionInfo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25905a(RegisterSectionInfo registerSectionInfo, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, registerSectionInfo.f15261b, false);
        C4630b.m23464a(parcel, 2, registerSectionInfo.f15262c, false);
        C4630b.m23461a(parcel, 3, registerSectionInfo.f15263d);
        C4630b.m23475a(parcel, 4, registerSectionInfo.f15264e);
        C4630b.m23461a(parcel, 5, registerSectionInfo.f15265f);
        C4630b.m23464a(parcel, 6, registerSectionInfo.f15266g, false);
        C4630b.m23456a(parcel, 7, (Parcelable[]) registerSectionInfo.f15267h, i, false);
        C4630b.m23475a(parcel, 1000, registerSectionInfo.f15260a);
        C4630b.m23458a(parcel, 8, registerSectionInfo.f15268i, false);
        C4630b.m23464a(parcel, 11, registerSectionInfo.f15269j, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RegisterSectionInfo createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 1;
        int[] iArr = null;
        Feature[] featureArr = null;
        String str2 = null;
        boolean z2 = false;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 4:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    featureArr = (Feature[]) C4628a.m23506b(parcel, m23514a, Feature.CREATOR);
                    break;
                case 8:
                    iArr = C4628a.m23484w(parcel, m23514a);
                    break;
                case 11:
                    str = C4628a.m23490q(parcel, m23514a);
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
        return new RegisterSectionInfo(i2, str4, str3, z2, i, z, str2, featureArr, iArr, str);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RegisterSectionInfo[] newArray(int i) {
        return new RegisterSectionInfo[i];
    }
}
