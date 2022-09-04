package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7090hj;
/* renamed from: com.google.android.gms.internal.gi */
/* loaded from: classes2.dex */
public interface AbstractC7030gi {

    /* renamed from: com.google.android.gms.internal.gi$a */
    /* loaded from: classes2.dex */
    public static final class C7031a extends AbstractC7642qx<C7031a> {

        /* renamed from: a */
        public int f23720a;

        /* renamed from: b */
        public int f23721b;

        /* renamed from: c */
        public int f23722c;

        public C7031a() {
            m15747b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f23720a != 1) {
                mo13820a += C7640qw.m13937c(1, this.f23720a);
            }
            if (this.f23721b != 0) {
                mo13820a += C7640qw.m13937c(2, this.f23721b);
            }
            return this.f23722c != 0 ? mo13820a + C7640qw.m13937c(3, this.f23722c) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7031a mo13816b(C7639qv c7639qv) {
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
                                this.f23720a = m13997g;
                                continue;
                        }
                    case 16:
                        this.f23721b = c7639qv.m13997g();
                        break;
                    case 24:
                        this.f23722c = c7639qv.m13997g();
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
            if (this.f23720a != 1) {
                c7640qw.m13973a(1, this.f23720a);
            }
            if (this.f23721b != 0) {
                c7640qw.m13973a(2, this.f23721b);
            }
            if (this.f23722c != 0) {
                c7640qw.m13973a(3, this.f23722c);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7031a m15747b() {
            this.f23720a = 1;
            this.f23721b = 0;
            this.f23722c = 0;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7031a)) {
                return false;
            }
            C7031a c7031a = (C7031a) obj;
            if (this.f23720a != c7031a.f23720a || this.f23721b != c7031a.f23721b || this.f23722c != c7031a.f23722c) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7031a.f25374ag == null || c7031a.f25374ag.m13887b() : this.f25374ag.equals(c7031a.f25374ag);
        }

        public int hashCode() {
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + this.f23720a) * 31) + this.f23721b) * 31) + this.f23722c) * 31);
        }
    }

    /* renamed from: com.google.android.gms.internal.gi$b */
    /* loaded from: classes2.dex */
    public static final class C7032b extends AbstractC7642qx<C7032b> {

        /* renamed from: f */
        private static volatile C7032b[] f23723f;

        /* renamed from: a */
        public int[] f23724a;

        /* renamed from: b */
        public int f23725b;

        /* renamed from: c */
        public int f23726c;

        /* renamed from: d */
        public boolean f23727d;

        /* renamed from: e */
        public boolean f23728e;

        public C7032b() {
            m15744c();
        }

        /* renamed from: b */
        public static C7032b[] m15745b() {
            if (f23723f == null) {
                synchronized (C7647rb.f25390c) {
                    if (f23723f == null) {
                        f23723f = new C7032b[0];
                    }
                }
            }
            return f23723f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int i;
            int i2 = 0;
            int mo13820a = super.mo13820a();
            if (this.f23728e) {
                mo13820a += C7640qw.m13947b(1, this.f23728e);
            }
            int m13937c = C7640qw.m13937c(2, this.f23725b) + mo13820a;
            if (this.f23724a == null || this.f23724a.length <= 0) {
                i = m13937c;
            } else {
                for (int i3 = 0; i3 < this.f23724a.length; i3++) {
                    i2 += C7640qw.m13938c(this.f23724a[i3]);
                }
                i = m13937c + i2 + (this.f23724a.length * 1);
            }
            if (this.f23726c != 0) {
                i += C7640qw.m13937c(4, this.f23726c);
            }
            return this.f23727d ? i + C7640qw.m13947b(6, this.f23727d) : i;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7032b mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f23728e = c7639qv.m13994i();
                        break;
                    case 16:
                        this.f23725b = c7639qv.m13997g();
                        break;
                    case 24:
                        int m13839b = C7652rg.m13839b(c7639qv, 24);
                        int length = this.f23724a == null ? 0 : this.f23724a.length;
                        int[] iArr = new int[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f23724a, 0, iArr, 0, length);
                        }
                        while (length < iArr.length - 1) {
                            iArr[length] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length++;
                        }
                        iArr[length] = c7639qv.m13997g();
                        this.f23724a = iArr;
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
                        int length2 = this.f23724a == null ? 0 : this.f23724a.length;
                        int[] iArr2 = new int[i + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f23724a, 0, iArr2, 0, length2);
                        }
                        while (length2 < iArr2.length) {
                            iArr2[length2] = c7639qv.m13997g();
                            length2++;
                        }
                        this.f23724a = iArr2;
                        c7639qv.m14000e(m14002d);
                        break;
                    case 32:
                        this.f23726c = c7639qv.m13997g();
                        break;
                    case 48:
                        this.f23727d = c7639qv.m13994i();
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
            if (this.f23728e) {
                c7640qw.m13969a(1, this.f23728e);
            }
            c7640qw.m13973a(2, this.f23725b);
            if (this.f23724a != null && this.f23724a.length > 0) {
                for (int i = 0; i < this.f23724a.length; i++) {
                    c7640qw.m13973a(3, this.f23724a[i]);
                }
            }
            if (this.f23726c != 0) {
                c7640qw.m13973a(4, this.f23726c);
            }
            if (this.f23727d) {
                c7640qw.m13969a(6, this.f23727d);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C7032b m15744c() {
            this.f23724a = C7652rg.f25394a;
            this.f23725b = 0;
            this.f23726c = 0;
            this.f23727d = false;
            this.f23728e = false;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7032b)) {
                return false;
            }
            C7032b c7032b = (C7032b) obj;
            if (!C7647rb.m13871a(this.f23724a, c7032b.f23724a) || this.f23725b != c7032b.f23725b || this.f23726c != c7032b.f23726c || this.f23727d != c7032b.f23727d || this.f23728e != c7032b.f23728e) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7032b.f25374ag == null || c7032b.f25374ag.m13887b() : this.f25374ag.equals(c7032b.f25374ag);
        }

        public int hashCode() {
            int i = 1231;
            int hashCode = ((this.f23727d ? 1231 : 1237) + ((((((((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13872a(this.f23724a)) * 31) + this.f23725b) * 31) + this.f23726c) * 31)) * 31;
            if (!this.f23728e) {
                i = 1237;
            }
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((hashCode + i) * 31);
        }
    }

    /* renamed from: com.google.android.gms.internal.gi$c */
    /* loaded from: classes2.dex */
    public static final class C7033c extends AbstractC7642qx<C7033c> {

        /* renamed from: f */
        private static volatile C7033c[] f23729f;

        /* renamed from: a */
        public String f23730a;

        /* renamed from: b */
        public long f23731b;

        /* renamed from: c */
        public long f23732c;

        /* renamed from: d */
        public boolean f23733d;

        /* renamed from: e */
        public long f23734e;

        public C7033c() {
            m15741c();
        }

        /* renamed from: b */
        public static C7033c[] m15742b() {
            if (f23729f == null) {
                synchronized (C7647rb.f25390c) {
                    if (f23729f == null) {
                        f23729f = new C7033c[0];
                    }
                }
            }
            return f23729f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (!this.f23730a.equals("")) {
                mo13820a += C7640qw.m13948b(1, this.f23730a);
            }
            if (this.f23731b != 0) {
                mo13820a += C7640qw.m13920f(2, this.f23731b);
            }
            if (this.f23732c != 2147483647L) {
                mo13820a += C7640qw.m13920f(3, this.f23732c);
            }
            if (this.f23733d) {
                mo13820a += C7640qw.m13947b(4, this.f23733d);
            }
            return this.f23734e != 0 ? mo13820a + C7640qw.m13920f(5, this.f23734e) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7033c mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f23730a = c7639qv.m13993j();
                        break;
                    case 16:
                        this.f23731b = c7639qv.m13999f();
                        break;
                    case 24:
                        this.f23732c = c7639qv.m13999f();
                        break;
                    case 32:
                        this.f23733d = c7639qv.m13994i();
                        break;
                    case 40:
                        this.f23734e = c7639qv.m13999f();
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
            if (!this.f23730a.equals("")) {
                c7640qw.m13970a(1, this.f23730a);
            }
            if (this.f23731b != 0) {
                c7640qw.m13950b(2, this.f23731b);
            }
            if (this.f23732c != 2147483647L) {
                c7640qw.m13950b(3, this.f23732c);
            }
            if (this.f23733d) {
                c7640qw.m13969a(4, this.f23733d);
            }
            if (this.f23734e != 0) {
                c7640qw.m13950b(5, this.f23734e);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C7033c m15741c() {
            this.f23730a = "";
            this.f23731b = 0L;
            this.f23732c = 2147483647L;
            this.f23733d = false;
            this.f23734e = 0L;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7033c)) {
                return false;
            }
            C7033c c7033c = (C7033c) obj;
            if (this.f23730a == null) {
                if (c7033c.f23730a != null) {
                    return false;
                }
            } else if (!this.f23730a.equals(c7033c.f23730a)) {
                return false;
            }
            if (this.f23731b != c7033c.f23731b || this.f23732c != c7033c.f23732c || this.f23733d != c7033c.f23733d || this.f23734e != c7033c.f23734e) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7033c.f25374ag == null || c7033c.f25374ag.m13887b() : this.f25374ag.equals(c7033c.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.f23733d ? 1231 : 1237) + (((((((this.f23730a == null ? 0 : this.f23730a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + ((int) (this.f23731b ^ (this.f23731b >>> 32)))) * 31) + ((int) (this.f23732c ^ (this.f23732c >>> 32)))) * 31)) * 31) + ((int) (this.f23734e ^ (this.f23734e >>> 32)))) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.gi$d */
    /* loaded from: classes2.dex */
    public static final class C7034d extends AbstractC7642qx<C7034d> {

        /* renamed from: a */
        public AbstractC7090hj.C7091a[] f23735a;

        /* renamed from: b */
        public AbstractC7090hj.C7091a[] f23736b;

        /* renamed from: c */
        public C7033c[] f23737c;

        public C7034d() {
            m15739b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f23735a != null && this.f23735a.length > 0) {
                int i = mo13820a;
                for (int i2 = 0; i2 < this.f23735a.length; i2++) {
                    AbstractC7090hj.C7091a c7091a = this.f23735a[i2];
                    if (c7091a != null) {
                        i += C7640qw.m13935c(1, c7091a);
                    }
                }
                mo13820a = i;
            }
            if (this.f23736b != null && this.f23736b.length > 0) {
                int i3 = mo13820a;
                for (int i4 = 0; i4 < this.f23736b.length; i4++) {
                    AbstractC7090hj.C7091a c7091a2 = this.f23736b[i4];
                    if (c7091a2 != null) {
                        i3 += C7640qw.m13935c(2, c7091a2);
                    }
                }
                mo13820a = i3;
            }
            if (this.f23737c != null && this.f23737c.length > 0) {
                for (int i5 = 0; i5 < this.f23737c.length; i5++) {
                    C7033c c7033c = this.f23737c[i5];
                    if (c7033c != null) {
                        mo13820a += C7640qw.m13935c(3, c7033c);
                    }
                }
            }
            return mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7034d mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        int m13839b = C7652rg.m13839b(c7639qv, 10);
                        int length = this.f23735a == null ? 0 : this.f23735a.length;
                        AbstractC7090hj.C7091a[] c7091aArr = new AbstractC7090hj.C7091a[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f23735a, 0, c7091aArr, 0, length);
                        }
                        while (length < c7091aArr.length - 1) {
                            c7091aArr[length] = new AbstractC7090hj.C7091a();
                            c7639qv.m14011a(c7091aArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c7091aArr[length] = new AbstractC7090hj.C7091a();
                        c7639qv.m14011a(c7091aArr[length]);
                        this.f23735a = c7091aArr;
                        break;
                    case 18:
                        int m13839b2 = C7652rg.m13839b(c7639qv, 18);
                        int length2 = this.f23736b == null ? 0 : this.f23736b.length;
                        AbstractC7090hj.C7091a[] c7091aArr2 = new AbstractC7090hj.C7091a[m13839b2 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f23736b, 0, c7091aArr2, 0, length2);
                        }
                        while (length2 < c7091aArr2.length - 1) {
                            c7091aArr2[length2] = new AbstractC7090hj.C7091a();
                            c7639qv.m14011a(c7091aArr2[length2]);
                            c7639qv.m14015a();
                            length2++;
                        }
                        c7091aArr2[length2] = new AbstractC7090hj.C7091a();
                        c7639qv.m14011a(c7091aArr2[length2]);
                        this.f23736b = c7091aArr2;
                        break;
                    case 26:
                        int m13839b3 = C7652rg.m13839b(c7639qv, 26);
                        int length3 = this.f23737c == null ? 0 : this.f23737c.length;
                        C7033c[] c7033cArr = new C7033c[m13839b3 + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.f23737c, 0, c7033cArr, 0, length3);
                        }
                        while (length3 < c7033cArr.length - 1) {
                            c7033cArr[length3] = new C7033c();
                            c7639qv.m14011a(c7033cArr[length3]);
                            c7639qv.m14015a();
                            length3++;
                        }
                        c7033cArr[length3] = new C7033c();
                        c7639qv.m14011a(c7033cArr[length3]);
                        this.f23737c = c7033cArr;
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
            if (this.f23735a != null && this.f23735a.length > 0) {
                for (int i = 0; i < this.f23735a.length; i++) {
                    AbstractC7090hj.C7091a c7091a = this.f23735a[i];
                    if (c7091a != null) {
                        c7640qw.m13971a(1, c7091a);
                    }
                }
            }
            if (this.f23736b != null && this.f23736b.length > 0) {
                for (int i2 = 0; i2 < this.f23736b.length; i2++) {
                    AbstractC7090hj.C7091a c7091a2 = this.f23736b[i2];
                    if (c7091a2 != null) {
                        c7640qw.m13971a(2, c7091a2);
                    }
                }
            }
            if (this.f23737c != null && this.f23737c.length > 0) {
                for (int i3 = 0; i3 < this.f23737c.length; i3++) {
                    C7033c c7033c = this.f23737c[i3];
                    if (c7033c != null) {
                        c7640qw.m13971a(3, c7033c);
                    }
                }
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7034d m15739b() {
            this.f23735a = AbstractC7090hj.C7091a.m15599b();
            this.f23736b = AbstractC7090hj.C7091a.m15599b();
            this.f23737c = C7033c.m15742b();
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7034d)) {
                return false;
            }
            C7034d c7034d = (C7034d) obj;
            if (!C7647rb.m13867a(this.f23735a, c7034d.f23735a) || !C7647rb.m13867a(this.f23736b, c7034d.f23736b) || !C7647rb.m13867a(this.f23737c, c7034d.f23737c)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7034d.f25374ag == null || c7034d.f25374ag.m13887b() : this.f25374ag.equals(c7034d.f25374ag);
        }

        public int hashCode() {
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13868a(this.f23735a)) * 31) + C7647rb.m13868a(this.f23736b)) * 31) + C7647rb.m13868a(this.f23737c)) * 31);
        }
    }

    /* renamed from: com.google.android.gms.internal.gi$e */
    /* loaded from: classes2.dex */
    public static final class C7035e extends AbstractC7642qx<C7035e> {

        /* renamed from: c */
        private static volatile C7035e[] f23738c;

        /* renamed from: a */
        public int f23739a;

        /* renamed from: b */
        public int f23740b;

        public C7035e() {
            m15736c();
        }

        /* renamed from: b */
        public static C7035e[] m15737b() {
            if (f23738c == null) {
                synchronized (C7647rb.f25390c) {
                    if (f23738c == null) {
                        f23738c = new C7035e[0];
                    }
                }
            }
            return f23738c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            return super.mo13820a() + C7640qw.m13937c(1, this.f23739a) + C7640qw.m13937c(2, this.f23740b);
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7035e mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f23739a = c7639qv.m13997g();
                        break;
                    case 16:
                        this.f23740b = c7639qv.m13997g();
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
            c7640qw.m13973a(1, this.f23739a);
            c7640qw.m13973a(2, this.f23740b);
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C7035e m15736c() {
            this.f23739a = 0;
            this.f23740b = 0;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7035e)) {
                return false;
            }
            C7035e c7035e = (C7035e) obj;
            if (this.f23739a != c7035e.f23739a || this.f23740b != c7035e.f23740b) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7035e.f25374ag == null || c7035e.f25374ag.m13887b() : this.f25374ag.equals(c7035e.f25374ag);
        }

        public int hashCode() {
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + this.f23739a) * 31) + this.f23740b) * 31);
        }
    }

    /* renamed from: com.google.android.gms.internal.gi$f */
    /* loaded from: classes2.dex */
    public static final class C7036f extends AbstractC7642qx<C7036f> {

        /* renamed from: a */
        public String[] f23741a;

        /* renamed from: b */
        public String[] f23742b;

        /* renamed from: c */
        public AbstractC7090hj.C7091a[] f23743c;

        /* renamed from: d */
        public C7035e[] f23744d;

        /* renamed from: e */
        public C7032b[] f23745e;

        /* renamed from: f */
        public C7032b[] f23746f;

        /* renamed from: g */
        public C7032b[] f23747g;

        /* renamed from: h */
        public C7037g[] f23748h;

        /* renamed from: i */
        public String f23749i;

        /* renamed from: j */
        public String f23750j;

        /* renamed from: k */
        public String f23751k;

        /* renamed from: l */
        public String f23752l;

        /* renamed from: m */
        public C7031a f23753m;

        /* renamed from: n */
        public float f23754n;

        /* renamed from: o */
        public boolean f23755o;

        /* renamed from: p */
        public String[] f23756p;

        /* renamed from: q */
        public int f23757q;

        public C7036f() {
            m15733b();
        }

        /* renamed from: a */
        public static C7036f m15734a(byte[] bArr) {
            return (C7036f) AbstractC7649rd.m13856a(new C7036f(), bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int i;
            int mo13820a = super.mo13820a();
            if (this.f23742b == null || this.f23742b.length <= 0) {
                i = mo13820a;
            } else {
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < this.f23742b.length; i4++) {
                    String str = this.f23742b[i4];
                    if (str != null) {
                        i3++;
                        i2 += C7640qw.m13942b(str);
                    }
                }
                i = mo13820a + i2 + (i3 * 1);
            }
            if (this.f23743c != null && this.f23743c.length > 0) {
                int i5 = i;
                for (int i6 = 0; i6 < this.f23743c.length; i6++) {
                    AbstractC7090hj.C7091a c7091a = this.f23743c[i6];
                    if (c7091a != null) {
                        i5 += C7640qw.m13935c(2, c7091a);
                    }
                }
                i = i5;
            }
            if (this.f23744d != null && this.f23744d.length > 0) {
                int i7 = i;
                for (int i8 = 0; i8 < this.f23744d.length; i8++) {
                    C7035e c7035e = this.f23744d[i8];
                    if (c7035e != null) {
                        i7 += C7640qw.m13935c(3, c7035e);
                    }
                }
                i = i7;
            }
            if (this.f23745e != null && this.f23745e.length > 0) {
                int i9 = i;
                for (int i10 = 0; i10 < this.f23745e.length; i10++) {
                    C7032b c7032b = this.f23745e[i10];
                    if (c7032b != null) {
                        i9 += C7640qw.m13935c(4, c7032b);
                    }
                }
                i = i9;
            }
            if (this.f23746f != null && this.f23746f.length > 0) {
                int i11 = i;
                for (int i12 = 0; i12 < this.f23746f.length; i12++) {
                    C7032b c7032b2 = this.f23746f[i12];
                    if (c7032b2 != null) {
                        i11 += C7640qw.m13935c(5, c7032b2);
                    }
                }
                i = i11;
            }
            if (this.f23747g != null && this.f23747g.length > 0) {
                int i13 = i;
                for (int i14 = 0; i14 < this.f23747g.length; i14++) {
                    C7032b c7032b3 = this.f23747g[i14];
                    if (c7032b3 != null) {
                        i13 += C7640qw.m13935c(6, c7032b3);
                    }
                }
                i = i13;
            }
            if (this.f23748h != null && this.f23748h.length > 0) {
                int i15 = i;
                for (int i16 = 0; i16 < this.f23748h.length; i16++) {
                    C7037g c7037g = this.f23748h[i16];
                    if (c7037g != null) {
                        i15 += C7640qw.m13935c(7, c7037g);
                    }
                }
                i = i15;
            }
            if (!this.f23749i.equals("")) {
                i += C7640qw.m13948b(9, this.f23749i);
            }
            if (!this.f23750j.equals("")) {
                i += C7640qw.m13948b(10, this.f23750j);
            }
            if (!this.f23751k.equals("0")) {
                i += C7640qw.m13948b(12, this.f23751k);
            }
            if (!this.f23752l.equals("")) {
                i += C7640qw.m13948b(13, this.f23752l);
            }
            if (this.f23753m != null) {
                i += C7640qw.m13935c(14, this.f23753m);
            }
            if (Float.floatToIntBits(this.f23754n) != Float.floatToIntBits(0.0f)) {
                i += C7640qw.m13952b(15, this.f23754n);
            }
            if (this.f23756p != null && this.f23756p.length > 0) {
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < this.f23756p.length; i19++) {
                    String str2 = this.f23756p[i19];
                    if (str2 != null) {
                        i18++;
                        i17 += C7640qw.m13942b(str2);
                    }
                }
                i = i + i17 + (i18 * 2);
            }
            if (this.f23757q != 0) {
                i += C7640qw.m13937c(17, this.f23757q);
            }
            if (this.f23755o) {
                i += C7640qw.m13947b(18, this.f23755o);
            }
            if (this.f23741a == null || this.f23741a.length <= 0) {
                return i;
            }
            int i20 = 0;
            int i21 = 0;
            for (int i22 = 0; i22 < this.f23741a.length; i22++) {
                String str3 = this.f23741a[i22];
                if (str3 != null) {
                    i21++;
                    i20 += C7640qw.m13942b(str3);
                }
            }
            return i + i20 + (i21 * 2);
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7036f mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        int m13839b = C7652rg.m13839b(c7639qv, 10);
                        int length = this.f23742b == null ? 0 : this.f23742b.length;
                        String[] strArr = new String[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f23742b, 0, strArr, 0, length);
                        }
                        while (length < strArr.length - 1) {
                            strArr[length] = c7639qv.m13993j();
                            c7639qv.m14015a();
                            length++;
                        }
                        strArr[length] = c7639qv.m13993j();
                        this.f23742b = strArr;
                        break;
                    case 18:
                        int m13839b2 = C7652rg.m13839b(c7639qv, 18);
                        int length2 = this.f23743c == null ? 0 : this.f23743c.length;
                        AbstractC7090hj.C7091a[] c7091aArr = new AbstractC7090hj.C7091a[m13839b2 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f23743c, 0, c7091aArr, 0, length2);
                        }
                        while (length2 < c7091aArr.length - 1) {
                            c7091aArr[length2] = new AbstractC7090hj.C7091a();
                            c7639qv.m14011a(c7091aArr[length2]);
                            c7639qv.m14015a();
                            length2++;
                        }
                        c7091aArr[length2] = new AbstractC7090hj.C7091a();
                        c7639qv.m14011a(c7091aArr[length2]);
                        this.f23743c = c7091aArr;
                        break;
                    case 26:
                        int m13839b3 = C7652rg.m13839b(c7639qv, 26);
                        int length3 = this.f23744d == null ? 0 : this.f23744d.length;
                        C7035e[] c7035eArr = new C7035e[m13839b3 + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.f23744d, 0, c7035eArr, 0, length3);
                        }
                        while (length3 < c7035eArr.length - 1) {
                            c7035eArr[length3] = new C7035e();
                            c7639qv.m14011a(c7035eArr[length3]);
                            c7639qv.m14015a();
                            length3++;
                        }
                        c7035eArr[length3] = new C7035e();
                        c7639qv.m14011a(c7035eArr[length3]);
                        this.f23744d = c7035eArr;
                        break;
                    case 34:
                        int m13839b4 = C7652rg.m13839b(c7639qv, 34);
                        int length4 = this.f23745e == null ? 0 : this.f23745e.length;
                        C7032b[] c7032bArr = new C7032b[m13839b4 + length4];
                        if (length4 != 0) {
                            System.arraycopy(this.f23745e, 0, c7032bArr, 0, length4);
                        }
                        while (length4 < c7032bArr.length - 1) {
                            c7032bArr[length4] = new C7032b();
                            c7639qv.m14011a(c7032bArr[length4]);
                            c7639qv.m14015a();
                            length4++;
                        }
                        c7032bArr[length4] = new C7032b();
                        c7639qv.m14011a(c7032bArr[length4]);
                        this.f23745e = c7032bArr;
                        break;
                    case 42:
                        int m13839b5 = C7652rg.m13839b(c7639qv, 42);
                        int length5 = this.f23746f == null ? 0 : this.f23746f.length;
                        C7032b[] c7032bArr2 = new C7032b[m13839b5 + length5];
                        if (length5 != 0) {
                            System.arraycopy(this.f23746f, 0, c7032bArr2, 0, length5);
                        }
                        while (length5 < c7032bArr2.length - 1) {
                            c7032bArr2[length5] = new C7032b();
                            c7639qv.m14011a(c7032bArr2[length5]);
                            c7639qv.m14015a();
                            length5++;
                        }
                        c7032bArr2[length5] = new C7032b();
                        c7639qv.m14011a(c7032bArr2[length5]);
                        this.f23746f = c7032bArr2;
                        break;
                    case 50:
                        int m13839b6 = C7652rg.m13839b(c7639qv, 50);
                        int length6 = this.f23747g == null ? 0 : this.f23747g.length;
                        C7032b[] c7032bArr3 = new C7032b[m13839b6 + length6];
                        if (length6 != 0) {
                            System.arraycopy(this.f23747g, 0, c7032bArr3, 0, length6);
                        }
                        while (length6 < c7032bArr3.length - 1) {
                            c7032bArr3[length6] = new C7032b();
                            c7639qv.m14011a(c7032bArr3[length6]);
                            c7639qv.m14015a();
                            length6++;
                        }
                        c7032bArr3[length6] = new C7032b();
                        c7639qv.m14011a(c7032bArr3[length6]);
                        this.f23747g = c7032bArr3;
                        break;
                    case 58:
                        int m13839b7 = C7652rg.m13839b(c7639qv, 58);
                        int length7 = this.f23748h == null ? 0 : this.f23748h.length;
                        C7037g[] c7037gArr = new C7037g[m13839b7 + length7];
                        if (length7 != 0) {
                            System.arraycopy(this.f23748h, 0, c7037gArr, 0, length7);
                        }
                        while (length7 < c7037gArr.length - 1) {
                            c7037gArr[length7] = new C7037g();
                            c7639qv.m14011a(c7037gArr[length7]);
                            c7639qv.m14015a();
                            length7++;
                        }
                        c7037gArr[length7] = new C7037g();
                        c7639qv.m14011a(c7037gArr[length7]);
                        this.f23748h = c7037gArr;
                        break;
                    case 74:
                        this.f23749i = c7639qv.m13993j();
                        break;
                    case 82:
                        this.f23750j = c7639qv.m13993j();
                        break;
                    case 98:
                        this.f23751k = c7639qv.m13993j();
                        break;
                    case 106:
                        this.f23752l = c7639qv.m13993j();
                        break;
                    case 114:
                        if (this.f23753m == null) {
                            this.f23753m = new C7031a();
                        }
                        c7639qv.m14011a(this.f23753m);
                        break;
                    case 125:
                        this.f23754n = c7639qv.m14003d();
                        break;
                    case 130:
                        int m13839b8 = C7652rg.m13839b(c7639qv, 130);
                        int length8 = this.f23756p == null ? 0 : this.f23756p.length;
                        String[] strArr2 = new String[m13839b8 + length8];
                        if (length8 != 0) {
                            System.arraycopy(this.f23756p, 0, strArr2, 0, length8);
                        }
                        while (length8 < strArr2.length - 1) {
                            strArr2[length8] = c7639qv.m13993j();
                            c7639qv.m14015a();
                            length8++;
                        }
                        strArr2[length8] = c7639qv.m13993j();
                        this.f23756p = strArr2;
                        break;
                    case 136:
                        this.f23757q = c7639qv.m13997g();
                        break;
                    case 144:
                        this.f23755o = c7639qv.m13994i();
                        break;
                    case 154:
                        int m13839b9 = C7652rg.m13839b(c7639qv, 154);
                        int length9 = this.f23741a == null ? 0 : this.f23741a.length;
                        String[] strArr3 = new String[m13839b9 + length9];
                        if (length9 != 0) {
                            System.arraycopy(this.f23741a, 0, strArr3, 0, length9);
                        }
                        while (length9 < strArr3.length - 1) {
                            strArr3[length9] = c7639qv.m13993j();
                            c7639qv.m14015a();
                            length9++;
                        }
                        strArr3[length9] = c7639qv.m13993j();
                        this.f23741a = strArr3;
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
            if (this.f23742b != null && this.f23742b.length > 0) {
                for (int i = 0; i < this.f23742b.length; i++) {
                    String str = this.f23742b[i];
                    if (str != null) {
                        c7640qw.m13970a(1, str);
                    }
                }
            }
            if (this.f23743c != null && this.f23743c.length > 0) {
                for (int i2 = 0; i2 < this.f23743c.length; i2++) {
                    AbstractC7090hj.C7091a c7091a = this.f23743c[i2];
                    if (c7091a != null) {
                        c7640qw.m13971a(2, c7091a);
                    }
                }
            }
            if (this.f23744d != null && this.f23744d.length > 0) {
                for (int i3 = 0; i3 < this.f23744d.length; i3++) {
                    C7035e c7035e = this.f23744d[i3];
                    if (c7035e != null) {
                        c7640qw.m13971a(3, c7035e);
                    }
                }
            }
            if (this.f23745e != null && this.f23745e.length > 0) {
                for (int i4 = 0; i4 < this.f23745e.length; i4++) {
                    C7032b c7032b = this.f23745e[i4];
                    if (c7032b != null) {
                        c7640qw.m13971a(4, c7032b);
                    }
                }
            }
            if (this.f23746f != null && this.f23746f.length > 0) {
                for (int i5 = 0; i5 < this.f23746f.length; i5++) {
                    C7032b c7032b2 = this.f23746f[i5];
                    if (c7032b2 != null) {
                        c7640qw.m13971a(5, c7032b2);
                    }
                }
            }
            if (this.f23747g != null && this.f23747g.length > 0) {
                for (int i6 = 0; i6 < this.f23747g.length; i6++) {
                    C7032b c7032b3 = this.f23747g[i6];
                    if (c7032b3 != null) {
                        c7640qw.m13971a(6, c7032b3);
                    }
                }
            }
            if (this.f23748h != null && this.f23748h.length > 0) {
                for (int i7 = 0; i7 < this.f23748h.length; i7++) {
                    C7037g c7037g = this.f23748h[i7];
                    if (c7037g != null) {
                        c7640qw.m13971a(7, c7037g);
                    }
                }
            }
            if (!this.f23749i.equals("")) {
                c7640qw.m13970a(9, this.f23749i);
            }
            if (!this.f23750j.equals("")) {
                c7640qw.m13970a(10, this.f23750j);
            }
            if (!this.f23751k.equals("0")) {
                c7640qw.m13970a(12, this.f23751k);
            }
            if (!this.f23752l.equals("")) {
                c7640qw.m13970a(13, this.f23752l);
            }
            if (this.f23753m != null) {
                c7640qw.m13971a(14, this.f23753m);
            }
            if (Float.floatToIntBits(this.f23754n) != Float.floatToIntBits(0.0f)) {
                c7640qw.m13974a(15, this.f23754n);
            }
            if (this.f23756p != null && this.f23756p.length > 0) {
                for (int i8 = 0; i8 < this.f23756p.length; i8++) {
                    String str2 = this.f23756p[i8];
                    if (str2 != null) {
                        c7640qw.m13970a(16, str2);
                    }
                }
            }
            if (this.f23757q != 0) {
                c7640qw.m13973a(17, this.f23757q);
            }
            if (this.f23755o) {
                c7640qw.m13969a(18, this.f23755o);
            }
            if (this.f23741a != null && this.f23741a.length > 0) {
                for (int i9 = 0; i9 < this.f23741a.length; i9++) {
                    String str3 = this.f23741a[i9];
                    if (str3 != null) {
                        c7640qw.m13970a(19, str3);
                    }
                }
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7036f m15733b() {
            this.f23741a = C7652rg.f25399f;
            this.f23742b = C7652rg.f25399f;
            this.f23743c = AbstractC7090hj.C7091a.m15599b();
            this.f23744d = C7035e.m15737b();
            this.f23745e = C7032b.m15745b();
            this.f23746f = C7032b.m15745b();
            this.f23747g = C7032b.m15745b();
            this.f23748h = C7037g.m15731b();
            this.f23749i = "";
            this.f23750j = "";
            this.f23751k = "0";
            this.f23752l = "";
            this.f23753m = null;
            this.f23754n = 0.0f;
            this.f23755o = false;
            this.f23756p = C7652rg.f25399f;
            this.f23757q = 0;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7036f)) {
                return false;
            }
            C7036f c7036f = (C7036f) obj;
            if (!C7647rb.m13867a(this.f23741a, c7036f.f23741a) || !C7647rb.m13867a(this.f23742b, c7036f.f23742b) || !C7647rb.m13867a(this.f23743c, c7036f.f23743c) || !C7647rb.m13867a(this.f23744d, c7036f.f23744d) || !C7647rb.m13867a(this.f23745e, c7036f.f23745e) || !C7647rb.m13867a(this.f23746f, c7036f.f23746f) || !C7647rb.m13867a(this.f23747g, c7036f.f23747g) || !C7647rb.m13867a(this.f23748h, c7036f.f23748h)) {
                return false;
            }
            if (this.f23749i == null) {
                if (c7036f.f23749i != null) {
                    return false;
                }
            } else if (!this.f23749i.equals(c7036f.f23749i)) {
                return false;
            }
            if (this.f23750j == null) {
                if (c7036f.f23750j != null) {
                    return false;
                }
            } else if (!this.f23750j.equals(c7036f.f23750j)) {
                return false;
            }
            if (this.f23751k == null) {
                if (c7036f.f23751k != null) {
                    return false;
                }
            } else if (!this.f23751k.equals(c7036f.f23751k)) {
                return false;
            }
            if (this.f23752l == null) {
                if (c7036f.f23752l != null) {
                    return false;
                }
            } else if (!this.f23752l.equals(c7036f.f23752l)) {
                return false;
            }
            if (this.f23753m == null) {
                if (c7036f.f23753m != null) {
                    return false;
                }
            } else if (!this.f23753m.equals(c7036f.f23753m)) {
                return false;
            }
            if (Float.floatToIntBits(this.f23754n) != Float.floatToIntBits(c7036f.f23754n) || this.f23755o != c7036f.f23755o || !C7647rb.m13867a(this.f23756p, c7036f.f23756p) || this.f23757q != c7036f.f23757q) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7036f.f25374ag == null || c7036f.f25374ag.m13887b() : this.f25374ag.equals(c7036f.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((((this.f23755o ? 1231 : 1237) + (((((this.f23753m == null ? 0 : this.f23753m.hashCode()) + (((this.f23752l == null ? 0 : this.f23752l.hashCode()) + (((this.f23751k == null ? 0 : this.f23751k.hashCode()) + (((this.f23750j == null ? 0 : this.f23750j.hashCode()) + (((this.f23749i == null ? 0 : this.f23749i.hashCode()) + ((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13868a(this.f23741a)) * 31) + C7647rb.m13868a(this.f23742b)) * 31) + C7647rb.m13868a(this.f23743c)) * 31) + C7647rb.m13868a(this.f23744d)) * 31) + C7647rb.m13868a(this.f23745e)) * 31) + C7647rb.m13868a(this.f23746f)) * 31) + C7647rb.m13868a(this.f23747g)) * 31) + C7647rb.m13868a(this.f23748h)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + Float.floatToIntBits(this.f23754n)) * 31)) * 31) + C7647rb.m13868a(this.f23756p)) * 31) + this.f23757q) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.gi$g */
    /* loaded from: classes2.dex */
    public static final class C7037g extends AbstractC7642qx<C7037g> {

        /* renamed from: k */
        private static volatile C7037g[] f23758k;

        /* renamed from: a */
        public int[] f23759a;

        /* renamed from: b */
        public int[] f23760b;

        /* renamed from: c */
        public int[] f23761c;

        /* renamed from: d */
        public int[] f23762d;

        /* renamed from: e */
        public int[] f23763e;

        /* renamed from: f */
        public int[] f23764f;

        /* renamed from: g */
        public int[] f23765g;

        /* renamed from: h */
        public int[] f23766h;

        /* renamed from: i */
        public int[] f23767i;

        /* renamed from: j */
        public int[] f23768j;

        public C7037g() {
            m15730c();
        }

        /* renamed from: b */
        public static C7037g[] m15731b() {
            if (f23758k == null) {
                synchronized (C7647rb.f25390c) {
                    if (f23758k == null) {
                        f23758k = new C7037g[0];
                    }
                }
            }
            return f23758k;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int i;
            int mo13820a = super.mo13820a();
            if (this.f23759a == null || this.f23759a.length <= 0) {
                i = mo13820a;
            } else {
                int i2 = 0;
                for (int i3 = 0; i3 < this.f23759a.length; i3++) {
                    i2 += C7640qw.m13938c(this.f23759a[i3]);
                }
                i = mo13820a + i2 + (this.f23759a.length * 1);
            }
            if (this.f23760b != null && this.f23760b.length > 0) {
                int i4 = 0;
                for (int i5 = 0; i5 < this.f23760b.length; i5++) {
                    i4 += C7640qw.m13938c(this.f23760b[i5]);
                }
                i = i + i4 + (this.f23760b.length * 1);
            }
            if (this.f23761c != null && this.f23761c.length > 0) {
                int i6 = 0;
                for (int i7 = 0; i7 < this.f23761c.length; i7++) {
                    i6 += C7640qw.m13938c(this.f23761c[i7]);
                }
                i = i + i6 + (this.f23761c.length * 1);
            }
            if (this.f23762d != null && this.f23762d.length > 0) {
                int i8 = 0;
                for (int i9 = 0; i9 < this.f23762d.length; i9++) {
                    i8 += C7640qw.m13938c(this.f23762d[i9]);
                }
                i = i + i8 + (this.f23762d.length * 1);
            }
            if (this.f23763e != null && this.f23763e.length > 0) {
                int i10 = 0;
                for (int i11 = 0; i11 < this.f23763e.length; i11++) {
                    i10 += C7640qw.m13938c(this.f23763e[i11]);
                }
                i = i + i10 + (this.f23763e.length * 1);
            }
            if (this.f23764f != null && this.f23764f.length > 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < this.f23764f.length; i13++) {
                    i12 += C7640qw.m13938c(this.f23764f[i13]);
                }
                i = i + i12 + (this.f23764f.length * 1);
            }
            if (this.f23765g != null && this.f23765g.length > 0) {
                int i14 = 0;
                for (int i15 = 0; i15 < this.f23765g.length; i15++) {
                    i14 += C7640qw.m13938c(this.f23765g[i15]);
                }
                i = i + i14 + (this.f23765g.length * 1);
            }
            if (this.f23766h != null && this.f23766h.length > 0) {
                int i16 = 0;
                for (int i17 = 0; i17 < this.f23766h.length; i17++) {
                    i16 += C7640qw.m13938c(this.f23766h[i17]);
                }
                i = i + i16 + (this.f23766h.length * 1);
            }
            if (this.f23767i != null && this.f23767i.length > 0) {
                int i18 = 0;
                for (int i19 = 0; i19 < this.f23767i.length; i19++) {
                    i18 += C7640qw.m13938c(this.f23767i[i19]);
                }
                i = i + i18 + (this.f23767i.length * 1);
            }
            if (this.f23768j == null || this.f23768j.length <= 0) {
                return i;
            }
            int i20 = 0;
            for (int i21 = 0; i21 < this.f23768j.length; i21++) {
                i20 += C7640qw.m13938c(this.f23768j[i21]);
            }
            return i + i20 + (this.f23768j.length * 1);
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7037g mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        int m13839b = C7652rg.m13839b(c7639qv, 8);
                        int length = this.f23759a == null ? 0 : this.f23759a.length;
                        int[] iArr = new int[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f23759a, 0, iArr, 0, length);
                        }
                        while (length < iArr.length - 1) {
                            iArr[length] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length++;
                        }
                        iArr[length] = c7639qv.m13997g();
                        this.f23759a = iArr;
                        break;
                    case 10:
                        int m14002d = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t = c7639qv.m13983t();
                        int i = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i++;
                        }
                        c7639qv.m13998f(m13983t);
                        int length2 = this.f23759a == null ? 0 : this.f23759a.length;
                        int[] iArr2 = new int[i + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f23759a, 0, iArr2, 0, length2);
                        }
                        while (length2 < iArr2.length) {
                            iArr2[length2] = c7639qv.m13997g();
                            length2++;
                        }
                        this.f23759a = iArr2;
                        c7639qv.m14000e(m14002d);
                        break;
                    case 16:
                        int m13839b2 = C7652rg.m13839b(c7639qv, 16);
                        int length3 = this.f23760b == null ? 0 : this.f23760b.length;
                        int[] iArr3 = new int[m13839b2 + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.f23760b, 0, iArr3, 0, length3);
                        }
                        while (length3 < iArr3.length - 1) {
                            iArr3[length3] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length3++;
                        }
                        iArr3[length3] = c7639qv.m13997g();
                        this.f23760b = iArr3;
                        break;
                    case 18:
                        int m14002d2 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t2 = c7639qv.m13983t();
                        int i2 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i2++;
                        }
                        c7639qv.m13998f(m13983t2);
                        int length4 = this.f23760b == null ? 0 : this.f23760b.length;
                        int[] iArr4 = new int[i2 + length4];
                        if (length4 != 0) {
                            System.arraycopy(this.f23760b, 0, iArr4, 0, length4);
                        }
                        while (length4 < iArr4.length) {
                            iArr4[length4] = c7639qv.m13997g();
                            length4++;
                        }
                        this.f23760b = iArr4;
                        c7639qv.m14000e(m14002d2);
                        break;
                    case 24:
                        int m13839b3 = C7652rg.m13839b(c7639qv, 24);
                        int length5 = this.f23761c == null ? 0 : this.f23761c.length;
                        int[] iArr5 = new int[m13839b3 + length5];
                        if (length5 != 0) {
                            System.arraycopy(this.f23761c, 0, iArr5, 0, length5);
                        }
                        while (length5 < iArr5.length - 1) {
                            iArr5[length5] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length5++;
                        }
                        iArr5[length5] = c7639qv.m13997g();
                        this.f23761c = iArr5;
                        break;
                    case 26:
                        int m14002d3 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t3 = c7639qv.m13983t();
                        int i3 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i3++;
                        }
                        c7639qv.m13998f(m13983t3);
                        int length6 = this.f23761c == null ? 0 : this.f23761c.length;
                        int[] iArr6 = new int[i3 + length6];
                        if (length6 != 0) {
                            System.arraycopy(this.f23761c, 0, iArr6, 0, length6);
                        }
                        while (length6 < iArr6.length) {
                            iArr6[length6] = c7639qv.m13997g();
                            length6++;
                        }
                        this.f23761c = iArr6;
                        c7639qv.m14000e(m14002d3);
                        break;
                    case 32:
                        int m13839b4 = C7652rg.m13839b(c7639qv, 32);
                        int length7 = this.f23762d == null ? 0 : this.f23762d.length;
                        int[] iArr7 = new int[m13839b4 + length7];
                        if (length7 != 0) {
                            System.arraycopy(this.f23762d, 0, iArr7, 0, length7);
                        }
                        while (length7 < iArr7.length - 1) {
                            iArr7[length7] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length7++;
                        }
                        iArr7[length7] = c7639qv.m13997g();
                        this.f23762d = iArr7;
                        break;
                    case 34:
                        int m14002d4 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t4 = c7639qv.m13983t();
                        int i4 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i4++;
                        }
                        c7639qv.m13998f(m13983t4);
                        int length8 = this.f23762d == null ? 0 : this.f23762d.length;
                        int[] iArr8 = new int[i4 + length8];
                        if (length8 != 0) {
                            System.arraycopy(this.f23762d, 0, iArr8, 0, length8);
                        }
                        while (length8 < iArr8.length) {
                            iArr8[length8] = c7639qv.m13997g();
                            length8++;
                        }
                        this.f23762d = iArr8;
                        c7639qv.m14000e(m14002d4);
                        break;
                    case 40:
                        int m13839b5 = C7652rg.m13839b(c7639qv, 40);
                        int length9 = this.f23763e == null ? 0 : this.f23763e.length;
                        int[] iArr9 = new int[m13839b5 + length9];
                        if (length9 != 0) {
                            System.arraycopy(this.f23763e, 0, iArr9, 0, length9);
                        }
                        while (length9 < iArr9.length - 1) {
                            iArr9[length9] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length9++;
                        }
                        iArr9[length9] = c7639qv.m13997g();
                        this.f23763e = iArr9;
                        break;
                    case 42:
                        int m14002d5 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t5 = c7639qv.m13983t();
                        int i5 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i5++;
                        }
                        c7639qv.m13998f(m13983t5);
                        int length10 = this.f23763e == null ? 0 : this.f23763e.length;
                        int[] iArr10 = new int[i5 + length10];
                        if (length10 != 0) {
                            System.arraycopy(this.f23763e, 0, iArr10, 0, length10);
                        }
                        while (length10 < iArr10.length) {
                            iArr10[length10] = c7639qv.m13997g();
                            length10++;
                        }
                        this.f23763e = iArr10;
                        c7639qv.m14000e(m14002d5);
                        break;
                    case 48:
                        int m13839b6 = C7652rg.m13839b(c7639qv, 48);
                        int length11 = this.f23764f == null ? 0 : this.f23764f.length;
                        int[] iArr11 = new int[m13839b6 + length11];
                        if (length11 != 0) {
                            System.arraycopy(this.f23764f, 0, iArr11, 0, length11);
                        }
                        while (length11 < iArr11.length - 1) {
                            iArr11[length11] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length11++;
                        }
                        iArr11[length11] = c7639qv.m13997g();
                        this.f23764f = iArr11;
                        break;
                    case 50:
                        int m14002d6 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t6 = c7639qv.m13983t();
                        int i6 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i6++;
                        }
                        c7639qv.m13998f(m13983t6);
                        int length12 = this.f23764f == null ? 0 : this.f23764f.length;
                        int[] iArr12 = new int[i6 + length12];
                        if (length12 != 0) {
                            System.arraycopy(this.f23764f, 0, iArr12, 0, length12);
                        }
                        while (length12 < iArr12.length) {
                            iArr12[length12] = c7639qv.m13997g();
                            length12++;
                        }
                        this.f23764f = iArr12;
                        c7639qv.m14000e(m14002d6);
                        break;
                    case 56:
                        int m13839b7 = C7652rg.m13839b(c7639qv, 56);
                        int length13 = this.f23765g == null ? 0 : this.f23765g.length;
                        int[] iArr13 = new int[m13839b7 + length13];
                        if (length13 != 0) {
                            System.arraycopy(this.f23765g, 0, iArr13, 0, length13);
                        }
                        while (length13 < iArr13.length - 1) {
                            iArr13[length13] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length13++;
                        }
                        iArr13[length13] = c7639qv.m13997g();
                        this.f23765g = iArr13;
                        break;
                    case 58:
                        int m14002d7 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t7 = c7639qv.m13983t();
                        int i7 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i7++;
                        }
                        c7639qv.m13998f(m13983t7);
                        int length14 = this.f23765g == null ? 0 : this.f23765g.length;
                        int[] iArr14 = new int[i7 + length14];
                        if (length14 != 0) {
                            System.arraycopy(this.f23765g, 0, iArr14, 0, length14);
                        }
                        while (length14 < iArr14.length) {
                            iArr14[length14] = c7639qv.m13997g();
                            length14++;
                        }
                        this.f23765g = iArr14;
                        c7639qv.m14000e(m14002d7);
                        break;
                    case 64:
                        int m13839b8 = C7652rg.m13839b(c7639qv, 64);
                        int length15 = this.f23766h == null ? 0 : this.f23766h.length;
                        int[] iArr15 = new int[m13839b8 + length15];
                        if (length15 != 0) {
                            System.arraycopy(this.f23766h, 0, iArr15, 0, length15);
                        }
                        while (length15 < iArr15.length - 1) {
                            iArr15[length15] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length15++;
                        }
                        iArr15[length15] = c7639qv.m13997g();
                        this.f23766h = iArr15;
                        break;
                    case 66:
                        int m14002d8 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t8 = c7639qv.m13983t();
                        int i8 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i8++;
                        }
                        c7639qv.m13998f(m13983t8);
                        int length16 = this.f23766h == null ? 0 : this.f23766h.length;
                        int[] iArr16 = new int[i8 + length16];
                        if (length16 != 0) {
                            System.arraycopy(this.f23766h, 0, iArr16, 0, length16);
                        }
                        while (length16 < iArr16.length) {
                            iArr16[length16] = c7639qv.m13997g();
                            length16++;
                        }
                        this.f23766h = iArr16;
                        c7639qv.m14000e(m14002d8);
                        break;
                    case 72:
                        int m13839b9 = C7652rg.m13839b(c7639qv, 72);
                        int length17 = this.f23767i == null ? 0 : this.f23767i.length;
                        int[] iArr17 = new int[m13839b9 + length17];
                        if (length17 != 0) {
                            System.arraycopy(this.f23767i, 0, iArr17, 0, length17);
                        }
                        while (length17 < iArr17.length - 1) {
                            iArr17[length17] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length17++;
                        }
                        iArr17[length17] = c7639qv.m13997g();
                        this.f23767i = iArr17;
                        break;
                    case 74:
                        int m14002d9 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t9 = c7639qv.m13983t();
                        int i9 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i9++;
                        }
                        c7639qv.m13998f(m13983t9);
                        int length18 = this.f23767i == null ? 0 : this.f23767i.length;
                        int[] iArr18 = new int[i9 + length18];
                        if (length18 != 0) {
                            System.arraycopy(this.f23767i, 0, iArr18, 0, length18);
                        }
                        while (length18 < iArr18.length) {
                            iArr18[length18] = c7639qv.m13997g();
                            length18++;
                        }
                        this.f23767i = iArr18;
                        c7639qv.m14000e(m14002d9);
                        break;
                    case 80:
                        int m13839b10 = C7652rg.m13839b(c7639qv, 80);
                        int length19 = this.f23768j == null ? 0 : this.f23768j.length;
                        int[] iArr19 = new int[m13839b10 + length19];
                        if (length19 != 0) {
                            System.arraycopy(this.f23768j, 0, iArr19, 0, length19);
                        }
                        while (length19 < iArr19.length - 1) {
                            iArr19[length19] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length19++;
                        }
                        iArr19[length19] = c7639qv.m13997g();
                        this.f23768j = iArr19;
                        break;
                    case 82:
                        int m14002d10 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t10 = c7639qv.m13983t();
                        int i10 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i10++;
                        }
                        c7639qv.m13998f(m13983t10);
                        int length20 = this.f23768j == null ? 0 : this.f23768j.length;
                        int[] iArr20 = new int[i10 + length20];
                        if (length20 != 0) {
                            System.arraycopy(this.f23768j, 0, iArr20, 0, length20);
                        }
                        while (length20 < iArr20.length) {
                            iArr20[length20] = c7639qv.m13997g();
                            length20++;
                        }
                        this.f23768j = iArr20;
                        c7639qv.m14000e(m14002d10);
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
            if (this.f23759a != null && this.f23759a.length > 0) {
                for (int i = 0; i < this.f23759a.length; i++) {
                    c7640qw.m13973a(1, this.f23759a[i]);
                }
            }
            if (this.f23760b != null && this.f23760b.length > 0) {
                for (int i2 = 0; i2 < this.f23760b.length; i2++) {
                    c7640qw.m13973a(2, this.f23760b[i2]);
                }
            }
            if (this.f23761c != null && this.f23761c.length > 0) {
                for (int i3 = 0; i3 < this.f23761c.length; i3++) {
                    c7640qw.m13973a(3, this.f23761c[i3]);
                }
            }
            if (this.f23762d != null && this.f23762d.length > 0) {
                for (int i4 = 0; i4 < this.f23762d.length; i4++) {
                    c7640qw.m13973a(4, this.f23762d[i4]);
                }
            }
            if (this.f23763e != null && this.f23763e.length > 0) {
                for (int i5 = 0; i5 < this.f23763e.length; i5++) {
                    c7640qw.m13973a(5, this.f23763e[i5]);
                }
            }
            if (this.f23764f != null && this.f23764f.length > 0) {
                for (int i6 = 0; i6 < this.f23764f.length; i6++) {
                    c7640qw.m13973a(6, this.f23764f[i6]);
                }
            }
            if (this.f23765g != null && this.f23765g.length > 0) {
                for (int i7 = 0; i7 < this.f23765g.length; i7++) {
                    c7640qw.m13973a(7, this.f23765g[i7]);
                }
            }
            if (this.f23766h != null && this.f23766h.length > 0) {
                for (int i8 = 0; i8 < this.f23766h.length; i8++) {
                    c7640qw.m13973a(8, this.f23766h[i8]);
                }
            }
            if (this.f23767i != null && this.f23767i.length > 0) {
                for (int i9 = 0; i9 < this.f23767i.length; i9++) {
                    c7640qw.m13973a(9, this.f23767i[i9]);
                }
            }
            if (this.f23768j != null && this.f23768j.length > 0) {
                for (int i10 = 0; i10 < this.f23768j.length; i10++) {
                    c7640qw.m13973a(10, this.f23768j[i10]);
                }
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C7037g m15730c() {
            this.f23759a = C7652rg.f25394a;
            this.f23760b = C7652rg.f25394a;
            this.f23761c = C7652rg.f25394a;
            this.f23762d = C7652rg.f25394a;
            this.f23763e = C7652rg.f25394a;
            this.f23764f = C7652rg.f25394a;
            this.f23765g = C7652rg.f25394a;
            this.f23766h = C7652rg.f25394a;
            this.f23767i = C7652rg.f25394a;
            this.f23768j = C7652rg.f25394a;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7037g)) {
                return false;
            }
            C7037g c7037g = (C7037g) obj;
            if (!C7647rb.m13871a(this.f23759a, c7037g.f23759a) || !C7647rb.m13871a(this.f23760b, c7037g.f23760b) || !C7647rb.m13871a(this.f23761c, c7037g.f23761c) || !C7647rb.m13871a(this.f23762d, c7037g.f23762d) || !C7647rb.m13871a(this.f23763e, c7037g.f23763e) || !C7647rb.m13871a(this.f23764f, c7037g.f23764f) || !C7647rb.m13871a(this.f23765g, c7037g.f23765g) || !C7647rb.m13871a(this.f23766h, c7037g.f23766h) || !C7647rb.m13871a(this.f23767i, c7037g.f23767i) || !C7647rb.m13871a(this.f23768j, c7037g.f23768j)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7037g.f25374ag == null || c7037g.f25374ag.m13887b() : this.f25374ag.equals(c7037g.f25374ag);
        }

        public int hashCode() {
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13872a(this.f23759a)) * 31) + C7647rb.m13872a(this.f23760b)) * 31) + C7647rb.m13872a(this.f23761c)) * 31) + C7647rb.m13872a(this.f23762d)) * 31) + C7647rb.m13872a(this.f23763e)) * 31) + C7647rb.m13872a(this.f23764f)) * 31) + C7647rb.m13872a(this.f23765g)) * 31) + C7647rb.m13872a(this.f23766h)) * 31) + C7647rb.m13872a(this.f23767i)) * 31) + C7647rb.m13872a(this.f23768j)) * 31);
        }
    }

    /* renamed from: com.google.android.gms.internal.gi$h */
    /* loaded from: classes2.dex */
    public static final class C7038h extends AbstractC7642qx<C7038h> {

        /* renamed from: a */
        public static final C7643qy<AbstractC7090hj.C7091a, C7038h> f23769a = C7643qy.m13904a(11, C7038h.class, 810);

        /* renamed from: i */
        private static final C7038h[] f23770i = new C7038h[0];

        /* renamed from: b */
        public int[] f23771b;

        /* renamed from: c */
        public int[] f23772c;

        /* renamed from: d */
        public int[] f23773d;

        /* renamed from: e */
        public int f23774e;

        /* renamed from: f */
        public int[] f23775f;

        /* renamed from: g */
        public int f23776g;

        /* renamed from: h */
        public int f23777h;

        public C7038h() {
            m15728b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int i;
            int mo13820a = super.mo13820a();
            if (this.f23771b == null || this.f23771b.length <= 0) {
                i = mo13820a;
            } else {
                int i2 = 0;
                for (int i3 = 0; i3 < this.f23771b.length; i3++) {
                    i2 += C7640qw.m13938c(this.f23771b[i3]);
                }
                i = mo13820a + i2 + (this.f23771b.length * 1);
            }
            if (this.f23772c != null && this.f23772c.length > 0) {
                int i4 = 0;
                for (int i5 = 0; i5 < this.f23772c.length; i5++) {
                    i4 += C7640qw.m13938c(this.f23772c[i5]);
                }
                i = i + i4 + (this.f23772c.length * 1);
            }
            if (this.f23773d != null && this.f23773d.length > 0) {
                int i6 = 0;
                for (int i7 = 0; i7 < this.f23773d.length; i7++) {
                    i6 += C7640qw.m13938c(this.f23773d[i7]);
                }
                i = i + i6 + (this.f23773d.length * 1);
            }
            if (this.f23774e != 0) {
                i += C7640qw.m13937c(4, this.f23774e);
            }
            if (this.f23775f != null && this.f23775f.length > 0) {
                int i8 = 0;
                for (int i9 = 0; i9 < this.f23775f.length; i9++) {
                    i8 += C7640qw.m13938c(this.f23775f[i9]);
                }
                i = i + i8 + (this.f23775f.length * 1);
            }
            if (this.f23776g != 0) {
                i += C7640qw.m13937c(6, this.f23776g);
            }
            return this.f23777h != 0 ? i + C7640qw.m13937c(7, this.f23777h) : i;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7038h mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        int m13839b = C7652rg.m13839b(c7639qv, 8);
                        int length = this.f23771b == null ? 0 : this.f23771b.length;
                        int[] iArr = new int[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f23771b, 0, iArr, 0, length);
                        }
                        while (length < iArr.length - 1) {
                            iArr[length] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length++;
                        }
                        iArr[length] = c7639qv.m13997g();
                        this.f23771b = iArr;
                        break;
                    case 10:
                        int m14002d = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t = c7639qv.m13983t();
                        int i = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i++;
                        }
                        c7639qv.m13998f(m13983t);
                        int length2 = this.f23771b == null ? 0 : this.f23771b.length;
                        int[] iArr2 = new int[i + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f23771b, 0, iArr2, 0, length2);
                        }
                        while (length2 < iArr2.length) {
                            iArr2[length2] = c7639qv.m13997g();
                            length2++;
                        }
                        this.f23771b = iArr2;
                        c7639qv.m14000e(m14002d);
                        break;
                    case 16:
                        int m13839b2 = C7652rg.m13839b(c7639qv, 16);
                        int length3 = this.f23772c == null ? 0 : this.f23772c.length;
                        int[] iArr3 = new int[m13839b2 + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.f23772c, 0, iArr3, 0, length3);
                        }
                        while (length3 < iArr3.length - 1) {
                            iArr3[length3] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length3++;
                        }
                        iArr3[length3] = c7639qv.m13997g();
                        this.f23772c = iArr3;
                        break;
                    case 18:
                        int m14002d2 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t2 = c7639qv.m13983t();
                        int i2 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i2++;
                        }
                        c7639qv.m13998f(m13983t2);
                        int length4 = this.f23772c == null ? 0 : this.f23772c.length;
                        int[] iArr4 = new int[i2 + length4];
                        if (length4 != 0) {
                            System.arraycopy(this.f23772c, 0, iArr4, 0, length4);
                        }
                        while (length4 < iArr4.length) {
                            iArr4[length4] = c7639qv.m13997g();
                            length4++;
                        }
                        this.f23772c = iArr4;
                        c7639qv.m14000e(m14002d2);
                        break;
                    case 24:
                        int m13839b3 = C7652rg.m13839b(c7639qv, 24);
                        int length5 = this.f23773d == null ? 0 : this.f23773d.length;
                        int[] iArr5 = new int[m13839b3 + length5];
                        if (length5 != 0) {
                            System.arraycopy(this.f23773d, 0, iArr5, 0, length5);
                        }
                        while (length5 < iArr5.length - 1) {
                            iArr5[length5] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length5++;
                        }
                        iArr5[length5] = c7639qv.m13997g();
                        this.f23773d = iArr5;
                        break;
                    case 26:
                        int m14002d3 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t3 = c7639qv.m13983t();
                        int i3 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i3++;
                        }
                        c7639qv.m13998f(m13983t3);
                        int length6 = this.f23773d == null ? 0 : this.f23773d.length;
                        int[] iArr6 = new int[i3 + length6];
                        if (length6 != 0) {
                            System.arraycopy(this.f23773d, 0, iArr6, 0, length6);
                        }
                        while (length6 < iArr6.length) {
                            iArr6[length6] = c7639qv.m13997g();
                            length6++;
                        }
                        this.f23773d = iArr6;
                        c7639qv.m14000e(m14002d3);
                        break;
                    case 32:
                        this.f23774e = c7639qv.m13997g();
                        break;
                    case 40:
                        int m13839b4 = C7652rg.m13839b(c7639qv, 40);
                        int length7 = this.f23775f == null ? 0 : this.f23775f.length;
                        int[] iArr7 = new int[m13839b4 + length7];
                        if (length7 != 0) {
                            System.arraycopy(this.f23775f, 0, iArr7, 0, length7);
                        }
                        while (length7 < iArr7.length - 1) {
                            iArr7[length7] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length7++;
                        }
                        iArr7[length7] = c7639qv.m13997g();
                        this.f23775f = iArr7;
                        break;
                    case 42:
                        int m14002d4 = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t4 = c7639qv.m13983t();
                        int i4 = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i4++;
                        }
                        c7639qv.m13998f(m13983t4);
                        int length8 = this.f23775f == null ? 0 : this.f23775f.length;
                        int[] iArr8 = new int[i4 + length8];
                        if (length8 != 0) {
                            System.arraycopy(this.f23775f, 0, iArr8, 0, length8);
                        }
                        while (length8 < iArr8.length) {
                            iArr8[length8] = c7639qv.m13997g();
                            length8++;
                        }
                        this.f23775f = iArr8;
                        c7639qv.m14000e(m14002d4);
                        break;
                    case 48:
                        this.f23776g = c7639qv.m13997g();
                        break;
                    case 56:
                        this.f23777h = c7639qv.m13997g();
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
            if (this.f23771b != null && this.f23771b.length > 0) {
                for (int i = 0; i < this.f23771b.length; i++) {
                    c7640qw.m13973a(1, this.f23771b[i]);
                }
            }
            if (this.f23772c != null && this.f23772c.length > 0) {
                for (int i2 = 0; i2 < this.f23772c.length; i2++) {
                    c7640qw.m13973a(2, this.f23772c[i2]);
                }
            }
            if (this.f23773d != null && this.f23773d.length > 0) {
                for (int i3 = 0; i3 < this.f23773d.length; i3++) {
                    c7640qw.m13973a(3, this.f23773d[i3]);
                }
            }
            if (this.f23774e != 0) {
                c7640qw.m13973a(4, this.f23774e);
            }
            if (this.f23775f != null && this.f23775f.length > 0) {
                for (int i4 = 0; i4 < this.f23775f.length; i4++) {
                    c7640qw.m13973a(5, this.f23775f[i4]);
                }
            }
            if (this.f23776g != 0) {
                c7640qw.m13973a(6, this.f23776g);
            }
            if (this.f23777h != 0) {
                c7640qw.m13973a(7, this.f23777h);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7038h m15728b() {
            this.f23771b = C7652rg.f25394a;
            this.f23772c = C7652rg.f25394a;
            this.f23773d = C7652rg.f25394a;
            this.f23774e = 0;
            this.f23775f = C7652rg.f25394a;
            this.f23776g = 0;
            this.f23777h = 0;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7038h)) {
                return false;
            }
            C7038h c7038h = (C7038h) obj;
            if (!C7647rb.m13871a(this.f23771b, c7038h.f23771b) || !C7647rb.m13871a(this.f23772c, c7038h.f23772c) || !C7647rb.m13871a(this.f23773d, c7038h.f23773d) || this.f23774e != c7038h.f23774e || !C7647rb.m13871a(this.f23775f, c7038h.f23775f) || this.f23776g != c7038h.f23776g || this.f23777h != c7038h.f23777h) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7038h.f25374ag == null || c7038h.f25374ag.m13887b() : this.f25374ag.equals(c7038h.f25374ag);
        }

        public int hashCode() {
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((((((((((((((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13872a(this.f23771b)) * 31) + C7647rb.m13872a(this.f23772c)) * 31) + C7647rb.m13872a(this.f23773d)) * 31) + this.f23774e) * 31) + C7647rb.m13872a(this.f23775f)) * 31) + this.f23776g) * 31) + this.f23777h) * 31);
        }
    }

    /* renamed from: com.google.android.gms.internal.gi$i */
    /* loaded from: classes2.dex */
    public static final class C7039i extends AbstractC7642qx<C7039i> {

        /* renamed from: d */
        private static volatile C7039i[] f23778d;

        /* renamed from: a */
        public String f23779a;

        /* renamed from: b */
        public AbstractC7090hj.C7091a f23780b;

        /* renamed from: c */
        public C7034d f23781c;

        public C7039i() {
            m15725c();
        }

        /* renamed from: b */
        public static C7039i[] m15726b() {
            if (f23778d == null) {
                synchronized (C7647rb.f25390c) {
                    if (f23778d == null) {
                        f23778d = new C7039i[0];
                    }
                }
            }
            return f23778d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (!this.f23779a.equals("")) {
                mo13820a += C7640qw.m13948b(1, this.f23779a);
            }
            if (this.f23780b != null) {
                mo13820a += C7640qw.m13935c(2, this.f23780b);
            }
            return this.f23781c != null ? mo13820a + C7640qw.m13935c(3, this.f23781c) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7039i mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f23779a = c7639qv.m13993j();
                        break;
                    case 18:
                        if (this.f23780b == null) {
                            this.f23780b = new AbstractC7090hj.C7091a();
                        }
                        c7639qv.m14011a(this.f23780b);
                        break;
                    case 26:
                        if (this.f23781c == null) {
                            this.f23781c = new C7034d();
                        }
                        c7639qv.m14011a(this.f23781c);
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
            if (!this.f23779a.equals("")) {
                c7640qw.m13970a(1, this.f23779a);
            }
            if (this.f23780b != null) {
                c7640qw.m13971a(2, this.f23780b);
            }
            if (this.f23781c != null) {
                c7640qw.m13971a(3, this.f23781c);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C7039i m15725c() {
            this.f23779a = "";
            this.f23780b = null;
            this.f23781c = null;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7039i)) {
                return false;
            }
            C7039i c7039i = (C7039i) obj;
            if (this.f23779a == null) {
                if (c7039i.f23779a != null) {
                    return false;
                }
            } else if (!this.f23779a.equals(c7039i.f23779a)) {
                return false;
            }
            if (this.f23780b == null) {
                if (c7039i.f23780b != null) {
                    return false;
                }
            } else if (!this.f23780b.equals(c7039i.f23780b)) {
                return false;
            }
            if (this.f23781c == null) {
                if (c7039i.f23781c != null) {
                    return false;
                }
            } else if (!this.f23781c.equals(c7039i.f23781c)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7039i.f25374ag == null || c7039i.f25374ag.m13887b() : this.f25374ag.equals(c7039i.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f23781c == null ? 0 : this.f23781c.hashCode()) + (((this.f23780b == null ? 0 : this.f23780b.hashCode()) + (((this.f23779a == null ? 0 : this.f23779a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.gi$j */
    /* loaded from: classes2.dex */
    public static final class C7040j extends AbstractC7642qx<C7040j> {

        /* renamed from: a */
        public C7039i[] f23782a;

        /* renamed from: b */
        public C7036f f23783b;

        /* renamed from: c */
        public String f23784c;

        public C7040j() {
            m15722b();
        }

        /* renamed from: a */
        public static C7040j m15723a(byte[] bArr) {
            return (C7040j) AbstractC7649rd.m13856a(new C7040j(), bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f23782a != null && this.f23782a.length > 0) {
                for (int i = 0; i < this.f23782a.length; i++) {
                    C7039i c7039i = this.f23782a[i];
                    if (c7039i != null) {
                        mo13820a += C7640qw.m13935c(1, c7039i);
                    }
                }
            }
            if (this.f23783b != null) {
                mo13820a += C7640qw.m13935c(2, this.f23783b);
            }
            return !this.f23784c.equals("") ? mo13820a + C7640qw.m13948b(3, this.f23784c) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7040j mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        int m13839b = C7652rg.m13839b(c7639qv, 10);
                        int length = this.f23782a == null ? 0 : this.f23782a.length;
                        C7039i[] c7039iArr = new C7039i[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f23782a, 0, c7039iArr, 0, length);
                        }
                        while (length < c7039iArr.length - 1) {
                            c7039iArr[length] = new C7039i();
                            c7639qv.m14011a(c7039iArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c7039iArr[length] = new C7039i();
                        c7639qv.m14011a(c7039iArr[length]);
                        this.f23782a = c7039iArr;
                        break;
                    case 18:
                        if (this.f23783b == null) {
                            this.f23783b = new C7036f();
                        }
                        c7639qv.m14011a(this.f23783b);
                        break;
                    case 26:
                        this.f23784c = c7639qv.m13993j();
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
            if (this.f23782a != null && this.f23782a.length > 0) {
                for (int i = 0; i < this.f23782a.length; i++) {
                    C7039i c7039i = this.f23782a[i];
                    if (c7039i != null) {
                        c7640qw.m13971a(1, c7039i);
                    }
                }
            }
            if (this.f23783b != null) {
                c7640qw.m13971a(2, this.f23783b);
            }
            if (!this.f23784c.equals("")) {
                c7640qw.m13970a(3, this.f23784c);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7040j m15722b() {
            this.f23782a = C7039i.m15726b();
            this.f23783b = null;
            this.f23784c = "";
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7040j)) {
                return false;
            }
            C7040j c7040j = (C7040j) obj;
            if (!C7647rb.m13867a(this.f23782a, c7040j.f23782a)) {
                return false;
            }
            if (this.f23783b == null) {
                if (c7040j.f23783b != null) {
                    return false;
                }
            } else if (!this.f23783b.equals(c7040j.f23783b)) {
                return false;
            }
            if (this.f23784c == null) {
                if (c7040j.f23784c != null) {
                    return false;
                }
            } else if (!this.f23784c.equals(c7040j.f23784c)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7040j.f25374ag == null || c7040j.f25374ag.m13887b() : this.f25374ag.equals(c7040j.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f23784c == null ? 0 : this.f23784c.hashCode()) + (((this.f23783b == null ? 0 : this.f23783b.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13868a(this.f23782a)) * 31)) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }
}
