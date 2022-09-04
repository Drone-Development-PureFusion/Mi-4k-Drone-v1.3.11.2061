package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.messages.internal.x */
/* loaded from: classes2.dex */
public class C8899x implements Parcelable.Creator<RegisterStatusCallbackRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9775a(RegisterStatusCallbackRequest registerStatusCallbackRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, registerStatusCallbackRequest.f28288a);
        C4630b.m23472a(parcel, 2, registerStatusCallbackRequest.m9909a(), false);
        C4630b.m23472a(parcel, 3, registerStatusCallbackRequest.m9908b(), false);
        C4630b.m23461a(parcel, 4, registerStatusCallbackRequest.f28291d);
        C4630b.m23464a(parcel, 5, registerStatusCallbackRequest.f28292e, false);
        C4630b.m23470a(parcel, 6, (Parcelable) registerStatusCallbackRequest.f28293f, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RegisterStatusCallbackRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        ClientAppContext clientAppContext = null;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 3:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 4:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
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
        return new RegisterStatusCallbackRequest(i, iBinder2, iBinder, z, str, clientAppContext);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RegisterStatusCallbackRequest[] newArray(int i) {
        return new RegisterStatusCallbackRequest[i];
    }
}
