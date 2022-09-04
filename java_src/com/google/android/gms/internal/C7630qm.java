package com.google.android.gms.internal;

import com.google.firebase.p253b.C9755a;
/* renamed from: com.google.android.gms.internal.qm */
/* loaded from: classes2.dex */
public final class C7630qm extends AbstractC7649rd {

    /* renamed from: a */
    public int f25332a;

    /* renamed from: b */
    public double f25333b;

    /* renamed from: c */
    public double f25334c;

    /* renamed from: d */
    public long f25335d;

    /* renamed from: e */
    public int[] f25336e;

    public C7630qm() {
        m14034b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25332a != 0) {
            mo13820a += C7640qw.m13937c(1, this.f25332a);
        }
        if (Double.doubleToLongBits(this.f25333b) != Double.doubleToLongBits(C9755a.f30449c)) {
            mo13820a += C7640qw.m13953b(2, this.f25333b);
        }
        if (Double.doubleToLongBits(this.f25334c) != Double.doubleToLongBits(C9755a.f30449c)) {
            mo13820a += C7640qw.m13953b(3, this.f25334c);
        }
        if (this.f25335d != 0) {
            mo13820a += C7640qw.m13920f(4, this.f25335d);
        }
        if (this.f25336e == null || this.f25336e.length <= 0) {
            return mo13820a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f25336e.length; i2++) {
            i += C7640qw.m13938c(this.f25336e[i2]);
        }
        return mo13820a + i + (this.f25336e.length * 1);
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7630qm mo13816b(C7639qv c7639qv) {
        int i;
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
                            this.f25332a = m13997g;
                            continue;
                    }
                case 17:
                    this.f25333b = c7639qv.m14005c();
                    break;
                case 25:
                    this.f25334c = c7639qv.m14005c();
                    break;
                case 32:
                    this.f25335d = c7639qv.m13999f();
                    break;
                case 40:
                    int m13839b = C7652rg.m13839b(c7639qv, 40);
                    int[] iArr = new int[m13839b];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < m13839b) {
                        if (i2 != 0) {
                            c7639qv.m14015a();
                        }
                        int m13997g2 = c7639qv.m13997g();
                        switch (m13997g2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                i = i3 + 1;
                                iArr[i3] = m13997g2;
                                break;
                            default:
                                i = i3;
                                break;
                        }
                        i2++;
                        i3 = i;
                    }
                    if (i3 != 0) {
                        int length = this.f25336e == null ? 0 : this.f25336e.length;
                        if (length != 0 || i3 != m13839b) {
                            int[] iArr2 = new int[length + i3];
                            if (length != 0) {
                                System.arraycopy(this.f25336e, 0, iArr2, 0, length);
                            }
                            System.arraycopy(iArr, 0, iArr2, length, i3);
                            this.f25336e = iArr2;
                            break;
                        } else {
                            this.f25336e = iArr;
                            break;
                        }
                    } else {
                        break;
                    }
                case 42:
                    int m14002d = c7639qv.m14002d(c7639qv.m13989n());
                    int m13983t = c7639qv.m13983t();
                    int i4 = 0;
                    while (c7639qv.m13985r() > 0) {
                        switch (c7639qv.m13997g()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                i4++;
                                break;
                        }
                    }
                    if (i4 != 0) {
                        c7639qv.m13998f(m13983t);
                        int length2 = this.f25336e == null ? 0 : this.f25336e.length;
                        int[] iArr3 = new int[i4 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f25336e, 0, iArr3, 0, length2);
                        }
                        while (c7639qv.m13985r() > 0) {
                            int m13997g3 = c7639qv.m13997g();
                            switch (m13997g3) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    iArr3[length2] = m13997g3;
                                    length2++;
                                    break;
                            }
                        }
                        this.f25336e = iArr3;
                    }
                    c7639qv.m14000e(m14002d);
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
        if (this.f25332a != 0) {
            c7640qw.m13973a(1, this.f25332a);
        }
        if (Double.doubleToLongBits(this.f25333b) != Double.doubleToLongBits(C9755a.f30449c)) {
            c7640qw.m13975a(2, this.f25333b);
        }
        if (Double.doubleToLongBits(this.f25334c) != Double.doubleToLongBits(C9755a.f30449c)) {
            c7640qw.m13975a(3, this.f25334c);
        }
        if (this.f25335d != 0) {
            c7640qw.m13950b(4, this.f25335d);
        }
        if (this.f25336e != null && this.f25336e.length > 0) {
            for (int i = 0; i < this.f25336e.length; i++) {
                c7640qw.m13973a(5, this.f25336e[i]);
            }
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7630qm m14034b() {
        this.f25332a = 0;
        this.f25333b = C9755a.f30449c;
        this.f25334c = C9755a.f30449c;
        this.f25335d = 0L;
        this.f25336e = C7652rg.f25394a;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7630qm)) {
            return false;
        }
        C7630qm c7630qm = (C7630qm) obj;
        return this.f25332a == c7630qm.f25332a && Double.doubleToLongBits(this.f25333b) == Double.doubleToLongBits(c7630qm.f25333b) && Double.doubleToLongBits(this.f25334c) == Double.doubleToLongBits(c7630qm.f25334c) && this.f25335d == c7630qm.f25335d && C7647rb.m13871a(this.f25336e, c7630qm.f25336e);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f25333b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f25334c);
        return ((((((((((getClass().getName().hashCode() + 527) * 31) + this.f25332a) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (this.f25335d ^ (this.f25335d >>> 32)))) * 31) + C7647rb.m13872a(this.f25336e);
    }
}
