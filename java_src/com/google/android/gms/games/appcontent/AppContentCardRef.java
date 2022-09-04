package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class AppContentCardRef extends AbstractC5353j implements AppContentCard {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AppContentCardRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 0, i);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: c */
    public List<AppContentAction> mo20590c() {
        return C5345h.m20519a(this.f16909c_, this.f19401c, "card_actions", this.f16910d_);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: d */
    public List<AppContentAnnotation> mo20589d() {
        return C5345h.m20518b(this.f16909c_, this.f19401c, "card_annotations", this.f16910d_);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: e */
    public List<AppContentCondition> mo20588e() {
        return C5345h.m20517c(this.f16909c_, this.f19401c, "card_conditions", this.f16910d_);
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return AppContentCardEntity.m20594a(this, obj);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: f */
    public String mo20587f() {
        return e("card_content_description");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: g */
    public int mo20586g() {
        return c("card_current_steps");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: h */
    public String mo20585h() {
        return e("card_description");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return AppContentCardEntity.m20595a(this);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: i */
    public Bundle mo20584i() {
        return C5345h.m20516d(this.f16909c_, this.f19401c, "card_data", this.f16910d_);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: j */
    public String mo20583j() {
        return e("card_id");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: k */
    public String mo20582k() {
        return e("card_subtitle");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: l */
    public String mo20581l() {
        return e("card_title");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: m */
    public int mo20580m() {
        return c("card_total_steps");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: n */
    public String mo20579n() {
        return e("card_type");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: o */
    public AppContentCard mo7785a() {
        return new AppContentCardEntity(this);
    }

    public String toString() {
        return AppContentCardEntity.m20593b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentCardEntity) ((AppContentCard) mo7785a())).writeToParcel(parcel, i);
    }
}
