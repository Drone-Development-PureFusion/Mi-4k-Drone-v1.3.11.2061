package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.request.e */
/* loaded from: classes2.dex */
public class C5228e implements Parcelable.Creator<SessionInsertRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21031a(SessionInsertRequest sessionInsertRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) sessionInsertRequest.m21204a(), i, false);
        C4630b.m23447c(parcel, 2, sessionInsertRequest.m21202b(), false);
        C4630b.m23447c(parcel, 3, sessionInsertRequest.m21201c(), false);
        C4630b.m23472a(parcel, 4, sessionInsertRequest.m21200d(), false);
        C4630b.m23475a(parcel, 1000, sessionInsertRequest.m21199e());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SessionInsertRequest createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Session session = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    session = (Session) C4628a.m23510a(parcel, m23514a, Session.CREATOR);
                    break;
                case 2:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, DataSet.CREATOR);
                    break;
                case 3:
                    arrayList = C4628a.m23504c(parcel, m23514a, DataPoint.CREATOR);
                    break;
                case 4:
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
        return new SessionInsertRequest(i, session, arrayList2, arrayList, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SessionInsertRequest[] newArray(int i) {
        return new SessionInsertRequest[i];
    }
}
