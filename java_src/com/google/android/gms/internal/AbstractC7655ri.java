package com.google.android.gms.internal;

import java.util.Arrays;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.google.android.gms.internal.ri */
/* loaded from: classes2.dex */
public interface AbstractC7655ri {

    /* renamed from: com.google.android.gms.internal.ri$a */
    /* loaded from: classes2.dex */
    public static final class C7656a extends AbstractC7642qx<C7656a> implements Cloneable {

        /* renamed from: a */
        public String[] f25405a;

        /* renamed from: b */
        public String[] f25406b;

        /* renamed from: c */
        public int[] f25407c;

        /* renamed from: d */
        public long[] f25408d;

        /* renamed from: e */
        public long[] f25409e;

        public C7656a() {
            m13835b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int i;
            int mo13820a = super.mo13820a();
            if (this.f25405a == null || this.f25405a.length <= 0) {
                i = mo13820a;
            } else {
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < this.f25405a.length; i4++) {
                    String str = this.f25405a[i4];
                    if (str != null) {
                        i3++;
                        i2 += C7640qw.m13942b(str);
                    }
                }
                i = mo13820a + i2 + (i3 * 1);
            }
            if (this.f25406b != null && this.f25406b.length > 0) {
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < this.f25406b.length; i7++) {
                    String str2 = this.f25406b[i7];
                    if (str2 != null) {
                        i6++;
                        i5 += C7640qw.m13942b(str2);
                    }
                }
                i = i + i5 + (i6 * 1);
            }
            if (this.f25407c != null && this.f25407c.length > 0) {
                int i8 = 0;
                for (int i9 = 0; i9 < this.f25407c.length; i9++) {
                    i8 += C7640qw.m13938c(this.f25407c[i9]);
                }
                i = i + i8 + (this.f25407c.length * 1);
            }
            if (this.f25408d != null && this.f25408d.length > 0) {
                int i10 = 0;
                for (int i11 = 0; i11 < this.f25408d.length; i11++) {
                    i10 += C7640qw.m13919f(this.f25408d[i11]);
                }
                i = i + i10 + (this.f25408d.length * 1);
            }
            if (this.f25409e == null || this.f25409e.length <= 0) {
                return i;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.f25409e.length; i13++) {
                i12 += C7640qw.m13919f(this.f25409e[i13]);
            }
            return i + i12 + (this.f25409e.length * 1);
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7656a mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        int m13839b = C7652rg.m13839b(c7639qv, 10);
                        int length = this.f25405a == null ? 0 : this.f25405a.length;
                        String[] strArr = new String[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f25405a, 0, strArr, 0, length);
                        }
                        while (length < strArr.length - 1) {
                            strArr[length] = c7639qv.m13993j();
                            c7639qv.m14015a();
                            length++;
                        }
                        strArr[length] = c7639qv.m13993j();
                        this.f25405a = strArr;
                        break;
                    case 18:
                        int m13839b2 = C7652rg.m13839b(c7639qv, 18);
                        int length2 = this.f25406b == null ? 0 : this.f25406b.length;
                        String[] strArr2 = new String[m13839b2 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f25406b, 0, strArr2, 0, length2);
                        }
                        while (length2 < strArr2.length - 1) {
                            strArr2[length2] = c7639qv.m13993j();
                            c7639qv.m14015a();
                            length2++;
                        }
                        strArr2[length2] = c7639qv.m13993j();
                        this.f25406b = strArr2;
                        break;
                    case 24:
                        int m13839b3 = C7652rg.m13839b(c7639qv, 24);
                        int length3 = this.f25407c == null ? 0 : this.f25407c.length;
                        int[] iArr = new int[m13839b3 + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.f25407c, 0, iArr, 0, length3);
                        }
                        while (length3 < iArr.length - 1) {
                            iArr[length3] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length3++;
                        }
                        iArr[length3] = c7639qv.m13997g();
                        this.f25407c = iArr;
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
                        int length4 = this.f25407c == null ? 0 : this.f25407c.length;
                        int[] iArr2 = new int[i + length4];
                        if (length4 != 0) {
                            System.arraycopy(this.f25407c, 0, iArr2, 0, length4);
                        }
                        while (length4 < iArr2.length) {
                            iArr2[length4] = c7639qv.m13997g();
                            length4++;
                        }
                        this.f25407c = iArr2;
                        c7639qv.m14000e(m14002d);
                        break;
                    case 32:
                        int m13839b4 = C7652rg.m13839b(c7639qv, 32);
                        int length5 = this.f25408d == null ? 0 : this.f25408d.length;
                        long[] jArr = new long[m13839b4 + length5];
                        if (length5 != 0) {
                            System.arraycopy(this.f25408d, 0, jArr, 0, length5);
                        }
                        while (length5 < jArr.length - 1) {
                            jArr[length5] = c7639qv.m13999f();
                            c7639qv.m14015a();
                            length5++;
                        }
                        jArr[length5] = c7639qv.m13999f();
                        this.f25408d = jArr;
                        break;
                    case 34:
                        int m14002d2 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t2 = c7639qv.m13983t();
                        int i2 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13999f();
                            i2++;
                        }
                        c7639qv.m13998f(m13983t2);
                        int length6 = this.f25408d == null ? 0 : this.f25408d.length;
                        long[] jArr2 = new long[i2 + length6];
                        if (length6 != 0) {
                            System.arraycopy(this.f25408d, 0, jArr2, 0, length6);
                        }
                        while (length6 < jArr2.length) {
                            jArr2[length6] = c7639qv.m13999f();
                            length6++;
                        }
                        this.f25408d = jArr2;
                        c7639qv.m14000e(m14002d2);
                        break;
                    case 40:
                        int m13839b5 = C7652rg.m13839b(c7639qv, 40);
                        int length7 = this.f25409e == null ? 0 : this.f25409e.length;
                        long[] jArr3 = new long[m13839b5 + length7];
                        if (length7 != 0) {
                            System.arraycopy(this.f25409e, 0, jArr3, 0, length7);
                        }
                        while (length7 < jArr3.length - 1) {
                            jArr3[length7] = c7639qv.m13999f();
                            c7639qv.m14015a();
                            length7++;
                        }
                        jArr3[length7] = c7639qv.m13999f();
                        this.f25409e = jArr3;
                        break;
                    case 42:
                        int m14002d3 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t3 = c7639qv.m13983t();
                        int i3 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13999f();
                            i3++;
                        }
                        c7639qv.m13998f(m13983t3);
                        int length8 = this.f25409e == null ? 0 : this.f25409e.length;
                        long[] jArr4 = new long[i3 + length8];
                        if (length8 != 0) {
                            System.arraycopy(this.f25409e, 0, jArr4, 0, length8);
                        }
                        while (length8 < jArr4.length) {
                            jArr4[length8] = c7639qv.m13999f();
                            length8++;
                        }
                        this.f25409e = jArr4;
                        c7639qv.m14000e(m14002d3);
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
            if (this.f25405a != null && this.f25405a.length > 0) {
                for (int i = 0; i < this.f25405a.length; i++) {
                    String str = this.f25405a[i];
                    if (str != null) {
                        c7640qw.m13970a(1, str);
                    }
                }
            }
            if (this.f25406b != null && this.f25406b.length > 0) {
                for (int i2 = 0; i2 < this.f25406b.length; i2++) {
                    String str2 = this.f25406b[i2];
                    if (str2 != null) {
                        c7640qw.m13970a(2, str2);
                    }
                }
            }
            if (this.f25407c != null && this.f25407c.length > 0) {
                for (int i3 = 0; i3 < this.f25407c.length; i3++) {
                    c7640qw.m13973a(3, this.f25407c[i3]);
                }
            }
            if (this.f25408d != null && this.f25408d.length > 0) {
                for (int i4 = 0; i4 < this.f25408d.length; i4++) {
                    c7640qw.m13950b(4, this.f25408d[i4]);
                }
            }
            if (this.f25409e != null && this.f25409e.length > 0) {
                for (int i5 = 0; i5 < this.f25409e.length; i5++) {
                    c7640qw.m13950b(5, this.f25409e[i5]);
                }
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7656a m13835b() {
            this.f25405a = C7652rg.f25399f;
            this.f25406b = C7652rg.f25399f;
            this.f25407c = C7652rg.f25394a;
            this.f25408d = C7652rg.f25395b;
            this.f25409e = C7652rg.f25395b;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: c */
        public C7656a clone() {
            try {
                C7656a c7656a = (C7656a) super.clone();
                if (this.f25405a != null && this.f25405a.length > 0) {
                    c7656a.f25405a = (String[]) this.f25405a.clone();
                }
                if (this.f25406b != null && this.f25406b.length > 0) {
                    c7656a.f25406b = (String[]) this.f25406b.clone();
                }
                if (this.f25407c != null && this.f25407c.length > 0) {
                    c7656a.f25407c = (int[]) this.f25407c.clone();
                }
                if (this.f25408d != null && this.f25408d.length > 0) {
                    c7656a.f25408d = (long[]) this.f25408d.clone();
                }
                if (this.f25409e != null && this.f25409e.length > 0) {
                    c7656a.f25409e = (long[]) this.f25409e.clone();
                }
                return c7656a;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx
        /* renamed from: d */
        public /* synthetic */ C7656a mo13814d() {
            return (C7656a) clone();
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: e */
        public /* synthetic */ AbstractC7649rd mo13813e() {
            return (C7656a) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7656a)) {
                return false;
            }
            C7656a c7656a = (C7656a) obj;
            if (!C7647rb.m13867a(this.f25405a, c7656a.f25405a) || !C7647rb.m13867a(this.f25406b, c7656a.f25406b) || !C7647rb.m13871a(this.f25407c, c7656a.f25407c) || !C7647rb.m13869a(this.f25408d, c7656a.f25408d) || !C7647rb.m13869a(this.f25409e, c7656a.f25409e)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7656a.f25374ag == null || c7656a.f25374ag.m13887b() : this.f25374ag.equals(c7656a.f25374ag);
        }

        public int hashCode() {
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((((((((((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13868a(this.f25405a)) * 31) + C7647rb.m13868a(this.f25406b)) * 31) + C7647rb.m13872a(this.f25407c)) * 31) + C7647rb.m13870a(this.f25408d)) * 31) + C7647rb.m13870a(this.f25409e)) * 31);
        }
    }

    /* renamed from: com.google.android.gms.internal.ri$b */
    /* loaded from: classes2.dex */
    public static final class C7657b extends AbstractC7642qx<C7657b> implements Cloneable {

        /* renamed from: a */
        public int f25410a;

        /* renamed from: b */
        public String f25411b;

        /* renamed from: c */
        public String f25412c;

        public C7657b() {
            m13832b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f25410a != 0) {
                mo13820a += C7640qw.m13937c(1, this.f25410a);
            }
            if (!this.f25411b.equals("")) {
                mo13820a += C7640qw.m13948b(2, this.f25411b);
            }
            return !this.f25412c.equals("") ? mo13820a + C7640qw.m13948b(3, this.f25412c) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7657b mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f25410a = c7639qv.m13997g();
                        break;
                    case 18:
                        this.f25411b = c7639qv.m13993j();
                        break;
                    case 26:
                        this.f25412c = c7639qv.m13993j();
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
            if (this.f25410a != 0) {
                c7640qw.m13973a(1, this.f25410a);
            }
            if (!this.f25411b.equals("")) {
                c7640qw.m13970a(2, this.f25411b);
            }
            if (!this.f25412c.equals("")) {
                c7640qw.m13970a(3, this.f25412c);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7657b m13832b() {
            this.f25410a = 0;
            this.f25411b = "";
            this.f25412c = "";
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: c */
        public C7657b clone() {
            try {
                return (C7657b) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx
        /* renamed from: d */
        public /* synthetic */ C7657b mo13814d() {
            return (C7657b) clone();
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: e */
        public /* synthetic */ AbstractC7649rd mo13813e() {
            return (C7657b) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7657b)) {
                return false;
            }
            C7657b c7657b = (C7657b) obj;
            if (this.f25410a != c7657b.f25410a) {
                return false;
            }
            if (this.f25411b == null) {
                if (c7657b.f25411b != null) {
                    return false;
                }
            } else if (!this.f25411b.equals(c7657b.f25411b)) {
                return false;
            }
            if (this.f25412c == null) {
                if (c7657b.f25412c != null) {
                    return false;
                }
            } else if (!this.f25412c.equals(c7657b.f25412c)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7657b.f25374ag == null || c7657b.f25374ag.m13887b() : this.f25374ag.equals(c7657b.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f25412c == null ? 0 : this.f25412c.hashCode()) + (((this.f25411b == null ? 0 : this.f25411b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f25410a) * 31)) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.ri$c */
    /* loaded from: classes2.dex */
    public static final class C7658c extends AbstractC7642qx<C7658c> implements Cloneable {

        /* renamed from: a */
        public byte[] f25413a;

        /* renamed from: b */
        public String f25414b;

        /* renamed from: c */
        public byte[][] f25415c;

        /* renamed from: d */
        public boolean f25416d;

        public C7658c() {
            m13829b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (!Arrays.equals(this.f25413a, C7652rg.f25401h)) {
                mo13820a += C7640qw.m13946b(1, this.f25413a);
            }
            if (this.f25415c != null && this.f25415c.length > 0) {
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < this.f25415c.length; i3++) {
                    byte[] bArr = this.f25415c[i3];
                    if (bArr != null) {
                        i2++;
                        i += C7640qw.m13932c(bArr);
                    }
                }
                mo13820a = mo13820a + i + (i2 * 1);
            }
            if (this.f25416d) {
                mo13820a += C7640qw.m13947b(3, this.f25416d);
            }
            return !this.f25414b.equals("") ? mo13820a + C7640qw.m13948b(4, this.f25414b) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7658c mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f25413a = c7639qv.m13992k();
                        break;
                    case 18:
                        int m13839b = C7652rg.m13839b(c7639qv, 18);
                        int length = this.f25415c == null ? 0 : this.f25415c.length;
                        byte[][] bArr = new byte[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f25415c, 0, bArr, 0, length);
                        }
                        while (length < bArr.length - 1) {
                            bArr[length] = c7639qv.m13992k();
                            c7639qv.m14015a();
                            length++;
                        }
                        bArr[length] = c7639qv.m13992k();
                        this.f25415c = bArr;
                        break;
                    case 24:
                        this.f25416d = c7639qv.m13994i();
                        break;
                    case 34:
                        this.f25414b = c7639qv.m13993j();
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
            if (!Arrays.equals(this.f25413a, C7652rg.f25401h)) {
                c7640qw.m13968a(1, this.f25413a);
            }
            if (this.f25415c != null && this.f25415c.length > 0) {
                for (int i = 0; i < this.f25415c.length; i++) {
                    byte[] bArr = this.f25415c[i];
                    if (bArr != null) {
                        c7640qw.m13968a(2, bArr);
                    }
                }
            }
            if (this.f25416d) {
                c7640qw.m13969a(3, this.f25416d);
            }
            if (!this.f25414b.equals("")) {
                c7640qw.m13970a(4, this.f25414b);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7658c m13829b() {
            this.f25413a = C7652rg.f25401h;
            this.f25414b = "";
            this.f25415c = C7652rg.f25400g;
            this.f25416d = false;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: c */
        public C7658c clone() {
            try {
                C7658c c7658c = (C7658c) super.clone();
                if (this.f25415c != null && this.f25415c.length > 0) {
                    c7658c.f25415c = (byte[][]) this.f25415c.clone();
                }
                return c7658c;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx
        /* renamed from: d */
        public /* synthetic */ C7658c mo13814d() {
            return (C7658c) clone();
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: e */
        public /* synthetic */ AbstractC7649rd mo13813e() {
            return (C7658c) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7658c)) {
                return false;
            }
            C7658c c7658c = (C7658c) obj;
            if (!Arrays.equals(this.f25413a, c7658c.f25413a)) {
                return false;
            }
            if (this.f25414b == null) {
                if (c7658c.f25414b != null) {
                    return false;
                }
            } else if (!this.f25414b.equals(c7658c.f25414b)) {
                return false;
            }
            if (!C7647rb.m13865a(this.f25415c, c7658c.f25415c) || this.f25416d != c7658c.f25416d) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7658c.f25374ag == null || c7658c.f25374ag.m13887b() : this.f25374ag.equals(c7658c.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f25416d ? 1231 : 1237) + (((((this.f25414b == null ? 0 : this.f25414b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f25413a)) * 31)) * 31) + C7647rb.m13866a(this.f25415c)) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.ri$d */
    /* loaded from: classes2.dex */
    public static final class C7659d extends AbstractC7642qx<C7659d> implements Cloneable {

        /* renamed from: a */
        public long f25417a;

        /* renamed from: b */
        public long f25418b;

        /* renamed from: c */
        public long f25419c;

        /* renamed from: d */
        public String f25420d;

        /* renamed from: e */
        public int f25421e;

        /* renamed from: f */
        public int f25422f;

        /* renamed from: g */
        public boolean f25423g;

        /* renamed from: h */
        public C7660e[] f25424h;

        /* renamed from: i */
        public byte[] f25425i;

        /* renamed from: j */
        public C7657b f25426j;

        /* renamed from: k */
        public byte[] f25427k;

        /* renamed from: l */
        public String f25428l;

        /* renamed from: m */
        public String f25429m;

        /* renamed from: n */
        public C7656a f25430n;

        /* renamed from: o */
        public String f25431o;

        /* renamed from: p */
        public long f25432p;

        /* renamed from: q */
        public C7658c f25433q;

        /* renamed from: r */
        public byte[] f25434r;

        /* renamed from: s */
        public String f25435s;

        /* renamed from: t */
        public int f25436t;

        /* renamed from: u */
        public int[] f25437u;

        /* renamed from: v */
        public long f25438v;

        /* renamed from: w */
        public C7661f f25439w;

        public C7659d() {
            m13826b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f25417a != 0) {
                mo13820a += C7640qw.m13920f(1, this.f25417a);
            }
            if (!this.f25420d.equals("")) {
                mo13820a += C7640qw.m13948b(2, this.f25420d);
            }
            if (this.f25424h != null && this.f25424h.length > 0) {
                int i = mo13820a;
                for (int i2 = 0; i2 < this.f25424h.length; i2++) {
                    C7660e c7660e = this.f25424h[i2];
                    if (c7660e != null) {
                        i += C7640qw.m13935c(3, c7660e);
                    }
                }
                mo13820a = i;
            }
            if (!Arrays.equals(this.f25425i, C7652rg.f25401h)) {
                mo13820a += C7640qw.m13946b(4, this.f25425i);
            }
            if (!Arrays.equals(this.f25427k, C7652rg.f25401h)) {
                mo13820a += C7640qw.m13946b(6, this.f25427k);
            }
            if (this.f25430n != null) {
                mo13820a += C7640qw.m13935c(7, this.f25430n);
            }
            if (!this.f25428l.equals("")) {
                mo13820a += C7640qw.m13948b(8, this.f25428l);
            }
            if (this.f25426j != null) {
                mo13820a += C7640qw.m13935c(9, this.f25426j);
            }
            if (this.f25423g) {
                mo13820a += C7640qw.m13947b(10, this.f25423g);
            }
            if (this.f25421e != 0) {
                mo13820a += C7640qw.m13937c(11, this.f25421e);
            }
            if (this.f25422f != 0) {
                mo13820a += C7640qw.m13937c(12, this.f25422f);
            }
            if (!this.f25429m.equals("")) {
                mo13820a += C7640qw.m13948b(13, this.f25429m);
            }
            if (!this.f25431o.equals("")) {
                mo13820a += C7640qw.m13948b(14, this.f25431o);
            }
            if (this.f25432p != 180000) {
                mo13820a += C7640qw.m13914h(15, this.f25432p);
            }
            if (this.f25433q != null) {
                mo13820a += C7640qw.m13935c(16, this.f25433q);
            }
            if (this.f25418b != 0) {
                mo13820a += C7640qw.m13920f(17, this.f25418b);
            }
            if (!Arrays.equals(this.f25434r, C7652rg.f25401h)) {
                mo13820a += C7640qw.m13946b(18, this.f25434r);
            }
            if (this.f25436t != 0) {
                mo13820a += C7640qw.m13937c(19, this.f25436t);
            }
            if (this.f25437u != null && this.f25437u.length > 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < this.f25437u.length; i4++) {
                    i3 += C7640qw.m13938c(this.f25437u[i4]);
                }
                mo13820a = mo13820a + i3 + (this.f25437u.length * 2);
            }
            if (this.f25419c != 0) {
                mo13820a += C7640qw.m13920f(21, this.f25419c);
            }
            if (this.f25438v != 0) {
                mo13820a += C7640qw.m13920f(22, this.f25438v);
            }
            if (this.f25439w != null) {
                mo13820a += C7640qw.m13935c(23, this.f25439w);
            }
            return !this.f25435s.equals("") ? mo13820a + C7640qw.m13948b(24, this.f25435s) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7659d mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f25417a = c7639qv.m13999f();
                        break;
                    case 18:
                        this.f25420d = c7639qv.m13993j();
                        break;
                    case 26:
                        int m13839b = C7652rg.m13839b(c7639qv, 26);
                        int length = this.f25424h == null ? 0 : this.f25424h.length;
                        C7660e[] c7660eArr = new C7660e[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f25424h, 0, c7660eArr, 0, length);
                        }
                        while (length < c7660eArr.length - 1) {
                            c7660eArr[length] = new C7660e();
                            c7639qv.m14011a(c7660eArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c7660eArr[length] = new C7660e();
                        c7639qv.m14011a(c7660eArr[length]);
                        this.f25424h = c7660eArr;
                        break;
                    case 34:
                        this.f25425i = c7639qv.m13992k();
                        break;
                    case 50:
                        this.f25427k = c7639qv.m13992k();
                        break;
                    case 58:
                        if (this.f25430n == null) {
                            this.f25430n = new C7656a();
                        }
                        c7639qv.m14011a(this.f25430n);
                        break;
                    case 66:
                        this.f25428l = c7639qv.m13993j();
                        break;
                    case 74:
                        if (this.f25426j == null) {
                            this.f25426j = new C7657b();
                        }
                        c7639qv.m14011a(this.f25426j);
                        break;
                    case 80:
                        this.f25423g = c7639qv.m13994i();
                        break;
                    case 88:
                        this.f25421e = c7639qv.m13997g();
                        break;
                    case 96:
                        this.f25422f = c7639qv.m13997g();
                        break;
                    case 106:
                        this.f25429m = c7639qv.m13993j();
                        break;
                    case 114:
                        this.f25431o = c7639qv.m13993j();
                        break;
                    case 120:
                        this.f25432p = c7639qv.m13990m();
                        break;
                    case 130:
                        if (this.f25433q == null) {
                            this.f25433q = new C7658c();
                        }
                        c7639qv.m14011a(this.f25433q);
                        break;
                    case 136:
                        this.f25418b = c7639qv.m13999f();
                        break;
                    case 146:
                        this.f25434r = c7639qv.m13992k();
                        break;
                    case 152:
                        int m13997g = c7639qv.m13997g();
                        switch (m13997g) {
                            case 0:
                            case 1:
                            case 2:
                                this.f25436t = m13997g;
                                continue;
                        }
                    case 160:
                        int m13839b2 = C7652rg.m13839b(c7639qv, 160);
                        int length2 = this.f25437u == null ? 0 : this.f25437u.length;
                        int[] iArr = new int[m13839b2 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f25437u, 0, iArr, 0, length2);
                        }
                        while (length2 < iArr.length - 1) {
                            iArr[length2] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length2++;
                        }
                        iArr[length2] = c7639qv.m13997g();
                        this.f25437u = iArr;
                        break;
                    case Opcodes.IF_ICMPGE /* 162 */:
                        int m14002d = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t = c7639qv.m13983t();
                        int i = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i++;
                        }
                        c7639qv.m13998f(m13983t);
                        int length3 = this.f25437u == null ? 0 : this.f25437u.length;
                        int[] iArr2 = new int[i + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.f25437u, 0, iArr2, 0, length3);
                        }
                        while (length3 < iArr2.length) {
                            iArr2[length3] = c7639qv.m13997g();
                            length3++;
                        }
                        this.f25437u = iArr2;
                        c7639qv.m14000e(m14002d);
                        break;
                    case 168:
                        this.f25419c = c7639qv.m13999f();
                        break;
                    case 176:
                        this.f25438v = c7639qv.m13999f();
                        break;
                    case Opcodes.INVOKEDYNAMIC /* 186 */:
                        if (this.f25439w == null) {
                            this.f25439w = new C7661f();
                        }
                        c7639qv.m14011a(this.f25439w);
                        break;
                    case 194:
                        this.f25435s = c7639qv.m13993j();
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
            if (this.f25417a != 0) {
                c7640qw.m13950b(1, this.f25417a);
            }
            if (!this.f25420d.equals("")) {
                c7640qw.m13970a(2, this.f25420d);
            }
            if (this.f25424h != null && this.f25424h.length > 0) {
                for (int i = 0; i < this.f25424h.length; i++) {
                    C7660e c7660e = this.f25424h[i];
                    if (c7660e != null) {
                        c7640qw.m13971a(3, c7660e);
                    }
                }
            }
            if (!Arrays.equals(this.f25425i, C7652rg.f25401h)) {
                c7640qw.m13968a(4, this.f25425i);
            }
            if (!Arrays.equals(this.f25427k, C7652rg.f25401h)) {
                c7640qw.m13968a(6, this.f25427k);
            }
            if (this.f25430n != null) {
                c7640qw.m13971a(7, this.f25430n);
            }
            if (!this.f25428l.equals("")) {
                c7640qw.m13970a(8, this.f25428l);
            }
            if (this.f25426j != null) {
                c7640qw.m13971a(9, this.f25426j);
            }
            if (this.f25423g) {
                c7640qw.m13969a(10, this.f25423g);
            }
            if (this.f25421e != 0) {
                c7640qw.m13973a(11, this.f25421e);
            }
            if (this.f25422f != 0) {
                c7640qw.m13973a(12, this.f25422f);
            }
            if (!this.f25429m.equals("")) {
                c7640qw.m13970a(13, this.f25429m);
            }
            if (!this.f25431o.equals("")) {
                c7640qw.m13970a(14, this.f25431o);
            }
            if (this.f25432p != 180000) {
                c7640qw.m13929d(15, this.f25432p);
            }
            if (this.f25433q != null) {
                c7640qw.m13971a(16, this.f25433q);
            }
            if (this.f25418b != 0) {
                c7640qw.m13950b(17, this.f25418b);
            }
            if (!Arrays.equals(this.f25434r, C7652rg.f25401h)) {
                c7640qw.m13968a(18, this.f25434r);
            }
            if (this.f25436t != 0) {
                c7640qw.m13973a(19, this.f25436t);
            }
            if (this.f25437u != null && this.f25437u.length > 0) {
                for (int i2 = 0; i2 < this.f25437u.length; i2++) {
                    c7640qw.m13973a(20, this.f25437u[i2]);
                }
            }
            if (this.f25419c != 0) {
                c7640qw.m13950b(21, this.f25419c);
            }
            if (this.f25438v != 0) {
                c7640qw.m13950b(22, this.f25438v);
            }
            if (this.f25439w != null) {
                c7640qw.m13971a(23, this.f25439w);
            }
            if (!this.f25435s.equals("")) {
                c7640qw.m13970a(24, this.f25435s);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7659d m13826b() {
            this.f25417a = 0L;
            this.f25418b = 0L;
            this.f25419c = 0L;
            this.f25420d = "";
            this.f25421e = 0;
            this.f25422f = 0;
            this.f25423g = false;
            this.f25424h = C7660e.m13823b();
            this.f25425i = C7652rg.f25401h;
            this.f25426j = null;
            this.f25427k = C7652rg.f25401h;
            this.f25428l = "";
            this.f25429m = "";
            this.f25430n = null;
            this.f25431o = "";
            this.f25432p = 180000L;
            this.f25433q = null;
            this.f25434r = C7652rg.f25401h;
            this.f25435s = "";
            this.f25436t = 0;
            this.f25437u = C7652rg.f25394a;
            this.f25438v = 0L;
            this.f25439w = null;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: c */
        public C7659d clone() {
            try {
                C7659d c7659d = (C7659d) super.clone();
                if (this.f25424h != null && this.f25424h.length > 0) {
                    c7659d.f25424h = new C7660e[this.f25424h.length];
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 >= this.f25424h.length) {
                            break;
                        }
                        if (this.f25424h[i2] != null) {
                            c7659d.f25424h[i2] = (C7660e) this.f25424h[i2].clone();
                        }
                        i = i2 + 1;
                    }
                }
                if (this.f25426j != null) {
                    c7659d.f25426j = (C7657b) this.f25426j.clone();
                }
                if (this.f25430n != null) {
                    c7659d.f25430n = (C7656a) this.f25430n.clone();
                }
                if (this.f25433q != null) {
                    c7659d.f25433q = (C7658c) this.f25433q.clone();
                }
                if (this.f25437u != null && this.f25437u.length > 0) {
                    c7659d.f25437u = (int[]) this.f25437u.clone();
                }
                if (this.f25439w != null) {
                    c7659d.f25439w = (C7661f) this.f25439w.clone();
                }
                return c7659d;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx
        /* renamed from: d */
        public /* synthetic */ C7659d mo13814d() {
            return (C7659d) clone();
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: e */
        public /* synthetic */ AbstractC7649rd mo13813e() {
            return (C7659d) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7659d)) {
                return false;
            }
            C7659d c7659d = (C7659d) obj;
            if (this.f25417a != c7659d.f25417a || this.f25418b != c7659d.f25418b || this.f25419c != c7659d.f25419c) {
                return false;
            }
            if (this.f25420d == null) {
                if (c7659d.f25420d != null) {
                    return false;
                }
            } else if (!this.f25420d.equals(c7659d.f25420d)) {
                return false;
            }
            if (this.f25421e != c7659d.f25421e || this.f25422f != c7659d.f25422f || this.f25423g != c7659d.f25423g || !C7647rb.m13867a(this.f25424h, c7659d.f25424h) || !Arrays.equals(this.f25425i, c7659d.f25425i)) {
                return false;
            }
            if (this.f25426j == null) {
                if (c7659d.f25426j != null) {
                    return false;
                }
            } else if (!this.f25426j.equals(c7659d.f25426j)) {
                return false;
            }
            if (!Arrays.equals(this.f25427k, c7659d.f25427k)) {
                return false;
            }
            if (this.f25428l == null) {
                if (c7659d.f25428l != null) {
                    return false;
                }
            } else if (!this.f25428l.equals(c7659d.f25428l)) {
                return false;
            }
            if (this.f25429m == null) {
                if (c7659d.f25429m != null) {
                    return false;
                }
            } else if (!this.f25429m.equals(c7659d.f25429m)) {
                return false;
            }
            if (this.f25430n == null) {
                if (c7659d.f25430n != null) {
                    return false;
                }
            } else if (!this.f25430n.equals(c7659d.f25430n)) {
                return false;
            }
            if (this.f25431o == null) {
                if (c7659d.f25431o != null) {
                    return false;
                }
            } else if (!this.f25431o.equals(c7659d.f25431o)) {
                return false;
            }
            if (this.f25432p != c7659d.f25432p) {
                return false;
            }
            if (this.f25433q == null) {
                if (c7659d.f25433q != null) {
                    return false;
                }
            } else if (!this.f25433q.equals(c7659d.f25433q)) {
                return false;
            }
            if (!Arrays.equals(this.f25434r, c7659d.f25434r)) {
                return false;
            }
            if (this.f25435s == null) {
                if (c7659d.f25435s != null) {
                    return false;
                }
            } else if (!this.f25435s.equals(c7659d.f25435s)) {
                return false;
            }
            if (this.f25436t != c7659d.f25436t || !C7647rb.m13871a(this.f25437u, c7659d.f25437u) || this.f25438v != c7659d.f25438v) {
                return false;
            }
            if (this.f25439w == null) {
                if (c7659d.f25439w != null) {
                    return false;
                }
            } else if (!this.f25439w.equals(c7659d.f25439w)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7659d.f25374ag == null || c7659d.f25374ag.m13887b() : this.f25374ag.equals(c7659d.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f25439w == null ? 0 : this.f25439w.hashCode()) + (((((((((this.f25435s == null ? 0 : this.f25435s.hashCode()) + (((((this.f25433q == null ? 0 : this.f25433q.hashCode()) + (((((this.f25431o == null ? 0 : this.f25431o.hashCode()) + (((this.f25430n == null ? 0 : this.f25430n.hashCode()) + (((this.f25429m == null ? 0 : this.f25429m.hashCode()) + (((this.f25428l == null ? 0 : this.f25428l.hashCode()) + (((((this.f25426j == null ? 0 : this.f25426j.hashCode()) + (((((((this.f25423g ? 1231 : 1237) + (((((((this.f25420d == null ? 0 : this.f25420d.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f25417a ^ (this.f25417a >>> 32)))) * 31) + ((int) (this.f25418b ^ (this.f25418b >>> 32)))) * 31) + ((int) (this.f25419c ^ (this.f25419c >>> 32)))) * 31)) * 31) + this.f25421e) * 31) + this.f25422f) * 31)) * 31) + C7647rb.m13868a(this.f25424h)) * 31) + Arrays.hashCode(this.f25425i)) * 31)) * 31) + Arrays.hashCode(this.f25427k)) * 31)) * 31)) * 31)) * 31)) * 31) + ((int) (this.f25432p ^ (this.f25432p >>> 32)))) * 31)) * 31) + Arrays.hashCode(this.f25434r)) * 31)) * 31) + this.f25436t) * 31) + C7647rb.m13872a(this.f25437u)) * 31) + ((int) (this.f25438v ^ (this.f25438v >>> 32)))) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.ri$e */
    /* loaded from: classes2.dex */
    public static final class C7660e extends AbstractC7642qx<C7660e> implements Cloneable {

        /* renamed from: c */
        private static volatile C7660e[] f25440c;

        /* renamed from: a */
        public String f25441a;

        /* renamed from: b */
        public String f25442b;

        public C7660e() {
            m13822c();
        }

        /* renamed from: b */
        public static C7660e[] m13823b() {
            if (f25440c == null) {
                synchronized (C7647rb.f25390c) {
                    if (f25440c == null) {
                        f25440c = new C7660e[0];
                    }
                }
            }
            return f25440c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (!this.f25441a.equals("")) {
                mo13820a += C7640qw.m13948b(1, this.f25441a);
            }
            return !this.f25442b.equals("") ? mo13820a + C7640qw.m13948b(2, this.f25442b) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7660e mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f25441a = c7639qv.m13993j();
                        break;
                    case 18:
                        this.f25442b = c7639qv.m13993j();
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
            if (!this.f25441a.equals("")) {
                c7640qw.m13970a(1, this.f25441a);
            }
            if (!this.f25442b.equals("")) {
                c7640qw.m13970a(2, this.f25442b);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C7660e m13822c() {
            this.f25441a = "";
            this.f25442b = "";
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx
        /* renamed from: d */
        public /* synthetic */ C7660e mo13814d() {
            return (C7660e) clone();
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: e */
        public /* synthetic */ AbstractC7649rd mo13813e() {
            return (C7660e) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7660e)) {
                return false;
            }
            C7660e c7660e = (C7660e) obj;
            if (this.f25441a == null) {
                if (c7660e.f25441a != null) {
                    return false;
                }
            } else if (!this.f25441a.equals(c7660e.f25441a)) {
                return false;
            }
            if (this.f25442b == null) {
                if (c7660e.f25442b != null) {
                    return false;
                }
            } else if (!this.f25442b.equals(c7660e.f25442b)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7660e.f25374ag == null || c7660e.f25374ag.m13887b() : this.f25374ag.equals(c7660e.f25374ag);
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: h */
        public C7660e clone() {
            try {
                return (C7660e) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f25442b == null ? 0 : this.f25442b.hashCode()) + (((this.f25441a == null ? 0 : this.f25441a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.ri$f */
    /* loaded from: classes2.dex */
    public static final class C7661f extends AbstractC7642qx<C7661f> implements Cloneable {

        /* renamed from: a */
        public int f25443a;

        public C7661f() {
            m13817b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            return this.f25443a != -1 ? mo13820a + C7640qw.m13937c(1, this.f25443a) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7661f mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        int m13997g = c7639qv.m13997g();
                        switch (m13997g) {
                            case -1:
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
                                this.f25443a = m13997g;
                                continue;
                        }
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
            if (this.f25443a != -1) {
                c7640qw.m13973a(1, this.f25443a);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7661f m13817b() {
            this.f25443a = -1;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: c */
        public C7661f clone() {
            try {
                return (C7661f) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx
        /* renamed from: d */
        public /* synthetic */ C7661f mo13814d() {
            return (C7661f) clone();
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: e */
        public /* synthetic */ AbstractC7649rd mo13813e() {
            return (C7661f) clone();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7661f)) {
                return false;
            }
            C7661f c7661f = (C7661f) obj;
            if (this.f25443a != c7661f.f25443a) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7661f.f25374ag == null || c7661f.f25374ag.m13887b() : this.f25374ag.equals(c7661f.f25374ag);
        }

        public int hashCode() {
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + this.f25443a) * 31);
        }
    }
}
