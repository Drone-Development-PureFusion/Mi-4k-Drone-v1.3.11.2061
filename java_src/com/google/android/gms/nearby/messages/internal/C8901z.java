package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.nearby.messages.internal.z */
/* loaded from: classes2.dex */
public class C8901z implements Parcelable.Creator<UnpublishRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9769a(UnpublishRequest unpublishRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, unpublishRequest.f28309a);
        C4630b.m23470a(parcel, 2, (Parcelable) unpublishRequest.f28310b, i, false);
        C4630b.m23472a(parcel, 3, unpublishRequest.m9904a(), false);
        C4630b.m23464a(parcel, 4, unpublishRequest.f28312d, false);
        C4630b.m23464a(parcel, 5, unpublishRequest.f28313e, false);
        C4630b.m23461a(parcel, 6, unpublishRequest.f28314f);
        C4630b.m23470a(parcel, 7, (Parcelable) unpublishRequest.f28315g, i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UnpublishRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        ClientAppContext clientAppContext = null;
        int m23508b = C4628a.m23508b(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
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
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 4:
                    str2 = C4628a.m23490q(parcel, m23514a);
                    break;
                case 5:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 6:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
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
        return new UnpublishRequest(i, messageWrapper, iBinder, str2, str, z, clientAppContext);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public UnpublishRequest[] newArray(int i) {
        return new UnpublishRequest[i];
    }
}
