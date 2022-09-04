package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.wallet.firstparty.h */
/* loaded from: classes2.dex */
public class C9367h implements Parcelable.Creator<GetInstrumentsResponse> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m8400a(GetInstrumentsResponse getInstrumentsResponse, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, getInstrumentsResponse.m8422a());
        C4630b.m23455a(parcel, 2, getInstrumentsResponse.f29632a, false);
        C4630b.m23453a(parcel, 3, getInstrumentsResponse.f29633b, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetInstrumentsResponse createFromParcel(Parcel parcel) {
        byte[][] bArr = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    strArr = C4628a.m23520C(parcel, m23514a);
                    break;
                case 3:
                    bArr = C4628a.m23486u(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new GetInstrumentsResponse(i, strArr, bArr);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public GetInstrumentsResponse[] newArray(int i) {
        return new GetInstrumentsResponse[i];
    }
}
