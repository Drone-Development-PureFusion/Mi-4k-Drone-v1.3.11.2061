package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
/* renamed from: com.google.android.gms.drive.events.n */
/* loaded from: classes2.dex */
public class C4829n implements Parcelable.Creator<QueryResultEventParcelable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22639a(QueryResultEventParcelable queryResultEventParcelable, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, queryResultEventParcelable.f17610a);
        C4630b.m23470a(parcel, 2, (Parcelable) queryResultEventParcelable.f17611b, i, false);
        C4630b.m23461a(parcel, 3, queryResultEventParcelable.f17612c);
        C4630b.m23475a(parcel, 4, queryResultEventParcelable.f17613d);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public QueryResultEventParcelable createFromParcel(Parcel parcel) {
        int m23500g;
        boolean z;
        DataHolder dataHolder;
        int i;
        int i2 = 0;
        int m23508b = C4628a.m23508b(parcel);
        DataHolder dataHolder2 = null;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    int i4 = i2;
                    z = z2;
                    dataHolder = dataHolder2;
                    i = C4628a.m23500g(parcel, m23514a);
                    m23500g = i4;
                    break;
                case 2:
                    i = i3;
                    boolean z3 = z2;
                    dataHolder = (DataHolder) C4628a.m23510a(parcel, m23514a, DataHolder.CREATOR);
                    m23500g = i2;
                    z = z3;
                    break;
                case 3:
                    dataHolder = dataHolder2;
                    i = i3;
                    int i5 = i2;
                    z = C4628a.m23505c(parcel, m23514a);
                    m23500g = i5;
                    break;
                case 4:
                    m23500g = C4628a.m23500g(parcel, m23514a);
                    z = z2;
                    dataHolder = dataHolder2;
                    i = i3;
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    m23500g = i2;
                    z = z2;
                    dataHolder = dataHolder2;
                    i = i3;
                    break;
            }
            i3 = i;
            dataHolder2 = dataHolder;
            z2 = z;
            i2 = m23500g;
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new QueryResultEventParcelable(i3, dataHolder2, z2, i2);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public QueryResultEventParcelable[] newArray(int i) {
        return new QueryResultEventParcelable[i];
    }
}
