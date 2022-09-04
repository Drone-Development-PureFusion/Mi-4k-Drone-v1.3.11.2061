package com.google.android.gms.internal;

import android.location.Location;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.C3473i;
import com.google.android.gms.ads.formats.C3458b;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.AbstractC3815l;
import java.util.Date;
import java.util.List;
import java.util.Set;
@aaa
/* renamed from: com.google.android.gms.internal.yc */
/* loaded from: classes.dex */
public final class C8030yc implements AbstractC3815l {

    /* renamed from: d */
    private final Date f26330d;

    /* renamed from: e */
    private final int f26331e;

    /* renamed from: f */
    private final Set<String> f26332f;

    /* renamed from: g */
    private final boolean f26333g;

    /* renamed from: h */
    private final Location f26334h;

    /* renamed from: i */
    private final int f26335i;

    /* renamed from: j */
    private final NativeAdOptionsParcel f26336j;

    /* renamed from: k */
    private final List<String> f26337k;

    /* renamed from: l */
    private final boolean f26338l;

    public C8030yc(@Nullable Date date, int i, @Nullable Set<String> set, @Nullable Location location, boolean z, int i2, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list, boolean z2) {
        this.f26330d = date;
        this.f26331e = i;
        this.f26332f = set;
        this.f26334h = location;
        this.f26333g = z;
        this.f26335i = i2;
        this.f26336j = nativeAdOptionsParcel;
        this.f26337k = list;
        this.f26338l = z2;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: a */
    public Date mo12987a() {
        return this.f26330d;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: b */
    public int mo12986b() {
        return this.f26331e;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: c */
    public Set<String> mo12985c() {
        return this.f26332f;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: d */
    public Location mo12984d() {
        return this.f26334h;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: e */
    public int mo12983e() {
        return this.f26335i;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: f */
    public boolean mo12982f() {
        return this.f26333g;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: g */
    public boolean mo12981g() {
        return this.f26338l;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3815l
    /* renamed from: h */
    public C3458b mo12980h() {
        if (this.f26336j == null) {
            return null;
        }
        C3458b.C3461b m27721b = new C3458b.C3461b().m27724a(this.f26336j.f14075b).m27727a(this.f26336j.f14076c).m27721b(this.f26336j.f14077d);
        if (this.f26336j.f14074a >= 2) {
            m27721b.m27723b(this.f26336j.f14078e);
        }
        if (this.f26336j.f14074a >= 3 && this.f26336j.f14079f != null) {
            m27721b.m27725a(new C3473i.C3475a().m27691a(this.f26336j.f14079f.f13890b).m27693a());
        }
        return m27721b.m27728a();
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3815l
    /* renamed from: i */
    public boolean mo12979i() {
        return this.f26337k != null && this.f26337k.contains("2");
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3815l
    /* renamed from: j */
    public boolean mo12978j() {
        return this.f26337k != null && this.f26337k.contains("1");
    }
}
