package com.xiaomi.mistatistic.sdk.p269a;

import java.io.IOException;
import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mistatistic.sdk.a.c */
/* loaded from: classes2.dex */
public final class C10504c extends InputStream {

    /* renamed from: a */
    private InputStream f32630a;

    /* renamed from: b */
    private C10502a f32631b;

    /* renamed from: c */
    private C10503b f32632c;

    /* renamed from: d */
    private int f32633d = 0;

    public C10504c(C10502a c10502a, InputStream inputStream) {
        this.f32631b = c10502a;
        this.f32630a = inputStream;
    }

    public C10504c(C10503b c10503b, InputStream inputStream) {
        this.f32632c = c10503b;
        this.f32630a = inputStream;
    }

    /* renamed from: a */
    private void m4883a(Exception exc) {
        if (this.f32631b != null) {
            this.f32631b.m4891a(exc);
        }
        if (this.f32632c != null) {
            this.f32632c.m4886a(exc);
        }
    }

    /* renamed from: a */
    public int m4884a() {
        return this.f32633d;
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            return this.f32630a.available();
        } catch (IOException e) {
            m4883a(e);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f32631b != null) {
            this.f32631b.m4893a();
        }
        if (this.f32632c != null) {
            this.f32632c.m4888a();
        }
        try {
            this.f32630a.close();
        } catch (IOException e) {
            m4883a(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f32630a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f32630a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            int read = this.f32630a.read();
            if (read != -1) {
                this.f32633d++;
            }
            return read;
        } catch (IOException e) {
            m4883a(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            int read = this.f32630a.read(bArr);
            if (read != -1) {
                this.f32633d += read;
            }
            return read;
        } catch (IOException e) {
            m4883a(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.f32630a.read(bArr, i, i2);
            if (read != -1) {
                this.f32633d += read;
            }
            return read;
        } catch (IOException e) {
            m4883a(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        try {
            this.f32630a.reset();
        } catch (IOException e) {
            m4883a(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.f32630a.skip(j);
        } catch (IOException e) {
            m4883a(e);
            throw e;
        }
    }
}
