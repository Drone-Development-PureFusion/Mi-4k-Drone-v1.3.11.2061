package com.google.android.gms.internal;

import com.google.android.gms.internal.amu;
/* loaded from: classes2.dex */
public interface amv {

    /* renamed from: com.google.android.gms.internal.amv$a */
    /* loaded from: classes2.dex */
    public static final class C6586a extends AbstractC7649rd {

        /* renamed from: d */
        private static volatile C6586a[] f22339d;

        /* renamed from: a */
        public String f22340a;

        /* renamed from: b */
        public Boolean f22341b;

        /* renamed from: c */
        public Boolean f22342c;

        public C6586a() {
            m16737c();
        }

        /* renamed from: b */
        public static C6586a[] m16738b() {
            if (f22339d == null) {
                synchronized (C7647rb.f25390c) {
                    if (f22339d == null) {
                        f22339d = new C6586a[0];
                    }
                }
            }
            return f22339d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22340a != null) {
                mo13820a += C7640qw.m13948b(1, this.f22340a);
            }
            if (this.f22341b != null) {
                mo13820a += C7640qw.m13947b(2, this.f22341b.booleanValue());
            }
            return this.f22342c != null ? mo13820a + C7640qw.m13947b(3, this.f22342c.booleanValue()) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6586a mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f22340a = c7639qv.m13993j();
                        break;
                    case 16:
                        this.f22341b = Boolean.valueOf(c7639qv.m13994i());
                        break;
                    case 24:
                        this.f22342c = Boolean.valueOf(c7639qv.m13994i());
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
            if (this.f22340a != null) {
                c7640qw.m13970a(1, this.f22340a);
            }
            if (this.f22341b != null) {
                c7640qw.m13969a(2, this.f22341b.booleanValue());
            }
            if (this.f22342c != null) {
                c7640qw.m13969a(3, this.f22342c.booleanValue());
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C6586a m16737c() {
            this.f22340a = null;
            this.f22341b = null;
            this.f22342c = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6586a)) {
                return false;
            }
            C6586a c6586a = (C6586a) obj;
            if (this.f22340a == null) {
                if (c6586a.f22340a != null) {
                    return false;
                }
            } else if (!this.f22340a.equals(c6586a.f22340a)) {
                return false;
            }
            if (this.f22341b == null) {
                if (c6586a.f22341b != null) {
                    return false;
                }
            } else if (!this.f22341b.equals(c6586a.f22341b)) {
                return false;
            }
            return this.f22342c == null ? c6586a.f22342c == null : this.f22342c.equals(c6586a.f22342c);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22341b == null ? 0 : this.f22341b.hashCode()) + (((this.f22340a == null ? 0 : this.f22340a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.f22342c != null) {
                i = this.f22342c.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.amv$b */
    /* loaded from: classes2.dex */
    public static final class C6587b extends AbstractC7649rd {

        /* renamed from: a */
        public Long f22343a;

        /* renamed from: b */
        public String f22344b;

        /* renamed from: c */
        public Integer f22345c;

        /* renamed from: d */
        public C6588c[] f22346d;

        /* renamed from: e */
        public C6586a[] f22347e;

        /* renamed from: f */
        public amu.C6580a[] f22348f;

        public C6587b() {
            m16735b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22343a != null) {
                mo13820a += C7640qw.m13920f(1, this.f22343a.longValue());
            }
            if (this.f22344b != null) {
                mo13820a += C7640qw.m13948b(2, this.f22344b);
            }
            if (this.f22345c != null) {
                mo13820a += C7640qw.m13937c(3, this.f22345c.intValue());
            }
            if (this.f22346d != null && this.f22346d.length > 0) {
                int i = mo13820a;
                for (int i2 = 0; i2 < this.f22346d.length; i2++) {
                    C6588c c6588c = this.f22346d[i2];
                    if (c6588c != null) {
                        i += C7640qw.m13935c(4, c6588c);
                    }
                }
                mo13820a = i;
            }
            if (this.f22347e != null && this.f22347e.length > 0) {
                int i3 = mo13820a;
                for (int i4 = 0; i4 < this.f22347e.length; i4++) {
                    C6586a c6586a = this.f22347e[i4];
                    if (c6586a != null) {
                        i3 += C7640qw.m13935c(5, c6586a);
                    }
                }
                mo13820a = i3;
            }
            if (this.f22348f != null && this.f22348f.length > 0) {
                for (int i5 = 0; i5 < this.f22348f.length; i5++) {
                    amu.C6580a c6580a = this.f22348f[i5];
                    if (c6580a != null) {
                        mo13820a += C7640qw.m13935c(6, c6580a);
                    }
                }
            }
            return mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6587b mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f22343a = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 18:
                        this.f22344b = c7639qv.m13993j();
                        break;
                    case 24:
                        this.f22345c = Integer.valueOf(c7639qv.m13997g());
                        break;
                    case 34:
                        int m13839b = C7652rg.m13839b(c7639qv, 34);
                        int length = this.f22346d == null ? 0 : this.f22346d.length;
                        C6588c[] c6588cArr = new C6588c[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f22346d, 0, c6588cArr, 0, length);
                        }
                        while (length < c6588cArr.length - 1) {
                            c6588cArr[length] = new C6588c();
                            c7639qv.m14011a(c6588cArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c6588cArr[length] = new C6588c();
                        c7639qv.m14011a(c6588cArr[length]);
                        this.f22346d = c6588cArr;
                        break;
                    case 42:
                        int m13839b2 = C7652rg.m13839b(c7639qv, 42);
                        int length2 = this.f22347e == null ? 0 : this.f22347e.length;
                        C6586a[] c6586aArr = new C6586a[m13839b2 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f22347e, 0, c6586aArr, 0, length2);
                        }
                        while (length2 < c6586aArr.length - 1) {
                            c6586aArr[length2] = new C6586a();
                            c7639qv.m14011a(c6586aArr[length2]);
                            c7639qv.m14015a();
                            length2++;
                        }
                        c6586aArr[length2] = new C6586a();
                        c7639qv.m14011a(c6586aArr[length2]);
                        this.f22347e = c6586aArr;
                        break;
                    case 50:
                        int m13839b3 = C7652rg.m13839b(c7639qv, 50);
                        int length3 = this.f22348f == null ? 0 : this.f22348f.length;
                        amu.C6580a[] c6580aArr = new amu.C6580a[m13839b3 + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.f22348f, 0, c6580aArr, 0, length3);
                        }
                        while (length3 < c6580aArr.length - 1) {
                            c6580aArr[length3] = new amu.C6580a();
                            c7639qv.m14011a(c6580aArr[length3]);
                            c7639qv.m14015a();
                            length3++;
                        }
                        c6580aArr[length3] = new amu.C6580a();
                        c7639qv.m14011a(c6580aArr[length3]);
                        this.f22348f = c6580aArr;
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
            if (this.f22343a != null) {
                c7640qw.m13950b(1, this.f22343a.longValue());
            }
            if (this.f22344b != null) {
                c7640qw.m13970a(2, this.f22344b);
            }
            if (this.f22345c != null) {
                c7640qw.m13973a(3, this.f22345c.intValue());
            }
            if (this.f22346d != null && this.f22346d.length > 0) {
                for (int i = 0; i < this.f22346d.length; i++) {
                    C6588c c6588c = this.f22346d[i];
                    if (c6588c != null) {
                        c7640qw.m13971a(4, c6588c);
                    }
                }
            }
            if (this.f22347e != null && this.f22347e.length > 0) {
                for (int i2 = 0; i2 < this.f22347e.length; i2++) {
                    C6586a c6586a = this.f22347e[i2];
                    if (c6586a != null) {
                        c7640qw.m13971a(5, c6586a);
                    }
                }
            }
            if (this.f22348f != null && this.f22348f.length > 0) {
                for (int i3 = 0; i3 < this.f22348f.length; i3++) {
                    amu.C6580a c6580a = this.f22348f[i3];
                    if (c6580a != null) {
                        c7640qw.m13971a(6, c6580a);
                    }
                }
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C6587b m16735b() {
            this.f22343a = null;
            this.f22344b = null;
            this.f22345c = null;
            this.f22346d = C6588c.m16733b();
            this.f22347e = C6586a.m16738b();
            this.f22348f = amu.C6580a.m16754b();
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6587b)) {
                return false;
            }
            C6587b c6587b = (C6587b) obj;
            if (this.f22343a == null) {
                if (c6587b.f22343a != null) {
                    return false;
                }
            } else if (!this.f22343a.equals(c6587b.f22343a)) {
                return false;
            }
            if (this.f22344b == null) {
                if (c6587b.f22344b != null) {
                    return false;
                }
            } else if (!this.f22344b.equals(c6587b.f22344b)) {
                return false;
            }
            if (this.f22345c == null) {
                if (c6587b.f22345c != null) {
                    return false;
                }
            } else if (!this.f22345c.equals(c6587b.f22345c)) {
                return false;
            }
            return C7647rb.m13867a(this.f22346d, c6587b.f22346d) && C7647rb.m13867a(this.f22347e, c6587b.f22347e) && C7647rb.m13867a(this.f22348f, c6587b.f22348f);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22344b == null ? 0 : this.f22344b.hashCode()) + (((this.f22343a == null ? 0 : this.f22343a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.f22345c != null) {
                i = this.f22345c.hashCode();
            }
            return ((((((hashCode + i) * 31) + C7647rb.m13868a(this.f22346d)) * 31) + C7647rb.m13868a(this.f22347e)) * 31) + C7647rb.m13868a(this.f22348f);
        }
    }

    /* renamed from: com.google.android.gms.internal.amv$c */
    /* loaded from: classes2.dex */
    public static final class C6588c extends AbstractC7649rd {

        /* renamed from: c */
        private static volatile C6588c[] f22349c;

        /* renamed from: a */
        public String f22350a;

        /* renamed from: b */
        public String f22351b;

        public C6588c() {
            m16732c();
        }

        /* renamed from: b */
        public static C6588c[] m16733b() {
            if (f22349c == null) {
                synchronized (C7647rb.f25390c) {
                    if (f22349c == null) {
                        f22349c = new C6588c[0];
                    }
                }
            }
            return f22349c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22350a != null) {
                mo13820a += C7640qw.m13948b(1, this.f22350a);
            }
            return this.f22351b != null ? mo13820a + C7640qw.m13948b(2, this.f22351b) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6588c mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f22350a = c7639qv.m13993j();
                        break;
                    case 18:
                        this.f22351b = c7639qv.m13993j();
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
            if (this.f22350a != null) {
                c7640qw.m13970a(1, this.f22350a);
            }
            if (this.f22351b != null) {
                c7640qw.m13970a(2, this.f22351b);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C6588c m16732c() {
            this.f22350a = null;
            this.f22351b = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6588c)) {
                return false;
            }
            C6588c c6588c = (C6588c) obj;
            if (this.f22350a == null) {
                if (c6588c.f22350a != null) {
                    return false;
                }
            } else if (!this.f22350a.equals(c6588c.f22350a)) {
                return false;
            }
            return this.f22351b == null ? c6588c.f22351b == null : this.f22351b.equals(c6588c.f22351b);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22350a == null ? 0 : this.f22350a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
            if (this.f22351b != null) {
                i = this.f22351b.hashCode();
            }
            return hashCode + i;
        }
    }
}
