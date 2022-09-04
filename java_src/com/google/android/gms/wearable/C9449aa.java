package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wearable.aa */
/* loaded from: classes2.dex */
public class C9449aa implements Parcelable.Creator<PutDataRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8098a(PutDataRequest putDataRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, putDataRequest.f29803b);
        C4630b.m23470a(parcel, 2, (Parcelable) putDataRequest.m8128a(), i, false);
        C4630b.m23473a(parcel, 4, putDataRequest.m8117d(), false);
        C4630b.m23460a(parcel, 5, putDataRequest.m8121b(), false);
        C4630b.m23474a(parcel, 6, putDataRequest.m8115e());
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PutDataRequest createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        Uri uri = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    uri = (Uri) C4628a.m23510a(parcel, m23514a, Uri.CREATOR);
                    break;
                case 3:
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
                case 4:
                    bundle = C4628a.m23488s(parcel, m23514a);
                    break;
                case 5:
                    bArr = C4628a.m23487t(parcel, m23514a);
                    break;
                case 6:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new PutDataRequest(i, uri, bundle, bArr, j);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PutDataRequest[] newArray(int i) {
        return new PutDataRequest[i];
    }
}
