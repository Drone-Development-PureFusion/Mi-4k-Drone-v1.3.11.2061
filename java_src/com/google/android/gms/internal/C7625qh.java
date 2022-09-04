package com.google.android.gms.internal;

import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.internal.qh */
/* loaded from: classes2.dex */
public final class C7625qh extends AbstractC7649rd {

    /* renamed from: a */
    public int f25309a;

    /* renamed from: b */
    public int f25310b;

    /* renamed from: c */
    public long f25311c;

    /* renamed from: d */
    public int f25312d;

    /* renamed from: e */
    public int f25313e;

    /* renamed from: f */
    public double f25314f;

    /* renamed from: g */
    public double f25315g;

    /* renamed from: h */
    public long f25316h;

    public C7625qh() {
        m14044b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25309a != 0) {
            mo13820a += C7640qw.m13937c(1, this.f25309a);
        }
        if (this.f25310b != 0) {
            mo13820a += C7640qw.m13937c(2, this.f25310b);
        }
        if (this.f25311c != 0) {
            mo13820a += C7640qw.m13920f(3, this.f25311c);
        }
        if (this.f25312d != 0) {
            mo13820a += C7640qw.m13937c(4, this.f25312d);
        }
        if (this.f25313e != 0) {
            mo13820a += C7640qw.m13937c(5, this.f25313e);
        }
        if (Double.doubleToLongBits(this.f25314f) != Double.doubleToLongBits(C9755a.f30449c)) {
            mo13820a += C7640qw.m13953b(6, this.f25314f);
        }
        if (Double.doubleToLongBits(this.f25315g) != Double.doubleToLongBits(C9755a.f30449c)) {
            mo13820a += C7640qw.m13953b(7, this.f25315g);
        }
        return this.f25316h != 0 ? mo13820a + C7640qw.m13920f(8, this.f25316h) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7625qh mo13816b(C7639qv c7639qv) {
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
                            this.f25309a = m13997g;
                            continue;
                    }
                case 16:
                    int m13997g2 = c7639qv.m13997g();
                    switch (m13997g2) {
                        case 0:
                        case 1:
                            this.f25310b = m13997g2;
                            continue;
                    }
                case 24:
                    this.f25311c = c7639qv.m13999f();
                    break;
                case 32:
                    this.f25312d = c7639qv.m13997g();
                    break;
                case 40:
                    this.f25313e = c7639qv.m13997g();
                    break;
                case 49:
                    this.f25314f = c7639qv.m14005c();
                    break;
                case 57:
                    this.f25315g = c7639qv.m14005c();
                    break;
                case 64:
                    this.f25316h = c7639qv.m13999f();
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
        if (this.f25309a != 0) {
            c7640qw.m13973a(1, this.f25309a);
        }
        if (this.f25310b != 0) {
            c7640qw.m13973a(2, this.f25310b);
        }
        if (this.f25311c != 0) {
            c7640qw.m13950b(3, this.f25311c);
        }
        if (this.f25312d != 0) {
            c7640qw.m13973a(4, this.f25312d);
        }
        if (this.f25313e != 0) {
            c7640qw.m13973a(5, this.f25313e);
        }
        if (Double.doubleToLongBits(this.f25314f) != Double.doubleToLongBits(C9755a.f30449c)) {
            c7640qw.m13975a(6, this.f25314f);
        }
        if (Double.doubleToLongBits(this.f25315g) != Double.doubleToLongBits(C9755a.f30449c)) {
            c7640qw.m13975a(7, this.f25315g);
        }
        if (this.f25316h != 0) {
            c7640qw.m13950b(8, this.f25316h);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7625qh m14044b() {
        this.f25309a = 0;
        this.f25310b = 0;
        this.f25311c = 0L;
        this.f25312d = 0;
        this.f25313e = 0;
        this.f25314f = C9755a.f30449c;
        this.f25315g = C9755a.f30449c;
        this.f25316h = 0L;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7625qh)) {
            return false;
        }
        C7625qh c7625qh = (C7625qh) obj;
        return this.f25309a == c7625qh.f25309a && this.f25310b == c7625qh.f25310b && this.f25311c == c7625qh.f25311c && this.f25312d == c7625qh.f25312d && this.f25313e == c7625qh.f25313e && Double.doubleToLongBits(this.f25314f) == Double.doubleToLongBits(c7625qh.f25314f) && Double.doubleToLongBits(this.f25315g) == Double.doubleToLongBits(c7625qh.f25315g) && this.f25316h == c7625qh.f25316h;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f25314f);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f25315g);
        return ((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f25309a) * 31) + this.f25310b) * 31) + ((int) (this.f25311c ^ (this.f25311c >>> 32)))) * 31) + this.f25312d) * 31) + this.f25313e) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (this.f25316h ^ (this.f25316h >>> 32)));
    }
}
