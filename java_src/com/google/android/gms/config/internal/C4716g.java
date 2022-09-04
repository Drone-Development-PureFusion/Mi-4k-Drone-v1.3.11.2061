package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.config.internal.g */
/* loaded from: classes2.dex */
public class C4716g implements Parcelable.Creator<FetchConfigIpcRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23034a(FetchConfigIpcRequest fetchConfigIpcRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, fetchConfigIpcRequest.f17319a);
        C4630b.m23464a(parcel, 2, fetchConfigIpcRequest.m23070a(), false);
        C4630b.m23474a(parcel, 3, fetchConfigIpcRequest.m23069b());
        C4630b.m23470a(parcel, 4, (Parcelable) fetchConfigIpcRequest.m23068c(), i, false);
        C4630b.m23464a(parcel, 5, fetchConfigIpcRequest.m23067d(), false);
        C4630b.m23464a(parcel, 6, fetchConfigIpcRequest.m23066e(), false);
        C4630b.m23464a(parcel, 7, fetchConfigIpcRequest.m23065f(), false);
        C4630b.m23449b(parcel, 8, fetchConfigIpcRequest.m23064g(), false);
        C4630b.m23475a(parcel, 9, fetchConfigIpcRequest.m23063h());
        C4630b.m23447c(parcel, 10, fetchConfigIpcRequest.m23062i(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FetchConfigIpcRequest createFromParcel(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        long j = 0;
        ArrayList<String> arrayList2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        DataHolder dataHolder = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    str4 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    dataHolder = (DataHolder) C4628a.m23510a(parcel, m23514a, DataHolder.CREATOR);
                    break;
                case 5:
                    str3 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    arrayList2 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 9:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 10:
                    arrayList = C4628a.m23504c(parcel, m23514a, AnalyticsUserProperty.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new FetchConfigIpcRequest(i2, str4, j, dataHolder, str3, str2, str, arrayList2, i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FetchConfigIpcRequest[] newArray(int i) {
        return new FetchConfigIpcRequest[i];
    }
}
