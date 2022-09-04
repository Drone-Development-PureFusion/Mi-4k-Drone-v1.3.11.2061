package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.messages.internal.h */
/* loaded from: classes2.dex */
public class C8848h implements Parcelable.Creator<HandleClientLifecycleEventRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9870a(HandleClientLifecycleEventRequest handleClientLifecycleEventRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, handleClientLifecycleEventRequest.f28270a);
        C4630b.m23470a(parcel, 2, (Parcelable) handleClientLifecycleEventRequest.f28271b, i, false);
        C4630b.m23475a(parcel, 3, handleClientLifecycleEventRequest.f28272c);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public HandleClientLifecycleEventRequest createFromParcel(Parcel parcel) {
        int m23500g;
        ClientAppContext clientAppContext;
        int i;
        int i2 = 0;
        int m23508b = C4628a.m23508b(parcel);
        ClientAppContext clientAppContext2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    int i4 = i2;
                    clientAppContext = clientAppContext2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23500g = i4;
                    break;
                case 2:
                    ClientAppContext clientAppContext3 = (ClientAppContext) C4628a.m23510a(parcel, m23514a, ClientAppContext.CREATOR);
                    i = i3;
                    m23500g = i2;
                    clientAppContext = clientAppContext3;
                    break;
                case 3:
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    clientAppContext = clientAppContext2;
                    i = i3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23500g = i2;
                    clientAppContext = clientAppContext2;
                    i = i3;
                    break;
            }
            i3 = i;
            clientAppContext2 = clientAppContext;
            i2 = m23500g;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new HandleClientLifecycleEventRequest(i3, clientAppContext2, i2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public HandleClientLifecycleEventRequest[] newArray(int i) {
        return new HandleClientLifecycleEventRequest[i];
    }
}
