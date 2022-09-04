package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.Relation;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.contextmanager.internal.s */
/* loaded from: classes2.dex */
public class C4791s implements Parcelable.Creator<WriteBatchImpl> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22747a(WriteBatchImpl writeBatchImpl, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, writeBatchImpl.m22827a());
        C4630b.m23461a(parcel, 2, writeBatchImpl.m22826b());
        C4630b.m23447c(parcel, 3, writeBatchImpl.m22825c(), false);
        C4630b.m23447c(parcel, 4, writeBatchImpl.m22824d(), false);
        C4630b.m23447c(parcel, 5, writeBatchImpl.m22823e(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WriteBatchImpl createFromParcel(Parcel parcel) {
        boolean z = false;
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 3:
                    arrayList3 = C4628a.m23504c(parcel, m23514a, ContextData.CREATOR);
                    break;
                case 4:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, Relation.CREATOR);
                    break;
                case 5:
                    arrayList = C4628a.m23504c(parcel, m23514a, Relation.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new WriteBatchImpl(i, z, arrayList3, arrayList2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WriteBatchImpl[] newArray(int i) {
        return new WriteBatchImpl[i];
    }
}
