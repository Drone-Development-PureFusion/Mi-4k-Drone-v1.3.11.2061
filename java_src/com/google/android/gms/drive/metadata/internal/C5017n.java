package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.drive.metadata.internal.n */
/* loaded from: classes2.dex */
public class C5017n implements Parcelable.Creator<PartialDriveId> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22104a(PartialDriveId partialDriveId, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, partialDriveId.f17999a);
        C4630b.m23464a(parcel, 2, partialDriveId.f18000b, false);
        C4630b.m23474a(parcel, 3, partialDriveId.f18001c);
        C4630b.m23475a(parcel, 4, partialDriveId.f18002d);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PartialDriveId createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        long j = 0;
        int i2 = -1;
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
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
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
        return new PartialDriveId(i, str, j, i2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PartialDriveId[] newArray(int i) {
        return new PartialDriveId[i];
    }
}
