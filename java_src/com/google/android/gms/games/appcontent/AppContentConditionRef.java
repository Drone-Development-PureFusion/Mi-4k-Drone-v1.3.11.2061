package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class AppContentConditionRef extends AbstractC5353j implements AppContentCondition {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AppContentConditionRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 4, i);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCondition
    /* renamed from: c */
    public String mo20572c() {
        return e("condition_default_value");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCondition
    /* renamed from: d */
    public String mo20571d() {
        return e("condition_expected_value");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCondition
    /* renamed from: e */
    public String mo20570e() {
        return e("condition_predicate");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return AppContentConditionEntity.m20576a(this, obj);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCondition
    /* renamed from: f */
    public Bundle mo20569f() {
        return C5345h.m20516d(this.f16909c_, this.f19401c, "condition_predicate_parameters", this.f16910d_);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: g */
    public AppContentCondition mo7785a() {
        return new AppContentConditionEntity(this);
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return AppContentConditionEntity.m20577a(this);
    }

    public String toString() {
        return AppContentConditionEntity.m20575b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentConditionEntity) ((AppContentCondition) mo7785a())).writeToParcel(parcel, i);
    }
}
