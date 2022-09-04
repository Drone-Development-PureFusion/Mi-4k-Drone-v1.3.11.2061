package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.appdatasearch.j */
/* loaded from: classes2.dex */
public class C3962j implements Parcelable.Creator<UsageInfo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25902a(UsageInfo usageInfo, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) usageInfo.f15279b, i, false);
        C4630b.m23474a(parcel, 2, usageInfo.f15280c);
        C4630b.m23475a(parcel, 3, usageInfo.f15281d);
        C4630b.m23464a(parcel, 4, usageInfo.f15282e, false);
        C4630b.m23470a(parcel, 5, (Parcelable) usageInfo.f15283f, i, false);
        C4630b.m23461a(parcel, 6, usageInfo.f15284g);
        C4630b.m23475a(parcel, 7, usageInfo.f15285h);
        C4630b.m23475a(parcel, 1000, usageInfo.f15278a);
        C4630b.m23475a(parcel, 8, usageInfo.f15286i);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UsageInfo createFromParcel(Parcel parcel) {
        DocumentContents documentContents = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        int i2 = -1;
        boolean z = false;
        String str = null;
        int i3 = 0;
        DocumentId documentId = null;
        int i4 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    documentId = (DocumentId) C4628a.m23510a(parcel, m23514a, DocumentId.CREATOR);
                    break;
                case 2:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    documentContents = (DocumentContents) C4628a.m23510a(parcel, m23514a, DocumentContents.CREATOR);
                    break;
                case 6:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 1000:
                    i4 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new UsageInfo(i4, documentId, j, i3, str, documentContents, z, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UsageInfo[] newArray(int i) {
        return new UsageInfo[i];
    }
}
