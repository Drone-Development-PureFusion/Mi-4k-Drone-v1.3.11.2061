package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class AppContentSectionRef extends AbstractC5353j implements AppContentSection {

    /* renamed from: d */
    private final int f19392d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppContentSectionRef(ArrayList<DataHolder> arrayList, int i, int i2) {
        super(arrayList, 0, i);
        this.f19392d = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return AppContentSectionEntity.m20566a(this, obj);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: f */
    public String mo20559f() {
        return e("section_card_type");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: g */
    public String mo20558g() {
        return e("section_content_description");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: h */
    public Bundle mo20557h() {
        return C5345h.m20516d(this.f16909c_, this.f19401c, "section_data", this.f16910d_);
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return AppContentSectionEntity.m20567a(this);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: i */
    public String mo20556i() {
        return e("section_id");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: j */
    public String mo20555j() {
        return e("section_subtitle");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: k */
    public String mo20554k() {
        return e("section_title");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: l */
    public String mo20553l() {
        return e("section_type");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: m */
    public ArrayList<AppContentAction> mo20562c() {
        return C5345h.m20519a(this.f16909c_, this.f19401c, "section_actions", this.f16910d_);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: n */
    public ArrayList<AppContentAnnotation> mo20561d() {
        return C5345h.m20518b(this.f16909c_, this.f19401c, "section_annotations", this.f16910d_);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: o */
    public ArrayList<AppContentCard> mo20560e() {
        ArrayList<AppContentCard> arrayList = new ArrayList<>(this.f19392d);
        for (int i = 0; i < this.f19392d; i++) {
            arrayList.add(new AppContentCardRef(this.f19401c, this.f16910d_ + i));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: p */
    public AppContentSection mo7785a() {
        return new AppContentSectionEntity(this);
    }

    public String toString() {
        return AppContentSectionEntity.m20565b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentSectionEntity) ((AppContentSection) mo7785a())).writeToParcel(parcel, i);
    }
}
