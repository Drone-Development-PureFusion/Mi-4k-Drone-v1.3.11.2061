package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class AppContentAnnotationRef extends AbstractC5353j implements AppContentAnnotation {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AppContentAnnotationRef(ArrayList<DataHolder> arrayList, int i) {
        super(arrayList, 2, i);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: c */
    public String mo20605c() {
        return e("annotation_description");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: d */
    public String mo20604d() {
        return e("annotation_id");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: e */
    public String mo20603e() {
        return e("annotation_image_default_id");
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public boolean equals(Object obj) {
        return AppContentAnnotationEntity.m20609a(this, obj);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: f */
    public int mo20602f() {
        return c("annotation_image_height");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: g */
    public Uri mo20601g() {
        return h("annotation_image_uri");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: h */
    public Bundle mo20600h() {
        return C5345h.m20516d(this.f16909c_, this.f19401c, "annotation_modifiers", this.f16910d_);
    }

    @Override // com.google.android.gms.common.data.AbstractC4531j
    public int hashCode() {
        return AppContentAnnotationEntity.m20610a(this);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: i */
    public int mo20599i() {
        return c("annotation_image_width");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: j */
    public String mo20598j() {
        return e("annotation_layout_slot");
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: k */
    public String mo20597k() {
        return e("annotation_title");
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: l */
    public AppContentAnnotation mo7785a() {
        return new AppContentAnnotationEntity(this);
    }

    public String toString() {
        return AppContentAnnotationEntity.m20608b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentAnnotationEntity) ((AppContentAnnotation) mo7785a())).writeToParcel(parcel, i);
    }
}
