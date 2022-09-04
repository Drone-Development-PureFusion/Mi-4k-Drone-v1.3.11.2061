package org.p286a.p321b.p324c;
/* renamed from: org.a.b.c.c */
/* loaded from: classes2.dex */
public final class C11387c extends AbstractC11388d {

    /* renamed from: a */
    private byte[] f36501a;

    /* renamed from: b */
    private int f36502b;

    /* renamed from: c */
    private int f36503c;

    @Override // org.p286a.p321b.p324c.AbstractC11388d
    /* renamed from: a */
    public int mo1215a(byte[] bArr, int i, int i2) {
        int mo1212c = mo1212c();
        if (i2 > mo1212c) {
            i2 = mo1212c;
        }
        if (i2 > 0) {
            System.arraycopy(this.f36501a, this.f36502b, bArr, i, i2);
            mo1216a(i2);
        }
        return i2;
    }

    @Override // org.p286a.p321b.p324c.AbstractC11388d
    /* renamed from: a */
    public void mo1216a(int i) {
        this.f36502b += i;
    }

    /* renamed from: a */
    public void m1219a(byte[] bArr) {
        m1218c(bArr, 0, bArr.length);
    }

    @Override // org.p286a.p321b.p324c.AbstractC11388d
    /* renamed from: a */
    public byte[] mo1217a() {
        return this.f36501a;
    }

    @Override // org.p286a.p321b.p324c.AbstractC11388d
    /* renamed from: b */
    public int mo1214b() {
        return this.f36502b;
    }

    @Override // org.p286a.p321b.p324c.AbstractC11388d
    /* renamed from: b */
    public void mo1213b(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // org.p286a.p321b.p324c.AbstractC11388d
    /* renamed from: c */
    public int mo1212c() {
        return this.f36503c - this.f36502b;
    }

    /* renamed from: c */
    public void m1218c(byte[] bArr, int i, int i2) {
        this.f36501a = bArr;
        this.f36502b = i;
        this.f36503c = i + i2;
    }
}
