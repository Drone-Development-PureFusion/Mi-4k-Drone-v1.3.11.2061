package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class AppContentAnnotationEntity extends AbstractSafeParcelable implements AppContentAnnotation {
    public static final C5339b CREATOR = new C5339b();

    /* renamed from: a */
    private final int f19353a;

    /* renamed from: b */
    private final String f19354b;

    /* renamed from: c */
    private final Uri f19355c;

    /* renamed from: d */
    private final String f19356d;

    /* renamed from: e */
    private final String f19357e;

    /* renamed from: f */
    private final String f19358f;

    /* renamed from: g */
    private final String f19359g;

    /* renamed from: h */
    private final int f19360h;

    /* renamed from: i */
    private final int f19361i;

    /* renamed from: j */
    private final Bundle f19362j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppContentAnnotationEntity(int i, String str, Uri uri, String str2, String str3, String str4, String str5, int i2, int i3, Bundle bundle) {
        this.f19353a = i;
        this.f19354b = str;
        this.f19357e = str3;
        this.f19359g = str5;
        this.f19360h = i2;
        this.f19355c = uri;
        this.f19361i = i3;
        this.f19358f = str4;
        this.f19362j = bundle;
        this.f19356d = str2;
    }

    public AppContentAnnotationEntity(AppContentAnnotation appContentAnnotation) {
        this.f19353a = 4;
        this.f19354b = appContentAnnotation.mo20605c();
        this.f19357e = appContentAnnotation.mo20604d();
        this.f19359g = appContentAnnotation.mo20603e();
        this.f19360h = appContentAnnotation.mo20602f();
        this.f19355c = appContentAnnotation.mo20601g();
        this.f19361i = appContentAnnotation.mo20599i();
        this.f19358f = appContentAnnotation.mo20598j();
        this.f19362j = appContentAnnotation.mo20600h();
        this.f19356d = appContentAnnotation.mo20597k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20610a(AppContentAnnotation appContentAnnotation) {
        return C4585c.m23633a(appContentAnnotation.mo20605c(), appContentAnnotation.mo20604d(), appContentAnnotation.mo20603e(), Integer.valueOf(appContentAnnotation.mo20602f()), appContentAnnotation.mo20601g(), Integer.valueOf(appContentAnnotation.mo20599i()), appContentAnnotation.mo20598j(), appContentAnnotation.mo20600h(), appContentAnnotation.mo20597k());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20609a(AppContentAnnotation appContentAnnotation, Object obj) {
        if (!(obj instanceof AppContentAnnotation)) {
            return false;
        }
        if (appContentAnnotation == obj) {
            return true;
        }
        AppContentAnnotation appContentAnnotation2 = (AppContentAnnotation) obj;
        return C4585c.m23634a(appContentAnnotation2.mo20605c(), appContentAnnotation.mo20605c()) && C4585c.m23634a(appContentAnnotation2.mo20604d(), appContentAnnotation.mo20604d()) && C4585c.m23634a(appContentAnnotation2.mo20603e(), appContentAnnotation.mo20603e()) && C4585c.m23634a(Integer.valueOf(appContentAnnotation2.mo20602f()), Integer.valueOf(appContentAnnotation.mo20602f())) && C4585c.m23634a(appContentAnnotation2.mo20601g(), appContentAnnotation.mo20601g()) && C4585c.m23634a(Integer.valueOf(appContentAnnotation2.mo20599i()), Integer.valueOf(appContentAnnotation.mo20599i())) && C4585c.m23634a(appContentAnnotation2.mo20598j(), appContentAnnotation.mo20598j()) && C4585c.m23634a(appContentAnnotation2.mo20600h(), appContentAnnotation.mo20600h()) && C4585c.m23634a(appContentAnnotation2.mo20597k(), appContentAnnotation.mo20597k());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m20608b(AppContentAnnotation appContentAnnotation) {
        return C4585c.m23635a(appContentAnnotation).m23632a("Description", appContentAnnotation.mo20605c()).m23632a("Id", appContentAnnotation.mo20604d()).m23632a("ImageDefaultId", appContentAnnotation.mo20603e()).m23632a("ImageHeight", Integer.valueOf(appContentAnnotation.mo20602f())).m23632a("ImageUri", appContentAnnotation.mo20601g()).m23632a("ImageWidth", Integer.valueOf(appContentAnnotation.mo20599i())).m23632a("LayoutSlot", appContentAnnotation.mo20598j()).m23632a("Modifiers", appContentAnnotation.mo20600h()).m23632a("Title", appContentAnnotation.mo20597k()).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: c */
    public String mo20605c() {
        return this.f19354b;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: d */
    public String mo20604d() {
        return this.f19357e;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: e */
    public String mo20603e() {
        return this.f19359g;
    }

    public boolean equals(Object obj) {
        return m20609a(this, obj);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: f */
    public int mo20602f() {
        return this.f19360h;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: g */
    public Uri mo20601g() {
        return this.f19355c;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: h */
    public Bundle mo20600h() {
        return this.f19362j;
    }

    public int hashCode() {
        return m20610a(this);
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: i */
    public int mo20599i() {
        return this.f19361i;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: j */
    public String mo20598j() {
        return this.f19358f;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentAnnotation
    /* renamed from: k */
    public String mo20597k() {
        return this.f19356d;
    }

    /* renamed from: l */
    public int m20607l() {
        return this.f19353a;
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: m */
    public AppContentAnnotation mo7785a() {
        return this;
    }

    public String toString() {
        return m20608b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5339b.m20535a(this, parcel, i);
    }
}
