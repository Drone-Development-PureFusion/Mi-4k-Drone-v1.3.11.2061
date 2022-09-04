package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.auth.api.proxy.e */
/* loaded from: classes2.dex */
public class C4040e implements Parcelable.Creator<ProxyResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25689a(ProxyResponse proxyResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, proxyResponse.f15496c);
        C4630b.m23470a(parcel, 2, (Parcelable) proxyResponse.f15497d, i, false);
        C4630b.m23475a(parcel, 3, proxyResponse.f15498e);
        C4630b.m23473a(parcel, 4, proxyResponse.f15499f, false);
        C4630b.m23460a(parcel, 5, proxyResponse.f15500g, false);
        C4630b.m23475a(parcel, 1000, proxyResponse.f15495b);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ProxyResponse createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        Bundle bundle = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    pendingIntent = (PendingIntent) C4628a.m23510a(parcel, m23514a, PendingIntent.CREATOR);
                    break;
                case 3:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 4:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 5:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                case 1000:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ProxyResponse(i3, i2, pendingIntent, i, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ProxyResponse[] newArray(int i) {
        return new ProxyResponse[i];
    }
}
