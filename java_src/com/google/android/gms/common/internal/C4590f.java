package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.common.internal.f */
/* loaded from: classes2.dex */
public class C4590f implements Parcelable.Creator<ResolveAccountResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23610a(ResolveAccountResponse resolveAccountResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, resolveAccountResponse.f17007a);
        C4630b.m23472a(parcel, 2, resolveAccountResponse.f17008b, false);
        C4630b.m23470a(parcel, 3, (Parcelable) resolveAccountResponse.m23726b(), i, false);
        C4630b.m23461a(parcel, 4, resolveAccountResponse.m23725c());
        C4630b.m23461a(parcel, 5, resolveAccountResponse.m23724d());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ResolveAccountResponse createFromParcel(Parcel parcel) {
        ConnectionResult connectionResult = null;
        boolean z = false;
        int m23508b = C4628a.m23508b(parcel);
        boolean z2 = false;
        IBinder iBinder = null;
        int i = 0;
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
                    connectionResult = (ConnectionResult) C4628a.m23510a(parcel, m23514a, ConnectionResult.CREATOR);
                    break;
                case 4:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 5:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new ResolveAccountResponse(i, iBinder, connectionResult, z2, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ResolveAccountResponse[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }
}
