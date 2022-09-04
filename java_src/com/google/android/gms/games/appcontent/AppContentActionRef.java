package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class AppContentActionRef extends AbstractC5353j implements AppContentAction {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AppContentActionRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 1, i);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: c */
    public AppContentAnnotation mo20618c() {
        ArrayList<AppContentAnnotation> m20518b = C5345h.m20518b(this.f16909c_, this.f19401c, "action_annotation", this.f16910d_);
        if (m20518b.size() == 1) {
            return m20518b.get(0);
        }
        return null;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: d */
    public List<AppContentCondition> mo20617d() {
        return C5345h.m20517c(this.f16909c_, this.f19401c, "action_conditions", this.f16910d_);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: e */
    public String mo20616e() {
        return e("action_content_description");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return AppContentActionEntity.m20622a(this, obj);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: f */
    public Bundle mo20615f() {
        return C5345h.m20516d(this.f16909c_, this.f19401c, "action_data", this.f16910d_);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: g */
    public String mo20614g() {
        return e("action_id");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: h */
    public String mo20613h() {
        return e("overflow_text");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return AppContentActionEntity.m20623a(this);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: i */
    public String mo20612i() {
        return e("action_type");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: j */
    public AppContentAction mo7785a() {
        return new AppContentActionEntity(this);
    }

    public String toString() {
        return AppContentActionEntity.m20621b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentActionEntity) ((AppContentAction) mo7785a())).writeToParcel(parcel, i);
    }
}
