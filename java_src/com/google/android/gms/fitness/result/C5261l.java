package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.SessionDataSet;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.result.l */
/* loaded from: classes2.dex */
public class C5261l implements Parcelable.Creator<SessionReadResult> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20870a(SessionReadResult sessionReadResult, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23447c(parcel, 1, sessionReadResult.m20915b(), false);
        C4630b.m23447c(parcel, 2, sessionReadResult.m20914c(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) sessionReadResult.mo7645a(), i, false);
        C4630b.m23475a(parcel, 1000, sessionReadResult.m20913d());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SessionReadResult createFromParcel(Parcel parcel) {
        Status status = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, Session.CREATOR);
                    break;
                case 2:
                    arrayList = C4628a.m23504c(parcel, m23514a, SessionDataSet.CREATOR);
                    break;
                case 3:
                    status = (Status) C4628a.m23510a(parcel, m23514a, Status.CREATOR);
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
        return new SessionReadResult(i, arrayList2, arrayList, status);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SessionReadResult[] newArray(int i) {
        return new SessionReadResult[i];
    }
}
