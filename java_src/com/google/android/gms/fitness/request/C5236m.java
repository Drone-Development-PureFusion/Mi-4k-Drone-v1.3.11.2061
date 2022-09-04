package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.Subscription;
/* renamed from: com.google.android.gms.fitness.request.m */
/* loaded from: classes2.dex */
public class C5236m implements Parcelable.Creator<SubscribeRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21007a(SubscribeRequest subscribeRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) subscribeRequest.m21120a(), i, false);
        C4630b.m23461a(parcel, 2, subscribeRequest.m21119b());
        C4630b.m23472a(parcel, 3, subscribeRequest.m21118c(), false);
        C4630b.m23475a(parcel, 1000, subscribeRequest.m21117d());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SubscribeRequest createFromParcel(Parcel parcel) {
        boolean z;
        Subscription subscription;
        int m23500g;
        IBinder iBinder;
        IBinder iBinder2 = null;
        boolean z2 = false;
        int m23508b = C4628a.m23508b(parcel);
        Subscription subscription2 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    m23500g = i;
                    boolean z3 = z2;
                    subscription = (Subscription) C4628a.m23510a(parcel, m23514a, Subscription.CREATOR);
                    iBinder = iBinder2;
                    z = z3;
                    break;
                case 2:
                    subscription = subscription2;
                    m23500g = i;
                    IBinder iBinder3 = iBinder2;
                    z = C4628a.m23505c(parcel, m23514a);
                    iBinder = iBinder3;
                    break;
                case 3:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    z = z2;
                    subscription = subscription2;
                    m23500g = i;
                    break;
                case 1000:
                    IBinder iBinder4 = iBinder2;
                    z = z2;
                    subscription = subscription2;
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    iBinder = iBinder4;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    iBinder = iBinder2;
                    z = z2;
                    subscription = subscription2;
                    m23500g = i;
                    break;
            }
            i = m23500g;
            subscription2 = subscription;
            z2 = z;
            iBinder2 = iBinder;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new SubscribeRequest(i, subscription2, z2, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SubscribeRequest[] newArray(int i) {
        return new SubscribeRequest[i];
    }
}
