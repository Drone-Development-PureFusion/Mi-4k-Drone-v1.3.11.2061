package com.google.android.gms.internal;

import com.google.firebase.p253b.C9755a;
import java.util.Arrays;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.google.android.gms.internal.ff */
/* loaded from: classes2.dex */
public final class C6951ff extends AbstractC7642qx<C6951ff> {

    /* renamed from: a */
    public C6952a[] f23346a;

    /* renamed from: com.google.android.gms.internal.ff$a */
    /* loaded from: classes2.dex */
    public static final class C6952a extends AbstractC7642qx<C6952a> {

        /* renamed from: c */
        private static volatile C6952a[] f23347c;

        /* renamed from: a */
        public String f23348a;

        /* renamed from: b */
        public C6953a f23349b;

        /* renamed from: com.google.android.gms.internal.ff$a$a */
        /* loaded from: classes2.dex */
        public static final class C6953a extends AbstractC7642qx<C6953a> {

            /* renamed from: c */
            private static volatile C6953a[] f23350c;

            /* renamed from: a */
            public int f23351a;

            /* renamed from: b */
            public C6954a f23352b;

            /* renamed from: com.google.android.gms.internal.ff$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C6954a extends AbstractC7642qx<C6954a> {

                /* renamed from: a */
                public byte[] f23353a;

                /* renamed from: b */
                public String f23354b;

                /* renamed from: c */
                public double f23355c;

                /* renamed from: d */
                public float f23356d;

                /* renamed from: e */
                public long f23357e;

                /* renamed from: f */
                public int f23358f;

                /* renamed from: g */
                public int f23359g;

                /* renamed from: h */
                public boolean f23360h;

                /* renamed from: i */
                public C6952a[] f23361i;

                /* renamed from: j */
                public C6953a[] f23362j;

                /* renamed from: k */
                public String[] f23363k;

                /* renamed from: l */
                public long[] f23364l;

                /* renamed from: m */
                public float[] f23365m;

                /* renamed from: n */
                public long f23366n;

                public C6954a() {
                    m15878b();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
                /* renamed from: a */
                public int mo13820a() {
                    int mo13820a = super.mo13820a();
                    if (!Arrays.equals(this.f23353a, C7652rg.f25401h)) {
                        mo13820a += C7640qw.m13946b(1, this.f23353a);
                    }
                    if (!this.f23354b.equals("")) {
                        mo13820a += C7640qw.m13948b(2, this.f23354b);
                    }
                    if (Double.doubleToLongBits(this.f23355c) != Double.doubleToLongBits(C9755a.f30449c)) {
                        mo13820a += C7640qw.m13953b(3, this.f23355c);
                    }
                    if (Float.floatToIntBits(this.f23356d) != Float.floatToIntBits(0.0f)) {
                        mo13820a += C7640qw.m13952b(4, this.f23356d);
                    }
                    if (this.f23357e != 0) {
                        mo13820a += C7640qw.m13920f(5, this.f23357e);
                    }
                    if (this.f23358f != 0) {
                        mo13820a += C7640qw.m13937c(6, this.f23358f);
                    }
                    if (this.f23359g != 0) {
                        mo13820a += C7640qw.m13930d(7, this.f23359g);
                    }
                    if (this.f23360h) {
                        mo13820a += C7640qw.m13947b(8, this.f23360h);
                    }
                    if (this.f23361i != null && this.f23361i.length > 0) {
                        int i = mo13820a;
                        for (int i2 = 0; i2 < this.f23361i.length; i2++) {
                            C6952a c6952a = this.f23361i[i2];
                            if (c6952a != null) {
                                i += C7640qw.m13935c(9, c6952a);
                            }
                        }
                        mo13820a = i;
                    }
                    if (this.f23362j != null && this.f23362j.length > 0) {
                        int i3 = mo13820a;
                        for (int i4 = 0; i4 < this.f23362j.length; i4++) {
                            C6953a c6953a = this.f23362j[i4];
                            if (c6953a != null) {
                                i3 += C7640qw.m13935c(10, c6953a);
                            }
                        }
                        mo13820a = i3;
                    }
                    if (this.f23363k != null && this.f23363k.length > 0) {
                        int i5 = 0;
                        int i6 = 0;
                        for (int i7 = 0; i7 < this.f23363k.length; i7++) {
                            String str = this.f23363k[i7];
                            if (str != null) {
                                i6++;
                                i5 += C7640qw.m13942b(str);
                            }
                        }
                        mo13820a = mo13820a + i5 + (i6 * 1);
                    }
                    if (this.f23364l != null && this.f23364l.length > 0) {
                        int i8 = 0;
                        for (int i9 = 0; i9 < this.f23364l.length; i9++) {
                            i8 += C7640qw.m13919f(this.f23364l[i9]);
                        }
                        mo13820a = mo13820a + i8 + (this.f23364l.length * 1);
                    }
                    if (this.f23366n != 0) {
                        mo13820a += C7640qw.m13920f(13, this.f23366n);
                    }
                    return (this.f23365m == null || this.f23365m.length <= 0) ? mo13820a : mo13820a + (this.f23365m.length * 4) + (this.f23365m.length * 1);
                }

                @Override // com.google.android.gms.internal.AbstractC7649rd
                /* renamed from: a */
                public C6954a mo13816b(C7639qv c7639qv) {
                    while (true) {
                        int m14015a = c7639qv.m14015a();
                        switch (m14015a) {
                            case 0:
                                break;
                            case 10:
                                this.f23353a = c7639qv.m13992k();
                                break;
                            case 18:
                                this.f23354b = c7639qv.m13993j();
                                break;
                            case 25:
                                this.f23355c = c7639qv.m14005c();
                                break;
                            case 37:
                                this.f23356d = c7639qv.m14003d();
                                break;
                            case 40:
                                this.f23357e = c7639qv.m13999f();
                                break;
                            case 48:
                                this.f23358f = c7639qv.m13997g();
                                break;
                            case 56:
                                this.f23359g = c7639qv.m13991l();
                                break;
                            case 64:
                                this.f23360h = c7639qv.m13994i();
                                break;
                            case 74:
                                int m13839b = C7652rg.m13839b(c7639qv, 74);
                                int length = this.f23361i == null ? 0 : this.f23361i.length;
                                C6952a[] c6952aArr = new C6952a[m13839b + length];
                                if (length != 0) {
                                    System.arraycopy(this.f23361i, 0, c6952aArr, 0, length);
                                }
                                while (length < c6952aArr.length - 1) {
                                    c6952aArr[length] = new C6952a();
                                    c7639qv.m14011a(c6952aArr[length]);
                                    c7639qv.m14015a();
                                    length++;
                                }
                                c6952aArr[length] = new C6952a();
                                c7639qv.m14011a(c6952aArr[length]);
                                this.f23361i = c6952aArr;
                                break;
                            case 82:
                                int m13839b2 = C7652rg.m13839b(c7639qv, 82);
                                int length2 = this.f23362j == null ? 0 : this.f23362j.length;
                                C6953a[] c6953aArr = new C6953a[m13839b2 + length2];
                                if (length2 != 0) {
                                    System.arraycopy(this.f23362j, 0, c6953aArr, 0, length2);
                                }
                                while (length2 < c6953aArr.length - 1) {
                                    c6953aArr[length2] = new C6953a();
                                    c7639qv.m14011a(c6953aArr[length2]);
                                    c7639qv.m14015a();
                                    length2++;
                                }
                                c6953aArr[length2] = new C6953a();
                                c7639qv.m14011a(c6953aArr[length2]);
                                this.f23362j = c6953aArr;
                                break;
                            case 90:
                                int m13839b3 = C7652rg.m13839b(c7639qv, 90);
                                int length3 = this.f23363k == null ? 0 : this.f23363k.length;
                                String[] strArr = new String[m13839b3 + length3];
                                if (length3 != 0) {
                                    System.arraycopy(this.f23363k, 0, strArr, 0, length3);
                                }
                                while (length3 < strArr.length - 1) {
                                    strArr[length3] = c7639qv.m13993j();
                                    c7639qv.m14015a();
                                    length3++;
                                }
                                strArr[length3] = c7639qv.m13993j();
                                this.f23363k = strArr;
                                break;
                            case 96:
                                int m13839b4 = C7652rg.m13839b(c7639qv, 96);
                                int length4 = this.f23364l == null ? 0 : this.f23364l.length;
                                long[] jArr = new long[m13839b4 + length4];
                                if (length4 != 0) {
                                    System.arraycopy(this.f23364l, 0, jArr, 0, length4);
                                }
                                while (length4 < jArr.length - 1) {
                                    jArr[length4] = c7639qv.m13999f();
                                    c7639qv.m14015a();
                                    length4++;
                                }
                                jArr[length4] = c7639qv.m13999f();
                                this.f23364l = jArr;
                                break;
                            case 98:
                                int m14002d = c7639qv.m14002d(c7639qv.m13989n());
                                int m13983t = c7639qv.m13983t();
                                int i = 0;
                                while (c7639qv.m13985r() > 0) {
                                    c7639qv.m13999f();
                                    i++;
                                }
                                c7639qv.m13998f(m13983t);
                                int length5 = this.f23364l == null ? 0 : this.f23364l.length;
                                long[] jArr2 = new long[i + length5];
                                if (length5 != 0) {
                                    System.arraycopy(this.f23364l, 0, jArr2, 0, length5);
                                }
                                while (length5 < jArr2.length) {
                                    jArr2[length5] = c7639qv.m13999f();
                                    length5++;
                                }
                                this.f23364l = jArr2;
                                c7639qv.m14000e(m14002d);
                                break;
                            case 104:
                                this.f23366n = c7639qv.m13999f();
                                break;
                            case 114:
                                int m13989n = c7639qv.m13989n();
                                int m14002d2 = c7639qv.m14002d(m13989n);
                                int i2 = m13989n / 4;
                                int length6 = this.f23365m == null ? 0 : this.f23365m.length;
                                float[] fArr = new float[i2 + length6];
                                if (length6 != 0) {
                                    System.arraycopy(this.f23365m, 0, fArr, 0, length6);
                                }
                                while (length6 < fArr.length) {
                                    fArr[length6] = c7639qv.m14003d();
                                    length6++;
                                }
                                this.f23365m = fArr;
                                c7639qv.m14000e(m14002d2);
                                break;
                            case Opcodes.LNEG /* 117 */:
                                int m13839b5 = C7652rg.m13839b(c7639qv, Opcodes.LNEG);
                                int length7 = this.f23365m == null ? 0 : this.f23365m.length;
                                float[] fArr2 = new float[m13839b5 + length7];
                                if (length7 != 0) {
                                    System.arraycopy(this.f23365m, 0, fArr2, 0, length7);
                                }
                                while (length7 < fArr2.length - 1) {
                                    fArr2[length7] = c7639qv.m14003d();
                                    c7639qv.m14015a();
                                    length7++;
                                }
                                fArr2[length7] = c7639qv.m14003d();
                                this.f23365m = fArr2;
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
                    if (!Arrays.equals(this.f23353a, C7652rg.f25401h)) {
                        c7640qw.m13968a(1, this.f23353a);
                    }
                    if (!this.f23354b.equals("")) {
                        c7640qw.m13970a(2, this.f23354b);
                    }
                    if (Double.doubleToLongBits(this.f23355c) != Double.doubleToLongBits(C9755a.f30449c)) {
                        c7640qw.m13975a(3, this.f23355c);
                    }
                    if (Float.floatToIntBits(this.f23356d) != Float.floatToIntBits(0.0f)) {
                        c7640qw.m13974a(4, this.f23356d);
                    }
                    if (this.f23357e != 0) {
                        c7640qw.m13950b(5, this.f23357e);
                    }
                    if (this.f23358f != 0) {
                        c7640qw.m13973a(6, this.f23358f);
                    }
                    if (this.f23359g != 0) {
                        c7640qw.m13951b(7, this.f23359g);
                    }
                    if (this.f23360h) {
                        c7640qw.m13969a(8, this.f23360h);
                    }
                    if (this.f23361i != null && this.f23361i.length > 0) {
                        for (int i = 0; i < this.f23361i.length; i++) {
                            C6952a c6952a = this.f23361i[i];
                            if (c6952a != null) {
                                c7640qw.m13971a(9, c6952a);
                            }
                        }
                    }
                    if (this.f23362j != null && this.f23362j.length > 0) {
                        for (int i2 = 0; i2 < this.f23362j.length; i2++) {
                            C6953a c6953a = this.f23362j[i2];
                            if (c6953a != null) {
                                c7640qw.m13971a(10, c6953a);
                            }
                        }
                    }
                    if (this.f23363k != null && this.f23363k.length > 0) {
                        for (int i3 = 0; i3 < this.f23363k.length; i3++) {
                            String str = this.f23363k[i3];
                            if (str != null) {
                                c7640qw.m13970a(11, str);
                            }
                        }
                    }
                    if (this.f23364l != null && this.f23364l.length > 0) {
                        for (int i4 = 0; i4 < this.f23364l.length; i4++) {
                            c7640qw.m13950b(12, this.f23364l[i4]);
                        }
                    }
                    if (this.f23366n != 0) {
                        c7640qw.m13950b(13, this.f23366n);
                    }
                    if (this.f23365m != null && this.f23365m.length > 0) {
                        for (int i5 = 0; i5 < this.f23365m.length; i5++) {
                            c7640qw.m13974a(14, this.f23365m[i5]);
                        }
                    }
                    super.mo13818a(c7640qw);
                }

                /* renamed from: b */
                public C6954a m15878b() {
                    this.f23353a = C7652rg.f25401h;
                    this.f23354b = "";
                    this.f23355c = C9755a.f30449c;
                    this.f23356d = 0.0f;
                    this.f23357e = 0L;
                    this.f23358f = 0;
                    this.f23359g = 0;
                    this.f23360h = false;
                    this.f23361i = C6952a.m15884b();
                    this.f23362j = C6953a.m15881b();
                    this.f23363k = C7652rg.f25399f;
                    this.f23364l = C7652rg.f25395b;
                    this.f23365m = C7652rg.f25396c;
                    this.f23366n = 0L;
                    this.f25374ag = null;
                    this.f25391ah = -1;
                    return this;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof C6954a)) {
                        return false;
                    }
                    C6954a c6954a = (C6954a) obj;
                    if (!Arrays.equals(this.f23353a, c6954a.f23353a)) {
                        return false;
                    }
                    if (this.f23354b == null) {
                        if (c6954a.f23354b != null) {
                            return false;
                        }
                    } else if (!this.f23354b.equals(c6954a.f23354b)) {
                        return false;
                    }
                    if (Double.doubleToLongBits(this.f23355c) != Double.doubleToLongBits(c6954a.f23355c) || Float.floatToIntBits(this.f23356d) != Float.floatToIntBits(c6954a.f23356d) || this.f23357e != c6954a.f23357e || this.f23358f != c6954a.f23358f || this.f23359g != c6954a.f23359g || this.f23360h != c6954a.f23360h || !C7647rb.m13867a(this.f23361i, c6954a.f23361i) || !C7647rb.m13867a(this.f23362j, c6954a.f23362j) || !C7647rb.m13867a(this.f23363k, c6954a.f23363k) || !C7647rb.m13869a(this.f23364l, c6954a.f23364l) || !C7647rb.m13873a(this.f23365m, c6954a.f23365m) || this.f23366n != c6954a.f23366n) {
                        return false;
                    }
                    return (this.f25374ag == null || this.f25374ag.m13887b()) ? c6954a.f25374ag == null || c6954a.f25374ag.m13887b() : this.f25374ag.equals(c6954a.f25374ag);
                }

                public int hashCode() {
                    int i = 0;
                    int hashCode = (this.f23354b == null ? 0 : this.f23354b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f23353a)) * 31);
                    long doubleToLongBits = Double.doubleToLongBits(this.f23355c);
                    int floatToIntBits = ((((((((((((((this.f23360h ? 1231 : 1237) + (((((((((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + Float.floatToIntBits(this.f23356d)) * 31) + ((int) (this.f23357e ^ (this.f23357e >>> 32)))) * 31) + this.f23358f) * 31) + this.f23359g) * 31)) * 31) + C7647rb.m13868a(this.f23361i)) * 31) + C7647rb.m13868a(this.f23362j)) * 31) + C7647rb.m13868a(this.f23363k)) * 31) + C7647rb.m13870a(this.f23364l)) * 31) + C7647rb.m13874a(this.f23365m)) * 31) + ((int) (this.f23366n ^ (this.f23366n >>> 32)))) * 31;
                    if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                        i = this.f25374ag.hashCode();
                    }
                    return floatToIntBits + i;
                }
            }

            public C6953a() {
                m15880c();
            }

            /* renamed from: b */
            public static C6953a[] m15881b() {
                if (f23350c == null) {
                    synchronized (C7647rb.f25390c) {
                        if (f23350c == null) {
                            f23350c = new C6953a[0];
                        }
                    }
                }
                return f23350c;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
            /* renamed from: a */
            public int mo13820a() {
                int mo13820a = super.mo13820a() + C7640qw.m13937c(1, this.f23351a);
                return this.f23352b != null ? mo13820a + C7640qw.m13935c(2, this.f23352b) : mo13820a;
            }

            @Override // com.google.android.gms.internal.AbstractC7649rd
            /* renamed from: a */
            public C6953a mo13816b(C7639qv c7639qv) {
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
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    this.f23351a = m13997g;
                                    continue;
                            }
                        case 18:
                            if (this.f23352b == null) {
                                this.f23352b = new C6954a();
                            }
                            c7639qv.m14011a(this.f23352b);
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
                c7640qw.m13973a(1, this.f23351a);
                if (this.f23352b != null) {
                    c7640qw.m13971a(2, this.f23352b);
                }
                super.mo13818a(c7640qw);
            }

            /* renamed from: c */
            public C6953a m15880c() {
                this.f23351a = 1;
                this.f23352b = null;
                this.f25374ag = null;
                this.f25391ah = -1;
                return this;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof C6953a)) {
                    return false;
                }
                C6953a c6953a = (C6953a) obj;
                if (this.f23351a != c6953a.f23351a) {
                    return false;
                }
                if (this.f23352b == null) {
                    if (c6953a.f23352b != null) {
                        return false;
                    }
                } else if (!this.f23352b.equals(c6953a.f23352b)) {
                    return false;
                }
                return (this.f25374ag == null || this.f25374ag.m13887b()) ? c6953a.f25374ag == null || c6953a.f25374ag.m13887b() : this.f25374ag.equals(c6953a.f25374ag);
            }

            public int hashCode() {
                int i = 0;
                int hashCode = ((this.f23352b == null ? 0 : this.f23352b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f23351a) * 31)) * 31;
                if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                    i = this.f25374ag.hashCode();
                }
                return hashCode + i;
            }
        }

        public C6952a() {
            m15883c();
        }

        /* renamed from: b */
        public static C6952a[] m15884b() {
            if (f23347c == null) {
                synchronized (C7647rb.f25390c) {
                    if (f23347c == null) {
                        f23347c = new C6952a[0];
                    }
                }
            }
            return f23347c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a() + C7640qw.m13948b(1, this.f23348a);
            return this.f23349b != null ? mo13820a + C7640qw.m13935c(2, this.f23349b) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6952a mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f23348a = c7639qv.m13993j();
                        break;
                    case 18:
                        if (this.f23349b == null) {
                            this.f23349b = new C6953a();
                        }
                        c7639qv.m14011a(this.f23349b);
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
            c7640qw.m13970a(1, this.f23348a);
            if (this.f23349b != null) {
                c7640qw.m13971a(2, this.f23349b);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C6952a m15883c() {
            this.f23348a = "";
            this.f23349b = null;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6952a)) {
                return false;
            }
            C6952a c6952a = (C6952a) obj;
            if (this.f23348a == null) {
                if (c6952a.f23348a != null) {
                    return false;
                }
            } else if (!this.f23348a.equals(c6952a.f23348a)) {
                return false;
            }
            if (this.f23349b == null) {
                if (c6952a.f23349b != null) {
                    return false;
                }
            } else if (!this.f23349b.equals(c6952a.f23349b)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c6952a.f25374ag == null || c6952a.f25374ag.m13887b() : this.f25374ag.equals(c6952a.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f23349b == null ? 0 : this.f23349b.hashCode()) + (((this.f23348a == null ? 0 : this.f23348a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    public C6951ff() {
        m15886b();
    }

    /* renamed from: a */
    public static C6951ff m15887a(byte[] bArr) {
        return (C6951ff) AbstractC7649rd.m13856a(new C6951ff(), bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f23346a != null && this.f23346a.length > 0) {
            for (int i = 0; i < this.f23346a.length; i++) {
                C6952a c6952a = this.f23346a[i];
                if (c6952a != null) {
                    mo13820a += C7640qw.m13935c(1, c6952a);
                }
            }
        }
        return mo13820a;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C6951ff mo13816b(C7639qv c7639qv) {
        while (true) {
            int m14015a = c7639qv.m14015a();
            switch (m14015a) {
                case 0:
                    break;
                case 10:
                    int m13839b = C7652rg.m13839b(c7639qv, 10);
                    int length = this.f23346a == null ? 0 : this.f23346a.length;
                    C6952a[] c6952aArr = new C6952a[m13839b + length];
                    if (length != 0) {
                        System.arraycopy(this.f23346a, 0, c6952aArr, 0, length);
                    }
                    while (length < c6952aArr.length - 1) {
                        c6952aArr[length] = new C6952a();
                        c7639qv.m14011a(c6952aArr[length]);
                        c7639qv.m14015a();
                        length++;
                    }
                    c6952aArr[length] = new C6952a();
                    c7639qv.m14011a(c6952aArr[length]);
                    this.f23346a = c6952aArr;
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
        if (this.f23346a != null && this.f23346a.length > 0) {
            for (int i = 0; i < this.f23346a.length; i++) {
                C6952a c6952a = this.f23346a[i];
                if (c6952a != null) {
                    c7640qw.m13971a(1, c6952a);
                }
            }
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C6951ff m15886b() {
        this.f23346a = C6952a.m15884b();
        this.f25374ag = null;
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6951ff)) {
            return false;
        }
        C6951ff c6951ff = (C6951ff) obj;
        if (!C7647rb.m13867a(this.f23346a, c6951ff.f23346a)) {
            return false;
        }
        return (this.f25374ag == null || this.f25374ag.m13887b()) ? c6951ff.f25374ag == null || c6951ff.f25374ag.m13887b() : this.f25374ag.equals(c6951ff.f25374ag);
    }

    public int hashCode() {
        return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13868a(this.f23346a)) * 31);
    }
}
