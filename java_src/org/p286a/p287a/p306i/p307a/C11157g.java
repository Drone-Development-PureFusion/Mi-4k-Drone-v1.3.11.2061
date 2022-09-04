package org.p286a.p287a.p306i.p307a;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
/* renamed from: org.a.a.i.a.g */
/* loaded from: classes2.dex */
class C11157g extends OutputStream {

    /* renamed from: a */
    private final MessageDigest f35877a;

    /* renamed from: b */
    private boolean f35878b;

    /* renamed from: c */
    private byte[] f35879c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11157g(MessageDigest messageDigest) {
        this.f35877a = messageDigest;
        this.f35877a.reset();
    }

    /* renamed from: a */
    public byte[] m1904a() {
        return this.f35879c;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f35878b) {
            return;
        }
        this.f35878b = true;
        this.f35879c = this.f35877a.digest();
        super.close();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (this.f35878b) {
            throw new IOException("Stream has been already closed");
        }
        this.f35877a.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.f35878b) {
            throw new IOException("Stream has been already closed");
        }
        this.f35877a.update(bArr, i, i2);
    }
}
