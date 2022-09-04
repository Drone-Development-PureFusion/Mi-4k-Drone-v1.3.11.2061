package org.p286a.p287a.p306i.p309c;

import java.io.IOException;
import java.io.OutputStream;
import org.p286a.p287a.p288a.AbstractC11009c;
@AbstractC11009c
/* renamed from: org.a.a.i.c.p */
/* loaded from: classes2.dex */
class C11226p extends OutputStream {

    /* renamed from: a */
    private final OutputStream f36141a;

    /* renamed from: b */
    private final C11235u f36142b;

    public C11226p(OutputStream outputStream, C11235u c11235u) {
        this.f36141a = outputStream;
        this.f36142b = c11235u;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f36141a.close();
        } catch (IOException e) {
            this.f36142b.m1577a("[close] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            this.f36141a.flush();
        } catch (IOException e) {
            this.f36142b.m1577a("[flush] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        try {
            this.f36142b.m1579a(i);
        } catch (IOException e) {
            this.f36142b.m1577a("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.f36142b.m1575a(bArr);
            this.f36141a.write(bArr);
        } catch (IOException e) {
            this.f36142b.m1577a("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        try {
            this.f36142b.m1574a(bArr, i, i2);
            this.f36141a.write(bArr, i, i2);
        } catch (IOException e) {
            this.f36142b.m1577a("[write] I/O error: " + e.getMessage());
            throw e;
        }
    }
}
