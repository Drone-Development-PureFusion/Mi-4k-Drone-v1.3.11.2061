package org.p286a.p287a.p306i.p313g;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.g.f */
/* loaded from: classes2.dex */
public class C11300f extends OutputStream {

    /* renamed from: a */
    private final SessionOutputBuffer f36312a;

    /* renamed from: b */
    private final long f36313b;

    /* renamed from: c */
    private long f36314c = 0;

    /* renamed from: d */
    private boolean f36315d = false;

    public C11300f(SessionOutputBuffer sessionOutputBuffer, long j) {
        this.f36312a = (SessionOutputBuffer) C11354a.m1321a(sessionOutputBuffer, "Session output buffer");
        this.f36313b = C11354a.m1316b(j, "Content length");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f36315d) {
            this.f36315d = true;
            this.f36312a.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f36312a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (this.f36315d) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.f36314c >= this.f36313b) {
            return;
        }
        this.f36312a.write(i);
        this.f36314c++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.f36315d) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.f36314c >= this.f36313b) {
            return;
        }
        long j = this.f36313b - this.f36314c;
        if (i2 > j) {
            i2 = (int) j;
        }
        this.f36312a.write(bArr, i, i2);
        this.f36314c += i2;
    }
}
