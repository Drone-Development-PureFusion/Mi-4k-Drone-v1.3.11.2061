package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
/* renamed from: com.android.volley.toolbox.q */
/* loaded from: classes.dex */
public class C0963q extends ByteArrayOutputStream {

    /* renamed from: a */
    private static final int f2156a = 256;

    /* renamed from: b */
    private final C0936d f2157b;

    public C0963q(C0936d c0936d) {
        this(c0936d, 256);
    }

    public C0963q(C0936d c0936d, int i) {
        this.f2157b = c0936d;
        this.buf = this.f2157b.m37359a(Math.max(i, 256));
    }

    /* renamed from: a */
    private void m37275a(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        byte[] m37359a = this.f2157b.m37359a((this.count + i) * 2);
        System.arraycopy(this.buf, 0, m37359a, 0, this.count);
        this.f2157b.m37358a(this.buf);
        this.buf = m37359a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2157b.m37358a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f2157b.m37358a(this.buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        m37275a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m37275a(i2);
        super.write(bArr, i, i2);
    }
}
