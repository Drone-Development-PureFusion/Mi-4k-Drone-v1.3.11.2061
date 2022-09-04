package com.p079a.p080a;
/* renamed from: com.a.a.f */
/* loaded from: classes.dex */
public final class C0870f {

    /* renamed from: a */
    public static final int f1816a = 2048;

    /* renamed from: b */
    private static final int f1817b = 1;

    /* renamed from: c */
    private static final int f1818c = 8;

    /* renamed from: d */
    private static final int f1819d = 64;

    /* renamed from: e */
    private boolean f1820e = false;

    /* renamed from: f */
    private boolean f1821f = false;

    /* renamed from: g */
    private boolean f1822g = false;

    /* renamed from: h */
    private boolean f1823h = false;

    /* renamed from: a */
    public static C0870f m37561a(byte[] bArr, int i) {
        boolean z = true;
        int m37597a = C0863ab.m37597a(bArr, i);
        C0870f c0870f = new C0870f();
        c0870f.m37559b((m37597a & 8) != 0);
        c0870f.m37562a((m37597a & 2048) != 0);
        c0870f.m37555d((m37597a & 64) != 0);
        if ((m37597a & 1) == 0) {
            z = false;
        }
        c0870f.m37557c(z);
        return c0870f;
    }

    /* renamed from: a */
    public void m37562a(boolean z) {
        this.f1820e = z;
    }

    /* renamed from: a */
    public boolean m37563a() {
        return this.f1820e;
    }

    /* renamed from: b */
    public void m37559b(boolean z) {
        this.f1821f = z;
    }

    /* renamed from: b */
    public boolean m37560b() {
        return this.f1821f;
    }

    /* renamed from: c */
    public void m37557c(boolean z) {
        this.f1822g = z;
    }

    /* renamed from: c */
    public boolean m37558c() {
        return this.f1822g;
    }

    /* renamed from: d */
    public void m37555d(boolean z) {
        this.f1823h = z;
        if (z) {
            m37557c(true);
        }
    }

    /* renamed from: d */
    public boolean m37556d() {
        return this.f1822g && this.f1823h;
    }

    /* renamed from: e */
    public byte[] m37554e() {
        int i = 0;
        int i2 = (this.f1822g ? 1 : 0) | (this.f1820e ? 2048 : 0) | (this.f1821f ? 8 : 0);
        if (this.f1823h) {
            i = 64;
        }
        return C0863ab.m37599a(i2 | i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0870f)) {
            return false;
        }
        C0870f c0870f = (C0870f) obj;
        return c0870f.f1822g == this.f1822g && c0870f.f1823h == this.f1823h && c0870f.f1820e == this.f1820e && c0870f.f1821f == this.f1821f;
    }

    public int hashCode() {
        int i = 1;
        int i2 = ((this.f1820e ? 1 : 0) + (((this.f1823h ? 1 : 0) + ((this.f1822g ? 1 : 0) * 17)) * 13)) * 7;
        if (!this.f1821f) {
            i = 0;
        }
        return (i2 + i) * 3;
    }
}
