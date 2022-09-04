package com.p079a.p080a;
/* renamed from: com.a.a.n */
/* loaded from: classes.dex */
public class C0879n implements AbstractC0866c {

    /* renamed from: a */
    private C0863ab f1845a;

    /* renamed from: b */
    private byte[] f1846b;

    /* renamed from: c */
    private byte[] f1847c;

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: a */
    public C0863ab mo37484a() {
        return this.f1845a;
    }

    /* renamed from: a */
    public void m37547a(C0863ab c0863ab) {
        this.f1845a = c0863ab;
    }

    /* renamed from: a */
    public void m37546a(byte[] bArr) {
        this.f1846b = AbstractC0864ac.m37588a(bArr);
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: a */
    public void mo37483a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        m37546a(bArr2);
    }

    /* renamed from: b */
    public void m37545b(byte[] bArr) {
        this.f1847c = AbstractC0864ac.m37588a(bArr);
    }

    @Override // com.p079a.p080a.AbstractC0866c
    /* renamed from: b */
    public void mo37536b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        m37545b(bArr2);
        if (this.f1846b == null) {
            m37546a(bArr2);
        }
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: c */
    public byte[] mo37482c() {
        return this.f1847c != null ? AbstractC0864ac.m37588a(this.f1847c) : mo37480e();
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: d */
    public C0863ab mo37481d() {
        return this.f1847c != null ? new C0863ab(this.f1847c.length) : mo37479f();
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: e */
    public byte[] mo37480e() {
        return AbstractC0864ac.m37588a(this.f1846b);
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: f */
    public C0863ab mo37479f() {
        return new C0863ab(this.f1846b.length);
    }
}
