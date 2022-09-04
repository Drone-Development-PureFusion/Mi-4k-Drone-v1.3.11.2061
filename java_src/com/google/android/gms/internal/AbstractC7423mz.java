package com.google.android.gms.internal;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.mz */
/* loaded from: classes2.dex */
public interface AbstractC7423mz {

    /* renamed from: com.google.android.gms.internal.mz$a */
    /* loaded from: classes2.dex */
    public static final class C7424a extends AbstractC7642qx<C7424a> {

        /* renamed from: a */
        public C7427d[] f24866a;

        /* renamed from: b */
        public long f24867b;

        public C7424a() {
            m14519b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f24866a != null && this.f24866a.length > 0) {
                for (int i = 0; i < this.f24866a.length; i++) {
                    C7427d c7427d = this.f24866a[i];
                    if (c7427d != null) {
                        mo13820a += C7640qw.m13935c(1, c7427d);
                    }
                }
            }
            return this.f24867b != 0 ? mo13820a + C7640qw.m13917g(2, this.f24867b) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7424a mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        int m13839b = C7652rg.m13839b(c7639qv, 10);
                        int length = this.f24866a == null ? 0 : this.f24866a.length;
                        C7427d[] c7427dArr = new C7427d[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f24866a, 0, c7427dArr, 0, length);
                        }
                        while (length < c7427dArr.length - 1) {
                            c7427dArr[length] = new C7427d();
                            c7639qv.m14011a(c7427dArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c7427dArr[length] = new C7427d();
                        c7639qv.m14011a(c7427dArr[length]);
                        this.f24866a = c7427dArr;
                        break;
                    case 17:
                        this.f24867b = c7639qv.m13995h();
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
            if (this.f24866a != null && this.f24866a.length > 0) {
                for (int i = 0; i < this.f24866a.length; i++) {
                    C7427d c7427d = this.f24866a[i];
                    if (c7427d != null) {
                        c7640qw.m13971a(1, c7427d);
                    }
                }
            }
            if (this.f24867b != 0) {
                c7640qw.m13936c(2, this.f24867b);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7424a m14519b() {
            this.f24866a = C7427d.m14512b();
            this.f24867b = 0L;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7424a)) {
                return false;
            }
            C7424a c7424a = (C7424a) obj;
            if (!C7647rb.m13867a(this.f24866a, c7424a.f24866a) || this.f24867b != c7424a.f24867b) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7424a.f25374ag == null || c7424a.f25374ag.m13887b() : this.f25374ag.equals(c7424a.f25374ag);
        }

        public int hashCode() {
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13868a(this.f24866a)) * 31) + ((int) (this.f24867b ^ (this.f24867b >>> 32)))) * 31);
        }
    }

    /* renamed from: com.google.android.gms.internal.mz$b */
    /* loaded from: classes2.dex */
    public static final class C7425b extends AbstractC7642qx<C7425b> {

        /* renamed from: c */
        private static volatile C7425b[] f24868c;

        /* renamed from: a */
        public String f24869a;

        /* renamed from: b */
        public byte[] f24870b;

        public C7425b() {
            m14516c();
        }

        /* renamed from: b */
        public static C7425b[] m14517b() {
            if (f24868c == null) {
                synchronized (C7647rb.f25390c) {
                    if (f24868c == null) {
                        f24868c = new C7425b[0];
                    }
                }
            }
            return f24868c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (!this.f24869a.equals("")) {
                mo13820a += C7640qw.m13948b(1, this.f24869a);
            }
            return !Arrays.equals(this.f24870b, C7652rg.f25401h) ? mo13820a + C7640qw.m13946b(2, this.f24870b) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7425b mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f24869a = c7639qv.m13993j();
                        break;
                    case 18:
                        this.f24870b = c7639qv.m13992k();
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
            if (!this.f24869a.equals("")) {
                c7640qw.m13970a(1, this.f24869a);
            }
            if (!Arrays.equals(this.f24870b, C7652rg.f25401h)) {
                c7640qw.m13968a(2, this.f24870b);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C7425b m14516c() {
            this.f24869a = "";
            this.f24870b = C7652rg.f25401h;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7425b)) {
                return false;
            }
            C7425b c7425b = (C7425b) obj;
            if (this.f24869a == null) {
                if (c7425b.f24869a != null) {
                    return false;
                }
            } else if (!this.f24869a.equals(c7425b.f24869a)) {
                return false;
            }
            if (!Arrays.equals(this.f24870b, c7425b.f24870b)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7425b.f25374ag == null || c7425b.f25374ag.m13887b() : this.f25374ag.equals(c7425b.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.f24869a == null ? 0 : this.f24869a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + Arrays.hashCode(this.f24870b)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.mz$c */
    /* loaded from: classes2.dex */
    public static final class C7426c extends AbstractC7642qx<C7426c> {

        /* renamed from: a */
        public int f24871a;

        /* renamed from: b */
        public boolean f24872b;

        public C7426c() {
            m14514b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f24871a != 0) {
                mo13820a += C7640qw.m13937c(1, this.f24871a);
            }
            return this.f24872b ? mo13820a + C7640qw.m13947b(2, this.f24872b) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7426c mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f24871a = c7639qv.m13997g();
                        break;
                    case 16:
                        this.f24872b = c7639qv.m13994i();
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
            if (this.f24871a != 0) {
                c7640qw.m13973a(1, this.f24871a);
            }
            if (this.f24872b) {
                c7640qw.m13969a(2, this.f24872b);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7426c m14514b() {
            this.f24871a = 0;
            this.f24872b = false;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7426c)) {
                return false;
            }
            C7426c c7426c = (C7426c) obj;
            if (this.f24871a != c7426c.f24871a || this.f24872b != c7426c.f24872b) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7426c.f25374ag == null || c7426c.f25374ag.m13887b() : this.f25374ag.equals(c7426c.f25374ag);
        }

        public int hashCode() {
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + (((this.f24872b ? 1231 : 1237) + ((((getClass().getName().hashCode() + 527) * 31) + this.f24871a) * 31)) * 31);
        }
    }

    /* renamed from: com.google.android.gms.internal.mz$d */
    /* loaded from: classes2.dex */
    public static final class C7427d extends AbstractC7642qx<C7427d> {

        /* renamed from: c */
        private static volatile C7427d[] f24873c;

        /* renamed from: a */
        public String f24874a;

        /* renamed from: b */
        public C7425b[] f24875b;

        public C7427d() {
            m14511c();
        }

        /* renamed from: b */
        public static C7427d[] m14512b() {
            if (f24873c == null) {
                synchronized (C7647rb.f25390c) {
                    if (f24873c == null) {
                        f24873c = new C7427d[0];
                    }
                }
            }
            return f24873c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (!this.f24874a.equals("")) {
                mo13820a += C7640qw.m13948b(1, this.f24874a);
            }
            if (this.f24875b == null || this.f24875b.length <= 0) {
                return mo13820a;
            }
            int i = mo13820a;
            for (int i2 = 0; i2 < this.f24875b.length; i2++) {
                C7425b c7425b = this.f24875b[i2];
                if (c7425b != null) {
                    i += C7640qw.m13935c(2, c7425b);
                }
            }
            return i;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7427d mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f24874a = c7639qv.m13993j();
                        break;
                    case 18:
                        int m13839b = C7652rg.m13839b(c7639qv, 18);
                        int length = this.f24875b == null ? 0 : this.f24875b.length;
                        C7425b[] c7425bArr = new C7425b[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f24875b, 0, c7425bArr, 0, length);
                        }
                        while (length < c7425bArr.length - 1) {
                            c7425bArr[length] = new C7425b();
                            c7639qv.m14011a(c7425bArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c7425bArr[length] = new C7425b();
                        c7639qv.m14011a(c7425bArr[length]);
                        this.f24875b = c7425bArr;
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
            if (!this.f24874a.equals("")) {
                c7640qw.m13970a(1, this.f24874a);
            }
            if (this.f24875b != null && this.f24875b.length > 0) {
                for (int i = 0; i < this.f24875b.length; i++) {
                    C7425b c7425b = this.f24875b[i];
                    if (c7425b != null) {
                        c7640qw.m13971a(2, c7425b);
                    }
                }
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C7427d m14511c() {
            this.f24874a = "";
            this.f24875b = C7425b.m14517b();
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7427d)) {
                return false;
            }
            C7427d c7427d = (C7427d) obj;
            if (this.f24874a == null) {
                if (c7427d.f24874a != null) {
                    return false;
                }
            } else if (!this.f24874a.equals(c7427d.f24874a)) {
                return false;
            }
            if (!C7647rb.m13867a(this.f24875b, c7427d.f24875b)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7427d.f25374ag == null || c7427d.f25374ag.m13887b() : this.f25374ag.equals(c7427d.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.f24874a == null ? 0 : this.f24874a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + C7647rb.m13868a(this.f24875b)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.mz$e */
    /* loaded from: classes2.dex */
    public static final class C7428e extends AbstractC7642qx<C7428e> {

        /* renamed from: a */
        public C7424a f24876a;

        /* renamed from: b */
        public C7424a f24877b;

        /* renamed from: c */
        public C7424a f24878c;

        /* renamed from: d */
        public C7426c f24879d;

        /* renamed from: e */
        public C7429f[] f24880e;

        public C7428e() {
            m14509b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f24876a != null) {
                mo13820a += C7640qw.m13935c(1, this.f24876a);
            }
            if (this.f24877b != null) {
                mo13820a += C7640qw.m13935c(2, this.f24877b);
            }
            if (this.f24878c != null) {
                mo13820a += C7640qw.m13935c(3, this.f24878c);
            }
            if (this.f24879d != null) {
                mo13820a += C7640qw.m13935c(4, this.f24879d);
            }
            if (this.f24880e == null || this.f24880e.length <= 0) {
                return mo13820a;
            }
            int i = mo13820a;
            for (int i2 = 0; i2 < this.f24880e.length; i2++) {
                C7429f c7429f = this.f24880e[i2];
                if (c7429f != null) {
                    i += C7640qw.m13935c(5, c7429f);
                }
            }
            return i;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7428e mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        if (this.f24876a == null) {
                            this.f24876a = new C7424a();
                        }
                        c7639qv.m14011a(this.f24876a);
                        break;
                    case 18:
                        if (this.f24877b == null) {
                            this.f24877b = new C7424a();
                        }
                        c7639qv.m14011a(this.f24877b);
                        break;
                    case 26:
                        if (this.f24878c == null) {
                            this.f24878c = new C7424a();
                        }
                        c7639qv.m14011a(this.f24878c);
                        break;
                    case 34:
                        if (this.f24879d == null) {
                            this.f24879d = new C7426c();
                        }
                        c7639qv.m14011a(this.f24879d);
                        break;
                    case 42:
                        int m13839b = C7652rg.m13839b(c7639qv, 42);
                        int length = this.f24880e == null ? 0 : this.f24880e.length;
                        C7429f[] c7429fArr = new C7429f[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f24880e, 0, c7429fArr, 0, length);
                        }
                        while (length < c7429fArr.length - 1) {
                            c7429fArr[length] = new C7429f();
                            c7639qv.m14011a(c7429fArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c7429fArr[length] = new C7429f();
                        c7639qv.m14011a(c7429fArr[length]);
                        this.f24880e = c7429fArr;
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
            if (this.f24876a != null) {
                c7640qw.m13971a(1, this.f24876a);
            }
            if (this.f24877b != null) {
                c7640qw.m13971a(2, this.f24877b);
            }
            if (this.f24878c != null) {
                c7640qw.m13971a(3, this.f24878c);
            }
            if (this.f24879d != null) {
                c7640qw.m13971a(4, this.f24879d);
            }
            if (this.f24880e != null && this.f24880e.length > 0) {
                for (int i = 0; i < this.f24880e.length; i++) {
                    C7429f c7429f = this.f24880e[i];
                    if (c7429f != null) {
                        c7640qw.m13971a(5, c7429f);
                    }
                }
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7428e m14509b() {
            this.f24876a = null;
            this.f24877b = null;
            this.f24878c = null;
            this.f24879d = null;
            this.f24880e = C7429f.m14507b();
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7428e)) {
                return false;
            }
            C7428e c7428e = (C7428e) obj;
            if (this.f24876a == null) {
                if (c7428e.f24876a != null) {
                    return false;
                }
            } else if (!this.f24876a.equals(c7428e.f24876a)) {
                return false;
            }
            if (this.f24877b == null) {
                if (c7428e.f24877b != null) {
                    return false;
                }
            } else if (!this.f24877b.equals(c7428e.f24877b)) {
                return false;
            }
            if (this.f24878c == null) {
                if (c7428e.f24878c != null) {
                    return false;
                }
            } else if (!this.f24878c.equals(c7428e.f24878c)) {
                return false;
            }
            if (this.f24879d == null) {
                if (c7428e.f24879d != null) {
                    return false;
                }
            } else if (!this.f24879d.equals(c7428e.f24879d)) {
                return false;
            }
            if (!C7647rb.m13867a(this.f24880e, c7428e.f24880e)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7428e.f25374ag == null || c7428e.f25374ag.m13887b() : this.f25374ag.equals(c7428e.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.f24879d == null ? 0 : this.f24879d.hashCode()) + (((this.f24878c == null ? 0 : this.f24878c.hashCode()) + (((this.f24877b == null ? 0 : this.f24877b.hashCode()) + (((this.f24876a == null ? 0 : this.f24876a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31) + C7647rb.m13868a(this.f24880e)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.mz$f */
    /* loaded from: classes2.dex */
    public static final class C7429f extends AbstractC7642qx<C7429f> {

        /* renamed from: d */
        private static volatile C7429f[] f24881d;

        /* renamed from: a */
        public int f24882a;

        /* renamed from: b */
        public long f24883b;

        /* renamed from: c */
        public String f24884c;

        public C7429f() {
            m14506c();
        }

        /* renamed from: b */
        public static C7429f[] m14507b() {
            if (f24881d == null) {
                synchronized (C7647rb.f25390c) {
                    if (f24881d == null) {
                        f24881d = new C7429f[0];
                    }
                }
            }
            return f24881d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f24882a != 0) {
                mo13820a += C7640qw.m13937c(1, this.f24882a);
            }
            if (this.f24883b != 0) {
                mo13820a += C7640qw.m13917g(2, this.f24883b);
            }
            return !this.f24884c.equals("") ? mo13820a + C7640qw.m13948b(3, this.f24884c) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7429f mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f24882a = c7639qv.m13997g();
                        break;
                    case 17:
                        this.f24883b = c7639qv.m13995h();
                        break;
                    case 26:
                        this.f24884c = c7639qv.m13993j();
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
            if (this.f24882a != 0) {
                c7640qw.m13973a(1, this.f24882a);
            }
            if (this.f24883b != 0) {
                c7640qw.m13936c(2, this.f24883b);
            }
            if (!this.f24884c.equals("")) {
                c7640qw.m13970a(3, this.f24884c);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C7429f m14506c() {
            this.f24882a = 0;
            this.f24883b = 0L;
            this.f24884c = "";
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7429f)) {
                return false;
            }
            C7429f c7429f = (C7429f) obj;
            if (this.f24882a != c7429f.f24882a || this.f24883b != c7429f.f24883b) {
                return false;
            }
            if (this.f24884c == null) {
                if (c7429f.f24884c != null) {
                    return false;
                }
            } else if (!this.f24884c.equals(c7429f.f24884c)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7429f.f25374ag == null || c7429f.f25374ag.m13887b() : this.f25374ag.equals(c7429f.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f24884c == null ? 0 : this.f24884c.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + this.f24882a) * 31) + ((int) (this.f24883b ^ (this.f24883b >>> 32)))) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }
}
