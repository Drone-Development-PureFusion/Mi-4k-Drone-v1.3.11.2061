package com.p079a.p080a;

import java.util.zip.ZipException;
/* renamed from: com.a.a.p */
/* loaded from: classes.dex */
public class C0882p implements AbstractC0866c {

    /* renamed from: b */
    private static final String f1855b = "Zip64 extended information must contain both size values in the local file header.";

    /* renamed from: d */
    private C0886t f1857d;

    /* renamed from: e */
    private C0886t f1858e;

    /* renamed from: f */
    private C0886t f1859f;

    /* renamed from: g */
    private C0898z f1860g;

    /* renamed from: h */
    private byte[] f1861h;

    /* renamed from: a */
    static final C0863ab f1854a = new C0863ab(1);

    /* renamed from: c */
    private static final byte[] f1856c = new byte[0];

    public C0882p() {
    }

    public C0882p(C0886t c0886t, C0886t c0886t2) {
        this(c0886t, c0886t2, null, null);
    }

    public C0882p(C0886t c0886t, C0886t c0886t2, C0886t c0886t3, C0898z c0898z) {
        this.f1857d = c0886t;
        this.f1858e = c0886t2;
        this.f1859f = c0886t3;
        this.f1860g = c0898z;
    }

    /* renamed from: a */
    private int m37539a(byte[] bArr) {
        int i;
        if (this.f1857d != null) {
            System.arraycopy(this.f1857d.m37530a(), 0, bArr, 0, 8);
            i = 8;
        } else {
            i = 0;
        }
        if (this.f1858e != null) {
            System.arraycopy(this.f1858e.m37530a(), 0, bArr, i, 8);
            return i + 8;
        }
        return i;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: a */
    public C0863ab mo37484a() {
        return f1854a;
    }

    /* renamed from: a */
    public void m37542a(C0886t c0886t) {
        this.f1857d = c0886t;
    }

    /* renamed from: a */
    public void m37541a(C0898z c0898z) {
        this.f1860g = c0898z;
    }

    /* renamed from: a */
    public void m37540a(boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        if (this.f1861h != null) {
            int i2 = (z4 ? 4 : 0) + (z ? 8 : 0) + (z2 ? 8 : 0) + (z3 ? 8 : 0);
            if (this.f1861h.length != i2) {
                throw new ZipException("central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length " + i2 + " but is " + this.f1861h.length);
            }
            if (z) {
                this.f1857d = new C0886t(this.f1861h, 0);
                i = 8;
            } else {
                i = 0;
            }
            if (z2) {
                this.f1858e = new C0886t(this.f1861h, i);
                i += 8;
            }
            if (z3) {
                this.f1859f = new C0886t(this.f1861h, i);
                i += 8;
            }
            if (!z4) {
                return;
            }
            this.f1860g = new C0898z(this.f1861h, i);
            int i3 = i + 4;
        }
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: a */
    public void mo37483a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        if (i2 < 16) {
            throw new ZipException(f1855b);
        }
        this.f1857d = new C0886t(bArr, i);
        int i3 = i + 8;
        this.f1858e = new C0886t(bArr, i3);
        int i4 = i3 + 8;
        int i5 = i2 - 16;
        if (i5 >= 8) {
            this.f1859f = new C0886t(bArr, i4);
            i4 += 8;
            i5 -= 8;
        }
        if (i5 < 4) {
            return;
        }
        this.f1860g = new C0898z(bArr, i4);
        int i6 = i4 + 4;
        int i7 = i5 - 4;
    }

    /* renamed from: b */
    public C0886t m37538b() {
        return this.f1857d;
    }

    /* renamed from: b */
    public void m37537b(C0886t c0886t) {
        this.f1858e = c0886t;
    }

    @Override // com.p079a.p080a.AbstractC0866c
    /* renamed from: b */
    public void mo37536b(byte[] bArr, int i, int i2) {
        this.f1861h = new byte[i2];
        System.arraycopy(bArr, i, this.f1861h, 0, i2);
        if (i2 >= 28) {
            mo37483a(bArr, i, i2);
        } else if (i2 != 24) {
            if (i2 % 8 != 4) {
                return;
            }
            this.f1860g = new C0898z(bArr, (i + i2) - 4);
        } else {
            this.f1857d = new C0886t(bArr, i);
            int i3 = i + 8;
            this.f1858e = new C0886t(bArr, i3);
            this.f1859f = new C0886t(bArr, i3 + 8);
        }
    }

    /* renamed from: c */
    public void m37535c(C0886t c0886t) {
        this.f1859f = c0886t;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: c */
    public byte[] mo37482c() {
        byte[] bArr = new byte[mo37481d().m37596b()];
        int m37539a = m37539a(bArr);
        if (this.f1859f != null) {
            System.arraycopy(this.f1859f.m37530a(), 0, bArr, m37539a, 8);
            m37539a += 8;
        }
        if (this.f1860g != null) {
            System.arraycopy(this.f1860g.m37449a(), 0, bArr, m37539a, 4);
            int i = m37539a + 4;
        }
        return bArr;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: d */
    public C0863ab mo37481d() {
        int i = 8;
        int i2 = 0;
        int i3 = (this.f1857d != null ? 8 : 0) + (this.f1858e != null ? 8 : 0);
        if (this.f1859f == null) {
            i = 0;
        }
        int i4 = i3 + i;
        if (this.f1860g != null) {
            i2 = 4;
        }
        return new C0863ab(i4 + i2);
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: e */
    public byte[] mo37480e() {
        if (this.f1857d == null && this.f1858e == null) {
            return f1856c;
        }
        if (this.f1857d == null || this.f1858e == null) {
            throw new IllegalArgumentException(f1855b);
        }
        byte[] bArr = new byte[16];
        m37539a(bArr);
        return bArr;
    }

    @Override // com.p079a.p080a.AbstractC0891x
    /* renamed from: f */
    public C0863ab mo37479f() {
        return new C0863ab(this.f1857d != null ? 16 : 0);
    }

    /* renamed from: g */
    public C0886t m37534g() {
        return this.f1858e;
    }

    /* renamed from: h */
    public C0886t m37533h() {
        return this.f1859f;
    }

    /* renamed from: i */
    public C0898z m37532i() {
        return this.f1860g;
    }
}
