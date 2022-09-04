package com.xiaomi.market.sdk;

import java.io.OutputStream;
/* renamed from: com.xiaomi.market.sdk.i */
/* loaded from: classes2.dex */
public abstract class AbstractC10444i extends OutputStream {

    /* renamed from: G */
    final /* synthetic */ C10438c f32442G;

    /* renamed from: S */
    protected OutputStream f32443S;

    public AbstractC10444i(C10438c c10438c, OutputStream outputStream) {
        this.f32442G = c10438c;
        if (outputStream == null) {
            throw new IllegalArgumentException("outputstream is null");
        }
        this.f32443S = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32443S.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f32443S.flush();
    }

    public abstract void reset();

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f32443S.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f32443S.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.f32443S.write(bArr, i, i2);
    }
}
