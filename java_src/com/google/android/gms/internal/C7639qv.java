package com.google.android.gms.internal;

import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.google.android.gms.internal.qv */
/* loaded from: classes2.dex */
public final class C7639qv {

    /* renamed from: a */
    private final byte[] f25363a;

    /* renamed from: b */
    private int f25364b;

    /* renamed from: c */
    private int f25365c;

    /* renamed from: d */
    private int f25366d;

    /* renamed from: e */
    private int f25367e;

    /* renamed from: f */
    private int f25368f;

    /* renamed from: h */
    private int f25370h;

    /* renamed from: g */
    private int f25369g = Integer.MAX_VALUE;

    /* renamed from: i */
    private int f25371i = 64;

    /* renamed from: j */
    private int f25372j = 67108864;

    private C7639qv(byte[] bArr, int i, int i2) {
        this.f25363a = bArr;
        this.f25364b = i;
        this.f25365c = i + i2;
        this.f25367e = i;
    }

    /* renamed from: a */
    public static long m14012a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* renamed from: a */
    public static C7639qv m14009a(byte[] bArr) {
        return m14008a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C7639qv m14008a(byte[] bArr, int i, int i2) {
        return new C7639qv(bArr, i, i2);
    }

    /* renamed from: c */
    public static int m14004c(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* renamed from: v */
    private void m13981v() {
        this.f25365c += this.f25366d;
        int i = this.f25365c;
        if (i <= this.f25369g) {
            this.f25366d = 0;
            return;
        }
        this.f25366d = i - this.f25369g;
        this.f25365c -= this.f25366d;
    }

    /* renamed from: a */
    public int m14015a() {
        if (m13984s()) {
            this.f25368f = 0;
            return 0;
        }
        this.f25368f = m13989n();
        if (this.f25368f != 0) {
            return this.f25368f;
        }
        throw C7648rc.m13861d();
    }

    /* renamed from: a */
    public void m14014a(int i) {
        if (this.f25368f != i) {
            throw C7648rc.m13860e();
        }
    }

    /* renamed from: a */
    public void m14011a(AbstractC7649rd abstractC7649rd) {
        int m13989n = m13989n();
        if (this.f25370h >= this.f25371i) {
            throw C7648rc.m13858g();
        }
        int m14002d = m14002d(m13989n);
        this.f25370h++;
        abstractC7649rd.mo13816b(this);
        m14014a(0);
        this.f25370h--;
        m14000e(m14002d);
    }

    /* renamed from: a */
    public void m14010a(AbstractC7649rd abstractC7649rd, int i) {
        if (this.f25370h >= this.f25371i) {
            throw C7648rc.m13858g();
        }
        this.f25370h++;
        abstractC7649rd.mo13816b(this);
        m14014a(C7652rg.m13842a(i, 4));
        this.f25370h--;
    }

    /* renamed from: a */
    public byte[] m14013a(int i, int i2) {
        if (i2 == 0) {
            return C7652rg.f25401h;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f25363a, this.f25364b + i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: b */
    public void m14007b() {
        int m14015a;
        do {
            m14015a = m14015a();
            if (m14015a == 0) {
                return;
            }
        } while (m14006b(m14015a));
    }

    /* renamed from: b */
    public boolean m14006b(int i) {
        switch (C7652rg.m13843a(i)) {
            case 0:
                m13997g();
                return true;
            case 1:
                m13986q();
                return true;
            case 2:
                m13996g(m13989n());
                return true;
            case 3:
                m14007b();
                m14014a(C7652rg.m13842a(C7652rg.m13840b(i), 4));
                return true;
            case 4:
                return false;
            case 5:
                m13987p();
                return true;
            default:
                throw C7648rc.m13859f();
        }
    }

    /* renamed from: c */
    public double m14005c() {
        return Double.longBitsToDouble(m13986q());
    }

    /* renamed from: d */
    public float m14003d() {
        return Float.intBitsToFloat(m13987p());
    }

    /* renamed from: d */
    public int m14002d(int i) {
        if (i < 0) {
            throw C7648rc.m13863b();
        }
        int i2 = this.f25367e + i;
        int i3 = this.f25369g;
        if (i2 > i3) {
            throw C7648rc.m13864a();
        }
        this.f25369g = i2;
        m13981v();
        return i3;
    }

    /* renamed from: e */
    public long m14001e() {
        return m13988o();
    }

    /* renamed from: e */
    public void m14000e(int i) {
        this.f25369g = i;
        m13981v();
    }

    /* renamed from: f */
    public long m13999f() {
        return m13988o();
    }

    /* renamed from: f */
    public void m13998f(int i) {
        if (i > this.f25367e - this.f25364b) {
            throw new IllegalArgumentException(new StringBuilder(50).append("Position ").append(i).append(" is beyond current ").append(this.f25367e - this.f25364b).toString());
        } else if (i < 0) {
            throw new IllegalArgumentException(new StringBuilder(24).append("Bad position ").append(i).toString());
        } else {
            this.f25367e = this.f25364b + i;
        }
    }

    /* renamed from: g */
    public int m13997g() {
        return m13989n();
    }

    /* renamed from: g */
    public void m13996g(int i) {
        if (i < 0) {
            throw C7648rc.m13863b();
        }
        if (this.f25367e + i > this.f25369g) {
            m13996g(this.f25369g - this.f25367e);
            throw C7648rc.m13864a();
        } else if (i > this.f25365c - this.f25367e) {
            throw C7648rc.m13864a();
        } else {
            this.f25367e += i;
        }
    }

    /* renamed from: h */
    public long m13995h() {
        return m13986q();
    }

    /* renamed from: i */
    public boolean m13994i() {
        return m13989n() != 0;
    }

    /* renamed from: j */
    public String m13993j() {
        int m13989n = m13989n();
        if (m13989n < 0) {
            throw C7648rc.m13863b();
        }
        if (m13989n > this.f25365c - this.f25367e) {
            throw C7648rc.m13864a();
        }
        String str = new String(this.f25363a, this.f25367e, m13989n, C7647rb.f25388a);
        this.f25367e = m13989n + this.f25367e;
        return str;
    }

    /* renamed from: k */
    public byte[] m13992k() {
        int m13989n = m13989n();
        if (m13989n < 0) {
            throw C7648rc.m13863b();
        }
        if (m13989n == 0) {
            return C7652rg.f25401h;
        }
        if (m13989n > this.f25365c - this.f25367e) {
            throw C7648rc.m13864a();
        }
        byte[] bArr = new byte[m13989n];
        System.arraycopy(this.f25363a, this.f25367e, bArr, 0, m13989n);
        this.f25367e = m13989n + this.f25367e;
        return bArr;
    }

    /* renamed from: l */
    public int m13991l() {
        return m14004c(m13989n());
    }

    /* renamed from: m */
    public long m13990m() {
        return m14012a(m13988o());
    }

    /* renamed from: n */
    public int m13989n() {
        byte m13982u = m13982u();
        if (m13982u >= 0) {
            return m13982u;
        }
        int i = m13982u & Byte.MAX_VALUE;
        byte m13982u2 = m13982u();
        if (m13982u2 >= 0) {
            return i | (m13982u2 << 7);
        }
        int i2 = i | ((m13982u2 & Byte.MAX_VALUE) << 7);
        byte m13982u3 = m13982u();
        if (m13982u3 >= 0) {
            return i2 | (m13982u3 << 14);
        }
        int i3 = i2 | ((m13982u3 & Byte.MAX_VALUE) << 14);
        byte m13982u4 = m13982u();
        if (m13982u4 >= 0) {
            return i3 | (m13982u4 << 21);
        }
        int i4 = i3 | ((m13982u4 & Byte.MAX_VALUE) << 21);
        byte m13982u5 = m13982u();
        int i5 = i4 | (m13982u5 << 28);
        if (m13982u5 >= 0) {
            return i5;
        }
        for (int i6 = 0; i6 < 5; i6++) {
            if (m13982u() >= 0) {
                return i5;
            }
        }
        throw C7648rc.m13862c();
    }

    /* renamed from: o */
    public long m13988o() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m13982u = m13982u();
            j |= (m13982u & Byte.MAX_VALUE) << i;
            if ((m13982u & 128) == 0) {
                return j;
            }
        }
        throw C7648rc.m13862c();
    }

    /* renamed from: p */
    public int m13987p() {
        return (m13982u() & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | ((m13982u() & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | ((m13982u() & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((m13982u() & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24);
    }

    /* renamed from: q */
    public long m13986q() {
        byte m13982u = m13982u();
        byte m13982u2 = m13982u();
        return ((m13982u2 & 255) << 8) | (m13982u & 255) | ((m13982u() & 255) << 16) | ((m13982u() & 255) << 24) | ((m13982u() & 255) << 32) | ((m13982u() & 255) << 40) | ((m13982u() & 255) << 48) | ((m13982u() & 255) << 56);
    }

    /* renamed from: r */
    public int m13985r() {
        if (this.f25369g == Integer.MAX_VALUE) {
            return -1;
        }
        return this.f25369g - this.f25367e;
    }

    /* renamed from: s */
    public boolean m13984s() {
        return this.f25367e == this.f25365c;
    }

    /* renamed from: t */
    public int m13983t() {
        return this.f25367e - this.f25364b;
    }

    /* renamed from: u */
    public byte m13982u() {
        if (this.f25367e == this.f25365c) {
            throw C7648rc.m13864a();
        }
        byte[] bArr = this.f25363a;
        int i = this.f25367e;
        this.f25367e = i + 1;
        return bArr[i];
    }
}
