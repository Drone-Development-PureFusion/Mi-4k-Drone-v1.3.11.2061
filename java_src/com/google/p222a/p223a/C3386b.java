package com.google.p222a.p223a;

import java.io.InputStream;
import java.util.Vector;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.google.a.a.b */
/* loaded from: classes2.dex */
public final class C3386b {

    /* renamed from: a */
    private final byte[] f13607a;

    /* renamed from: b */
    private int f13608b;

    /* renamed from: c */
    private int f13609c;

    /* renamed from: d */
    private int f13610d;

    /* renamed from: e */
    private final InputStream f13611e;

    /* renamed from: f */
    private int f13612f;

    /* renamed from: g */
    private int f13613g;

    /* renamed from: h */
    private int f13614h;

    /* renamed from: i */
    private int f13615i;

    /* renamed from: j */
    private int f13616j;

    /* renamed from: k */
    private int f13617k;

    private C3386b(InputStream inputStream) {
        this.f13614h = Integer.MAX_VALUE;
        this.f13616j = 64;
        this.f13617k = 67108864;
        this.f13607a = new byte[4096];
        this.f13608b = 0;
        this.f13610d = 0;
        this.f13611e = inputStream;
    }

    private C3386b(byte[] bArr, int i, int i2) {
        this.f13614h = Integer.MAX_VALUE;
        this.f13616j = 64;
        this.f13617k = 67108864;
        this.f13607a = bArr;
        this.f13608b = i + i2;
        this.f13610d = i;
        this.f13611e = null;
    }

    /* renamed from: a */
    public static C3386b m28018a(InputStream inputStream) {
        return new C3386b(inputStream);
    }

    /* renamed from: a */
    public static C3386b m28016a(byte[] bArr, int i, int i2) {
        return new C3386b(bArr, i, i2);
    }

    /* renamed from: a */
    private boolean m28017a(boolean z) {
        if (this.f13610d < this.f13608b) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        if (this.f13613g + this.f13608b == this.f13614h) {
            if (!z) {
                return false;
            }
            throw C3389d.m27946a();
        }
        this.f13613g += this.f13608b;
        this.f13610d = 0;
        this.f13608b = this.f13611e == null ? -1 : this.f13611e.read(this.f13607a);
        if (this.f13608b == 0 || this.f13608b < -1) {
            throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f13608b + "\nThe InputStream implementation is buggy.");
        }
        if (this.f13608b == -1) {
            this.f13608b = 0;
            if (!z) {
                return false;
            }
            throw C3389d.m27946a();
        }
        m27996p();
        int i = this.f13613g + this.f13608b + this.f13609c;
        if (i <= this.f13617k && i >= 0) {
            return true;
        }
        throw C3389d.m27939h();
    }

    /* renamed from: p */
    private void m27996p() {
        this.f13608b += this.f13609c;
        int i = this.f13613g + this.f13608b;
        if (i <= this.f13614h) {
            this.f13609c = 0;
            return;
        }
        this.f13609c = i - this.f13614h;
        this.f13608b -= this.f13609c;
    }

    /* renamed from: a */
    public int m28021a() {
        if (m27998n()) {
            this.f13612f = 0;
            return 0;
        }
        this.f13612f = m28002j();
        if (this.f13612f != 0) {
            return this.f13612f;
        }
        throw C3389d.m27943d();
    }

    /* renamed from: a */
    public void m28020a(int i) {
        if (this.f13612f != i) {
            throw C3389d.m27942e();
        }
    }

    /* renamed from: a */
    public void m28019a(AbstractC3390e abstractC3390e) {
        int m28002j = m28002j();
        if (this.f13615i >= this.f13616j) {
            throw C3389d.m27940g();
        }
        int m28012c = m28012c(m28002j);
        this.f13615i++;
        abstractC3390e.mo4530a(this);
        m28020a(0);
        this.f13615i--;
        m28010d(m28012c);
    }

    /* renamed from: b */
    public void m28015b() {
        int m28021a;
        do {
            m28021a = m28021a();
            if (m28021a == 0) {
                return;
            }
        } while (m28014b(m28021a));
    }

    /* renamed from: b */
    public boolean m28014b(int i) {
        switch (C3391f.m27933a(i)) {
            case 0:
                m28009e();
                return true;
            case 1:
                m27999m();
                return true;
            case 2:
                m28006f(m28002j());
                return true;
            case 3:
                m28015b();
                m28020a(C3391f.m27932a(C3391f.m27931b(i), 4));
                return true;
            case 4:
                return false;
            case 5:
                m28000l();
                return true;
            default:
                throw C3389d.m27941f();
        }
    }

    /* renamed from: c */
    public int m28012c(int i) {
        if (i < 0) {
            throw C3389d.m27945b();
        }
        int i2 = this.f13613g + this.f13610d + i;
        int i3 = this.f13614h;
        if (i2 > i3) {
            throw C3389d.m27946a();
        }
        this.f13614h = i2;
        m27996p();
        return i3;
    }

    /* renamed from: c */
    public long m28013c() {
        return m28001k();
    }

    /* renamed from: d */
    public long m28011d() {
        return m28001k();
    }

    /* renamed from: d */
    public void m28010d(int i) {
        this.f13614h = i;
        m27996p();
    }

    /* renamed from: e */
    public int m28009e() {
        return m28002j();
    }

    /* renamed from: e */
    public byte[] m28008e(int i) {
        if (i < 0) {
            throw C3389d.m27945b();
        }
        if (this.f13613g + this.f13610d + i > this.f13614h) {
            m28006f((this.f13614h - this.f13613g) - this.f13610d);
            throw C3389d.m27946a();
        } else if (i <= this.f13608b - this.f13610d) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f13607a, this.f13610d, bArr, 0, i);
            this.f13610d += i;
            return bArr;
        } else if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i2 = this.f13608b - this.f13610d;
            System.arraycopy(this.f13607a, this.f13610d, bArr2, 0, i2);
            this.f13610d = this.f13608b;
            m28017a(true);
            while (i - i2 > this.f13608b) {
                System.arraycopy(this.f13607a, 0, bArr2, i2, this.f13608b);
                i2 += this.f13608b;
                this.f13610d = this.f13608b;
                m28017a(true);
            }
            System.arraycopy(this.f13607a, 0, bArr2, i2, i - i2);
            this.f13610d = i - i2;
            return bArr2;
        } else {
            int i3 = this.f13610d;
            int i4 = this.f13608b;
            this.f13613g += this.f13608b;
            this.f13610d = 0;
            this.f13608b = 0;
            Vector vector = new Vector();
            int i5 = i - (i4 - i3);
            while (i5 > 0) {
                byte[] bArr3 = new byte[Math.min(i5, 4096)];
                int i6 = 0;
                while (i6 < bArr3.length) {
                    int read = this.f13611e == null ? -1 : this.f13611e.read(bArr3, i6, bArr3.length - i6);
                    if (read == -1) {
                        throw C3389d.m27946a();
                    }
                    this.f13613g += read;
                    i6 += read;
                }
                vector.addElement(bArr3);
                i5 -= bArr3.length;
            }
            byte[] bArr4 = new byte[i];
            int i7 = i4 - i3;
            System.arraycopy(this.f13607a, i3, bArr4, 0, i7);
            int i8 = i7;
            for (int i9 = 0; i9 < vector.size(); i9++) {
                byte[] bArr5 = (byte[]) vector.elementAt(i9);
                System.arraycopy(bArr5, 0, bArr4, i8, bArr5.length);
                i8 += bArr5.length;
            }
            return bArr4;
        }
    }

    /* renamed from: f */
    public void m28006f(int i) {
        if (i < 0) {
            throw C3389d.m27945b();
        }
        if (this.f13613g + this.f13610d + i > this.f13614h) {
            m28006f((this.f13614h - this.f13613g) - this.f13610d);
            throw C3389d.m27946a();
        } else if (i <= this.f13608b - this.f13610d) {
            this.f13610d += i;
        } else {
            int i2 = this.f13608b - this.f13610d;
            this.f13613g += this.f13608b;
            this.f13610d = 0;
            this.f13608b = 0;
            int i3 = i2;
            while (i3 < i) {
                int skip = this.f13611e == null ? -1 : (int) this.f13611e.skip(i - i3);
                if (skip <= 0) {
                    throw C3389d.m27946a();
                }
                i3 += skip;
                this.f13613g = skip + this.f13613g;
            }
        }
    }

    /* renamed from: f */
    public boolean m28007f() {
        return m28002j() != 0;
    }

    /* renamed from: g */
    public String m28005g() {
        int m28002j = m28002j();
        if (m28002j > this.f13608b - this.f13610d || m28002j <= 0) {
            return new String(m28008e(m28002j), "UTF-8");
        }
        String str = new String(this.f13607a, this.f13610d, m28002j, "UTF-8");
        this.f13610d = m28002j + this.f13610d;
        return str;
    }

    /* renamed from: h */
    public C3385a m28004h() {
        int m28002j = m28002j();
        if (m28002j > this.f13608b - this.f13610d || m28002j <= 0) {
            return C3385a.m28024a(m28008e(m28002j));
        }
        C3385a m28023a = C3385a.m28023a(this.f13607a, this.f13610d, m28002j);
        this.f13610d = m28002j + this.f13610d;
        return m28023a;
    }

    /* renamed from: i */
    public int m28003i() {
        return m28002j();
    }

    /* renamed from: j */
    public int m28002j() {
        byte m27997o = m27997o();
        if (m27997o >= 0) {
            return m27997o;
        }
        int i = m27997o & Byte.MAX_VALUE;
        byte m27997o2 = m27997o();
        if (m27997o2 >= 0) {
            return i | (m27997o2 << 7);
        }
        int i2 = i | ((m27997o2 & Byte.MAX_VALUE) << 7);
        byte m27997o3 = m27997o();
        if (m27997o3 >= 0) {
            return i2 | (m27997o3 << 14);
        }
        int i3 = i2 | ((m27997o3 & Byte.MAX_VALUE) << 14);
        byte m27997o4 = m27997o();
        if (m27997o4 >= 0) {
            return i3 | (m27997o4 << 21);
        }
        int i4 = i3 | ((m27997o4 & Byte.MAX_VALUE) << 21);
        byte m27997o5 = m27997o();
        int i5 = i4 | (m27997o5 << 28);
        if (m27997o5 >= 0) {
            return i5;
        }
        for (int i6 = 0; i6 < 5; i6++) {
            if (m27997o() >= 0) {
                return i5;
            }
        }
        throw C3389d.m27944c();
    }

    /* renamed from: k */
    public long m28001k() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m27997o = m27997o();
            j |= (m27997o & Byte.MAX_VALUE) << i;
            if ((m27997o & 128) == 0) {
                return j;
            }
        }
        throw C3389d.m27944c();
    }

    /* renamed from: l */
    public int m28000l() {
        return (m27997o() & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | ((m27997o() & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | ((m27997o() & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((m27997o() & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24);
    }

    /* renamed from: m */
    public long m27999m() {
        byte m27997o = m27997o();
        byte m27997o2 = m27997o();
        return ((m27997o2 & 255) << 8) | (m27997o & 255) | ((m27997o() & 255) << 16) | ((m27997o() & 255) << 24) | ((m27997o() & 255) << 32) | ((m27997o() & 255) << 40) | ((m27997o() & 255) << 48) | ((m27997o() & 255) << 56);
    }

    /* renamed from: n */
    public boolean m27998n() {
        return this.f13610d == this.f13608b && !m28017a(false);
    }

    /* renamed from: o */
    public byte m27997o() {
        if (this.f13610d == this.f13608b) {
            m28017a(true);
        }
        byte[] bArr = this.f13607a;
        int i = this.f13610d;
        this.f13610d = i + 1;
        return bArr[i];
    }
}
