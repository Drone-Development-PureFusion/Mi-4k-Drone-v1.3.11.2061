package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.ce */
/* loaded from: classes2.dex */
public interface AbstractC6801ce {

    /* renamed from: com.google.android.gms.internal.ce$a */
    /* loaded from: classes2.dex */
    public static final class C6802a extends AbstractC7642qx<C6802a> {

        /* renamed from: a */
        public String f22892a = null;

        /* renamed from: b */
        public Long f22893b = null;

        /* renamed from: c */
        public String f22894c = null;

        /* renamed from: d */
        public String f22895d = null;

        /* renamed from: e */
        public String f22896e = null;

        /* renamed from: f */
        public Long f22897f = null;

        /* renamed from: g */
        public Long f22898g = null;

        /* renamed from: h */
        public String f22899h = null;

        /* renamed from: i */
        public Long f22900i = null;

        /* renamed from: j */
        public String f22901j = null;

        public C6802a() {
            this.f25391ah = -1;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7642qx, com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (this.f22892a != null) {
                mo13820a += C7640qw.m13948b(1, this.f22892a);
            }
            if (this.f22893b != null) {
                mo13820a += C7640qw.m13920f(2, this.f22893b.longValue());
            }
            if (this.f22894c != null) {
                mo13820a += C7640qw.m13948b(3, this.f22894c);
            }
            if (this.f22895d != null) {
                mo13820a += C7640qw.m13948b(4, this.f22895d);
            }
            if (this.f22896e != null) {
                mo13820a += C7640qw.m13948b(5, this.f22896e);
            }
            if (this.f22897f != null) {
                mo13820a += C7640qw.m13920f(6, this.f22897f.longValue());
            }
            if (this.f22898g != null) {
                mo13820a += C7640qw.m13920f(7, this.f22898g.longValue());
            }
            if (this.f22899h != null) {
                mo13820a += C7640qw.m13948b(8, this.f22899h);
            }
            if (this.f22900i != null) {
                mo13820a += C7640qw.m13920f(9, this.f22900i.longValue());
            }
            return this.f22901j != null ? mo13820a + C7640qw.m13948b(10, this.f22901j) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C6802a mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f22892a = c7639qv.m13993j();
                        break;
                    case 16:
                        this.f22893b = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 26:
                        this.f22894c = c7639qv.m13993j();
                        break;
                    case 34:
                        this.f22895d = c7639qv.m13993j();
                        break;
                    case 42:
                        this.f22896e = c7639qv.m13993j();
                        break;
                    case 48:
                        this.f22897f = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 56:
                        this.f22898g = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 66:
                        this.f22899h = c7639qv.m13993j();
                        break;
                    case 72:
                        this.f22900i = Long.valueOf(c7639qv.m13999f());
                        break;
                    case 82:
                        this.f22901j = c7639qv.m13993j();
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
            if (this.f22892a != null) {
                c7640qw.m13970a(1, this.f22892a);
            }
            if (this.f22893b != null) {
                c7640qw.m13950b(2, this.f22893b.longValue());
            }
            if (this.f22894c != null) {
                c7640qw.m13970a(3, this.f22894c);
            }
            if (this.f22895d != null) {
                c7640qw.m13970a(4, this.f22895d);
            }
            if (this.f22896e != null) {
                c7640qw.m13970a(5, this.f22896e);
            }
            if (this.f22897f != null) {
                c7640qw.m13950b(6, this.f22897f.longValue());
            }
            if (this.f22898g != null) {
                c7640qw.m13950b(7, this.f22898g.longValue());
            }
            if (this.f22899h != null) {
                c7640qw.m13970a(8, this.f22899h);
            }
            if (this.f22900i != null) {
                c7640qw.m13950b(9, this.f22900i.longValue());
            }
            if (this.f22901j != null) {
                c7640qw.m13970a(10, this.f22901j);
            }
            super.mo13818a(c7640qw);
        }
    }
}
