package com.p079a.p080a;
/* renamed from: com.a.a.m */
/* loaded from: classes.dex */
public final class C0878m implements AbstractC0866c {

    /* renamed from: a */
    private static final C0863ab f1842a = new C0863ab(44225);

    /* renamed from: b */
    private byte[] f1843b;

    /* renamed from: c */
    private byte[] f1844c;

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: a */
    public C0863ab mo37484a() {
        return f1842a;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: a */
    public void mo37483a(byte[] bArr, int i, int i2) {
        this.f1843b = new byte[i2];
        System.arraycopy(bArr, i, this.f1843b, 0, i2);
    }

    @Override // com.p079a.p080a.AbstractC0866c
    /* renamed from: b */
    public void mo37536b(byte[] bArr, int i, int i2) {
        this.f1844c = new byte[i2];
        System.arraycopy(bArr, i, this.f1844c, 0, i2);
        if (this.f1843b == null) {
            mo37483a(bArr, i, i2);
        }
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: c */
    public byte[] mo37482c() {
        return this.f1844c == null ? mo37480e() : AbstractC0864ac.m37588a(this.f1844c);
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: d */
    public C0863ab mo37481d() {
        return this.f1844c == null ? mo37479f() : new C0863ab(this.f1844c.length);
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: e */
    public byte[] mo37480e() {
        return AbstractC0864ac.m37588a(this.f1843b);
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: f */
    public C0863ab mo37479f() {
        return new C0863ab(this.f1843b == null ? 0 : this.f1843b.length);
    }
}
