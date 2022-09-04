package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.Session;
/* renamed from: com.google.android.gms.fitness.request.h */
/* loaded from: classes2.dex */
public class C5231h implements Parcelable.Creator<SessionStartRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21022a(SessionStartRequest sessionStartRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) sessionStartRequest.m21149a(), i, false);
        C4630b.m23472a(parcel, 2, sessionStartRequest.m21147b(), false);
        C4630b.m23475a(parcel, 1000, sessionStartRequest.m21146c());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SessionStartRequest createFromParcel(Parcel parcel) {
        Session session;
        int m23500g;
        IBinder iBinder;
        IBinder iBinder2 = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Session session2 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    Session session3 = (Session) C4628a.m23510a(parcel, m23514a, Session.CREATOR);
                    m23500g = i;
                    iBinder = iBinder2;
                    session = session3;
                    break;
                case 2:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    session = session2;
                    m23500g = i;
                    break;
                case 1000:
                    IBinder iBinder3 = iBinder2;
                    session = session2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    iBinder = iBinder3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    iBinder = iBinder2;
                    session = session2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            session2 = session;
            iBinder2 = iBinder;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SessionStartRequest(i, session2, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SessionStartRequest[] newArray(int i) {
        return new SessionStartRequest[i];
    }
}
