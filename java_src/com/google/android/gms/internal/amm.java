package com.google.android.gms.internal;

import com.google.firebase.p253b.C9755a;
/* loaded from: classes2.dex */
public interface amm {

    /* renamed from: com.google.android.gms.internal.amm$a */
    /* loaded from: classes2.dex */
    public static final class C6570a extends AbstractC7642qx<C6570a> {

        /* renamed from: a */
        public C6571a[] f22285a;

        /* renamed from: com.google.android.gms.internal.amm$a$a */
        /* loaded from: classes2.dex */
        public static final class C6571a extends AbstractC7642qx<C6571a> {

            /* renamed from: d */
            private static volatile C6571a[] f22286d;

            /* renamed from: a */
            public String f22287a;

            /* renamed from: b */
            public String f22288b;

            /* renamed from: c */
            public int f22289c;

            public C6571a() {
                m16784c();
            }

            /* renamed from: b */
            public static C6571a[] m16785b() {
                if (f22286d == null) {
                    synchronized (C7647rb.f25390c) {
                        if (f22286d == null) {
                            f22286d = new C6571a[0];
                        }
                    }
                }
                return f22286d;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
            /* renamed from: a */
            public int mo13820a() {
                int mo13820a = super.mo13820a();
                if (!this.f22287a.equals("")) {
                    mo13820a += C7640qw.m13948b(1, this.f22287a);
                }
                if (!this.f22288b.equals("")) {
                    mo13820a += C7640qw.m13948b(2, this.f22288b);
                }
                return this.f22289c != 0 ? mo13820a + C7640qw.m13937c(3, this.f22289c) : mo13820a;
            }

            @Override // com.google.android.gms.internal.AbstractC7649rd
            /* renamed from: a */
            public C6571a mo13816b(C7639qv c7639qv) {
                while (true) {
                    int m14015a = c7639qv.m14015a();
                    switch (m14015a) {
                        case 0:
                            break;
                        case 10:
                            this.f22287a = c7639qv.m13993j();
                            break;
                        case 18:
                            this.f22288b = c7639qv.m13993j();
                            break;
                        case 24:
                            this.f22289c = c7639qv.m13997g();
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
                if (!this.f22287a.equals("")) {
                    c7640qw.m13970a(1, this.f22287a);
                }
                if (!this.f22288b.equals("")) {
                    c7640qw.m13970a(2, this.f22288b);
                }
                if (this.f22289c != 0) {
                    c7640qw.m13973a(3, this.f22289c);
                }
                super.mo13818a(c7640qw);
            }

            /* renamed from: c */
            public C6571a m16784c() {
                this.f22287a = "";
                this.f22288b = "";
                this.f22289c = 0;
                this.f25374ag = null;
                this.f25391ah = -1;
                return this;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof C6571a)) {
                    return false;
                }
                C6571a c6571a = (C6571a) obj;
                if (this.f22287a == null) {
                    if (c6571a.f22287a != null) {
                        return false;
                    }
                } else if (!this.f22287a.equals(c6571a.f22287a)) {
                    return false;
                }
                if (this.f22288b == null) {
                    if (c6571a.f22288b != null) {
                        return false;
                    }
                } else if (!this.f22288b.equals(c6571a.f22288b)) {
                    return false;
                }
                if (this.f22289c != c6571a.f22289c) {
                    return false;
                }
                return (this.f25374ag == null || this.f25374ag.m13887b()) ? c6571a.f25374ag == null || c6571a.f25374ag.m13887b() : this.f25374ag.equals(c6571a.f25374ag);
            }

            public int hashCode() {
                int i = 0;
                int hashCode = ((((this.f22288b == null ? 0 : this.f22288b.hashCode()) + (((this.f22287a == null ? 0 : this.f22287a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31) + this.f22289c) * 31;
                if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                    i = this.f25374ag.hashCode();
                }
                return hashCode + i;
            }
        }

        public C6570a() {
            m16787b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22285a != null && this.f22285a.length > 0) {
                for (int i = 0; i < this.f22285a.length; i++) {
                    C6571a c6571a = this.f22285a[i];
                    if (c6571a != null) {
                        mo13820a += C7640qw.m13935c(1, c6571a);
                    }
                }
            }
            return mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6570a mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        int m13839b = C7652rg.m13839b(c7639qv, 10);
                        int length = this.f22285a == null ? 0 : this.f22285a.length;
                        C6571a[] c6571aArr = new C6571a[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f22285a, 0, c6571aArr, 0, length);
                        }
                        while (length < c6571aArr.length - 1) {
                            c6571aArr[length] = new C6571a();
                            c7639qv.m14011a(c6571aArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c6571aArr[length] = new C6571a();
                        c7639qv.m14011a(c6571aArr[length]);
                        this.f22285a = c6571aArr;
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
            if (this.f22285a != null && this.f22285a.length > 0) {
                for (int i = 0; i < this.f22285a.length; i++) {
                    C6571a c6571a = this.f22285a[i];
                    if (c6571a != null) {
                        c7640qw.m13971a(1, c6571a);
                    }
                }
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C6570a m16787b() {
            this.f22285a = C6571a.m16785b();
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6570a)) {
                return false;
            }
            C6570a c6570a = (C6570a) obj;
            if (!C7647rb.m13867a(this.f22285a, c6570a.f22285a)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c6570a.f25374ag == null || c6570a.f25374ag.m13887b() : this.f25374ag.equals(c6570a.f25374ag);
        }

        public int hashCode() {
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + C7647rb.m13868a(this.f22285a)) * 31);
        }
    }

    /* renamed from: com.google.android.gms.internal.amm$b */
    /* loaded from: classes2.dex */
    public static final class C6572b extends AbstractC7642qx<C6572b> {

        /* renamed from: c */
        private static volatile C6572b[] f22290c;

        /* renamed from: a */
        public String f22291a;

        /* renamed from: b */
        public C6574d f22292b;

        public C6572b() {
            m16781c();
        }

        /* renamed from: b */
        public static C6572b[] m16782b() {
            if (f22290c == null) {
                synchronized (C7647rb.f25390c) {
                    if (f22290c == null) {
                        f22290c = new C6572b[0];
                    }
                }
            }
            return f22290c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (!this.f22291a.equals("")) {
                mo13820a += C7640qw.m13948b(1, this.f22291a);
            }
            return this.f22292b != null ? mo13820a + C7640qw.m13935c(2, this.f22292b) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6572b mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f22291a = c7639qv.m13993j();
                        break;
                    case 18:
                        if (this.f22292b == null) {
                            this.f22292b = new C6574d();
                        }
                        c7639qv.m14011a(this.f22292b);
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
            if (!this.f22291a.equals("")) {
                c7640qw.m13970a(1, this.f22291a);
            }
            if (this.f22292b != null) {
                c7640qw.m13971a(2, this.f22292b);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C6572b m16781c() {
            this.f22291a = "";
            this.f22292b = null;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6572b)) {
                return false;
            }
            C6572b c6572b = (C6572b) obj;
            if (this.f22291a == null) {
                if (c6572b.f22291a != null) {
                    return false;
                }
            } else if (!this.f22291a.equals(c6572b.f22291a)) {
                return false;
            }
            if (this.f22292b == null) {
                if (c6572b.f22292b != null) {
                    return false;
                }
            } else if (!this.f22292b.equals(c6572b.f22292b)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c6572b.f25374ag == null || c6572b.f25374ag.m13887b() : this.f25374ag.equals(c6572b.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f22292b == null ? 0 : this.f22292b.hashCode()) + (((this.f22291a == null ? 0 : this.f22291a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.amm$c */
    /* loaded from: classes2.dex */
    public static final class C6573c extends AbstractC7642qx<C6573c> {

        /* renamed from: a */
        public String f22293a;

        /* renamed from: b */
        public C6572b[] f22294b;

        public C6573c() {
            m16779b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (!this.f22293a.equals("")) {
                mo13820a += C7640qw.m13948b(1, this.f22293a);
            }
            if (this.f22294b == null || this.f22294b.length <= 0) {
                return mo13820a;
            }
            int i = mo13820a;
            for (int i2 = 0; i2 < this.f22294b.length; i2++) {
                C6572b c6572b = this.f22294b[i2];
                if (c6572b != null) {
                    i += C7640qw.m13935c(2, c6572b);
                }
            }
            return i;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6573c mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f22293a = c7639qv.m13993j();
                        break;
                    case 18:
                        int m13839b = C7652rg.m13839b(c7639qv, 18);
                        int length = this.f22294b == null ? 0 : this.f22294b.length;
                        C6572b[] c6572bArr = new C6572b[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f22294b, 0, c6572bArr, 0, length);
                        }
                        while (length < c6572bArr.length - 1) {
                            c6572bArr[length] = new C6572b();
                            c7639qv.m14011a(c6572bArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c6572bArr[length] = new C6572b();
                        c7639qv.m14011a(c6572bArr[length]);
                        this.f22294b = c6572bArr;
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
            if (!this.f22293a.equals("")) {
                c7640qw.m13970a(1, this.f22293a);
            }
            if (this.f22294b != null && this.f22294b.length > 0) {
                for (int i = 0; i < this.f22294b.length; i++) {
                    C6572b c6572b = this.f22294b[i];
                    if (c6572b != null) {
                        c7640qw.m13971a(2, c6572b);
                    }
                }
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C6573c m16779b() {
            this.f22293a = "";
            this.f22294b = C6572b.m16782b();
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6573c)) {
                return false;
            }
            C6573c c6573c = (C6573c) obj;
            if (this.f22293a == null) {
                if (c6573c.f22293a != null) {
                    return false;
                }
            } else if (!this.f22293a.equals(c6573c.f22293a)) {
                return false;
            }
            if (!C7647rb.m13867a(this.f22294b, c6573c.f22294b)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c6573c.f25374ag == null || c6573c.f25374ag.m13887b() : this.f25374ag.equals(c6573c.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((this.f22293a == null ? 0 : this.f22293a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + C7647rb.m13868a(this.f22294b)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.amm$d */
    /* loaded from: classes2.dex */
    public static final class C6574d extends AbstractC7642qx<C6574d> {

        /* renamed from: a */
        public boolean f22295a;

        /* renamed from: b */
        public String f22296b;

        /* renamed from: c */
        public long f22297c;

        /* renamed from: d */
        public double f22298d;

        /* renamed from: e */
        public C6573c f22299e;

        public C6574d() {
            m16777b();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22295a) {
                mo13820a += C7640qw.m13947b(1, this.f22295a);
            }
            if (!this.f22296b.equals("")) {
                mo13820a += C7640qw.m13948b(2, this.f22296b);
            }
            if (this.f22297c != 0) {
                mo13820a += C7640qw.m13920f(3, this.f22297c);
            }
            if (Double.doubleToLongBits(this.f22298d) != Double.doubleToLongBits(C9755a.f30449c)) {
                mo13820a += C7640qw.m13953b(4, this.f22298d);
            }
            return this.f22299e != null ? mo13820a + C7640qw.m13935c(5, this.f22299e) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6574d mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f22295a = c7639qv.m13994i();
                        break;
                    case 18:
                        this.f22296b = c7639qv.m13993j();
                        break;
                    case 24:
                        this.f22297c = c7639qv.m13999f();
                        break;
                    case 33:
                        this.f22298d = c7639qv.m14005c();
                        break;
                    case 42:
                        if (this.f22299e == null) {
                            this.f22299e = new C6573c();
                        }
                        c7639qv.m14011a(this.f22299e);
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
            if (this.f22295a) {
                c7640qw.m13969a(1, this.f22295a);
            }
            if (!this.f22296b.equals("")) {
                c7640qw.m13970a(2, this.f22296b);
            }
            if (this.f22297c != 0) {
                c7640qw.m13950b(3, this.f22297c);
            }
            if (Double.doubleToLongBits(this.f22298d) != Double.doubleToLongBits(C9755a.f30449c)) {
                c7640qw.m13975a(4, this.f22298d);
            }
            if (this.f22299e != null) {
                c7640qw.m13971a(5, this.f22299e);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C6574d m16777b() {
            this.f22295a = false;
            this.f22296b = "";
            this.f22297c = 0L;
            this.f22298d = C9755a.f30449c;
            this.f22299e = null;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6574d)) {
                return false;
            }
            C6574d c6574d = (C6574d) obj;
            if (this.f22295a != c6574d.f22295a) {
                return false;
            }
            if (this.f22296b == null) {
                if (c6574d.f22296b != null) {
                    return false;
                }
            } else if (!this.f22296b.equals(c6574d.f22296b)) {
                return false;
            }
            if (this.f22297c != c6574d.f22297c || Double.doubleToLongBits(this.f22298d) != Double.doubleToLongBits(c6574d.f22298d)) {
                return false;
            }
            if (this.f22299e == null) {
                if (c6574d.f22299e != null) {
                    return false;
                }
            } else if (!this.f22299e.equals(c6574d.f22299e)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c6574d.f25374ag == null || c6574d.f25374ag.m13887b() : this.f25374ag.equals(c6574d.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = (((this.f22296b == null ? 0 : this.f22296b.hashCode()) + (((this.f22295a ? 1231 : 1237) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31) + ((int) (this.f22297c ^ (this.f22297c >>> 32)));
            long doubleToLongBits = Double.doubleToLongBits(this.f22298d);
            int hashCode2 = ((this.f22299e == null ? 0 : this.f22299e.hashCode()) + (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode2 + i;
        }
    }
}
