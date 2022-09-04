package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.aaa;
import java.util.List;
@aaa
/* loaded from: classes.dex */
public final class AdRequestParcel extends AbstractSafeParcelable {
    public static final C3585x CREATOR = new C3585x();

    /* renamed from: a */
    public final int f13845a;

    /* renamed from: b */
    public final long f13846b;

    /* renamed from: c */
    public final Bundle f13847c;

    /* renamed from: d */
    public final int f13848d;

    /* renamed from: e */
    public final List<String> f13849e;

    /* renamed from: f */
    public final boolean f13850f;

    /* renamed from: g */
    public final int f13851g;

    /* renamed from: h */
    public final boolean f13852h;

    /* renamed from: i */
    public final String f13853i;

    /* renamed from: j */
    public final SearchAdRequestParcel f13854j;

    /* renamed from: k */
    public final Location f13855k;

    /* renamed from: l */
    public final String f13856l;

    /* renamed from: m */
    public final Bundle f13857m;

    /* renamed from: n */
    public final Bundle f13858n;

    /* renamed from: o */
    public final List<String> f13859o;

    /* renamed from: p */
    public final String f13860p;

    /* renamed from: q */
    public final String f13861q;

    /* renamed from: r */
    public final boolean f13862r;

    public AdRequestParcel(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, SearchAdRequestParcel searchAdRequestParcel, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.f13845a = i;
        this.f13846b = j;
        this.f13847c = bundle == null ? new Bundle() : bundle;
        this.f13848d = i2;
        this.f13849e = list;
        this.f13850f = z;
        this.f13851g = i3;
        this.f13852h = z2;
        this.f13853i = str;
        this.f13854j = searchAdRequestParcel;
        this.f13855k = location;
        this.f13856l = str2;
        this.f13857m = bundle2 == null ? new Bundle() : bundle2;
        this.f13858n = bundle3;
        this.f13859o = list2;
        this.f13860p = str3;
        this.f13861q = str4;
        this.f13862r = z3;
    }

    /* renamed from: a */
    public static void m27640a(AdRequestParcel adRequestParcel) {
        adRequestParcel.f13857m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", adRequestParcel.f13847c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AdRequestParcel)) {
            return false;
        }
        AdRequestParcel adRequestParcel = (AdRequestParcel) obj;
        return this.f13845a == adRequestParcel.f13845a && this.f13846b == adRequestParcel.f13846b && C4585c.m23634a(this.f13847c, adRequestParcel.f13847c) && this.f13848d == adRequestParcel.f13848d && C4585c.m23634a(this.f13849e, adRequestParcel.f13849e) && this.f13850f == adRequestParcel.f13850f && this.f13851g == adRequestParcel.f13851g && this.f13852h == adRequestParcel.f13852h && C4585c.m23634a(this.f13853i, adRequestParcel.f13853i) && C4585c.m23634a(this.f13854j, adRequestParcel.f13854j) && C4585c.m23634a(this.f13855k, adRequestParcel.f13855k) && C4585c.m23634a(this.f13856l, adRequestParcel.f13856l) && C4585c.m23634a(this.f13857m, adRequestParcel.f13857m) && C4585c.m23634a(this.f13858n, adRequestParcel.f13858n) && C4585c.m23634a(this.f13859o, adRequestParcel.f13859o) && C4585c.m23634a(this.f13860p, adRequestParcel.f13860p) && C4585c.m23634a(this.f13861q, adRequestParcel.f13861q) && this.f13862r == adRequestParcel.f13862r;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f13845a), Long.valueOf(this.f13846b), this.f13847c, Integer.valueOf(this.f13848d), this.f13849e, Boolean.valueOf(this.f13850f), Integer.valueOf(this.f13851g), Boolean.valueOf(this.f13852h), this.f13853i, this.f13854j, this.f13855k, this.f13856l, this.f13857m, this.f13858n, this.f13859o, this.f13860p, this.f13861q, Boolean.valueOf(this.f13862r));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3585x.m27415a(this, parcel, i);
    }
}
