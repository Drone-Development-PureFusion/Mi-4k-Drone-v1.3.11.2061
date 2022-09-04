package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qk */
/* loaded from: classes2.dex */
public final class C7628qk extends AbstractC7649rd {

    /* renamed from: a */
    public int f25322a;

    /* renamed from: b */
    public long f25323b;

    /* renamed from: c */
    public int f25324c;

    public C7628qk() {
        m14038b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25322a != 0) {
            mo13820a += C7640qw.m13937c(1, this.f25322a);
        }
        if (this.f25323b != 0) {
            mo13820a += C7640qw.m13920f(2, this.f25323b);
        }
        return this.f25324c != 0 ? mo13820a + C7640qw.m13937c(3, this.f25324c) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7628qk mo13816b(C7639qv c7639qv) {
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
                            this.f25322a = m13997g;
                            continue;
                    }
                case 16:
                    this.f25323b = c7639qv.m13999f();
                    break;
                case 24:
                    int m13997g2 = c7639qv.m13997g();
                    switch (m13997g2) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25324c = m13997g2;
                            continue;
                    }
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
        if (this.f25322a != 0) {
            c7640qw.m13973a(1, this.f25322a);
        }
        if (this.f25323b != 0) {
            c7640qw.m13950b(2, this.f25323b);
        }
        if (this.f25324c != 0) {
            c7640qw.m13973a(3, this.f25324c);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7628qk m14038b() {
        this.f25322a = 0;
        this.f25323b = 0L;
        this.f25324c = 0;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7628qk)) {
            return false;
        }
        C7628qk c7628qk = (C7628qk) obj;
        return this.f25322a == c7628qk.f25322a && this.f25323b == c7628qk.f25323b && this.f25324c == c7628qk.f25324c;
    }

    public int hashCode() {
        return ((((((getClass().getName().hashCode() + 527) * 31) + this.f25322a) * 31) + ((int) (this.f25323b ^ (this.f25323b >>> 32)))) * 31) + this.f25324c;
    }
}
