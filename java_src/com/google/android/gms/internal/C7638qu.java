package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qu */
/* loaded from: classes2.dex */
public final class C7638qu extends AbstractC7649rd {

    /* renamed from: a */
    public int f25359a;

    /* renamed from: b */
    public long f25360b;

    /* renamed from: c */
    public float f25361c;

    /* renamed from: d */
    public int f25362d;

    public C7638qu() {
        m14016b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25359a != 0) {
            mo13820a += C7640qw.m13937c(1, this.f25359a);
        }
        if (this.f25360b != 0) {
            mo13820a += C7640qw.m13920f(2, this.f25360b);
        }
        if (Float.floatToIntBits(this.f25361c) != Float.floatToIntBits(0.0f)) {
            mo13820a += C7640qw.m13952b(3, this.f25361c);
        }
        return this.f25362d != 0 ? mo13820a + C7640qw.m13937c(4, this.f25362d) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7638qu mo13816b(C7639qv c7639qv) {
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
                            this.f25359a = m13997g;
                            continue;
                    }
                case 16:
                    this.f25360b = c7639qv.m13999f();
                    break;
                case 29:
                    this.f25361c = c7639qv.m14003d();
                    break;
                case 32:
                    this.f25362d = c7639qv.m13997g();
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
        if (this.f25359a != 0) {
            c7640qw.m13973a(1, this.f25359a);
        }
        if (this.f25360b != 0) {
            c7640qw.m13950b(2, this.f25360b);
        }
        if (Float.floatToIntBits(this.f25361c) != Float.floatToIntBits(0.0f)) {
            c7640qw.m13974a(3, this.f25361c);
        }
        if (this.f25362d != 0) {
            c7640qw.m13973a(4, this.f25362d);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7638qu m14016b() {
        this.f25359a = 0;
        this.f25360b = 0L;
        this.f25361c = 0.0f;
        this.f25362d = 0;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7638qu)) {
            return false;
        }
        C7638qu c7638qu = (C7638qu) obj;
        return this.f25359a == c7638qu.f25359a && this.f25360b == c7638qu.f25360b && Float.floatToIntBits(this.f25361c) == Float.floatToIntBits(c7638qu.f25361c) && this.f25362d == c7638qu.f25362d;
    }

    public int hashCode() {
        return ((((((((getClass().getName().hashCode() + 527) * 31) + this.f25359a) * 31) + ((int) (this.f25360b ^ (this.f25360b >>> 32)))) * 31) + Float.floatToIntBits(this.f25361c)) * 31) + this.f25362d;
    }
}
