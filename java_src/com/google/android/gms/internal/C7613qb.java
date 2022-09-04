package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qb */
/* loaded from: classes2.dex */
public final class C7613qb extends AbstractC7642qx<C7613qb> {

    /* renamed from: a */
    public long f25263a;

    /* renamed from: b */
    public long f25264b;

    /* renamed from: c */
    public int f25265c;

    /* renamed from: d */
    public String f25266d;

    /* renamed from: e */
    public String f25267e;

    public C7613qb() {
        m14067b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25263a != 0) {
            mo13820a += C7640qw.m13920f(1, this.f25263a);
        }
        if (this.f25264b != 0) {
            mo13820a += C7640qw.m13920f(2, this.f25264b);
        }
        if (this.f25265c != 0) {
            mo13820a += C7640qw.m13937c(3, this.f25265c);
        }
        if (!this.f25266d.equals("")) {
            mo13820a += C7640qw.m13948b(4, this.f25266d);
        }
        return !this.f25267e.equals("") ? mo13820a + C7640qw.m13948b(5, this.f25267e) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7613qb mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 8:
                    this.f25263a = c7639qv.m13999f();
                    break;
                case 16:
                    this.f25264b = c7639qv.m13999f();
                    break;
                case 24:
                    this.f25265c = c7639qv.m13997g();
                    break;
                case 34:
                    this.f25266d = c7639qv.m13993j();
                    break;
                case 42:
                    this.f25267e = c7639qv.m13993j();
                    break;
                default:
                    if (super.m13906a(c7639qv, m14015a)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public void mo13818a(C7640qw c7640qw) {
        if (this.f25263a != 0) {
            c7640qw.m13950b(1, this.f25263a);
        }
        if (this.f25264b != 0) {
            c7640qw.m13950b(2, this.f25264b);
        }
        if (this.f25265c != 0) {
            c7640qw.m13973a(3, this.f25265c);
        }
        if (!this.f25266d.equals("")) {
            c7640qw.m13970a(4, this.f25266d);
        }
        if (!this.f25267e.equals("")) {
            c7640qw.m13970a(5, this.f25267e);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7613qb m14067b() {
        this.f25263a = 0L;
        this.f25264b = 0L;
        this.f25265c = 0;
        this.f25266d = "";
        this.f25267e = "";
        this.f25374ag = null;
        this.f25391ah = -1;
        return this;
    }
}
