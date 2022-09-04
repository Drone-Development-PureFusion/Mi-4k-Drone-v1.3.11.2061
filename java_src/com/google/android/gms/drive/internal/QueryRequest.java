package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.Query;
/* loaded from: classes2.dex */
public class QueryRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QueryRequest> CREATOR = new C4858an();

    /* renamed from: a */
    final int f17802a;

    /* renamed from: b */
    final Query f17803b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public QueryRequest(int i, Query query) {
        this.f17802a = i;
        this.f17803b = query;
    }

    public QueryRequest(Query query) {
        this(1, query);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4858an.m22559a(this, parcel, i);
    }
}
