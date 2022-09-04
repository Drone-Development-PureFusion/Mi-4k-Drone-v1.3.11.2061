package com.google.android.gms.internal;

import java.io.ByteArrayOutputStream;
/* renamed from: com.google.android.gms.internal.b */
/* loaded from: classes2.dex */
public class C6768b extends ByteArrayOutputStream {

    /* renamed from: a */
    private final ali f22868a;

    public C6768b(ali aliVar, int i) {
        this.f22868a = aliVar;
        this.buf = this.f22868a.m16953a(Math.max(i, 256));
    }

    /* renamed from: a */
    private void m16203a(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        byte[] m16953a = this.f22868a.m16953a((this.count + i) * 2);
        System.arraycopy(this.buf, 0, m16953a, 0, this.count);
        this.f22868a.m16952a(this.buf);
        this.buf = m16953a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f22868a.m16952a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f22868a.m16952a(this.buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        m16203a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m16203a(i2);
        super.write(bArr, i, i2);
    }
}
