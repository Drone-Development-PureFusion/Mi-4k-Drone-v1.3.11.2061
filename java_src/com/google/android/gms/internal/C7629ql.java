package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.ql */
/* loaded from: classes2.dex */
public final class C7629ql extends AbstractC7649rd {

    /* renamed from: a */
    public int f25325a;

    /* renamed from: b */
    public long f25326b;

    /* renamed from: c */
    public int[] f25327c;

    /* renamed from: d */
    public String[] f25328d;

    /* renamed from: e */
    public long f25329e;

    /* renamed from: f */
    public String[] f25330f;

    /* renamed from: g */
    public String f25331g;

    public C7629ql() {
        m14036b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25325a != 0) {
            mo13820a += C7640qw.m13937c(1, this.f25325a);
        }
        if (this.f25326b != 0) {
            mo13820a += C7640qw.m13920f(2, this.f25326b);
        }
        if (this.f25327c != null && this.f25327c.length > 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.f25327c.length; i2++) {
                i += C7640qw.m13938c(this.f25327c[i2]);
            }
            mo13820a = mo13820a + i + (this.f25327c.length * 1);
        }
        if (this.f25328d != null && this.f25328d.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < this.f25328d.length; i5++) {
                String str = this.f25328d[i5];
                if (str != null) {
                    i4++;
                    i3 += C7640qw.m13942b(str);
                }
            }
            mo13820a = mo13820a + i3 + (i4 * 1);
        }
        if (this.f25329e != 0) {
            mo13820a += C7640qw.m13920f(5, this.f25329e);
        }
        if (this.f25330f != null && this.f25330f.length > 0) {
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < this.f25330f.length; i8++) {
                String str2 = this.f25330f[i8];
                if (str2 != null) {
                    i7++;
                    i6 += C7640qw.m13942b(str2);
                }
            }
            mo13820a = mo13820a + i6 + (i7 * 1);
        }
        return !this.f25331g.equals("") ? mo13820a + C7640qw.m13948b(7, this.f25331g) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7629ql mo13816b(C7639qv c7639qv) {
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
                            this.f25325a = m13997g;
                            continue;
                    }
                case 16:
                    this.f25326b = c7639qv.m13999f();
                    break;
                case 24:
                    int m13839b = C7652rg.m13839b(c7639qv, 24);
                    int length = this.f25327c == null ? 0 : this.f25327c.length;
                    int[] iArr = new int[m13839b + length];
                    if (length != 0) {
                        System.arraycopy(this.f25327c, 0, iArr, 0, length);
                    }
                    while (length < iArr.length - 1) {
                        iArr[length] = c7639qv.m13997g();
                        c7639qv.m14015a();
                        length++;
                    }
                    iArr[length] = c7639qv.m13997g();
                    this.f25327c = iArr;
                    break;
                case 26:
                    int m14002d = c7639qv.m14002d(c7639qv.m13989n());
                    int m13983t = c7639qv.m13983t();
                    int i = 0;
                    while (c7639qv.m13985r() > 0) {
                        c7639qv.m13997g();
                        i++;
                    }
                    c7639qv.m13998f(m13983t);
                    int length2 = this.f25327c == null ? 0 : this.f25327c.length;
                    int[] iArr2 = new int[i + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f25327c, 0, iArr2, 0, length2);
                    }
                    while (length2 < iArr2.length) {
                        iArr2[length2] = c7639qv.m13997g();
                        length2++;
                    }
                    this.f25327c = iArr2;
                    c7639qv.m14000e(m14002d);
                    break;
                case 34:
                    int m13839b2 = C7652rg.m13839b(c7639qv, 34);
                    int length3 = this.f25328d == null ? 0 : this.f25328d.length;
                    String[] strArr = new String[m13839b2 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.f25328d, 0, strArr, 0, length3);
                    }
                    while (length3 < strArr.length - 1) {
                        strArr[length3] = c7639qv.m13993j();
                        c7639qv.m14015a();
                        length3++;
                    }
                    strArr[length3] = c7639qv.m13993j();
                    this.f25328d = strArr;
                    break;
                case 40:
                    this.f25329e = c7639qv.m13999f();
                    break;
                case 50:
                    int m13839b3 = C7652rg.m13839b(c7639qv, 50);
                    int length4 = this.f25330f == null ? 0 : this.f25330f.length;
                    String[] strArr2 = new String[m13839b3 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.f25330f, 0, strArr2, 0, length4);
                    }
                    while (length4 < strArr2.length - 1) {
                        strArr2[length4] = c7639qv.m13993j();
                        c7639qv.m14015a();
                        length4++;
                    }
                    strArr2[length4] = c7639qv.m13993j();
                    this.f25330f = strArr2;
                    break;
                case 58:
                    this.f25331g = c7639qv.m13993j();
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
        if (this.f25325a != 0) {
            c7640qw.m13973a(1, this.f25325a);
        }
        if (this.f25326b != 0) {
            c7640qw.m13950b(2, this.f25326b);
        }
        if (this.f25327c != null && this.f25327c.length > 0) {
            for (int i = 0; i < this.f25327c.length; i++) {
                c7640qw.m13973a(3, this.f25327c[i]);
            }
        }
        if (this.f25328d != null && this.f25328d.length > 0) {
            for (int i2 = 0; i2 < this.f25328d.length; i2++) {
                String str = this.f25328d[i2];
                if (str != null) {
                    c7640qw.m13970a(4, str);
                }
            }
        }
        if (this.f25329e != 0) {
            c7640qw.m13950b(5, this.f25329e);
        }
        if (this.f25330f != null && this.f25330f.length > 0) {
            for (int i3 = 0; i3 < this.f25330f.length; i3++) {
                String str2 = this.f25330f[i3];
                if (str2 != null) {
                    c7640qw.m13970a(6, str2);
                }
            }
        }
        if (!this.f25331g.equals("")) {
            c7640qw.m13970a(7, this.f25331g);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7629ql m14036b() {
        this.f25325a = 0;
        this.f25326b = 0L;
        this.f25327c = C7652rg.f25394a;
        this.f25328d = C7652rg.f25399f;
        this.f25329e = 0L;
        this.f25330f = C7652rg.f25399f;
        this.f25331g = "";
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7629ql)) {
            return false;
        }
        C7629ql c7629ql = (C7629ql) obj;
        if (this.f25325a == c7629ql.f25325a && this.f25326b == c7629ql.f25326b && C7647rb.m13871a(this.f25327c, c7629ql.f25327c) && C7647rb.m13867a(this.f25328d, c7629ql.f25328d) && this.f25329e == c7629ql.f25329e && C7647rb.m13867a(this.f25330f, c7629ql.f25330f)) {
            return this.f25331g == null ? c7629ql.f25331g == null : this.f25331g.equals(c7629ql.f25331g);
        }
        return false;
    }

    public int hashCode() {
        return (this.f25331g == null ? 0 : this.f25331g.hashCode()) + ((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f25325a) * 31) + ((int) (this.f25326b ^ (this.f25326b >>> 32)))) * 31) + C7647rb.m13872a(this.f25327c)) * 31) + C7647rb.m13868a(this.f25328d)) * 31) + ((int) (this.f25329e ^ (this.f25329e >>> 32)))) * 31) + C7647rb.m13868a(this.f25330f)) * 31);
    }
}
