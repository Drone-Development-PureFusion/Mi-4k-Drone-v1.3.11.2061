package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.qz */
/* loaded from: classes2.dex */
public final class C7644qz implements Cloneable {

    /* renamed from: a */
    private static final C7646ra f25379a = new C7646ra();

    /* renamed from: b */
    private boolean f25380b;

    /* renamed from: c */
    private int[] f25381c;

    /* renamed from: d */
    private C7646ra[] f25382d;

    /* renamed from: e */
    private int f25383e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7644qz() {
        this(10);
    }

    C7644qz(int i) {
        this.f25380b = false;
        int m13884c = m13884c(i);
        this.f25381c = new int[m13884c];
        this.f25382d = new C7646ra[m13884c];
        this.f25383e = 0;
    }

    /* renamed from: a */
    private boolean m13889a(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m13888a(C7646ra[] c7646raArr, C7646ra[] c7646raArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!c7646raArr[i2].equals(c7646raArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private int m13884c(int i) {
        return m13883d(i * 4) / 4;
    }

    /* renamed from: d */
    private int m13883d(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }

    /* renamed from: e */
    private int m13882e(int i) {
        int i2 = 0;
        int i3 = this.f25383e - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.f25381c[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2 ^ (-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m13892a() {
        return this.f25383e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C7646ra m13891a(int i) {
        int m13882e = m13882e(i);
        if (m13882e < 0 || this.f25382d[m13882e] == f25379a) {
            return null;
        }
        return this.f25382d[m13882e];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13890a(int i, C7646ra c7646ra) {
        int m13882e = m13882e(i);
        if (m13882e >= 0) {
            this.f25382d[m13882e] = c7646ra;
            return;
        }
        int i2 = m13882e ^ (-1);
        if (i2 < this.f25383e && this.f25382d[i2] == f25379a) {
            this.f25381c[i2] = i;
            this.f25382d[i2] = c7646ra;
            return;
        }
        if (this.f25383e >= this.f25381c.length) {
            int m13884c = m13884c(this.f25383e + 1);
            int[] iArr = new int[m13884c];
            C7646ra[] c7646raArr = new C7646ra[m13884c];
            System.arraycopy(this.f25381c, 0, iArr, 0, this.f25381c.length);
            System.arraycopy(this.f25382d, 0, c7646raArr, 0, this.f25382d.length);
            this.f25381c = iArr;
            this.f25382d = c7646raArr;
        }
        if (this.f25383e - i2 != 0) {
            System.arraycopy(this.f25381c, i2, this.f25381c, i2 + 1, this.f25383e - i2);
            System.arraycopy(this.f25382d, i2, this.f25382d, i2 + 1, this.f25383e - i2);
        }
        this.f25381c[i2] = i;
        this.f25382d[i2] = c7646ra;
        this.f25383e++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C7646ra m13886b(int i) {
        return this.f25382d[i];
    }

    /* renamed from: b */
    public boolean m13887b() {
        return m13892a() == 0;
    }

    /* renamed from: c */
    public final C7644qz clone() {
        int m13892a = m13892a();
        C7644qz c7644qz = new C7644qz(m13892a);
        System.arraycopy(this.f25381c, 0, c7644qz.f25381c, 0, m13892a);
        for (int i = 0; i < m13892a; i++) {
            if (this.f25382d[i] != null) {
                c7644qz.f25382d[i] = (C7646ra) this.f25382d[i].clone();
            }
        }
        c7644qz.f25383e = m13892a;
        return c7644qz;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7644qz)) {
            return false;
        }
        C7644qz c7644qz = (C7644qz) obj;
        if (m13892a() != c7644qz.m13892a()) {
            return false;
        }
        return m13889a(this.f25381c, c7644qz.f25381c, this.f25383e) && m13888a(this.f25382d, c7644qz.f25382d, this.f25383e);
    }

    public int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f25383e; i2++) {
            i = (((i * 31) + this.f25381c[i2]) * 31) + this.f25382d[i2].hashCode();
        }
        return i;
    }
}
