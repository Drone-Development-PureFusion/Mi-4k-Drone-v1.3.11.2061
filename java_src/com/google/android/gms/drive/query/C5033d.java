package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.drive.query.d */
/* loaded from: classes2.dex */
public class C5033d implements Parcelable.Creator<Query> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22021a(Query query, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23470a(parcel, 1, (Parcelable) query.f18021a, i, false);
        C4630b.m23464a(parcel, 3, query.f18022b, false);
        C4630b.m23470a(parcel, 4, (Parcelable) query.f18023c, i, false);
        C4630b.m23449b(parcel, 5, query.f18024d, false);
        C4630b.m23461a(parcel, 6, query.f18025e);
        C4630b.m23447c(parcel, 7, query.f18026f, false);
        C4630b.m23461a(parcel, 8, query.f18027g);
        C4630b.m23475a(parcel, 1000, query.f18028h);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Query createFromParcel(Parcel parcel) {
        boolean z = false;
        ArrayList arrayList = null;
        int m23508b = C4628a.m23508b(parcel);
        boolean z2 = false;
        ArrayList<String> arrayList2 = null;
        SortOrder sortOrder = null;
        String str = null;
        LogicalFilter logicalFilter = null;
        int i = 0;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    logicalFilter = (LogicalFilter) C4628a.m23510a(parcel, m23514a, LogicalFilter.CREATOR);
                    break;
                case 3:
                    str = C4628a.m23490q(parcel, m23514a);
                    break;
                case 4:
                    sortOrder = (SortOrder) C4628a.m23510a(parcel, m23514a, SortOrder.CREATOR);
                    break;
                case 5:
                    arrayList2 = C4628a.m23518E(parcel, m23514a);
                    break;
                case 6:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 7:
                    arrayList = C4628a.m23504c(parcel, m23514a, DriveSpace.CREATOR);
                    break;
                case 8:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 1000:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new Query(i, logicalFilter, str, sortOrder, arrayList2, z2, arrayList, z);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Query[] newArray(int i) {
        return new Query[i];
    }
}
