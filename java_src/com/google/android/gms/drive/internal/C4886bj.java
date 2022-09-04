package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.AbstractC4808e;
/* renamed from: com.google.android.gms.drive.internal.bj */
/* loaded from: classes2.dex */
public class C4886bj implements Parcelable.Creator<CreateContentsRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22493a(CreateContentsRequest createContentsRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, createContentsRequest.f17684a);
        C4630b.m23475a(parcel, 2, createContentsRequest.f17685b);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CreateContentsRequest createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        int i2 = AbstractC4808e.f17572c;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new CreateContentsRequest(i, i2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CreateContentsRequest[] newArray(int i) {
        return new CreateContentsRequest[i];
    }
}
