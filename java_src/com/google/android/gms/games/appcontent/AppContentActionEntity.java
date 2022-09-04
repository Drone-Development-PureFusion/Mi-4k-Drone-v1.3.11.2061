package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class AppContentActionEntity extends AbstractSafeParcelable implements AppContentAction {
    public static final C5338a CREATOR = new C5338a();

    /* renamed from: a */
    private final int f19345a;

    /* renamed from: b */
    private final ArrayList<AppContentConditionEntity> f19346b;

    /* renamed from: c */
    private final String f19347c;

    /* renamed from: d */
    private final Bundle f19348d;

    /* renamed from: e */
    private final String f19349e;

    /* renamed from: f */
    private final String f19350f;

    /* renamed from: g */
    private final AppContentAnnotationEntity f19351g;

    /* renamed from: h */
    private final String f19352h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppContentActionEntity(int i, ArrayList<AppContentConditionEntity> arrayList, String str, Bundle bundle, String str2, String str3, AppContentAnnotationEntity appContentAnnotationEntity, String str4) {
        this.f19345a = i;
        this.f19351g = appContentAnnotationEntity;
        this.f19346b = arrayList;
        this.f19347c = str;
        this.f19348d = bundle;
        this.f19350f = str3;
        this.f19352h = str4;
        this.f19349e = str2;
    }

    public AppContentActionEntity(AppContentAction appContentAction) {
        this.f19345a = 5;
        this.f19351g = (AppContentAnnotationEntity) appContentAction.mo20618c().a();
        this.f19347c = appContentAction.mo20616e();
        this.f19348d = appContentAction.mo20615f();
        this.f19350f = appContentAction.mo20614g();
        this.f19352h = appContentAction.mo20613h();
        this.f19349e = appContentAction.mo20612i();
        List<AppContentCondition> mo20617d = appContentAction.mo20617d();
        int size = mo20617d.size();
        this.f19346b = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.f19346b.add((AppContentConditionEntity) mo20617d.get(i).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20623a(AppContentAction appContentAction) {
        return C4585c.m23633a(appContentAction.mo20618c(), appContentAction.mo20617d(), appContentAction.mo20616e(), appContentAction.mo20615f(), appContentAction.mo20614g(), appContentAction.mo20613h(), appContentAction.mo20612i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20622a(AppContentAction appContentAction, Object obj) {
        if (!(obj instanceof AppContentAction)) {
            return false;
        }
        if (appContentAction == obj) {
            return true;
        }
        AppContentAction appContentAction2 = (AppContentAction) obj;
        return C4585c.m23634a(appContentAction2.mo20618c(), appContentAction.mo20618c()) && C4585c.m23634a(appContentAction2.mo20617d(), appContentAction.mo20617d()) && C4585c.m23634a(appContentAction2.mo20616e(), appContentAction.mo20616e()) && C4585c.m23634a(appContentAction2.mo20615f(), appContentAction.mo20615f()) && C4585c.m23634a(appContentAction2.mo20614g(), appContentAction.mo20614g()) && C4585c.m23634a(appContentAction2.mo20613h(), appContentAction.mo20613h()) && C4585c.m23634a(appContentAction2.mo20612i(), appContentAction.mo20612i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m20621b(AppContentAction appContentAction) {
        return C4585c.m23635a(appContentAction).m23632a("Annotation", appContentAction.mo20618c()).m23632a("Conditions", appContentAction.mo20617d()).m23632a("ContentDescription", appContentAction.mo20616e()).m23632a("Extras", appContentAction.mo20615f()).m23632a("Id", appContentAction.mo20614g()).m23632a("OverflowText", appContentAction.mo20613h()).m23632a("Type", appContentAction.mo20612i()).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: c */
    public AppContentAnnotation mo20618c() {
        return this.f19351g;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: d */
    public List<AppContentCondition> mo20617d() {
        return new ArrayList(this.f19346b);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: e */
    public String mo20616e() {
        return this.f19347c;
    }

    public boolean equals(Object obj) {
        return m20622a(this, obj);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: f */
    public Bundle mo20615f() {
        return this.f19348d;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: g */
    public String mo20614g() {
        return this.f19350f;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: h */
    public String mo20613h() {
        return this.f19352h;
    }

    public int hashCode() {
        return m20623a(this);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAction
    /* renamed from: i */
    public String mo20612i() {
        return this.f19349e;
    }

    /* renamed from: j */
    public int m20620j() {
        return this.f19345a;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: k */
    public AppContentAction mo7785a() {
        return this;
    }

    public String toString() {
        return m20621b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5338a.m20538a(this, parcel, i);
    }
}
