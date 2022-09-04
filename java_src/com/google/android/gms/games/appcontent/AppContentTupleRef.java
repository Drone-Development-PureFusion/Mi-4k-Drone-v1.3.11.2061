package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
/* loaded from: classes2.dex */
public final class AppContentTupleRef extends AbstractC4531j implements AppContentTuple {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AppContentTupleRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentTuple
    /* renamed from: c */
    public String mo20543c() {
        return e("tuple_name");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentTuple
    /* renamed from: d */
    public String mo20542d() {
        return e("tuple_value");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: e */
    public AppContentTuple mo7785a() {
        return new AppContentTupleEntity(this);
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return AppContentTupleEntity.m20547a(this, obj);
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return AppContentTupleEntity.m20548a(this);
    }

    public String toString() {
        return AppContentTupleEntity.m20546b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentTupleEntity) ((AppContentTuple) mo7785a())).writeToParcel(parcel, i);
    }
}
