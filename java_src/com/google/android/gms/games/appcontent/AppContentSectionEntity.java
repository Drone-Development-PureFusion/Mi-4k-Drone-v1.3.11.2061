package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class AppContentSectionEntity extends AbstractSafeParcelable implements AppContentSection {
    public static final C5343f CREATOR = new C5343f();

    /* renamed from: a */
    private final int f19381a;

    /* renamed from: b */
    private final ArrayList<AppContentActionEntity> f19382b;

    /* renamed from: c */
    private final ArrayList<AppContentCardEntity> f19383c;

    /* renamed from: d */
    private final String f19384d;

    /* renamed from: e */
    private final Bundle f19385e;

    /* renamed from: f */
    private final String f19386f;

    /* renamed from: g */
    private final String f19387g;

    /* renamed from: h */
    private final String f19388h;

    /* renamed from: i */
    private final String f19389i;

    /* renamed from: j */
    private final String f19390j;

    /* renamed from: k */
    private final ArrayList<AppContentAnnotationEntity> f19391k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppContentSectionEntity(int i, ArrayList<AppContentActionEntity> arrayList, ArrayList<AppContentCardEntity> arrayList2, String str, Bundle bundle, String str2, String str3, String str4, String str5, String str6, ArrayList<AppContentAnnotationEntity> arrayList3) {
        this.f19381a = i;
        this.f19382b = arrayList;
        this.f19391k = arrayList3;
        this.f19383c = arrayList2;
        this.f19390j = str6;
        this.f19384d = str;
        this.f19385e = bundle;
        this.f19389i = str5;
        this.f19386f = str2;
        this.f19387g = str3;
        this.f19388h = str4;
    }

    public AppContentSectionEntity(AppContentSection appContentSection) {
        this.f19381a = 5;
        this.f19390j = appContentSection.mo20559f();
        this.f19384d = appContentSection.mo20558g();
        this.f19385e = appContentSection.mo20557h();
        this.f19389i = appContentSection.mo20556i();
        this.f19386f = appContentSection.mo20555j();
        this.f19387g = appContentSection.mo20554k();
        this.f19388h = appContentSection.mo20553l();
        List<AppContentAction> mo20562c = appContentSection.mo20562c();
        int size = mo20562c.size();
        this.f19382b = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.f19382b.add((AppContentActionEntity) mo20562c.get(i).a());
        }
        List<AppContentCard> mo20560e = appContentSection.mo20560e();
        int size2 = mo20560e.size();
        this.f19383c = new ArrayList<>(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            this.f19383c.add((AppContentCardEntity) mo20560e.get(i2).a());
        }
        List<AppContentAnnotation> mo20561d = appContentSection.mo20561d();
        int size3 = mo20561d.size();
        this.f19391k = new ArrayList<>(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            this.f19391k.add((AppContentAnnotationEntity) mo20561d.get(i3).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20567a(AppContentSection appContentSection) {
        return C4585c.m23633a(appContentSection.mo20562c(), appContentSection.mo20561d(), appContentSection.mo20560e(), appContentSection.mo20559f(), appContentSection.mo20558g(), appContentSection.mo20557h(), appContentSection.mo20556i(), appContentSection.mo20555j(), appContentSection.mo20554k(), appContentSection.mo20553l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20566a(AppContentSection appContentSection, Object obj) {
        if (!(obj instanceof AppContentSection)) {
            return false;
        }
        if (appContentSection == obj) {
            return true;
        }
        AppContentSection appContentSection2 = (AppContentSection) obj;
        return C4585c.m23634a(appContentSection2.mo20562c(), appContentSection.mo20562c()) && C4585c.m23634a(appContentSection2.mo20561d(), appContentSection.mo20561d()) && C4585c.m23634a(appContentSection2.mo20560e(), appContentSection.mo20560e()) && C4585c.m23634a(appContentSection2.mo20559f(), appContentSection.mo20559f()) && C4585c.m23634a(appContentSection2.mo20558g(), appContentSection.mo20558g()) && C4585c.m23634a(appContentSection2.mo20557h(), appContentSection.mo20557h()) && C4585c.m23634a(appContentSection2.mo20556i(), appContentSection.mo20556i()) && C4585c.m23634a(appContentSection2.mo20555j(), appContentSection.mo20555j()) && C4585c.m23634a(appContentSection2.mo20554k(), appContentSection.mo20554k()) && C4585c.m23634a(appContentSection2.mo20553l(), appContentSection.mo20553l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m20565b(AppContentSection appContentSection) {
        return C4585c.m23635a(appContentSection).m23632a("Actions", appContentSection.mo20562c()).m23632a("Annotations", appContentSection.mo20561d()).m23632a("Cards", appContentSection.mo20560e()).m23632a("CardType", appContentSection.mo20559f()).m23632a("ContentDescription", appContentSection.mo20558g()).m23632a("Extras", appContentSection.mo20557h()).m23632a("Id", appContentSection.mo20556i()).m23632a("Subtitle", appContentSection.mo20555j()).m23632a("Title", appContentSection.mo20554k()).m23632a("Type", appContentSection.mo20553l()).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: c */
    public List<AppContentAction> mo20562c() {
        return new ArrayList(this.f19382b);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: d */
    public List<AppContentAnnotation> mo20561d() {
        return new ArrayList(this.f19391k);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: e */
    public List<AppContentCard> mo20560e() {
        return new ArrayList(this.f19383c);
    }

    public boolean equals(Object obj) {
        return m20566a(this, obj);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: f */
    public String mo20559f() {
        return this.f19390j;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: g */
    public String mo20558g() {
        return this.f19384d;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: h */
    public Bundle mo20557h() {
        return this.f19385e;
    }

    public int hashCode() {
        return m20567a(this);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: i */
    public String mo20556i() {
        return this.f19389i;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: j */
    public String mo20555j() {
        return this.f19386f;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: k */
    public String mo20554k() {
        return this.f19387g;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentSection
    /* renamed from: l */
    public String mo20553l() {
        return this.f19388h;
    }

    /* renamed from: m */
    public int m20564m() {
        return this.f19381a;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: n */
    public AppContentSection mo7785a() {
        return this;
    }

    public String toString() {
        return m20565b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5343f.m20524a(this, parcel, i);
    }
}
