package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.request.f */
/* loaded from: classes2.dex */
public class C5229f implements Parcelable.Creator<SessionReadRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21028a(SessionReadRequest sessionReadRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23464a(parcel, 1, sessionReadRequest.m21187a(), false);
        C4630b.m23464a(parcel, 2, sessionReadRequest.m21184b(), false);
        C4630b.m23474a(parcel, 3, sessionReadRequest.m21176i());
        C4630b.m23474a(parcel, 4, sessionReadRequest.m21177h());
        C4630b.m23447c(parcel, 5, sessionReadRequest.m21182c(), false);
        C4630b.m23447c(parcel, 6, sessionReadRequest.m21181d(), false);
        C4630b.m23461a(parcel, 7, sessionReadRequest.m21175j());
        C4630b.m23475a(parcel, 1000, sessionReadRequest.m21173l());
        C4630b.m23461a(parcel, 8, sessionReadRequest.m21178g());
        C4630b.m23449b(parcel, 9, sessionReadRequest.m21179f(), false);
        C4630b.m23472a(parcel, 10, sessionReadRequest.m21174k(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SessionReadRequest createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        ArrayList<String> arrayList3 = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 2:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 5:
                    arrayList = C4628a.m23504c(parcel, m23514a, DataType.CREATOR);
                    break;
                case 6:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, DataSource.CREATOR);
                    break;
                case 7:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 8:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 9:
                    arrayList3 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 10:
                    iBinder = C4628a.m23489r(parcel, m23514a);
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
        return new SessionReadRequest(i, str, str2, j, j2, arrayList, arrayList2, z, z2, arrayList3, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SessionReadRequest[] newArray(int i) {
        return new SessionReadRequest[i];
    }
}
