package com.google.android.gms.internal;

import android.location.Location;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.mediation.AbstractC3790a;
import java.util.Date;
import java.util.Set;
@aaa
/* renamed from: com.google.android.gms.internal.xw */
/* loaded from: classes.dex */
public final class C8023xw implements AbstractC3790a {

    /* renamed from: d */
    private final Date f26317d;

    /* renamed from: e */
    private final int f26318e;

    /* renamed from: f */
    private final Set<String> f26319f;

    /* renamed from: g */
    private final boolean f26320g;

    /* renamed from: h */
    private final Location f26321h;

    /* renamed from: i */
    private final int f26322i;

    /* renamed from: j */
    private final boolean f26323j;

    public C8023xw(@Nullable Date date, int i, @Nullable Set<String> set, @Nullable Location location, boolean z, int i2, boolean z2) {
        this.f26317d = date;
        this.f26318e = i;
        this.f26319f = set;
        this.f26321h = location;
        this.f26320g = z;
        this.f26322i = i2;
        this.f26323j = z2;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: a */
    public Date mo12987a() {
        return this.f26317d;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: b */
    public int mo12986b() {
        return this.f26318e;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: c */
    public Set<String> mo12985c() {
        return this.f26319f;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: d */
    public Location mo12984d() {
        return this.f26321h;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: e */
    public int mo12983e() {
        return this.f26322i;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: f */
    public boolean mo12982f() {
        return this.f26320g;
    }

    @Override // com.google.android.gms.ads.mediation.AbstractC3790a
    /* renamed from: g */
    public boolean mo12981g() {
        return this.f26323j;
    }
}
