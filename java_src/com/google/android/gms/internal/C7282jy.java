package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.jy */
/* loaded from: classes2.dex */
public class C7282jy {

    /* renamed from: a */
    private final C7337lc f24388a;

    /* renamed from: b */
    private final boolean f24389b;

    /* renamed from: c */
    private final boolean f24390c;

    public C7282jy(C7337lc c7337lc, boolean z, boolean z2) {
        this.f24388a = c7337lc;
        this.f24389b = z;
        this.f24390c = z2;
    }

    /* renamed from: a */
    public boolean m14959a() {
        return this.f24389b;
    }

    /* renamed from: a */
    public boolean m14958a(C7160ij c7160ij) {
        return c7160ij.m15356h() ? m14959a() && !this.f24390c : m14957a(c7160ij.m15363d());
    }

    /* renamed from: a */
    public boolean m14957a(C7319kv c7319kv) {
        return (m14959a() && !this.f24390c) || this.f24388a.m14773a().mo14741a(c7319kv);
    }

    /* renamed from: b */
    public boolean m14956b() {
        return this.f24390c;
    }

    /* renamed from: c */
    public AbstractC7344lh m14955c() {
        return this.f24388a.m14773a();
    }

    /* renamed from: d */
    public C7337lc m14954d() {
        return this.f24388a;
    }
}
