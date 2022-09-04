package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class AppContentCardEntity extends AbstractSafeParcelable implements AppContentCard {
    public static final C5340c CREATOR = new C5340c();

    /* renamed from: a */
    private final int f19363a;

    /* renamed from: b */
    private final ArrayList<AppContentActionEntity> f19364b;

    /* renamed from: c */
    private final ArrayList<AppContentAnnotationEntity> f19365c;

    /* renamed from: d */
    private final ArrayList<AppContentConditionEntity> f19366d;

    /* renamed from: e */
    private final String f19367e;

    /* renamed from: f */
    private final int f19368f;

    /* renamed from: g */
    private final String f19369g;

    /* renamed from: h */
    private final Bundle f19370h;

    /* renamed from: i */
    private final String f19371i;

    /* renamed from: j */
    private final String f19372j;

    /* renamed from: k */
    private final int f19373k;

    /* renamed from: l */
    private final String f19374l;

    /* renamed from: m */
    private final String f19375m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppContentCardEntity(int i, ArrayList<AppContentActionEntity> arrayList, ArrayList<AppContentAnnotationEntity> arrayList2, ArrayList<AppContentConditionEntity> arrayList3, String str, int i2, String str2, Bundle bundle, String str3, String str4, int i3, String str5, String str6) {
        this.f19363a = i;
        this.f19364b = arrayList;
        this.f19365c = arrayList2;
        this.f19366d = arrayList3;
        this.f19367e = str;
        this.f19368f = i2;
        this.f19369g = str2;
        this.f19370h = bundle;
        this.f19375m = str6;
        this.f19371i = str3;
        this.f19372j = str4;
        this.f19373k = i3;
        this.f19374l = str5;
    }

    public AppContentCardEntity(AppContentCard appContentCard) {
        this.f19363a = 4;
        this.f19367e = appContentCard.mo20587f();
        this.f19368f = appContentCard.mo20586g();
        this.f19369g = appContentCard.mo20585h();
        this.f19370h = appContentCard.mo20584i();
        this.f19375m = appContentCard.mo20583j();
        this.f19372j = appContentCard.mo20581l();
        this.f19371i = appContentCard.mo20582k();
        this.f19373k = appContentCard.mo20580m();
        this.f19374l = appContentCard.mo20579n();
        List<AppContentAction> mo20590c = appContentCard.mo20590c();
        int size = mo20590c.size();
        this.f19364b = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.f19364b.add((AppContentActionEntity) mo20590c.get(i).a());
        }
        List<AppContentAnnotation> mo20589d = appContentCard.mo20589d();
        int size2 = mo20589d.size();
        this.f19365c = new ArrayList<>(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            this.f19365c.add((AppContentAnnotationEntity) mo20589d.get(i2).a());
        }
        List<AppContentCondition> mo20588e = appContentCard.mo20588e();
        int size3 = mo20588e.size();
        this.f19366d = new ArrayList<>(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            this.f19366d.add((AppContentConditionEntity) mo20588e.get(i3).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20595a(AppContentCard appContentCard) {
        return C4585c.m23633a(appContentCard.mo20590c(), appContentCard.mo20589d(), appContentCard.mo20588e(), appContentCard.mo20587f(), Integer.valueOf(appContentCard.mo20586g()), appContentCard.mo20585h(), appContentCard.mo20584i(), appContentCard.mo20583j(), appContentCard.mo20582k(), appContentCard.mo20581l(), Integer.valueOf(appContentCard.mo20580m()), appContentCard.mo20579n());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20594a(AppContentCard appContentCard, Object obj) {
        if (!(obj instanceof AppContentCard)) {
            return false;
        }
        if (appContentCard == obj) {
            return true;
        }
        AppContentCard appContentCard2 = (AppContentCard) obj;
        return C4585c.m23634a(appContentCard2.mo20590c(), appContentCard.mo20590c()) && C4585c.m23634a(appContentCard2.mo20589d(), appContentCard.mo20589d()) && C4585c.m23634a(appContentCard2.mo20588e(), appContentCard.mo20588e()) && C4585c.m23634a(appContentCard2.mo20587f(), appContentCard.mo20587f()) && C4585c.m23634a(Integer.valueOf(appContentCard2.mo20586g()), Integer.valueOf(appContentCard.mo20586g())) && C4585c.m23634a(appContentCard2.mo20585h(), appContentCard.mo20585h()) && C4585c.m23634a(appContentCard2.mo20584i(), appContentCard.mo20584i()) && C4585c.m23634a(appContentCard2.mo20583j(), appContentCard.mo20583j()) && C4585c.m23634a(appContentCard2.mo20582k(), appContentCard.mo20582k()) && C4585c.m23634a(appContentCard2.mo20581l(), appContentCard.mo20581l()) && C4585c.m23634a(Integer.valueOf(appContentCard2.mo20580m()), Integer.valueOf(appContentCard.mo20580m())) && C4585c.m23634a(appContentCard2.mo20579n(), appContentCard.mo20579n());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m20593b(AppContentCard appContentCard) {
        return C4585c.m23635a(appContentCard).m23632a("Actions", appContentCard.mo20590c()).m23632a("Annotations", appContentCard.mo20589d()).m23632a("Conditions", appContentCard.mo20588e()).m23632a("ContentDescription", appContentCard.mo20587f()).m23632a("CurrentSteps", Integer.valueOf(appContentCard.mo20586g())).m23632a("Description", appContentCard.mo20585h()).m23632a("Extras", appContentCard.mo20584i()).m23632a("Id", appContentCard.mo20583j()).m23632a("Subtitle", appContentCard.mo20582k()).m23632a("Title", appContentCard.mo20581l()).m23632a("TotalSteps", Integer.valueOf(appContentCard.mo20580m())).m23632a("Type", appContentCard.mo20579n()).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: c */
    public List<AppContentAction> mo20590c() {
        return new ArrayList(this.f19364b);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: d */
    public List<AppContentAnnotation> mo20589d() {
        return new ArrayList(this.f19365c);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: e */
    public List<AppContentCondition> mo20588e() {
        return new ArrayList(this.f19366d);
    }

    public boolean equals(Object obj) {
        return m20594a(this, obj);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: f */
    public String mo20587f() {
        return this.f19367e;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: g */
    public int mo20586g() {
        return this.f19368f;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: h */
    public String mo20585h() {
        return this.f19369g;
    }

    public int hashCode() {
        return m20595a(this);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: i */
    public Bundle mo20584i() {
        return this.f19370h;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: j */
    public String mo20583j() {
        return this.f19375m;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: k */
    public String mo20582k() {
        return this.f19371i;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: l */
    public String mo20581l() {
        return this.f19372j;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: m */
    public int mo20580m() {
        return this.f19373k;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCard
    /* renamed from: n */
    public String mo20579n() {
        return this.f19374l;
    }

    /* renamed from: o */
    public int m20592o() {
        return this.f19363a;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: p */
    public AppContentCard mo7785a() {
        return this;
    }

    public String toString() {
        return m20593b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5340c.m20532a(this, parcel, i);
    }
}
