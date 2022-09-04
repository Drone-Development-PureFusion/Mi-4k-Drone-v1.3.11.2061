package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qi */
/* loaded from: classes2.dex */
public final class C7626qi extends AbstractC7649rd {

    /* renamed from: a */
    public int f25317a;

    /* renamed from: b */
    public long f25318b;

    /* renamed from: c */
    public int[] f25319c;

    /* renamed from: d */
    public int[] f25320d;

    public C7626qi() {
        m14042b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25317a != 0) {
            mo13820a += C7640qw.m13937c(1, this.f25317a);
        }
        if (this.f25318b != 0) {
            mo13820a += C7640qw.m13920f(2, this.f25318b);
        }
        if (this.f25319c != null && this.f25319c.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f25319c.length; i2++) {
                i += C7640qw.m13938c(this.f25319c[i2]);
            }
            mo13820a = mo13820a + i + (this.f25319c.length * 1);
        }
        if (this.f25320d == null || this.f25320d.length <= 0) {
            return mo13820a;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f25320d.length; i4++) {
            i3 += C7640qw.m13938c(this.f25320d[i4]);
        }
        return mo13820a + i3 + (this.f25320d.length * 1);
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7626qi mo13816b(C7639qv c7639qv) {
        int i;
        int i2;
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
                            this.f25317a = m13997g;
                            continue;
                    }
                case 16:
                    this.f25318b = c7639qv.m13999f();
                    break;
                case 24:
                    int m13839b = C7652rg.m13839b(c7639qv, 24);
                    int[] iArr = new int[m13839b];
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < m13839b) {
                        if (i3 != 0) {
                            c7639qv.m14015a();
                        }
                        int m13997g2 = c7639qv.m13997g();
                        switch (m13997g2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                i2 = i4 + 1;
                                iArr[i4] = m13997g2;
                                break;
                            default:
                                i2 = i4;
                                break;
                        }
                        i3++;
                        i4 = i2;
                    }
                    if (i4 != 0) {
                        int length = this.f25319c == null ? 0 : this.f25319c.length;
                        if (length != 0 || i4 != m13839b) {
                            int[] iArr2 = new int[length + i4];
                            if (length != 0) {
                                System.arraycopy(this.f25319c, 0, iArr2, 0, length);
                            }
                            System.arraycopy(iArr, 0, iArr2, length, i4);
                            this.f25319c = iArr2;
                            break;
                        } else {
                            this.f25319c = iArr;
                            break;
                        }
                    } else {
                        break;
                    }
                case 26:
                    int m14002d = c7639qv.m14002d(c7639qv.m13989n());
                    int m13983t = c7639qv.m13983t();
                    int i5 = 0;
                    while (c7639qv.m13985r() > 0) {
                        switch (c7639qv.m13997g()) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                i5++;
                                break;
                        }
                    }
                    if (i5 != 0) {
                        c7639qv.m13998f(m13983t);
                        int length2 = this.f25319c == null ? 0 : this.f25319c.length;
                        int[] iArr3 = new int[i5 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f25319c, 0, iArr3, 0, length2);
                        }
                        while (c7639qv.m13985r() > 0) {
                            int m13997g3 = c7639qv.m13997g();
                            switch (m13997g3) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    iArr3[length2] = m13997g3;
                                    length2++;
                                    break;
                            }
                        }
                        this.f25319c = iArr3;
                    }
                    c7639qv.m14000e(m14002d);
                    break;
                case 32:
                    int m13839b2 = C7652rg.m13839b(c7639qv, 32);
                    int[] iArr4 = new int[m13839b2];
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < m13839b2) {
                        if (i6 != 0) {
                            c7639qv.m14015a();
                        }
                        int m13997g4 = c7639qv.m13997g();
                        switch (m13997g4) {
                            case 0:
                            case 1:
                            case 2:
                                i = i7 + 1;
                                iArr4[i7] = m13997g4;
                                break;
                            default:
                                i = i7;
                                break;
                        }
                        i6++;
                        i7 = i;
                    }
                    if (i7 != 0) {
                        int length3 = this.f25320d == null ? 0 : this.f25320d.length;
                        if (length3 != 0 || i7 != m13839b2) {
                            int[] iArr5 = new int[length3 + i7];
                            if (length3 != 0) {
                                System.arraycopy(this.f25320d, 0, iArr5, 0, length3);
                            }
                            System.arraycopy(iArr4, 0, iArr5, length3, i7);
                            this.f25320d = iArr5;
                            break;
                        } else {
                            this.f25320d = iArr4;
                            break;
                        }
                    } else {
                        break;
                    }
                case 34:
                    int m14002d2 = c7639qv.m14002d(c7639qv.m13989n());
                    int m13983t2 = c7639qv.m13983t();
                    int i8 = 0;
                    while (c7639qv.m13985r() > 0) {
                        switch (c7639qv.m13997g()) {
                            case 0:
                            case 1:
                            case 2:
                                i8++;
                                break;
                        }
                    }
                    if (i8 != 0) {
                        c7639qv.m13998f(m13983t2);
                        int length4 = this.f25320d == null ? 0 : this.f25320d.length;
                        int[] iArr6 = new int[i8 + length4];
                        if (length4 != 0) {
                            System.arraycopy(this.f25320d, 0, iArr6, 0, length4);
                        }
                        while (c7639qv.m13985r() > 0) {
                            int m13997g5 = c7639qv.m13997g();
                            switch (m13997g5) {
                                case 0:
                                case 1:
                                case 2:
                                    iArr6[length4] = m13997g5;
                                    length4++;
                                    break;
                            }
                        }
                        this.f25320d = iArr6;
                    }
                    c7639qv.m14000e(m14002d2);
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
        if (this.f25317a != 0) {
            c7640qw.m13973a(1, this.f25317a);
        }
        if (this.f25318b != 0) {
            c7640qw.m13950b(2, this.f25318b);
        }
        if (this.f25319c != null && this.f25319c.length > 0) {
            for (int i = 0; i < this.f25319c.length; i++) {
                c7640qw.m13973a(3, this.f25319c[i]);
            }
        }
        if (this.f25320d != null && this.f25320d.length > 0) {
            for (int i2 = 0; i2 < this.f25320d.length; i2++) {
                c7640qw.m13973a(4, this.f25320d[i2]);
            }
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7626qi m14042b() {
        this.f25317a = 0;
        this.f25318b = 0L;
        this.f25319c = C7652rg.f25394a;
        this.f25320d = C7652rg.f25394a;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7626qi)) {
            return false;
        }
        C7626qi c7626qi = (C7626qi) obj;
        return this.f25317a == c7626qi.f25317a && this.f25318b == c7626qi.f25318b && C7647rb.m13871a(this.f25319c, c7626qi.f25319c) && C7647rb.m13871a(this.f25320d, c7626qi.f25320d);
    }

    public int hashCode() {
        return ((((((((getClass().getName().hashCode() + 527) * 31) + this.f25317a) * 31) + ((int) (this.f25318b ^ (this.f25318b >>> 32)))) * 31) + C7647rb.m13872a(this.f25319c)) * 31) + C7647rb.m13872a(this.f25320d);
    }
}
