package com.p079a.p080a;

import java.util.zip.CRC32;
import java.util.zip.ZipException;
/* renamed from: com.a.a.b */
/* loaded from: classes.dex */
public class C0865b implements AbstractC0877l, AbstractC0891x, Cloneable {

    /* renamed from: h */
    private static final C0863ab f1798h = new C0863ab(30062);

    /* renamed from: i */
    private static final int f1799i = 4;

    /* renamed from: j */
    private int f1800j = 0;

    /* renamed from: k */
    private int f1801k = 0;

    /* renamed from: l */
    private int f1802l = 0;

    /* renamed from: m */
    private String f1803m = "";

    /* renamed from: n */
    private boolean f1804n = false;

    /* renamed from: o */
    private CRC32 f1805o = new CRC32();

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: a */
    public C0863ab mo37484a() {
        return f1798h;
    }

    /* renamed from: a */
    public void m37583a(int i) {
        this.f1801k = i;
    }

    /* renamed from: a */
    public void m37582a(String str) {
        this.f1803m = str;
        this.f1800j = m37577d(this.f1800j);
    }

    /* renamed from: a */
    public void m37581a(boolean z) {
        this.f1804n = z;
        this.f1800j = m37577d(this.f1800j);
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: a */
    public void mo37483a(byte[] bArr, int i, int i2) {
        boolean z = false;
        long m37446a = C0898z.m37446a(bArr, i);
        byte[] bArr2 = new byte[i2 - 4];
        System.arraycopy(bArr, i + 4, bArr2, 0, i2 - 4);
        this.f1805o.reset();
        this.f1805o.update(bArr2);
        long value = this.f1805o.getValue();
        if (m37446a != value) {
            throw new ZipException("bad CRC checksum " + Long.toHexString(m37446a) + " instead of " + Long.toHexString(value));
        }
        int m37597a = C0863ab.m37597a(bArr2, 0);
        byte[] bArr3 = new byte[(int) C0898z.m37446a(bArr2, 2)];
        this.f1801k = C0863ab.m37597a(bArr2, 6);
        this.f1802l = C0863ab.m37597a(bArr2, 8);
        if (bArr3.length == 0) {
            this.f1803m = "";
        } else {
            System.arraycopy(bArr2, 10, bArr3, 0, bArr3.length);
            this.f1803m = new String(bArr3);
        }
        if ((m37597a & 16384) != 0) {
            z = true;
        }
        m37581a(z);
        m37578c(m37597a);
    }

    /* renamed from: b */
    public int m37580b() {
        return this.f1801k;
    }

    /* renamed from: b */
    public void m37579b(int i) {
        this.f1802l = i;
    }

    /* renamed from: c */
    public void m37578c(int i) {
        this.f1800j = m37577d(i);
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: c */
    public byte[] mo37482c() {
        return mo37480e();
    }

    public Object clone() {
        try {
            C0865b c0865b = (C0865b) super.clone();
            c0865b.f1805o = new CRC32();
            return c0865b;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    protected int m37577d(int i) {
        int i2 = 32768;
        if (m37574i()) {
            i2 = AbstractC0877l.f1836b;
        } else if (m37572k()) {
            i2 = 16384;
        }
        return i2 | (i & AbstractC0877l.f1835a);
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: d */
    public C0863ab mo37481d() {
        return mo37479f();
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: e */
    public byte[] mo37480e() {
        byte[] bArr = new byte[mo37479f().m37596b() - 4];
        System.arraycopy(C0863ab.m37599a(m37573j()), 0, bArr, 0, 2);
        byte[] bytes = m37575h().getBytes();
        System.arraycopy(C0898z.m37448a(bytes.length), 0, bArr, 2, 4);
        System.arraycopy(C0863ab.m37599a(m37580b()), 0, bArr, 6, 2);
        System.arraycopy(C0863ab.m37599a(m37576g()), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.f1805o.reset();
        this.f1805o.update(bArr);
        long value = this.f1805o.getValue();
        byte[] bArr2 = new byte[bArr.length + 4];
        System.arraycopy(C0898z.m37448a(value), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        return bArr2;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: f */
    public C0863ab mo37479f() {
        return new C0863ab(m37575h().getBytes().length + 14);
    }

    /* renamed from: g */
    public int m37576g() {
        return this.f1802l;
    }

    /* renamed from: h */
    public String m37575h() {
        return this.f1803m;
    }

    /* renamed from: i */
    public boolean m37574i() {
        return m37575h().length() != 0;
    }

    /* renamed from: j */
    public int m37573j() {
        return this.f1800j;
    }

    /* renamed from: k */
    public boolean m37572k() {
        return this.f1804n && !m37574i();
    }
}
