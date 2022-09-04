package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qo */
/* loaded from: classes2.dex */
public final class C7632qo extends AbstractC7642qx<C7632qo> {

    /* renamed from: a */
    public String f25338a;

    /* renamed from: b */
    public int f25339b;

    /* renamed from: c */
    public C7613qb f25340c;

    /* renamed from: d */
    public String[] f25341d;

    /* renamed from: e */
    public String[] f25342e;

    /* renamed from: f */
    public C7635qr f25343f;

    /* renamed from: g */
    public C7624qg f25344g;

    public C7632qo() {
        m14029b();
    }

    /* renamed from: a */
    public static C7632qo m14030a(byte[] bArr) {
        return (C7632qo) AbstractC7649rd.m13856a(new C7632qo(), bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (!this.f25338a.equals("")) {
            mo13820a += C7640qw.m13948b(1, this.f25338a);
        }
        if (this.f25339b != 1) {
            mo13820a += C7640qw.m13937c(2, this.f25339b);
        }
        if (this.f25340c != null) {
            mo13820a += C7640qw.m13935c(3, this.f25340c);
        }
        if (this.f25341d != null && this.f25341d.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f25341d.length; i3++) {
                String str = this.f25341d[i3];
                if (str != null) {
                    i2++;
                    i += C7640qw.m13942b(str);
                }
            }
            mo13820a = mo13820a + i + (i2 * 1);
        }
        if (this.f25342e != null && this.f25342e.length > 0) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < this.f25342e.length; i6++) {
                String str2 = this.f25342e[i6];
                if (str2 != null) {
                    i5++;
                    i4 += C7640qw.m13942b(str2);
                }
            }
            mo13820a = mo13820a + i4 + (i5 * 1);
        }
        if (this.f25343f != null) {
            mo13820a += C7640qw.m13935c(6, this.f25343f);
        }
        return this.f25344g != null ? mo13820a + C7640qw.m13935c(8, this.f25344g) : mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7632qo mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 10:
                    this.f25338a = c7639qv.m13993j();
                    break;
                case 16:
                    int m13997g = c7639qv.m13997g();
                    switch (m13997g) {
                        case 1:
                        case 2:
                            this.f25339b = m13997g;
                            continue;
                    }
                case 26:
                    if (this.f25340c == null) {
                        this.f25340c = new C7613qb();
                    }
                    c7639qv.m14011a(this.f25340c);
                    break;
                case 34:
                    int m13839b = C7652rg.m13839b(c7639qv, 34);
                    int length = this.f25341d == null ? 0 : this.f25341d.length;
                    String[] strArr = new String[m13839b + length];
                    if (length != 0) {
                        System.arraycopy(this.f25341d, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = c7639qv.m13993j();
                        c7639qv.m14015a();
                        length++;
                    }
                    strArr[length] = c7639qv.m13993j();
                    this.f25341d = strArr;
                    break;
                case 42:
                    int m13839b2 = C7652rg.m13839b(c7639qv, 42);
                    int length2 = this.f25342e == null ? 0 : this.f25342e.length;
                    String[] strArr2 = new String[m13839b2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f25342e, 0, strArr2, 0, length2);
                    }
                    while (length2 < strArr2.length - 1) {
                        strArr2[length2] = c7639qv.m13993j();
                        c7639qv.m14015a();
                        length2++;
                    }
                    strArr2[length2] = c7639qv.m13993j();
                    this.f25342e = strArr2;
                    break;
                case 50:
                    if (this.f25343f == null) {
                        this.f25343f = new C7635qr();
                    }
                    c7639qv.m14011a(this.f25343f);
                    break;
                case 66:
                    if (this.f25344g == null) {
                        this.f25344g = new C7624qg();
                    }
                    c7639qv.m14011a(this.f25344g);
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
        if (!this.f25338a.equals("")) {
            c7640qw.m13970a(1, this.f25338a);
        }
        if (this.f25339b != 1) {
            c7640qw.m13973a(2, this.f25339b);
        }
        if (this.f25340c != null) {
            c7640qw.m13971a(3, this.f25340c);
        }
        if (this.f25341d != null && this.f25341d.length > 0) {
            for (int i = 0; i < this.f25341d.length; i++) {
                String str = this.f25341d[i];
                if (str != null) {
                    c7640qw.m13970a(4, str);
                }
            }
        }
        if (this.f25342e != null && this.f25342e.length > 0) {
            for (int i2 = 0; i2 < this.f25342e.length; i2++) {
                String str2 = this.f25342e[i2];
                if (str2 != null) {
                    c7640qw.m13970a(5, str2);
                }
            }
        }
        if (this.f25343f != null) {
            c7640qw.m13971a(6, this.f25343f);
        }
        if (this.f25344g != null) {
            c7640qw.m13971a(8, this.f25344g);
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7632qo m14029b() {
        this.f25338a = "";
        this.f25339b = 1;
        this.f25340c = null;
        this.f25341d = C7652rg.f25399f;
        this.f25342e = C7652rg.f25399f;
        this.f25343f = null;
        this.f25344g = null;
        this.f25374ag = null;
        this.f25391ah = -1;
        return this;
    }
}
