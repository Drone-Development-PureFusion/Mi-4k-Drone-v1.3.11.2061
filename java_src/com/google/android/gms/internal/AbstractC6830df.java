package com.google.android.gms.internal;

import com.facebook.imagepipeline.memory.BitmapCounterProvider;
import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.TiffUtil;
import com.google.android.gms.wallet.C9357e;
/* renamed from: com.google.android.gms.internal.df */
/* loaded from: classes2.dex */
public interface AbstractC6830df {

    /* renamed from: com.google.android.gms.internal.df$a */
    /* loaded from: classes2.dex */
    public static final class C6831a extends AbstractC7642qx<C6831a> {

        /* renamed from: F */
        public C6834b f22935F;

        /* renamed from: W */
        public C6832a f22952W;

        /* renamed from: Y */
        public C6833b f22954Y;

        /* renamed from: af */
        public C6837e f22962af;

        /* renamed from: a */
        public String f22956a = null;

        /* renamed from: b */
        public String f22963b = null;

        /* renamed from: c */
        public Long f22964c = null;

        /* renamed from: d */
        public Long f22965d = null;

        /* renamed from: e */
        public Long f22966e = null;

        /* renamed from: f */
        public Long f22967f = null;

        /* renamed from: g */
        public Long f22968g = null;

        /* renamed from: h */
        public Long f22969h = null;

        /* renamed from: i */
        public Long f22970i = null;

        /* renamed from: j */
        public Long f22971j = null;

        /* renamed from: k */
        public Long f22972k = null;

        /* renamed from: l */
        public Long f22973l = null;

        /* renamed from: m */
        public String f22974m = null;

        /* renamed from: n */
        public Long f22975n = null;

        /* renamed from: o */
        public Long f22976o = null;

        /* renamed from: p */
        public Long f22977p = null;

        /* renamed from: q */
        public Long f22978q = null;

        /* renamed from: r */
        public Long f22979r = null;

        /* renamed from: s */
        public Long f22980s = null;

        /* renamed from: t */
        public Long f22981t = null;

        /* renamed from: u */
        public Long f22982u = null;

        /* renamed from: v */
        public Long f22983v = null;

        /* renamed from: w */
        public String f22984w = null;

        /* renamed from: x */
        public String f22985x = null;

        /* renamed from: y */
        public Long f22986y = null;

        /* renamed from: z */
        public Long f22987z = null;

        /* renamed from: A */
        public Long f22930A = null;

        /* renamed from: B */
        public String f22931B = null;

        /* renamed from: C */
        public Long f22932C = null;

        /* renamed from: D */
        public Long f22933D = null;

        /* renamed from: E */
        public Long f22934E = null;

        /* renamed from: G */
        public Long f22936G = null;

        /* renamed from: H */
        public Long f22937H = null;

        /* renamed from: I */
        public Long f22938I = null;

        /* renamed from: J */
        public Long f22939J = null;

        /* renamed from: K */
        public Long f22940K = null;

        /* renamed from: L */
        public Long f22941L = null;

        /* renamed from: M */
        public String f22942M = null;

        /* renamed from: N */
        public String f22943N = null;

        /* renamed from: O */
        public Integer f22944O = null;

        /* renamed from: P */
        public Integer f22945P = null;

        /* renamed from: Q */
        public Long f22946Q = null;

        /* renamed from: R */
        public Long f22947R = null;

        /* renamed from: S */
        public Long f22948S = null;

        /* renamed from: T */
        public Long f22949T = null;

        /* renamed from: U */
        public Long f22950U = null;

        /* renamed from: V */
        public Integer f22951V = null;

        /* renamed from: X */
        public C6832a[] f22953X = C6832a.m16165b();

        /* renamed from: Z */
        public Long f22955Z = null;

        /* renamed from: aa */
        public String f22957aa = null;

        /* renamed from: ab */
        public Integer f22958ab = null;

        /* renamed from: ac */
        public Boolean f22959ac = null;

        /* renamed from: ad */
        public String f22960ad = null;

        /* renamed from: ae */
        public Long f22961ae = null;

        /* renamed from: com.google.android.gms.internal.df$a$a */
        /* loaded from: classes2.dex */
        public static final class C6832a extends AbstractC7642qx<C6832a> {

            /* renamed from: m */
            private static volatile C6832a[] f22988m;

            /* renamed from: a */
            public Long f22989a = null;

            /* renamed from: b */
            public Long f22990b = null;

            /* renamed from: c */
            public Long f22991c = null;

            /* renamed from: d */
            public Long f22992d = null;

            /* renamed from: e */
            public Long f22993e = null;

            /* renamed from: f */
            public Long f22994f = null;

            /* renamed from: g */
            public Integer f22995g = null;

            /* renamed from: h */
            public Long f22996h = null;

            /* renamed from: i */
            public Long f22997i = null;

            /* renamed from: j */
            public Long f22998j = null;

            /* renamed from: k */
            public Integer f22999k = null;

            /* renamed from: l */
            public Long f23000l = null;

            public C6832a() {
                this.f25391ah = -1;
            }

            /* renamed from: b */
            public static C6832a[] m16165b() {
                if (f22988m == null) {
                    synchronized (C7647rb.f25390c) {
                        if (f22988m == null) {
                            f22988m = new C6832a[0];
                        }
                    }
                }
                return f22988m;
            }

            @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
            /* renamed from: a */
            protected int mo13820a() {
                int mo13820a = super.mo13820a();
                if (this.f22989a != null) {
                    mo13820a += C7640qw.m13920f(1, this.f22989a.longValue());
                }
                if (this.f22990b != null) {
                    mo13820a += C7640qw.m13920f(2, this.f22990b.longValue());
                }
                if (this.f22991c != null) {
                    mo13820a += C7640qw.m13920f(3, this.f22991c.longValue());
                }
                if (this.f22992d != null) {
                    mo13820a += C7640qw.m13920f(4, this.f22992d.longValue());
                }
                if (this.f22993e != null) {
                    mo13820a += C7640qw.m13920f(5, this.f22993e.longValue());
                }
                if (this.f22994f != null) {
                    mo13820a += C7640qw.m13920f(6, this.f22994f.longValue());
                }
                if (this.f22995g != null) {
                    mo13820a += C7640qw.m13937c(7, this.f22995g.intValue());
                }
                if (this.f22996h != null) {
                    mo13820a += C7640qw.m13920f(8, this.f22996h.longValue());
                }
                if (this.f22997i != null) {
                    mo13820a += C7640qw.m13920f(9, this.f22997i.longValue());
                }
                if (this.f22998j != null) {
                    mo13820a += C7640qw.m13920f(10, this.f22998j.longValue());
                }
                if (this.f22999k != null) {
                    mo13820a += C7640qw.m13937c(11, this.f22999k.intValue());
                }
                return this.f23000l != null ? mo13820a + C7640qw.m13920f(12, this.f23000l.longValue()) : mo13820a;
            }

            @Override // com.google.android.gms.internal.AbstractC7649rd
            /* renamed from: a */
            public C6832a mo13816b(C7639qv c7639qv) {
                while (true) {
                    int m14015a = c7639qv.m14015a();
                    switch (m14015a) {
                        case 0:
                            break;
                        case 8:
                            this.f22989a = Long.valueOf(c7639qv.m13999f());
                            break;
                        case 16:
                            this.f22990b = Long.valueOf(c7639qv.m13999f());
                            break;
                        case 24:
                            this.f22991c = Long.valueOf(c7639qv.m13999f());
                            break;
                        case 32:
                            this.f22992d = Long.valueOf(c7639qv.m13999f());
                            break;
                        case 40:
                            this.f22993e = Long.valueOf(c7639qv.m13999f());
                            break;
                        case 48:
                            this.f22994f = Long.valueOf(c7639qv.m13999f());
                            break;
                        case 56:
                            int m13997g = c7639qv.m13997g();
                            switch (m13997g) {
                                case 0:
                                case 1:
                                case 2:
                                case 1000:
                                    this.f22995g = Integer.valueOf(m13997g);
                                    continue;
                            }
                        case 64:
                            this.f22996h = Long.valueOf(c7639qv.m13999f());
                            break;
                        case 72:
                            this.f22997i = Long.valueOf(c7639qv.m13999f());
                            break;
                        case 80:
                            this.f22998j = Long.valueOf(c7639qv.m13999f());
                            break;
                        case 88:
                            int m13997g2 = c7639qv.m13997g();
                            switch (m13997g2) {
                                case 0:
                                case 1:
                                case 2:
                                case 1000:
                                    this.f22999k = Integer.valueOf(m13997g2);
                                    continue;
                            }
                        case 96:
                            this.f23000l = Long.valueOf(c7639qv.m13999f());
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
                if (this.f22989a != null) {
                    c7640qw.m13950b(1, this.f22989a.longValue());
                }
                if (this.f22990b != null) {
                    c7640qw.m13950b(2, this.f22990b.longValue());
                }
                if (this.f22991c != null) {
                    c7640qw.m13950b(3, this.f22991c.longValue());
                }
                if (this.f22992d != null) {
                    c7640qw.m13950b(4, this.f22992d.longValue());
                }
                if (this.f22993e != null) {
                    c7640qw.m13950b(5, this.f22993e.longValue());
                }
                if (this.f22994f != null) {
                    c7640qw.m13950b(6, this.f22994f.longValue());
                }
                if (this.f22995g != null) {
                    c7640qw.m13973a(7, this.f22995g.intValue());
                }
                if (this.f22996h != null) {
                    c7640qw.m13950b(8, this.f22996h.longValue());
                }
                if (this.f22997i != null) {
                    c7640qw.m13950b(9, this.f22997i.longValue());
                }
                if (this.f22998j != null) {
                    c7640qw.m13950b(10, this.f22998j.longValue());
                }
                if (this.f22999k != null) {
                    c7640qw.m13973a(11, this.f22999k.intValue());
                }
                if (this.f23000l != null) {
                    c7640qw.m13950b(12, this.f23000l.longValue());
                }
                super.mo13818a(c7640qw);
            }
        }

        /* renamed from: com.google.android.gms.internal.df$a$b */
        /* loaded from: classes2.dex */
        public static final class C6833b extends AbstractC7642qx<C6833b> {

            /* renamed from: a */
            public Long f23001a = null;

            /* renamed from: b */
            public Long f23002b = null;

            /* renamed from: c */
            public Long f23003c = null;

            public C6833b() {
                this.f25391ah = -1;
            }

            @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
            /* renamed from: a */
            protected int mo13820a() {
                int mo13820a = super.mo13820a();
                if (this.f23001a != null) {
                    mo13820a += C7640qw.m13920f(1, this.f23001a.longValue());
                }
                if (this.f23002b != null) {
                    mo13820a += C7640qw.m13920f(2, this.f23002b.longValue());
                }
                return this.f23003c != null ? mo13820a + C7640qw.m13920f(3, this.f23003c.longValue()) : mo13820a;
            }

            @Override // com.google.android.gms.internal.AbstractC7649rd
            /* renamed from: a */
            public C6833b mo13816b(C7639qv c7639qv) {
                while (true) {
                    int m14015a = c7639qv.m14015a();
                    switch (m14015a) {
                        case 0:
                            break;
                        case 8:
                            this.f23001a = Long.valueOf(c7639qv.m13999f());
                            break;
                        case 16:
                            this.f23002b = Long.valueOf(c7639qv.m13999f());
                            break;
                        case 24:
                            this.f23003c = Long.valueOf(c7639qv.m13999f());
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
                if (this.f23001a != null) {
                    c7640qw.m13950b(1, this.f23001a.longValue());
                }
                if (this.f23002b != null) {
                    c7640qw.m13950b(2, this.f23002b.longValue());
                }
                if (this.f23003c != null) {
                    c7640qw.m13950b(3, this.f23003c.longValue());
                }
                super.mo13818a(c7640qw);
            }
        }

        public C6831a() {
            this.f25391ah = -1;
        }

        /* renamed from: a */
        public static C6831a m16167a(byte[] bArr) {
            return (C6831a) AbstractC7649rd.m13856a(new C6831a(), bArr);
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        protected int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22956a != null) {
                mo13820a += C7640qw.m13948b(1, this.f22956a);
            }
            if (this.f22963b != null) {
                mo13820a += C7640qw.m13948b(2, this.f22963b);
            }
            if (this.f22964c != null) {
                mo13820a += C7640qw.m13920f(3, this.f22964c.longValue());
            }
            if (this.f22965d != null) {
                mo13820a += C7640qw.m13920f(4, this.f22965d.longValue());
            }
            if (this.f22966e != null) {
                mo13820a += C7640qw.m13920f(5, this.f22966e.longValue());
            }
            if (this.f22967f != null) {
                mo13820a += C7640qw.m13920f(6, this.f22967f.longValue());
            }
            if (this.f22968g != null) {
                mo13820a += C7640qw.m13920f(7, this.f22968g.longValue());
            }
            if (this.f22969h != null) {
                mo13820a += C7640qw.m13920f(8, this.f22969h.longValue());
            }
            if (this.f22970i != null) {
                mo13820a += C7640qw.m13920f(9, this.f22970i.longValue());
            }
            if (this.f22971j != null) {
                mo13820a += C7640qw.m13920f(10, this.f22971j.longValue());
            }
            if (this.f22972k != null) {
                mo13820a += C7640qw.m13920f(11, this.f22972k.longValue());
            }
            if (this.f22973l != null) {
                mo13820a += C7640qw.m13920f(12, this.f22973l.longValue());
            }
            if (this.f22974m != null) {
                mo13820a += C7640qw.m13948b(13, this.f22974m);
            }
            if (this.f22975n != null) {
                mo13820a += C7640qw.m13920f(14, this.f22975n.longValue());
            }
            if (this.f22976o != null) {
                mo13820a += C7640qw.m13920f(15, this.f22976o.longValue());
            }
            if (this.f22977p != null) {
                mo13820a += C7640qw.m13920f(16, this.f22977p.longValue());
            }
            if (this.f22978q != null) {
                mo13820a += C7640qw.m13920f(17, this.f22978q.longValue());
            }
            if (this.f22979r != null) {
                mo13820a += C7640qw.m13920f(18, this.f22979r.longValue());
            }
            if (this.f22980s != null) {
                mo13820a += C7640qw.m13920f(19, this.f22980s.longValue());
            }
            if (this.f22981t != null) {
                mo13820a += C7640qw.m13920f(20, this.f22981t.longValue());
            }
            if (this.f22955Z != null) {
                mo13820a += C7640qw.m13920f(21, this.f22955Z.longValue());
            }
            if (this.f22982u != null) {
                mo13820a += C7640qw.m13920f(22, this.f22982u.longValue());
            }
            if (this.f22983v != null) {
                mo13820a += C7640qw.m13920f(23, this.f22983v.longValue());
            }
            if (this.f22957aa != null) {
                mo13820a += C7640qw.m13948b(24, this.f22957aa);
            }
            if (this.f22961ae != null) {
                mo13820a += C7640qw.m13920f(25, this.f22961ae.longValue());
            }
            if (this.f22958ab != null) {
                mo13820a += C7640qw.m13937c(26, this.f22958ab.intValue());
            }
            if (this.f22984w != null) {
                mo13820a += C7640qw.m13948b(27, this.f22984w);
            }
            if (this.f22959ac != null) {
                mo13820a += C7640qw.m13947b(28, this.f22959ac.booleanValue());
            }
            if (this.f22985x != null) {
                mo13820a += C7640qw.m13948b(29, this.f22985x);
            }
            if (this.f22960ad != null) {
                mo13820a += C7640qw.m13948b(30, this.f22960ad);
            }
            if (this.f22986y != null) {
                mo13820a += C7640qw.m13920f(31, this.f22986y.longValue());
            }
            if (this.f22987z != null) {
                mo13820a += C7640qw.m13920f(32, this.f22987z.longValue());
            }
            if (this.f22930A != null) {
                mo13820a += C7640qw.m13920f(33, this.f22930A.longValue());
            }
            if (this.f22931B != null) {
                mo13820a += C7640qw.m13948b(34, this.f22931B);
            }
            if (this.f22932C != null) {
                mo13820a += C7640qw.m13920f(35, this.f22932C.longValue());
            }
            if (this.f22933D != null) {
                mo13820a += C7640qw.m13920f(36, this.f22933D.longValue());
            }
            if (this.f22934E != null) {
                mo13820a += C7640qw.m13920f(37, this.f22934E.longValue());
            }
            if (this.f22935F != null) {
                mo13820a += C7640qw.m13935c(38, this.f22935F);
            }
            if (this.f22936G != null) {
                mo13820a += C7640qw.m13920f(39, this.f22936G.longValue());
            }
            if (this.f22937H != null) {
                mo13820a += C7640qw.m13920f(40, this.f22937H.longValue());
            }
            if (this.f22938I != null) {
                mo13820a += C7640qw.m13920f(41, this.f22938I.longValue());
            }
            if (this.f22939J != null) {
                mo13820a += C7640qw.m13920f(42, this.f22939J.longValue());
            }
            if (this.f22953X != null && this.f22953X.length > 0) {
                int i = mo13820a;
                for (int i2 = 0; i2 < this.f22953X.length; i2++) {
                    C6832a c6832a = this.f22953X[i2];
                    if (c6832a != null) {
                        i += C7640qw.m13935c(43, c6832a);
                    }
                }
                mo13820a = i;
            }
            if (this.f22940K != null) {
                mo13820a += C7640qw.m13920f(44, this.f22940K.longValue());
            }
            if (this.f22941L != null) {
                mo13820a += C7640qw.m13920f(45, this.f22941L.longValue());
            }
            if (this.f22942M != null) {
                mo13820a += C7640qw.m13948b(46, this.f22942M);
            }
            if (this.f22943N != null) {
                mo13820a += C7640qw.m13948b(47, this.f22943N);
            }
            if (this.f22944O != null) {
                mo13820a += C7640qw.m13937c(48, this.f22944O.intValue());
            }
            if (this.f22945P != null) {
                mo13820a += C7640qw.m13937c(49, this.f22945P.intValue());
            }
            if (this.f22952W != null) {
                mo13820a += C7640qw.m13935c(50, this.f22952W);
            }
            if (this.f22946Q != null) {
                mo13820a += C7640qw.m13920f(51, this.f22946Q.longValue());
            }
            if (this.f22947R != null) {
                mo13820a += C7640qw.m13920f(52, this.f22947R.longValue());
            }
            if (this.f22948S != null) {
                mo13820a += C7640qw.m13920f(53, this.f22948S.longValue());
            }
            if (this.f22949T != null) {
                mo13820a += C7640qw.m13920f(54, this.f22949T.longValue());
            }
            if (this.f22950U != null) {
                mo13820a += C7640qw.m13920f(55, this.f22950U.longValue());
            }
            if (this.f22951V != null) {
                mo13820a += C7640qw.m13937c(56, this.f22951V.intValue());
            }
            if (this.f22954Y != null) {
                mo13820a += C7640qw.m13935c(57, this.f22954Y);
            }
            return this.f22962af != null ? mo13820a + C7640qw.m13935c(201, this.f22962af) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6831a mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f22956a = c7639qv.m13993j();
                        break;
                    case 18:
                        this.f22963b = c7639qv.m13993j();
                        break;
                    case 24:
                        this.f22964c = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 32:
                        this.f22965d = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 40:
                        this.f22966e = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 48:
                        this.f22967f = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 56:
                        this.f22968g = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 64:
                        this.f22969h = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 72:
                        this.f22970i = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 80:
                        this.f22971j = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 88:
                        this.f22972k = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 96:
                        this.f22973l = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 106:
                        this.f22974m = c7639qv.m13993j();
                        break;
                    case 112:
                        this.f22975n = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 120:
                        this.f22976o = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 128:
                        this.f22977p = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 136:
                        this.f22978q = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 144:
                        this.f22979r = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 152:
                        this.f22980s = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 160:
                        this.f22981t = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 168:
                        this.f22955Z = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 176:
                        this.f22982u = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 184:
                        this.f22983v = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 194:
                        this.f22957aa = c7639qv.m13993j();
                        break;
                    case 200:
                        this.f22961ae = Long.valueOf(c7639qv.m13999f());
                        break;
                    case JfifUtil.MARKER_RST0 /* 208 */:
                        int m13997g = c7639qv.m13997g();
                        switch (m13997g) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                this.f22958ab = Integer.valueOf(m13997g);
                                continue;
                        }
                    case JfifUtil.MARKER_SOS /* 218 */:
                        this.f22984w = c7639qv.m13993j();
                        break;
                    case 224:
                        this.f22959ac = Boolean.valueOf(c7639qv.m13994i());
                        break;
                    case 234:
                        this.f22985x = c7639qv.m13993j();
                        break;
                    case 242:
                        this.f22960ad = c7639qv.m13993j();
                        break;
                    case 248:
                        this.f22986y = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 256:
                        this.f22987z = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 264:
                        this.f22930A = Long.valueOf(c7639qv.m13999f());
                        break;
                    case TiffUtil.TIFF_TAG_ORIENTATION /* 274 */:
                        this.f22931B = c7639qv.m13993j();
                        break;
                    case 280:
                        this.f22932C = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 288:
                        this.f22933D = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 296:
                        this.f22934E = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 306:
                        if (this.f22935F == null) {
                            this.f22935F = new C6834b();
                        }
                        c7639qv.m14011a(this.f22935F);
                        break;
                    case 312:
                        this.f22936G = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 320:
                        this.f22937H = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 328:
                        this.f22938I = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 336:
                        this.f22939J = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 346:
                        int m13839b = C7652rg.m13839b(c7639qv, 346);
                        int length = this.f22953X == null ? 0 : this.f22953X.length;
                        C6832a[] c6832aArr = new C6832a[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f22953X, 0, c6832aArr, 0, length);
                        }
                        while (length < c6832aArr.length - 1) {
                            c6832aArr[length] = new C6832a();
                            c7639qv.m14011a(c6832aArr[length]);
                            c7639qv.m14015a();
                            length++;
                        }
                        c6832aArr[length] = new C6832a();
                        c7639qv.m14011a(c6832aArr[length]);
                        this.f22953X = c6832aArr;
                        break;
                    case 352:
                        this.f22940K = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 360:
                        this.f22941L = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 370:
                        this.f22942M = c7639qv.m13993j();
                        break;
                    case 378:
                        this.f22943N = c7639qv.m13993j();
                        break;
                    case BitmapCounterProvider.MAX_BITMAP_COUNT /* 384 */:
                        int m13997g2 = c7639qv.m13997g();
                        switch (m13997g2) {
                            case 0:
                            case 1:
                            case 2:
                            case 1000:
                                this.f22944O = Integer.valueOf(m13997g2);
                                continue;
                        }
                    case 392:
                        int m13997g3 = c7639qv.m13997g();
                        switch (m13997g3) {
                            case 0:
                            case 1:
                            case 2:
                            case 1000:
                                this.f22945P = Integer.valueOf(m13997g3);
                                continue;
                        }
                    case C9357e.f29593i /* 402 */:
                        if (this.f22952W == null) {
                            this.f22952W = new C6832a();
                        }
                        c7639qv.m14011a(this.f22952W);
                        break;
                    case 408:
                        this.f22946Q = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 416:
                        this.f22947R = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 424:
                        this.f22948S = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 432:
                        this.f22949T = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 440:
                        this.f22950U = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 448:
                        int m13997g4 = c7639qv.m13997g();
                        switch (m13997g4) {
                            case 0:
                            case 1:
                            case 2:
                            case 1000:
                                this.f22951V = Integer.valueOf(m13997g4);
                                continue;
                        }
                    case 458:
                        if (this.f22954Y == null) {
                            this.f22954Y = new C6833b();
                        }
                        c7639qv.m14011a(this.f22954Y);
                        break;
                    case 1610:
                        if (this.f22962af == null) {
                            this.f22962af = new C6837e();
                        }
                        c7639qv.m14011a(this.f22962af);
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
            if (this.f22956a != null) {
                c7640qw.m13970a(1, this.f22956a);
            }
            if (this.f22963b != null) {
                c7640qw.m13970a(2, this.f22963b);
            }
            if (this.f22964c != null) {
                c7640qw.m13950b(3, this.f22964c.longValue());
            }
            if (this.f22965d != null) {
                c7640qw.m13950b(4, this.f22965d.longValue());
            }
            if (this.f22966e != null) {
                c7640qw.m13950b(5, this.f22966e.longValue());
            }
            if (this.f22967f != null) {
                c7640qw.m13950b(6, this.f22967f.longValue());
            }
            if (this.f22968g != null) {
                c7640qw.m13950b(7, this.f22968g.longValue());
            }
            if (this.f22969h != null) {
                c7640qw.m13950b(8, this.f22969h.longValue());
            }
            if (this.f22970i != null) {
                c7640qw.m13950b(9, this.f22970i.longValue());
            }
            if (this.f22971j != null) {
                c7640qw.m13950b(10, this.f22971j.longValue());
            }
            if (this.f22972k != null) {
                c7640qw.m13950b(11, this.f22972k.longValue());
            }
            if (this.f22973l != null) {
                c7640qw.m13950b(12, this.f22973l.longValue());
            }
            if (this.f22974m != null) {
                c7640qw.m13970a(13, this.f22974m);
            }
            if (this.f22975n != null) {
                c7640qw.m13950b(14, this.f22975n.longValue());
            }
            if (this.f22976o != null) {
                c7640qw.m13950b(15, this.f22976o.longValue());
            }
            if (this.f22977p != null) {
                c7640qw.m13950b(16, this.f22977p.longValue());
            }
            if (this.f22978q != null) {
                c7640qw.m13950b(17, this.f22978q.longValue());
            }
            if (this.f22979r != null) {
                c7640qw.m13950b(18, this.f22979r.longValue());
            }
            if (this.f22980s != null) {
                c7640qw.m13950b(19, this.f22980s.longValue());
            }
            if (this.f22981t != null) {
                c7640qw.m13950b(20, this.f22981t.longValue());
            }
            if (this.f22955Z != null) {
                c7640qw.m13950b(21, this.f22955Z.longValue());
            }
            if (this.f22982u != null) {
                c7640qw.m13950b(22, this.f22982u.longValue());
            }
            if (this.f22983v != null) {
                c7640qw.m13950b(23, this.f22983v.longValue());
            }
            if (this.f22957aa != null) {
                c7640qw.m13970a(24, this.f22957aa);
            }
            if (this.f22961ae != null) {
                c7640qw.m13950b(25, this.f22961ae.longValue());
            }
            if (this.f22958ab != null) {
                c7640qw.m13973a(26, this.f22958ab.intValue());
            }
            if (this.f22984w != null) {
                c7640qw.m13970a(27, this.f22984w);
            }
            if (this.f22959ac != null) {
                c7640qw.m13969a(28, this.f22959ac.booleanValue());
            }
            if (this.f22985x != null) {
                c7640qw.m13970a(29, this.f22985x);
            }
            if (this.f22960ad != null) {
                c7640qw.m13970a(30, this.f22960ad);
            }
            if (this.f22986y != null) {
                c7640qw.m13950b(31, this.f22986y.longValue());
            }
            if (this.f22987z != null) {
                c7640qw.m13950b(32, this.f22987z.longValue());
            }
            if (this.f22930A != null) {
                c7640qw.m13950b(33, this.f22930A.longValue());
            }
            if (this.f22931B != null) {
                c7640qw.m13970a(34, this.f22931B);
            }
            if (this.f22932C != null) {
                c7640qw.m13950b(35, this.f22932C.longValue());
            }
            if (this.f22933D != null) {
                c7640qw.m13950b(36, this.f22933D.longValue());
            }
            if (this.f22934E != null) {
                c7640qw.m13950b(37, this.f22934E.longValue());
            }
            if (this.f22935F != null) {
                c7640qw.m13971a(38, this.f22935F);
            }
            if (this.f22936G != null) {
                c7640qw.m13950b(39, this.f22936G.longValue());
            }
            if (this.f22937H != null) {
                c7640qw.m13950b(40, this.f22937H.longValue());
            }
            if (this.f22938I != null) {
                c7640qw.m13950b(41, this.f22938I.longValue());
            }
            if (this.f22939J != null) {
                c7640qw.m13950b(42, this.f22939J.longValue());
            }
            if (this.f22953X != null && this.f22953X.length > 0) {
                for (int i = 0; i < this.f22953X.length; i++) {
                    C6832a c6832a = this.f22953X[i];
                    if (c6832a != null) {
                        c7640qw.m13971a(43, c6832a);
                    }
                }
            }
            if (this.f22940K != null) {
                c7640qw.m13950b(44, this.f22940K.longValue());
            }
            if (this.f22941L != null) {
                c7640qw.m13950b(45, this.f22941L.longValue());
            }
            if (this.f22942M != null) {
                c7640qw.m13970a(46, this.f22942M);
            }
            if (this.f22943N != null) {
                c7640qw.m13970a(47, this.f22943N);
            }
            if (this.f22944O != null) {
                c7640qw.m13973a(48, this.f22944O.intValue());
            }
            if (this.f22945P != null) {
                c7640qw.m13973a(49, this.f22945P.intValue());
            }
            if (this.f22952W != null) {
                c7640qw.m13971a(50, this.f22952W);
            }
            if (this.f22946Q != null) {
                c7640qw.m13950b(51, this.f22946Q.longValue());
            }
            if (this.f22947R != null) {
                c7640qw.m13950b(52, this.f22947R.longValue());
            }
            if (this.f22948S != null) {
                c7640qw.m13950b(53, this.f22948S.longValue());
            }
            if (this.f22949T != null) {
                c7640qw.m13950b(54, this.f22949T.longValue());
            }
            if (this.f22950U != null) {
                c7640qw.m13950b(55, this.f22950U.longValue());
            }
            if (this.f22951V != null) {
                c7640qw.m13973a(56, this.f22951V.intValue());
            }
            if (this.f22954Y != null) {
                c7640qw.m13971a(57, this.f22954Y);
            }
            if (this.f22962af != null) {
                c7640qw.m13971a(201, this.f22962af);
            }
            super.mo13818a(c7640qw);
        }
    }

    /* renamed from: com.google.android.gms.internal.df$b */
    /* loaded from: classes2.dex */
    public static final class C6834b extends AbstractC7642qx<C6834b> {

        /* renamed from: a */
        public Long f23004a = null;

        /* renamed from: b */
        public Integer f23005b = null;

        /* renamed from: c */
        public Boolean f23006c = null;

        /* renamed from: d */
        public int[] f23007d = C7652rg.f25394a;

        /* renamed from: e */
        public Long f23008e = null;

        public C6834b() {
            this.f25391ah = -1;
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        protected int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f23004a != null) {
                mo13820a += C7640qw.m13920f(1, this.f23004a.longValue());
            }
            if (this.f23005b != null) {
                mo13820a += C7640qw.m13937c(2, this.f23005b.intValue());
            }
            if (this.f23006c != null) {
                mo13820a += C7640qw.m13947b(3, this.f23006c.booleanValue());
            }
            if (this.f23007d != null && this.f23007d.length > 0) {
                int i = 0;
                for (int i2 = 0; i2 < this.f23007d.length; i2++) {
                    i += C7640qw.m13938c(this.f23007d[i2]);
                }
                mo13820a = mo13820a + i + (this.f23007d.length * 1);
            }
            return this.f23008e != null ? mo13820a + C7640qw.m13923e(5, this.f23008e.longValue()) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6834b mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f23004a = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 16:
                        this.f23005b = Integer.valueOf(c7639qv.m13997g());
                        break;
                    case 24:
                        this.f23006c = Boolean.valueOf(c7639qv.m13994i());
                        break;
                    case 32:
                        int m13839b = C7652rg.m13839b(c7639qv, 32);
                        int length = this.f23007d == null ? 0 : this.f23007d.length;
                        int[] iArr = new int[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f23007d, 0, iArr, 0, length);
                        }
                        while (length < iArr.length - 1) {
                            iArr[length] = c7639qv.m13997g();
                            c7639qv.m14015a();
                            length++;
                        }
                        iArr[length] = c7639qv.m13997g();
                        this.f23007d = iArr;
                        break;
                    case 34:
                        int m14002d = c7639qv.m14002d(c7639qv.m13989n());
                        int m13983t = c7639qv.m13983t();
                        int i = 0;
                        while (c7639qv.m13985r() > 0) {
                            c7639qv.m13997g();
                            i++;
                        }
                        c7639qv.m13998f(m13983t);
                        int length2 = this.f23007d == null ? 0 : this.f23007d.length;
                        int[] iArr2 = new int[i + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f23007d, 0, iArr2, 0, length2);
                        }
                        while (length2 < iArr2.length) {
                            iArr2[length2] = c7639qv.m13997g();
                            length2++;
                        }
                        this.f23007d = iArr2;
                        c7639qv.m14000e(m14002d);
                        break;
                    case 40:
                        this.f23008e = Long.valueOf(c7639qv.m14001e());
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
            if (this.f23004a != null) {
                c7640qw.m13950b(1, this.f23004a.longValue());
            }
            if (this.f23005b != null) {
                c7640qw.m13973a(2, this.f23005b.intValue());
            }
            if (this.f23006c != null) {
                c7640qw.m13969a(3, this.f23006c.booleanValue());
            }
            if (this.f23007d != null && this.f23007d.length > 0) {
                for (int i = 0; i < this.f23007d.length; i++) {
                    c7640qw.m13973a(4, this.f23007d[i]);
                }
            }
            if (this.f23008e != null) {
                c7640qw.m13972a(5, this.f23008e.longValue());
            }
            super.mo13818a(c7640qw);
        }
    }

    /* renamed from: com.google.android.gms.internal.df$c */
    /* loaded from: classes2.dex */
    public static final class C6835c extends AbstractC7642qx<C6835c> {

        /* renamed from: a */
        public byte[] f23009a = null;

        /* renamed from: b */
        public byte[] f23010b = null;

        public C6835c() {
            this.f25391ah = -1;
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        protected int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f23009a != null) {
                mo13820a += C7640qw.m13946b(1, this.f23009a);
            }
            return this.f23010b != null ? mo13820a + C7640qw.m13946b(2, this.f23010b) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6835c mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f23009a = c7639qv.m13992k();
                        break;
                    case 18:
                        this.f23010b = c7639qv.m13992k();
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
            if (this.f23009a != null) {
                c7640qw.m13968a(1, this.f23009a);
            }
            if (this.f23010b != null) {
                c7640qw.m13968a(2, this.f23010b);
            }
            super.mo13818a(c7640qw);
        }
    }

    /* renamed from: com.google.android.gms.internal.df$d */
    /* loaded from: classes2.dex */
    public static final class C6836d extends AbstractC7642qx<C6836d> {

        /* renamed from: a */
        public byte[] f23011a = null;

        /* renamed from: b */
        public byte[] f23012b = null;

        /* renamed from: c */
        public byte[] f23013c = null;

        /* renamed from: d */
        public byte[] f23014d = null;

        public C6836d() {
            this.f25391ah = -1;
        }

        /* renamed from: a */
        public static C6836d m16160a(byte[] bArr) {
            return (C6836d) AbstractC7649rd.m13856a(new C6836d(), bArr);
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        protected int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f23011a != null) {
                mo13820a += C7640qw.m13946b(1, this.f23011a);
            }
            if (this.f23012b != null) {
                mo13820a += C7640qw.m13946b(2, this.f23012b);
            }
            if (this.f23013c != null) {
                mo13820a += C7640qw.m13946b(3, this.f23013c);
            }
            return this.f23014d != null ? mo13820a + C7640qw.m13946b(4, this.f23014d) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6836d mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f23011a = c7639qv.m13992k();
                        break;
                    case 18:
                        this.f23012b = c7639qv.m13992k();
                        break;
                    case 26:
                        this.f23013c = c7639qv.m13992k();
                        break;
                    case 34:
                        this.f23014d = c7639qv.m13992k();
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
            if (this.f23011a != null) {
                c7640qw.m13968a(1, this.f23011a);
            }
            if (this.f23012b != null) {
                c7640qw.m13968a(2, this.f23012b);
            }
            if (this.f23013c != null) {
                c7640qw.m13968a(3, this.f23013c);
            }
            if (this.f23014d != null) {
                c7640qw.m13968a(4, this.f23014d);
            }
            super.mo13818a(c7640qw);
        }
    }

    /* renamed from: com.google.android.gms.internal.df$e */
    /* loaded from: classes2.dex */
    public static final class C6837e extends AbstractC7642qx<C6837e> {

        /* renamed from: a */
        public Long f23015a = null;

        /* renamed from: b */
        public String f23016b = null;

        /* renamed from: c */
        public byte[] f23017c = null;

        public C6837e() {
            this.f25391ah = -1;
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        protected int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f23015a != null) {
                mo13820a += C7640qw.m13920f(1, this.f23015a.longValue());
            }
            if (this.f23016b != null) {
                mo13820a += C7640qw.m13948b(3, this.f23016b);
            }
            return this.f23017c != null ? mo13820a + C7640qw.m13946b(4, this.f23017c) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6837e mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 8:
                        this.f23015a = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 26:
                        this.f23016b = c7639qv.m13993j();
                        break;
                    case 34:
                        this.f23017c = c7639qv.m13992k();
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
            if (this.f23015a != null) {
                c7640qw.m13950b(1, this.f23015a.longValue());
            }
            if (this.f23016b != null) {
                c7640qw.m13970a(3, this.f23016b);
            }
            if (this.f23017c != null) {
                c7640qw.m13968a(4, this.f23017c);
            }
            super.mo13818a(c7640qw);
        }
    }

    /* renamed from: com.google.android.gms.internal.df$f */
    /* loaded from: classes2.dex */
    public static final class C6838f extends AbstractC7642qx<C6838f> {

        /* renamed from: a */
        public byte[][] f23018a = C7652rg.f25400g;

        /* renamed from: b */
        public byte[] f23019b = null;

        /* renamed from: c */
        public Integer f23020c = null;

        /* renamed from: d */
        public Integer f23021d = null;

        public C6838f() {
            this.f25391ah = -1;
        }

        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        protected int mo13820a() {
            int i;
            int mo13820a = super.mo13820a();
            if (this.f23018a == null || this.f23018a.length <= 0) {
                i = mo13820a;
            } else {
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < this.f23018a.length; i4++) {
                    byte[] bArr = this.f23018a[i4];
                    if (bArr != null) {
                        i3++;
                        i2 += C7640qw.m13932c(bArr);
                    }
                }
                i = mo13820a + i2 + (i3 * 1);
            }
            if (this.f23019b != null) {
                i += C7640qw.m13946b(2, this.f23019b);
            }
            if (this.f23020c != null) {
                i += C7640qw.m13937c(3, this.f23020c.intValue());
            }
            return this.f23021d != null ? i + C7640qw.m13937c(4, this.f23021d.intValue()) : i;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6838f mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        int m13839b = C7652rg.m13839b(c7639qv, 10);
                        int length = this.f23018a == null ? 0 : this.f23018a.length;
                        byte[][] bArr = new byte[m13839b + length];
                        if (length != 0) {
                            System.arraycopy(this.f23018a, 0, bArr, 0, length);
                        }
                        while (length < bArr.length - 1) {
                            bArr[length] = c7639qv.m13992k();
                            c7639qv.m14015a();
                            length++;
                        }
                        bArr[length] = c7639qv.m13992k();
                        this.f23018a = bArr;
                        break;
                    case 18:
                        this.f23019b = c7639qv.m13992k();
                        break;
                    case 24:
                        int m13997g = c7639qv.m13997g();
                        switch (m13997g) {
                            case 0:
                            case 1:
                                this.f23020c = Integer.valueOf(m13997g);
                                continue;
                        }
                    case 32:
                        int m13997g2 = c7639qv.m13997g();
                        switch (m13997g2) {
                            case 0:
                            case 1:
                                this.f23021d = Integer.valueOf(m13997g2);
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
            if (this.f23018a != null && this.f23018a.length > 0) {
                for (int i = 0; i < this.f23018a.length; i++) {
                    byte[] bArr = this.f23018a[i];
                    if (bArr != null) {
                        c7640qw.m13968a(1, bArr);
                    }
                }
            }
            if (this.f23019b != null) {
                c7640qw.m13968a(2, this.f23019b);
            }
            if (this.f23020c != null) {
                c7640qw.m13973a(3, this.f23020c.intValue());
            }
            if (this.f23021d != null) {
                c7640qw.m13973a(4, this.f23021d.intValue());
            }
            super.mo13818a(c7640qw);
        }
    }
}
