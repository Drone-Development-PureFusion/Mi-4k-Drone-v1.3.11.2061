package com.google.android.gms.internal;
/* loaded from: classes2.dex */
public interface amu {

    /* renamed from: com.google.android.gms.internal.amu$a */
    /* loaded from: classes2.dex */
    public static final class C6580a extends AbstractC7649rd {

        /* renamed from: d */
        private static volatile C6580a[] f22311d;

        /* renamed from: a */
        public Integer f22312a;

        /* renamed from: b */
        public C6584e[] f22313b;

        /* renamed from: c */
        public C6581b[] f22314c;

        public C6580a() {
            m16753c();
        }

        /* renamed from: b */
        public static C6580a[] m16754b() {
            if (f22311d == null) {
                synchronized (C7647rb.f25390c) {
                    if (f22311d == null) {
                        f22311d = new C6580a[0];
                    }
                }
            }
            return f22311d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22312a != null) {
                mo13820a += C7640qw.m13937c(1, this.f22312a.intValue());
            }
            if (this.f22313b != null && this.f22313b.length > 0) {
                int i = mo13820a;
                for (int i2 = 0; i2 < this.f22313b.length; i2++) {
                    C6584e c6584e = this.f22313b[i2];
                    if (c6584e != null) {
                        i += C7640qw.m13935c(2, c6584e);
                    }
                }
                mo13820a = i;
            }
            if (this.f22314c != null && this.f22314c.length > 0) {
                for (int i3 = 0; i3 < this.f22314c.length; i3++) {
                    C6581b c6581b = this.f22314c[i3];
                    if (c6581b != null) {
                        mo13820a += C7640qw.m13935c(3, c6581b);
                    }
                }
            }
            return mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6580a mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f22312a = Integer.valueOf(c7639qv.m13997g());
                        break;
                    case 18:
                        int m13839b = C7652rg.m13839b(c7639qv, 18);
                        int length = this.f22313b == null ? 0 : this.f22313b.length;
                        C6584e[] c6584eArr = new C6584e[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f22313b, 0, c6584eArr, 0, length);
                        }
                        while (length < c6584eArr.length - 1) {
                            c6584eArr[length] = new C6584e();
                            c7639qv.m14011a(c6584eArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c6584eArr[length] = new C6584e();
                        c7639qv.m14011a(c6584eArr[length]);
                        this.f22313b = c6584eArr;
                        break;
                    case 26:
                        int m13839b2 = C7652rg.m13839b(c7639qv, 26);
                        int length2 = this.f22314c == null ? 0 : this.f22314c.length;
                        C6581b[] c6581bArr = new C6581b[m13839b2 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f22314c, 0, c6581bArr, 0, length2);
                        }
                        while (length2 < c6581bArr.length - 1) {
                            c6581bArr[length2] = new C6581b();
                            c7639qv.m14011a(c6581bArr[length2]);
                            c7639qv.m14015a();
                            length2++;
                        }
                        c6581bArr[length2] = new C6581b();
                        c7639qv.m14011a(c6581bArr[length2]);
                        this.f22314c = c6581bArr;
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
            if (this.f22312a != null) {
                c7640qw.m13973a(1, this.f22312a.intValue());
            }
            if (this.f22313b != null && this.f22313b.length > 0) {
                for (int i = 0; i < this.f22313b.length; i++) {
                    C6584e c6584e = this.f22313b[i];
                    if (c6584e != null) {
                        c7640qw.m13971a(2, c6584e);
                    }
                }
            }
            if (this.f22314c != null && this.f22314c.length > 0) {
                for (int i2 = 0; i2 < this.f22314c.length; i2++) {
                    C6581b c6581b = this.f22314c[i2];
                    if (c6581b != null) {
                        c7640qw.m13971a(3, c6581b);
                    }
                }
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C6580a m16753c() {
            this.f22312a = null;
            this.f22313b = C6584e.m16743b();
            this.f22314c = C6581b.m16751b();
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6580a)) {
                return false;
            }
            C6580a c6580a = (C6580a) obj;
            if (this.f22312a == null) {
                if (c6580a.f22312a != null) {
                    return false;
                }
            } else if (!this.f22312a.equals(c6580a.f22312a)) {
                return false;
            }
            return C7647rb.m13867a(this.f22313b, c6580a.f22313b) && C7647rb.m13867a(this.f22314c, c6580a.f22314c);
        }

        public int hashCode() {
            return (((((this.f22312a == null ? 0 : this.f22312a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + C7647rb.m13868a(this.f22313b)) * 31) + C7647rb.m13868a(this.f22314c);
        }
    }

    /* renamed from: com.google.android.gms.internal.amu$b */
    /* loaded from: classes2.dex */
    public static final class C6581b extends AbstractC7649rd {

        /* renamed from: f */
        private static volatile C6581b[] f22315f;

        /* renamed from: a */
        public Integer f22316a;

        /* renamed from: b */
        public String f22317b;

        /* renamed from: c */
        public C6582c[] f22318c;

        /* renamed from: d */
        public Boolean f22319d;

        /* renamed from: e */
        public C6583d f22320e;

        public C6581b() {
            m16750c();
        }

        /* renamed from: b */
        public static C6581b[] m16751b() {
            if (f22315f == null) {
                synchronized (C7647rb.f25390c) {
                    if (f22315f == null) {
                        f22315f = new C6581b[0];
                    }
                }
            }
            return f22315f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22316a != null) {
                mo13820a += C7640qw.m13937c(1, this.f22316a.intValue());
            }
            if (this.f22317b != null) {
                mo13820a += C7640qw.m13948b(2, this.f22317b);
            }
            if (this.f22318c != null && this.f22318c.length > 0) {
                int i = mo13820a;
                for (int i2 = 0; i2 < this.f22318c.length; i2++) {
                    C6582c c6582c = this.f22318c[i2];
                    if (c6582c != null) {
                        i += C7640qw.m13935c(3, c6582c);
                    }
                }
                mo13820a = i;
            }
            if (this.f22319d != null) {
                mo13820a += C7640qw.m13947b(4, this.f22319d.booleanValue());
            }
            return this.f22320e != null ? mo13820a + C7640qw.m13935c(5, this.f22320e) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6581b mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f22316a = Integer.valueOf(c7639qv.m13997g());
                        break;
                    case 18:
                        this.f22317b = c7639qv.m13993j();
                        break;
                    case 26:
                        int m13839b = C7652rg.m13839b(c7639qv, 26);
                        int length = this.f22318c == null ? 0 : this.f22318c.length;
                        C6582c[] c6582cArr = new C6582c[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f22318c, 0, c6582cArr, 0, length);
                        }
                        while (length < c6582cArr.length - 1) {
                            c6582cArr[length] = new C6582c();
                            c7639qv.m14011a(c6582cArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c6582cArr[length] = new C6582c();
                        c7639qv.m14011a(c6582cArr[length]);
                        this.f22318c = c6582cArr;
                        break;
                    case 32:
                        this.f22319d = Boolean.valueOf(c7639qv.m13994i());
                        break;
                    case 42:
                        if (this.f22320e == null) {
                            this.f22320e = new C6583d();
                        }
                        c7639qv.m14011a(this.f22320e);
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
            if (this.f22316a != null) {
                c7640qw.m13973a(1, this.f22316a.intValue());
            }
            if (this.f22317b != null) {
                c7640qw.m13970a(2, this.f22317b);
            }
            if (this.f22318c != null && this.f22318c.length > 0) {
                for (int i = 0; i < this.f22318c.length; i++) {
                    C6582c c6582c = this.f22318c[i];
                    if (c6582c != null) {
                        c7640qw.m13971a(3, c6582c);
                    }
                }
            }
            if (this.f22319d != null) {
                c7640qw.m13969a(4, this.f22319d.booleanValue());
            }
            if (this.f22320e != null) {
                c7640qw.m13971a(5, this.f22320e);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C6581b m16750c() {
            this.f22316a = null;
            this.f22317b = null;
            this.f22318c = C6582c.m16748b();
            this.f22319d = null;
            this.f22320e = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6581b)) {
                return false;
            }
            C6581b c6581b = (C6581b) obj;
            if (this.f22316a == null) {
                if (c6581b.f22316a != null) {
                    return false;
                }
            } else if (!this.f22316a.equals(c6581b.f22316a)) {
                return false;
            }
            if (this.f22317b == null) {
                if (c6581b.f22317b != null) {
                    return false;
                }
            } else if (!this.f22317b.equals(c6581b.f22317b)) {
                return false;
            }
            if (!C7647rb.m13867a(this.f22318c, c6581b.f22318c)) {
                return false;
            }
            if (this.f22319d == null) {
                if (c6581b.f22319d != null) {
                    return false;
                }
            } else if (!this.f22319d.equals(c6581b.f22319d)) {
                return false;
            }
            return this.f22320e == null ? c6581b.f22320e == null : this.f22320e.equals(c6581b.f22320e);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22319d == null ? 0 : this.f22319d.hashCode()) + (((((this.f22317b == null ? 0 : this.f22317b.hashCode()) + (((this.f22316a == null ? 0 : this.f22316a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31) + C7647rb.m13868a(this.f22318c)) * 31)) * 31;
            if (this.f22320e != null) {
                i = this.f22320e.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.amu$c */
    /* loaded from: classes2.dex */
    public static final class C6582c extends AbstractC7649rd {

        /* renamed from: e */
        private static volatile C6582c[] f22321e;

        /* renamed from: a */
        public C6585f f22322a;

        /* renamed from: b */
        public C6583d f22323b;

        /* renamed from: c */
        public Boolean f22324c;

        /* renamed from: d */
        public String f22325d;

        public C6582c() {
            m16747c();
        }

        /* renamed from: b */
        public static C6582c[] m16748b() {
            if (f22321e == null) {
                synchronized (C7647rb.f25390c) {
                    if (f22321e == null) {
                        f22321e = new C6582c[0];
                    }
                }
            }
            return f22321e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22322a != null) {
                mo13820a += C7640qw.m13935c(1, this.f22322a);
            }
            if (this.f22323b != null) {
                mo13820a += C7640qw.m13935c(2, this.f22323b);
            }
            if (this.f22324c != null) {
                mo13820a += C7640qw.m13947b(3, this.f22324c.booleanValue());
            }
            return this.f22325d != null ? mo13820a + C7640qw.m13948b(4, this.f22325d) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6582c mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        if (this.f22322a == null) {
                            this.f22322a = new C6585f();
                        }
                        c7639qv.m14011a(this.f22322a);
                        break;
                    case 18:
                        if (this.f22323b == null) {
                            this.f22323b = new C6583d();
                        }
                        c7639qv.m14011a(this.f22323b);
                        break;
                    case 24:
                        this.f22324c = Boolean.valueOf(c7639qv.m13994i());
                        break;
                    case 34:
                        this.f22325d = c7639qv.m13993j();
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
            if (this.f22322a != null) {
                c7640qw.m13971a(1, this.f22322a);
            }
            if (this.f22323b != null) {
                c7640qw.m13971a(2, this.f22323b);
            }
            if (this.f22324c != null) {
                c7640qw.m13969a(3, this.f22324c.booleanValue());
            }
            if (this.f22325d != null) {
                c7640qw.m13970a(4, this.f22325d);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C6582c m16747c() {
            this.f22322a = null;
            this.f22323b = null;
            this.f22324c = null;
            this.f22325d = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6582c)) {
                return false;
            }
            C6582c c6582c = (C6582c) obj;
            if (this.f22322a == null) {
                if (c6582c.f22322a != null) {
                    return false;
                }
            } else if (!this.f22322a.equals(c6582c.f22322a)) {
                return false;
            }
            if (this.f22323b == null) {
                if (c6582c.f22323b != null) {
                    return false;
                }
            } else if (!this.f22323b.equals(c6582c.f22323b)) {
                return false;
            }
            if (this.f22324c == null) {
                if (c6582c.f22324c != null) {
                    return false;
                }
            } else if (!this.f22324c.equals(c6582c.f22324c)) {
                return false;
            }
            return this.f22325d == null ? c6582c.f22325d == null : this.f22325d.equals(c6582c.f22325d);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22324c == null ? 0 : this.f22324c.hashCode()) + (((this.f22323b == null ? 0 : this.f22323b.hashCode()) + (((this.f22322a == null ? 0 : this.f22322a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31;
            if (this.f22325d != null) {
                i = this.f22325d.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.amu$d */
    /* loaded from: classes2.dex */
    public static final class C6583d extends AbstractC7649rd {

        /* renamed from: a */
        public Integer f22326a;

        /* renamed from: b */
        public Boolean f22327b;

        /* renamed from: c */
        public String f22328c;

        /* renamed from: d */
        public String f22329d;

        /* renamed from: e */
        public String f22330e;

        public C6583d() {
            m16745b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22326a != null) {
                mo13820a += C7640qw.m13937c(1, this.f22326a.intValue());
            }
            if (this.f22327b != null) {
                mo13820a += C7640qw.m13947b(2, this.f22327b.booleanValue());
            }
            if (this.f22328c != null) {
                mo13820a += C7640qw.m13948b(3, this.f22328c);
            }
            if (this.f22329d != null) {
                mo13820a += C7640qw.m13948b(4, this.f22329d);
            }
            return this.f22330e != null ? mo13820a + C7640qw.m13948b(5, this.f22330e) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6583d mo13816b(C7639qv c7639qv) {
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
                                this.f22326a = Integer.valueOf(m13997g);
                                continue;
                        }
                    case 16:
                        this.f22327b = Boolean.valueOf(c7639qv.m13994i());
                        break;
                    case 26:
                        this.f22328c = c7639qv.m13993j();
                        break;
                    case 34:
                        this.f22329d = c7639qv.m13993j();
                        break;
                    case 42:
                        this.f22330e = c7639qv.m13993j();
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
            if (this.f22326a != null) {
                c7640qw.m13973a(1, this.f22326a.intValue());
            }
            if (this.f22327b != null) {
                c7640qw.m13969a(2, this.f22327b.booleanValue());
            }
            if (this.f22328c != null) {
                c7640qw.m13970a(3, this.f22328c);
            }
            if (this.f22329d != null) {
                c7640qw.m13970a(4, this.f22329d);
            }
            if (this.f22330e != null) {
                c7640qw.m13970a(5, this.f22330e);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C6583d m16745b() {
            this.f22327b = null;
            this.f22328c = null;
            this.f22329d = null;
            this.f22330e = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6583d)) {
                return false;
            }
            C6583d c6583d = (C6583d) obj;
            if (this.f22326a == null) {
                if (c6583d.f22326a != null) {
                    return false;
                }
            } else if (!this.f22326a.equals(c6583d.f22326a)) {
                return false;
            }
            if (this.f22327b == null) {
                if (c6583d.f22327b != null) {
                    return false;
                }
            } else if (!this.f22327b.equals(c6583d.f22327b)) {
                return false;
            }
            if (this.f22328c == null) {
                if (c6583d.f22328c != null) {
                    return false;
                }
            } else if (!this.f22328c.equals(c6583d.f22328c)) {
                return false;
            }
            if (this.f22329d == null) {
                if (c6583d.f22329d != null) {
                    return false;
                }
            } else if (!this.f22329d.equals(c6583d.f22329d)) {
                return false;
            }
            return this.f22330e == null ? c6583d.f22330e == null : this.f22330e.equals(c6583d.f22330e);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22329d == null ? 0 : this.f22329d.hashCode()) + (((this.f22328c == null ? 0 : this.f22328c.hashCode()) + (((this.f22327b == null ? 0 : this.f22327b.hashCode()) + (((this.f22326a == null ? 0 : this.f22326a.intValue()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.f22330e != null) {
                i = this.f22330e.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.amu$e */
    /* loaded from: classes2.dex */
    public static final class C6584e extends AbstractC7649rd {

        /* renamed from: d */
        private static volatile C6584e[] f22331d;

        /* renamed from: a */
        public Integer f22332a;

        /* renamed from: b */
        public String f22333b;

        /* renamed from: c */
        public C6582c f22334c;

        public C6584e() {
            m16742c();
        }

        /* renamed from: b */
        public static C6584e[] m16743b() {
            if (f22331d == null) {
                synchronized (C7647rb.f25390c) {
                    if (f22331d == null) {
                        f22331d = new C6584e[0];
                    }
                }
            }
            return f22331d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22332a != null) {
                mo13820a += C7640qw.m13937c(1, this.f22332a.intValue());
            }
            if (this.f22333b != null) {
                mo13820a += C7640qw.m13948b(2, this.f22333b);
            }
            return this.f22334c != null ? mo13820a + C7640qw.m13935c(3, this.f22334c) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6584e mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f22332a = Integer.valueOf(c7639qv.m13997g());
                        break;
                    case 18:
                        this.f22333b = c7639qv.m13993j();
                        break;
                    case 26:
                        if (this.f22334c == null) {
                            this.f22334c = new C6582c();
                        }
                        c7639qv.m14011a(this.f22334c);
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
            if (this.f22332a != null) {
                c7640qw.m13973a(1, this.f22332a.intValue());
            }
            if (this.f22333b != null) {
                c7640qw.m13970a(2, this.f22333b);
            }
            if (this.f22334c != null) {
                c7640qw.m13971a(3, this.f22334c);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C6584e m16742c() {
            this.f22332a = null;
            this.f22333b = null;
            this.f22334c = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6584e)) {
                return false;
            }
            C6584e c6584e = (C6584e) obj;
            if (this.f22332a == null) {
                if (c6584e.f22332a != null) {
                    return false;
                }
            } else if (!this.f22332a.equals(c6584e.f22332a)) {
                return false;
            }
            if (this.f22333b == null) {
                if (c6584e.f22333b != null) {
                    return false;
                }
            } else if (!this.f22333b.equals(c6584e.f22333b)) {
                return false;
            }
            return this.f22334c == null ? c6584e.f22334c == null : this.f22334c.equals(c6584e.f22334c);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22333b == null ? 0 : this.f22333b.hashCode()) + (((this.f22332a == null ? 0 : this.f22332a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.f22334c != null) {
                i = this.f22334c.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.amu$f */
    /* loaded from: classes2.dex */
    public static final class C6585f extends AbstractC7649rd {

        /* renamed from: a */
        public Integer f22335a;

        /* renamed from: b */
        public String f22336b;

        /* renamed from: c */
        public Boolean f22337c;

        /* renamed from: d */
        public String[] f22338d;

        public C6585f() {
            m16740b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22335a != null) {
                mo13820a += C7640qw.m13937c(1, this.f22335a.intValue());
            }
            if (this.f22336b != null) {
                mo13820a += C7640qw.m13948b(2, this.f22336b);
            }
            if (this.f22337c != null) {
                mo13820a += C7640qw.m13947b(3, this.f22337c.booleanValue());
            }
            if (this.f22338d == null || this.f22338d.length <= 0) {
                return mo13820a;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f22338d.length; i3++) {
                String str = this.f22338d[i3];
                if (str != null) {
                    i2++;
                    i += C7640qw.m13942b(str);
                }
            }
            return mo13820a + i + (i2 * 1);
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6585f mo13816b(C7639qv c7639qv) {
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
                                this.f22335a = Integer.valueOf(m13997g);
                                continue;
                        }
                    case 18:
                        this.f22336b = c7639qv.m13993j();
                        break;
                    case 24:
                        this.f22337c = Boolean.valueOf(c7639qv.m13994i());
                        break;
                    case 34:
                        int m13839b = C7652rg.m13839b(c7639qv, 34);
                        int length = this.f22338d == null ? 0 : this.f22338d.length;
                        String[] strArr = new String[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f22338d, 0, strArr, 0, length);
                        }
                        while (length < strArr.length - 1) {
                            strArr[length] = c7639qv.m13993j();
                            c7639qv.m14015a();
                            length++;
                        }
                        strArr[length] = c7639qv.m13993j();
                        this.f22338d = strArr;
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
            if (this.f22335a != null) {
                c7640qw.m13973a(1, this.f22335a.intValue());
            }
            if (this.f22336b != null) {
                c7640qw.m13970a(2, this.f22336b);
            }
            if (this.f22337c != null) {
                c7640qw.m13969a(3, this.f22337c.booleanValue());
            }
            if (this.f22338d != null && this.f22338d.length > 0) {
                for (int i = 0; i < this.f22338d.length; i++) {
                    String str = this.f22338d[i];
                    if (str != null) {
                        c7640qw.m13970a(4, str);
                    }
                }
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C6585f m16740b() {
            this.f22336b = null;
            this.f22337c = null;
            this.f22338d = C7652rg.f25399f;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6585f)) {
                return false;
            }
            C6585f c6585f = (C6585f) obj;
            if (this.f22335a == null) {
                if (c6585f.f22335a != null) {
                    return false;
                }
            } else if (!this.f22335a.equals(c6585f.f22335a)) {
                return false;
            }
            if (this.f22336b == null) {
                if (c6585f.f22336b != null) {
                    return false;
                }
            } else if (!this.f22336b.equals(c6585f.f22336b)) {
                return false;
            }
            if (this.f22337c == null) {
                if (c6585f.f22337c != null) {
                    return false;
                }
            } else if (!this.f22337c.equals(c6585f.f22337c)) {
                return false;
            }
            return C7647rb.m13867a(this.f22338d, c6585f.f22338d);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22336b == null ? 0 : this.f22336b.hashCode()) + (((this.f22335a == null ? 0 : this.f22335a.intValue()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.f22337c != null) {
                i = this.f22337c.hashCode();
            }
            return ((hashCode + i) * 31) + C7647rb.m13868a(this.f22338d);
        }
    }
}
