package com.xiaomi.mistatistic.sdk.p269a;

import java.io.IOException;
import java.io.OutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mistatistic.sdk.a.d */
/* loaded from: classes2.dex */
public final class C10505d extends OutputStream {

    /* renamed from: a */
    private OutputStream f32634a;

    /* renamed from: b */
    private C10502a f32635b;

    /* renamed from: c */
    private C10503b f32636c;

    /* renamed from: d */
    private int f32637d = 0;

    public C10505d(C10502a c10502a, OutputStream outputStream) {
        this.f32634a = outputStream;
        this.f32635b = c10502a;
    }

    public C10505d(C10503b c10503b, OutputStream outputStream) {
        this.f32634a = outputStream;
        this.f32636c = c10503b;
    }

    /* renamed from: a */
    private void m4881a(Exception exc) {
        if (this.f32635b != null) {
            this.f32635b.m4891a(exc);
        }
        if (this.f32636c != null) {
            this.f32636c.m4886a(exc);
        }
    }

    /* renamed from: a */
    public int m4882a() {
        return this.f32637d;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f32634a.close();
        } catch (IOException e) {
            m4881a(e);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            this.f32634a.flush();
        } catch (IOException e) {
            m4881a(e);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        try {
            this.f32634a.write(i);
            this.f32637d++;
        } catch (IOException e) {
            m4881a(e);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.f32634a.write(bArr);
            this.f32637d += bArr.length;
        } catch (IOException e) {
            m4881a(e);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        try {
            this.f32634a.write(bArr, i, i2);
            this.f32637d += i2;
        } catch (IOException e) {
            m4881a(e);
            throw e;
        }
    }
}
