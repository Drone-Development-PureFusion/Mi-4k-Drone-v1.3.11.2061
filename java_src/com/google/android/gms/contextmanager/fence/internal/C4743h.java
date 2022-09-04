package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
/* renamed from: com.google.android.gms.contextmanager.fence.internal.h */
/* loaded from: classes2.dex */
public class C4743h implements Parcelable.Creator<FenceQueryRequestImpl> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22914a(FenceQueryRequestImpl fenceQueryRequestImpl, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, fenceQueryRequestImpl.m22977b());
        C4630b.m23470a(parcel, 2, (Parcelable) fenceQueryRequestImpl.m22976c(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FenceQueryRequestImpl createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        FenceQueryRequestImpl.QueryFenceOperation queryFenceOperation = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    queryFenceOperation = (FenceQueryRequestImpl.QueryFenceOperation) C4628a.m23510a(parcel, m23514a, FenceQueryRequestImpl.QueryFenceOperation.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new FenceQueryRequestImpl(i, queryFenceOperation);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FenceQueryRequestImpl[] newArray(int i) {
        return new FenceQueryRequestImpl[i];
    }
}
