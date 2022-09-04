package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.safetynet.g */
/* loaded from: classes2.dex */
public class C8998g implements Parcelable.Creator<SafeBrowsingData> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9416a(SafeBrowsingData safeBrowsingData, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, safeBrowsingData.f28613a);
        C4630b.m23464a(parcel, 2, safeBrowsingData.m9438a(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) safeBrowsingData.m9437b(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SafeBrowsingData createFromParcel(Parcel parcel) {
        DataHolder dataHolder = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
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
                    dataHolder = (DataHolder) C4628a.m23510a(parcel, m23514a, DataHolder.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SafeBrowsingData(i, str, dataHolder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SafeBrowsingData[] newArray(int i) {
        return new SafeBrowsingData[i];
    }
}
