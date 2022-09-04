package org.p286a.p287a.p306i.p313g;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.i.g.p */
/* loaded from: classes2.dex */
public class C11310p extends OutputStream {

    /* renamed from: a */
    private final SessionOutputBuffer f36332a;

    /* renamed from: b */
    private boolean f36333b = false;

    public C11310p(SessionOutputBuffer sessionOutputBuffer) {
        this.f36332a = (SessionOutputBuffer) C11354a.m1321a(sessionOutputBuffer, "Session output buffer");
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f36333b) {
            this.f36333b = true;
            this.f36332a.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f36332a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (this.f36333b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f36332a.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.f36333b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f36332a.write(bArr, i, i2);
    }
}
