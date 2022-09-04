package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.pv */
/* loaded from: classes2.dex */
public final class C7605pv extends AbstractC7649rd {

    /* renamed from: a */
    public int f25215a;

    /* renamed from: b */
    public long f25216b;

    /* renamed from: c */
    public int[] f25217c;

    public C7605pv() {
        m14086b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25215a != 0) {
            mo13820a += C7640qw.m13937c(1, this.f25215a);
        }
        if (this.f25216b != 0) {
            mo13820a += C7640qw.m13920f(2, this.f25216b);
        }
        if (this.f25217c == null || this.f25217c.length <= 0) {
            return mo13820a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f25217c.length; i2++) {
            i += C7640qw.m13938c(this.f25217c[i2]);
        }
        return mo13820a + i + (this.f25217c.length * 1);
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7605pv mo13816b(C7639qv c7639qv) {
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
                            this.f25215a = m13997g;
                            continue;
                    }
                case 16:
                    this.f25216b = c7639qv.m13999f();
                    break;
                case 24:
                    int m13839b = C7652rg.m13839b(c7639qv, 24);
                    int[] iArr = new int[m13839b];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < m13839b) {
                        if (i2 != 0) {
                            c7639qv.m14015a();
                        }
                        int m13997g2 = c7639qv.m13997g();
                        switch (m13997g2) {
                            case -1000:
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
                            case 13:
                            case 14:
                            case 15:
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
                        int length = this.f25217c == null ? 0 : this.f25217c.length;
                        if (length != 0 || i3 != m13839b) {
                            int[] iArr2 = new int[length + i3];
                            if (length != 0) {
                                System.arraycopy(this.f25217c, 0, iArr2, 0, length);
                            }
                            System.arraycopy(iArr, 0, iArr2, length, i3);
                            this.f25217c = iArr2;
                            break;
                        } else {
                            this.f25217c = iArr;
                            break;
                        }
                    } else {
                        break;
                    }
                case 26:
                    int m14002d = c7639qv.m14002d(c7639qv.m13989n());
                    int m13983t = c7639qv.m13983t();
                    int i4 = 0;
                    while (c7639qv.m13985r() > 0) {
                        switch (c7639qv.m13997g()) {
                            case -1000:
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
                            case 13:
                            case 14:
                            case 15:
                                i4++;
                                break;
                        }
                    }
                    if (i4 != 0) {
                        c7639qv.m13998f(m13983t);
                        int length2 = this.f25217c == null ? 0 : this.f25217c.length;
                        int[] iArr3 = new int[i4 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f25217c, 0, iArr3, 0, length2);
                        }
                        while (c7639qv.m13985r() > 0) {
                            int m13997g3 = c7639qv.m13997g();
                            switch (m13997g3) {
                                case -1000:
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
                                case 13:
                                case 14:
                                case 15:
                                    iArr3[length2] = m13997g3;
                                    length2++;
                                    break;
                            }
                        }
                        this.f25217c = iArr3;
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
        if (this.f25215a != 0) {
            c7640qw.m13973a(1, this.f25215a);
        }
        if (this.f25216b != 0) {
            c7640qw.m13950b(2, this.f25216b);
        }
        if (this.f25217c != null && this.f25217c.length > 0) {
            for (int i = 0; i < this.f25217c.length; i++) {
                c7640qw.m13973a(3, this.f25217c[i]);
            }
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7605pv m14086b() {
        this.f25215a = 0;
        this.f25216b = 0L;
        this.f25217c = C7652rg.f25394a;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7605pv)) {
            return false;
        }
        C7605pv c7605pv = (C7605pv) obj;
        return this.f25215a == c7605pv.f25215a && this.f25216b == c7605pv.f25216b && C7647rb.m13871a(this.f25217c, c7605pv.f25217c);
    }

    public int hashCode() {
        return ((((((getClass().getName().hashCode() + 527) * 31) + this.f25215a) * 31) + ((int) (this.f25216b ^ (this.f25216b >>> 32)))) * 31) + C7647rb.m13872a(this.f25217c);
    }
}
