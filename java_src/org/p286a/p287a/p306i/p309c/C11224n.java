package org.p286a.p287a.p306i.p309c;

import java.io.IOException;
import java.io.InputStream;
import org.p286a.p287a.p288a.AbstractC11009c;
@AbstractC11009c
/* renamed from: org.a.a.i.c.n */
/* loaded from: classes2.dex */
class C11224n extends InputStream {

    /* renamed from: a */
    private final InputStream f36136a;

    /* renamed from: b */
    private final C11235u f36137b;

    public C11224n(InputStream inputStream, C11235u c11235u) {
        this.f36136a = inputStream;
        this.f36137b = c11235u;
    }

    @Override // java.io.InputStream
    public int available() {
        try {
            return this.f36136a.available();
        } catch (IOException e) {
            this.f36137b.m1571b("[available] I/O error : " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f36136a.close();
        } catch (IOException e) {
            this.f36137b.m1571b("[close] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        super.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            int read = this.f36136a.read();
            if (read == -1) {
                this.f36137b.m1571b("end of stream");
            } else {
                this.f36137b.m1573b(read);
            }
            return read;
        } catch (IOException e) {
            this.f36137b.m1571b("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            int read = this.f36136a.read(bArr);
            if (read == -1) {
                this.f36137b.m1571b("end of stream");
            } else if (read > 0) {
                this.f36137b.m1569b(bArr, 0, read);
            }
            return read;
        } catch (IOException e) {
            this.f36137b.m1571b("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.f36136a.read(bArr, i, i2);
            if (read == -1) {
                this.f36137b.m1571b("end of stream");
            } else if (read > 0) {
                this.f36137b.m1569b(bArr, i, read);
            }
            return read;
        } catch (IOException e) {
            this.f36137b.m1571b("[read] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.InputStream
    public void reset() {
        super.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return super.skip(j);
        } catch (IOException e) {
            this.f36137b.m1571b("[skip] I/O error: " + e.getMessage());
            throw e;
        }
    }
}
