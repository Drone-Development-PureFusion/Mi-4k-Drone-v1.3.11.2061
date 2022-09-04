package com.google.android.gms.internal;

import com.google.android.gms.games.C5375d;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.qf */
/* loaded from: classes2.dex */
public interface AbstractC7617qf {

    /* renamed from: com.google.android.gms.internal.qf$a */
    /* loaded from: classes2.dex */
    public static final class C7618a extends AbstractC7642qx<C7618a> {

        /* renamed from: a */
        public int f25278a;

        /* renamed from: b */
        public long f25279b;

        public C7618a() {
            m14059b();
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        protected int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f25278a != 0) {
                mo13820a += C7640qw.m13937c(1, this.f25278a);
            }
            return this.f25279b != 0 ? mo13820a + C7640qw.m13920f(2, this.f25279b) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7618a mo13816b(C7639qv c7639qv) {
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
                                this.f25278a = m13997g;
                                continue;
                        }
                    case 16:
                        this.f25279b = c7639qv.m13999f();
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
            if (this.f25278a != 0) {
                c7640qw.m13973a(1, this.f25278a);
            }
            if (this.f25279b != 0) {
                c7640qw.m13950b(2, this.f25279b);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7618a m14059b() {
            this.f25278a = 0;
            this.f25279b = 0L;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7618a)) {
                return false;
            }
            C7618a c7618a = (C7618a) obj;
            if (this.f25278a != c7618a.f25278a || this.f25279b != c7618a.f25279b) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7618a.f25374ag == null || c7618a.f25374ag.m13887b() : this.f25374ag.equals(c7618a.f25374ag);
        }

        public int hashCode() {
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + this.f25278a) * 31) + ((int) (this.f25279b ^ (this.f25279b >>> 32)))) * 31);
        }
    }

    /* renamed from: com.google.android.gms.internal.qf$b */
    /* loaded from: classes2.dex */
    public static final class C7619b extends AbstractC7642qx<C7619b> {

        /* renamed from: a */
        public long f25280a;

        /* renamed from: b */
        public int f25281b;

        /* renamed from: c */
        public C7621c f25282c;

        /* renamed from: d */
        public C7622d f25283d;

        /* renamed from: e */
        public C7623e f25284e;

        /* renamed from: f */
        public C7618a f25285f;

        /* renamed from: g */
        public C7620a f25286g;

        /* renamed from: com.google.android.gms.internal.qf$b$a */
        /* loaded from: classes2.dex */
        public static final class C7620a extends AbstractC7642qx<C7620a> {

            /* renamed from: a */
            public String f25287a;

            /* renamed from: b */
            public String f25288b;

            /* renamed from: c */
            public String f25289c;

            public C7620a() {
                m14054b();
            }

            @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
            /* renamed from: a */
            protected int mo13820a() {
                int mo13820a = super.mo13820a();
                if (!this.f25287a.equals("")) {
                    mo13820a += C7640qw.m13948b(1, this.f25287a);
                }
                if (!this.f25288b.equals("")) {
                    mo13820a += C7640qw.m13948b(2, this.f25288b);
                }
                return !this.f25289c.equals("") ? mo13820a + C7640qw.m13948b(3, this.f25289c) : mo13820a;
            }

            @Override // com.google.android.gms.internal.AbstractC7649rd
            /* renamed from: a */
            public C7620a mo13816b(C7639qv c7639qv) {
                while (true) {
                    int m14015a = c7639qv.m14015a();
                    switch (m14015a) {
                        case 0:
                            break;
                        case 10:
                            this.f25287a = c7639qv.m13993j();
                            break;
                        case 18:
                            this.f25288b = c7639qv.m13993j();
                            break;
                        case 26:
                            this.f25289c = c7639qv.m13993j();
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
                if (!this.f25287a.equals("")) {
                    c7640qw.m13970a(1, this.f25287a);
                }
                if (!this.f25288b.equals("")) {
                    c7640qw.m13970a(2, this.f25288b);
                }
                if (!this.f25289c.equals("")) {
                    c7640qw.m13970a(3, this.f25289c);
                }
                super.mo13818a(c7640qw);
            }

            /* renamed from: b */
            public C7620a m14054b() {
                this.f25287a = "";
                this.f25288b = "";
                this.f25289c = "";
                this.f25374ag = null;
                this.f25391ah = -1;
                return this;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof C7620a)) {
                    return false;
                }
                C7620a c7620a = (C7620a) obj;
                if (this.f25287a == null) {
                    if (c7620a.f25287a != null) {
                        return false;
                    }
                } else if (!this.f25287a.equals(c7620a.f25287a)) {
                    return false;
                }
                if (this.f25288b == null) {
                    if (c7620a.f25288b != null) {
                        return false;
                    }
                } else if (!this.f25288b.equals(c7620a.f25288b)) {
                    return false;
                }
                if (this.f25289c == null) {
                    if (c7620a.f25289c != null) {
                        return false;
                    }
                } else if (!this.f25289c.equals(c7620a.f25289c)) {
                    return false;
                }
                return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7620a.f25374ag == null || c7620a.f25374ag.m13887b() : this.f25374ag.equals(c7620a.f25374ag);
            }

            public int hashCode() {
                int i = 0;
                int hashCode = ((this.f25289c == null ? 0 : this.f25289c.hashCode()) + (((this.f25288b == null ? 0 : this.f25288b.hashCode()) + (((this.f25287a == null ? 0 : this.f25287a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31)) * 31;
                if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                    i = this.f25374ag.hashCode();
                }
                return hashCode + i;
            }
        }

        public C7619b() {
            m14056b();
        }

        /* renamed from: a */
        public static C7619b m14057a(byte[] bArr) {
            return (C7619b) AbstractC7649rd.m13856a(new C7619b(), bArr);
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        protected int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f25280a != 0) {
                mo13820a += C7640qw.m13920f(1, this.f25280a);
            }
            if (this.f25281b != 0) {
                mo13820a += C7640qw.m13937c(2, this.f25281b);
            }
            if (this.f25282c != null) {
                mo13820a += C7640qw.m13935c(3, this.f25282c);
            }
            if (this.f25283d != null) {
                mo13820a += C7640qw.m13935c(4, this.f25283d);
            }
            if (this.f25284e != null) {
                mo13820a += C7640qw.m13935c(5, this.f25284e);
            }
            if (this.f25285f != null) {
                mo13820a += C7640qw.m13935c(6, this.f25285f);
            }
            return this.f25286g != null ? mo13820a + C7640qw.m13935c(7, this.f25286g) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7619b mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f25280a = c7639qv.m13999f();
                        break;
                    case 16:
                        int m13997g = c7639qv.m13997g();
                        switch (m13997g) {
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
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 10000:
                            case 10001:
                            case C5375d.f19452b /* 10002 */:
                            case C5375d.f19453c /* 10003 */:
                            case C5375d.f19454d /* 10004 */:
                            case C5375d.f19455e /* 10005 */:
                            case C5375d.f19456f /* 10006 */:
                            case C5375d.f19457g /* 10007 */:
                            case C5375d.f19458h /* 10008 */:
                            case 10009:
                            case 99999:
                                this.f25281b = m13997g;
                                continue;
                        }
                    case 26:
                        if (this.f25282c == null) {
                            this.f25282c = new C7621c();
                        }
                        c7639qv.m14011a(this.f25282c);
                        break;
                    case 34:
                        if (this.f25283d == null) {
                            this.f25283d = new C7622d();
                        }
                        c7639qv.m14011a(this.f25283d);
                        break;
                    case 42:
                        if (this.f25284e == null) {
                            this.f25284e = new C7623e();
                        }
                        c7639qv.m14011a(this.f25284e);
                        break;
                    case 50:
                        if (this.f25285f == null) {
                            this.f25285f = new C7618a();
                        }
                        c7639qv.m14011a(this.f25285f);
                        break;
                    case 58:
                        if (this.f25286g == null) {
                            this.f25286g = new C7620a();
                        }
                        c7639qv.m14011a(this.f25286g);
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
            if (this.f25280a != 0) {
                c7640qw.m13950b(1, this.f25280a);
            }
            if (this.f25281b != 0) {
                c7640qw.m13973a(2, this.f25281b);
            }
            if (this.f25282c != null) {
                c7640qw.m13971a(3, this.f25282c);
            }
            if (this.f25283d != null) {
                c7640qw.m13971a(4, this.f25283d);
            }
            if (this.f25284e != null) {
                c7640qw.m13971a(5, this.f25284e);
            }
            if (this.f25285f != null) {
                c7640qw.m13971a(6, this.f25285f);
            }
            if (this.f25286g != null) {
                c7640qw.m13971a(7, this.f25286g);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7619b m14056b() {
            this.f25280a = 0L;
            this.f25281b = 0;
            this.f25282c = null;
            this.f25283d = null;
            this.f25284e = null;
            this.f25285f = null;
            this.f25286g = null;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7619b)) {
                return false;
            }
            C7619b c7619b = (C7619b) obj;
            if (this.f25280a != c7619b.f25280a || this.f25281b != c7619b.f25281b) {
                return false;
            }
            if (this.f25282c == null) {
                if (c7619b.f25282c != null) {
                    return false;
                }
            } else if (!this.f25282c.equals(c7619b.f25282c)) {
                return false;
            }
            if (this.f25283d == null) {
                if (c7619b.f25283d != null) {
                    return false;
                }
            } else if (!this.f25283d.equals(c7619b.f25283d)) {
                return false;
            }
            if (this.f25284e == null) {
                if (c7619b.f25284e != null) {
                    return false;
                }
            } else if (!this.f25284e.equals(c7619b.f25284e)) {
                return false;
            }
            if (this.f25285f == null) {
                if (c7619b.f25285f != null) {
                    return false;
                }
            } else if (!this.f25285f.equals(c7619b.f25285f)) {
                return false;
            }
            if (this.f25286g == null) {
                if (c7619b.f25286g != null) {
                    return false;
                }
            } else if (!this.f25286g.equals(c7619b.f25286g)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7619b.f25374ag == null || c7619b.f25374ag.m13887b() : this.f25374ag.equals(c7619b.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f25286g == null ? 0 : this.f25286g.hashCode()) + (((this.f25285f == null ? 0 : this.f25285f.hashCode()) + (((this.f25284e == null ? 0 : this.f25284e.hashCode()) + (((this.f25283d == null ? 0 : this.f25283d.hashCode()) + (((this.f25282c == null ? 0 : this.f25282c.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f25280a ^ (this.f25280a >>> 32)))) * 31) + this.f25281b) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.qf$c */
    /* loaded from: classes2.dex */
    public static final class C7621c extends AbstractC7642qx<C7621c> {

        /* renamed from: a */
        public int f25290a;

        /* renamed from: b */
        public long f25291b;

        public C7621c() {
            m14052b();
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        protected int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f25290a != 0) {
                mo13820a += C7640qw.m13937c(1, this.f25290a);
            }
            return this.f25291b != 0 ? mo13820a + C7640qw.m13920f(2, this.f25291b) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7621c mo13816b(C7639qv c7639qv) {
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
                                this.f25290a = m13997g;
                                continue;
                        }
                    case 16:
                        this.f25291b = c7639qv.m13999f();
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
            if (this.f25290a != 0) {
                c7640qw.m13973a(1, this.f25290a);
            }
            if (this.f25291b != 0) {
                c7640qw.m13950b(2, this.f25291b);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7621c m14052b() {
            this.f25290a = 0;
            this.f25291b = 0L;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7621c)) {
                return false;
            }
            C7621c c7621c = (C7621c) obj;
            if (this.f25290a != c7621c.f25290a || this.f25291b != c7621c.f25291b) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7621c.f25374ag == null || c7621c.f25374ag.m13887b() : this.f25374ag.equals(c7621c.f25374ag);
        }

        public int hashCode() {
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((((getClass().getName().hashCode() + 527) * 31) + this.f25290a) * 31) + ((int) (this.f25291b ^ (this.f25291b >>> 32)))) * 31);
        }
    }

    /* renamed from: com.google.android.gms.internal.qf$d */
    /* loaded from: classes2.dex */
    public static final class C7622d extends AbstractC7642qx<C7622d> {

        /* renamed from: a */
        public int f25292a;

        /* renamed from: b */
        public long f25293b;

        /* renamed from: c */
        public int f25294c;

        /* renamed from: d */
        public String f25295d;

        /* renamed from: e */
        public String f25296e;

        /* renamed from: f */
        public byte[] f25297f;

        /* renamed from: g */
        public int[] f25298g;

        /* renamed from: h */
        public String[] f25299h;

        /* renamed from: i */
        public long f25300i;

        /* renamed from: j */
        public int f25301j;

        /* renamed from: k */
        public String f25302k;

        public C7622d() {
            m14050b();
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        protected int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f25292a != 0) {
                mo13820a += C7640qw.m13937c(1, this.f25292a);
            }
            if (this.f25293b != 0) {
                mo13820a += C7640qw.m13920f(2, this.f25293b);
            }
            if (this.f25294c != 0) {
                mo13820a += C7640qw.m13937c(3, this.f25294c);
            }
            if (!this.f25295d.equals("")) {
                mo13820a += C7640qw.m13948b(4, this.f25295d);
            }
            if (!this.f25296e.equals("")) {
                mo13820a += C7640qw.m13948b(5, this.f25296e);
            }
            if (!Arrays.equals(this.f25297f, C7652rg.f25401h)) {
                mo13820a += C7640qw.m13946b(6, this.f25297f);
            }
            if (this.f25298g != null && this.f25298g.length > 0) {
                int i = 0;
                for (int i2 = 0; i2 < this.f25298g.length; i2++) {
                    i += C7640qw.m13938c(this.f25298g[i2]);
                }
                mo13820a = mo13820a + i + (this.f25298g.length * 1);
            }
            if (this.f25299h != null && this.f25299h.length > 0) {
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < this.f25299h.length; i5++) {
                    String str = this.f25299h[i5];
                    if (str != null) {
                        i4++;
                        i3 += C7640qw.m13942b(str);
                    }
                }
                mo13820a = mo13820a + i3 + (i4 * 1);
            }
            if (this.f25300i != -1) {
                mo13820a += C7640qw.m13920f(9, this.f25300i);
            }
            if (this.f25301j != 0) {
                mo13820a += C7640qw.m13937c(10, this.f25301j);
            }
            return !this.f25302k.equals("") ? mo13820a + C7640qw.m13948b(11, this.f25302k) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7622d mo13816b(C7639qv c7639qv) {
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
                            case 7:
                            case 8:
                                this.f25292a = m13997g;
                                continue;
                        }
                    case 16:
                        this.f25293b = c7639qv.m13999f();
                        break;
                    case 24:
                        int m13997g2 = c7639qv.m13997g();
                        switch (m13997g2) {
                            case 0:
                            case 100:
                            case 102:
                            case 104:
                            case 105:
                                this.f25294c = m13997g2;
                                continue;
                        }
                    case 34:
                        this.f25295d = c7639qv.m13993j();
                        break;
                    case 42:
                        this.f25296e = c7639qv.m13993j();
                        break;
                    case 50:
                        this.f25297f = c7639qv.m13992k();
                        break;
                    case 56:
                        int m13839b = C7652rg.m13839b(c7639qv, 56);
                        int length = this.f25298g == null ? 0 : this.f25298g.length;
                        int[] iArr = new int[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f25298g, 0, iArr, 0, length);
                        }
                        while (length < iArr.length - 1) {
                            iArr[length] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length++;
                        }
                        iArr[length] = c7639qv.m13997g();
                        this.f25298g = iArr;
                        break;
                    case 58:
                        int m14002d = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t = c7639qv.m13983t();
                        int i = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i++;
                        }
                        c7639qv.m13998f(m13983t);
                        int length2 = this.f25298g == null ? 0 : this.f25298g.length;
                        int[] iArr2 = new int[i + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f25298g, 0, iArr2, 0, length2);
                        }
                        while (length2 < iArr2.length) {
                            iArr2[length2] = c7639qv.m13997g();
                            length2++;
                        }
                        this.f25298g = iArr2;
                        c7639qv.m14000e(m14002d);
                        break;
                    case 66:
                        int m13839b2 = C7652rg.m13839b(c7639qv, 66);
                        int length3 = this.f25299h == null ? 0 : this.f25299h.length;
                        String[] strArr = new String[m13839b2 + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.f25299h, 0, strArr, 0, length3);
                        }
                        while (length3 < strArr.length - 1) {
                            strArr[length3] = c7639qv.m13993j();
                            c7639qv.m14015a();
                            length3++;
                        }
                        strArr[length3] = c7639qv.m13993j();
                        this.f25299h = strArr;
                        break;
                    case 72:
                        this.f25300i = c7639qv.m13999f();
                        break;
                    case 80:
                        this.f25301j = c7639qv.m13997g();
                        break;
                    case 90:
                        this.f25302k = c7639qv.m13993j();
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
            if (this.f25292a != 0) {
                c7640qw.m13973a(1, this.f25292a);
            }
            if (this.f25293b != 0) {
                c7640qw.m13950b(2, this.f25293b);
            }
            if (this.f25294c != 0) {
                c7640qw.m13973a(3, this.f25294c);
            }
            if (!this.f25295d.equals("")) {
                c7640qw.m13970a(4, this.f25295d);
            }
            if (!this.f25296e.equals("")) {
                c7640qw.m13970a(5, this.f25296e);
            }
            if (!Arrays.equals(this.f25297f, C7652rg.f25401h)) {
                c7640qw.m13968a(6, this.f25297f);
            }
            if (this.f25298g != null && this.f25298g.length > 0) {
                for (int i = 0; i < this.f25298g.length; i++) {
                    c7640qw.m13973a(7, this.f25298g[i]);
                }
            }
            if (this.f25299h != null && this.f25299h.length > 0) {
                for (int i2 = 0; i2 < this.f25299h.length; i2++) {
                    String str = this.f25299h[i2];
                    if (str != null) {
                        c7640qw.m13970a(8, str);
                    }
                }
            }
            if (this.f25300i != -1) {
                c7640qw.m13950b(9, this.f25300i);
            }
            if (this.f25301j != 0) {
                c7640qw.m13973a(10, this.f25301j);
            }
            if (!this.f25302k.equals("")) {
                c7640qw.m13970a(11, this.f25302k);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7622d m14050b() {
            this.f25292a = 0;
            this.f25293b = 0L;
            this.f25294c = 0;
            this.f25295d = "";
            this.f25296e = "";
            this.f25297f = C7652rg.f25401h;
            this.f25298g = C7652rg.f25394a;
            this.f25299h = C7652rg.f25399f;
            this.f25300i = -1L;
            this.f25301j = 0;
            this.f25302k = "";
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7622d)) {
                return false;
            }
            C7622d c7622d = (C7622d) obj;
            if (this.f25292a != c7622d.f25292a || this.f25293b != c7622d.f25293b || this.f25294c != c7622d.f25294c) {
                return false;
            }
            if (this.f25295d == null) {
                if (c7622d.f25295d != null) {
                    return false;
                }
            } else if (!this.f25295d.equals(c7622d.f25295d)) {
                return false;
            }
            if (this.f25296e == null) {
                if (c7622d.f25296e != null) {
                    return false;
                }
            } else if (!this.f25296e.equals(c7622d.f25296e)) {
                return false;
            }
            if (!Arrays.equals(this.f25297f, c7622d.f25297f) || !C7647rb.m13871a(this.f25298g, c7622d.f25298g) || !C7647rb.m13867a(this.f25299h, c7622d.f25299h) || this.f25300i != c7622d.f25300i || this.f25301j != c7622d.f25301j) {
                return false;
            }
            if (this.f25302k == null) {
                if (c7622d.f25302k != null) {
                    return false;
                }
            } else if (!this.f25302k.equals(c7622d.f25302k)) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7622d.f25374ag == null || c7622d.f25374ag.m13887b() : this.f25374ag.equals(c7622d.f25374ag);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f25302k == null ? 0 : this.f25302k.hashCode()) + (((((((((((((this.f25296e == null ? 0 : this.f25296e.hashCode()) + (((this.f25295d == null ? 0 : this.f25295d.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + this.f25292a) * 31) + ((int) (this.f25293b ^ (this.f25293b >>> 32)))) * 31) + this.f25294c) * 31)) * 31)) * 31) + Arrays.hashCode(this.f25297f)) * 31) + C7647rb.m13872a(this.f25298g)) * 31) + C7647rb.m13868a(this.f25299h)) * 31) + ((int) (this.f25300i ^ (this.f25300i >>> 32)))) * 31) + this.f25301j) * 31)) * 31;
            if (this.f25374ag != null && !this.f25374ag.m13887b()) {
                i = this.f25374ag.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.google.android.gms.internal.qf$e */
    /* loaded from: classes2.dex */
    public static final class C7623e extends AbstractC7642qx<C7623e> {

        /* renamed from: a */
        public int f25303a;

        /* renamed from: b */
        public long f25304b;

        /* renamed from: c */
        public int f25305c;

        public C7623e() {
            m14048b();
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        protected int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f25303a != 0) {
                mo13820a += C7640qw.m13937c(1, this.f25303a);
            }
            if (this.f25304b != 0) {
                mo13820a += C7640qw.m13920f(2, this.f25304b);
            }
            return this.f25305c != 0 ? mo13820a + C7640qw.m13937c(3, this.f25305c) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7623e mo13816b(C7639qv c7639qv) {
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
                                this.f25303a = m13997g;
                                continue;
                        }
                    case 16:
                        this.f25304b = c7639qv.m13999f();
                        break;
                    case 24:
                        this.f25305c = c7639qv.m13997g();
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
            if (this.f25303a != 0) {
                c7640qw.m13973a(1, this.f25303a);
            }
            if (this.f25304b != 0) {
                c7640qw.m13950b(2, this.f25304b);
            }
            if (this.f25305c != 0) {
                c7640qw.m13973a(3, this.f25305c);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: b */
        public C7623e m14048b() {
            this.f25303a = 0;
            this.f25304b = 0L;
            this.f25305c = 0;
            this.f25374ag = null;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7623e)) {
                return false;
            }
            C7623e c7623e = (C7623e) obj;
            if (this.f25303a != c7623e.f25303a || this.f25304b != c7623e.f25304b || this.f25305c != c7623e.f25305c) {
                return false;
            }
            return (this.f25374ag == null || this.f25374ag.m13887b()) ? c7623e.f25374ag == null || c7623e.f25374ag.m13887b() : this.f25374ag.equals(c7623e.f25374ag);
        }

        public int hashCode() {
            return ((this.f25374ag == null || this.f25374ag.m13887b()) ? 0 : this.f25374ag.hashCode()) + ((((((((getClass().getName().hashCode() + 527) * 31) + this.f25303a) * 31) + ((int) (this.f25304b ^ (this.f25304b >>> 32)))) * 31) + this.f25305c) * 31);
        }
    }
}
