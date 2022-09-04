package com.google.android.gms.internal;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.px */
/* loaded from: classes2.dex */
public final class C7607px extends AbstractC7649rd {

    /* renamed from: a */
    public int f25226a;

    /* renamed from: b */
    public long f25227b;

    /* renamed from: c */
    public C7608a[] f25228c;

    /* renamed from: com.google.android.gms.internal.px$a */
    /* loaded from: classes2.dex */
    public static final class C7608a extends AbstractC7649rd {

        /* renamed from: d */
        private static volatile C7608a[] f25229d;

        /* renamed from: a */
        public String f25230a;

        /* renamed from: b */
        public String f25231b;

        /* renamed from: c */
        public byte[] f25232c;

        public C7608a() {
            m14078c();
        }

        /* renamed from: a */
        public static C7608a m14080a(byte[] bArr) {
            return (C7608a) AbstractC7649rd.m13856a(new C7608a(), bArr);
        }

        /* renamed from: b */
        public static C7608a[] m14079b() {
            if (f25229d == null) {
                synchronized (C7647rb.f25390c) {
                    if (f25229d == null) {
                        f25229d = new C7608a[0];
                    }
                }
            }
            return f25229d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public int mo13820a() {
            int mo13820a = super.mo13820a();
            if (!this.f25230a.equals("")) {
                mo13820a += C7640qw.m13948b(1, this.f25230a);
            }
            if (!this.f25231b.equals("")) {
                mo13820a += C7640qw.m13948b(2, this.f25231b);
            }
            return !Arrays.equals(this.f25232c, C7652rg.f25401h) ? mo13820a + C7640qw.m13946b(3, this.f25232c) : mo13820a;
        }

        @Override // com.google.android.gms.internal.AbstractC7649rd
        /* renamed from: a */
        public C7608a mo13816b(C7639qv c7639qv) {
            while (true) {
                int m14015a = c7639qv.m14015a();
                switch (m14015a) {
                    case 0:
                        break;
                    case 10:
                        this.f25230a = c7639qv.m13993j();
                        break;
                    case 18:
                        this.f25231b = c7639qv.m13993j();
                        break;
                    case 26:
                        this.f25232c = c7639qv.m13992k();
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
            if (!this.f25230a.equals("")) {
                c7640qw.m13970a(1, this.f25230a);
            }
            if (!this.f25231b.equals("")) {
                c7640qw.m13970a(2, this.f25231b);
            }
            if (!Arrays.equals(this.f25232c, C7652rg.f25401h)) {
                c7640qw.m13968a(3, this.f25232c);
            }
            super.mo13818a(c7640qw);
        }

        /* renamed from: c */
        public C7608a m14078c() {
            this.f25230a = "";
            this.f25231b = "";
            this.f25232c = C7652rg.f25401h;
            this.f25391ah = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7608a)) {
                return false;
            }
            C7608a c7608a = (C7608a) obj;
            if (this.f25230a == null) {
                if (c7608a.f25230a != null) {
                    return false;
                }
            } else if (!this.f25230a.equals(c7608a.f25230a)) {
                return false;
            }
            if (this.f25231b == null) {
                if (c7608a.f25231b != null) {
                    return false;
                }
            } else if (!this.f25231b.equals(c7608a.f25231b)) {
                return false;
            }
            return Arrays.equals(this.f25232c, c7608a.f25232c);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f25230a == null ? 0 : this.f25230a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31;
            if (this.f25231b != null) {
                i = this.f25231b.hashCode();
            }
            return ((hashCode + i) * 31) + Arrays.hashCode(this.f25232c);
        }
    }

    public C7607px() {
        m14082b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public int mo13820a() {
        int mo13820a = super.mo13820a();
        if (this.f25226a != 0) {
            mo13820a += C7640qw.m13937c(1, this.f25226a);
        }
        if (this.f25227b != 0) {
            mo13820a += C7640qw.m13920f(3, this.f25227b);
        }
        if (this.f25228c == null || this.f25228c.length <= 0) {
            return mo13820a;
        }
        int i = mo13820a;
        for (int i2 = 0; i2 < this.f25228c.length; i2++) {
            C7608a c7608a = this.f25228c[i2];
            if (c7608a != null) {
                i += C7640qw.m13935c(4, c7608a);
            }
        }
        return i;
    }

    @Override // com.google.android.gms.internal.AbstractC7649rd
    /* renamed from: a */
    public C7607px mo13816b(C7639qv c7639qv) {
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
                            this.f25226a = m13997g;
                            continue;
                    }
                case 24:
                    this.f25227b = c7639qv.m13999f();
                    break;
                case 34:
                    int m13839b = C7652rg.m13839b(c7639qv, 34);
                    int length = this.f25228c == null ? 0 : this.f25228c.length;
                    C7608a[] c7608aArr = new C7608a[m13839b + length];
                    if (length != 0) {
                        System.arraycopy(this.f25228c, 0, c7608aArr, 0, length);
                    }
                    while (length < c7608aArr.length - 1) {
                        c7608aArr[length] = new C7608a();
                        c7639qv.m14011a(c7608aArr[length]);
                        c7639qv.m14015a();
                        length++;
                    }
                    c7608aArr[length] = new C7608a();
                    c7639qv.m14011a(c7608aArr[length]);
                    this.f25228c = c7608aArr;
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
        if (this.f25226a != 0) {
            c7640qw.m13973a(1, this.f25226a);
        }
        if (this.f25227b != 0) {
            c7640qw.m13950b(3, this.f25227b);
        }
        if (this.f25228c != null && this.f25228c.length > 0) {
            for (int i = 0; i < this.f25228c.length; i++) {
                C7608a c7608a = this.f25228c[i];
                if (c7608a != null) {
                    c7640qw.m13971a(4, c7608a);
                }
            }
        }
        super.mo13818a(c7640qw);
    }

    /* renamed from: b */
    public C7607px m14082b() {
        this.f25226a = 0;
        this.f25227b = 0L;
        this.f25228c = C7608a.m14079b();
        this.f25391ah = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7607px)) {
            return false;
        }
        C7607px c7607px = (C7607px) obj;
        return this.f25226a == c7607px.f25226a && this.f25227b == c7607px.f25227b && C7647rb.m13867a(this.f25228c, c7607px.f25228c);
    }

    public int hashCode() {
        return ((((((getClass().getName().hashCode() + 527) * 31) + this.f25226a) * 31) + ((int) (this.f25227b ^ (this.f25227b >>> 32)))) * 31) + C7647rb.m13868a(this.f25228c);
    }
}
