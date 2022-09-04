package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.contextmanager.fence.internal.o */
/* loaded from: classes2.dex */
public class C4752o implements Parcelable.Creator<FenceQueryRequestImpl.QueryFenceOperation> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22892a(FenceQueryRequestImpl.QueryFenceOperation queryFenceOperation, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, queryFenceOperation.m22972c());
        C4630b.m23475a(parcel, 2, queryFenceOperation.m22975a());
        C4630b.m23449b(parcel, 3, queryFenceOperation.m22973b(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FenceQueryRequestImpl.QueryFenceOperation createFromParcel(Parcel parcel) {
        int i = 0;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList<String> arrayList = null;
        int i2 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 3:
                    arrayList = C4628a.m23518E(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new FenceQueryRequestImpl.QueryFenceOperation(i2, i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public FenceQueryRequestImpl.QueryFenceOperation[] newArray(int i) {
        return new FenceQueryRequestImpl.QueryFenceOperation[i];
    }
}
