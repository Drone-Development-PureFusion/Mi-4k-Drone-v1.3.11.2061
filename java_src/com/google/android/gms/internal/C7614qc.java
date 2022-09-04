package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qc */
/* loaded from: classes2.dex */
public final class C7614qc extends AbstractC7649rd {

    /* renamed from: a */
    public int f25268a;

    /* renamed from: b */
    public int f25269b;

    /* renamed from: c */
    public int f25270c;

    /* renamed from: d */
    public int f25271d;

    /* renamed from: e */
    public int f25272e;

    /* renamed from: f */
    public int f25273f;

    public C7614qc() {
        m14065b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25268a != 0) {
            mo13820a += C7640qw.m13937c(1, this.f25268a);
        }
        if (this.f25269b != 0) {
            mo13820a += C7640qw.m13937c(2, this.f25269b);
        }
        if (this.f25270c != 0) {
            mo13820a += C7640qw.m13937c(3, this.f25270c);
        }
        if (this.f25271d != 0) {
            mo13820a += C7640qw.m13937c(4, this.f25271d);
        }
        if (this.f25272e != 0) {
            mo13820a += C7640qw.m13937c(5, this.f25272e);
        }
        return this.f25273f != 0 ? mo13820a + C7640qw.m13937c(6, this.f25273f) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7614qc mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 8:
                    this.f25268a = c7639qv.m13997g();
                    break;
                case 16:
                    this.f25269b = c7639qv.m13997g();
                    break;
                case 24:
                    this.f25270c = c7639qv.m13997g();
                    break;
                case 32:
                    this.f25271d = c7639qv.m13997g();
                    break;
                case 40:
                    this.f25272e = c7639qv.m13997g();
                    break;
                case 48:
                    this.f25273f = c7639qv.m13997g();
                    break;
                default:
                    if (C7652rg.m13841a(c7639qv, m14015a)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public void mo13818a(C7640qw c7640qw) {
        if (this.f25268a != 0) {
            c7640qw.m13973a(1, this.f25268a);
        }
        if (this.f25269b != 0) {
            c7640qw.m13973a(2, this.f25269b);
        }
        if (this.f25270c != 0) {
            c7640qw.m13973a(3, this.f25270c);
        }
        if (this.f25271d != 0) {
            c7640qw.m13973a(4, this.f25271d);
        }
        if (this.f25272e != 0) {
            c7640qw.m13973a(5, this.f25272e);
        }
        if (this.f25273f != 0) {
            c7640qw.m13973a(6, this.f25273f);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7614qc m14065b() {
        this.f25268a = 0;
        this.f25269b = 0;
        this.f25270c = 0;
        this.f25271d = 0;
        this.f25272e = 0;
        this.f25273f = 0;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7614qc)) {
            return false;
        }
        C7614qc c7614qc = (C7614qc) obj;
        return this.f25268a == c7614qc.f25268a && this.f25269b == c7614qc.f25269b && this.f25270c == c7614qc.f25270c && this.f25271d == c7614qc.f25271d && this.f25272e == c7614qc.f25272e && this.f25273f == c7614qc.f25273f;
    }

    public int hashCode() {
        return ((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f25268a) * 31) + this.f25269b) * 31) + this.f25270c) * 31) + this.f25271d) * 31) + this.f25272e) * 31) + this.f25273f;
    }
}
