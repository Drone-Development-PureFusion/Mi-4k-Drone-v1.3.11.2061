package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.pu */
/* loaded from: classes2.dex */
public class C7604pu {

    /* renamed from: a */
    private final byte[] f25212a = new byte[256];

    /* renamed from: b */
    private int f25213b;

    /* renamed from: c */
    private int f25214c;

    public C7604pu(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f25212a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            i2 = (i2 + this.f25212a[i3] + bArr[i3 % bArr.length]) & 255;
            byte b = this.f25212a[i3];
            this.f25212a[i3] = this.f25212a[i2];
            this.f25212a[i2] = b;
        }
        this.f25213b = 0;
        this.f25214c = 0;
    }

    /* renamed from: a */
    public void m14088a(byte[] bArr) {
        int i = this.f25213b;
        int i2 = this.f25214c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f25212a[i]) & 255;
            byte b = this.f25212a[i];
            this.f25212a[i] = this.f25212a[i2];
            this.f25212a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f25212a[(this.f25212a[i] + this.f25212a[i2]) & 255]);
        }
        this.f25213b = i;
        this.f25214c = i2;
    }
}
