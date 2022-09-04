package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class AppContentConditionEntity extends AbstractSafeParcelable implements AppContentCondition {
    public static final C5341d CREATOR = new C5341d();

    /* renamed from: a */
    private final int f19376a;

    /* renamed from: b */
    private final String f19377b;

    /* renamed from: c */
    private final String f19378c;

    /* renamed from: d */
    private final String f19379d;

    /* renamed from: e */
    private final Bundle f19380e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppContentConditionEntity(int i, String str, String str2, String str3, Bundle bundle) {
        this.f19376a = i;
        this.f19377b = str;
        this.f19378c = str2;
        this.f19379d = str3;
        this.f19380e = bundle;
    }

    public AppContentConditionEntity(AppContentCondition appContentCondition) {
        this.f19376a = 1;
        this.f19377b = appContentCondition.mo20572c();
        this.f19378c = appContentCondition.mo20571d();
        this.f19379d = appContentCondition.mo20570e();
        this.f19380e = appContentCondition.mo20569f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20577a(AppContentCondition appContentCondition) {
        return C4585c.m23633a(appContentCondition.mo20572c(), appContentCondition.mo20571d(), appContentCondition.mo20570e(), appContentCondition.mo20569f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20576a(AppContentCondition appContentCondition, Object obj) {
        if (!(obj instanceof AppContentCondition)) {
            return false;
        }
        if (appContentCondition == obj) {
            return true;
        }
        AppContentCondition appContentCondition2 = (AppContentCondition) obj;
        return C4585c.m23634a(appContentCondition2.mo20572c(), appContentCondition.mo20572c()) && C4585c.m23634a(appContentCondition2.mo20571d(), appContentCondition.mo20571d()) && C4585c.m23634a(appContentCondition2.mo20570e(), appContentCondition.mo20570e()) && C4585c.m23634a(appContentCondition2.mo20569f(), appContentCondition.mo20569f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m20575b(AppContentCondition appContentCondition) {
        return C4585c.m23635a(appContentCondition).m23632a("DefaultValue", appContentCondition.mo20572c()).m23632a("ExpectedValue", appContentCondition.mo20571d()).m23632a("Predicate", appContentCondition.mo20570e()).m23632a("PredicateParameters", appContentCondition.mo20569f()).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCondition
    /* renamed from: c */
    public String mo20572c() {
        return this.f19377b;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCondition
    /* renamed from: d */
    public String mo20571d() {
        return this.f19378c;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCondition
    /* renamed from: e */
    public String mo20570e() {
        return this.f19379d;
    }

    public boolean equals(Object obj) {
        return m20576a(this, obj);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentCondition
    /* renamed from: f */
    public Bundle mo20569f() {
        return this.f19380e;
    }

    /* renamed from: g */
    public int m20574g() {
        return this.f19376a;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: h */
    public AppContentCondition mo7785a() {
        return this;
    }

    public int hashCode() {
        return m20577a(this);
    }

    public String toString() {
        return m20575b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5341d.m20529a(this, parcel, i);
    }
}
