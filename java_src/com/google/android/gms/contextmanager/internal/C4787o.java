package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.contextmanager.internal.RelationFilterImpl;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.contextmanager.internal.o */
/* loaded from: classes2.dex */
public class C4787o implements Parcelable.Creator<RelationFilterImpl> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22759a(RelationFilterImpl relationFilterImpl, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, relationFilterImpl.m22840a());
        C4630b.m23447c(parcel, 2, relationFilterImpl.m22839b(), false);
        C4630b.m23470a(parcel, 3, (Parcelable) relationFilterImpl.m22838c(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RelationFilterImpl createFromParcel(Parcel parcel) {
        QueryFilterParameters queryFilterParameters = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    arrayList = C4628a.m23504c(parcel, m23514a, RelationFilterImpl.Inclusion.CREATOR);
                    break;
                case 3:
                    queryFilterParameters = (QueryFilterParameters) C4628a.m23510a(parcel, m23514a, QueryFilterParameters.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new RelationFilterImpl(i, arrayList, queryFilterParameters);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RelationFilterImpl[] newArray(int i) {
        return new RelationFilterImpl[i];
    }
}
