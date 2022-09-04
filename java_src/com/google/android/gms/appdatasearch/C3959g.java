package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GetRecentContextCall;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.appdatasearch.g */
/* loaded from: classes2.dex */
public class C3959g implements Parcelable.Creator<GetRecentContextCall.Response> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25911a(GetRecentContextCall.Response response, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) response.f15256a, i, false);
        C4630b.m23447c(parcel, 2, response.f15257b, false);
        C4630b.m23455a(parcel, 3, response.f15258c, false);
        C4630b.m23475a(parcel, 1000, response.f15259d);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetRecentContextCall.Response createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        Status status;
        int m23500g;
        String[] strArr;
        String[] strArr2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ArrayList arrayList2 = null;
        Status status2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    m23500g = i;
                    ArrayList arrayList3 = arrayList2;
                    status = (Status) C4628a.m23510a(parcel, m23514a, Status.CREATOR);
                    strArr = strArr2;
                    arrayList = arrayList3;
                    break;
                case 2:
                    status = status2;
                    m23500g = i;
                    String[] strArr3 = strArr2;
                    arrayList = C4628a.m23504c(parcel, m23514a, UsageInfo.CREATOR);
                    strArr = strArr3;
                    break;
                case 3:
                    strArr = C4628a.m23520C(parcel, m23514a);
                    arrayList = arrayList2;
                    status = status2;
                    m23500g = i;
                    break;
                case 1000:
                    String[] strArr4 = strArr2;
                    arrayList = arrayList2;
                    status = status2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    strArr = strArr4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    strArr = strArr2;
                    arrayList = arrayList2;
                    status = status2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            status2 = status;
            arrayList2 = arrayList;
            strArr2 = strArr;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GetRecentContextCall.Response(i, status2, arrayList2, strArr2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetRecentContextCall.Response[] newArray(int i) {
        return new GetRecentContextCall.Response[i];
    }
}
