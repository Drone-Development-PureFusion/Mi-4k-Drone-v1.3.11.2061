package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.ki */
/* loaded from: classes2.dex */
public class C7299ki {

    /* renamed from: a */
    private final C7282jy f24441a;

    /* renamed from: b */
    private final C7282jy f24442b;

    public C7299ki(C7282jy c7282jy, C7282jy c7282jy2) {
        this.f24441a = c7282jy;
        this.f24442b = c7282jy2;
    }

    /* renamed from: a */
    public C7282jy m14883a() {
        return this.f24441a;
    }

    /* renamed from: a */
    public C7299ki m14882a(C7337lc c7337lc, boolean z, boolean z2) {
        return new C7299ki(new C7282jy(c7337lc, z, z2), this.f24442b);
    }

    /* renamed from: b */
    public C7299ki m14880b(C7337lc c7337lc, boolean z, boolean z2) {
        return new C7299ki(this.f24441a, new C7282jy(c7337lc, z, z2));
    }

    /* renamed from: b */
    public AbstractC7344lh m14881b() {
        if (this.f24441a.m14959a()) {
            return this.f24441a.m14955c();
        }
        return null;
    }

    /* renamed from: c */
    public C7282jy m14879c() {
        return this.f24442b;
    }

    /* renamed from: d */
    public AbstractC7344lh m14878d() {
        if (this.f24442b.m14959a()) {
            return this.f24442b.m14955c();
        }
        return null;
    }
}
