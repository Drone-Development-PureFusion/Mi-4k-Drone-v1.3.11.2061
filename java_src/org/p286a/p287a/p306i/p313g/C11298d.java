package org.p286a.p287a.p306i.p313g;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;
import org.p286a.p287a.p288a.AbstractC11009c;
@AbstractC11009c
/* renamed from: org.a.a.i.g.d */
/* loaded from: classes.dex */
public class C11298d extends OutputStream {

    /* renamed from: a */
    private final SessionOutputBuffer f36302a;

    /* renamed from: b */
    private final byte[] f36303b;

    /* renamed from: c */
    private int f36304c;

    /* renamed from: d */
    private boolean f36305d;

    /* renamed from: e */
    private boolean f36306e;

    public C11298d(int i, SessionOutputBuffer sessionOutputBuffer) {
        this.f36304c = 0;
        this.f36305d = false;
        this.f36306e = false;
        this.f36303b = new byte[i];
        this.f36302a = sessionOutputBuffer;
    }

    @Deprecated
    public C11298d(SessionOutputBuffer sessionOutputBuffer) {
        this(2048, sessionOutputBuffer);
    }

    @Deprecated
    public C11298d(SessionOutputBuffer sessionOutputBuffer, int i) {
        this(i, sessionOutputBuffer);
    }

    /* renamed from: a */
    protected void m1501a() {
        if (this.f36304c > 0) {
            this.f36302a.writeLine(Integer.toHexString(this.f36304c));
            this.f36302a.write(this.f36303b, 0, this.f36304c);
            this.f36302a.writeLine("");
            this.f36304c = 0;
        }
    }

    /* renamed from: a */
    protected void m1500a(byte[] bArr, int i, int i2) {
        this.f36302a.writeLine(Integer.toHexString(this.f36304c + i2));
        this.f36302a.write(this.f36303b, 0, this.f36304c);
        this.f36302a.write(bArr, i, i2);
        this.f36302a.writeLine("");
        this.f36304c = 0;
    }

    /* renamed from: b */
    protected void m1499b() {
        this.f36302a.writeLine("0");
        this.f36302a.writeLine("");
    }

    /* renamed from: c */
    public void m1498c() {
        if (!this.f36305d) {
            m1501a();
            m1499b();
            this.f36305d = true;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f36306e) {
            this.f36306e = true;
            m1498c();
            this.f36302a.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        m1501a();
        this.f36302a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (this.f36306e) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f36303b[this.f36304c] = (byte) i;
        this.f36304c++;
        if (this.f36304c != this.f36303b.length) {
            return;
        }
        m1501a();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.f36306e) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (i2 >= this.f36303b.length - this.f36304c) {
            m1500a(bArr, i, i2);
            return;
        }
        System.arraycopy(bArr, i, this.f36303b, this.f36304c, i2);
        this.f36304c += i2;
    }
}
