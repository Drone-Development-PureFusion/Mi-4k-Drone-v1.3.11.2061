package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class AppContentTupleEntity extends AbstractSafeParcelable implements AppContentTuple {
    public static final C5344g CREATOR = new C5344g();

    /* renamed from: a */
    private final int f19393a;

    /* renamed from: b */
    private final String f19394b;

    /* renamed from: c */
    private final String f19395c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppContentTupleEntity(int i, String str, String str2) {
        this.f19393a = i;
        this.f19394b = str;
        this.f19395c = str2;
    }

    public AppContentTupleEntity(AppContentTuple appContentTuple) {
        this.f19393a = 1;
        this.f19394b = appContentTuple.mo20543c();
        this.f19395c = appContentTuple.mo20542d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20548a(AppContentTuple appContentTuple) {
        return C4585c.m23633a(appContentTuple.mo20543c(), appContentTuple.mo20542d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m20547a(AppContentTuple appContentTuple, Object obj) {
        if (!(obj instanceof AppContentTuple)) {
            return false;
        }
        if (appContentTuple == obj) {
            return true;
        }
        AppContentTuple appContentTuple2 = (AppContentTuple) obj;
        return C4585c.m23634a(appContentTuple2.mo20543c(), appContentTuple.mo20543c()) && C4585c.m23634a(appContentTuple2.mo20542d(), appContentTuple.mo20542d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m20546b(AppContentTuple appContentTuple) {
        return C4585c.m23635a(appContentTuple).m23632a("Name", appContentTuple.mo20543c()).m23632a("Value", appContentTuple.mo20542d()).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentTuple
    /* renamed from: c */
    public String mo20543c() {
        return this.f19394b;
    }

    @Override // com.google.android.gms.games.appcontent.AppContentTuple
    /* renamed from: d */
    public String mo20542d() {
        return this.f19395c;
    }

    /* renamed from: e */
    public int m20545e() {
        return this.f19393a;
    }

    public boolean equals(Object obj) {
        return m20547a(this, obj);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: f */
    public AppContentTuple mo7785a() {
        return this;
    }

    public int hashCode() {
        return m20548a(this);
    }

    public String toString() {
        return m20546b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5344g.m20521a(this, parcel, i);
    }
}
