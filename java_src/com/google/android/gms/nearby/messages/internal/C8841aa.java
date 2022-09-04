package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.messages.internal.aa */
/* loaded from: classes2.dex */
public class C8841aa implements Parcelable.Creator<UnsubscribeRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9894a(UnsubscribeRequest unsubscribeRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, unsubscribeRequest.f28316a);
        C4630b.m23472a(parcel, 2, unsubscribeRequest.m9902b(), false);
        C4630b.m23472a(parcel, 3, unsubscribeRequest.m9903a(), false);
        C4630b.m23470a(parcel, 4, (Parcelable) unsubscribeRequest.f28319d, i, false);
        C4630b.m23475a(parcel, 5, unsubscribeRequest.f28320e);
        C4630b.m23464a(parcel, 6, unsubscribeRequest.f28321f, false);
        C4630b.m23464a(parcel, 7, unsubscribeRequest.f28322g, false);
        C4630b.m23461a(parcel, 8, unsubscribeRequest.f28323h);
        C4630b.m23470a(parcel, 9, (Parcelable) unsubscribeRequest.f28324i, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UnsubscribeRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        ClientAppContext clientAppContext = null;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        PendingIntent pendingIntent = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 3:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C4628a.m23510a(parcel, m23514a, PendingIntent.CREATOR);
                    break;
                case 5:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 6:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 8:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 9:
                    clientAppContext = (ClientAppContext) C4628a.m23510a(parcel, m23514a, ClientAppContext.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new UnsubscribeRequest(i2, iBinder2, iBinder, pendingIntent, i, str2, str, z, clientAppContext);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UnsubscribeRequest[] newArray(int i) {
        return new UnsubscribeRequest[i];
    }
}
