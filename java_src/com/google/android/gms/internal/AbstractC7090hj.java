package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.hj */
/* loaded from: classes2.dex */
public interface AbstractC7090hj {

    /* renamed from: com.google.android.gms.internal.hj$a */
    /* loaded from: classes2.dex */
    public static final class C7091a extends AbstractC7642qx<C7091a> {

        /* renamed from: m */
        private static volatile C7091a[] f23880m;

        /* renamed from: a */
        public int f23881a;

        /* renamed from: b */
        public String f23882b;

        /* renamed from: c */
        public C7091a[] f23883c;

        /* renamed from: d */
        public C7091a[] f23884d;

        /* renamed from: e */
        public C7091a[] f23885e;

        /* renamed from: f */
        public String f23886f;

        /* renamed from: g */
        public String f23887g;

        /* renamed from: h */
        public long f23888h;

        /* renamed from: i */
        public boolean f23889i;

        /* renamed from: j */
        public C7091a[] f23890j;

        /* renamed from: k */
        public int[] f23891k;

        /* renamed from: l */
        public boolean f23892l;

        public C7091a() {
            m15598c();
        }

        /* renamed from: b */
        public static C7091a[] m15599b() {
            if (f23880m == null) {
                synchronized (C7647rb.f25390c) {
                    if (f23880m == null) {
                        f23880m = new C7091a[0];
                    }
                }
            }
            return f23880m;
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        protected int mo13820a() {
            int mo13820a = super.mo13820a() + C7640qw.m13937c(1, this.f23881a);
            if (!this.f23882b.equals("")) {
                mo13820a += C7640qw.m13948b(2, this.f23882b);
            }
            if (this.f23883c != null && this.f23883c.length > 0) {
                int i = mo13820a;
                for (int i2 = 0; i2 < this.f23883c.length; i2++) {
                    C7091a c7091a = this.f23883c[i2];
                    if (c7091a != null) {
                        i += C7640qw.m13935c(3, c7091a);
                    }
                }
                mo13820a = i;
            }
            if (this.f23884d != null && this.f23884d.length > 0) {
                int i3 = mo13820a;
                for (int i4 = 0; i4 < this.f23884d.length; i4++) {
                    C7091a c7091a2 = this.f23884d[i4];
                    if (c7091a2 != null) {
                        i3 += C7640qw.m13935c(4, c7091a2);
                    }
                }
                mo13820a = i3;
            }
            if (this.f23885e != null && this.f23885e.length > 0) {
                int i5 = mo13820a;
                for (int i6 = 0; i6 < this.f23885e.length; i6++) {
                    C7091a c7091a3 = this.f23885e[i6];
                    if (c7091a3 != null) {
                        i5 += C7640qw.m13935c(5, c7091a3);
                    }
                }
                mo13820a = i5;
            }
            if (!this.f23886f.equals("")) {
                mo13820a += C7640qw.m13948b(6, this.f23886f);
            }
            if (!this.f23887g.equals("")) {
                mo13820a += C7640qw.m13948b(7, this.f23887g);
            }
            if (this.f23888h != 0) {
                mo13820a += C7640qw.m13920f(8, this.f23888h);
            }
            if (this.f23892l) {
                mo13820a += C7640qw.m13947b(9, this.f23892l);
            }
            if (this.f23891k != null && this.f23891k.length > 0) {
                int i7 = 0;
                for (int i8 = 0; i8 < this.f23891k.length; i8++) {
                    i7 += C7640qw.m13938c(this.f23891k[i8]);
                }
                mo13820a = mo13820a + i7 + (this.f23891k.length * 1);
            }
            if (this.f23890j != null && this.f23890j.length > 0) {
                for (int i9 = 0; i9 < this.f23890j.length; i9++) {
                    C7091a c7091a4 = this.f23890j[i9];
                    if (c7091a4 != null) {
                        mo13820a += C7640qw.m13935c(11, c7091a4);
                    }
                }
            }
            return this.f23889i ? mo13820a + C7640qw.m13947b(12, this.f23889i) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7091a mo13816b(C7639qv c7639qv) {
            int i;
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        int m13997g = c7639qv.m13997g();
                        switch (m13997g) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                this.f23881a = m13997g;
                                continue;
                        }
                    case 18:
                        this.f23882b = c7639qv.m13993j();
                        break;
                    case 26:
                        int m13839b = C7652rg.m13839b(c7639qv, 26);
                        int length = this.f23883c == null ? 0 : this.f23883c.length;
                        C7091a[] c7091aArr = new C7091a[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f23883c, 0, c7091aArr, 0, length);
                        }
                        while (length < c7091aArr.length - 1) {
                            c7091aArr[length] = new C7091a();
                            c7639qv.m14011a(c7091aArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c7091aArr[length] = new C7091a();
                        c7639qv.m14011a(c7091aArr[length]);
                        this.f23883c = c7091aArr;
                        break;
                    case 34:
                        int m13839b2 = C7652rg.m13839b(c7639qv, 34);
                        int length2 = this.f23884d == null ? 0 : this.f23884d.length;
                        C7091a[] c7091aArr2 = new C7091a[m13839b2 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f23884d, 0, c7091aArr2, 0, length2);
                        }
                        while (length2 < c7091aArr2.length - 1) {
                            c7091aArr2[length2] = new C7091a();
                            c7639qv.m14011a(c7091aArr2[length2]);
                            c7639qv.m14015a();
                            length2++;
                        }
                        c7091aArr2[length2] = new C7091a();
                        c7639qv.m14011a(c7091aArr2[length2]);
                        this.f23884d = c7091aArr2;
                        break;
                    case 42:
                        int m13839b3 = C7652rg.m13839b(c7639qv, 42);
                        int length3 = this.f23885e == null ? 0 : this.f23885e.length;
                        C7091a[] c7091aArr3 = new C7091a[m13839b3 + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.f23885e, 0, c7091aArr3, 0, length3);
                        }
                        while (length3 < c7091aArr3.length - 1) {
                            c7091aArr3[length3] = new C7091a();
                            c7639qv.m14011a(c7091aArr3[length3]);
                            c7639qv.m14015a();
                            length3++;
                        }
                        c7091aArr3[length3] = new C7091a();
                        c7639qv.m14011a(c7091aArr3[length3]);
                        this.f23885e = c7091aArr3;
                        break;
                    case 50:
                        this.f23886f = c7639qv.m13993j();
                        break;
                    case 58:
                        this.f23887g = c7639qv.m13993j();
                        break;
                    case 64:
                        this.f23888h = c7639qv.m13999f();
                        break;
                    case 72:
                        this.f23892l = c7639qv.m13994i();
                        break;
                    case 80:
                        int m13839b4 = C7652rg.m13839b(c7639qv, 80);
                        int[] iArr = new int[m13839b4];
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < m13839b4) {
                            if (i2 != 0) {
                                c7639qv.m14015a();
                            }
                            int m13997g2 = c7639qv.m13997g();
                            switch (m13997g2) {
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
                            int length4 = this.f23891k == null ? 0 : this.f23891k.length;
                            if (length4 != 0 || i3 != m13839b4) {
                                int[] iArr2 = new int[length4 + i3];
                                if (length4 != 0) {
                                    System.arraycopy(this.f23891k, 0, iArr2, 0, length4);
                                }
                                System.arraycopy(iArr, 0, iArr2, length4, i3);
                                this.f23891k = iArr2;
                                break;
                            } else {
                                this.f23891k = iArr;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 82:
                        int m14002d = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t = c7639qv.m13983t();
                        int i4 = 0;
                        while (c7639qv.m13985r() > 0) {
                            switch (c7639qv.m13997g()) {
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
                                    i4++;
                                    break;
                            }
                        }
                        if (i4 != 0) {
                            c7639qv.m13998f(m13983t);
                            int length5 = this.f23891k == null ? 0 : this.f23891k.length;
                            int[] iArr3 = new int[i4 + length5];
                            if (length5 != 0) {
                                System.arraycopy(this.f23891k, 0, iArr3, 0, length5);
                            }
                            while (c7639qv.m13985r() > 0) {
                                int m13997g3 = c7639qv.m13997g();
                                switch (m13997g3) {
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
                                        iArr3[length5] = m13997g3;
                                        length5++;
                                        break;
                                }
                            }
                            this.f23891k = iArr3;
                        }
                        c7639qv.m14000e(m14002d);
                        break;
                    case 90:
                        int m13839b5 = C7652rg.m13839b(c7639qv, 90);
                        int length6 = this.f23890j == null ? 0 : this.f23890j.length;
                        C7091a[] c7091aArr4 = new C7091a[m13839b5 + length6];
                        if (length6 != 0) {
                            System.arraycopy(this.f23890j, 0, c7091aArr4, 0, length6);
                        }
                        while (length6 < c7091aArr4.length - 1) {
                            c7091aArr4[length6] = new C7091a();
                            c7639qv.m14011a(c7091aArr4[length6]);
                            c7639qv.m14015a();
                            length6++;
                        }
                        c7091aArr4[length6] = new C7091a();
                        c7639qv.m14011a(c7091aArr4[length6]);
                        this.f23890j = c7091aArr4;
                        break;
                    case 96:
                        this.f23889i = c7639qv.m13994i();
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
            c7640qw.m13973a(1, this.f23881a);
            if (!this.f23882b.equals("")) {
                c7640qw.m13970a(2, this.f23882b);
            }
            if (this.f23883c != null && this.f23883c.length > 0) {
                for (int i = 0; i < this.f23883c.length; i++) {
                    C7091a c7091a = this.f23883c[i];
                    if (c7091a != null) {
                        c7640qw.m13971a(3, c7091a);
                    }
                }
            }
            if (this.f23884d != null && this.f23884d.length > 0) {
                for (int i2 = 0; i2 < this.f23884d.length; i2++) {
                    C7091a c7091a2 = this.f23884d[i2];
                    if (c7091a2 != null) {
                        c7640qw.m13971a(4, c7091a2);
                    }
                }
            }
            if (this.f23885e != null && this.f23885e.length > 0) {
                for (int i3 = 0; i3 < this.f23885e.length; i3++) {
                    C7091a c7091a3 = this.f23885e[i3];
                    if (c7091a3 != null) {
                        c7640qw.m13971a(5, c7091a3);
                    }
                }
            }
            if (!this.f23886f.equals("")) {
                c7640qw.m13970a(6, this.f23886f);
            }
            if (!this.f23887g.equals("")) {
                c7640qw.m13970a(7, this.f23887g);
            }
            if (this.f23888h != 0) {
                c7640qw.m13950b(8, this.f23888h);
            }
            if (this.f23892l) {
                c7640qw.m13969a(9, this.f23892l);
            }
            if (this.f23891k != null && this.f23891k.length > 0) {
                for (int i4 = 0; i4 < this.f23891k.length; i4++) {
                    c7640qw.m13973a(10, this.f23891k[i4]);
                }
            }
            if (this.f23890j != null && this.f23890j.length > 0) {
                for (int i5 = 0; i5 < this.f23890j.length; i5++) {
                    C7091a c7091a4 = this.f23890j[i5];
                    if (c7091a4 != null) {
                        c7640qw.m13971a(11, c7091a4);
                    }
                }
            }
            if (this.f23889i) {
                c7640qw.m13969a(12, this.f23889i);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C7091a m15598c() {
            this.f23881a = 1;
            this.f23882b = "";
            this.f23883c = m15599b();
            this.f23884d = m15599b();
            this.f23885e = m15599b();
            this.f23886f = "";
            this.f23887g = "";
            this.f23888h = 0L;
            this.f23889i = false;
            this.f23890j = m15599b();
            this.f23891k = C7652rg.f25394a;
            this.f23892l = false;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7091a)) {
                return false;
            }
            C7091a c7091a = (C7091a) obj;
            if (this.f23881a != c7091a.f23881a) {
                return false;
            }
            if (this.f23882b == null) {
                if (c7091a.f23882b != null) {
                    return false;
                }
            } else if (!this.f23882b.equals(c7091a.f23882b)) {
                return false;
            }
            if (!C7647rb.m13867a(this.f23883c, c7091a.f23883c) || !C7647rb.m13867a(this.f23884d, c7091a.f23884d) || !C7647rb.m13867a(this.f23885e, c7091a.f23885e)) {
                return false;
            }
            if (this.f23886f == null) {
                if (c7091a.f23886f != null) {
                    return false;
                }
            } else if (!this.f23886f.equals(c7091a.f23886f)) {
                return false;
            }
            if (this.f23887g == null) {
                if (c7091a.f23887g != null) {
                    return false;
                }
            } else if (!this.f23887g.equals(c7091a.f23887g)) {
                return false;
            }
            if (this.f23888h != c7091a.f23888h || this.f23889i != c7091a.f23889i || !C7647rb.m13867a(this.f23890j, c7091a.f23890j) || !C7647rb.m13871a(this.f23891k, c7091a.f23891k) || this.f23892l != c7091a.f23892l) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7091a.f25374ag == null || c7091a.f25374ag.m13887b() : this.f25374ag.equals(c7091a.f25374ag);
        }

        public int hashCode() {
            int i = 1231;
            int i2 = 0;
            int hashCode = ((((((this.f23889i ? 1231 : 1237) + (((((this.f23887g == null ? 0 : this.f23887g.hashCode()) + (((this.f23886f == null ? 0 : this.f23886f.hashCode()) + (((((((((this.f23882b == null ? 0 : this.f23882b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f23881a) * 31)) * 31) + C7647rb.m13868a(this.f23883c)) * 31) + C7647rb.m13868a(this.f23884d)) * 31) + C7647rb.m13868a(this.f23885e)) * 31)) * 31)) * 31) + ((int) (this.f23888h ^ (this.f23888h >>> 32)))) * 31)) * 31) + C7647rb.m13868a(this.f23890j)) * 31) + C7647rb.m13872a(this.f23891k)) * 31;
            if (!this.f23892l) {
                i = 1237;
            }
            int i3 = (hashCode + i) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i2 = this.f25374ag.hashCode();
            }
            return i3 + i2;
        }
    }
}
