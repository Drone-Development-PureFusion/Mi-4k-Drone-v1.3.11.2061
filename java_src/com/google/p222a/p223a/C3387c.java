package com.google.p222a.p223a;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
/* renamed from: com.google.a.a.c */
/* loaded from: classes2.dex */
public final class C3387c {

    /* renamed from: a */
    private final byte[] f13618a;

    /* renamed from: b */
    private final int f13619b;

    /* renamed from: c */
    private int f13620c;

    /* renamed from: d */
    private final OutputStream f13621d;

    /* renamed from: com.google.a.a.c$a */
    /* loaded from: classes2.dex */
    public static class C3388a extends IOException {
        C3388a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private C3387c(OutputStream outputStream, byte[] bArr) {
        this.f13621d = outputStream;
        this.f13618a = bArr;
        this.f13620c = 0;
        this.f13619b = bArr.length;
    }

    private C3387c(byte[] bArr, int i, int i2) {
        this.f13621d = null;
        this.f13618a = bArr;
        this.f13620c = i;
        this.f13619b = i + i2;
    }

    /* renamed from: a */
    public static C3387c m27983a(OutputStream outputStream) {
        return m27982a(outputStream, 4096);
    }

    /* renamed from: a */
    public static C3387c m27982a(OutputStream outputStream, int i) {
        return new C3387c(outputStream, new byte[i]);
    }

    /* renamed from: a */
    public static C3387c m27978a(byte[] bArr, int i, int i2) {
        return new C3387c(bArr, i, i2);
    }

    /* renamed from: b */
    public static int m27973b(int i, C3385a c3385a) {
        return m27950f(i) + m27968b(c3385a);
    }

    /* renamed from: b */
    public static int m27972b(int i, AbstractC3390e abstractC3390e) {
        return m27950f(i) + m27967b(abstractC3390e);
    }

    /* renamed from: b */
    public static int m27971b(int i, String str) {
        return m27950f(i) + m27966b(str);
    }

    /* renamed from: b */
    public static int m27970b(int i, boolean z) {
        return m27950f(i) + m27965b(z);
    }

    /* renamed from: b */
    public static int m27968b(C3385a c3385a) {
        return m27947h(c3385a.m28025a()) + c3385a.m28025a();
    }

    /* renamed from: b */
    public static int m27967b(AbstractC3390e abstractC3390e) {
        int mo4526b = abstractC3390e.mo4526b();
        return mo4526b + m27947h(mo4526b);
    }

    /* renamed from: b */
    public static int m27966b(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return bytes.length + m27947h(bytes.length);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    /* renamed from: b */
    public static int m27965b(boolean z) {
        return 1;
    }

    /* renamed from: c */
    public static int m27962c(int i) {
        if (i >= 0) {
            return m27947h(i);
        }
        return 10;
    }

    /* renamed from: c */
    public static int m27961c(int i, int i2) {
        return m27950f(i) + m27962c(i2);
    }

    /* renamed from: c */
    public static int m27960c(int i, long j) {
        return m27950f(i) + m27959c(j);
    }

    /* renamed from: c */
    public static int m27959c(long j) {
        return m27949f(j);
    }

    /* renamed from: d */
    public static int m27957d(int i) {
        return m27947h(i);
    }

    /* renamed from: d */
    public static int m27956d(int i, int i2) {
        return m27950f(i) + m27957d(i2);
    }

    /* renamed from: d */
    public static int m27955d(int i, long j) {
        return m27950f(i) + m27954d(j);
    }

    /* renamed from: d */
    public static int m27954d(long j) {
        return m27949f(j);
    }

    /* renamed from: d */
    private void m27958d() {
        if (this.f13621d == null) {
            throw new C3388a();
        }
        this.f13621d.write(this.f13618a, 0, this.f13620c);
        this.f13620c = 0;
    }

    /* renamed from: f */
    public static int m27950f(int i) {
        return m27947h(C3391f.m27932a(i, 0));
    }

    /* renamed from: f */
    public static int m27949f(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    /* renamed from: h */
    public static int m27947h(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return ((-268435456) & i) == 0 ? 4 : 5;
    }

    /* renamed from: a */
    public void m27995a() {
        if (this.f13621d != null) {
            m27958d();
        }
    }

    /* renamed from: a */
    public void m27994a(byte b) {
        if (this.f13620c == this.f13619b) {
            m27958d();
        }
        byte[] bArr = this.f13618a;
        int i = this.f13620c;
        this.f13620c = i + 1;
        bArr[i] = b;
    }

    /* renamed from: a */
    public void m27993a(int i) {
        if (i >= 0) {
            m27948g(i);
        } else {
            m27951e(i);
        }
    }

    /* renamed from: a */
    public void m27992a(int i, int i2) {
        m27952e(i, 0);
        m27993a(i2);
    }

    /* renamed from: a */
    public void m27991a(int i, long j) {
        m27952e(i, 0);
        m27986a(j);
    }

    /* renamed from: a */
    public void m27990a(int i, C3385a c3385a) {
        m27952e(i, 2);
        m27985a(c3385a);
    }

    /* renamed from: a */
    public void m27989a(int i, AbstractC3390e abstractC3390e) {
        m27952e(i, 2);
        m27984a(abstractC3390e);
    }

    /* renamed from: a */
    public void m27988a(int i, String str) {
        m27952e(i, 2);
        m27981a(str);
    }

    /* renamed from: a */
    public void m27987a(int i, boolean z) {
        m27952e(i, 0);
        m27980a(z);
    }

    /* renamed from: a */
    public void m27986a(long j) {
        m27951e(j);
    }

    /* renamed from: a */
    public void m27985a(C3385a c3385a) {
        byte[] m28022b = c3385a.m28022b();
        m27948g(m28022b.length);
        m27979a(m28022b);
    }

    /* renamed from: a */
    public void m27984a(AbstractC3390e abstractC3390e) {
        m27948g(abstractC3390e.mo4533a());
        abstractC3390e.mo4529a(this);
    }

    /* renamed from: a */
    public void m27981a(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m27948g(bytes.length);
        m27979a(bytes);
    }

    /* renamed from: a */
    public void m27980a(boolean z) {
        m27953e(z ? 1 : 0);
    }

    /* renamed from: a */
    public void m27979a(byte[] bArr) {
        m27964b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public int m27977b() {
        if (this.f13621d == null) {
            return this.f13619b - this.f13620c;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    /* renamed from: b */
    public void m27976b(int i) {
        m27948g(i);
    }

    /* renamed from: b */
    public void m27975b(int i, int i2) {
        m27952e(i, 0);
        m27976b(i2);
    }

    /* renamed from: b */
    public void m27974b(int i, long j) {
        m27952e(i, 0);
        m27969b(j);
    }

    /* renamed from: b */
    public void m27969b(long j) {
        m27951e(j);
    }

    /* renamed from: b */
    public void m27964b(byte[] bArr, int i, int i2) {
        if (this.f13619b - this.f13620c >= i2) {
            System.arraycopy(bArr, i, this.f13618a, this.f13620c, i2);
            this.f13620c += i2;
            return;
        }
        int i3 = this.f13619b - this.f13620c;
        System.arraycopy(bArr, i, this.f13618a, this.f13620c, i3);
        int i4 = i + i3;
        int i5 = i2 - i3;
        this.f13620c = this.f13619b;
        m27958d();
        if (i5 > this.f13619b) {
            this.f13621d.write(bArr, i4, i5);
            return;
        }
        System.arraycopy(bArr, i4, this.f13618a, 0, i5);
        this.f13620c = i5;
    }

    /* renamed from: c */
    public void m27963c() {
        if (m27977b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: e */
    public void m27953e(int i) {
        m27994a((byte) i);
    }

    /* renamed from: e */
    public void m27952e(int i, int i2) {
        m27948g(C3391f.m27932a(i, i2));
    }

    /* renamed from: e */
    public void m27951e(long j) {
        while (((-128) & j) != 0) {
            m27953e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m27953e((int) j);
    }

    /* renamed from: g */
    public void m27948g(int i) {
        while ((i & (-128)) != 0) {
            m27953e((i & 127) | 128);
            i >>>= 7;
        }
        m27953e(i);
    }
}
