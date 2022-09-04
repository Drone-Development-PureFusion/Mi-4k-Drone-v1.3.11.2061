package com.p120c.p121a.p129b.p130a;

import java.io.InputStream;
/* renamed from: com.c.a.b.a.a */
/* loaded from: classes.dex */
public class C1286a extends InputStream {

    /* renamed from: a */
    private final InputStream f3226a;

    /* renamed from: b */
    private final int f3227b;

    public C1286a(InputStream inputStream, int i) {
        this.f3226a = inputStream;
        this.f3227b = i;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f3227b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3226a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f3226a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f3226a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f3226a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.f3226a.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.f3226a.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f3226a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.f3226a.skip(j);
    }
}
