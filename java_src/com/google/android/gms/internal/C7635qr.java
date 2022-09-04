package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qr */
/* loaded from: classes2.dex */
public final class C7635qr extends AbstractC7642qx<C7635qr> {

    /* renamed from: a */
    public int f25349a;

    /* renamed from: b */
    public long f25350b;

    /* renamed from: c */
    public long f25351c;

    public C7635qr() {
        m14023b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25349a != 3) {
            mo13820a += C7640qw.m13937c(1, this.f25349a);
        }
        if (this.f25350b != 0) {
            mo13820a += C7640qw.m13920f(2, this.f25350b);
        }
        return this.f25351c != 0 ? mo13820a + C7640qw.m13920f(3, this.f25351c) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7635qr mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 8:
                    int m13997g = c7639qv.m13997g();
                    switch (m13997g) {
                        case 1:
                        case 2:
                        case 3:
                            this.f25349a = m13997g;
                            continue;
                    }
                case 16:
                    this.f25350b = c7639qv.m13999f();
                    break;
                case 24:
                    this.f25351c = c7639qv.m13999f();
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
        if (this.f25349a != 3) {
            c7640qw.m13973a(1, this.f25349a);
        }
        if (this.f25350b != 0) {
            c7640qw.m13950b(2, this.f25350b);
        }
        if (this.f25351c != 0) {
            c7640qw.m13950b(3, this.f25351c);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7635qr m14023b() {
        this.f25349a = 3;
        this.f25350b = 0L;
        this.f25351c = 0L;
        this.f25374ag = null;
        this.f25391ah = -1;
        return this;
    }
}
