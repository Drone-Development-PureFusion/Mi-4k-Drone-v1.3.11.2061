package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qt */
/* loaded from: classes2.dex */
public final class C7637qt extends AbstractC7649rd {

    /* renamed from: a */
    public int f25354a;

    /* renamed from: b */
    public String f25355b;

    /* renamed from: c */
    public long f25356c;

    /* renamed from: d */
    public long f25357d;

    /* renamed from: e */
    public C7614qc f25358e;

    public C7637qt() {
        m14018b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25354a != 0) {
            mo13820a += C7640qw.m13937c(1, this.f25354a);
        }
        if (!this.f25355b.equals("")) {
            mo13820a += C7640qw.m13948b(2, this.f25355b);
        }
        if (this.f25356c != 0) {
            mo13820a += C7640qw.m13920f(3, this.f25356c);
        }
        if (this.f25357d != 0) {
            mo13820a += C7640qw.m13920f(4, this.f25357d);
        }
        return this.f25358e != null ? mo13820a + C7640qw.m13935c(5, this.f25358e) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7637qt mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 8:
                    int m13997g = c7639qv.m13997g();
                    switch (m13997g) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            this.f25354a = m13997g;
                            continue;
                    }
                case 18:
                    this.f25355b = c7639qv.m13993j();
                    break;
                case 24:
                    this.f25356c = c7639qv.m13999f();
                    break;
                case 32:
                    this.f25357d = c7639qv.m13999f();
                    break;
                case 42:
                    if (this.f25358e == null) {
                        this.f25358e = new C7614qc();
                    }
                    c7639qv.m14011a(this.f25358e);
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
        if (this.f25354a != 0) {
            c7640qw.m13973a(1, this.f25354a);
        }
        if (!this.f25355b.equals("")) {
            c7640qw.m13970a(2, this.f25355b);
        }
        if (this.f25356c != 0) {
            c7640qw.m13950b(3, this.f25356c);
        }
        if (this.f25357d != 0) {
            c7640qw.m13950b(4, this.f25357d);
        }
        if (this.f25358e != null) {
            c7640qw.m13971a(5, this.f25358e);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7637qt m14018b() {
        this.f25354a = 0;
        this.f25355b = "";
        this.f25356c = 0L;
        this.f25357d = 0L;
        this.f25358e = null;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7637qt)) {
            return false;
        }
        C7637qt c7637qt = (C7637qt) obj;
        if (this.f25354a != c7637qt.f25354a) {
            return false;
        }
        if (this.f25355b == null) {
            if (c7637qt.f25355b != null) {
                return false;
            }
        } else if (!this.f25355b.equals(c7637qt.f25355b)) {
            return false;
        }
        if (this.f25356c == c7637qt.f25356c && this.f25357d == c7637qt.f25357d) {
            return this.f25358e == null ? c7637qt.f25358e == null : this.f25358e.equals(c7637qt.f25358e);
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((this.f25355b == null ? 0 : this.f25355b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f25354a) * 31)) * 31) + ((int) (this.f25356c ^ (this.f25356c >>> 32)))) * 31) + ((int) (this.f25357d ^ (this.f25357d >>> 32)))) * 31;
        if (this.f25358e != null) {
            i = this.f25358e.hashCode();
        }
        return hashCode + i;
    }
}
