package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.appdatasearch.d */
/* loaded from: classes2.dex */
public class C3956d implements Parcelable.Creator<DocumentSection> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25920a(DocumentSection documentSection, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, documentSection.f15243c, false);
        C4630b.m23470a(parcel, 3, (Parcelable) documentSection.f15244d, i, false);
        C4630b.m23475a(parcel, 4, documentSection.f15245e);
        C4630b.m23460a(parcel, 5, documentSection.f15246f, false);
        C4630b.m23475a(parcel, 1000, documentSection.f15242b);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DocumentSection createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        int i2 = -1;
        RegisterSectionInfo registerSectionInfo = null;
        String str = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    registerSectionInfo = (RegisterSectionInfo) C4628a.m23510a(parcel, m23514a, RegisterSectionInfo.CREATOR);
                    break;
                case 4:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 5:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                case 1000:
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
        return new DocumentSection(i, str, registerSectionInfo, i2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DocumentSection[] newArray(int i) {
        return new DocumentSection[i];
    }
}
