package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.fitness.result.n */
/* loaded from: classes2.dex */
public class C5263n implements Parcelable.Creator<SyncInfoResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20864a(SyncInfoResult syncInfoResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) syncInfoResult.mo7645a(), i, false);
        C4630b.m23474a(parcel, 2, syncInfoResult.m20907b());
        C4630b.m23475a(parcel, 1000, syncInfoResult.m20906c());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SyncInfoResult createFromParcel(Parcel parcel) {
        Status status;
        int m23500g;
        long j;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Status status2 = null;
        long j2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    long j3 = j2;
                    status = (Status) C4628a.m23510a(parcel, m23514a, Status.CREATOR);
                    m23500g = i;
                    j = j3;
                    break;
                case 2:
                    j = C4628a.m23498i(parcel, m23514a);
                    status = status2;
                    m23500g = i;
                    break;
                case 1000:
                    long j4 = j2;
                    status = status2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    j = j4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    j = j2;
                    status = status2;
                    m23500g = i;
                    break;
            }
            status2 = status;
            i = m23500g;
            j2 = j;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SyncInfoResult(i, status2, j2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SyncInfoResult[] newArray(int i) {
        return new SyncInfoResult[i];
    }
}
