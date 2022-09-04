package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.nearby.messages.Strategy;
/* renamed from: com.google.android.gms.nearby.messages.internal.w */
/* loaded from: classes2.dex */
public class C8898w implements Parcelable.Creator<PublishRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9778a(PublishRequest publishRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, publishRequest.f28278a);
        C4630b.m23470a(parcel, 2, (Parcelable) publishRequest.f28279b, i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) publishRequest.f28280c, i, false);
        C4630b.m23472a(parcel, 4, publishRequest.m9911a(), false);
        C4630b.m23464a(parcel, 5, publishRequest.f28282e, false);
        C4630b.m23464a(parcel, 6, publishRequest.f28283f, false);
        C4630b.m23461a(parcel, 7, publishRequest.f28284g);
        C4630b.m23472a(parcel, 8, publishRequest.m9910b(), false);
        C4630b.m23461a(parcel, 9, publishRequest.f28286i);
        C4630b.m23470a(parcel, 10, (Parcelable) publishRequest.f28287j, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PublishRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        ClientAppContext clientAppContext = null;
        int m23508b = C4628a.m23508b(parcel);
        IBinder iBinder = null;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        IBinder iBinder2 = null;
        Strategy strategy = null;
        MessageWrapper messageWrapper = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    messageWrapper = (MessageWrapper) C4628a.m23510a(parcel, m23514a, MessageWrapper.CREATOR);
                    break;
                case 3:
                    strategy = (Strategy) C4628a.m23510a(parcel, m23514a, Strategy.CREATOR);
                    break;
                case 4:
                    iBinder2 = C4628a.m23489r(parcel, m23514a);
                    break;
                case 5:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 7:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 8:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 9:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 10:
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
        return new PublishRequest(i, messageWrapper, strategy, iBinder2, str2, str, z2, iBinder, z, clientAppContext);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PublishRequest[] newArray(int i) {
        return new PublishRequest[i];
    }
}
