package com.google.p222a.p223a;
/* renamed from: com.google.a.a.a */
/* loaded from: classes.dex */
public final class C3385a {

    /* renamed from: a */
    public static final C3385a f13604a = new C3385a(new byte[0]);

    /* renamed from: b */
    private final byte[] f13605b;

    /* renamed from: c */
    private volatile int f13606c = 0;

    private C3385a(byte[] bArr) {
        this.f13605b = bArr;
    }

    /* renamed from: a */
    public static C3385a m28024a(byte[] bArr) {
        return m28023a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C3385a m28023a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C3385a(bArr2);
    }

    /* renamed from: a */
    public int m28025a() {
        return this.f13605b.length;
    }

    /* renamed from: b */
    public byte[] m28022b() {
        int length = this.f13605b.length;
        byte[] bArr = new byte[length];
        System.arraycopy(this.f13605b, 0, bArr, 0, length);
        return bArr;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3385a)) {
            return false;
        }
        C3385a c3385a = (C3385a) obj;
        int length = this.f13605b.length;
        if (length != c3385a.f13605b.length) {
            return false;
        }
        byte[] bArr = this.f13605b;
        byte[] bArr2 = c3385a.f13605b;
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f13606c;
        if (i == 0) {
            byte[] bArr = this.f13605b;
            int length = this.f13605b.length;
            int i2 = 0;
            i = length;
            while (i2 < length) {
                i2++;
                i = bArr[i2] + (i * 31);
            }
            if (i == 0) {
                i = 1;
            }
            this.f13606c = i;
        }
        return i;
    }
}
