package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.firebase.messaging.e */
/* loaded from: classes2.dex */
public class C9925e implements Parcelable.Creator<RemoteMessage> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m6444a(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, remoteMessage.f30844a);
        C4630b.m23473a(parcel, 2, remoteMessage.f30845b, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RemoteMessage createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new RemoteMessage(i, bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
