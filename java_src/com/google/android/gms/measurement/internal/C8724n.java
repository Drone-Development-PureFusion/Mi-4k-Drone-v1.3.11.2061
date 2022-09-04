package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.measurement.internal.n */
/* loaded from: classes2.dex */
public class C8724n implements Parcelable.Creator<AppMetadata> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10490a(AppMetadata appMetadata, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, appMetadata.f27593a);
        C4630b.m23464a(parcel, 2, appMetadata.f27594b, false);
        C4630b.m23464a(parcel, 3, appMetadata.f27595c, false);
        C4630b.m23464a(parcel, 4, appMetadata.f27596d, false);
        C4630b.m23464a(parcel, 5, appMetadata.f27597e, false);
        C4630b.m23474a(parcel, 6, appMetadata.f27598f);
        C4630b.m23474a(parcel, 7, appMetadata.f27599g);
        C4630b.m23464a(parcel, 8, appMetadata.f27600h, false);
        C4630b.m23461a(parcel, 9, appMetadata.f27601i);
        C4630b.m23461a(parcel, 10, appMetadata.f27602j);
        C4630b.m23474a(parcel, 11, appMetadata.f27603k);
        C4630b.m23464a(parcel, 12, appMetadata.f27604l, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppMetadata createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
        long j3 = 0;
        String str6 = null;
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
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 7:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 8:
                    str5 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 10:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 11:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 12:
                    str6 = C4628a.m23490q(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new AppMetadata(i, str, str2, str3, str4, j, j2, str5, z, z2, j3, str6);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public AppMetadata[] newArray(int i) {
        return new AppMetadata[i];
    }
}
