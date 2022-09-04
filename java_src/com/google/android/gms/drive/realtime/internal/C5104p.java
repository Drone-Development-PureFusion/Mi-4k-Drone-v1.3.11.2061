package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.drive.realtime.internal.p */
/* loaded from: classes2.dex */
public class C5104p implements Parcelable.Creator<ParcelableChangeInfo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21816a(ParcelableChangeInfo parcelableChangeInfo, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, parcelableChangeInfo.f18114a);
        C4630b.m23474a(parcel, 2, parcelableChangeInfo.f18115b);
        C4630b.m23447c(parcel, 3, parcelableChangeInfo.f18116c, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelableChangeInfo createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 3:
                    arrayList = C4628a.m23504c(parcel, m23514a, ParcelableEvent.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ParcelableChangeInfo(i, j, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ParcelableChangeInfo[] newArray(int i) {
        return new ParcelableChangeInfo[i];
    }
}
