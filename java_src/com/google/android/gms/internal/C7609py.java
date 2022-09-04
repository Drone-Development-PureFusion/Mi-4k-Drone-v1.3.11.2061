package com.google.android.gms.internal;

import com.google.android.gms.games.C5375d;
/* renamed from: com.google.android.gms.internal.py */
/* loaded from: classes2.dex */
public final class C7609py extends AbstractC7642qx<C7609py> {

    /* renamed from: a */
    public static final C7643qy<Object, C7609py> f25233a = C7643qy.m13904a(11, C7609py.class, 855033290);

    /* renamed from: k */
    private static final C7609py[] f25234k = new C7609py[0];

    /* renamed from: b */
    public String f25235b;

    /* renamed from: c */
    public C7613qb f25236c;

    /* renamed from: d */
    public int f25237d;

    /* renamed from: e */
    public int f25238e;

    /* renamed from: f */
    public int f25239f;

    /* renamed from: g */
    public C7635qr f25240g;

    /* renamed from: h */
    public C7610pz f25241h;

    /* renamed from: i */
    public String[] f25242i;

    /* renamed from: j */
    public C7624qg f25243j;

    public C7609py() {
        m14075b();
    }

    /* renamed from: a */
    public static C7609py m14076a(byte[] bArr) {
        return (C7609py) AbstractC7649rd.m13856a(new C7609py(), bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (!this.f25235b.equals("")) {
            mo13820a += C7640qw.m13948b(1, this.f25235b);
        }
        if (this.f25236c != null) {
            mo13820a += C7640qw.m13935c(2, this.f25236c);
        }
        if (this.f25237d != 0) {
            mo13820a += C7640qw.m13937c(4, this.f25237d);
        }
        if (this.f25238e != 0) {
            mo13820a += C7640qw.m13937c(5, this.f25238e);
        }
        if (this.f25239f != 0) {
            mo13820a += C7640qw.m13937c(6, this.f25239f);
        }
        if (this.f25240g != null) {
            mo13820a += C7640qw.m13935c(7, this.f25240g);
        }
        if (this.f25241h != null) {
            mo13820a += C7640qw.m13935c(8, this.f25241h);
        }
        if (this.f25242i != null && this.f25242i.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f25242i.length; i3++) {
                String str = this.f25242i[i3];
                if (str != null) {
                    i2++;
                    i += C7640qw.m13942b(str);
                }
            }
            mo13820a = mo13820a + i + (i2 * 1);
        }
        return this.f25243j != null ? mo13820a + C7640qw.m13935c(10, this.f25243j) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7609py mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 10:
                    this.f25235b = c7639qv.m13993j();
                    break;
                case 18:
                    if (this.f25236c == null) {
                        this.f25236c = new C7613qb();
                    }
                    c7639qv.m14011a(this.f25236c);
                    break;
                case 32:
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
                            this.f25237d = m13997g;
                            continue;
                    }
                case 40:
                    int m13997g2 = c7639qv.m13997g();
                    switch (m13997g2) {
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
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 10000:
                        case 10001:
                        case C5375d.f19452b /* 10002 */:
                        case C5375d.f19453c /* 10003 */:
                        case C5375d.f19454d /* 10004 */:
                        case C5375d.f19455e /* 10005 */:
                        case C5375d.f19456f /* 10006 */:
                        case C5375d.f19457g /* 10007 */:
                        case C5375d.f19458h /* 10008 */:
                        case 10009:
                        case 99999:
                            this.f25238e = m13997g2;
                            continue;
                    }
                case 48:
                    int m13997g3 = c7639qv.m13997g();
                    switch (m13997g3) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f25239f = m13997g3;
                            continue;
                    }
                case 58:
                    if (this.f25240g == null) {
                        this.f25240g = new C7635qr();
                    }
                    c7639qv.m14011a(this.f25240g);
                    break;
                case 66:
                    if (this.f25241h == null) {
                        this.f25241h = new C7610pz();
                    }
                    c7639qv.m14011a(this.f25241h);
                    break;
                case 74:
                    int m13839b = C7652rg.m13839b(c7639qv, 74);
                    int length = this.f25242i == null ? 0 : this.f25242i.length;
                    String[] strArr = new String[m13839b + length];
                    if (length != 0) {
                        System.arraycopy(this.f25242i, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = c7639qv.m13993j();
                        c7639qv.m14015a();
                        length++;
                    }
                    strArr[length] = c7639qv.m13993j();
                    this.f25242i = strArr;
                    break;
                case 82:
                    if (this.f25243j == null) {
                        this.f25243j = new C7624qg();
                    }
                    c7639qv.m14011a(this.f25243j);
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
        if (!this.f25235b.equals("")) {
            c7640qw.m13970a(1, this.f25235b);
        }
        if (this.f25236c != null) {
            c7640qw.m13971a(2, this.f25236c);
        }
        if (this.f25237d != 0) {
            c7640qw.m13973a(4, this.f25237d);
        }
        if (this.f25238e != 0) {
            c7640qw.m13973a(5, this.f25238e);
        }
        if (this.f25239f != 0) {
            c7640qw.m13973a(6, this.f25239f);
        }
        if (this.f25240g != null) {
            c7640qw.m13971a(7, this.f25240g);
        }
        if (this.f25241h != null) {
            c7640qw.m13971a(8, this.f25241h);
        }
        if (this.f25242i != null && this.f25242i.length > 0) {
            for (int i = 0; i < this.f25242i.length; i++) {
                String str = this.f25242i[i];
                if (str != null) {
                    c7640qw.m13970a(9, str);
                }
            }
        }
        if (this.f25243j != null) {
            c7640qw.m13971a(10, this.f25243j);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7609py m14075b() {
        this.f25235b = "";
        this.f25236c = null;
        this.f25237d = 0;
        this.f25238e = 0;
        this.f25239f = 0;
        this.f25240g = null;
        this.f25241h = null;
        this.f25242i = C7652rg.f25399f;
        this.f25243j = null;
        this.f25374ag = null;
        this.f25391ah = -1;
        return this;
    }
}
