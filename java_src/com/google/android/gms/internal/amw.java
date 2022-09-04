package com.google.android.gms.internal;

import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.TiffUtil;
/* loaded from: classes2.dex */
public interface amw {

    /* renamed from: com.google.android.gms.internal.amw$a */
    /* loaded from: classes2.dex */
    public static final class C6589a extends AbstractC7649rd {

        /* renamed from: e */
        private static volatile C6589a[] f22352e;

        /* renamed from: a */
        public Integer f22353a;

        /* renamed from: b */
        public C6594f f22354b;

        /* renamed from: c */
        public C6594f f22355c;

        /* renamed from: d */
        public Boolean f22356d;

        public C6589a() {
            m16729c();
        }

        /* renamed from: b */
        public static C6589a[] m16730b() {
            if (f22352e == null) {
                synchronized (C7647rb.f25390c) {
                    if (f22352e == null) {
                        f22352e = new C6589a[0];
                    }
                }
            }
            return f22352e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22353a != null) {
                mo13820a += C7640qw.m13937c(1, this.f22353a.intValue());
            }
            if (this.f22354b != null) {
                mo13820a += C7640qw.m13935c(2, this.f22354b);
            }
            if (this.f22355c != null) {
                mo13820a += C7640qw.m13935c(3, this.f22355c);
            }
            return this.f22356d != null ? mo13820a + C7640qw.m13947b(4, this.f22356d.booleanValue()) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6589a mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f22353a = Integer.valueOf(c7639qv.m13997g());
                        break;
                    case 18:
                        if (this.f22354b == null) {
                            this.f22354b = new C6594f();
                        }
                        c7639qv.m14011a(this.f22354b);
                        break;
                    case 26:
                        if (this.f22355c == null) {
                            this.f22355c = new C6594f();
                        }
                        c7639qv.m14011a(this.f22355c);
                        break;
                    case 32:
                        this.f22356d = Boolean.valueOf(c7639qv.m13994i());
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
            if (this.f22353a != null) {
                c7640qw.m13973a(1, this.f22353a.intValue());
            }
            if (this.f22354b != null) {
                c7640qw.m13971a(2, this.f22354b);
            }
            if (this.f22355c != null) {
                c7640qw.m13971a(3, this.f22355c);
            }
            if (this.f22356d != null) {
                c7640qw.m13969a(4, this.f22356d.booleanValue());
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C6589a m16729c() {
            this.f22353a = null;
            this.f22354b = null;
            this.f22355c = null;
            this.f22356d = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6589a)) {
                return false;
            }
            C6589a c6589a = (C6589a) obj;
            if (this.f22353a == null) {
                if (c6589a.f22353a != null) {
                    return false;
                }
            } else if (!this.f22353a.equals(c6589a.f22353a)) {
                return false;
            }
            if (this.f22354b == null) {
                if (c6589a.f22354b != null) {
                    return false;
                }
            } else if (!this.f22354b.equals(c6589a.f22354b)) {
                return false;
            }
            if (this.f22355c == null) {
                if (c6589a.f22355c != null) {
                    return false;
                }
            } else if (!this.f22355c.equals(c6589a.f22355c)) {
                return false;
            }
            return this.f22356d == null ? c6589a.f22356d == null : this.f22356d.equals(c6589a.f22356d);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22355c == null ? 0 : this.f22355c.hashCode()) + (((this.f22354b == null ? 0 : this.f22354b.hashCode()) + (((this.f22353a == null ? 0 : this.f22353a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31;
            if (this.f22356d != null) {
                i = this.f22356d.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.amw$b */
    /* loaded from: classes2.dex */
    public static final class C6590b extends AbstractC7649rd {

        /* renamed from: f */
        private static volatile C6590b[] f22357f;

        /* renamed from: a */
        public C6591c[] f22358a;

        /* renamed from: b */
        public String f22359b;

        /* renamed from: c */
        public Long f22360c;

        /* renamed from: d */
        public Long f22361d;

        /* renamed from: e */
        public Integer f22362e;

        public C6590b() {
            m16726c();
        }

        /* renamed from: b */
        public static C6590b[] m16727b() {
            if (f22357f == null) {
                synchronized (C7647rb.f25390c) {
                    if (f22357f == null) {
                        f22357f = new C6590b[0];
                    }
                }
            }
            return f22357f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22358a != null && this.f22358a.length > 0) {
                for (int i = 0; i < this.f22358a.length; i++) {
                    C6591c c6591c = this.f22358a[i];
                    if (c6591c != null) {
                        mo13820a += C7640qw.m13935c(1, c6591c);
                    }
                }
            }
            if (this.f22359b != null) {
                mo13820a += C7640qw.m13948b(2, this.f22359b);
            }
            if (this.f22360c != null) {
                mo13820a += C7640qw.m13920f(3, this.f22360c.longValue());
            }
            if (this.f22361d != null) {
                mo13820a += C7640qw.m13920f(4, this.f22361d.longValue());
            }
            return this.f22362e != null ? mo13820a + C7640qw.m13937c(5, this.f22362e.intValue()) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6590b mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        int m13839b = C7652rg.m13839b(c7639qv, 10);
                        int length = this.f22358a == null ? 0 : this.f22358a.length;
                        C6591c[] c6591cArr = new C6591c[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f22358a, 0, c6591cArr, 0, length);
                        }
                        while (length < c6591cArr.length - 1) {
                            c6591cArr[length] = new C6591c();
                            c7639qv.m14011a(c6591cArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c6591cArr[length] = new C6591c();
                        c7639qv.m14011a(c6591cArr[length]);
                        this.f22358a = c6591cArr;
                        break;
                    case 18:
                        this.f22359b = c7639qv.m13993j();
                        break;
                    case 24:
                        this.f22360c = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 32:
                        this.f22361d = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 40:
                        this.f22362e = Integer.valueOf(c7639qv.m13997g());
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
            if (this.f22358a != null && this.f22358a.length > 0) {
                for (int i = 0; i < this.f22358a.length; i++) {
                    C6591c c6591c = this.f22358a[i];
                    if (c6591c != null) {
                        c7640qw.m13971a(1, c6591c);
                    }
                }
            }
            if (this.f22359b != null) {
                c7640qw.m13970a(2, this.f22359b);
            }
            if (this.f22360c != null) {
                c7640qw.m13950b(3, this.f22360c.longValue());
            }
            if (this.f22361d != null) {
                c7640qw.m13950b(4, this.f22361d.longValue());
            }
            if (this.f22362e != null) {
                c7640qw.m13973a(5, this.f22362e.intValue());
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C6590b m16726c() {
            this.f22358a = C6591c.m16724b();
            this.f22359b = null;
            this.f22360c = null;
            this.f22361d = null;
            this.f22362e = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6590b)) {
                return false;
            }
            C6590b c6590b = (C6590b) obj;
            if (!C7647rb.m13867a(this.f22358a, c6590b.f22358a)) {
                return false;
            }
            if (this.f22359b == null) {
                if (c6590b.f22359b != null) {
                    return false;
                }
            } else if (!this.f22359b.equals(c6590b.f22359b)) {
                return false;
            }
            if (this.f22360c == null) {
                if (c6590b.f22360c != null) {
                    return false;
                }
            } else if (!this.f22360c.equals(c6590b.f22360c)) {
                return false;
            }
            if (this.f22361d == null) {
                if (c6590b.f22361d != null) {
                    return false;
                }
            } else if (!this.f22361d.equals(c6590b.f22361d)) {
                return false;
            }
            return this.f22362e == null ? c6590b.f22362e == null : this.f22362e.equals(c6590b.f22362e);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22361d == null ? 0 : this.f22361d.hashCode()) + (((this.f22360c == null ? 0 : this.f22360c.hashCode()) + (((this.f22359b == null ? 0 : this.f22359b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13868a(this.f22358a)) * 31)) * 31)) * 31)) * 31;
            if (this.f22362e != null) {
                i = this.f22362e.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.amw$c */
    /* loaded from: classes2.dex */
    public static final class C6591c extends AbstractC7649rd {

        /* renamed from: f */
        private static volatile C6591c[] f22363f;

        /* renamed from: a */
        public String f22364a;

        /* renamed from: b */
        public String f22365b;

        /* renamed from: c */
        public Long f22366c;

        /* renamed from: d */
        public Float f22367d;

        /* renamed from: e */
        public Double f22368e;

        public C6591c() {
            m16723c();
        }

        /* renamed from: b */
        public static C6591c[] m16724b() {
            if (f22363f == null) {
                synchronized (C7647rb.f25390c) {
                    if (f22363f == null) {
                        f22363f = new C6591c[0];
                    }
                }
            }
            return f22363f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22364a != null) {
                mo13820a += C7640qw.m13948b(1, this.f22364a);
            }
            if (this.f22365b != null) {
                mo13820a += C7640qw.m13948b(2, this.f22365b);
            }
            if (this.f22366c != null) {
                mo13820a += C7640qw.m13920f(3, this.f22366c.longValue());
            }
            if (this.f22367d != null) {
                mo13820a += C7640qw.m13952b(4, this.f22367d.floatValue());
            }
            return this.f22368e != null ? mo13820a + C7640qw.m13953b(5, this.f22368e.doubleValue()) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6591c mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f22364a = c7639qv.m13993j();
                        break;
                    case 18:
                        this.f22365b = c7639qv.m13993j();
                        break;
                    case 24:
                        this.f22366c = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 37:
                        this.f22367d = Float.valueOf(c7639qv.m14003d());
                        break;
                    case 41:
                        this.f22368e = Double.valueOf(c7639qv.m14005c());
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
            if (this.f22364a != null) {
                c7640qw.m13970a(1, this.f22364a);
            }
            if (this.f22365b != null) {
                c7640qw.m13970a(2, this.f22365b);
            }
            if (this.f22366c != null) {
                c7640qw.m13950b(3, this.f22366c.longValue());
            }
            if (this.f22367d != null) {
                c7640qw.m13974a(4, this.f22367d.floatValue());
            }
            if (this.f22368e != null) {
                c7640qw.m13975a(5, this.f22368e.doubleValue());
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C6591c m16723c() {
            this.f22364a = null;
            this.f22365b = null;
            this.f22366c = null;
            this.f22367d = null;
            this.f22368e = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6591c)) {
                return false;
            }
            C6591c c6591c = (C6591c) obj;
            if (this.f22364a == null) {
                if (c6591c.f22364a != null) {
                    return false;
                }
            } else if (!this.f22364a.equals(c6591c.f22364a)) {
                return false;
            }
            if (this.f22365b == null) {
                if (c6591c.f22365b != null) {
                    return false;
                }
            } else if (!this.f22365b.equals(c6591c.f22365b)) {
                return false;
            }
            if (this.f22366c == null) {
                if (c6591c.f22366c != null) {
                    return false;
                }
            } else if (!this.f22366c.equals(c6591c.f22366c)) {
                return false;
            }
            if (this.f22367d == null) {
                if (c6591c.f22367d != null) {
                    return false;
                }
            } else if (!this.f22367d.equals(c6591c.f22367d)) {
                return false;
            }
            return this.f22368e == null ? c6591c.f22368e == null : this.f22368e.equals(c6591c.f22368e);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22367d == null ? 0 : this.f22367d.hashCode()) + (((this.f22366c == null ? 0 : this.f22366c.hashCode()) + (((this.f22365b == null ? 0 : this.f22365b.hashCode()) + (((this.f22364a == null ? 0 : this.f22364a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.f22368e != null) {
                i = this.f22368e.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.amw$d */
    /* loaded from: classes2.dex */
    public static final class C6592d extends AbstractC7649rd {

        /* renamed from: a */
        public C6593e[] f22369a;

        public C6592d() {
            m16721b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22369a != null && this.f22369a.length > 0) {
                for (int i = 0; i < this.f22369a.length; i++) {
                    C6593e c6593e = this.f22369a[i];
                    if (c6593e != null) {
                        mo13820a += C7640qw.m13935c(1, c6593e);
                    }
                }
            }
            return mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6592d mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        int m13839b = C7652rg.m13839b(c7639qv, 10);
                        int length = this.f22369a == null ? 0 : this.f22369a.length;
                        C6593e[] c6593eArr = new C6593e[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f22369a, 0, c6593eArr, 0, length);
                        }
                        while (length < c6593eArr.length - 1) {
                            c6593eArr[length] = new C6593e();
                            c7639qv.m14011a(c6593eArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c6593eArr[length] = new C6593e();
                        c7639qv.m14011a(c6593eArr[length]);
                        this.f22369a = c6593eArr;
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
            if (this.f22369a != null && this.f22369a.length > 0) {
                for (int i = 0; i < this.f22369a.length; i++) {
                    C6593e c6593e = this.f22369a[i];
                    if (c6593e != null) {
                        c7640qw.m13971a(1, c6593e);
                    }
                }
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C6592d m16721b() {
            this.f22369a = C6593e.m16719b();
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof C6592d) && C7647rb.m13867a(this.f22369a, ((C6592d) obj).f22369a);
        }

        public int hashCode() {
            return ((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13868a(this.f22369a);
        }
    }

    /* renamed from: com.google.android.gms.internal.amw$e */
    /* loaded from: classes2.dex */
    public static final class C6593e extends AbstractC7649rd {

        /* renamed from: G */
        private static volatile C6593e[] f22370G;

        /* renamed from: A */
        public C6589a[] f22371A;

        /* renamed from: B */
        public String f22372B;

        /* renamed from: C */
        public Integer f22373C;

        /* renamed from: D */
        public Integer f22374D;

        /* renamed from: E */
        public Integer f22375E;

        /* renamed from: F */
        public String f22376F;

        /* renamed from: a */
        public Integer f22377a;

        /* renamed from: b */
        public C6590b[] f22378b;

        /* renamed from: c */
        public C6595g[] f22379c;

        /* renamed from: d */
        public Long f22380d;

        /* renamed from: e */
        public Long f22381e;

        /* renamed from: f */
        public Long f22382f;

        /* renamed from: g */
        public Long f22383g;

        /* renamed from: h */
        public Long f22384h;

        /* renamed from: i */
        public String f22385i;

        /* renamed from: j */
        public String f22386j;

        /* renamed from: k */
        public String f22387k;

        /* renamed from: l */
        public String f22388l;

        /* renamed from: m */
        public Integer f22389m;

        /* renamed from: n */
        public String f22390n;

        /* renamed from: o */
        public String f22391o;

        /* renamed from: p */
        public String f22392p;

        /* renamed from: q */
        public Long f22393q;

        /* renamed from: r */
        public Long f22394r;

        /* renamed from: s */
        public String f22395s;

        /* renamed from: t */
        public Boolean f22396t;

        /* renamed from: u */
        public String f22397u;

        /* renamed from: v */
        public Long f22398v;

        /* renamed from: w */
        public Integer f22399w;

        /* renamed from: x */
        public String f22400x;

        /* renamed from: y */
        public String f22401y;

        /* renamed from: z */
        public Boolean f22402z;

        public C6593e() {
            m16718c();
        }

        /* renamed from: b */
        public static C6593e[] m16719b() {
            if (f22370G == null) {
                synchronized (C7647rb.f25390c) {
                    if (f22370G == null) {
                        f22370G = new C6593e[0];
                    }
                }
            }
            return f22370G;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22377a != null) {
                mo13820a += C7640qw.m13937c(1, this.f22377a.intValue());
            }
            if (this.f22378b != null && this.f22378b.length > 0) {
                int i = mo13820a;
                for (int i2 = 0; i2 < this.f22378b.length; i2++) {
                    C6590b c6590b = this.f22378b[i2];
                    if (c6590b != null) {
                        i += C7640qw.m13935c(2, c6590b);
                    }
                }
                mo13820a = i;
            }
            if (this.f22379c != null && this.f22379c.length > 0) {
                int i3 = mo13820a;
                for (int i4 = 0; i4 < this.f22379c.length; i4++) {
                    C6595g c6595g = this.f22379c[i4];
                    if (c6595g != null) {
                        i3 += C7640qw.m13935c(3, c6595g);
                    }
                }
                mo13820a = i3;
            }
            if (this.f22380d != null) {
                mo13820a += C7640qw.m13920f(4, this.f22380d.longValue());
            }
            if (this.f22381e != null) {
                mo13820a += C7640qw.m13920f(5, this.f22381e.longValue());
            }
            if (this.f22382f != null) {
                mo13820a += C7640qw.m13920f(6, this.f22382f.longValue());
            }
            if (this.f22384h != null) {
                mo13820a += C7640qw.m13920f(7, this.f22384h.longValue());
            }
            if (this.f22385i != null) {
                mo13820a += C7640qw.m13948b(8, this.f22385i);
            }
            if (this.f22386j != null) {
                mo13820a += C7640qw.m13948b(9, this.f22386j);
            }
            if (this.f22387k != null) {
                mo13820a += C7640qw.m13948b(10, this.f22387k);
            }
            if (this.f22388l != null) {
                mo13820a += C7640qw.m13948b(11, this.f22388l);
            }
            if (this.f22389m != null) {
                mo13820a += C7640qw.m13937c(12, this.f22389m.intValue());
            }
            if (this.f22390n != null) {
                mo13820a += C7640qw.m13948b(13, this.f22390n);
            }
            if (this.f22391o != null) {
                mo13820a += C7640qw.m13948b(14, this.f22391o);
            }
            if (this.f22392p != null) {
                mo13820a += C7640qw.m13948b(16, this.f22392p);
            }
            if (this.f22393q != null) {
                mo13820a += C7640qw.m13920f(17, this.f22393q.longValue());
            }
            if (this.f22394r != null) {
                mo13820a += C7640qw.m13920f(18, this.f22394r.longValue());
            }
            if (this.f22395s != null) {
                mo13820a += C7640qw.m13948b(19, this.f22395s);
            }
            if (this.f22396t != null) {
                mo13820a += C7640qw.m13947b(20, this.f22396t.booleanValue());
            }
            if (this.f22397u != null) {
                mo13820a += C7640qw.m13948b(21, this.f22397u);
            }
            if (this.f22398v != null) {
                mo13820a += C7640qw.m13920f(22, this.f22398v.longValue());
            }
            if (this.f22399w != null) {
                mo13820a += C7640qw.m13937c(23, this.f22399w.intValue());
            }
            if (this.f22400x != null) {
                mo13820a += C7640qw.m13948b(24, this.f22400x);
            }
            if (this.f22401y != null) {
                mo13820a += C7640qw.m13948b(25, this.f22401y);
            }
            if (this.f22383g != null) {
                mo13820a += C7640qw.m13920f(26, this.f22383g.longValue());
            }
            if (this.f22402z != null) {
                mo13820a += C7640qw.m13947b(28, this.f22402z.booleanValue());
            }
            if (this.f22371A != null && this.f22371A.length > 0) {
                for (int i5 = 0; i5 < this.f22371A.length; i5++) {
                    C6589a c6589a = this.f22371A[i5];
                    if (c6589a != null) {
                        mo13820a += C7640qw.m13935c(29, c6589a);
                    }
                }
            }
            if (this.f22372B != null) {
                mo13820a += C7640qw.m13948b(30, this.f22372B);
            }
            if (this.f22373C != null) {
                mo13820a += C7640qw.m13937c(31, this.f22373C.intValue());
            }
            if (this.f22374D != null) {
                mo13820a += C7640qw.m13937c(32, this.f22374D.intValue());
            }
            if (this.f22375E != null) {
                mo13820a += C7640qw.m13937c(33, this.f22375E.intValue());
            }
            return this.f22376F != null ? mo13820a + C7640qw.m13948b(34, this.f22376F) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6593e mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f22377a = Integer.valueOf(c7639qv.m13997g());
                        break;
                    case 18:
                        int m13839b = C7652rg.m13839b(c7639qv, 18);
                        int length = this.f22378b == null ? 0 : this.f22378b.length;
                        C6590b[] c6590bArr = new C6590b[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f22378b, 0, c6590bArr, 0, length);
                        }
                        while (length < c6590bArr.length - 1) {
                            c6590bArr[length] = new C6590b();
                            c7639qv.m14011a(c6590bArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c6590bArr[length] = new C6590b();
                        c7639qv.m14011a(c6590bArr[length]);
                        this.f22378b = c6590bArr;
                        break;
                    case 26:
                        int m13839b2 = C7652rg.m13839b(c7639qv, 26);
                        int length2 = this.f22379c == null ? 0 : this.f22379c.length;
                        C6595g[] c6595gArr = new C6595g[m13839b2 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f22379c, 0, c6595gArr, 0, length2);
                        }
                        while (length2 < c6595gArr.length - 1) {
                            c6595gArr[length2] = new C6595g();
                            c7639qv.m14011a(c6595gArr[length2]);
                            c7639qv.m14015a();
                            length2++;
                        }
                        c6595gArr[length2] = new C6595g();
                        c7639qv.m14011a(c6595gArr[length2]);
                        this.f22379c = c6595gArr;
                        break;
                    case 32:
                        this.f22380d = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 40:
                        this.f22381e = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 48:
                        this.f22382f = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 56:
                        this.f22384h = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 66:
                        this.f22385i = c7639qv.m13993j();
                        break;
                    case 74:
                        this.f22386j = c7639qv.m13993j();
                        break;
                    case 82:
                        this.f22387k = c7639qv.m13993j();
                        break;
                    case 90:
                        this.f22388l = c7639qv.m13993j();
                        break;
                    case 96:
                        this.f22389m = Integer.valueOf(c7639qv.m13997g());
                        break;
                    case 106:
                        this.f22390n = c7639qv.m13993j();
                        break;
                    case 114:
                        this.f22391o = c7639qv.m13993j();
                        break;
                    case 130:
                        this.f22392p = c7639qv.m13993j();
                        break;
                    case 136:
                        this.f22393q = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 144:
                        this.f22394r = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 154:
                        this.f22395s = c7639qv.m13993j();
                        break;
                    case 160:
                        this.f22396t = Boolean.valueOf(c7639qv.m13994i());
                        break;
                    case 170:
                        this.f22397u = c7639qv.m13993j();
                        break;
                    case 176:
                        this.f22398v = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 184:
                        this.f22399w = Integer.valueOf(c7639qv.m13997g());
                        break;
                    case 194:
                        this.f22400x = c7639qv.m13993j();
                        break;
                    case 202:
                        this.f22401y = c7639qv.m13993j();
                        break;
                    case JfifUtil.MARKER_RST0 /* 208 */:
                        this.f22383g = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 224:
                        this.f22402z = Boolean.valueOf(c7639qv.m13994i());
                        break;
                    case 234:
                        int m13839b3 = C7652rg.m13839b(c7639qv, 234);
                        int length3 = this.f22371A == null ? 0 : this.f22371A.length;
                        C6589a[] c6589aArr = new C6589a[m13839b3 + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.f22371A, 0, c6589aArr, 0, length3);
                        }
                        while (length3 < c6589aArr.length - 1) {
                            c6589aArr[length3] = new C6589a();
                            c7639qv.m14011a(c6589aArr[length3]);
                            c7639qv.m14015a();
                            length3++;
                        }
                        c6589aArr[length3] = new C6589a();
                        c7639qv.m14011a(c6589aArr[length3]);
                        this.f22371A = c6589aArr;
                        break;
                    case 242:
                        this.f22372B = c7639qv.m13993j();
                        break;
                    case 248:
                        this.f22373C = Integer.valueOf(c7639qv.m13997g());
                        break;
                    case 256:
                        this.f22374D = Integer.valueOf(c7639qv.m13997g());
                        break;
                    case 264:
                        this.f22375E = Integer.valueOf(c7639qv.m13997g());
                        break;
                    case TiffUtil.TIFF_TAG_ORIENTATION /* 274 */:
                        this.f22376F = c7639qv.m13993j();
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
            if (this.f22377a != null) {
                c7640qw.m13973a(1, this.f22377a.intValue());
            }
            if (this.f22378b != null && this.f22378b.length > 0) {
                for (int i = 0; i < this.f22378b.length; i++) {
                    C6590b c6590b = this.f22378b[i];
                    if (c6590b != null) {
                        c7640qw.m13971a(2, c6590b);
                    }
                }
            }
            if (this.f22379c != null && this.f22379c.length > 0) {
                for (int i2 = 0; i2 < this.f22379c.length; i2++) {
                    C6595g c6595g = this.f22379c[i2];
                    if (c6595g != null) {
                        c7640qw.m13971a(3, c6595g);
                    }
                }
            }
            if (this.f22380d != null) {
                c7640qw.m13950b(4, this.f22380d.longValue());
            }
            if (this.f22381e != null) {
                c7640qw.m13950b(5, this.f22381e.longValue());
            }
            if (this.f22382f != null) {
                c7640qw.m13950b(6, this.f22382f.longValue());
            }
            if (this.f22384h != null) {
                c7640qw.m13950b(7, this.f22384h.longValue());
            }
            if (this.f22385i != null) {
                c7640qw.m13970a(8, this.f22385i);
            }
            if (this.f22386j != null) {
                c7640qw.m13970a(9, this.f22386j);
            }
            if (this.f22387k != null) {
                c7640qw.m13970a(10, this.f22387k);
            }
            if (this.f22388l != null) {
                c7640qw.m13970a(11, this.f22388l);
            }
            if (this.f22389m != null) {
                c7640qw.m13973a(12, this.f22389m.intValue());
            }
            if (this.f22390n != null) {
                c7640qw.m13970a(13, this.f22390n);
            }
            if (this.f22391o != null) {
                c7640qw.m13970a(14, this.f22391o);
            }
            if (this.f22392p != null) {
                c7640qw.m13970a(16, this.f22392p);
            }
            if (this.f22393q != null) {
                c7640qw.m13950b(17, this.f22393q.longValue());
            }
            if (this.f22394r != null) {
                c7640qw.m13950b(18, this.f22394r.longValue());
            }
            if (this.f22395s != null) {
                c7640qw.m13970a(19, this.f22395s);
            }
            if (this.f22396t != null) {
                c7640qw.m13969a(20, this.f22396t.booleanValue());
            }
            if (this.f22397u != null) {
                c7640qw.m13970a(21, this.f22397u);
            }
            if (this.f22398v != null) {
                c7640qw.m13950b(22, this.f22398v.longValue());
            }
            if (this.f22399w != null) {
                c7640qw.m13973a(23, this.f22399w.intValue());
            }
            if (this.f22400x != null) {
                c7640qw.m13970a(24, this.f22400x);
            }
            if (this.f22401y != null) {
                c7640qw.m13970a(25, this.f22401y);
            }
            if (this.f22383g != null) {
                c7640qw.m13950b(26, this.f22383g.longValue());
            }
            if (this.f22402z != null) {
                c7640qw.m13969a(28, this.f22402z.booleanValue());
            }
            if (this.f22371A != null && this.f22371A.length > 0) {
                for (int i3 = 0; i3 < this.f22371A.length; i3++) {
                    C6589a c6589a = this.f22371A[i3];
                    if (c6589a != null) {
                        c7640qw.m13971a(29, c6589a);
                    }
                }
            }
            if (this.f22372B != null) {
                c7640qw.m13970a(30, this.f22372B);
            }
            if (this.f22373C != null) {
                c7640qw.m13973a(31, this.f22373C.intValue());
            }
            if (this.f22374D != null) {
                c7640qw.m13973a(32, this.f22374D.intValue());
            }
            if (this.f22375E != null) {
                c7640qw.m13973a(33, this.f22375E.intValue());
            }
            if (this.f22376F != null) {
                c7640qw.m13970a(34, this.f22376F);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C6593e m16718c() {
            this.f22377a = null;
            this.f22378b = C6590b.m16727b();
            this.f22379c = C6595g.m16714b();
            this.f22380d = null;
            this.f22381e = null;
            this.f22382f = null;
            this.f22383g = null;
            this.f22384h = null;
            this.f22385i = null;
            this.f22386j = null;
            this.f22387k = null;
            this.f22388l = null;
            this.f22389m = null;
            this.f22390n = null;
            this.f22391o = null;
            this.f22392p = null;
            this.f22393q = null;
            this.f22394r = null;
            this.f22395s = null;
            this.f22396t = null;
            this.f22397u = null;
            this.f22398v = null;
            this.f22399w = null;
            this.f22400x = null;
            this.f22401y = null;
            this.f22402z = null;
            this.f22371A = C6589a.m16730b();
            this.f22372B = null;
            this.f22373C = null;
            this.f22374D = null;
            this.f22375E = null;
            this.f22376F = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6593e)) {
                return false;
            }
            C6593e c6593e = (C6593e) obj;
            if (this.f22377a == null) {
                if (c6593e.f22377a != null) {
                    return false;
                }
            } else if (!this.f22377a.equals(c6593e.f22377a)) {
                return false;
            }
            if (C7647rb.m13867a(this.f22378b, c6593e.f22378b) && C7647rb.m13867a(this.f22379c, c6593e.f22379c)) {
                if (this.f22380d == null) {
                    if (c6593e.f22380d != null) {
                        return false;
                    }
                } else if (!this.f22380d.equals(c6593e.f22380d)) {
                    return false;
                }
                if (this.f22381e == null) {
                    if (c6593e.f22381e != null) {
                        return false;
                    }
                } else if (!this.f22381e.equals(c6593e.f22381e)) {
                    return false;
                }
                if (this.f22382f == null) {
                    if (c6593e.f22382f != null) {
                        return false;
                    }
                } else if (!this.f22382f.equals(c6593e.f22382f)) {
                    return false;
                }
                if (this.f22383g == null) {
                    if (c6593e.f22383g != null) {
                        return false;
                    }
                } else if (!this.f22383g.equals(c6593e.f22383g)) {
                    return false;
                }
                if (this.f22384h == null) {
                    if (c6593e.f22384h != null) {
                        return false;
                    }
                } else if (!this.f22384h.equals(c6593e.f22384h)) {
                    return false;
                }
                if (this.f22385i == null) {
                    if (c6593e.f22385i != null) {
                        return false;
                    }
                } else if (!this.f22385i.equals(c6593e.f22385i)) {
                    return false;
                }
                if (this.f22386j == null) {
                    if (c6593e.f22386j != null) {
                        return false;
                    }
                } else if (!this.f22386j.equals(c6593e.f22386j)) {
                    return false;
                }
                if (this.f22387k == null) {
                    if (c6593e.f22387k != null) {
                        return false;
                    }
                } else if (!this.f22387k.equals(c6593e.f22387k)) {
                    return false;
                }
                if (this.f22388l == null) {
                    if (c6593e.f22388l != null) {
                        return false;
                    }
                } else if (!this.f22388l.equals(c6593e.f22388l)) {
                    return false;
                }
                if (this.f22389m == null) {
                    if (c6593e.f22389m != null) {
                        return false;
                    }
                } else if (!this.f22389m.equals(c6593e.f22389m)) {
                    return false;
                }
                if (this.f22390n == null) {
                    if (c6593e.f22390n != null) {
                        return false;
                    }
                } else if (!this.f22390n.equals(c6593e.f22390n)) {
                    return false;
                }
                if (this.f22391o == null) {
                    if (c6593e.f22391o != null) {
                        return false;
                    }
                } else if (!this.f22391o.equals(c6593e.f22391o)) {
                    return false;
                }
                if (this.f22392p == null) {
                    if (c6593e.f22392p != null) {
                        return false;
                    }
                } else if (!this.f22392p.equals(c6593e.f22392p)) {
                    return false;
                }
                if (this.f22393q == null) {
                    if (c6593e.f22393q != null) {
                        return false;
                    }
                } else if (!this.f22393q.equals(c6593e.f22393q)) {
                    return false;
                }
                if (this.f22394r == null) {
                    if (c6593e.f22394r != null) {
                        return false;
                    }
                } else if (!this.f22394r.equals(c6593e.f22394r)) {
                    return false;
                }
                if (this.f22395s == null) {
                    if (c6593e.f22395s != null) {
                        return false;
                    }
                } else if (!this.f22395s.equals(c6593e.f22395s)) {
                    return false;
                }
                if (this.f22396t == null) {
                    if (c6593e.f22396t != null) {
                        return false;
                    }
                } else if (!this.f22396t.equals(c6593e.f22396t)) {
                    return false;
                }
                if (this.f22397u == null) {
                    if (c6593e.f22397u != null) {
                        return false;
                    }
                } else if (!this.f22397u.equals(c6593e.f22397u)) {
                    return false;
                }
                if (this.f22398v == null) {
                    if (c6593e.f22398v != null) {
                        return false;
                    }
                } else if (!this.f22398v.equals(c6593e.f22398v)) {
                    return false;
                }
                if (this.f22399w == null) {
                    if (c6593e.f22399w != null) {
                        return false;
                    }
                } else if (!this.f22399w.equals(c6593e.f22399w)) {
                    return false;
                }
                if (this.f22400x == null) {
                    if (c6593e.f22400x != null) {
                        return false;
                    }
                } else if (!this.f22400x.equals(c6593e.f22400x)) {
                    return false;
                }
                if (this.f22401y == null) {
                    if (c6593e.f22401y != null) {
                        return false;
                    }
                } else if (!this.f22401y.equals(c6593e.f22401y)) {
                    return false;
                }
                if (this.f22402z == null) {
                    if (c6593e.f22402z != null) {
                        return false;
                    }
                } else if (!this.f22402z.equals(c6593e.f22402z)) {
                    return false;
                }
                if (!C7647rb.m13867a(this.f22371A, c6593e.f22371A)) {
                    return false;
                }
                if (this.f22372B == null) {
                    if (c6593e.f22372B != null) {
                        return false;
                    }
                } else if (!this.f22372B.equals(c6593e.f22372B)) {
                    return false;
                }
                if (this.f22373C == null) {
                    if (c6593e.f22373C != null) {
                        return false;
                    }
                } else if (!this.f22373C.equals(c6593e.f22373C)) {
                    return false;
                }
                if (this.f22374D == null) {
                    if (c6593e.f22374D != null) {
                        return false;
                    }
                } else if (!this.f22374D.equals(c6593e.f22374D)) {
                    return false;
                }
                if (this.f22375E == null) {
                    if (c6593e.f22375E != null) {
                        return false;
                    }
                } else if (!this.f22375E.equals(c6593e.f22375E)) {
                    return false;
                }
                return this.f22376F == null ? c6593e.f22376F == null : this.f22376F.equals(c6593e.f22376F);
            }
            return false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22375E == null ? 0 : this.f22375E.hashCode()) + (((this.f22374D == null ? 0 : this.f22374D.hashCode()) + (((this.f22373C == null ? 0 : this.f22373C.hashCode()) + (((this.f22372B == null ? 0 : this.f22372B.hashCode()) + (((((this.f22402z == null ? 0 : this.f22402z.hashCode()) + (((this.f22401y == null ? 0 : this.f22401y.hashCode()) + (((this.f22400x == null ? 0 : this.f22400x.hashCode()) + (((this.f22399w == null ? 0 : this.f22399w.hashCode()) + (((this.f22398v == null ? 0 : this.f22398v.hashCode()) + (((this.f22397u == null ? 0 : this.f22397u.hashCode()) + (((this.f22396t == null ? 0 : this.f22396t.hashCode()) + (((this.f22395s == null ? 0 : this.f22395s.hashCode()) + (((this.f22394r == null ? 0 : this.f22394r.hashCode()) + (((this.f22393q == null ? 0 : this.f22393q.hashCode()) + (((this.f22392p == null ? 0 : this.f22392p.hashCode()) + (((this.f22391o == null ? 0 : this.f22391o.hashCode()) + (((this.f22390n == null ? 0 : this.f22390n.hashCode()) + (((this.f22389m == null ? 0 : this.f22389m.hashCode()) + (((this.f22388l == null ? 0 : this.f22388l.hashCode()) + (((this.f22387k == null ? 0 : this.f22387k.hashCode()) + (((this.f22386j == null ? 0 : this.f22386j.hashCode()) + (((this.f22385i == null ? 0 : this.f22385i.hashCode()) + (((this.f22384h == null ? 0 : this.f22384h.hashCode()) + (((this.f22383g == null ? 0 : this.f22383g.hashCode()) + (((this.f22382f == null ? 0 : this.f22382f.hashCode()) + (((this.f22381e == null ? 0 : this.f22381e.hashCode()) + (((this.f22380d == null ? 0 : this.f22380d.hashCode()) + (((((((this.f22377a == null ? 0 : this.f22377a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + C7647rb.m13868a(this.f22378b)) * 31) + C7647rb.m13868a(this.f22379c)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + C7647rb.m13868a(this.f22371A)) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.f22376F != null) {
                i = this.f22376F.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.amw$f */
    /* loaded from: classes2.dex */
    public static final class C6594f extends AbstractC7649rd {

        /* renamed from: a */
        public long[] f22403a;

        /* renamed from: b */
        public long[] f22404b;

        public C6594f() {
            m16716b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int i;
            int mo13820a = super.mo13820a();
            if (this.f22403a == null || this.f22403a.length <= 0) {
                i = mo13820a;
            } else {
                int i2 = 0;
                for (int i3 = 0; i3 < this.f22403a.length; i3++) {
                    i2 += C7640qw.m13922e(this.f22403a[i3]);
                }
                i = mo13820a + i2 + (this.f22403a.length * 1);
            }
            if (this.f22404b == null || this.f22404b.length <= 0) {
                return i;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f22404b.length; i5++) {
                i4 += C7640qw.m13922e(this.f22404b[i5]);
            }
            return i + i4 + (this.f22404b.length * 1);
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6594f mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        int m13839b = C7652rg.m13839b(c7639qv, 8);
                        int length = this.f22403a == null ? 0 : this.f22403a.length;
                        long[] jArr = new long[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f22403a, 0, jArr, 0, length);
                        }
                        while (length < jArr.length - 1) {
                            jArr[length] = c7639qv.m14001e();
                            c7639qv.m14015a();
                            length++;
                        }
                        jArr[length] = c7639qv.m14001e();
                        this.f22403a = jArr;
                        break;
                    case 10:
                        int m14002d = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t = c7639qv.m13983t();
                        int i = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m14001e();
                            i++;
                        }
                        c7639qv.m13998f(m13983t);
                        int length2 = this.f22403a == null ? 0 : this.f22403a.length;
                        long[] jArr2 = new long[i + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f22403a, 0, jArr2, 0, length2);
                        }
                        while (length2 < jArr2.length) {
                            jArr2[length2] = c7639qv.m14001e();
                            length2++;
                        }
                        this.f22403a = jArr2;
                        c7639qv.m14000e(m14002d);
                        break;
                    case 16:
                        int m13839b2 = C7652rg.m13839b(c7639qv, 16);
                        int length3 = this.f22404b == null ? 0 : this.f22404b.length;
                        long[] jArr3 = new long[m13839b2 + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.f22404b, 0, jArr3, 0, length3);
                        }
                        while (length3 < jArr3.length - 1) {
                            jArr3[length3] = c7639qv.m14001e();
                            c7639qv.m14015a();
                            length3++;
                        }
                        jArr3[length3] = c7639qv.m14001e();
                        this.f22404b = jArr3;
                        break;
                    case 18:
                        int m14002d2 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t2 = c7639qv.m13983t();
                        int i2 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m14001e();
                            i2++;
                        }
                        c7639qv.m13998f(m13983t2);
                        int length4 = this.f22404b == null ? 0 : this.f22404b.length;
                        long[] jArr4 = new long[i2 + length4];
                        if (length4 != 0) {
                            System.arraycopy(this.f22404b, 0, jArr4, 0, length4);
                        }
                        while (length4 < jArr4.length) {
                            jArr4[length4] = c7639qv.m14001e();
                            length4++;
                        }
                        this.f22404b = jArr4;
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
            if (this.f22403a != null && this.f22403a.length > 0) {
                for (int i = 0; i < this.f22403a.length; i++) {
                    c7640qw.m13972a(1, this.f22403a[i]);
                }
            }
            if (this.f22404b != null && this.f22404b.length > 0) {
                for (int i2 = 0; i2 < this.f22404b.length; i2++) {
                    c7640qw.m13972a(2, this.f22404b[i2]);
                }
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C6594f m16716b() {
            this.f22403a = C7652rg.f25395b;
            this.f22404b = C7652rg.f25395b;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6594f)) {
                return false;
            }
            C6594f c6594f = (C6594f) obj;
            return C7647rb.m13869a(this.f22403a, c6594f.f22403a) && C7647rb.m13869a(this.f22404b, c6594f.f22404b);
        }

        public int hashCode() {
            return ((((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13870a(this.f22403a)) * 31) + C7647rb.m13870a(this.f22404b);
        }
    }

    /* renamed from: com.google.android.gms.internal.amw$g */
    /* loaded from: classes2.dex */
    public static final class C6595g extends AbstractC7649rd {

        /* renamed from: g */
        private static volatile C6595g[] f22405g;

        /* renamed from: a */
        public Long f22406a;

        /* renamed from: b */
        public String f22407b;

        /* renamed from: c */
        public String f22408c;

        /* renamed from: d */
        public Long f22409d;

        /* renamed from: e */
        public Float f22410e;

        /* renamed from: f */
        public Double f22411f;

        public C6595g() {
            m16713c();
        }

        /* renamed from: b */
        public static C6595g[] m16714b() {
            if (f22405g == null) {
                synchronized (C7647rb.f25390c) {
                    if (f22405g == null) {
                        f22405g = new C6595g[0];
                    }
                }
            }
            return f22405g;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22406a != null) {
                mo13820a += C7640qw.m13920f(1, this.f22406a.longValue());
            }
            if (this.f22407b != null) {
                mo13820a += C7640qw.m13948b(2, this.f22407b);
            }
            if (this.f22408c != null) {
                mo13820a += C7640qw.m13948b(3, this.f22408c);
            }
            if (this.f22409d != null) {
                mo13820a += C7640qw.m13920f(4, this.f22409d.longValue());
            }
            if (this.f22410e != null) {
                mo13820a += C7640qw.m13952b(5, this.f22410e.floatValue());
            }
            return this.f22411f != null ? mo13820a + C7640qw.m13953b(6, this.f22411f.doubleValue()) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6595g mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f22406a = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 18:
                        this.f22407b = c7639qv.m13993j();
                        break;
                    case 26:
                        this.f22408c = c7639qv.m13993j();
                        break;
                    case 32:
                        this.f22409d = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 45:
                        this.f22410e = Float.valueOf(c7639qv.m14003d());
                        break;
                    case 49:
                        this.f22411f = Double.valueOf(c7639qv.m14005c());
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
            if (this.f22406a != null) {
                c7640qw.m13950b(1, this.f22406a.longValue());
            }
            if (this.f22407b != null) {
                c7640qw.m13970a(2, this.f22407b);
            }
            if (this.f22408c != null) {
                c7640qw.m13970a(3, this.f22408c);
            }
            if (this.f22409d != null) {
                c7640qw.m13950b(4, this.f22409d.longValue());
            }
            if (this.f22410e != null) {
                c7640qw.m13974a(5, this.f22410e.floatValue());
            }
            if (this.f22411f != null) {
                c7640qw.m13975a(6, this.f22411f.doubleValue());
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C6595g m16713c() {
            this.f22406a = null;
            this.f22407b = null;
            this.f22408c = null;
            this.f22409d = null;
            this.f22410e = null;
            this.f22411f = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6595g)) {
                return false;
            }
            C6595g c6595g = (C6595g) obj;
            if (this.f22406a == null) {
                if (c6595g.f22406a != null) {
                    return false;
                }
            } else if (!this.f22406a.equals(c6595g.f22406a)) {
                return false;
            }
            if (this.f22407b == null) {
                if (c6595g.f22407b != null) {
                    return false;
                }
            } else if (!this.f22407b.equals(c6595g.f22407b)) {
                return false;
            }
            if (this.f22408c == null) {
                if (c6595g.f22408c != null) {
                    return false;
                }
            } else if (!this.f22408c.equals(c6595g.f22408c)) {
                return false;
            }
            if (this.f22409d == null) {
                if (c6595g.f22409d != null) {
                    return false;
                }
            } else if (!this.f22409d.equals(c6595g.f22409d)) {
                return false;
            }
            if (this.f22410e == null) {
                if (c6595g.f22410e != null) {
                    return false;
                }
            } else if (!this.f22410e.equals(c6595g.f22410e)) {
                return false;
            }
            return this.f22411f == null ? c6595g.f22411f == null : this.f22411f.equals(c6595g.f22411f);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22410e == null ? 0 : this.f22410e.hashCode()) + (((this.f22409d == null ? 0 : this.f22409d.hashCode()) + (((this.f22408c == null ? 0 : this.f22408c.hashCode()) + (((this.f22407b == null ? 0 : this.f22407b.hashCode()) + (((this.f22406a == null ? 0 : this.f22406a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.f22411f != null) {
                i = this.f22411f.hashCode();
            }
            return hashCode + i;
        }
    }
}
