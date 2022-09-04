package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
/* renamed from: com.google.android.gms.nearby.messages.internal.y */
/* loaded from: classes2.dex */
public class C8900y implements Parcelable.Creator<SubscribeRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9772a(SubscribeRequest subscribeRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, subscribeRequest.f28294a);
        C4630b.m23472a(parcel, 2, subscribeRequest.m9906b(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) subscribeRequest.f28296c, i, false);
        C4630b.m23472a(parcel, 4, subscribeRequest.m9907a(), false);
        C4630b.m23470a(parcel, 5, (Parcelable) subscribeRequest.f28298e, i, false);
        C4630b.m23470a(parcel, 6, (Parcelable) subscribeRequest.f28299f, i, false);
        C4630b.m23475a(parcel, 7, subscribeRequest.f28300g);
        C4630b.m23464a(parcel, 8, subscribeRequest.f28301h, false);
        C4630b.m23464a(parcel, 9, subscribeRequest.f28302i, false);
        C4630b.m23460a(parcel, 10, subscribeRequest.f28303j, false);
        C4630b.m23461a(parcel, 11, subscribeRequest.f28304k);
        C4630b.m23472a(parcel, 12, subscribeRequest.m9905c(), false);
        C4630b.m23461a(parcel, 13, subscribeRequest.f28306m);
        C4630b.m23470a(parcel, 14, (Parcelable) subscribeRequest.f28307n, i, false);
        C4630b.m23461a(parcel, 15, subscribeRequest.f28308o);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SubscribeRequest createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        IBinder iBinder = null;
        Strategy strategy = null;
        IBinder iBinder2 = null;
        MessageFilter messageFilter = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        boolean z = false;
        IBinder iBinder3 = null;
        boolean z2 = false;
        ClientAppContext clientAppContext = null;
        boolean z3 = false;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 3:
                    strategy = (Strategy) C4628a.m23510a(parcel, m23514a, Strategy.CREATOR);
                    break;
                case 4:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 5:
                    messageFilter = (MessageFilter) C4628a.m23510a(parcel, m23514a, MessageFilter.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) C4628a.m23510a(parcel, m23514a, PendingIntent.CREATOR);
                    break;
                case 7:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 9:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 10:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                case 11:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 12:
                    iBinder3 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 13:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 14:
                    clientAppContext = (ClientAppContext) C4628a.m23510a(parcel, m23514a, ClientAppContext.CREATOR);
                    break;
                case 15:
                    z3 = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SubscribeRequest(i, iBinder, strategy, iBinder2, messageFilter, pendingIntent, i2, str, str2, bArr, z, iBinder3, z2, clientAppContext, z3);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SubscribeRequest[] newArray(int i) {
        return new SubscribeRequest[i];
    }
}
