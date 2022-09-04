package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.fitness.request.g */
/* loaded from: classes2.dex */
public class C5230g implements Parcelable.Creator<SessionRegistrationRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21025a(SessionRegistrationRequest sessionRegistrationRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) sessionRegistrationRequest.m21154a(), i, false);
        C4630b.m23472a(parcel, 2, sessionRegistrationRequest.m21152b(), false);
        C4630b.m23475a(parcel, 4, sessionRegistrationRequest.m21151c());
        C4630b.m23475a(parcel, 1000, sessionRegistrationRequest.m21150d());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SessionRegistrationRequest createFromParcel(Parcel parcel) {
        IBinder iBinder;
        PendingIntent pendingIntent;
        int m23500g;
        int i;
        IBinder iBinder2 = null;
        int i2 = 0;
        int m23508b = C4628a.m23508b(parcel);
        PendingIntent pendingIntent2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    m23500g = i3;
                    IBinder iBinder3 = iBinder2;
                    pendingIntent = (PendingIntent) C4628a.m23510a(parcel, m23514a, PendingIntent.CREATOR);
                    i = i2;
                    iBinder = iBinder3;
                    break;
                case 2:
                    pendingIntent = pendingIntent2;
                    m23500g = i3;
                    int i4 = i2;
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    i = i4;
                    break;
                case 4:
                    i = C4628a.m23500g(parcel, m23514a);
                    iBinder = iBinder2;
                    pendingIntent = pendingIntent2;
                    m23500g = i3;
                    break;
                case 1000:
                    int i5 = i2;
                    iBinder = iBinder2;
                    pendingIntent = pendingIntent2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    i = i5;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    i = i2;
                    iBinder = iBinder2;
                    pendingIntent = pendingIntent2;
                    m23500g = i3;
                    break;
            }
            i3 = m23500g;
            pendingIntent2 = pendingIntent;
            iBinder2 = iBinder;
            i2 = i;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SessionRegistrationRequest(i3, pendingIntent2, iBinder2, i2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SessionRegistrationRequest[] newArray(int i) {
        return new SessionRegistrationRequest[i];
    }
}
