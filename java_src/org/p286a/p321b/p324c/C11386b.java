package org.p286a.p321b.p324c;

import org.p286a.p321b.C11390d;
/* renamed from: org.a.b.c.b */
/* loaded from: classes2.dex */
public class C11386b extends AbstractC11388d {

    /* renamed from: a */
    private C11390d f36499a;

    /* renamed from: b */
    private int f36500b;

    public C11386b(int i) {
        this.f36499a = new C11390d(i);
    }

    /* renamed from: B_ */
    public int m1220B_() {
        return this.f36499a.size();
    }

    @Override // org.p286a.p321b.p324c.AbstractC11388d
    /* renamed from: a */
    public int mo1215a(byte[] bArr, int i, int i2) {
        byte[] m1210a = this.f36499a.m1210a();
        if (i2 > this.f36499a.m1209b() - this.f36500b) {
            i2 = this.f36499a.m1209b() - this.f36500b;
        }
        if (i2 > 0) {
            System.arraycopy(m1210a, this.f36500b, bArr, i, i2);
            this.f36500b += i2;
        }
        return i2;
    }

    @Override // org.p286a.p321b.p324c.AbstractC11388d
    /* renamed from: b */
    public void mo1213b(byte[] bArr, int i, int i2) {
        this.f36499a.write(bArr, i, i2);
    }
}
