package org.p286a.p287a.p290c.p292b;

import java.io.InputStream;
import org.p286a.p287a.p288a.AbstractC11009c;
/* JADX INFO: Access modifiers changed from: package-private */
@AbstractC11009c
/* renamed from: org.a.a.c.b.g */
/* loaded from: classes2.dex */
public class C11032g extends InputStream {

    /* renamed from: a */
    private final InputStream f35573a;

    /* renamed from: b */
    private final AbstractC11025a f35574b;

    /* renamed from: c */
    private InputStream f35575c;

    public C11032g(InputStream inputStream, AbstractC11025a abstractC11025a) {
        this.f35573a = inputStream;
        this.f35574b = abstractC11025a;
    }

    /* renamed from: a */
    private void m2234a() {
        if (this.f35575c == null) {
            this.f35575c = this.f35574b.mo2235a(this.f35573a);
        }
    }

    @Override // java.io.InputStream
    public int available() {
        m2234a();
        return this.f35575c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            if (this.f35575c != null) {
                this.f35575c.close();
            }
        } finally {
            this.f35573a.close();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        m2234a();
        return this.f35575c.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        m2234a();
        return this.f35575c.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        m2234a();
        return this.f35575c.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        m2234a();
        return this.f35575c.skip(j);
    }
}
